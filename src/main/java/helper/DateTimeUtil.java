package helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static helper.ConstantUtil.MM_ZONE_ID;
import static helper.ConstantUtil.SAMPLE_FORMATTER;
import static helper.ConstantUtil.UTC_ZONE_ID;
import static helper.ValidationUtil.isEmptyString;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: helper
 */
public final class DateTimeUtil {

    private DateTimeUtil() {
    }

    private static final Logger LOG = LoggerFactory.getLogger(DateTimeUtil.class);

    /**
     * Get date time as per input datetime with zone ID based and return as input pattern format.
     *
     * @param instant - Instant
     * @param zoneId  - String
     * @param pattern - String
     * @return String - datetime as per input zoneId and input format pattern
     */
    public static String getDateTime(final Instant instant, final String zoneId, final String pattern) {
        try {
            if (isEmptyString(zoneId)) {
                LOG.warn("ZoneId is null or empty");
                return null;
            }

            if (isEmptyString(pattern)) {
                LOG.warn("Pattern is null or empty");
                return null;
            }

            final ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of(zoneId));
            final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
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
    public static String getCurrentDateTime(final String zoneId) {
        return getDateTime(Instant.now(), zoneId, SAMPLE_FORMATTER);
    }

    /**
     * Get current date time as per zone based.
     *
     * @param zoneId  - String
     * @param pattern - String
     * @return String - Current datetime as per input zoneId and pattern
     */
    public static String getCurrentDateTime(final String zoneId, final String pattern) {
        return getDateTime(Instant.now(), zoneId, pattern);
    }

    /**
     * Get current UTC date time.
     *
     * @return String - Current UTC datetime with formatted (yyyy-MM-dd HH:mm:ss.SSS) pattern
     */
    public static String getCurrentUTCDateTime() {
        return getDateTime(Instant.now(), UTC_ZONE_ID, SAMPLE_FORMATTER);
    }

    /**
     * Get current UTC date time as per input pattern.
     *
     * @param pattern - String
     * @return String - Current UTC datetime as per input pattern format
     */
    public static String getCurrentUTCDateTime(final String pattern) {
        return getDateTime(Instant.now(), UTC_ZONE_ID, pattern);
    }

    /**
     * Get datetime UTC date time as per input pattern and instant.
     *
     * @param instant - Instant
     * @param pattern - String
     * @return String - UTC datetime as per instant and input pattern format
     */
    public static String getUTCDateTime(final Instant instant, final String pattern) {
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
     * Get current date time in Myanmar country as per input format pattern.
     *
     * @param pattern - String
     * @return String - Current Myanmar country timezone datetime as per input pattern
     */
    public static String getCurrentMMDateTime(final String pattern) {
        return getDateTime(Instant.now(), MM_ZONE_ID, pattern);
    }

    /**
     * Get date time in Myanmar country as per input format pattern and instant.
     *
     * @param instant - Instant
     * @param pattern - String
     * @return String - Myanmar country timezone datetime as per input pattern and instant
     */
    public static String getMMDateTime(final Instant instant, final String pattern) {
        return getDateTime(instant, MM_ZONE_ID, pattern);
    }

    /**
     * Get current Local date time.
     *
     * @return LocalDateTime - Current Local Datetime
     */
    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }

    /**
     * Get current Local time.
     *
     * @return LocalTime - Current Local Time
     */
    public static LocalTime getCurrentLocalTime() {
        final LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.toLocalTime();
    }

    /**
     * Get Milliseconds by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Milliseconds difference between two dates
     */
    public static long differenceDateByMilliSeconds(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.MILLIS.between(before, after);
    }

    /**
     * Get Seconds by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Seconds difference between two dates
     */
    public static long differenceDateBySeconds(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.SECONDS.between(before, after);
    }

    /**
     * Get Minutes by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Minutes difference between two dates
     */
    public static long differenceDateByMinutes(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.MINUTES.between(before, after);
    }

    /**
     * Get Hours by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Hours difference between two dates
     */
    public static long differenceDateByHours(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.HOURS.between(before, after);
    }

    /**
     * Get Days by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Days difference between two dates
     */
    public static long differenceDateByDays(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.DAYS.between(before, after);
    }

    /**
     * Get Months by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Months difference between two dates
     */
    public static long differenceDateByMonths(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.MONTHS.between(before, after);
    }

    /**
     * Get Years by Difference between two dates.
     *
     * @param before - LocalDateTime
     * @param after  - LocalDateTime
     * @return long - Years difference between two dates
     */
    public static long differenceDateByYears(final LocalDateTime before, final LocalDateTime after) {
        return ChronoUnit.YEARS.between(before, after);
    }

}
