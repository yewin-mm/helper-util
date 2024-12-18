package helper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static helper.ConstantUtil.EMAIL_REGEX;
import static helper.ConstantUtil.INVALID_FORMAT_INPUT_PARAM_MESSAGE;
import static helper.ConstantUtil.NOT_NUMBER_PARAM_MESSAGE;
import static helper.ConstantUtil.NULL_OR_EMPTY_PARAM_MESSAGE;
import static helper.ConstantUtil.NULL_OR_NOT_POSITIVE_PARAM_MESSAGE;
import static helper.ConstantUtil.NULL_PARAM_MESSAGE;
import static helper.PrintUtil.printWarn;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public final class ValidationUtil {

    private ValidationUtil() {
    }

    /**
     * Validates whether the provided object is null.
     *
     * @param obj The object to check
     * @return {@code true} if the object is null; {@code false} otherwise
     */
    public static boolean isNull(final Object obj) {
        return obj == null;
    }


    /**
     * Validates whether the provided object is null.
     *
     * @param obj     The string to check
     * @param message The message to print if the string is empty
     * @return {@code true} if the object is null; {@code false} otherwise
     */
    public static boolean isNull(final Object obj, final String message) {
        if (!isNull(obj)) return false;
        return printNull(message);
    }


    /**
     * Validates whether the input string is null or empty (ignores whitespace).
     *
     * @param input The string to check
     * @return {@code true} if the string is null or empty after trimming whitespace; {@code false} otherwise
     */
    public static boolean isEmptyString(final String input) {
        return isNull(input) || input.trim().isEmpty();
    }


    /**
     * Validates whether the input string is null or empty (ignores whitespace), and prints a message if the string is empty.
     *
     * @param input   The string to check
     * @param message The message to print if the string is empty
     * @return {@code true} if the string is empty, and prints the provided message; {@code false} otherwise
     */
    public static boolean isEmptyString(final String input, final String message) {
        if (!isEmptyString(input)) return false;
        return printEmpty(input, message, true);
    }


    /**
     * Validates whether the list is empty.
     *
     * @param list The list to check
     * @return {@code true} if the list is null or empty; {@code false} otherwise
     */
    public static boolean isEmptyList(final List<?> list) {
        return isEmptyCollection(list);
    }


    /**
     * Validates whether the list is empty, and prints a message if the list is empty.
     *
     * @param list    The list to check
     * @param message The message to print if the list is empty
     * @return {@code true} if the list is empty, and prints the provided message; {@code false} otherwise
     */
    public static boolean isEmptyList(final List<?> list, final String message) {
        return isEmptyCollection(list, message);
    }


    /**
     * Validates whether the set is empty.
     *
     * @param set The set to check
     * @return {@code true} if the set is null or empty; {@code false} otherwise
     */
    public static boolean isEmptySet(final Set<?> set) {
        return isEmptyCollection(set);
    }


    /**
     * Validates whether the set is empty, and prints a message if the set is empty.
     *
     * @param set     The set to check
     * @param message The message to print if the set is empty
     * @return {@code true} if the set is empty, and prints the provided message; {@code false} otherwise
     */
    public static boolean isEmptySet(final Set<?> set, final String message) {
        return isEmptyCollection(set, message);
    }


    /**
     * Validates whether the provided Map is null or empty.
     *
     * @param map The map to check
     * @return {@code true} if the map is null or empty; {@code false} otherwise
     */
    public static boolean isEmptyMap(final Map<?, ?> map) {
        return isNull(map) || map.isEmpty();
    }


    /**
     * Validates whether the provided Map is null or empty, and prints a message if the Map is empty.
     *
     * @param map     The map to check
     * @param message The message to print if the map is null or empty
     * @return {@code true} if the map is null or empty, and prints the provided message; {@code false} otherwise
     */
    public static boolean isEmptyMap(final Map<?, ?> map, final String message) {
        return (isNull(map) || map.isEmpty()) && printEmpty(map, message);
    }


    /**
     * Validates whether the collection (List, Set, etc.) is empty.
     *
     * @param collection The collection to check
     * @return {@code true} if the collection is null or empty; {@code false} otherwise
     */
    public static boolean isEmptyCollection(final Collection<?> collection) {
        return isNull(collection) || collection.isEmpty();
    }


    /**
     * Validates whether the collection (List, Set, etc.) is empty, and prints a message if the collection is empty.
     *
     * @param collection The collection to check
     * @param message    The message to print if the collection is empty
     * @return {@code true} if the collection is empty, and prints the provided message; {@code false} otherwise
     */
    public static boolean isEmptyCollection(final Collection<?> collection, final String message) {
        return (isNull(collection) || collection.isEmpty()) && printEmpty(collection, message);
    }


    /**
     * Validates whether the provided email address has a valid format.
     *
     * @param email The email address to check
     * @return {@code true} if the email has a valid format; {@code false} otherwise
     */
    public static boolean isValidEmail(final String email) {
        if (isEmptyString(email))
            return printEmpty(email, "Input email address", false);
        final Pattern pattern = Pattern.compile(EMAIL_REGEX);
        final Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    /**
     * Validates whether the provided email address has a valid format, and prints a message if the email format is invalid.
     *
     * @param email   The email address to check
     * @param message The message to print if the email format is invalid
     * @return {@code true} if the email has a valid format; {@code false} and prints the message otherwise
     */
    public static boolean isValidEmail(final String email, final String message) {
        if (isValidEmail(email)) return true;
        return printInvalidFormat(email, message);
    }


    /**
     * Validates whether the input integer is positive.
     *
     * @param input The integer to check
     * @return {@code true} if the integer is positive; {@code false} otherwise
     */
    public static boolean isPositiveNumber(final Integer input) {
        return input != null && input > 0;
    }


    /**
     * Validates whether the input integer is positive, and prints a message if the integer is not positive.
     *
     * @param input   The integer to check
     * @param message The message to print if the integer is not positive
     * @return {@code true} if the integer is positive; {@code false} and prints the message otherwise
     */
    public static boolean isPositiveNumber(final Integer input, final String message) {
        return input != null && input > 0 || printNegative(input, message);
    }


    /**
     * Validates whether the input long is positive.
     *
     * @param input The long to check
     * @return {@code true} if the long is positive; {@code false} otherwise
     */
    public static boolean isPositiveNumber(final Long input) {
        return input != null && input > 0;
    }


    /**
     * Validates whether the input long is positive, and prints a message if the long is not positive.
     *
     * @param input   The long to check
     * @param message The message to print if the long is not positive
     * @return {@code true} if the long is positive; {@code false} and prints the message otherwise
     */
    public static boolean isPositiveNumber(final Long input, final String message) {
        return input != null && input > 0 || printNegative(input, message);
    }


    /**
     * Validates whether the input string represents a valid number.
     * Allows floating-point numbers
     *
     * @param input The string to check
     * @return {@code true} if the string represents a valid integer; {@code false} otherwise
     */
    public static boolean isValidNumber(final String input) {
        try {
            Double.parseDouble(input); // Allows floating-point numbers
            return true;
        } catch (NullPointerException | NumberFormatException e) {
            return false;
        }
    }

    /**
     * Validates whether the input string represents a valid number, and prints a message if the string does not represent a valid number.
     * Allows floating-point numbers
     *
     * @param input   The string to check
     * @param message The message to print if the string does not represent a valid number
     * @return {@code true} if the string represents a valid number; {@code false} and prints the message otherwise
     */
    public static boolean isValidNumber(final String input, final String message) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NullPointerException | NumberFormatException e) {
            return printNotNumber(input, message);
        }
    }


    /**
     * Validates whether the input string represents a valid integer.
     *
     * @param input The string to check
     * @return {@code true} if the string represents a valid integer; {@code false} otherwise
     */
    public static boolean isIntegerNumber(final String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /**
     * Validates whether the input string represents a valid integer, and prints a message if the string does not represent a valid integer.
     *
     * @param input   The string to check
     * @param message The message to print if the string does not represent a valid integer
     * @return {@code true} if the string represents a valid integer; {@code false} and prints the message otherwise
     */
    public static boolean isIntegerNumber(final String input, final String message) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return printNotNumber(input, message);
        }
    }


    /**
     * Validates whether the input string represents a valid long.
     *
     * @param input The string to check
     * @return {@code true} if the string represents a valid long; {@code false} otherwise
     */
    public static boolean isLongNumber(final String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /**
     * Validates whether the input string represents a valid long, and prints a message if the string does not represent a valid long.
     *
     * @param input   The string to check
     * @param message The message to print if the string does not represent a valid long
     * @return {@code true} if the string represents a valid long; {@code false} and prints the message otherwise
     */
    public static boolean isLongNumber(final String input, final String message) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return printNotNumber(input, message);
        }
    }


    /**
     * Printing methods as per input messages and values
     */

    private static boolean printNull(final String message) {
        printWarn(NULL_PARAM_MESSAGE, message);
        return true;
    }

    private static boolean printEmpty(final String input, final String message, final boolean action) {
        printWarn(NULL_OR_EMPTY_PARAM_MESSAGE, message, input);
        return action;
    }

    private static boolean printEmpty(final Map<?, ?> map, final String message) {
        printWarn(NULL_OR_EMPTY_PARAM_MESSAGE, message, map);
        return true;
    }

    private static boolean printEmpty(final Collection<?> collection, final String message) {
        printWarn(NULL_OR_EMPTY_PARAM_MESSAGE, message, collection);
        return true;
    }

    private static boolean printInvalidFormat(final String input, final String message) {
        printWarn(INVALID_FORMAT_INPUT_PARAM_MESSAGE, message, input);
        return false;
    }

    private static boolean printNegative(final Integer input, final String message) {
        printWarn(NULL_OR_NOT_POSITIVE_PARAM_MESSAGE, message, input);
        return false;
    }

    private static boolean printNegative(final Long input, final String message) {
        printWarn(NULL_OR_NOT_POSITIVE_PARAM_MESSAGE, message, input);
        return false;
    }

    private static boolean printNotNumber(final String input, final String message) {
        printWarn(NOT_NUMBER_PARAM_MESSAGE, message, input);
        return false;
    }

}
