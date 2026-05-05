package com.adobe.internal.xmp;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public interface XMPDateTime extends Comparable {
    Calendar getCalendar();

    int getDay();

    int getHour();

    String getISO8601String();

    int getMinute();

    int getMonth();

    int getNanoSecond();

    int getSecond();

    TimeZone getTimeZone();

    int getYear();

    boolean hasDate();

    boolean hasTime();

    boolean hasTimeZone();

    void setDay(int i2);

    void setHour(int i2);

    void setMinute(int i2);

    void setMonth(int i2);

    void setNanoSecond(int i2);

    void setSecond(int i2);

    void setTimeZone(TimeZone timeZone);

    void setYear(int i2);
}
