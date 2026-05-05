package com.google.android.material.datepicker;

import android.content.Context;
import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.android.material.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
class DateStrings {
    private DateStrings() {
    }

    static Pair<String, String> getDateRangeString(Long l2, Long l3) {
        return getDateRangeString(l2, l3, null);
    }

    static Pair<String, String> getDateRangeString(Long l2, Long l3, SimpleDateFormat simpleDateFormat) {
        if (l2 == null && l3 == null) {
            return Pair.create(null, null);
        }
        if (l2 == null) {
            return Pair.create(null, getDateString(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return Pair.create(getDateString(l2.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l2.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l2.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? Pair.create(getMonthDay(l2.longValue(), Locale.getDefault()), getMonthDay(l3.longValue(), Locale.getDefault())) : Pair.create(getMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault())) : Pair.create(getYearMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
    }

    static String getDateString(long j2) {
        return getDateString(j2, null);
    }

    static String getDateString(long j2, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j2)) : isDateWithinCurrentYear(j2) ? getMonthDay(j2) : getYearMonthDay(j2);
    }

    static String getDayContentDescription(Context context, long j2, boolean z2, boolean z3, boolean z4) throws Throwable {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j2);
        if (z2) {
            int i2 = R.string.mtrl_picker_today_description;
            Class<?> cls = Class.forName(hg.Vd("8D9FB;5}2=;@08=u\n538(:5", (short) (OY.Xd() ^ 18890), (short) (OY.Xd() ^ 23601)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.ud("\u0001}\fi\n\u0007|\u0001x", (short) (OY.Xd() ^ 25700)), clsArr);
            try {
                method.setAccessible(true);
                optionalYearMonthDayOfWeekDay = String.format((String) method.invoke(context, objArr), optionalYearMonthDayOfWeekDay);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (z3) {
            int i3 = R.string.mtrl_picker_start_date_description;
            Class<?> cls2 = Class.forName(C1561oA.yd("AOBQSNF\u0011;HDKAKN\t3`\\cYmf", (short) (C1580rY.Xd() ^ (-20021))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i3)};
            Method method2 = cls2.getMethod(C1561oA.Yd("nm}]\u007f~v|v", (short) (C1633zX.Xd() ^ (-13569))), clsArr2);
            try {
                method2.setAccessible(true);
                return String.format((String) method2.invoke(context, objArr2), optionalYearMonthDayOfWeekDay);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (!z4) {
            return optionalYearMonthDayOfWeekDay;
        }
        int i4 = R.string.mtrl_picker_end_date_description;
        Class<?> cls3 = Class.forName(Xg.qd("\u001c*!0.)%o&33:,6=w\u000e;;B4HE", (short) (Od.Xd() ^ (-22479)), (short) (Od.Xd() ^ (-26276))));
        Class<?>[] clsArr3 = {Integer.TYPE};
        Object[] objArr3 = {Integer.valueOf(i4)};
        Method method3 = cls3.getMethod(Jg.Wd("\u0016Y\u0007\rL\u0011'Ji", (short) (OY.Xd() ^ 5785), (short) (OY.Xd() ^ 7620)), clsArr3);
        try {
            method3.setAccessible(true);
            return String.format((String) method3.invoke(context, objArr3), optionalYearMonthDayOfWeekDay);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    static String getMonthDay(long j2) {
        return getMonthDay(j2, Locale.getDefault());
    }

    static String getMonthDay(long j2, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j2));
    }

    static String getMonthDayOfWeekDay(long j2) {
        return getMonthDayOfWeekDay(j2, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j2, Locale locale) {
        return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j2));
    }

    static String getOptionalYearMonthDayOfWeekDay(long j2) {
        return isDateWithinCurrentYear(j2) ? getMonthDayOfWeekDay(j2) : getYearMonthDayOfWeekDay(j2);
    }

    static String getYearContentDescription(Context context, int i2) throws Throwable {
        if (UtcDates.getTodayCalendar().get(1) == i2) {
            int i3 = R.string.mtrl_picker_navigate_to_current_year_description;
            Class<?> cls = Class.forName(ZO.xd("\f~';;7xe\u000bN)ay\u001et!H\u0002c\u0001ox5", (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_COLOR_MATRIX_NUMBER), (short) (FB.Xd() ^ 6260)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i3)};
            Method method = cls.getMethod(C1626yg.Ud(".Ck;V/G\u001bt", (short) (C1633zX.Xd() ^ (-9082)), (short) (C1633zX.Xd() ^ (-7327))), clsArr);
            try {
                method.setAccessible(true);
                return String.format((String) method.invoke(context, objArr), Integer.valueOf(i2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i4 = R.string.mtrl_picker_navigate_to_year_description;
        Class<?> cls2 = Class.forName(Ig.wd("G%+^IvK\u000b\u0002\u001f\"D\u000b\u0014\u0010dMqF\u00024!1", (short) (C1607wl.Xd() ^ 23954)));
        Class<?>[] clsArr2 = {Integer.TYPE};
        Object[] objArr2 = {Integer.valueOf(i4)};
        short sXd = (short) (C1633zX.Xd() ^ (-5961));
        int[] iArr = new int["\u001en\f\u0007w\"\u0001nE".length()];
        QB qb = new QB("\u001en\f\u0007w\"\u0001nE");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + i5)) + xuXd.CK(iKK));
            i5++;
        }
        Method method2 = cls2.getMethod(new String(iArr, 0, i5), clsArr2);
        try {
            method2.setAccessible(true);
            return String.format((String) method2.invoke(context, objArr2), Integer.valueOf(i2));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static String getYearMonth(long j2) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j2));
    }

    static String getYearMonthDay(long j2) {
        return getYearMonthDay(j2, Locale.getDefault());
    }

    static String getYearMonthDay(long j2, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j2));
    }

    static String getYearMonthDayOfWeekDay(long j2) {
        return getYearMonthDayOfWeekDay(j2, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j2, Locale locale) {
        return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j2));
    }

    private static boolean isDateWithinCurrentYear(long j2) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j2);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }
}
