package io.sentry.vendor.gson.internal.bind.util;

import com.biocatch.android.commonsdk.core.Utils;
import com.dynatrace.android.agent.Global;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes6.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    public static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z2) {
        return format(date, z2, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z2, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder("yyyy-MM-ddThh:mm:ss".length() + (z2 ? ".sss".length() : 0) + (timeZone.getRawOffset() == 0 ? "Z" : "+hh:mm").length());
        padInt(sb, gregorianCalendar.get(1), "yyyy".length());
        char c2 = Soundex.SILENT_MARKER;
        sb.append(Soundex.SILENT_MARKER);
        padInt(sb, gregorianCalendar.get(2) + 1, "MM".length());
        sb.append(Soundex.SILENT_MARKER);
        padInt(sb, gregorianCalendar.get(5), "dd".length());
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), "hh".length());
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(12), "mm".length());
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(13), "ss".length());
        if (z2) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), "sss".length());
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i2 = offset / Utils.miliSecondsInMinute;
            int iAbs = Math.abs(i2 / 60);
            int iAbs2 = Math.abs(i2 % 60);
            if (offset >= 0) {
                c2 = '+';
            }
            sb.append(c2);
            padInt(sb, iAbs, "hh".length());
            sb.append(AbstractJsonLexerKt.COLON);
            padInt(sb, iAbs2, "mm".length());
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i2, int i3) {
        String string = Integer.toString(i2);
        for (int length = i3 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01bd: IF  (r2 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:91:0x020f, block:B:82:0x01bd */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int i7 = parseInt(str, index, i6);
            if (checkOffset(str, i6, Soundex.SILENT_MARKER)) {
                i6 = index + 5;
            }
            int i8 = i6 + 2;
            int i9 = parseInt(str, i6, i8);
            if (checkOffset(str, i8, Soundex.SILENT_MARKER)) {
                i8 = i6 + 3;
            }
            int iIndexOfNonDigit = i8 + 2;
            int i10 = parseInt(str, i8, iIndexOfNonDigit);
            boolean zCheckOffset = checkOffset(str, iIndexOfNonDigit, 'T');
            if (!zCheckOffset && str.length() <= iIndexOfNonDigit) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i7, i9 - 1, i10);
                parsePosition.setIndex(iIndexOfNonDigit);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i11 = i8 + 5;
                i2 = parseInt(str, i8 + 3, i11);
                if (checkOffset(str, i11, AbstractJsonLexerKt.COLON)) {
                    i11 = i8 + 6;
                }
                int i12 = i11 + 2;
                i3 = parseInt(str, i11, i12);
                if (checkOffset(str, i12, AbstractJsonLexerKt.COLON)) {
                    i12 = i11 + 3;
                }
                if (str.length() <= i12 || (cCharAt = str.charAt(i12)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i4 = 0;
                    i5 = 0;
                    iIndexOfNonDigit = i12;
                } else {
                    iIndexOfNonDigit = i12 + 2;
                    i5 = parseInt(str, i12, iIndexOfNonDigit);
                    if (i5 > 59 && i5 < 63) {
                        i5 = 59;
                    }
                    if (checkOffset(str, iIndexOfNonDigit, '.')) {
                        int i13 = i12 + 3;
                        iIndexOfNonDigit = indexOfNonDigit(str, i12 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i12 + 6);
                        i4 = parseInt(str, i13, iMin);
                        int i14 = iMin - i13;
                        if (i14 == 1) {
                            i4 *= 100;
                        } else if (i14 == 2) {
                            i4 *= 10;
                        }
                    } else {
                        i4 = 0;
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (str.length() <= iIndexOfNonDigit) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(iIndexOfNonDigit);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = iIndexOfNonDigit + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(iIndexOfNonDigit);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = iIndexOfNonDigit + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    String str3 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str3);
                    String id = timeZone.getID();
                    if (!id.equals(str3) && !id.replace(Global.COLON, "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i7);
            gregorianCalendar2.set(2, i9 - 1);
            gregorianCalendar2.set(5, i10);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i3);
            gregorianCalendar2.set(13, i5);
            gregorianCalendar2.set(14, i4);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException e2) {
            String str4 = str2 == null ? null : "\"" + str2 + '\"';
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e2.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str4 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static int parseInt(String str, int i2, int i3) throws NumberFormatException {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }
}
