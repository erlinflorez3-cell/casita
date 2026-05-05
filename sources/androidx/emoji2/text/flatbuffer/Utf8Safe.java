package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class Utf8Safe extends Utf8 {
    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i2);
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

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    public static String decodeUtf8Array(byte[] bArr, int i2, int i3) {
        if ((((i2 + i3) - (i2 & i3)) | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (!Utf8.DecodeUtil.isOneByte(b2)) {
                break;
            }
            i2++;
            Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (Utf8.DecodeUtil.isOneByte(b3)) {
                int i7 = i5 + 1;
                Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                while (i6 < i4) {
                    byte b4 = bArr[i6];
                    if (!Utf8.DecodeUtil.isOneByte(b4)) {
                        break;
                    }
                    i6++;
                    Utf8.DecodeUtil.handleOneByte(b4, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i2 = i6;
            } else if (Utf8.DecodeUtil.isTwoBytes(b3)) {
                if (i6 >= i4) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i2 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b3, bArr[i6], cArr, i5);
                i5++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b3)) {
                if (i6 >= i4 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i8 = i2 + 2;
                i2 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b3, bArr[i6], bArr[i8], cArr, i5);
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b5 = bArr[i6];
                int i9 = i2 + 3;
                byte b6 = bArr[i2 + 2];
                i2 += 4;
                Utf8.DecodeUtil.handleFourBytes(b3, b5, b6, bArr[i9], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i2, int i3) {
        if ((-1) - (((-1) - (i2 | i3)) & ((-1) - ((byteBuffer.limit() - i2) - i3))) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = byteBuffer.get(i2);
            if (!Utf8.DecodeUtil.isOneByte(b2)) {
                break;
            }
            i2++;
            Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b3 = byteBuffer.get(i2);
            if (Utf8.DecodeUtil.isOneByte(b3)) {
                int i7 = i5 + 1;
                Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                while (i6 < i4) {
                    byte b4 = byteBuffer.get(i6);
                    if (!Utf8.DecodeUtil.isOneByte(b4)) {
                        break;
                    }
                    i6++;
                    Utf8.DecodeUtil.handleOneByte(b4, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i2 = i6;
            } else if (Utf8.DecodeUtil.isTwoBytes(b3)) {
                if (i6 >= i4) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i2 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b3, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b3)) {
                if (i6 >= i4 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i8 = i2 + 2;
                i2 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b3, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b5 = byteBuffer.get(i6);
                int i9 = i2 + 3;
                byte b6 = byteBuffer.get(i2 + 2);
                i2 += 4;
                Utf8.DecodeUtil.handleFourBytes(b3, b5, b6, byteBuffer.get(i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        }
        return decodeUtf8Buffer(byteBuffer, i2, i3);
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i3 = 0;
        while (i3 < length) {
            try {
                char cCharAt = charSequence.charAt(i3);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i3, (byte) cCharAt);
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
            }
        }
        if (i3 == length) {
            byteBuffer.position(iPosition + i3);
            return;
        }
        iPosition += i3;
        while (i3 < length) {
            char cCharAt2 = charSequence.charAt(i3);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i4 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 192))));
                    int i5 = (-1) - ((65535 - cCharAt2) | ((-1) - 63));
                    byteBuffer.put(i4, (byte) ((i5 + 128) - (i5 & 128)));
                    iPosition = i4;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i4;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    i2 = i3 + 1;
                    if (i2 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i6 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240))));
                                    int i7 = iPosition + 2;
                                    int i8 = codePoint >>> 12;
                                    try {
                                        byteBuffer.put(i6, (byte) ((-1) - (((-1) - ((i8 + 63) - (i8 | 63))) & ((-1) - 128))));
                                        iPosition += 3;
                                        int i9 = (codePoint >>> 6) & 63;
                                        byteBuffer.put(i7, (byte) ((i9 + 128) - (i9 & 128)));
                                        int i10 = codePoint & 63;
                                        byteBuffer.put(iPosition, (byte) ((i10 + 128) - (i10 & 128)));
                                        i3 = i2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i3 = i2;
                                        iPosition = i7;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i6;
                                    i3 = i2;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (iPosition - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i3 = i2;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i3, length);
                }
                int i11 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY))));
                iPosition += 2;
                int i12 = cCharAt2 >>> 6;
                int i13 = i12 + 63;
                i2 = i12 | 63;
                byteBuffer.put(i11, (byte) ((-1) - (((-1) - (i13 - i2)) & ((-1) - 128))));
                byteBuffer.put(iPosition, (byte) (((cCharAt2 + '?') - (cCharAt2 | '?')) | 128));
            }
            i3++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char cCharAt;
        int length = charSequence.length();
        int i6 = i3 + i2;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i2) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 >= 128 || i8 >= i6) {
                if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 960)));
                    i8 += 2;
                    bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                        if (i8 <= i6 - 4) {
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = codePoint >>> 18;
                                    bArr[i8] = (byte) ((i11 + 240) - (i11 & 240));
                                    bArr[i8 + 1] = (byte) (((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63))) | 128);
                                    int i12 = i8 + 3;
                                    bArr[i8 + 2] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (codePoint >>> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                                    i8 += 4;
                                    bArr[i12] = (byte) (((-1) - (((-1) - codePoint) | ((-1) - 63))) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new UnpairedSurrogateException(i7 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                            throw new UnpairedSurrogateException(i7, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                    }
                    bArr[i8] = (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - 480)));
                    int i13 = i8 + 2;
                    int i14 = cCharAt2 >>> 6;
                    bArr[i8 + 1] = (byte) (((i14 + 63) - (i14 | 63)) | 128);
                    i8 += 3;
                    bArr[i13] = (byte) (((cCharAt2 + '?') - (cCharAt2 | '?')) | 128);
                }
            } else {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            }
            i7++;
        }
        return i8;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else {
            encodeUtf8Buffer(charSequence, byteBuffer);
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }
}
