//package helper.CommonLogger;
//
///**
// * author: Ye Win,
// * created_date: 14/12/2024,
// * project: helper-util,
// * package: helper.CommonLogger.impl
// */
//
////import org.tinylog.Logger;
//
//public class DefaultLogger {
//
//    private final String tagName;
//
//    /**
//     * Private constructor to initialize with a custom tag name.
//     *
//     * @param tagName The tag name to use for logs (can be null or empty).
//     */
//    private DefaultLogger(String tagName) {
//        this.tagName = (tagName == null || tagName.isEmpty()) ? "DefaultLogger" : tagName;
//    }
//
//    /**
//     * Factory method to create an instance of DefaultLogger.
//     *
//     * @param tagName The custom tag name to inject (can be null or empty).
//     * @return An instance of DefaultLogger.
//     */
//    public static DefaultLogger withTag(String tagName) {
//        return new DefaultLogger(tagName);
//    }
//
//
//    /**
//     * Log an info message.
//     *
//     * @param message The log message.
//     * @param args    Arguments to format into the message.
//     */
//    public void info(String message, Object... args) {
//        Logger.info(message, args);
//    }
//
//
//    /**
//     * Log an info message.
//     *
//     * @param message The log message.
//     * @param args    Arguments to format into the message.
//     */
//    public void info(String message, String clazz, Object... args) {
//        Logger.tag(clazz).info(message, args);
//    }
//
//    /**
//     * Log a warning message.
//     *
//     * @param message The log message.
//     * @param args    Arguments to format into the message.
//     */
//    public void warn(String message, Object... args) {
//        Logger.tag(tagName).warn(message, args);
//    }
//
//    /**
//     * Log a debug message.
//     *
//     * @param message The log message.
//     * @param args    Arguments to format into the message.
//     */
//    public void debug(String message, Object... args) {
//        Logger.tag(tagName).debug(message, args);
//    }
//
//    /**
//     * Log an error message.
//     *
//     * @param message The log message.
//     * @param args    Arguments to format into the message.
//     */
//    public void error(String message, Object... args) {
//        Logger.tag(tagName).error(message, args);
//    }
//}
