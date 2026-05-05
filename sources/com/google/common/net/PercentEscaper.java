package com.google.common.net;

import com.dynatrace.android.agent.Global;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {
    private static final char[] PLUS_SIGN = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(String safeChars, boolean plusForSpace) {
        Preconditions.checkNotNull(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(Global.BLANK)) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = plusForSpace;
        this.safeOctets = createSafeOctets(str);
    }

    private static boolean[] createSafeOctets(String safeChars) {
        char[] charArray = safeChars.toCharArray();
        int iMax = -1;
        for (char c2 : charArray) {
            iMax = Math.max((int) c2, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String s2) {
        Preconditions.checkNotNull(s2);
        int length = s2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = s2.charAt(i2);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return escapeSlow(s2, i2);
            }
        }
        return s2;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    protected char[] escape(int cp) {
        boolean[] zArr = this.safeOctets;
        if (cp < zArr.length && zArr[cp]) {
            return null;
        }
        if (cp == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (cp <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[cp >>> 4], cArr[(cp + 15) - (15 | cp)]};
        }
        if (cp <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(cp >>> 10) | 12], cArr2[(cp >>> 6) & 15], '%', cArr2[(-1) - (((-1) - ((-1) - (((-1) - (cp >>> 4)) | ((-1) - 3)))) & ((-1) - 8))], cArr2[(cp + 15) - (15 | cp)]};
        }
        if (cp <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            char[] cArr4 = {'%', 'E', cArr3[cp >>> 12], '%', cArr3[(-1) - (((-1) - ((-1) - (((-1) - (cp >>> 10)) | ((-1) - 3)))) & ((-1) - 8))], cArr3[(i + 15) - (i | 15)], '%', cArr3[(-1) - (((-1) - ((i + 3) - (i | 3))) & ((-1) - 8))], cArr3[15 & cp]};
            int i2 = cp >>> 4;
            int i3 = cp >>> 6;
            return cArr4;
        }
        if (cp > 1114111) {
            throw new IllegalArgumentException("Invalid unicode character value " + cp);
        }
        char[] cArr5 = UPPER_HEX_DIGITS;
        char[] cArr6 = {'%', 'F', cArr5[(i + 7) - (i | 7)], '%', cArr5[((i + 3) - (i | 3)) | 8], cArr5[(-1) - (((-1) - (cp >>> 12)) | ((-1) - 15))], '%', cArr5[(i + 8) - (i & 8)], cArr5[(-1) - (((-1) - (cp >>> 6)) | ((-1) - 15))], '%', cArr5[((-1) - (((-1) - (cp >>> 4)) | ((-1) - 3))) | 8], cArr5[15 & cp]};
        int i4 = (-1) - (((-1) - (cp >>> 10)) | ((-1) - 3));
        int i5 = cp >>> 16;
        int i6 = cp >>> 18;
        return cArr6;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected int nextEscapeIndex(CharSequence csq, int index, int end) {
        Preconditions.checkNotNull(csq);
        while (index < end) {
            char cCharAt = csq.charAt(index);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            index++;
        }
        return index;
    }
}
