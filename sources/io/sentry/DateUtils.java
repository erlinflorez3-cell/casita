package io.sentry;

import androidx.compose.animation.core.AnimationKt;
import com.squareup.wire.internal.MathMethodsKt;
import io.sentry.vendor.gson.internal.bind.util.ISO8601Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class DateUtils {
    private DateUtils() {
    }

    public static long dateToNanos(Date date) {
        return millisToNanos(date.getTime());
    }

    public static double dateToSeconds(Date date) {
        return millisToSeconds(date.getTime());
    }

    public static Date getCurrentDateTime() {
        return Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC).getTime();
    }

    public static Date getDateTime(long j2) {
        Calendar calendar = Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC);
        calendar.setTimeInMillis(j2);
        return calendar.getTime();
    }

    public static Date getDateTime(String str) throws IllegalArgumentException {
        try {
            return ISO8601Utils.parse(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date getDateTimeWithMillisPrecision(String str) throws IllegalArgumentException {
        try {
            return getDateTime(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String getTimestamp(Date date) {
        return ISO8601Utils.format(date, true);
    }

    public static long millisToNanos(long j2) {
        return j2 * AnimationKt.MillisToNanos;
    }

    public static double millisToSeconds(double d2) {
        return d2 / 1000.0d;
    }

    public static Date nanosToDate(long j2) {
        return getDateTime(Double.valueOf(nanosToMillis(Double.valueOf(j2).doubleValue())).longValue());
    }

    public static double nanosToMillis(double d2) {
        return d2 / 1000000.0d;
    }

    public static double nanosToSeconds(long j2) {
        return Double.valueOf(j2).doubleValue() / 1.0E9d;
    }

    public static long secondsToNanos(long j2) {
        return j2 * MathMethodsKt.NANOS_PER_SECOND;
    }

    public static Date toUtilDate(SentryDate sentryDate) {
        if (sentryDate == null) {
            return null;
        }
        return toUtilDateNotNull(sentryDate);
    }

    public static Date toUtilDateNotNull(SentryDate sentryDate) {
        return nanosToDate(sentryDate.nanoTimestamp());
    }
}
