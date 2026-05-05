package com.drew.lang;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class DateUtil {
    private static final long EPOCH_1_JAN_1904 = -2082844800000L;
    private static int[] _daysInMonth365 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static Date get1Jan1904EpochDate(long j2) {
        return new Date((j2 * 1000) + EPOCH_1_JAN_1904);
    }

    public static boolean isValidDate(int i2, int i3, int i4) {
        if (i2 < 1 || i2 > 9999 || i3 < 0 || i3 > 11) {
            return false;
        }
        int i5 = _daysInMonth365[i3];
        if (i3 == 1 && i2 % 4 == 0 && (i2 % 100 != 0 || i2 % 400 == 0)) {
            i5++;
        }
        return i4 >= 1 && i4 <= i5;
    }

    public static boolean isValidTime(int i2, int i3, int i4) {
        return i2 >= 0 && i2 < 24 && i3 >= 0 && i3 < 60 && i4 >= 0 && i4 < 60;
    }
}
