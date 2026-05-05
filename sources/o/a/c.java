package o.a;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static byte[] f19916h = new byte[256];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte[] f19915e = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f19914d = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f19911a = new int[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f19913c = new int[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f19912b = new int[256];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int[] f19917j = new int[10];

    static {
        byte[] bArr;
        int i2;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) (((-1) - (((-1) - b2) | ((-1) - 128)) != 0 ? 27 : 0) ^ ((b2 << 1) ^ b2));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 + 128) - (128 | b6) != 0 ? (byte) 9 : (byte) 0));
            bArr = f19916h;
            i2 = (b2 + 255) - (255 | b2);
            int i3 = (-1) - (((-1) - b3) | ((-1) - 255));
            bArr[i2] = (byte) (((((b3 ^ 99) ^ ((i3 << 1) | (i3 >> 7))) ^ ((i3 << 2) | (i3 >> 6))) ^ ((i3 << 3) | (i3 >> 5))) ^ ((i3 >> 4) | (i3 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = f19916h[i4] & 255;
            f19915e[i5] = (byte) i4;
            int i6 = i4 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 ^ i4;
            int i10 = i9 ^ i6;
            int i11 = (-1) - (((-1) - (((i6 ^ (i7 ^ i8)) << 24) | (i9 << 16))) & ((-1) - ((i9 ^ i7) << 8)));
            int i12 = (i11 + i10) - (i11 & i10);
            f19914d[i5] = i12;
            int i13 = i12 >>> 8;
            int i14 = i12 << 24;
            f19911a[i5] = (i13 + i14) - (i13 & i14);
            f19913c[i5] = (-1) - (((-1) - (i12 >>> 16)) & ((-1) - (i12 << 16)));
            int i15 = i12 >>> 24;
            int i16 = i12 << 8;
            f19912b[i5] = (i16 + i15) - (i16 & i15);
        }
        f19917j[0] = 16777216;
        int i17 = 1;
        for (int i18 = 1; i18 < 10; i18++) {
            i17 <<= 1;
            if (i17 >= 256) {
                i17 ^= 283;
            }
            f19917j[i18] = i17 << 24;
        }
    }

    public static byte[][] a(int i2) {
        byte[][] bArr = new byte[4][];
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i2 >>> (i3 << 3);
            int i5 = i4 >> 2;
            byte b2 = (byte) ((i5 + 3) - (i5 | 3));
            int i6 = i4 >> 4;
            bArr[i3] = new byte[]{(byte) (3 & i4), b2, (byte) ((i6 + 3) - (i6 | 3)), (byte) ((-1) - (((-1) - (i4 >> 6)) | ((-1) - 3)))};
        }
        return bArr;
    }

    static int[] d(byte[] bArr, int i2) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i3 = 4;
        int i4 = (i2 + 1) * 4;
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = ((bArr[i5 + 1] & 255) << 16) | (bArr[i5] << Ascii.CAN);
            int i8 = i5 + 3;
            int i9 = (bArr[i5 + 2] & 255) << 8;
            i5 += 4;
            byte b2 = bArr[i8];
            iArr[i6] = ((i7 + i9) - (i7 & i9)) | ((b2 + 255) - (b2 | 255));
        }
        int i10 = 4;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i4) {
            int i13 = iArr[i10 - 1];
            if (i11 == 0) {
                byte[] bArr2 = f19916h;
                int i14 = bArr2[(-1) - (((-1) - (i13 >>> 16)) | ((-1) - 255))] << Ascii.CAN;
                int i15 = i13 >>> 8;
                byte b3 = bArr2[(i15 + 255) - (i15 | 255)];
                int i16 = i14 | (((b3 + 255) - (b3 | 255)) << 16);
                byte b4 = bArr2[(i13 + 255) - (255 | i13)];
                int i17 = ((b4 + 255) - (b4 | 255)) << 8;
                i13 = (((-1) - (((-1) - bArr2[i13 >>> 24]) | ((-1) - 255))) | ((i16 + i17) - (i16 & i17))) ^ f19917j[i12];
                i11 = 4;
                i12++;
            }
            iArr[i10] = i13 ^ iArr[i10 - 4];
            i10++;
            i11--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i4];
        int i18 = i2 * 4;
        iArr2[0] = iArr[i18];
        iArr2[1] = iArr[i18 + 1];
        iArr2[2] = iArr[i18 + 2];
        iArr2[3] = iArr[i18 + 3];
        int i19 = i18 - 4;
        for (int i20 = 1; i20 < i2; i20++) {
            int i21 = iArr[i19];
            int[] iArr3 = f19914d;
            byte[] bArr3 = f19916h;
            byte b5 = bArr3[i21 >>> 24];
            int i22 = iArr3[(b5 + 255) - (b5 | 255)];
            int[] iArr4 = f19911a;
            int i23 = i21 >>> 16;
            byte b6 = bArr3[(i23 + 255) - (i23 | 255)];
            int i24 = i22 ^ iArr4[(b6 + 255) - (b6 | 255)];
            int[] iArr5 = f19913c;
            int i25 = i21 >>> 8;
            int i26 = i24 ^ iArr5[bArr3[(i25 + 255) - (i25 | 255)] & 255];
            int[] iArr6 = f19912b;
            iArr2[i3] = iArr6[(-1) - (((-1) - bArr3[i21 & 255]) | ((-1) - 255))] ^ i26;
            int i27 = iArr[i19 + 1];
            int i28 = iArr4[bArr3[(-1) - (((-1) - (i27 >>> 16)) | ((-1) - 255))] & 255] ^ iArr3[(-1) - (((-1) - bArr3[i27 >>> 24]) | ((-1) - 255))];
            int i29 = i27 >>> 8;
            byte b7 = bArr3[(i29 + 255) - (i29 | 255)];
            iArr2[i3 + 1] = (i28 ^ iArr5[(b7 + 255) - (b7 | 255)]) ^ iArr6[(-1) - (((-1) - bArr3[i27 & 255]) | ((-1) - 255))];
            int i30 = iArr[i19 + 2];
            int i31 = i3 + 3;
            byte b8 = bArr3[i30 >>> 24];
            int i32 = iArr3[(b8 + 255) - (b8 | 255)];
            int i33 = i30 >>> 16;
            iArr2[i3 + 2] = iArr6[bArr3[i30 & 255] & 255] ^ ((i32 ^ iArr4[bArr3[(i33 + 255) - (i33 | 255)] & 255]) ^ iArr5[bArr3[(-1) - (((-1) - (i30 >>> 8)) | ((-1) - 255))] & 255]);
            int i34 = iArr[i19 + 3];
            i3 += 4;
            int i35 = i34 >>> 16;
            int i36 = iArr3[bArr3[i34 >>> 24] & 255] ^ iArr4[bArr3[(i35 + 255) - (i35 | 255)] & 255];
            byte b9 = bArr3[(-1) - (((-1) - (i34 >>> 8)) | ((-1) - 255))];
            iArr2[i31] = iArr6[(-1) - (((-1) - bArr3[i34 & 255]) | ((-1) - 255))] ^ (i36 ^ iArr5[(b9 + 255) - (b9 | 255)]);
            i19 -= 4;
        }
        iArr2[i3] = iArr[i19];
        iArr2[i3 + 1] = iArr[i19 + 1];
        iArr2[i3 + 2] = iArr[i19 + 2];
        iArr2[i3 + 3] = iArr[i19 + 3];
        return iArr2;
    }
}
