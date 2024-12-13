package helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static helper.ConstantUtil.*;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public class ValidationUtil {

    private ValidationUtil() {
    }

    private static final Logger LOG = LoggerFactory.getLogger(ValidationUtil.class);


    /**
     * String validation which to check input string is null or empty
     *
     * @param input String
     * @return boolean - true if empty
     * - false if not empty
     */
    public static boolean isEmptyString(String input) {
        return (input == null || input.trim().isEmpty());
    }


    /**
     * String validation which to check input string is null or empty and print as per user input message if empty
     *
     * @param input   String
     * @param message String
     * @return boolean - true and print as per input message if empty
     * - false if not empty
     */
    public static boolean isEmptyString(String input, String message) {
        if (!isEmptyString(input)) return false;
        return printEmpty(input, message, true);
    }


    /**
     * List validation which to check list is empty or not
     *
     * @param list List
     * @return boolean - true if empty list
     * - false if not empty list
     */
    public static boolean isEmptyList(List<?> list) {
        return isEmptyCollection(list);
    }


    /**
     * Set validation which to check set is empty or not
     *
     * @param set Set
     * @return boolean - true if empty set
     * - false if not empty set
     */
    public static boolean isEmptySet(Set<?> set) {
        return isEmptyCollection(set);
    }


    /**
     * Collection (List, Set, etc.) validation which to check collection is empty or not
     *
     * @param collection Collection (List, Set, etc.)
     * @return boolean - true if empty collection
     * - false if not empty collection
     */
    public static boolean isEmptyCollection(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }


    /**
     * List validation which to check list is empty or not
     *
     * @param list    List
     * @param message String
     * @return boolean - true and print if as per input message empty list
     * - false if not empty list
     */
    public static boolean isEmptyList(List<?> list, String message) {
        return isEmptyCollection(list, message);
    }


    /**
     * Set validation which to check set is empty or not
     *
     * @param set     Set
     * @param message String
     * @return boolean - true and print if as per input message empty set
     * - false if not empty set
     */
    public static boolean isEmptySet(Set<?> set, String message) {
        return isEmptyCollection(set, message);
    }


    /**
     * Collection (List, Set, etc.) validation which to check collection is empty or not
     *
     * @param collection Collection (List, Set, etc.)
     * @param message    String
     * @return boolean - true and print if as per input message empty collection
     * - false if not empty collection
     */
    public static boolean isEmptyCollection(Collection<?> collection, String message) {
        return (collection == null || collection.isEmpty()) && printEmpty(collection, message);
    }


    /**
     * Email validation which to check input email address has valid format or not.
     *
     * @param email String
     * @return boolean - true if valid email format
     * - false if not valid format
     */
    public static boolean isValidEmail(String email) {
        if (isEmptyString(email))
            return printEmpty(email, "Input email address", false);
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    /**
     * Email validation which to check input email address has valid format or not and print as per user input message if not has valid format
     *
     * @param email   String
     * @param message String
     * @return boolean - true if valid email format
     * - false and print as per input message if not valid format
     */
    public static boolean isValidEmail(String email, String message) {
        if (isValidEmail(email)) return true;
        return printInvalidFormat(email, message);
    }


    /**
     * Integer validation which to check input Integer, int is positive or not
     *
     * @param input Integer, int
     * @return boolean - true if positive number
     * - false if not positive number
     */
    public static boolean isPositiveNumber(Integer input) {
        return input != null && input > 0;
    }


    /**
     * Integer validation which to check input Integer, int is positive or not
     *
     * @param input   Integer, int
     * @param message String
     * @return boolean - true if positive number
     * - false and print as per input message if not positive number
     */
    public static boolean isPositiveNumber(Integer input, String message) {
        return input != null && input > 0 || printNegative(input, message);
    }


    /**
     * Long validation which to check input Long, long is positive or not
     *
     * @param input Long, long
     * @return boolean - true if positive number
     * - false if not positive number
     */
    public static boolean isPositiveNumber(Long input) {
        return input != null && input > 0;
    }


    /**
     * Long validation which to check input Long, long is positive or not
     *
     * @param input   Long, long
     * @param message String
     * @return boolean - true if positive number
     * - false and print as per input message if not positive number
     */
    public static boolean isPositiveNumber(Long input, String message) {
        return input != null && input > 0 || printNegative(input, message);
    }


    /**
     * Number validation which to check input String, input is number or not
     *
     * @param input String
     * @return boolean - true if input is number
     * - false if input is not number or exceed than integer size
     */
    public static boolean isIntegerNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /**
     * Number validation which to check input String, input is number or not
     *
     * @param input   String
     * @param message String
     * @return boolean - true if input is number
     * - false if input is not number or exceed than integer size and print as per input message
     */
    public static boolean isIntegerNumber(String input, String message) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return printNotNumber(input, message);
        }
    }


    /**
     * Number validation which to check input String, input is number or not
     *
     * @param input String
     * @return boolean - true if input is number
     * - false if input is not number or exceed than long size
     */
    public static boolean isLongNumber(String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /**
     * Number validation which to check input String, input is number or not
     *
     * @param input   String
     * @param message String
     * @return boolean - true if input is number
     * - false if input is not number or exceed than long size and print as per input message
     */
    public static boolean isLongNumber(String input, String message) {
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
    private static boolean printEmpty(String input, String message, boolean action) {
        LOG.warn(NULL_OR_EMPTY_PARAM_MESSAGE, message, input);
        return action;
    }

    private static boolean printEmpty(Collection<?> collection, String message) {
        LOG.warn(NULL_OR_EMPTY_PARAM_MESSAGE, message, collection);
        return true;
    }

    private static boolean printInvalidFormat(String input, String message) {
        LOG.warn(INVALID_FORMAT_INPUT_PARAM_MESSAGE, message, input);
        return false;
    }

    private static boolean printNegative(Integer input, String message) {
        LOG.warn(NULL_OR_NOT_POSITIVE_PARAM_MESSAGE, message, input);
        return false;
    }

    private static boolean printNegative(Long input, String message) {
        LOG.warn(NULL_OR_NOT_POSITIVE_PARAM_MESSAGE, message, input);
        return false;
    }

    private static boolean printNotNumber(String input, String message) {
        LOG.warn(NOT_NUMBER_PARAM_MESSAGE, message, input);
        return false;
    }


}
