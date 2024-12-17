package helper.CommonLogger;

/**
 * author: Ye Win,
 * created_date: 14/12/2024,
 * project: helper-util,
 * package: helper.CommonLogger
 */

public interface CommonLogger {
    void info(String message);
    void info(String message, Object... params);
    void warn(String message);
    void warn(String message, Object... params);
    void error(String message);
    void error(String message, Object... params);
    void debug(String message);
    void debug(String message, Object... params);
}

