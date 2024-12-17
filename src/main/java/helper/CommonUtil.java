package helper;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

import static helper.ConstantUtil.EMPTY_STRING;
import static helper.ConstantUtil.EQUAL;
import static helper.ConstantUtil.INPUT_DATA_MESSAGE;
import static helper.ConstantUtil.INT_SIZE_TABLE;
import static helper.ConstantUtil.LONG_SIZE_TABLE;
import static helper.ConstantUtil.SPACE_REGEX;
import static helper.PrintUtil.printWarn;
import static helper.ValidationUtil.isNull;
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


    /**
     * Returns a safe String by avoiding null pointer exceptions.
     *
     * @param input the input string
     * @return the input string if not null, or an empty string if null
     */
    public static String safeString(String input) {
        if (isNull(input, INPUT_DATA_MESSAGE)) return "";
        return input.trim().equals("") ? "" : input;
    }


    /**
     * Returns a safe List by avoiding null pointer exceptions.
     * If the input list is null, it returns an immutable empty list instead.
     *
     * @param list The list to check for nullity
     * @param <T>  The type of elements in the list
     * @return A non-null list, which is the original list if not null, or an empty list if null
     */
    public static <T> List<T> safeList(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }


    /**
     * Returns a safe Set by avoiding null pointer exceptions.
     * If the input set is null, it returns an immutable empty set instead.
     *
     * @param set The set to check for nullity
     * @param <T> The type of elements in the set
     * @return A non-null set, which is the original set if not null, or an empty set if null
     */
    public static <T> Set<T> safeSet(Set<T> set) {
        return set == null ? Collections.emptySet() : set;
    }


    /**
     * Returns a safe List by avoiding null pointer exceptions.
     *
     * @param collection the input collection
     * @param <T>        the type of elements in the collection
     * @return the input collection if not null, or an empty collection if null
     */
    public static <T> Collection<T> safeCollection(Collection<T> collection) {
        return collection == null ? Collections.emptyList() : collection;
    }


    /**
     * Returns a safe Map by avoiding null pointer exceptions.
     * If the input map is null, it returns an immutable empty map instead.
     *
     * @param map The map to check for nullity
     * @param <K> The type of keys in the map
     * @param <V> The type of values in the map
     * @return A non-null map, which is the original map if not null, or an empty map if null
     */
    public static <K, V> Map<K, V> safeMap(Map<K, V> map) {
        return map == null ? Collections.emptyMap() : map;
    }


    /**
     * Joins elements of a collection into a single string with a separator.
     * Handles any type of elements using their toString() representation and skip if null values
     *
     * @param collection The collection to join.
     * @param separator  The separator to use.
     * @param <T>        The type of elements in the collection.
     * @return A string with the collection elements joined by the separator.
     */
    public static <T> String joinCollectionToString(Collection<T> collection, String separator) {
        StringJoiner joiner = new StringJoiner(safeString(separator));
        for (T item : safeCollection(collection)) {
            if (isNull(item)) continue;
            joiner.add(toString(item));
        }
        return joiner.toString();
    }


    /**
     * Converts a map of parameters to a query string.
     *
     * @param params The map of parameters.
     * @return The query string (e.g., "key1=value1&key2=value2").
     */
    public static <K, V> String mapToQueryString(final Map<K, V> params, final String separator) {
        if (isNull(params, INPUT_DATA_MESSAGE)) {
            return EMPTY_STRING;
        }
        StringBuilder query = new StringBuilder();
        Set<Map.Entry<K, V>> entrySet = params.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {

            if (query.length() > 0) {
                query.append(separator);
            }
            query.append(isNull(entry.getKey()) ? EMPTY_STRING : toString(entry.getKey()))
                    .append(EQUAL)
                    .append(isNull(entry.getValue()) ? EMPTY_STRING : toString(entry.getValue()));
        }
        return query.toString();
    }


    /**
     * Converts a map of parameters to a query string.
     *
     * @param params        The map of parameters.
     * @param isSkipNullKey Action to skip in query string if key is null.
     * @return The query string (e.g., "key1=value1&key2=value2").
     */
    public static <K, V> String mapToQueryString(final Map<K, V> params, final String separator, final boolean isSkipNullKey) {
        if (isNull(params, INPUT_DATA_MESSAGE)) {
            return EMPTY_STRING;
        }
        StringBuilder query = new StringBuilder();
        Set<Map.Entry<K, V>> entrySet = params.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {

            if (isSkipNullKey) {
                if (isNull(entry.getKey())) continue;
            }

            if (query.length() > 0) {
                query.append(separator);
            }
            query.append(isNull(entry.getKey()) ? EMPTY_STRING : toString(entry.getKey()))
                    .append(EQUAL)
                    .append(isNull(entry.getValue()) ? EMPTY_STRING : toString(entry.getValue()));
        }
        return query.toString();
    }


    /**
     * Returns the default value if the object is null.
     *
     * @param obj          The object to check.
     * @param defaultValue The default value to return if the object is null.
     * @param <T>          The type of the object.
     * @return The object if not null, or the default value if it is null.
     */
    public static <T> T defaultIfNull(T obj, T defaultValue) {
        return obj == null ? defaultValue : obj;
    }


    /**
     * Pauses the execution for a specified number of milliseconds.
     *
     * @param milliseconds The time to pause in milliseconds.
     */
    public static void sleep(final long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
    }


    /**
     * Swaps two elements in an array.
     *
     * @param arr    The array containing the elements.
     * @param index1 The index of the first element.
     * @param index2 The index of the second element.
     */
    public static <T> void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    /**
     * Generates a random alphanumeric string of the given length.
     *
     * @param length The length of the random string.
     * @return A random alphanumeric string.
     */
    public static String generateRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }


    /**
     * Capitalizes the first letter of a string.
     *
     * @param input The string to capitalize.
     * @return The string with the first letter capitalized, or the original string if null/empty.
     */
    public static String capitalizeFirstLetter(String input) {
        if (ValidationUtil.isEmptyString(input, INPUT_DATA_MESSAGE)) return input;
        String trimmedInput = input.trim();
        return trimmedInput.substring(0, 1).toUpperCase() + trimmedInput.substring(1);
    }


    /**
     * Capitalizes the first letter of each word in a string.
     *
     * @param input The string to capitalize.
     * @return The string with the first letter of each word capitalized, or the original string if null/empty.
     */
    public static String capitalizeAllFirstLetter(String input) {
        if (ValidationUtil.isEmptyString(input, INPUT_DATA_MESSAGE)) return input;

        String[] words = input.trim().toLowerCase().split(SPACE_REGEX);
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }
        return capitalized.toString().trim();
    }


    /**
     * Returns the length (number of digits) of a positive integer.
     * It will calculate the length for integers up to 9 digits long.
     *
     * @param x The integer value whose length is to be determined
     * @return The number of digits in the positive integer. If the input is not positive, a warning is printed and 0 is returned.
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
     * Returns the length (number of digits) of a positive long integer.
     * It will calculate the length for long integers up to 9 digits long.
     *
     * @param x The long value whose length is to be determined
     * @return The number of digits in the positive long integer. If the input is not positive, a warning is printed and 0 is returned.
     * @throws IllegalArgumentException If the input exceeds the expected bounds for LONG_SIZE_TABLE
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
     * Converts the given string to lowercase.
     *
     * @param input the input string to be converted
     * @return the lowercase version of the string, or the original string if null or empty
     */
    public static String toLowerCase(String input) {
        return safeString(input).toLowerCase();
    }


    /**
     * Converts the given string to uppercase.
     *
     * @param input the input string to be converted
     * @return the uppercase version of the string, or the original string if null or empty
     */
    public static String toUpperCase(String input) {
        return safeString(input).toUpperCase();
    }


    /**
     * Converts the given value to string.
     *
     * @param input the input object to be converted
     * @return the string value
     */
    public static String toString(Object input) {
        return String.valueOf(input);
    }

}
