package helper;

import hasher.Argon2IDHasher;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public class PasswordUtil {

    private static final Logger LOG = LoggerFactory.getLogger(PasswordUtil.class);

    private PasswordUtil(){}

    /**
     * Encode input Password by using Argon2IDHasher algorithm
     * @param rawPassword - String
     * @return String - encoded password value
     */
    public static String encode(String rawPassword) {
        try {
            if (ValidationUtil.isEmptyString(rawPassword)) {
                LOG.warn("Raw Password is null or empty.");
                return null;
            }

            Argon2IDHasher argon2IDHasher = new Argon2IDHasher();
            return argon2IDHasher.encode(rawPassword);

        }catch (Exception e){
            e.printStackTrace();
            LOG.error("Cannot Encode Password.");
            return null;
        }
    }


    /**
     * Check and Validate between input raw password and encoded password
     * @param rawPassword - String
     * @param encodedPassword - String
     * @return boolean - true if input password and encoded password are same
     *                 - false if input password and encoded password are not same
     */
    public static boolean checkPassword(String rawPassword, String encodedPassword) {
        try {
            if (ValidationUtil.isEmptyString(rawPassword)) {
                LOG.warn("Raw Password is null or empty.");
                return false;
            }

            if (ValidationUtil.isEmptyString(encodedPassword)) {
                LOG.warn("Encoded Password is null or empty.");
                return false;

            } else {
                Argon2IDHasher argon2IDHasher = new Argon2IDHasher();
                Argon2IDHasher.Argon2Hash decodedHash;

                decodedHash = argon2IDHasher.decode(encodedPassword);

                byte[] hashBytes = new byte[decodedHash.getHash().length];
                Argon2BytesGenerator generator = new Argon2BytesGenerator();
                generator.init(decodedHash.getParameters());
                generator.generateBytes(rawPassword.toCharArray(), hashBytes);
                return constantTimeArrayEquals(decodedHash.getHash(), hashBytes);
            }

        }catch (IllegalArgumentException var6) {
            LOG.warn("Malformed Password Hash", var6);
            return false;
        }catch (Exception e){
            e.printStackTrace();
            LOG.error("Cannot Check Password.");
            return false;
        }

    }

    private static boolean constantTimeArrayEquals(byte[] expected, byte[] actual) {
        if (expected.length != actual.length) {
            return false;
        } else {
            int result = 0;

            for(int i = 0; i < expected.length; ++i) {
                result |= expected[i] ^ actual[i];
            }

            return result == 0;
        }
    }

}
