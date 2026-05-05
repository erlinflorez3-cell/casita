package com.google.common.escape;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    protected CharEscaper() {
    }

    private static char[] growBuffer(char[] dest, int index, int size) {
        if (size < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr = new char[size];
        if (index > 0) {
            System.arraycopy(dest, 0, cArr, 0, index);
        }
        return cArr;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String string) {
        Preconditions.checkNotNull(string);
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (escape(string.charAt(i2)) != null) {
                return escapeSlow(string, i2);
            }
        }
        return string;
    }

    @CheckForNull
    protected abstract char[] escape(char c2);

    protected final String escapeSlow(String s2, int index) {
        int length = s2.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = cArrCharBufferFromThreadLocal.length;
        int i2 = 0;
        int i3 = 0;
        while (index < length) {
            char[] cArrEscape = escape(s2.charAt(index));
            if (cArrEscape != null) {
                int length3 = cArrEscape.length;
                int i4 = index - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    length2 = ((length - index) * 2) + i6;
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i3, length2);
                }
                if (i4 > 0) {
                    s2.getChars(i2, index, cArrCharBufferFromThreadLocal, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, i3, length3);
                    i3 += length3;
                }
                i2 = index + 1;
            }
            index++;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (length2 < i8) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i3, i8);
            }
            s2.getChars(i2, length, cArrCharBufferFromThreadLocal, i3);
            i3 = i8;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, i3);
    }
}
