package helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static helper.ConstantUtil.INT_SIZE_TABLE;
import static helper.ConstantUtil.LONG_SIZE_TABLE;
import static helper.ValidationUtil.isPositiveNumber;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public class CommonUtil {

    private CommonUtil() {
    }

    private static final Logger LOG = LoggerFactory.getLogger(CommonUtil.class);


    /**
     * Safe List from null pointers exception and return immutable empty list if the value is null.
     *
     * @param list The list to check
     * @param <T> The type of elements in the list
     * @return A non-null list, which is the original list if not null or an empty list if null
     */
    public static <T> List<T> safeList(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }


    /**
     * Safe Set from null pointers exception and return immutable empty set if the value is null.
     *
     * @param set The set to check
     * @param <T> The type of elements in the set
     * @return A non-null set, which is the original set if not null or an empty set if null
     */
    public static <T> Set<T> safeSet(Set<T> set) {
        return set == null ? Collections.emptySet() : set;
    }


    /**
     * Safe collection from null pointers exception and return immutable empty collection if the value is null.
     *
     * @param collection The collection to check
     * @param <T> The type of elements in the collection
     * @return A non-null collection, which is the original collection if not null or an empty list if null
     */
    public static <T> Collection<T> safeCollection(Collection<T> collection) {
        return collection == null ? Collections.emptyList() : collection;
    }


    /**
     * Get the length of Positive number by input integer value and that will cover up to 9 digit
     *
     * @param x int
     * @return int - length of input value
     */
    public static int getNumberLength(int x) {
        if (!isPositiveNumber(x)) {
            printWarn("Input integer is not positive.");
            return 0;
        }
        for (int i = 0; ; i++)
            if (x <= INT_SIZE_TABLE[i])
                return i + 1;
    }

    /**
     * Get the length of Positive number by input long value and that will cover up to 9 digit
     *
     * @param x long
     * @return long - length of input value
     */
    public static long getNumberLength(long x) {
        if (!isPositiveNumber(x)) {
            printWarn("Input integer is not positive.");
            return 0;
        }

        for (int i = 0; i < LONG_SIZE_TABLE.length; i++) {
            if (x <= LONG_SIZE_TABLE[i]) {
                return (long) i + 1;
            }
        }

        throw new IllegalArgumentException("Input exceeds expected bounds for LONG_SIZE_TABLE.");
    }


    /**
     * Printing info message at console
     *
     * @param message String
     */
    public static void printInfo(String message) {
        LOG.info(message);
    }


    /**
     * Printing info message at console including param
     *
     * @param message String
     * @param param   String
     */
    public static void printInfo(String message, String param) {
        LOG.info(message, param);
    }


    /**
     * Printing info message at console by custom input logger
     *
     * @param message String
     * @param logger  Logger
     */
    public static void printInfo(String message, Logger logger) {
        logger.info(message);
    }


    /**
     * Printing info message at console including param by custom input logger
     *
     * @param message String
     * @param param   String
     * @param logger  Logger
     */
    public static void printInfo(String message, String param, Logger logger) {
        logger.info(message, param);
    }


    /**
     * Printing warning message at console
     *
     * @param message String
     */
    public static void printWarn(String message) {
        LOG.warn(message);
    }


    /**
     * Printing warning message at console including param
     *
     * @param message String
     * @param param   String
     */
    public static void printWarn(String message, String param) {
        LOG.warn(message, param);
    }

    /**
     * Printing warning message at console by custom input logger
     *
     * @param message String
     * @param logger  Logger
     */
    public static void printWarn(String message, Logger logger) {
        logger.warn(message);
    }


    /**
     * Printing warning message at console including param by custom input logger
     *
     * @param message String
     * @param param   String
     * @param logger  Logger
     */
    public static void printWarn(String message, String param, Logger logger) {
        logger.warn(message, param);
    }


    /**
     * Printing debug message at console
     *
     * @param message String
     */
    public static void printDebug(String message) {
        LOG.debug(message);
    }


    /**
     * Printing debug message at console including param
     *
     * @param message String
     * @param param   String
     */
    public static void printDebug(String message, String param) {
        LOG.debug(message, param);
    }


    /**
     * Printing debug message at console by custom input logger
     *
     * @param message String
     * @param logger  Logger
     */
    public static void printDebug(String message, Logger logger) {
        logger.debug(message);
    }


    /**
     * Printing debug message at console including param by custom input logger
     *
     * @param message String
     * @param param   String
     * @param logger  Logger
     */
    public static void printDebug(String message, String param, Logger logger) {
        logger.debug(message, param);
    }


    /**
     * Printing error message at console
     *
     * @param message String
     */
    public static void printError(String message) {
        LOG.error(message);
    }


    /**
     * Printing error message at console including param
     *
     * @param message String
     * @param param   String
     */
    public static void printError(String message, String param) {
        LOG.error(message, param);
    }


    /**
     * Printing error message at console by custom input logger
     *
     * @param message String
     * @param logger  Logger
     */
    public static void printError(String message, Logger logger) {
        logger.error(message);
    }


    /**
     * Printing error message at console including param by custom input logger
     *
     * @param message String
     * @param param   String
     * @param logger  Logger
     */
    public static void printError(String message, String param, Logger logger) {
        logger.error(message, param);
    }

}
