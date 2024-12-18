package helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import static helper.ConstantUtil.COULD_NOT_CONVERT_TO_JSON_MESSAGE;
import static helper.ConstantUtil.COULD_NOT_CONVERT_TO_OBJECT_MESSAGE;
import static helper.ConstantUtil.COULD_NOT_READ_THE_FILE_MESSAGE;
import static helper.ConstantUtil.COULD_NOT_WRITE_THE_FILE_MESSAGE;
import static helper.ConstantUtil.ERROR_PARAM_MESSAGE;
import static helper.ConstantUtil.FILE_WRITTEN_SUCCESS_PARAM_MESSAGE;
import static helper.ConstantUtil.INPUT_FILE_PATH_MESSAGE;
import static helper.ConstantUtil.INPUT_JSON_STRING_MESSAGE;
import static helper.ConstantUtil.INPUT_OBJECT_MESSAGE;
import static helper.PrintUtil.printInfo;
import static helper.PrintUtil.printWarn;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public final class JsonUtil {

    private JsonUtil() {
    }

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();


    /**
     * Converts an object to its JSON string representation.
     *
     * @param object The object to convert.
     * @return The JSON string representation of the object.
     */
    public static String objectToJson(final Object object) {
        try {
            if (!ValidationUtil.isNull(object, INPUT_OBJECT_MESSAGE)) {
                return OBJECT_MAPPER.writeValueAsString(object);
            }
            printWarn(COULD_NOT_CONVERT_TO_JSON_MESSAGE);

        } catch (JsonProcessingException e) {
            printWarn(COULD_NOT_CONVERT_TO_JSON_MESSAGE + " " + ERROR_PARAM_MESSAGE, e.getMessage());
        }
        return null;
    }


    /**
     * Converts a JSON string to an object of the specified type.
     *
     * @param <T>   The type of the object to convert to.
     * @param json  The JSON string to convert.
     * @param clazz The class of the object to convert to.
     * @return The object converted from the JSON string.
     */
    public static <T> T jsonToObject(final String json, final Class<T> clazz) {
        try {
            if (!ValidationUtil.isEmptyString(json, INPUT_JSON_STRING_MESSAGE)) {
                return OBJECT_MAPPER.readValue(json, clazz);
            }
            printWarn(COULD_NOT_CONVERT_TO_OBJECT_MESSAGE);

        } catch (JsonProcessingException e) {
            printWarn(COULD_NOT_CONVERT_TO_OBJECT_MESSAGE + " " + ERROR_PARAM_MESSAGE, e.getMessage());
        }
        return null;
    }


    /**
     * Reads a JSON file and converts its content to an object of the specified class.
     *
     * @param filePath The path to the JSON file.
     * @param clazz    The class type to which the JSON data should be converted.
     * @param <T>      The type of the object.
     * @return An object of type T representing the JSON data.
     */
    public static <T> T readJsonFile(final String filePath, final Class<T> clazz) {
        try {
            if (!ValidationUtil.isEmptyString(filePath, INPUT_FILE_PATH_MESSAGE)) {
                return OBJECT_MAPPER.readValue(new File(filePath), clazz);
            }
            printWarn(COULD_NOT_READ_THE_FILE_MESSAGE);

        } catch (IOException e) {
            printWarn(COULD_NOT_READ_THE_FILE_MESSAGE + " " + ERROR_PARAM_MESSAGE, e.getMessage());
        }
        return null;
    }


    /**
     * Writes an object to a JSON file.
     *
     * @param filePath The path to the JSON file.
     * @param object   The object to be written to the file.
     */
    public static void writeJsonFile(final String filePath, final Object object) {
        try {
            // Validate the file path
            if (ValidationUtil.isEmptyString(filePath, INPUT_FILE_PATH_MESSAGE) ||
                    ValidationUtil.isNull(object, INPUT_OBJECT_MESSAGE)) {

                printWarn(COULD_NOT_WRITE_THE_FILE_MESSAGE);

            } else {
                OBJECT_MAPPER.writeValue(new File(filePath), object);
                printInfo(FILE_WRITTEN_SUCCESS_PARAM_MESSAGE, filePath);
            }

        } catch (IOException e) {
            printWarn(COULD_NOT_WRITE_THE_FILE_MESSAGE + " " + ERROR_PARAM_MESSAGE, e.getMessage());
        }
    }

}
