package androidx.emoji2.text.flatbuffer;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT = null;

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    static class DecodeUtil {
        private static char highSurrogate(int i2) {
            return (char) ((i2 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int i2) {
            return (char) (((-1) - (((-1) - i2) | ((-1) - 1023))) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b2) {
            return (b2 + okio.Utf8.REPLACEMENT_BYTE) - (b2 | okio.Utf8.REPLACEMENT_BYTE);
        }

        DecodeUtil() {
        }

        static void handleOneByte(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i2) throws IllegalArgumentException {
            if (b2 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b3)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i2] = (char) (((b2 & Ascii.US) << 6) | trailingByteValue(b3));
        }

        static void handleThreeBytes(byte b2, byte b3, byte b4, char[] cArr, int i2) throws IllegalArgumentException {
            if (isNotTrailingByte(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || isNotTrailingByte(b4)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int i3 = (b2 & Ascii.SI) << 12;
            int iTrailingByteValue = trailingByteValue(b3) << 6;
            cArr[i2] = (char) (((i3 + iTrailingByteValue) - (i3 & iTrailingByteValue)) | trailingByteValue(b4));
        }

        static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws IllegalArgumentException {
            if (isNotTrailingByte(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || isNotTrailingByte(b4) || isNotTrailingByte(b5)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int i3 = (b2 & 7) << 18;
            int iTrailingByteValue = trailingByteValue(b3) << 12;
            int iTrailingByteValue2 = ((i3 + iTrailingByteValue) - (i3 & iTrailingByteValue)) | (trailingByteValue(b4) << 6);
            int iTrailingByteValue3 = trailingByteValue(b5);
            int i4 = (iTrailingByteValue2 + iTrailingByteValue3) - (iTrailingByteValue2 & iTrailingByteValue3);
            cArr[i2] = highSurrogate(i4);
            cArr[i2 + 1] = lowSurrogate(i4);
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }
}
