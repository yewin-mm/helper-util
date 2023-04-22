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

public class Argon2IDHasher {
    private static final Base64.Encoder base64Encoder = Base64.getEncoder().withoutPadding();
    private static final Base64.Decoder base64Decoder = Base64.getDecoder();
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


    public String encode(String password) {
        byte[] salt = this.saltGenerator.generateKey();
        byte[] hash = new byte[this.hashLength];
        Argon2Parameters params = (new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id))
                .withVersion(Argon2Parameters.ARGON2_VERSION_13)
                .withParallelism(this.parallelism)
                .withMemoryAsKB(this.memory)
                .withIterations(this.iterations)
                .withSalt(salt)
                .build();
        Argon2BytesGenerator generator = new Argon2BytesGenerator();
        generator.init(params);
        generator.generateBytes(password.toCharArray(), hash);

        return base64Encoder.encodeToString(params.getSalt()) +
                "$" + base64Encoder.encodeToString(hash);
    }


    public Argon2Hash decode(String encodedHash) throws IllegalArgumentException {
        String[] parts = encodedHash.split(SIGN_REGEX);

        if(parts.length != 2){
            throw new IllegalArgumentException("Invalid encoded Argon2-hash");
        }

        Argon2Parameters.Builder paramsBuilder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id)
                                                        .withVersion(Argon2Parameters.ARGON2_VERSION_13)
                                                        .withIterations(this.iterations)
                                                        .withMemoryAsKB(this.memory)
                                                        .withParallelism(this.parallelism)
                                                        .withSalt(base64Decoder.decode(parts[0]));

        return new Argon2Hash(base64Decoder.decode(parts[1]), paramsBuilder.build());
    }

    public static class Argon2Hash {
        private final byte[] hash;
        private final Argon2Parameters parameters;

        Argon2Hash(byte[] hash, Argon2Parameters parameters) {
            this.hash = Arrays.clone(hash);
            this.parameters = parameters;
        }

        public byte[] getHash() {
            return Arrays.clone(this.hash);
        }

        public Argon2Parameters getParameters() {
            return this.parameters;
        }
    }


}
