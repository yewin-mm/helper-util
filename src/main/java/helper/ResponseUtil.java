package helper;

import pojo.ServiceResponse;
import pojo.StatusObj;

import static helper.DateTimeUtil.getCurrentDateTime;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public final class ResponseUtil {

    private ResponseUtil() {
    }

    /**
     * Constructs a formatted {@link ServiceResponse} object based on the provided status, message, data, and zone ID.
     * This method creates a standardized response object that includes a {@link StatusObj} for the status and message,
     * the provided data, and the current timestamp based on the specified time zone.
     *
     * @param statusStr - The status string representing the current status (e.g., "success" or "error").
     * @param message   - The message to be included with the response.
     * @param data      - The data to be included in the response, can be any object.
     * @param zoneId    - The time zone ID used to generate the current timestamp (e.g., "GMT", "Asia/Singapore").
     * @return A {@link ServiceResponse} object containing the status, message, data, and timestamp.
     */
    public static ServiceResponse getResponseObj(final String statusStr, final String message, final Object data, final String zoneId) {
        final StatusObj status = new StatusObj(statusStr, message);
        return new ServiceResponse(status, data, getCurrentDateTime(zoneId));
    }

}
