package com.incode.welcome_sdk.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6506a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f6507b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6508c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6509d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6510e = 0;

    private i() {
    }

    @JvmStatic
    public static final String d(long j2) {
        int i2 = 2 % 2;
        String str = d("MMMM d").format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = f6509d + 23;
        f6508c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @JvmStatic
    public static final String a(long j2) {
        int i2 = 2 % 2;
        String str = d("hh:mm a").format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int i3 = f6508c + 47;
        f6509d = i3 % 128;
        int i4 = i3 % 2;
        return lowerCase;
    }

    @JvmStatic
    public static final String e(long j2) {
        int i2 = 2 % 2;
        String str = a("yyyy-MM-dd", "UTC").format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = f6509d + 39;
        f6508c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @JvmStatic
    public static final String a(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        String str = d("yyyy-MM-dd").format(new GregorianCalendar(i2, i3, i4).getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i6 = f6508c + 9;
        f6509d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @JvmStatic
    public static final int b(long j2) {
        int i2 = 2 % 2;
        String str = d("yyyy").format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = Integer.parseInt(str);
        int i4 = f6508c + 105;
        f6509d = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public static SimpleDateFormat a(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f6508c + 81;
        f6509d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SimpleDateFormat simpleDateFormatD = d(str);
        simpleDateFormatD.setTimeZone(TimeZone.getTimeZone(str2));
        int i5 = f6508c + 91;
        f6509d = i5 % 128;
        int i6 = i5 % 2;
        return simpleDateFormatD;
    }

    private static SimpleDateFormat d(String str) {
        int i2 = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        int i3 = f6508c + 109;
        f6509d = i3 % 128;
        int i4 = i3 % 2;
        return simpleDateFormat;
    }

    static {
        int i2 = f6506a + 41;
        f6510e = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
