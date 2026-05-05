package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence a2, CharSequence b2) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b2);
        int iMin = Math.min(a2.length(), b2.length());
        int i2 = 0;
        while (i2 < iMin && a2.charAt(i2) == b2.charAt(i2)) {
            i2++;
        }
        int i3 = i2 - 1;
        if (validSurrogatePairAt(a2, i3) || validSurrogatePairAt(b2, i3)) {
            i2--;
        }
        return a2.subSequence(0, i2).toString();
    }

    public static String commonSuffix(CharSequence a2, CharSequence b2) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b2);
        int iMin = Math.min(a2.length(), b2.length());
        int i2 = 0;
        while (i2 < iMin && a2.charAt((a2.length() - i2) - 1) == b2.charAt((b2.length() - i2) - 1)) {
            i2++;
        }
        if (validSurrogatePairAt(a2, (a2.length() - i2) - 1) || validSurrogatePairAt(b2, (b2.length() - i2) - 1)) {
            i2--;
        }
        return a2.subSequence(a2.length() - i2, a2.length()).toString();
    }

    @CheckForNull
    public static String emptyToNull(@CheckForNull String string) {
        return Platform.emptyToNull(string);
    }

    public static boolean isNullOrEmpty(@CheckForNull String string) {
        return Platform.stringIsNullOrEmpty(string);
    }

    public static String lenientFormat(@CheckForNull String template, @CheckForNull Object... args) {
        int iIndexOf;
        String strValueOf = String.valueOf(template);
        int i2 = 0;
        if (args == null) {
            args = new Object[]{"(Object[])null"};
        } else {
            for (int i3 = 0; i3 < args.length; i3++) {
                args[i3] = lenientToString(args[i3]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i4 = 0;
        while (i2 < args.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(args[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < args.length) {
            sb.append(" [");
            sb.append(args[i2]);
            for (int i5 = i2 + 1; i5 < args.length; i5++) {
                sb.append(", ");
                sb.append(args[i5]);
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    private static String lenientToString(@CheckForNull Object o2) {
        if (o2 == null) {
            return "null";
        }
        try {
            return o2.toString();
        } catch (Exception e2) {
            String str = o2.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o2));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e2);
            return "<" + str + " threw " + e2.getClass().getName() + ">";
        }
    }

    public static String nullToEmpty(@CheckForNull String string) {
        return Platform.nullToEmpty(string);
    }

    public static String padEnd(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb = new StringBuilder(minLength);
        sb.append(string);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static String padStart(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb = new StringBuilder(minLength);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        sb.append(string);
        return sb.toString();
    }

    public static String repeat(String string, int count) {
        Preconditions.checkNotNull(string);
        if (count <= 1) {
            Preconditions.checkArgument(count >= 0, "invalid count: %s", count);
            return count == 0 ? "" : string;
        }
        int length = string.length();
        long j2 = ((long) length) * ((long) count);
        int i2 = (int) j2;
        if (i2 != j2) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j2);
        }
        char[] cArr = new char[i2];
        string.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    static boolean validSurrogatePairAt(CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && Character.isHighSurrogate(string.charAt(index)) && Character.isLowSurrogate(string.charAt(index + 1));
    }
}
