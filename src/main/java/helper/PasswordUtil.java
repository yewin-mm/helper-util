package helper;

import hasher.Argon2IDHasher;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;

import static helper.ConstantUtil.NULL_OR_EMPTY_PARAM_MESSAGE;
import static helper.PrintUtil.printError;
import static helper.PrintUtil.printWarn;
import static helper.ValidationUtil.isEmptyString;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public final class PasswordUtil {

    private PasswordUtil() {
    }

    /**
     * Encodes the input raw password using the Argon2IDHasher algorithm.
     *
     * @param rawPassword The raw password to be encoded.
     * @return The encoded password string, or {@code null} if the raw password is invalid or encoding fails.
     */
    public static String encode(final String rawPassword) {
        try {
            if (isEmptyString(rawPassword)) {
                printWarn(NULL_OR_EMPTY_PARAM_MESSAGE, "Raw Password", rawPassword);
                return null;
            }

            final Argon2IDHasher argon2IDHasher = new Argon2IDHasher();
            return argon2IDHasher.encode(rawPassword);

        } catch (final Exception e) {
            printError("Cannot Encode Password. Error: {}", e.getMessage());
            return null;
        }
    }


    /**
     * Validates if the input raw password matches the provided encoded password.
     * Compares the raw password with the encoded password in constant time to prevent timing attacks.
     *
     * @param rawPassword     The raw password to validate.
     * @param encodedPassword The previously encoded password to compare against.
     * @return {@code true} if the raw password matches the encoded password; {@code false} otherwise.
     * If either password is empty or invalid, it will return {@code false}.
     */
    public static boolean checkPassword(final String rawPassword, final String encodedPassword) {
        try {
            if (isEmptyString(rawPassword)) {
                printWarn(NULL_OR_EMPTY_PARAM_MESSAGE, "Raw Password", rawPassword);
                return false;
            }

            if (isEmptyString(encodedPassword)) {
                printWarn(NULL_OR_EMPTY_PARAM_MESSAGE, "Encoded Password", encodedPassword);
                return false;

            } else {
                final Argon2IDHasher argon2IDHasher = new Argon2IDHasher();
                final Argon2IDHasher.Argon2Hash decodedHash;

                decodedHash = argon2IDHasher.decode(encodedPassword);

                final byte[] hashBytes = new byte[decodedHash.getHash().length];
                final Argon2BytesGenerator generator = new Argon2BytesGenerator();
                generator.init(decodedHash.getParameters());
                generator.generateBytes(rawPassword.toCharArray(), hashBytes);
                return constantTimeArrayEquals(decodedHash.getHash(), hashBytes);
            }

        } catch (final IllegalArgumentException var6) {
            printWarn("Malformed Password Hash", var6);
            return false;
        } catch (final Exception e) {
            e.printStackTrace();
            printError("Cannot Check Password.");
            return false;
        }
    }


    /**
     * Compares two byte arrays in constant time to avoid timing attacks.
     *
     * @param expected The expected byte array (usually the hash of the password).
     * @param actual   The actual byte array (usually the result of hash comparison).
     * @return {@code true} if both byte arrays are equal; {@code false} otherwise.
     */
    private static boolean constantTimeArrayEquals(final byte[] expected, final byte[] actual) {
        if (expected.length != actual.length) {
            return false;
        } else {
            int result = 0;

            for (int i = 0; i < expected.length; ++i) {
                result |= expected[i] ^ actual[i];
            }

            return result == 0;
        }
    }

}
