package org.apache.commons.codec.binary;

import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import okio.Utf8;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes6.dex */
public class Base64 extends BaseNCodec {
    private static final int ALPHABET_LENGTH = 64;
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int DECODING_TABLE_LENGTH = 256;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final boolean isUrlSafe;
    private final byte[] lineSeparator;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public static class Builder extends BaseNCodec.AbstractBuilder<Base64, Builder> {
        public Builder() {
            super(Base64.STANDARD_ENCODE_TABLE);
        }

        @Override // java.util.function.Supplier
        public Base64 get() {
            return new Base64(getLineLength(), getLineSeparator(), getPadding(), getEncodeTable(), getDecodingPolicy());
        }

        public Builder setUrlSafe(boolean z2) {
            return setEncodeTable(Base64.toUrlSafeEncodeTable(z2));
        }
    }

    public Base64() {
        this(0);
    }

    public Base64(int i2) {
        this(i2, CHUNK_SEPARATOR);
    }

    public Base64(int i2, byte[] bArr) {
        this(i2, bArr, false);
    }

    private Base64(int i2, byte[] bArr, byte b2, byte[] bArr2, CodecPolicy codecPolicy) {
        super(3, 4, i2, toLength(bArr), b2, codecPolicy);
        Objects.requireNonNull(bArr2, "encodeTable");
        if (bArr2.length != 64) {
            throw new IllegalArgumentException("encodeTable must have exactly 64 entries.");
        }
        boolean z2 = bArr2 == URL_SAFE_ENCODE_TABLE;
        this.isUrlSafe = z2;
        if (bArr2 == STANDARD_ENCODE_TABLE || z2) {
            this.decodeTable = DECODE_TABLE;
            this.encodeTable = bArr2;
        } else {
            byte[] bArr3 = (byte[]) bArr2.clone();
            this.encodeTable = bArr3;
            this.decodeTable = calculateDecodeTable(bArr3);
        }
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
            return;
        }
        byte[] bArr4 = (byte[]) bArr.clone();
        if (containsAlphabetOrPad(bArr4)) {
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + StringUtils.newStringUtf8(bArr4) + "]");
        }
        if (i2 > 0) {
            this.encodeSize = bArr4.length + 4;
            this.lineSeparator = bArr4;
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
    }

    public Base64(int i2, byte[] bArr, boolean z2) {
        this(i2, bArr, kotlin.io.encoding.Base64.padSymbol, toUrlSafeEncodeTable(z2), DECODING_POLICY_DEFAULT);
    }

    public Base64(int i2, byte[] bArr, boolean z2, CodecPolicy codecPolicy) {
        this(i2, bArr, kotlin.io.encoding.Base64.padSymbol, toUrlSafeEncodeTable(z2), codecPolicy);
    }

    public Base64(boolean z2) {
        this(76, CHUNK_SEPARATOR, z2);
    }

    public static Builder builder() {
        return new Builder();
    }

    private byte[] calculateDecodeTable(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        Arrays.fill(bArr2, (byte) -1);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[bArr[i2]] = (byte) i2;
        }
        return bArr2;
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z2) {
        return encodeBase64(bArr, z2, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z2, boolean z3) {
        return encodeBase64(bArr, z2, z3, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z2, boolean z3, int i2) {
        if (BinaryCodec.isEmpty(bArr)) {
            return bArr;
        }
        Base64 base64 = z2 ? new Base64(z3) : new Base64(0, CHUNK_SEPARATOR, z3);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i2) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i2);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInteger");
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b2) {
        if (b2 != 61) {
            if (b2 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b2 >= bArr.length || bArr[b2] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static boolean isBase64(byte[] bArr) {
        for (byte b2 : bArr) {
            if (!isBase64(b2) && !Character.isWhitespace(b2)) {
                return false;
            }
        }
        return true;
    }

    static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i2 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i2 = 0;
        }
        int i3 = iBitLength / 8;
        int i4 = i3 - length;
        byte[] bArr = new byte[i3];
        System.arraycopy(byteArray, i2, bArr, i4, length);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toUrlSafeEncodeTable(boolean z2) {
        return z2 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    private void validateCharacter(int i2, BaseNCodec.Context context) {
        if (isStrictDecoding() && (i2 & context.ibitWorkArea) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    private void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void decode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        byte b2;
        if (context.eof) {
            return;
        }
        if (i3 < 0) {
            context.eof = true;
        }
        int i4 = this.encodeSize - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(i4, context);
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 == this.pad) {
                context.eof = true;
                break;
            }
            if (b3 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                    context.modulus = (context.modulus + 1) % 4;
                    context.ibitWorkArea = (context.ibitWorkArea << 6) + b2;
                    if (context.modulus == 0) {
                        int i7 = context.pos;
                        context.pos = i7 + 1;
                        int i8 = context.ibitWorkArea >> 16;
                        bArrEnsureBufferSize[i7] = (byte) ((i8 + 255) - (i8 | 255));
                        int i9 = context.pos;
                        context.pos = i9 + 1;
                        bArrEnsureBufferSize[i9] = (byte) ((context.ibitWorkArea >> 8) & 255);
                        int i10 = context.pos;
                        context.pos = i10 + 1;
                        int i11 = context.ibitWorkArea;
                        bArrEnsureBufferSize[i10] = (byte) ((i11 + 255) - (i11 | 255));
                    }
                }
            }
            i5++;
            i2 = i6;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(i4, context);
        int i12 = context.modulus;
        if (i12 == 1) {
            validateTrailingCharacter();
            return;
        }
        if (i12 == 2) {
            validateCharacter(15, context);
            context.ibitWorkArea >>= 4;
            int i13 = context.pos;
            context.pos = i13 + 1;
            int i14 = context.ibitWorkArea;
            bArrEnsureBufferSize2[i13] = (byte) ((i14 + 255) - (i14 | 255));
            return;
        }
        if (i12 != 3) {
            throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
        validateCharacter(3, context);
        context.ibitWorkArea >>= 2;
        int i15 = context.pos;
        context.pos = i15 + 1;
        int i16 = context.ibitWorkArea >> 8;
        bArrEnsureBufferSize2[i15] = (byte) ((i16 + 255) - (i16 | 255));
        int i17 = context.pos;
        context.pos = i17 + 1;
        bArrEnsureBufferSize2[i17] = (byte) ((-1) - (((-1) - context.ibitWorkArea) | ((-1) - 255)));
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void encode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i3 >= 0) {
            int i4 = 0;
            while (i4 < i3) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                context.modulus = (context.modulus + 1) % 3;
                int i5 = i2 + 1;
                int i6 = bArr[i2];
                if (i6 < 0) {
                    i6 += 256;
                }
                context.ibitWorkArea = (context.ibitWorkArea << 8) + i6;
                if (context.modulus == 0) {
                    int i7 = context.pos;
                    context.pos = i7 + 1;
                    byte[] bArr2 = this.encodeTable;
                    int i8 = context.ibitWorkArea >> 18;
                    bArrEnsureBufferSize[i7] = bArr2[(i8 + 63) - (i8 | 63)];
                    int i9 = context.pos;
                    context.pos = i9 + 1;
                    byte[] bArr3 = this.encodeTable;
                    int i10 = context.ibitWorkArea >> 12;
                    bArrEnsureBufferSize[i9] = bArr3[(i10 + 63) - (i10 | 63)];
                    int i11 = context.pos;
                    context.pos = i11 + 1;
                    byte[] bArr4 = this.encodeTable;
                    int i12 = context.ibitWorkArea >> 6;
                    bArrEnsureBufferSize[i11] = bArr4[(i12 + 63) - (i12 | 63)];
                    int i13 = context.pos;
                    context.pos = i13 + 1;
                    byte[] bArr5 = this.encodeTable;
                    int i14 = context.ibitWorkArea;
                    bArrEnsureBufferSize[i13] = bArr5[(i14 + 63) - (i14 | 63)];
                    context.currentLinePos += 4;
                    if (this.lineLength > 0 && this.lineLength <= context.currentLinePos) {
                        System.arraycopy(this.lineSeparator, 0, bArrEnsureBufferSize, context.pos, this.lineSeparator.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i4++;
                i2 = i5;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i15 = context.pos;
        int i16 = context.modulus;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = context.pos;
                context.pos = i17 + 1;
                bArrEnsureBufferSize2[i17] = this.encodeTable[(-1) - (((-1) - (context.ibitWorkArea >> 2)) | ((-1) - 63))];
                int i18 = context.pos;
                context.pos = i18 + 1;
                bArrEnsureBufferSize2[i18] = this.encodeTable[(context.ibitWorkArea << 4) & 63];
                if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                    int i19 = context.pos;
                    context.pos = i19 + 1;
                    bArrEnsureBufferSize2[i19] = this.pad;
                    int i20 = context.pos;
                    context.pos = i20 + 1;
                    bArrEnsureBufferSize2[i20] = this.pad;
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i21 = context.pos;
                context.pos = i21 + 1;
                byte[] bArr6 = this.encodeTable;
                int i22 = context.ibitWorkArea >> 10;
                bArrEnsureBufferSize2[i21] = bArr6[(i22 + 63) - (i22 | 63)];
                int i23 = context.pos;
                context.pos = i23 + 1;
                bArrEnsureBufferSize2[i23] = this.encodeTable[(-1) - (((-1) - (context.ibitWorkArea >> 4)) | ((-1) - 63))];
                int i24 = context.pos;
                context.pos = i24 + 1;
                bArrEnsureBufferSize2[i24] = this.encodeTable[(-1) - (((-1) - (context.ibitWorkArea << 2)) | ((-1) - 63))];
                if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                    int i25 = context.pos;
                    context.pos = i25 + 1;
                    bArrEnsureBufferSize2[i25] = this.pad;
                }
            }
        }
        context.currentLinePos += context.pos - i15;
        if (this.lineLength <= 0 || context.currentLinePos <= 0) {
            return;
        }
        System.arraycopy(this.lineSeparator, 0, bArrEnsureBufferSize2, context.pos, this.lineSeparator.length);
        context.pos += this.lineSeparator.length;
    }

    byte[] getLineSeparator() {
        return this.lineSeparator;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    protected boolean isInAlphabet(byte b2) {
        if (b2 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b2 < bArr.length && bArr[b2] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        return this.isUrlSafe;
    }
}
