package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {MessagePack.Code.STR8, 120, -7, MessagePack.Code.BIN8, Ascii.EM, MessagePack.Code.ARRAY32, -75, -19, 40, -23, -3, 121, 74, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.FIXEXT16, -99, MessagePack.Code.BIN32, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, Ascii.ETB, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, Ascii.VT, -16, -107, 33, 34, 92, 107, 78, -126, 84, MessagePack.Code.FIXEXT4, 101, -109, MessagePack.Code.UINT32, 96, -78, Ascii.FS, 115, 86, MessagePack.Code.NIL, Ascii.DC4, -89, -116, -15, MessagePack.Code.ARRAY16, Ascii.DC2, 117, MessagePack.Code.FLOAT32, Ascii.US, 59, -66, -28, MessagePack.Code.INT16, 66, Base64.padSymbol, MessagePack.Code.FIXEXT1, 48, -93, 60, -74, 38, 111, -65, Ascii.SO, MessagePack.Code.STR16, 70, 105, 7, 87, 39, -14, Ascii.GS, -101, -68, -108, 67, 3, -8, 17, MessagePack.Code.EXT8, -10, MessagePack.Code.FIXARRAY_PREFIX, -17, 62, -25, 6, MessagePack.Code.TRUE, MessagePack.Code.FIXEXT2, 47, MessagePack.Code.EXT16, 102, Ascii.RS, MessagePack.Code.FIXEXT8, 8, -24, -22, MessagePack.Code.MAP16, -128, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, Ascii.SUB, MessagePack.Code.INT32, 113, 90, Ascii.NAK, 73, 116, 75, -97, MessagePack.Code.INT8, 94, 4, Ascii.CAN, -92, -20, MessagePack.Code.FALSE, MessagePack.Code.NEGFIXINT_PREFIX, 65, 110, Ascii.SI, 81, MessagePack.Code.FLOAT64, MessagePack.Code.UINT8, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, MessagePack.Code.MAP32, 41, 16, 103, 108, -70, MessagePack.Code.EXT32, MessagePack.Code.INT64, 0, -26, MessagePack.Code.UINT64, -31, -98, -88, 44, 99, Ascii.SYN, 1, Utf8.REPLACEMENT_BYTE, 88, -30, -119, -87, Ascii.CR, 56, 52, Ascii.ESC, -85, 51, -1, -80, -69, 72, Ascii.FF, 95, -71, -79, MessagePack.Code.UINT16, 46, MessagePack.Code.BIN16, -13, MessagePack.Code.STR32, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, 127, MessagePack.Code.NEVER_USED, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        byte b2 = bArr[i2 + 7];
        byte b3 = bArr[i2 + 6];
        int iRotateWordLeft = (((b2 + 255) - (b2 | 255)) << 8) + ((b3 + 255) - (b3 | 255));
        byte b4 = bArr[i2 + 5];
        int iRotateWordLeft2 = (((b4 + 255) - (b4 | 255)) << 8) + ((-1) - (((-1) - bArr[i2 + 4]) | ((-1) - 255)));
        int i4 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 8;
        byte b5 = bArr[i2 + 2];
        int iRotateWordLeft3 = i4 + ((b5 + 255) - (b5 | 255));
        int iRotateWordLeft4 = ((bArr[i2 + 1] & 255) << 8) + (bArr[i2] & 255);
        for (int i5 = 60; i5 >= 44; i5 -= 4) {
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft, 11) - ((((~iRotateWordLeft2) & iRotateWordLeft4) + ((iRotateWordLeft3 + iRotateWordLeft2) - (iRotateWordLeft3 | iRotateWordLeft2))) + this.workingKey[i5 + 3]);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2, 13) - ((((-1) - (((-1) - (~iRotateWordLeft3)) | ((-1) - iRotateWordLeft))) + ((-1) - (((-1) - iRotateWordLeft4) | ((-1) - iRotateWordLeft3)))) + this.workingKey[i5 + 2]);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3, 14) - ((((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4)) + this.workingKey[i5 + 1]);
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4, 15) - ((((~iRotateWordLeft) & iRotateWordLeft3) + ((iRotateWordLeft2 + iRotateWordLeft) - (iRotateWordLeft2 | iRotateWordLeft))) + this.workingKey[i5]);
        }
        int[] iArr = this.workingKey;
        int i6 = iRotateWordLeft - iArr[(iRotateWordLeft2 + 63) - (63 | iRotateWordLeft2)];
        int iRotateWordLeft5 = iRotateWordLeft2 - iArr[(-1) - (((-1) - iRotateWordLeft3) | ((-1) - 63))];
        int i7 = iRotateWordLeft3 - iArr[(-1) - (((-1) - iRotateWordLeft4) | ((-1) - 63))];
        int i8 = iRotateWordLeft4 - iArr[(i6 + 63) - (63 | i6)];
        for (int i9 = 40; i9 >= 20; i9 -= 4) {
            int iRotateWordLeft6 = rotateWordLeft(i6, 11);
            int i10 = ~iRotateWordLeft5;
            i6 = iRotateWordLeft6 - ((((i10 + i8) - (i10 | i8)) + ((-1) - (((-1) - i7) | ((-1) - iRotateWordLeft5)))) + this.workingKey[i9 + 3]);
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5, 13) - ((((~i7) & i6) + ((-1) - (((-1) - i8) | ((-1) - i7)))) + this.workingKey[i9 + 2]);
            int iRotateWordLeft7 = rotateWordLeft(i7, 14);
            int i11 = ~i8;
            i7 = iRotateWordLeft7 - ((((i11 + iRotateWordLeft5) - (i11 | iRotateWordLeft5)) + ((-1) - (((-1) - i6) | ((-1) - i8)))) + this.workingKey[i9 + 1]);
            int iRotateWordLeft8 = rotateWordLeft(i8, 15);
            int i12 = ~i6;
            i8 = iRotateWordLeft8 - ((((i12 + i7) - (i12 | i7)) + ((iRotateWordLeft5 + i6) - (iRotateWordLeft5 | i6))) + this.workingKey[i9]);
        }
        int[] iArr2 = this.workingKey;
        int i13 = i6 - iArr2[(iRotateWordLeft5 + 63) - (63 | iRotateWordLeft5)];
        int iRotateWordLeft9 = iRotateWordLeft5 - iArr2[(-1) - (((-1) - i7) | ((-1) - 63))];
        int iRotateWordLeft10 = i7 - iArr2[(i8 + 63) - (63 | i8)];
        int i14 = i8 - iArr2[63 & i13];
        for (int i15 = 16; i15 >= 0; i15 -= 4) {
            int iRotateWordLeft11 = rotateWordLeft(i13, 11);
            int i16 = ~iRotateWordLeft9;
            i13 = iRotateWordLeft11 - ((((i16 + i14) - (i16 | i14)) + (iRotateWordLeft10 & iRotateWordLeft9)) + this.workingKey[i15 + 3]);
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9, 13) - ((((-1) - (((-1) - (~iRotateWordLeft10)) | ((-1) - i13))) + ((i14 + iRotateWordLeft10) - (i14 | iRotateWordLeft10))) + this.workingKey[i15 + 2]);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10, 14) - ((((~i14) & iRotateWordLeft9) + ((-1) - (((-1) - i13) | ((-1) - i14)))) + this.workingKey[i15 + 1]);
            int iRotateWordLeft12 = rotateWordLeft(i14, 15);
            int i17 = ~i13;
            i14 = iRotateWordLeft12 - ((((i17 + iRotateWordLeft10) - (i17 | iRotateWordLeft10)) + ((-1) - (((-1) - iRotateWordLeft9) | ((-1) - i13)))) + this.workingKey[i15]);
        }
        bArr2[i3] = (byte) i14;
        bArr2[i3 + 1] = (byte) (i14 >> 8);
        bArr2[i3 + 2] = (byte) iRotateWordLeft10;
        bArr2[i3 + 3] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i3 + 4] = (byte) iRotateWordLeft9;
        bArr2[i3 + 5] = (byte) (iRotateWordLeft9 >> 8);
        bArr2[i3 + 6] = (byte) i13;
        bArr2[i3 + 7] = (byte) (i13 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iRotateWordLeft = (((-1) - (((-1) - bArr[i2 + 7]) | ((-1) - 255))) << 8) + ((-1) - (((-1) - bArr[i2 + 6]) | ((-1) - 255)));
        int i4 = (bArr[i2 + 5] & 255) << 8;
        byte b2 = bArr[i2 + 4];
        int iRotateWordLeft2 = i4 + ((b2 + 255) - (b2 | 255));
        int i5 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 8;
        byte b3 = bArr[i2 + 2];
        int iRotateWordLeft3 = i5 + ((b3 + 255) - (b3 | 255));
        int iRotateWordLeft4 = (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8) + ((-1) - (((-1) - bArr[i2]) | ((-1) - 255)));
        for (int i6 = 0; i6 <= 16; i6 += 4) {
            int i7 = ~iRotateWordLeft;
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4 + ((i7 + iRotateWordLeft3) - (i7 | iRotateWordLeft3)) + ((-1) - (((-1) - iRotateWordLeft2) | ((-1) - iRotateWordLeft))) + this.workingKey[i6], 1);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3 + ((~iRotateWordLeft4) & iRotateWordLeft2) + ((-1) - (((-1) - iRotateWordLeft) | ((-1) - iRotateWordLeft4))) + this.workingKey[i6 + 1], 2);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2 + ((-1) - (((-1) - (~iRotateWordLeft3)) | ((-1) - iRotateWordLeft))) + (iRotateWordLeft4 & iRotateWordLeft3) + this.workingKey[i6 + 2], 3);
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft + ((~iRotateWordLeft2) & iRotateWordLeft4) + ((iRotateWordLeft3 + iRotateWordLeft2) - (iRotateWordLeft3 | iRotateWordLeft2)) + this.workingKey[i6 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft4 + iArr[(-1) - (((-1) - iRotateWordLeft) | ((-1) - 63))];
        int iRotateWordLeft6 = iRotateWordLeft3 + iArr[(iRotateWordLeft5 + 63) - (63 | iRotateWordLeft5)];
        int iRotateWordLeft7 = iRotateWordLeft2 + iArr[63 & iRotateWordLeft6];
        int iRotateWordLeft8 = iRotateWordLeft + iArr[63 & iRotateWordLeft7];
        for (int i8 = 20; i8 <= 40; i8 += 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5 + ((-1) - (((-1) - (~iRotateWordLeft8)) | ((-1) - iRotateWordLeft6))) + ((-1) - (((-1) - iRotateWordLeft7) | ((-1) - iRotateWordLeft8))) + this.workingKey[i8], 1);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6 + ((~iRotateWordLeft5) & iRotateWordLeft7) + ((-1) - (((-1) - iRotateWordLeft8) | ((-1) - iRotateWordLeft5))) + this.workingKey[i8 + 1], 2);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7 + ((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft5 & iRotateWordLeft6) + this.workingKey[i8 + 2], 3);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8 + ((~iRotateWordLeft7) & iRotateWordLeft5) + ((-1) - (((-1) - iRotateWordLeft6) | ((-1) - iRotateWordLeft7))) + this.workingKey[i8 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 + iArr2[(-1) - (((-1) - iRotateWordLeft8) | ((-1) - 63))];
        int iRotateWordLeft10 = iRotateWordLeft6 + iArr2[(-1) - (((-1) - iRotateWordLeft9) | ((-1) - 63))];
        int iRotateWordLeft11 = iRotateWordLeft7 + iArr2[63 & iRotateWordLeft10];
        int iRotateWordLeft12 = iRotateWordLeft8 + iArr2[63 & iRotateWordLeft11];
        for (int i9 = 44; i9 < 64; i9 += 4) {
            int i10 = ~iRotateWordLeft12;
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9 + ((i10 + iRotateWordLeft10) - (i10 | iRotateWordLeft10)) + ((-1) - (((-1) - iRotateWordLeft11) | ((-1) - iRotateWordLeft12))) + this.workingKey[i9], 1);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10 + ((~iRotateWordLeft9) & iRotateWordLeft11) + ((iRotateWordLeft12 + iRotateWordLeft9) - (iRotateWordLeft12 | iRotateWordLeft9)) + this.workingKey[i9 + 1], 2);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11 + ((~iRotateWordLeft10) & iRotateWordLeft12) + ((-1) - (((-1) - iRotateWordLeft9) | ((-1) - iRotateWordLeft10))) + this.workingKey[i9 + 2], 3);
            int i11 = ~iRotateWordLeft11;
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12 + ((i11 + iRotateWordLeft9) - (i11 | iRotateWordLeft9)) + ((-1) - (((-1) - iRotateWordLeft10) | ((-1) - iRotateWordLeft11))) + this.workingKey[i9 + 3], 5);
        }
        bArr2[i3] = (byte) iRotateWordLeft9;
        bArr2[i3 + 1] = (byte) (iRotateWordLeft9 >> 8);
        bArr2[i3 + 2] = (byte) iRotateWordLeft10;
        bArr2[i3 + 3] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i3 + 4] = (byte) iRotateWordLeft11;
        bArr2[i3 + 5] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i3 + 6] = (byte) iRotateWordLeft12;
        bArr2[i3 + 7] = (byte) (iRotateWordLeft12 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i2) {
        int[] iArr = new int[128];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            int i4 = bArr[i3];
            iArr[i3] = (i4 + 255) - (i4 | 255);
        }
        int length = bArr.length;
        if (length < 128) {
            int i5 = iArr[length - 1];
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                byte b2 = piTable[(-1) - (((-1) - (i5 + iArr[i6])) | ((-1) - 255))];
                i5 = (b2 + 255) - (b2 | 255);
                int i8 = length + 1;
                iArr[length] = i5;
                if (i8 >= 128) {
                    break;
                }
                length = i8;
                i6 = i7;
            }
        }
        int i9 = (i2 + 7) >> 3;
        int i10 = 128 - i9;
        int i11 = (-1) - (((-1) - piTable[(255 >> ((-i2) & 7)) & iArr[i10]]) | ((-1) - 255));
        iArr[i10] = i11;
        for (int i12 = 127 - i9; i12 >= 0; i12--) {
            i11 = piTable[i11 ^ iArr[i12 + i9]] & 255;
            iArr[i12] = i11;
        }
        int[] iArr2 = new int[64];
        for (int i13 = 0; i13 != 64; i13++) {
            int i14 = i13 * 2;
            iArr2[i13] = iArr[i14] + (iArr[i14 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i2, int i3) {
        int i4 = (i2 + 65535) - (i2 | 65535);
        int i5 = i4 << i3;
        int i6 = i4 >> (16 - i3);
        return (i6 + i5) - (i6 & i5);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.encrypting = z2;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + cipherParameters.getClass().getName());
            }
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length * 8);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.workingKey == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i2 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i2, bArr2, i3);
            return 8;
        }
        decryptBlock(bArr, i2, bArr2, i3);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
