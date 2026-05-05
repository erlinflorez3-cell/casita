package io.cobrowse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class UTCDate {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

    UTCDate() {
    }

    static String now() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = dateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    static Date parse(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = dateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(str);
        if (date != null) {
            return date;
        }
        throw new ParseException("result was null", 0);
    }
}
