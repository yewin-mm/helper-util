package hasher;

import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.util.Arrays;

import java.util.Base64;

import static helper.ConstantUtil.SIGN_REGEX;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: hasher
 */
public final class Argon2IDHasher {
    private static final Base64.Encoder BASE64_ENCODER = Base64.getEncoder().withoutPadding();
    private static final Base64.Decoder BASE64_DECODER = Base64.getDecoder();
    private final int hashLength;
    private final int parallelism;
    private final int memory;
    private final int iterations;
    private final GenerateSalt saltGenerator;

    public Argon2IDHasher() {
        this.hashLength = 32;
        this.parallelism = 1;
        this.memory = 8192;
        this.iterations = 3;
        this.saltGenerator = new GenerateSalt(16);
    }

    /**
     * Encodes a password using Argon2id hashing algorithm and returns a Base64 encoded string
     * containing the salt and the hashed password separated by a dollar sign.
     *
     * @param password the password to be hashed.
     * @return a Base64 encoded string containing the salt and the hashed password.
     */
    public String encode(final String password) {
        final byte[] salt = this.saltGenerator.generateKey();
        final byte[] hash = new byte[this.hashLength];
        final Argon2Parameters params = (new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id))
                .withVersion(Argon2Parameters.ARGON2_VERSION_13)
                .withParallelism(this.parallelism)
                .withMemoryAsKB(this.memory)
                .withIterations(this.iterations)
                .withSalt(salt)
                .build();
        final Argon2BytesGenerator generator = new Argon2BytesGenerator();
        generator.init(params);
        generator.generateBytes(password.toCharArray(), hash);

        return BASE64_ENCODER.encodeToString(params.getSalt()) +
                "$" + BASE64_ENCODER.encodeToString(hash);
    }

    /**
     * Decodes an encoded Argon2 hash and returns an Argon2Hash object containing the hash and its parameters.
     *
     * @param encodedHash the Base64 encoded Argon2 hash string.
     * @return an Argon2Hash object containing the decoded hash and its parameters.
     * @throws IllegalArgumentException if the encoded hash is invalid.
     */
    public Argon2Hash decode(final String encodedHash) throws IllegalArgumentException {
        final String[] parts = encodedHash.split(SIGN_REGEX);

        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid encoded Argon2-hash");
        }

        final Argon2Parameters.Builder paramsBuilder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id)
                .withVersion(Argon2Parameters.ARGON2_VERSION_13)
                .withIterations(this.iterations)
                .withMemoryAsKB(this.memory)
                .withParallelism(this.parallelism)
                .withSalt(BASE64_DECODER.decode(parts[0]));

        return new Argon2Hash(BASE64_DECODER.decode(parts[1]), paramsBuilder.build());
    }

    /**
     * A class representing a decoded Argon2 hash along with its parameters.
     */
    public static final class Argon2Hash {
        private final byte[] hash;
        private final Argon2Parameters parameters;

        /**
         * Constructs an Argon2Hash object with the provided hash and parameters.
         *
         * @param hash       the decoded hash.
         * @param parameters the Argon2 parameters used to generate the hash.
         */
        Argon2Hash(final byte[] hash, final Argon2Parameters parameters) {
            this.hash = Arrays.clone(hash);
            this.parameters = parameters;
        }

        /**
         * Returns a clone of the hash.
         *
         * @return a byte array containing the hash.
         */
        public byte[] getHash() {
            return Arrays.clone(this.hash);
        }

        /**
         * Returns the Argon2 parameters used to generate the hash.
         *
         * @return the Argon2Parameters object.
         */
        public Argon2Parameters getParameters() {
            return this.parameters;
        }
    }

}
