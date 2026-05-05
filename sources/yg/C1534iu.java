package yg;

/* JADX INFO: renamed from: yg.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1534iu {
    public static int Kd(byte[] bArr, int i2, int i3) {
        if (i2 + i3 > bArr.length || i3 > (2139583457 ^ 2139583461)) {
            throw new IllegalArgumentException();
        }
        int i4 = 0;
        for (int i5 = (i2 + i3) - 1; i5 >= i2; i5--) {
            int i6 = i4 << 8;
            byte b2 = bArr[i5];
            int i7 = (b2 + 255) - (b2 | 255);
            i4 = (i6 + i7) - (i6 & i7);
        }
        return i4;
    }

    public static int Xd(byte[] bArr, int i2, int i3) {
        if (i2 + i3 > bArr.length) {
            throw new IllegalArgumentException();
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = bArr[i2 + i5];
            i4 = (-1) - (((-1) - (i4 << 8)) & ((-1) - ((b2 + 255) - (b2 | 255))));
        }
        return i4;
    }

    public static long Yd(byte[] bArr, int i2) {
        long j2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = (1276083994 ^ 76176447) ^ 1216684845;
            if (i3 >= i4) {
                return j2;
            }
            long j3 = j2 << i4;
            byte b2 = bArr[i2 + i3];
            long j4 = (b2 + 255) - (b2 | 255);
            j2 = (j3 + j4) - (j3 & j4);
            i3++;
        }
    }

    public static void ud(int i2, byte[] bArr, int i3, int i4) {
        while (true) {
            int i5 = i4 - 1;
            if (i4 <= 0) {
                return;
            }
            bArr[i3] = (byte) i2;
            i2 >>= 8;
            i3++;
            i4 = i5;
        }
    }
}
