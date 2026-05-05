package com.imagepicker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
abstract class Metadata {
    protected String datetime;
    protected int height;
    protected int width;

    Metadata() {
    }

    public abstract String getDateTime();

    protected String getDateTimeInUTC(String str, String str2) {
        try {
            Date date = new SimpleDateFormat(str2, Locale.US).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
            if (date != null) {
                return simpleDateFormat.format(date);
            }
            return null;
        } catch (Exception e2) {
            String str3 = "Could not parse image datetime to UTC: " + e2.getMessage();
            return null;
        }
    }

    public abstract int getHeight();

    public abstract int getWidth();
}
