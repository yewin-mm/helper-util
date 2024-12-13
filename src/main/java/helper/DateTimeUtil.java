package helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static helper.ConstantUtil.*;
import static helper.ValidationUtil.isEmptyString;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */

public class DateTimeUtil {

    private DateTimeUtil() {
    }

    private static final Logger LOG = LoggerFactory.getLogger(DateTimeUtil.class);


    /**
     * Get date time as per input datetime with zone ID based and return as input pattern format
     *
     * @param instant - Instant
     * @param zoneId  - String
     * @param pattern - String
     * @return String - datetime as per input zoneId and input format pattern
     */
    public static String getDateTime(Instant instant, String zoneId, String pattern) {

        // ZoneId ref - https://docs.oracle.com/middleware/12211/wcs/tag-ref/MISC/TimeZones.html
        // Pattern ref - https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        // eg. dd/MM/yyyy HH:mm:ss

        try {

            if (isEmptyString(zoneId)) {
                LOG.warn("ZoneId is null or empty");
                return null;
            }

            if (isEmptyString(pattern)) {
                LOG.warn("ZoneId is null or empty");
                return null;
            }

            ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of(zoneId));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return zonedDateTime.format(formatter);

        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e.getMessage());
            return null;
        }
    }


    /**
     * Get current date time as per zone based.
     *
     * @param zoneId - String
     * @return String - default formatted (yyyy-MM-dd HH:mm:ss.SSS) datetime as per input zoneId
     */
    public static String getCurrentDateTime(String zoneId) {
        return getDateTime(Instant.now(), zoneId, SAMPLE_FORMATTER);
    }


    /**
     * Get current date time as per zone based.
     *
     * @param zoneId  - String
     * @param pattern - String
     * @return String - Current datetime as per input zoneId and pattern
     */
    public static String getCurrentDateTime(String zoneId, String pattern) {
        return getDateTime(Instant.now(), zoneId, pattern);
    }


    /**
     * Get current UTC date time
     *
     * @return String - Current UTC datetime with formatted (yyyy-MM-dd HH:mm:ss.SSS) pattern
     */
    public static String getCurrentUTCDateTime() {
        return getDateTime(Instant.now(), UTC_ZONE_ID, SAMPLE_FORMATTER);
    }


    /**
     * Get current UTC date time as per input pattern
     *
     * @param pattern - String
     * @return String - Current UTC datetime as per input pattern format
     */
    public static String getCurrentUTCDateTime(String pattern) {
        return getDateTime(Instant.now(), UTC_ZONE_ID, pattern);
    }


    /**
     * Get datetime UTC date time as per input pattern and instant
     *
     * @param instant - Instant
     * @param pattern - String
     * @return String - UTC datetime as per instant and input pattern format
     */
    public static String getUTCDateTime(Instant instant, String pattern) {
        return getDateTime(instant, UTC_ZONE_ID, pattern);
    }


    /**
     * Get current date time in Myanmar country.
     *
     * @return String - default formatted (yyyy-MM-dd HH:mm:ss.SSS) datetime with Myanmar country timezone
     */
    public static String getCurrentMMDateTime() {
        return getDateTime(Instant.now(), MM_ZONE_ID, SAMPLE_FORMATTER);
    }


    /**
     * Get current date time in Myanmar country as per input format pattern
     *
     * @param pattern - String
     * @return String - Current Myanmar country timezone datetime as per input pattern
     */
    public static String getCurrentMMDateTime(String pattern) {
        return getDateTime(Instant.now(), MM_ZONE_ID, pattern);
    }


    /**
     * Get date time in Myanmar country as per input format pattern and instant
     *
     * @param instant - Instant
     * @param pattern - String
     * @return String - Myanmar country timezone datetime as per input pattern and instant
     */
    public static String getMMDateTime(Instant instant, String pattern) {
        return getDateTime(instant, MM_ZONE_ID, pattern);
    }


    /**
     * Get Current Local date time
     *
     * @return LocalDateTime - Current Local Datetime
     */
    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }


    /**
     * Get Current Local time
     *
     * @return LocalTime - Current Local Time
     */
    public static LocalTime getCurrentLocalTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.toLocalTime();
    }


    /**
     * Get MilliSeconds by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Milliseconds which difference between two dates
     */
    public static long differenceDateByMilliSeconds(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.MILLIS.between(before, after);
    }


    /**
     * Get Seconds by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Seconds which difference between two dates
     */
    public static long differenceDateBySeconds(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.SECONDS.between(before, after);
    }


    /**
     * Get MINUTES by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - MINUTES which difference between two dates
     */
    public static long differenceDateByMinutes(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.MINUTES.between(before, after);
    }


    /**
     * Get HOURS by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - HOURS which difference between two dates
     */
    public static long differenceDateByHours(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.HOURS.between(before, after);
    }


    /**
     * Get DAYS by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - DAYS which difference between two dates
     */
    public static long differenceDateByDays(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.DAYS.between(before, after);
    }


    /**
     * Get MONTHS by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - MONTHS which difference between two dates
     */
    public static long differenceDateByMonths(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.MONTHS.between(before, after);
    }


    /**
     * Get YEARS by Difference two Dates
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - YEARS which difference between two dates
     */
    public static long differenceDateByYears(LocalDateTime before, LocalDateTime after) {
        return ChronoUnit.YEARS.between(before, after);
    }

}
