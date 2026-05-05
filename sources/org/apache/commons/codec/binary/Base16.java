package org.apache.commons.codec.binary;

import com.google.common.base.Ascii;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes6.dex */
public class Base16 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 4;
    private static final int BYTES_PER_ENCODED_BLOCK = 2;
    private static final int BYTES_PER_UNENCODED_BLOCK = 1;
    private static final int MASK_4BITS = 15;
    private final byte[] decodeTable;
    private final byte[] encodeTable;
    private static final byte[] UPPER_CASE_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI};
    private static final byte[] UPPER_CASE_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    private static final byte[] LOWER_CASE_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI};
    private static final byte[] LOWER_CASE_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public Base16() {
        this(false);
    }

    public Base16(boolean z2) {
        this(z2, DECODING_POLICY_DEFAULT);
    }

    public Base16(boolean z2, CodecPolicy codecPolicy) {
        this(z2, z2 ? LOWER_CASE_ENCODE_TABLE : UPPER_CASE_ENCODE_TABLE, codecPolicy);
    }

    private Base16(boolean z2, byte[] bArr, CodecPolicy codecPolicy) {
        super(1, 2, 0, 0, kotlin.io.encoding.Base64.padSymbol, codecPolicy);
        Objects.requireNonNull(bArr, "encodeTable");
        this.encodeTable = bArr;
        this.decodeTable = bArr == LOWER_CASE_ENCODE_TABLE ? LOWER_CASE_DECODE_TABLE : UPPER_CASE_DECODE_TABLE;
    }

    private int decodeOctet(byte b2) {
        int i2 = (-1) - (((-1) - b2) | ((-1) - 255));
        byte[] bArr = this.decodeTable;
        byte b3 = i2 < bArr.length ? bArr[b2] : (byte) -1;
        if (b3 != -1) {
            return b3;
        }
        throw new IllegalArgumentException("Invalid octet in encoded value: " + ((int) b2));
    }

    private void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character is a valid base 16 alphabet character but not a possible encoding. Decoding requires at least two characters to create one byte.");
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void decode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        if (context.eof || i3 < 0) {
            context.eof = true;
            if (context.ibitWorkArea != 0) {
                validateTrailingCharacter();
                return;
            }
            return;
        }
        int iMin = Math.min(bArr.length - i2, i3);
        int i4 = (context.ibitWorkArea != 0 ? 1 : 0) + iMin;
        if (i4 == 1 && i4 == iMin) {
            context.ibitWorkArea = decodeOctet(bArr[i2]) + 1;
            return;
        }
        int i5 = i2 + iMin;
        byte[] bArrEnsureBufferSize = ensureBufferSize((i4 % 2 == 0 ? i4 : i4 - 1) / 2, context);
        if (iMin < i4) {
            int iDecodeOctet = (-1) - (((-1) - decodeOctet(bArr[i2])) & ((-1) - ((context.ibitWorkArea - 1) << 4)));
            int i6 = context.pos;
            context.pos = i6 + 1;
            bArrEnsureBufferSize[i6] = (byte) iDecodeOctet;
            context.ibitWorkArea = 0;
            i2++;
        }
        int i7 = i5 - 1;
        while (i2 < i7) {
            int i8 = i2 + 1;
            int iDecodeOctet2 = decodeOctet(bArr[i2]) << 4;
            i2 += 2;
            int iDecodeOctet3 = decodeOctet(bArr[i8]) | iDecodeOctet2;
            int i9 = context.pos;
            context.pos = i9 + 1;
            bArrEnsureBufferSize[i9] = (byte) iDecodeOctet3;
        }
        if (i2 < i5) {
            context.ibitWorkArea = decodeOctet(bArr[i2]) + 1;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void encode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i3 < 0) {
            context.eof = true;
            return;
        }
        int i4 = i3 * 2;
        if (i4 < 0) {
            throw new IllegalArgumentException("Input length exceeds maximum size for encoded data: " + i3);
        }
        byte[] bArrEnsureBufferSize = ensureBufferSize(i4, context);
        int i5 = i3 + i2;
        while (i2 < i5) {
            byte b2 = bArr[i2];
            int i6 = (b2 >> 4) & 15;
            int i7 = (b2 + Ascii.SI) - (b2 | Ascii.SI);
            int i8 = context.pos;
            context.pos = i8 + 1;
            bArrEnsureBufferSize[i8] = this.encodeTable[i6];
            int i9 = context.pos;
            context.pos = i9 + 1;
            bArrEnsureBufferSize[i9] = this.encodeTable[i7];
            i2++;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b2) {
        int i2 = b2 & 255;
        byte[] bArr = this.decodeTable;
        return i2 < bArr.length && bArr[b2] != -1;
    }
}
