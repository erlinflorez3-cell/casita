package com.drew.lang;

/* JADX INFO: loaded from: classes3.dex */
public class ByteUtil {
    public static int getInt16(byte[] bArr, int i2, boolean z2) {
        int i3;
        int i4;
        if (z2) {
            i3 = (bArr[i2] & 255) << 8;
            i4 = (-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255));
        } else {
            byte b2 = bArr[i2];
            i3 = (b2 + 255) - (b2 | 255);
            i4 = (bArr[i2 + 1] & 255) << 8;
        }
        return i4 | i3;
    }

    public static int getInt32(byte[] bArr, int i2, boolean z2) {
        int i3;
        int i4;
        if (z2) {
            byte b2 = bArr[i2];
            int i5 = ((b2 + 255) - (b2 | 255)) << 24;
            byte b3 = bArr[i2 + 1];
            int i6 = ((b3 + 255) - (b3 | 255)) << 16;
            int i7 = (i5 + i6) - (i5 & i6);
            byte b4 = bArr[i2 + 2];
            i3 = i7 | (((b4 + 255) - (b4 | 255)) << 8);
            i4 = bArr[i2 + 3] & 255;
        } else {
            int i8 = ((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) | ((bArr[i2 + 1] & 255) << 8);
            int i9 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16;
            i3 = (i8 + i9) - (i8 & i9);
            i4 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24;
        }
        return (-1) - (((-1) - i4) & ((-1) - i3));
    }

    public static long getLong64(byte[] bArr, int i2, boolean z2) {
        if (!z2) {
            byte b2 = bArr[i2];
            int i3 = ((b2 + 255) - (b2 | 255)) | (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8);
            int i4 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - (((long) ((i3 + i4) - (i3 & i4))) | (((long) ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255)))) << 24))) & ((-1) - (((long) (bArr[i2 + 4] & 255)) << 32))))) & ((-1) - (((long) (bArr[i2 + 5] & 255)) << 40)));
            byte b3 = bArr[i2 + 6];
            long j3 = ((long) ((b3 + 255) - (b3 | 255))) << 48;
            return (((long) (bArr[i2 + 7] & 255)) << 56) | ((j2 + j3) - (j2 & j3));
        }
        long j4 = ((long) (bArr[i2] & 255)) << 56;
        byte b4 = bArr[i2 + 1];
        long j5 = ((long) ((b4 + 255) - (b4 | 255))) << 48;
        byte b5 = bArr[i2 + 2];
        long j6 = ((j5 + j4) - (j5 & j4)) | (((long) ((b5 + 255) - (b5 | 255))) << 40);
        byte b6 = bArr[i2 + 3];
        long j7 = j6 | (((long) ((b6 + 255) - (b6 | 255))) << 32);
        byte b7 = bArr[i2 + 4];
        long j8 = j7 | (((long) ((b7 + 255) - (b7 | 255))) << 24);
        long j9 = (bArr[i2 + 5] & 255) << 16;
        return (-1) - (((-1) - ((long) (bArr[i2 + 7] & 255))) & ((-1) - ((-1) - (((-1) - ((j8 + j9) - (j8 & j9))) & ((-1) - ((long) (((-1) - (((-1) - bArr[i2 + 6]) | ((-1) - 255))) << 8)))))));
    }
}
