package hasher;

import java.security.SecureRandom;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util"></a>,
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

    public byte[] generateKey() {
        byte[] bytes = new byte[this.keyLength];
        this.random.nextBytes(bytes);
        return bytes;
    }

    private static SecureRandom getSecureRandom() {
        try {
            return SecureRandom.getInstance(SALT_RANDOM_ALGORITHM);
        } catch (Exception e) {
            return new SecureRandom();
        }
    }

}
