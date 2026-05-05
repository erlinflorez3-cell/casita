package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes3.dex */
public final class ed {
    private static final TimeZone Code = TimeZone.getTimeZone("UTC");

    private static int B(String str, int i2, int i3) throws NumberFormatException {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException(new StringBuilder("Invalid number: ").append(str.substring(i2, i3)).toString());
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
                throw new NumberFormatException(new StringBuilder("Invalid number: ").append(str.substring(i2, i3)).toString());
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }

    private static int Code(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01b6: IF  (r2 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:87:0x0208, block:B:78:0x01b6 */
    public static Date I(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i2 = index + 4;
            int iB5 = B(str, index, i2);
            if (V(str, i2, Soundex.SILENT_MARKER)) {
                i2 = index + 5;
            }
            int i3 = i2 + 2;
            int iB6 = B(str, i2, i3);
            if (V(str, i3, Soundex.SILENT_MARKER)) {
                i3 = i2 + 3;
            }
            int iCode = i3 + 2;
            int iB7 = B(str, i3, iCode);
            boolean zV = V(str, iCode, 'T');
            if (!zV && str.length() <= iCode) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iB5, iB6 - 1, iB7);
                parsePosition.setIndex(iCode);
                return gregorianCalendar.getTime();
            }
            if (zV) {
                int i4 = i3 + 5;
                iB = B(str, i3 + 3, i4);
                if (V(str, i4, AbstractJsonLexerKt.COLON)) {
                    i4 = i3 + 6;
                }
                int i5 = i4 + 2;
                iB2 = B(str, i4, i5);
                if (V(str, i5, AbstractJsonLexerKt.COLON)) {
                    i5 = i4 + 3;
                }
                if (str.length() <= i5 || (cCharAt = str.charAt(i5)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    iB3 = 0;
                    iB4 = 0;
                    iCode = i5;
                } else {
                    iCode = i5 + 2;
                    iB4 = B(str, i5, iCode);
                    if (iB4 > 59 && iB4 < 63) {
                        iB4 = 59;
                    }
                    if (V(str, iCode, '.')) {
                        int i6 = i5 + 3;
                        iCode = Code(str, i5 + 4);
                        int iMin = Math.min(iCode, i5 + 6);
                        iB3 = B(str, i6, iMin);
                        int i7 = iMin - i6;
                        if (i7 == 1) {
                            iB3 *= 100;
                        } else if (i7 == 2) {
                            iB3 *= 10;
                        }
                    } else {
                        iB3 = 0;
                    }
                }
            } else {
                iB = 0;
                iB2 = 0;
                iB3 = 0;
                iB4 = 0;
            }
            if (str.length() <= iCode) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(iCode);
            if (cCharAt2 == 'Z') {
                timeZone = Code;
                length = iCode + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException(new StringBuilder("Invalid time zone indicator '").append(cCharAt2).append("'").toString());
                }
                String strSubstring = str.substring(iCode);
                if (strSubstring.length() < 5) {
                    strSubstring = new StringBuilder().append(strSubstring).append("00").toString();
                }
                length = iCode + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = Code;
                } else {
                    String strConcat = "GMT".concat(String.valueOf(strSubstring));
                    timeZone = TimeZone.getTimeZone(strConcat);
                    String id = timeZone.getID();
                    if (!id.equals(strConcat) && !id.replace(Global.COLON, "").equals(strConcat)) {
                        throw new IndexOutOfBoundsException(new StringBuilder("Mismatching time zone indicator: ").append(strConcat).append(" given, resolves to ").append(timeZone.getID()).toString());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iB5);
            gregorianCalendar2.set(2, iB6 - 1);
            gregorianCalendar2.set(5, iB7);
            gregorianCalendar2.set(11, iB);
            gregorianCalendar2.set(12, iB2);
            gregorianCalendar2.set(13, iB4);
            gregorianCalendar2.set(14, iB3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException e2) {
            String string = str2 == null ? null : new StringBuilder("\"").append(str2).append('\"').toString();
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                message = new StringBuilder("(").append(e2.getClass().getName()).append(")").toString();
            }
            ParseException parseException = new ParseException(new StringBuilder("Failed to parse date [").append(string).append("]: ").append(message).toString(), parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static boolean V(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }
}
