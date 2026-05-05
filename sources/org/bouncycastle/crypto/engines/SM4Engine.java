package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class SM4Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private final int[] X = new int[4];
    private int[] rk;
    private static final byte[] Sbox = {MessagePack.Code.FIXEXT4, MessagePack.Code.FIXARRAY_PREFIX, -23, -2, MessagePack.Code.UINT8, -31, Base64.padSymbol, -73, Ascii.SYN, -74, Ascii.DC4, MessagePack.Code.FALSE, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, MessagePack.Code.TRUE, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, Ascii.VT, 67, -19, MessagePack.Code.UINT64, -84, 98, -28, -77, Ascii.FS, -87, MessagePack.Code.EXT32, 8, -24, -107, -128, MessagePack.Code.MAP32, -108, -6, 117, -113, Utf8.REPLACEMENT_BYTE, -90, 71, 7, -89, -4, -13, 115, Ascii.ETB, -70, -125, 89, 60, Ascii.EM, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, MessagePack.Code.STR16, -117, -8, -21, Ascii.SI, 75, 112, 86, -99, 53, Ascii.RS, 36, Ascii.SO, 94, 99, 88, MessagePack.Code.INT16, -94, 37, 34, 124, 59, 1, 33, 120, -121, MessagePack.Code.FIXEXT1, 0, 70, 87, -97, MessagePack.Code.INT64, 39, 82, 76, 54, 2, -25, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.BIN8, MessagePack.Code.EXT16, -98, -22, -65, -118, MessagePack.Code.INT32, 64, MessagePack.Code.EXT8, 56, -75, -93, -9, -14, MessagePack.Code.UINT32, -7, 97, Ascii.NAK, -95, MessagePack.Code.NEGFIXINT_PREFIX, -82, 93, -92, -101, 52, Ascii.SUB, 85, -83, -109, 50, 48, -11, -116, -79, -29, Ascii.GS, -10, -30, 46, -126, 102, MessagePack.Code.FLOAT32, 96, MessagePack.Code.NIL, 41, 35, -85, Ascii.CR, 83, 78, 111, MessagePack.Code.FIXEXT2, MessagePack.Code.STR32, 55, 69, MessagePack.Code.MAP16, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, Ascii.ESC, -81, -110, -69, MessagePack.Code.ARRAY32, -68, 127, 17, MessagePack.Code.STR8, 92, 65, Ascii.US, 16, 90, MessagePack.Code.FIXEXT16, 10, MessagePack.Code.NEVER_USED, 49, -120, -91, MessagePack.Code.UINT16, 123, -67, 45, 116, MessagePack.Code.INT8, Ascii.DC2, -72, -27, -76, -80, -119, 105, -105, 74, Ascii.FF, -106, 119, 126, 101, -71, -15, 9, MessagePack.Code.BIN16, 110, MessagePack.Code.BIN32, -124, Ascii.CAN, -16, 125, -20, 58, MessagePack.Code.ARRAY16, 77, 32, 121, -18, 95, 62, MessagePack.Code.FIXEXT8, MessagePack.Code.FLOAT64, 57, 72};
    private static final int[] CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] FK = {-1548633402, 1453994832, 1736282519, -1301273892};

    private int F0(int[] iArr, int i2) {
        return T((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i2) ^ iArr[0];
    }

    private int F1(int[] iArr, int i2) {
        return T((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i2) ^ iArr[1];
    }

    private int F2(int[] iArr, int i2) {
        return T((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i2) ^ iArr[2];
    }

    private int F3(int[] iArr, int i2) {
        return T((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i2) ^ iArr[3];
    }

    private int L(int i2) {
        return rotateLeft(i2, 24) ^ (((rotateLeft(i2, 2) ^ i2) ^ rotateLeft(i2, 10)) ^ rotateLeft(i2, 18));
    }

    private int L_ap(int i2) {
        return rotateLeft(i2, 23) ^ (rotateLeft(i2, 13) ^ i2);
    }

    private void R(int[] iArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        int i5 = i2 + 3;
        int i6 = iArr[i2] ^ iArr[i5];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        iArr[i5] = i7;
        iArr[i2] = iArr[i2] ^ i7;
        int i8 = iArr[i3] ^ iArr[i4];
        iArr[i3] = i8;
        int i9 = i8 ^ iArr[i4];
        iArr[i4] = i9;
        iArr[i3] = i9 ^ iArr[i3];
    }

    private int T(int i2) {
        return L(tau(i2));
    }

    private int T_ap(int i2) {
        return L_ap(tau(i2));
    }

    private int[] expandKey(boolean z2, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(bArr, 0), Pack.bigEndianToInt(bArr, 4), Pack.bigEndianToInt(bArr, 8), Pack.bigEndianToInt(bArr, 12)};
        int i2 = iArr2[0];
        int[] iArr3 = FK;
        int[] iArr4 = {i2 ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z2) {
            int i3 = iArr4[0];
            int i4 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = CK;
            int iT_ap = i3 ^ T_ap(i4 ^ iArr5[0]);
            iArr[0] = iT_ap;
            int iT_ap2 = T_ap((iT_ap ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = iT_ap2;
            int iT_ap3 = T_ap((iT_ap2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = iT_ap3;
            iArr[3] = T_ap((iT_ap3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i5 = 4; i5 < 32; i5++) {
                iArr[i5] = iArr[i5 - 4] ^ T_ap(((iArr[i5 - 3] ^ iArr[i5 - 2]) ^ iArr[i5 - 1]) ^ CK[i5]);
            }
        } else {
            int i6 = iArr4[0];
            int i7 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = CK;
            int iT_ap4 = i6 ^ T_ap(i7 ^ iArr6[0]);
            iArr[31] = iT_ap4;
            int iT_ap5 = T_ap((iT_ap4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = iT_ap5;
            int iT_ap6 = T_ap((iT_ap5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = iT_ap6;
            iArr[28] = T_ap((iT_ap6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]) ^ iArr4[3];
            for (int i8 = 27; i8 >= 0; i8--) {
                iArr[i8] = iArr[i8 + 4] ^ T_ap(((iArr[i8 + 3] ^ iArr[i8 + 2]) ^ iArr[i8 + 1]) ^ CK[31 - i8]);
            }
        }
        return iArr;
    }

    private int rotateLeft(int i2, int i3) {
        int i4 = i2 << i3;
        int i5 = i2 >>> (-i3);
        return (i5 + i4) - (i5 & i4);
    }

    private int tau(int i2) {
        byte[] bArr = Sbox;
        int i3 = (-1) - (((-1) - bArr[(i2 >> 24) & 255]) | ((-1) - 255));
        int i4 = i2 >> 16;
        int i5 = (-1) - (((-1) - bArr[(i4 + 255) - (i4 | 255)]) | ((-1) - 255));
        byte b2 = bArr[(i2 >> 8) & 255];
        int i6 = (b2 + 255) - (b2 | 255);
        byte b3 = bArr[(i2 + 255) - (i2 | 255)];
        int i7 = (b3 + 255) - (b3 | 255);
        int i8 = (i3 << 24) | (i5 << 16);
        int i9 = i6 << 8;
        return (-1) - (((-1) - i7) & ((-1) - ((i8 + i9) - (i8 & i9))));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.rk = expandKey(z2, key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (this.rk == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i2 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.X[0] = Pack.bigEndianToInt(bArr, i2);
        this.X[1] = Pack.bigEndianToInt(bArr, i2 + 4);
        this.X[2] = Pack.bigEndianToInt(bArr, i2 + 8);
        this.X[3] = Pack.bigEndianToInt(bArr, i2 + 12);
        for (int i4 = 0; i4 < 32; i4 += 4) {
            int[] iArr = this.X;
            iArr[0] = F0(iArr, this.rk[i4]);
            int[] iArr2 = this.X;
            iArr2[1] = F1(iArr2, this.rk[i4 + 1]);
            int[] iArr3 = this.X;
            iArr3[2] = F2(iArr3, this.rk[i4 + 2]);
            int[] iArr4 = this.X;
            iArr4[3] = F3(iArr4, this.rk[i4 + 3]);
        }
        R(this.X, 0);
        Pack.intToBigEndian(this.X[0], bArr2, i3);
        Pack.intToBigEndian(this.X[1], bArr2, i3 + 4);
        Pack.intToBigEndian(this.X[2], bArr2, i3 + 8);
        Pack.intToBigEndian(this.X[3], bArr2, i3 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
