package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence sequence) {
        int length = sequence.length();
        int i2 = 0;
        while (i2 < length && sequence.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = sequence.charAt(i2);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(sequence, i2);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence sequence, int start) {
        int length = sequence.length();
        int i2 = 0;
        while (start < length) {
            char cCharAt = sequence.charAt(start);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(sequence, start) == cCharAt) {
                        throw new IllegalArgumentException(unpairedSurrogateMsg(start));
                    }
                    start++;
                }
            }
            start++;
        }
        return i2;
    }

    public static boolean isWellFormed(byte[] bytes) {
        return isWellFormed(bytes, 0, bytes.length);
    }

    public static boolean isWellFormed(byte[] bytes, int off, int len) {
        int i2 = len + off;
        Preconditions.checkPositionIndexes(off, i2, bytes.length);
        while (off < i2) {
            if (bytes[off] < 0) {
                return isWellFormedSlowPath(bytes, off, i2);
            }
            off++;
        }
        return true;
    }

    private static boolean isWellFormedSlowPath(byte[] bytes, int off, int end) {
        byte b2;
        while (off < end) {
            int i2 = off + 1;
            byte b3 = bytes[off];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i2 != end && b3 >= -62) {
                        off += 2;
                        if (bytes[i2] > -65) {
                        }
                    }
                    return false;
                }
                if (b3 < -16) {
                    int i3 = off + 2;
                    if (i3 < end && (b2 = bytes[i2]) <= -65 && ((b3 != -32 || b2 >= -96) && (b3 != -19 || -96 > b2))) {
                        off += 3;
                        if (bytes[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (off + 3 >= end) {
                    return false;
                }
                int i4 = off + 2;
                byte b4 = bytes[i2];
                if (b4 <= -65 && (((b3 << Ascii.FS) + (b4 + 112)) >> 30) == 0) {
                    int i5 = off + 3;
                    if (bytes[i4] <= -65) {
                        off += 4;
                        if (bytes[i5] > -65) {
                        }
                    }
                }
                return false;
            }
            off = i2;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i2) {
        return "Unpaired surrogate at index " + i2;
    }
}
