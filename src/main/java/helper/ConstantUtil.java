package helper;

/**
 * Author: Ye Win
 * Created_Date: 15/06/2021
 * Project: @{<a href="https://github.com/yewin-mm/helper-util">...</a>}
 * Package: helper
 */

public class ConstantUtil {

    private ConstantUtil(){}

    public static final String SPACE_REGEX = "\\s*,\\s*";

    public static final String EMAIL_REGEX = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

    public static final String SIGN_REGEX = "\\$";

    protected static final int [] INT_SIZE_TABLE = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    protected static final long [] LONG_SIZE_TABLE = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Long.MAX_VALUE };


    public static final String SAMPLE_FORMATTER = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String UTC_ZONE_ID = "UTC";
    public static final String MM_ZONE_ID = "Asia/Yangon";

    /** Below are general messages **/

    public static final String VALUE_IS_EXISTED_MESSAGE = "Value is already existed.";
    public static final String VALUE_IS_EXISTED_PARAM_MESSAGE = "Value is already existed: {}";

    public static final String RECORD_IS_EXISTED_MESSAGE = "Records is already existed.";
    public static final String RECORD_IS_EXISTED_PARAM_MESSAGE = "Records is already existed: {}";

    public static final String CANNOT_FIND_RECORD_BY_ID_MESSAGE = "Can't find records by id.";
    public static final String CANNOT_FIND_RECORD_BY_ID_PARAM_MESSAGE = "Can't find records by id: {}";

    public static final String CANNOT_FIND_RECORD_BY_NAME_MESSAGE = "Can't find records by name.";
    public static final String CANNOT_FIND_RECORD_BY_NAME_PARAM_MESSAGE = "Can't find records by name: {}";

    public static final String CANNOT_FIND_RECORD_BY_VALUE_MESSAGE = "Can't find records by value.";
    public static final String CANNOT_FIND_RECORD_BY_VALUE_PARAM_MESSAGE = "Can't find records by value: {}";

    public static final String CANNOT_FIND_ANY_RECORD_MESSAGE = "Can't find any records.";
    public static final String NO_RECORD_MESSAGE = "There is no record.";

    public static final String CANNOT_ADD_RECORD_MESSAGE = "Can't add any records.";
    public static final String SUCCESS_ADD_RECORD_MESSAGE = "Successfully added records.";

    public static final String INPUT_NULL_OR_EMPTY_MESSAGE = "Input value is null or empty.";
    public static final String VALUE_NULL_OR_EMPTY_MESSAGE = "Value is null or empty.";
    public static final String INPUT_NULL_OR_EMPTY_PARAM_MESSAGE = "Value is null or empty, input: {}";
    public static final String VALUE_NULL_OR_EMPTY_PARAM_MESSAGE = "Value is null or empty, value: {}";
    public static final String NULL_OR_EMPTY_PARAM_MESSAGE = "{} is null or empty, input: {}";
    public static final String NULL_OR_NOT_POSITIVE_PARAM_MESSAGE = "{} is null or not positive number, input: {}";

    public static final String INVALID_FORMAT_MESSAGE = "Invalid format.";
    public static final String INVALID_FORMAT_PARAM_MESSAGE = "{} is invalid format.";
    public static final String INVALID_FORMAT_INPUT_PARAM_MESSAGE = "{} is invalid format, input: {}";

    public static final String MAXIMUM_REACH = "{} is reach at maximum limit, maximum limit: {}";

    public static final String ERROR_PARAM_MESSAGE = "Error: {}";
    public static final String INTERNAL_ERROR_MESSAGE = "Internal error.";
    public static final String INTERNAL_SERVER_ERROR_MESSAGE = "Internal server error.";
    public static final String GENERAL_ERROR_MESSAGE = "Something went wrong. Please contact to your administrator.";
    public static final String TRY_AGAIN_ERROR_MESSAGE = "Something went wrong. Please try again later.";
    public static final String CANNOT_CALL_API_MESSAGE = "Can't call the api.";
    public static final String CANNOT_CALL_API_PARAM_MESSAGE = "Can't call the api, url: {}";
    public static final String CANNOT_LOAD_DATA_MESSAGE = "Can't load the data.";


    public static final String SUCCESS_MESSAGE = "SUCCESS";
    public static final String FAIL_MESSAGE = "FAIL";
    public static final String SUCCESSFUL_MESSAGE = "SUCCESSFUL";
    public static final String LOADING_MESSAGE = "LOADING";
    public static final String PENDING_MESSAGE = "PENDING";
    public static final String UNDER_REVIEW_MESSAGE = "UNDER REVIEW";
    public static final String FINISHED_REVIEW_MESSAGE = "FINISHED REVIEW";
    public static final String PROCESSING_MESSAGE = "PROCESSING";
    public static final String ON_GOING_MESSAGE = "ON GOING";
    public static final String PRODUCTION_MESSAGE = "PRODUCTION";
    public static final String GO_LIVE_MESSAGE = "GO LIVE";
    public static final String HOLDING_MESSAGE = "HOLDING";
    public static final String RESTRICT_MESSAGE = "RESTRICT";
    public static final String MAINTAIN_MESSAGE = "MAINTAIN";
    public static final String CLOSE_MESSAGE = "CLOSE";
    public static final String SHUTDOWN_MESSAGE = "SHUTDOWN";
    public static final String SUSPEND_MESSAGE = "SUSPEND";
    public static final String REMOVE_MESSAGE = "REMOVE";
    public static final String DELETE_MESSAGE = "DELETE";


    public static final String SUCCESSFULLY_CREATED_MESSAGE = "Successfully created record.";
    public static final String FAIL_CREATE_MESSAGE = "Failed to create record.";

    public static final String OK_CODE = "200";
    public static final String CREATED_CODE = "201";
    public static final String BAD_REQUEST_CODE = "400";
    public static final String UNAUTHORIZED_CODE = "401";
    public static final String FORBIDDEN_CODE = "403";
    public static final String NOT_FOUND_CODE = "404";
    public static final String INTERNAL_SERVER_ERROR_CODE = "500";
    public static final String NOT_IMPLEMENTED_CODE = "501";
    public static final String SERVICE_UNAVAILABLE_CODE = "503";

    public static final String INFO = "INFO";
    public static final String WARN = "WARN";
    public static final String DEBUG = "DEBUG";
    public static final String ERROR = "ERROR";


}
