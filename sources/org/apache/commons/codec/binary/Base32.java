package org.apache.commons.codec.binary;

import com.google.common.base.Ascii;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes6.dex */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US};
    private static final byte[] HEX_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final long MASK_1BITS = 1;
    private static final long MASK_2BITS = 3;
    private static final long MASK_3BITS = 7;
    private static final long MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public static class Builder extends BaseNCodec.AbstractBuilder<Base32, Builder> {
        public Builder() {
            super(Base32.ENCODE_TABLE);
        }

        @Override // java.util.function.Supplier
        public Base32 get() {
            return new Base32(getLineLength(), getLineSeparator(), getEncodeTable(), getPadding(), getDecodingPolicy());
        }
    }

    public Base32() {
        this(false);
    }

    public Base32(byte b2) {
        this(false, b2);
    }

    public Base32(int i2) {
        this(i2, CHUNK_SEPARATOR);
    }

    public Base32(int i2, byte[] bArr) {
        this(i2, bArr, false, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i2, byte[] bArr, boolean z2) {
        this(i2, bArr, z2, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i2, byte[] bArr, boolean z2, byte b2) {
        this(i2, bArr, z2, b2, DECODING_POLICY_DEFAULT);
    }

    public Base32(int i2, byte[] bArr, boolean z2, byte b2, CodecPolicy codecPolicy) {
        this(i2, bArr, z2 ? HEX_ENCODE_TABLE : ENCODE_TABLE, b2, codecPolicy);
    }

    private Base32(int i2, byte[] bArr, byte[] bArr2, byte b2, CodecPolicy codecPolicy) {
        super(5, 8, i2, toLength(bArr), b2, codecPolicy);
        Objects.requireNonNull(bArr2, "encodeTable");
        this.encodeTable = bArr2;
        this.decodeTable = bArr2 == HEX_ENCODE_TABLE ? HEX_DECODE_TABLE : DECODE_TABLE;
        if (i2 <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else {
            if (bArr == null) {
                throw new IllegalArgumentException("lineLength " + i2 + " > 0, but lineSeparator is null");
            }
            byte[] bArr3 = (byte[]) bArr.clone();
            if (containsAlphabetOrPad(bArr3)) {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + StringUtils.newStringUtf8(bArr3) + "]");
            }
            this.encodeSize = bArr3.length + 8;
            this.lineSeparator = bArr3;
        }
        if (isInAlphabet(b2) || Character.isWhitespace(b2)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    public Base32(boolean z2) {
        this(0, null, z2, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(boolean z2, byte b2) {
        this(0, null, z2, b2);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void validateCharacter(long j2, BaseNCodec.Context context) {
        if (isStrictDecoding()) {
            long j3 = context.lbitWorkArea;
            if ((j2 + j3) - (j2 | j3) != 0) {
                throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            }
        }
    }

    private void validateTrailingCharacters() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    void decode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        byte b2;
        if (context.eof) {
            return;
        }
        ?? r2 = 1;
        if (i3 < 0) {
            context.eof = true;
        }
        int i4 = this.encodeSize - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 == this.pad) {
                context.eof = r2;
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(i4, context);
            if (b3 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                    context.modulus = (context.modulus + r2) % 8;
                    context.lbitWorkArea = (context.lbitWorkArea << 5) + ((long) b2);
                    if (context.modulus == 0) {
                        int i7 = context.pos;
                        context.pos = i7 + 1;
                        bArrEnsureBufferSize[i7] = (byte) ((-1) - (((-1) - (context.lbitWorkArea >> 32)) | ((-1) - 255)));
                        int i8 = context.pos;
                        context.pos = i8 + 1;
                        long j2 = context.lbitWorkArea >> 24;
                        bArrEnsureBufferSize[i8] = (byte) ((j2 + 255) - (j2 | 255));
                        int i9 = context.pos;
                        context.pos = i9 + 1;
                        long j3 = context.lbitWorkArea >> 16;
                        bArrEnsureBufferSize[i9] = (byte) ((j3 + 255) - (j3 | 255));
                        int i10 = context.pos;
                        context.pos = i10 + 1;
                        bArrEnsureBufferSize[i10] = (byte) ((context.lbitWorkArea >> 8) & 255);
                        int i11 = context.pos;
                        context.pos = i11 + 1;
                        bArrEnsureBufferSize[i11] = (byte) (context.lbitWorkArea & 255);
                    }
                }
            }
            i5++;
            i2 = i6;
            r2 = 1;
        }
        if (!context.eof || context.modulus <= 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(i4, context);
        switch (context.modulus) {
            case 1:
                validateTrailingCharacters();
                break;
            case 2:
                break;
            case 3:
                validateTrailingCharacters();
                int i12 = context.pos;
                context.pos = i12 + 1;
                long j4 = context.lbitWorkArea >> MASK_3BITS;
                bArrEnsureBufferSize2[i12] = (byte) ((j4 + 255) - (j4 | 255));
                return;
            case 4:
                validateCharacter(MASK_4BITS, context);
                context.lbitWorkArea >>= 4;
                int i13 = context.pos;
                context.pos = i13 + 1;
                bArrEnsureBufferSize2[i13] = (byte) ((-1) - (((-1) - (context.lbitWorkArea >> 8)) | ((-1) - 255)));
                int i14 = context.pos;
                context.pos = i14 + 1;
                long j5 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i14] = (byte) ((j5 + 255) - (j5 | 255));
                return;
            case 5:
                validateCharacter(1L, context);
                context.lbitWorkArea >>= 1;
                int i15 = context.pos;
                context.pos = i15 + 1;
                bArrEnsureBufferSize2[i15] = (byte) ((-1) - (((-1) - (context.lbitWorkArea >> 16)) | ((-1) - 255)));
                int i16 = context.pos;
                context.pos = i16 + 1;
                long j6 = context.lbitWorkArea >> 8;
                bArrEnsureBufferSize2[i16] = (byte) ((j6 + 255) - (j6 | 255));
                int i17 = context.pos;
                context.pos = i17 + 1;
                long j7 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i17] = (byte) ((j7 + 255) - (j7 | 255));
                return;
            case 6:
                validateTrailingCharacters();
                context.lbitWorkArea >>= 6;
                int i18 = context.pos;
                context.pos = i18 + 1;
                bArrEnsureBufferSize2[i18] = (byte) ((-1) - (((-1) - (context.lbitWorkArea >> 16)) | ((-1) - 255)));
                int i19 = context.pos;
                context.pos = i19 + 1;
                bArrEnsureBufferSize2[i19] = (byte) ((-1) - (((-1) - (context.lbitWorkArea >> 8)) | ((-1) - 255)));
                int i20 = context.pos;
                context.pos = i20 + 1;
                bArrEnsureBufferSize2[i20] = (byte) (context.lbitWorkArea & 255);
                return;
            case 7:
                validateCharacter(MASK_3BITS, context);
                context.lbitWorkArea >>= 3;
                int i21 = context.pos;
                context.pos = i21 + 1;
                long j8 = context.lbitWorkArea >> 24;
                bArrEnsureBufferSize2[i21] = (byte) ((j8 + 255) - (j8 | 255));
                int i22 = context.pos;
                context.pos = i22 + 1;
                bArrEnsureBufferSize2[i22] = (byte) ((context.lbitWorkArea >> 16) & 255);
                int i23 = context.pos;
                context.pos = i23 + 1;
                bArrEnsureBufferSize2[i23] = (byte) ((-1) - (((-1) - (context.lbitWorkArea >> 8)) | ((-1) - 255)));
                int i24 = context.pos;
                context.pos = i24 + 1;
                long j9 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i24] = (byte) ((j9 + 255) - (j9 | 255));
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
        validateCharacter(3L, context);
        int i25 = context.pos;
        context.pos = i25 + 1;
        bArrEnsureBufferSize2[i25] = (byte) ((context.lbitWorkArea >> 2) & 255);
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
                context.modulus = (context.modulus + 1) % 5;
                int i5 = i2 + 1;
                int i6 = bArr[i2];
                if (i6 < 0) {
                    i6 += 256;
                }
                context.lbitWorkArea = (context.lbitWorkArea << 8) + ((long) i6);
                if (context.modulus == 0) {
                    int i7 = context.pos;
                    context.pos = i7 + 1;
                    bArrEnsureBufferSize[i7] = this.encodeTable[((int) (context.lbitWorkArea >> 35)) & 31];
                    int i8 = context.pos;
                    context.pos = i8 + 1;
                    bArrEnsureBufferSize[i8] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 30))) | ((-1) - 31))];
                    int i9 = context.pos;
                    context.pos = i9 + 1;
                    bArrEnsureBufferSize[i9] = this.encodeTable[((int) (context.lbitWorkArea >> 25)) & 31];
                    int i10 = context.pos;
                    context.pos = i10 + 1;
                    byte[] bArr2 = this.encodeTable;
                    int i11 = (int) (context.lbitWorkArea >> 20);
                    bArrEnsureBufferSize[i10] = bArr2[(i11 + 31) - (i11 | 31)];
                    int i12 = context.pos;
                    context.pos = i12 + 1;
                    byte[] bArr3 = this.encodeTable;
                    int i13 = (int) (context.lbitWorkArea >> MASK_4BITS);
                    bArrEnsureBufferSize[i12] = bArr3[(i13 + 31) - (i13 | 31)];
                    int i14 = context.pos;
                    context.pos = i14 + 1;
                    byte[] bArr4 = this.encodeTable;
                    int i15 = (int) (context.lbitWorkArea >> 10);
                    bArrEnsureBufferSize[i14] = bArr4[(i15 + 31) - (i15 | 31)];
                    int i16 = context.pos;
                    context.pos = i16 + 1;
                    bArrEnsureBufferSize[i16] = this.encodeTable[((int) (context.lbitWorkArea >> 5)) & 31];
                    int i17 = context.pos;
                    context.pos = i17 + 1;
                    bArrEnsureBufferSize[i17] = this.encodeTable[((int) context.lbitWorkArea) & 31];
                    context.currentLinePos += 8;
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
        int i18 = context.pos;
        int i19 = context.modulus;
        if (i19 != 0) {
            if (i19 == 1) {
                int i20 = context.pos;
                context.pos = i20 + 1;
                bArrEnsureBufferSize2[i20] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 3))) | ((-1) - 31))];
                int i21 = context.pos;
                context.pos = i21 + 1;
                bArrEnsureBufferSize2[i21] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea << 2))) | ((-1) - 31))];
                int i22 = context.pos;
                context.pos = i22 + 1;
                bArrEnsureBufferSize2[i22] = this.pad;
                int i23 = context.pos;
                context.pos = i23 + 1;
                bArrEnsureBufferSize2[i23] = this.pad;
                int i24 = context.pos;
                context.pos = i24 + 1;
                bArrEnsureBufferSize2[i24] = this.pad;
                int i25 = context.pos;
                context.pos = i25 + 1;
                bArrEnsureBufferSize2[i25] = this.pad;
                int i26 = context.pos;
                context.pos = i26 + 1;
                bArrEnsureBufferSize2[i26] = this.pad;
                int i27 = context.pos;
                context.pos = i27 + 1;
                bArrEnsureBufferSize2[i27] = this.pad;
            } else if (i19 == 2) {
                int i28 = context.pos;
                context.pos = i28 + 1;
                bArrEnsureBufferSize2[i28] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 11))) | ((-1) - 31))];
                int i29 = context.pos;
                context.pos = i29 + 1;
                bArrEnsureBufferSize2[i29] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 6))) | ((-1) - 31))];
                int i30 = context.pos;
                context.pos = i30 + 1;
                byte[] bArr5 = this.encodeTable;
                int i31 = (int) (context.lbitWorkArea >> 1);
                bArrEnsureBufferSize2[i30] = bArr5[(i31 + 31) - (i31 | 31)];
                int i32 = context.pos;
                context.pos = i32 + 1;
                byte[] bArr6 = this.encodeTable;
                int i33 = (int) (context.lbitWorkArea << 4);
                bArrEnsureBufferSize2[i32] = bArr6[(i33 + 31) - (i33 | 31)];
                int i34 = context.pos;
                context.pos = i34 + 1;
                bArrEnsureBufferSize2[i34] = this.pad;
                int i35 = context.pos;
                context.pos = i35 + 1;
                bArrEnsureBufferSize2[i35] = this.pad;
                int i36 = context.pos;
                context.pos = i36 + 1;
                bArrEnsureBufferSize2[i36] = this.pad;
                int i37 = context.pos;
                context.pos = i37 + 1;
                bArrEnsureBufferSize2[i37] = this.pad;
            } else if (i19 == 3) {
                int i38 = context.pos;
                context.pos = i38 + 1;
                byte[] bArr7 = this.encodeTable;
                int i39 = (int) (context.lbitWorkArea >> 19);
                bArrEnsureBufferSize2[i38] = bArr7[(i39 + 31) - (i39 | 31)];
                int i40 = context.pos;
                context.pos = i40 + 1;
                byte[] bArr8 = this.encodeTable;
                int i41 = (int) (context.lbitWorkArea >> 14);
                bArrEnsureBufferSize2[i40] = bArr8[(i41 + 31) - (i41 | 31)];
                int i42 = context.pos;
                context.pos = i42 + 1;
                bArrEnsureBufferSize2[i42] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 9))) | ((-1) - 31))];
                int i43 = context.pos;
                context.pos = i43 + 1;
                byte[] bArr9 = this.encodeTable;
                int i44 = (int) (context.lbitWorkArea >> 4);
                bArrEnsureBufferSize2[i43] = bArr9[(i44 + 31) - (i44 | 31)];
                int i45 = context.pos;
                context.pos = i45 + 1;
                bArrEnsureBufferSize2[i45] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea << 1))) | ((-1) - 31))];
                int i46 = context.pos;
                context.pos = i46 + 1;
                bArrEnsureBufferSize2[i46] = this.pad;
                int i47 = context.pos;
                context.pos = i47 + 1;
                bArrEnsureBufferSize2[i47] = this.pad;
                int i48 = context.pos;
                context.pos = i48 + 1;
                bArrEnsureBufferSize2[i48] = this.pad;
            } else {
                if (i19 != 4) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i49 = context.pos;
                context.pos = i49 + 1;
                bArrEnsureBufferSize2[i49] = this.encodeTable[((int) (context.lbitWorkArea >> 27)) & 31];
                int i50 = context.pos;
                context.pos = i50 + 1;
                bArrEnsureBufferSize2[i50] = this.encodeTable[((int) (context.lbitWorkArea >> 22)) & 31];
                int i51 = context.pos;
                context.pos = i51 + 1;
                bArrEnsureBufferSize2[i51] = this.encodeTable[((int) (context.lbitWorkArea >> 17)) & 31];
                int i52 = context.pos;
                context.pos = i52 + 1;
                bArrEnsureBufferSize2[i52] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 12))) | ((-1) - 31))];
                int i53 = context.pos;
                context.pos = i53 + 1;
                bArrEnsureBufferSize2[i53] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> MASK_3BITS))) | ((-1) - 31))];
                int i54 = context.pos;
                context.pos = i54 + 1;
                bArrEnsureBufferSize2[i54] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea >> 2))) | ((-1) - 31))];
                int i55 = context.pos;
                context.pos = i55 + 1;
                bArrEnsureBufferSize2[i55] = this.encodeTable[(-1) - (((-1) - ((int) (context.lbitWorkArea << 3))) | ((-1) - 31))];
                int i56 = context.pos;
                context.pos = i56 + 1;
                bArrEnsureBufferSize2[i56] = this.pad;
            }
        }
        context.currentLinePos += context.pos - i18;
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
    public boolean isInAlphabet(byte b2) {
        if (b2 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b2 < bArr.length && bArr[b2] != -1) {
                return true;
            }
        }
        return false;
    }
}
