package com.drew.metadata;

import cz.msebera.android.httpclient.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
public class Age {
    private final int _days;
    private final int _hours;
    private final int _minutes;
    private final int _months;
    private final int _seconds;
    private final int _years;

    public Age(int i2, int i3, int i4, int i5, int i6, int i7) {
        this._years = i2;
        this._months = i3;
        this._days = i4;
        this._hours = i5;
        this._minutes = i6;
        this._seconds = i7;
    }

    private static void appendAgePart(StringBuilder sb, int i2, String str) {
        if (i2 == 0) {
            return;
        }
        if (sb.length() != 0) {
            sb.append(TokenParser.SP);
        }
        sb.append(i2).append(TokenParser.SP).append(str);
        if (i2 != 1) {
            sb.append('s');
        }
    }

    public static Age fromPanasonicString(String str) {
        if (str.length() == 19 && !str.startsWith("9999:99:99")) {
            try {
                return new Age(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)), Integer.parseInt(str.substring(11, 13)), Integer.parseInt(str.substring(14, 16)), Integer.parseInt(str.substring(17, 19)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Age age = (Age) obj;
        return this._days == age._days && this._hours == age._hours && this._minutes == age._minutes && this._months == age._months && this._seconds == age._seconds && this._years == age._years;
    }

    public int getDays() {
        return this._days;
    }

    public int getHours() {
        return this._hours;
    }

    public int getMinutes() {
        return this._minutes;
    }

    public int getMonths() {
        return this._months;
    }

    public int getSeconds() {
        return this._seconds;
    }

    public int getYears() {
        return this._years;
    }

    public int hashCode() {
        return (((((((((this._years * 31) + this._months) * 31) + this._days) * 31) + this._hours) * 31) + this._minutes) * 31) + this._seconds;
    }

    public String toFriendlyString() {
        StringBuilder sb = new StringBuilder();
        appendAgePart(sb, this._years, "year");
        appendAgePart(sb, this._months, "month");
        appendAgePart(sb, this._days, "day");
        appendAgePart(sb, this._hours, "hour");
        appendAgePart(sb, this._minutes, "minute");
        appendAgePart(sb, this._seconds, "second");
        return sb.toString();
    }

    public String toString() {
        return String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(this._years), Integer.valueOf(this._months), Integer.valueOf(this._days), Integer.valueOf(this._hours), Integer.valueOf(this._minutes), Integer.valueOf(this._seconds));
    }
}
