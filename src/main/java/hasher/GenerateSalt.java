package hasher;

import java.security.SecureRandom;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: hasher
 */
final class GenerateSalt {

    private static final String SALT_RANDOM_ALGORITHM = "SHA1PRNG";
    private final SecureRandom random;
    private final int keyLength;

    GenerateSalt(int keyLength) {
        this.random = getSecureRandom();
        this.keyLength = keyLength;
    }

    /**
     * Generates a random salt of the specified length.
     *
     * @return a byte array containing the generated salt.
     */
    public byte[] generateKey() {
        final byte[] bytes = new byte[this.keyLength];
        this.random.nextBytes(bytes);
        return bytes;
    }

    /**
     * Returns a SecureRandom instance configured with the specified algorithm (SHA1PRNG).
     * If the algorithm is unavailable, a default SecureRandom instance is returned.
     *
     * @return a SecureRandom instance.
     */
    private static SecureRandom getSecureRandom() {
        try {
            return SecureRandom.getInstance(SALT_RANDOM_ALGORITHM);
        } catch (final Exception e) {
            return new SecureRandom();
        }
    }
}
