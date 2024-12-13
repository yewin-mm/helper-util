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

public class ResponseUtil {

    private ResponseUtil() {
    }

    /**
     * Get sample formatted Response Object as per input status, message, data and zone id.
     *
     * @param statusStr - String
     * @param message   - String
     * @param data      - Object
     * @param zoneId    - String
     * @return ServiceResponse - response object which already prepared by setting status object, data and timestamp.
     */
    public static ServiceResponse getResponseObj(String statusStr, String message, Object data, String zoneId) {
        StatusObj status = new StatusObj(statusStr, message);
        return new ServiceResponse(status, data, getCurrentDateTime(zoneId));
    }

}
