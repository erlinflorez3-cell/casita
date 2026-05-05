package com.google.common.escape;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    protected UnicodeEscaper() {
    }

    protected static int codePointAt(CharSequence seq, int index, int end) {
        Preconditions.checkNotNull(seq);
        if (index >= end) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i2 = index + 1;
        char cCharAt = seq.charAt(index);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + index + " in '" + ((Object) seq) + "'");
        }
        if (i2 == end) {
            return -cCharAt;
        }
        char cCharAt2 = seq.charAt(i2);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i2 + " in '" + ((Object) seq) + "'");
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
        int iNextEscapeIndex = nextEscapeIndex(string, 0, length);
        return iNextEscapeIndex == length ? string : escapeSlow(string, iNextEscapeIndex);
    }

    @CheckForNull
    protected abstract char[] escape(int cp);

    protected final String escapeSlow(String s2, int index) {
        int length = s2.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i2 = 0;
        int length2 = 0;
        while (index < length) {
            int iCodePointAt = codePointAt(s2, index, length);
            if (iCodePointAt < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrEscape = escape(iCodePointAt);
            int i3 = (Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1) + index;
            if (cArrEscape != null) {
                int i4 = index - i2;
                int i5 = length2 + i4;
                int length3 = cArrEscape.length + i5;
                if (cArrCharBufferFromThreadLocal.length < length3) {
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, length3 + (length - index) + 32);
                }
                if (i4 > 0) {
                    s2.getChars(i2, index, cArrCharBufferFromThreadLocal, length2);
                    length2 = i5;
                }
                if (cArrEscape.length > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, length2, cArrEscape.length);
                    length2 += cArrEscape.length;
                }
                i2 = i3;
            }
            index = nextEscapeIndex(s2, i3, length);
        }
        int i6 = length - i2;
        if (i6 > 0) {
            int i7 = i6 + length2;
            if (cArrCharBufferFromThreadLocal.length < i7) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, i7);
            }
            s2.getChars(i2, length, cArrCharBufferFromThreadLocal, length2);
            length2 = i7;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, length2);
    }

    protected int nextEscapeIndex(CharSequence csq, int start, int end) {
        while (start < end) {
            int iCodePointAt = codePointAt(csq, start, end);
            if (iCodePointAt < 0 || escape(iCodePointAt) != null) {
                break;
            }
            start += Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
        }
        return start;
    }
}
