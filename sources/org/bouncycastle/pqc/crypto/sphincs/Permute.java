package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    Permute() {
    }

    public static void permute(int i2, int[] iArr) {
        int i3 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i2 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c2 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int iRotl = iArr[4];
        int iRotl2 = iArr[5];
        int iRotl3 = iArr[6];
        int i8 = 7;
        int iRotl4 = iArr[7];
        int i9 = 8;
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int iRotl5 = iArr[12];
        int iRotl6 = iArr[13];
        int iRotl7 = iArr[14];
        int iRotl8 = iArr[15];
        while (i2 > 0) {
            int i14 = i4 + iRotl;
            int iRotl9 = rotl(iRotl5 ^ i14, i3);
            int i15 = i10 + iRotl9;
            int iRotl10 = rotl(iRotl ^ i15, 12);
            int i16 = i14 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i16, i9);
            int i17 = i15 + iRotl11;
            int iRotl12 = rotl(iRotl10 ^ i17, i8);
            int i18 = i5 + iRotl2;
            int iRotl13 = rotl(iRotl6 ^ i18, i3);
            int i19 = i11 + iRotl13;
            int iRotl14 = rotl(iRotl2 ^ i19, 12);
            int i20 = i18 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i20, i9);
            int i21 = i19 + iRotl15;
            int iRotl16 = rotl(iRotl14 ^ i21, i8);
            int i22 = i6 + iRotl3;
            int iRotl17 = rotl(iRotl7 ^ i22, i3);
            int i23 = i12 + iRotl17;
            int iRotl18 = rotl(iRotl3 ^ i23, 12);
            int i24 = i22 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i24, i9);
            int i25 = i23 + iRotl19;
            int iRotl20 = rotl(iRotl18 ^ i25, i8);
            int i26 = i7 + iRotl4;
            int iRotl21 = rotl(iRotl8 ^ i26, i3);
            int i27 = i13 + iRotl21;
            int iRotl22 = rotl(iRotl4 ^ i27, 12);
            int i28 = i26 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i28, i9);
            int i29 = i27 + iRotl23;
            int iRotl24 = rotl(iRotl22 ^ i29, 7);
            int i30 = i16 + iRotl16;
            int iRotl25 = rotl(iRotl23 ^ i30, 16);
            int i31 = i25 + iRotl25;
            int iRotl26 = rotl(iRotl16 ^ i31, 12);
            i4 = i30 + iRotl26;
            iRotl8 = rotl(iRotl25 ^ i4, 8);
            i12 = i31 + iRotl8;
            iRotl2 = rotl(iRotl26 ^ i12, 7);
            int i32 = i20 + iRotl20;
            int iRotl27 = rotl(iRotl11 ^ i32, 16);
            int i33 = i29 + iRotl27;
            int iRotl28 = rotl(iRotl20 ^ i33, 12);
            i5 = i32 + iRotl28;
            iRotl5 = rotl(iRotl27 ^ i5, 8);
            i13 = i33 + iRotl5;
            iRotl3 = rotl(iRotl28 ^ i13, 7);
            int i34 = i24 + iRotl24;
            int iRotl29 = rotl(iRotl15 ^ i34, 16);
            int i35 = i17 + iRotl29;
            int iRotl30 = rotl(iRotl24 ^ i35, 12);
            i6 = i34 + iRotl30;
            iRotl6 = rotl(iRotl29 ^ i6, 8);
            i10 = i35 + iRotl6;
            iRotl4 = rotl(iRotl30 ^ i10, 7);
            int i36 = i28 + iRotl12;
            i3 = 16;
            int iRotl31 = rotl(iRotl19 ^ i36, 16);
            int i37 = i21 + iRotl31;
            int iRotl32 = rotl(iRotl12 ^ i37, 12);
            i7 = i36 + iRotl32;
            iRotl7 = rotl(iRotl31 ^ i7, 8);
            i11 = i37 + iRotl7;
            i8 = 7;
            iRotl = rotl(iRotl32 ^ i11, 7);
            i2 -= 2;
            c2 = 0;
            i9 = 8;
        }
        iArr[c2] = i4;
        iArr[1] = i5;
        iArr[2] = i6;
        iArr[3] = i7;
        iArr[4] = iRotl;
        iArr[5] = iRotl2;
        iArr[6] = iRotl3;
        iArr[i8] = iRotl4;
        iArr[8] = i10;
        iArr[9] = i11;
        iArr[10] = i12;
        iArr[11] = i13;
        iArr[12] = iRotl5;
        iArr[13] = iRotl6;
        iArr[14] = iRotl7;
        iArr[15] = iRotl8;
    }

    protected static int rotl(int i2, int i3) {
        int i4 = i2 << i3;
        int i5 = i2 >>> (-i3);
        return (i5 + i4) - (i5 & i4);
    }

    void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i2 = 0; i2 < 16; i2++) {
            iArr[i2] = Pack.littleEndianToInt(bArr2, i2 * 4);
        }
        permute(12, iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            Pack.intToLittleEndian(iArr[i3], bArr, i3 * 4);
        }
    }
}
