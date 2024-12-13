package helper;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public class ConstantUtil {

    private ConstantUtil() {
    }


    /**
     * REGEX Constants
     */
    public static final String SPACE_REGEX = "\\s+";

    public static final String COMMA_AND_SPACE_REGEX = "\\s*,\\s*";

    public static final String EMAIL_REGEX = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

    public static final String SIGN_REGEX = "\\$";


    /**
     * Static Value Constants
     */
    protected static final int[] INT_SIZE_TABLE = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    protected static final long[] LONG_SIZE_TABLE = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Long.MAX_VALUE};


    /**
     * Date Timezone Constants
     */
    public static final String SAMPLE_FORMATTER = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String UTC_ZONE_ID = "UTC";
    public static final String MM_ZONE_ID = "Asia/Yangon";
    public static final String SG_ZONE_ID = "Asia/Singapore";
    public static final String INDIA_ZONE_ID = "Asia/Kolkata";


    /**
     * General Message Constants
     */
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
    public static final String NOT_NUMBER_PARAM_MESSAGE = "{} is not a number, input: {}";

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

    /**
     * Code Constants
     */
    public static final String OK_CODE = "200";
    public static final String CREATED_CODE = "201";
    public static final String BAD_REQUEST_CODE = "400";
    public static final String UNAUTHORIZED_CODE = "401";
    public static final String FORBIDDEN_CODE = "403";
    public static final String NOT_FOUND_CODE = "404";
    public static final String INTERNAL_SERVER_ERROR_CODE = "500";
    public static final String NOT_IMPLEMENTED_CODE = "501";
    public static final String SERVICE_UNAVAILABLE_CODE = "503";

    /**
     * Status Constants
     */
    public static final String INFO = "INFO";
    public static final String WARN = "WARN";
    public static final String DEBUG = "DEBUG";
    public static final String ERROR = "ERROR";


    /**
     * Fields Constants
     */
    public static final String NUMBER_FIELD = "number";
    public static final String NO_FIELD = "no.";

    public static final String USERNAME_FIELD = "userName";
    public static final String NAME_FIELD = "name";
    public static final String FIRST_NAME_FIELD = "firstName";
    public static final String LAST_NAME_FIELD = "lastName";
    public static final String MIDDLE_NAME_FIELD = "middleName";

    public static final String PASSWORD_FIELD = "password";
    public static final String EMAIL_FIELD = "email";
    public static final String PHONE_NO_FIELD = "phoneNo";
    public static final String PHONE_FIELD = "phone";

    public static final String GENDER_FIELD = "gender";
    public static final String MALE_FIELD = "male";
    public static final String FEMALE_FIELD = "female";
    public static final String AGE_FIELD = "age";

    public static final String CURRENCY_FIELD = "currency";
    public static final String CURRENCY_TYPE_FIELD = "currencyType";
    public static final String USD_FIELD = "usd";
    public static final String BALANCE_FIELD = "balance";
    public static final String AMOUNT_FIELD = "amount";
    public static final String PRICE_FIELD = "price";
    public static final String TOKEN_FIELD = "token";
    public static final String ACCOUNT_FIELD = "account";
    public static final String ACCOUNT_TYPE_FIELD = "accountType";

    public static final String CARD_FIELD = "card";
    public static final String CARD_TYPE_FIELD = "cardType";

    public static final String SERVICE_FIELD = "service";
    public static final String SERVICES_FIELD = "services";
    public static final String SERVICE_TYPE_FIELD = "serviceType";
    public static final String SERVICE_ID_FIELD = "serviceId";
    public static final String LEVEL_FIELD = "level";
    public static final String TYPE_FIELD = "type";
    public static final String CLASS_FIELD = "class";
    public static final String COUNT_FIELD = "count";

    public static final String PRODUCT_FIELD = "product";
    public static final String PRODUCT_NAME_FIELD = "productName";
    public static final String PRODUCT_ID_FIELD = "productId";
    public static final String PROJECT_FIELD = "project";
    public static final String PROJECT_NAME_FIELD = "projectName";


    public static final String ADDRESS_FIELD = "address";
    public static final String COUNTRY_FIELD = "country";
    public static final String COUNTRY_NAME_FIELD = "countryName";
    public static final String CITY_FIELD = "city";
    public static final String CITY_NAME_FIELD = "cityName";
    public static final String TOWNSHIP_FIELD = "township";
    public static final String TOWNSHIP_NAME_FIELD = "townshipName";
    public static final String REGION_FIELD = "region";
    public static final String PROVINCE_FIELD = "province";
    public static final String DISTRICT_FIELD = "district";
    public static final String STATE_FIELD = "state";
    public static final String POSTAL_CODE_FIELD = "postalCode";
    public static final String POSTAL_FIELD = "postal";
    public static final String ZIP_CODE_FIELD = "zipCode";
    public static final String ZIP_FIELD = "zip";

    public static final String URL_FIELD = "url";
    public static final String LINK_FIELD = "link";
    public static final String DETAILS_FIELD = "details";
    public static final String REVIEW_FIELD = "review";
    public static final String REMARKS_FIELD = "remarks";
    public static final String DESCRIPTION_FIELD = "description";
    public static final String MESSAGE_FIELD = "message";
    public static final String MESSAGE_TYPE_FIELD = "messageType";
    public static final String NOTIFICATION_FIELD = "notification";
    public static final String NOTIFICATION_TYPE_FIELD = "notificationType";


    public static final String DATE_FIELD = "date";
    public static final String DAY_FIELD = "day";
    public static final String MONTH_FIELD = "month";
    public static final String YEAR_FIELD = "year";

}
