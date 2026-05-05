package org.spongycastle.crypto.engines;

import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RC2Parameters;

/* JADX INFO: loaded from: classes2.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {MessagePack.Code.STR8, 120, -7, MessagePack.Code.BIN8, Ascii.EM, MessagePack.Code.ARRAY32, -75, -19, 40, -23, -3, 121, 74, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.FIXEXT16, -99, MessagePack.Code.BIN32, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, Ascii.ETB, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, Ascii.VT, -16, -107, 33, 34, 92, 107, 78, -126, 84, MessagePack.Code.FIXEXT4, 101, -109, MessagePack.Code.UINT32, 96, -78, Ascii.FS, 115, 86, MessagePack.Code.NIL, Ascii.DC4, -89, -116, -15, MessagePack.Code.ARRAY16, Ascii.DC2, 117, MessagePack.Code.FLOAT32, Ascii.US, 59, -66, -28, MessagePack.Code.INT16, 66, Base64.padSymbol, MessagePack.Code.FIXEXT1, 48, -93, 60, -74, 38, 111, -65, Ascii.SO, MessagePack.Code.STR16, 70, 105, 7, 87, 39, -14, Ascii.GS, -101, -68, -108, 67, 3, -8, 17, MessagePack.Code.EXT8, -10, MessagePack.Code.FIXARRAY_PREFIX, -17, 62, -25, 6, MessagePack.Code.TRUE, MessagePack.Code.FIXEXT2, 47, MessagePack.Code.EXT16, 102, Ascii.RS, MessagePack.Code.FIXEXT8, 8, -24, -22, MessagePack.Code.MAP16, -128, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, Ascii.SUB, MessagePack.Code.INT32, 113, 90, Ascii.NAK, 73, 116, 75, -97, MessagePack.Code.INT8, 94, 4, Ascii.CAN, -92, -20, MessagePack.Code.FALSE, MessagePack.Code.NEGFIXINT_PREFIX, 65, 110, Ascii.SI, 81, MessagePack.Code.FLOAT64, MessagePack.Code.UINT8, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, MessagePack.Code.MAP32, 41, 16, 103, 108, -70, MessagePack.Code.EXT32, MessagePack.Code.INT64, 0, -26, MessagePack.Code.UINT64, -31, -98, -88, 44, 99, Ascii.SYN, 1, Utf8.REPLACEMENT_BYTE, 88, -30, -119, -87, Ascii.CR, 56, 52, Ascii.ESC, -85, 51, -1, -80, -69, 72, Ascii.FF, 95, -71, -79, MessagePack.Code.UINT16, 46, MessagePack.Code.BIN16, -13, MessagePack.Code.STR32, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, 127, MessagePack.Code.NEVER_USED, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iRotateWordLeft = ((bArr[i2 + 7] & 255) << 8) + (bArr[i2 + 6] & 255);
        byte b2 = bArr[i2 + 5];
        int iRotateWordLeft2 = (((b2 + 255) - (b2 | 255)) << 8) + ((-1) - (((-1) - bArr[i2 + 4]) | ((-1) - 255)));
        int i4 = (bArr[i2 + 3] & 255) << 8;
        byte b3 = bArr[i2 + 2];
        int iRotateWordLeft3 = i4 + ((b3 + 255) - (b3 | 255));
        byte b4 = bArr[i2 + 1];
        int iRotateWordLeft4 = (((b4 + 255) - (b4 | 255)) << 8) + ((-1) - (((-1) - bArr[i2]) | ((-1) - 255)));
        for (int i5 = 60; i5 >= 44; i5 -= 4) {
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft, 11) - ((((-1) - (((-1) - (~iRotateWordLeft2)) | ((-1) - iRotateWordLeft4))) + (iRotateWordLeft3 & iRotateWordLeft2)) + this.workingKey[i5 + 3]);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2, 13) - ((((~iRotateWordLeft3) & iRotateWordLeft) + ((-1) - (((-1) - iRotateWordLeft4) | ((-1) - iRotateWordLeft3)))) + this.workingKey[i5 + 2]);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3, 14) - ((((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4)) + this.workingKey[i5 + 1]);
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4, 15) - ((((~iRotateWordLeft) & iRotateWordLeft3) + ((iRotateWordLeft2 + iRotateWordLeft) - (iRotateWordLeft2 | iRotateWordLeft))) + this.workingKey[i5]);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft - iArr[63 & iRotateWordLeft2];
        int iRotateWordLeft6 = iRotateWordLeft2 - iArr[(iRotateWordLeft3 + 63) - (63 | iRotateWordLeft3)];
        int iRotateWordLeft7 = iRotateWordLeft3 - iArr[63 & iRotateWordLeft4];
        int iRotateWordLeft8 = iRotateWordLeft4 - iArr[63 & iRotateWordLeft5];
        for (int i6 = 40; i6 >= 20; i6 -= 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5, 11) - ((((-1) - (((-1) - (~iRotateWordLeft6)) | ((-1) - iRotateWordLeft8))) + (iRotateWordLeft7 & iRotateWordLeft6)) + this.workingKey[i6 + 3]);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6, 13) - ((((-1) - (((-1) - (~iRotateWordLeft7)) | ((-1) - iRotateWordLeft5))) + (iRotateWordLeft8 & iRotateWordLeft7)) + this.workingKey[i6 + 2]);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7, 14) - ((((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft5 & iRotateWordLeft8)) + this.workingKey[i6 + 1]);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8, 15) - ((((-1) - (((-1) - (~iRotateWordLeft5)) | ((-1) - iRotateWordLeft7))) + ((-1) - (((-1) - iRotateWordLeft6) | ((-1) - iRotateWordLeft5)))) + this.workingKey[i6]);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 - iArr2[(iRotateWordLeft6 + 63) - (63 | iRotateWordLeft6)];
        int iRotateWordLeft10 = iRotateWordLeft6 - iArr2[(iRotateWordLeft7 + 63) - (63 | iRotateWordLeft7)];
        int iRotateWordLeft11 = iRotateWordLeft7 - iArr2[(-1) - (((-1) - iRotateWordLeft8) | ((-1) - 63))];
        int iRotateWordLeft12 = iRotateWordLeft8 - iArr2[(iRotateWordLeft9 + 63) - (63 | iRotateWordLeft9)];
        for (int i7 = 16; i7 >= 0; i7 -= 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9, 11) - ((((~iRotateWordLeft10) & iRotateWordLeft12) + ((-1) - (((-1) - iRotateWordLeft11) | ((-1) - iRotateWordLeft10)))) + this.workingKey[i7 + 3]);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10, 13) - ((((~iRotateWordLeft11) & iRotateWordLeft9) + ((-1) - (((-1) - iRotateWordLeft12) | ((-1) - iRotateWordLeft11)))) + this.workingKey[i7 + 2]);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11, 14) - ((((~iRotateWordLeft12) & iRotateWordLeft10) + ((-1) - (((-1) - iRotateWordLeft9) | ((-1) - iRotateWordLeft12)))) + this.workingKey[i7 + 1]);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12, 15) - ((((-1) - (((-1) - (~iRotateWordLeft9)) | ((-1) - iRotateWordLeft11))) + ((-1) - (((-1) - iRotateWordLeft10) | ((-1) - iRotateWordLeft9)))) + this.workingKey[i7]);
        }
        bArr2[i3] = (byte) iRotateWordLeft12;
        bArr2[i3 + 1] = (byte) (iRotateWordLeft12 >> 8);
        bArr2[i3 + 2] = (byte) iRotateWordLeft11;
        bArr2[i3 + 3] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i3 + 4] = (byte) iRotateWordLeft10;
        bArr2[i3 + 5] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i3 + 6] = (byte) iRotateWordLeft9;
        bArr2[i3 + 7] = (byte) (iRotateWordLeft9 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        byte b2 = bArr[i2 + 7];
        int iRotateWordLeft = (((b2 + 255) - (b2 | 255)) << 8) + (bArr[i2 + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i2 + 5] & 255) << 8) + ((-1) - (((-1) - bArr[i2 + 4]) | ((-1) - 255)));
        byte b3 = bArr[i2 + 3];
        int iRotateWordLeft3 = (((b3 + 255) - (b3 | 255)) << 8) + ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255)));
        int i4 = ((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8;
        byte b4 = bArr[i2];
        int iRotateWordLeft4 = i4 + ((b4 + 255) - (b4 | 255));
        for (int i5 = 0; i5 <= 16; i5 += 4) {
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4 + ((-1) - (((-1) - (~iRotateWordLeft)) | ((-1) - iRotateWordLeft3))) + (iRotateWordLeft2 & iRotateWordLeft) + this.workingKey[i5], 1);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3 + ((-1) - (((-1) - (~iRotateWordLeft4)) | ((-1) - iRotateWordLeft2))) + ((-1) - (((-1) - iRotateWordLeft) | ((-1) - iRotateWordLeft4))) + this.workingKey[i5 + 1], 2);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2 + ((~iRotateWordLeft3) & iRotateWordLeft) + ((-1) - (((-1) - iRotateWordLeft4) | ((-1) - iRotateWordLeft3))) + this.workingKey[i5 + 2], 3);
            int i6 = ~iRotateWordLeft2;
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft + ((i6 + iRotateWordLeft4) - (i6 | iRotateWordLeft4)) + ((-1) - (((-1) - iRotateWordLeft3) | ((-1) - iRotateWordLeft2))) + this.workingKey[i5 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft4 + iArr[(-1) - (((-1) - iRotateWordLeft) | ((-1) - 63))];
        int iRotateWordLeft6 = iRotateWordLeft3 + iArr[63 & iRotateWordLeft5];
        int iRotateWordLeft7 = iRotateWordLeft2 + iArr[(-1) - (((-1) - iRotateWordLeft6) | ((-1) - 63))];
        int iRotateWordLeft8 = iRotateWordLeft + iArr[(iRotateWordLeft7 + 63) - (63 | iRotateWordLeft7)];
        for (int i7 = 20; i7 <= 40; i7 += 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5 + ((-1) - (((-1) - (~iRotateWordLeft8)) | ((-1) - iRotateWordLeft6))) + ((-1) - (((-1) - iRotateWordLeft7) | ((-1) - iRotateWordLeft8))) + this.workingKey[i7], 1);
            int i8 = ~iRotateWordLeft5;
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6 + ((i8 + iRotateWordLeft7) - (i8 | iRotateWordLeft7)) + (iRotateWordLeft8 & iRotateWordLeft5) + this.workingKey[i7 + 1], 2);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7 + ((~iRotateWordLeft6) & iRotateWordLeft8) + ((iRotateWordLeft5 + iRotateWordLeft6) - (iRotateWordLeft5 | iRotateWordLeft6)) + this.workingKey[i7 + 2], 3);
            int i9 = ~iRotateWordLeft7;
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8 + ((i9 + iRotateWordLeft5) - (i9 | iRotateWordLeft5)) + ((-1) - (((-1) - iRotateWordLeft6) | ((-1) - iRotateWordLeft7))) + this.workingKey[i7 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 + iArr2[63 & iRotateWordLeft8];
        int iRotateWordLeft10 = iRotateWordLeft6 + iArr2[63 & iRotateWordLeft9];
        int iRotateWordLeft11 = iRotateWordLeft7 + iArr2[(iRotateWordLeft10 + 63) - (63 | iRotateWordLeft10)];
        int iRotateWordLeft12 = iRotateWordLeft8 + iArr2[(iRotateWordLeft11 + 63) - (63 | iRotateWordLeft11)];
        for (int i10 = 44; i10 < 64; i10 += 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9 + ((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft11 & iRotateWordLeft12) + this.workingKey[i10], 1);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10 + ((-1) - (((-1) - (~iRotateWordLeft9)) | ((-1) - iRotateWordLeft11))) + (iRotateWordLeft12 & iRotateWordLeft9) + this.workingKey[i10 + 1], 2);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11 + ((~iRotateWordLeft10) & iRotateWordLeft12) + ((iRotateWordLeft9 + iRotateWordLeft10) - (iRotateWordLeft9 | iRotateWordLeft10)) + this.workingKey[i10 + 2], 3);
            int i11 = ~iRotateWordLeft11;
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12 + ((i11 + iRotateWordLeft9) - (i11 | iRotateWordLeft9)) + (iRotateWordLeft10 & iRotateWordLeft11) + this.workingKey[i10 + 3], 5);
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
            iArr[i3] = (-1) - (((-1) - bArr[i3]) | ((-1) - 255));
        }
        int length = bArr.length;
        if (length < 128) {
            int i4 = iArr[length - 1];
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                byte b2 = piTable[(i4 + iArr[i5]) & 255];
                i4 = (b2 + 255) - (b2 | 255);
                int i7 = length + 1;
                iArr[length] = i4;
                if (i7 >= 128) {
                    break;
                }
                length = i7;
                i5 = i6;
            }
        }
        int i8 = (i2 + 7) >> 3;
        int i9 = 128 - i8;
        int i10 = piTable[(-1) - (((-1) - (255 >> ((-1) - (((-1) - (-i2)) | ((-1) - 7))))) | ((-1) - iArr[i9]))] & 255;
        iArr[i9] = i10;
        for (int i11 = 127 - i8; i11 >= 0; i11--) {
            byte b3 = piTable[i10 ^ iArr[i11 + i8]];
            i10 = (b3 + 255) - (b3 | 255);
            iArr[i11] = i10;
        }
        int[] iArr2 = new int[64];
        for (int i12 = 0; i12 != 64; i12++) {
            int i13 = i12 * 2;
            iArr2[i12] = iArr[i13] + (iArr[i13 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i2, int i3) {
        int i4 = (-1) - (((-1) - i2) | ((-1) - 65535));
        return (-1) - (((-1) - (i4 >> (16 - i3))) & ((-1) - (i4 << i3)));
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
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

    @Override // org.spongycastle.crypto.BlockCipher
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

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
