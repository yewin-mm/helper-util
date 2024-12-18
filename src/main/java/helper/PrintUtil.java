package helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public final class PrintUtil {

    private PrintUtil() {
    }

    private static final Logger LOG = LoggerFactory.getLogger(PrintUtil.class);


    /**
     * Prints an info message to the console.
     *
     * @param message The message to be printed.
     */
    public static void printInfo(final String message) {
        LOG.info(message);
    }


    /**
     * Prints an info message to the console, including additional parameters.
     *
     * @param message The message to be printed.
     * @param args    The arguments to be included in the message.
     */
    public static void printInfo(final String message, final Object... args) {
        LOG.info(message, args);
    }


    /**
     * Prints an info message to the console using a custom logger, including additional parameters.
     *
     * @param logger  The custom logger used for logging.
     * @param message The message to be printed.
     * @param args    The arguments to be included in the message.
     */
    public static void printInfo(final Logger logger, final String message, final Object... args) {
        if (logger != null) {
            logger.info(message, args);
        } else {
            LOG.info(message, args);
        }
    }


    /**
     * Prints a warning message to the console.
     *
     * @param message The warning message to be printed.
     */
    public static void printWarn(final String message) {
        LOG.warn(message);
    }


    /**
     * Prints a warning message to the console, including additional parameters.
     *
     * @param message The warning message to be printed.
     * @param args    The arguments to be included in the message.
     */
    public static void printWarn(final String message, final Object... args) {
        LOG.warn(message, args);
    }


    /**
     * Prints a warning message to the console using a custom logger, including additional parameters.
     *
     * @param logger  The custom logger used for logging.
     * @param message The warning message to be printed.
     * @param args    The arguments to be included in the message.
     */
    public static void printWarn(final Logger logger, final String message, final Object... args) {
        if (logger != null) {
            logger.warn(message, args);
        } else {
            LOG.warn(message, args);
        }
    }


    /**
     * Prints an error message to the console.
     *
     * @param message The error message to be printed.
     */
    public static void printError(final String message) {
        LOG.error(message);
    }


    /**
     * Prints an error message to the console, including additional parameters.
     *
     * @param message The error message to be printed.
     * @param args    The arguments to be included in the message.
     */
    public static void printError(final String message, final Object... args) {
        LOG.error(message, args);
    }


    /**
     * Prints an error message to the console using a custom logger, including additional parameters.
     *
     * @param logger  The custom logger used for logging.
     * @param message The error message to be printed.
     * @param args    The arguments to be included in the message.
     */
    public static void printError(final Logger logger, final String message, final Object... args) {
        if (logger != null) {
            logger.error(message, args);
        } else {
            LOG.error(message, args);
        }
    }

}
