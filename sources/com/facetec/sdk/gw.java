package com.facetec.sdk;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class gw {
    private static final ThreadLocal<DateFormat> I = new ThreadLocal<DateFormat>() { // from class: com.facetec.sdk.gw.5
        AnonymousClass5() {
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(gg.Z);
            return simpleDateFormat;
        }
    };
    private static final String[] B = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final DateFormat[] Code = new DateFormat[15];

    /* JADX INFO: renamed from: com.facetec.sdk.gw$5 */
    final class AnonymousClass5 extends ThreadLocal<DateFormat> {
        AnonymousClass5() {
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(gg.Z);
            return simpleDateFormat;
        }
    }

    public static String B(Date date) {
        return I.get().format(date);
    }

    public static Date Z(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = I.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = B;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                DateFormat[] dateFormatArr = Code;
                DateFormat simpleDateFormat = dateFormatArr[i2];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(B[i2], Locale.US);
                    simpleDateFormat.setTimeZone(gg.Z);
                    dateFormatArr[i2] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }
}
