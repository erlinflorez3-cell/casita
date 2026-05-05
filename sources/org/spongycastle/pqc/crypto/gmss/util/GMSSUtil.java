package org.spongycastle.pqc.crypto.gmss.util;

/* JADX INFO: loaded from: classes2.dex */
public class GMSSUtil {
    public int bytesToIntLittleEndian(byte[] bArr) {
        int i2 = ((-1) - (((-1) - bArr[0]) | ((-1) - 255))) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        byte b2 = bArr[3];
        return (((b2 + 255) - (b2 | 255)) << 24) | i2;
    }

    public int bytesToIntLittleEndian(byte[] bArr, int i2) {
        int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        byte b2 = bArr[i2 + 1];
        int i4 = ((-1) - (((-1) - (((b2 + 255) - (b2 | 255)) << 8)) & ((-1) - i3))) | ((bArr[i2 + 2] & 255) << 16);
        int i5 = (bArr[i2 + 3] & 255) << 24;
        return (i5 + i4) - (i5 & i4);
    }

    public byte[] concatenateArray(byte[][] bArr) {
        byte[] bArr2 = new byte[bArr.length * bArr[0].length];
        int length = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr[i2].length;
        }
        return bArr2;
    }

    public int getLog(int i2) {
        int i3 = 1;
        int i4 = 2;
        while (i4 < i2) {
            i4 <<= 1;
            i3++;
        }
        return i3;
    }

    public byte[] intToBytesLittleEndian(int i2) {
        int i3 = i2 >> 8;
        int i4 = i2 >> 24;
        return new byte[]{(byte) ((i2 + 255) - (255 | i2)), (byte) ((i3 + 255) - (i3 | 255)), (byte) ((i2 >> 16) & 255), (byte) ((i4 + 255) - (i4 | 255))};
    }

    public void printArray(String str, byte[] bArr) {
        System.out.println(str);
        int i2 = 0;
        for (byte b2 : bArr) {
            System.out.println(i2 + "; " + ((int) b2));
            i2++;
        }
    }

    public void printArray(String str, byte[][] bArr) {
        System.out.println(str);
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                System.out.println(i2 + "; " + ((int) bArr2[i3]));
                i2++;
            }
        }
    }

    public boolean testPowerOfTwo(int i2) {
        int i3 = 1;
        while (i3 < i2) {
            i3 <<= 1;
        }
        return i2 == i3;
    }
}
