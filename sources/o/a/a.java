package o.a;

import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f19899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f19901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f19902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[][] f19903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f19904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f19908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19909p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19910s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19894a = c.f19915e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f19898e = c.f19914d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19895b = c.f19911a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f19896c = c.f19913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f19897d = c.f19912b;

    public a(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i2, bArr, bArr2, (byte) 0);
    }

    private a(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.f19899f = new int[4];
        this.f19901h = new byte[16];
        this.f19904k = new byte[16];
        this.f19906m = 1;
        this.f19907n = Integer.MAX_VALUE;
        this.f19909p = 16;
        this.f19910s = 16;
        this.f19900g = i2;
        this.f19902i = c.d(bArr, i2);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            bArr3[i3] = new byte[bArr2[i3].length];
            int i4 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i3];
                if (i4 < bArr4.length) {
                    bArr3[i3][bArr4[i4]] = (byte) i4;
                    i4++;
                }
            }
        }
        this.f19903j = bArr3;
        this.f19905l = 100;
        this.f19908o = 100;
    }

    private void b(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f19899f;
        char c2 = 1;
        int i2 = (bArr[0] << Ascii.CAN) | (((-1) - (((-1) - bArr[1]) | ((-1) - 255))) << 16);
        byte b2 = bArr[2];
        int i3 = i2 | (((b2 + 255) - (b2 | 255)) << 8);
        int i4 = bArr[3] & 255;
        int i5 = (i3 + i4) - (i3 & i4);
        int[] iArr2 = this.f19902i;
        iArr[0] = i5 ^ iArr2[0];
        int i6 = 4;
        int i7 = bArr[4] << Ascii.CAN;
        byte b3 = bArr[5];
        iArr[1] = (((-1) - (((-1) - (i7 | (((b3 + 255) - (b3 | 255)) << 16))) & ((-1) - (((-1) - (((-1) - bArr[6]) | ((-1) - 255))) << 8)))) | (bArr[7] & 255)) ^ iArr2[1];
        int i8 = bArr[8] << Ascii.CAN;
        byte b4 = bArr[9];
        int i9 = i8 | (((b4 + 255) - (b4 | 255)) << 16);
        byte b5 = bArr[10];
        int i10 = (-1) - (((-1) - i9) & ((-1) - (((b5 + 255) - (b5 | 255)) << 8)));
        byte b6 = bArr[11];
        iArr[2] = ((-1) - (((-1) - i10) & ((-1) - ((b6 + 255) - (b6 | 255))))) ^ iArr2[2];
        int i11 = bArr[12] << Ascii.CAN;
        int i12 = (bArr[13] & 255) << 16;
        iArr[3] = iArr2[3] ^ ((-1) - (((-1) - ((-1) - (((-1) - ((i12 + i11) - (i12 & i11))) & ((-1) - (((-1) - (((-1) - bArr[14]) | ((-1) - 255))) << 8))))) & ((-1) - ((-1) - (((-1) - bArr[15]) | ((-1) - 255))))));
        int i13 = 1;
        while (i13 < this.f19900g) {
            int[] iArr3 = f19898e;
            int[] iArr4 = this.f19899f;
            byte[][] bArr3 = this.f19903j;
            byte[] bArr4 = bArr3[0];
            int i14 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = f19895b;
            byte[] bArr5 = bArr3[c2];
            int i15 = i14 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = f19896c;
            byte[] bArr6 = bArr3[2];
            int i16 = iArr6[(-1) - (((-1) - (iArr4[bArr6[0]] >>> 8)) | ((-1) - 255))] ^ i15;
            int[] iArr7 = f19897d;
            byte[] bArr7 = bArr3[3];
            int i17 = iArr4[bArr7[0]];
            int i18 = iArr7[(i17 + 255) - (i17 | 255)] ^ i16;
            int[] iArr8 = this.f19902i;
            int i19 = i18 ^ iArr8[i6];
            int i20 = ((iArr6[(iArr4[bArr6[c2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c2]] >>> 24] ^ iArr5[(iArr4[bArr5[c2]] >>> 16) & 255])) ^ iArr7[(-1) - (((-1) - iArr4[bArr7[c2]]) | ((-1) - 255))]) ^ iArr8[i6 + 1];
            int i21 = iArr3[iArr4[bArr4[2]] >>> 24];
            int i22 = iArr4[bArr5[2]] >>> 16;
            int i23 = (iArr5[(i22 + 255) - (i22 | 255)] ^ i21) ^ iArr6[(-1) - (((-1) - (iArr4[bArr6[2]] >>> 8)) | ((-1) - 255))];
            int i24 = iArr4[bArr7[2]];
            int i25 = (i23 ^ iArr7[(i24 + 255) - (i24 | 255)]) ^ iArr8[i6 + 2];
            int i26 = iArr3[iArr4[bArr4[3]] >>> 24];
            int i27 = iArr4[bArr5[3]] >>> 16;
            int i28 = (((i26 ^ iArr5[(i27 + 255) - (i27 | 255)]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[(-1) - (((-1) - iArr4[bArr7[3]]) | ((-1) - 255))]) ^ iArr8[i6 + 3];
            iArr4[0] = i19;
            iArr4[1] = i20;
            iArr4[2] = i25;
            iArr4[3] = i28;
            i13++;
            i6 += 4;
            c2 = 1;
        }
        int[] iArr9 = this.f19902i;
        int i29 = iArr9[i6];
        byte[] bArr8 = f19894a;
        int[] iArr10 = this.f19899f;
        byte[][] bArr9 = this.f19903j;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i29 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i29 >>> 16));
        byte[] bArr12 = bArr9[2];
        int i30 = iArr10[bArr12[0]] >>> 8;
        bArr2[2] = (byte) (bArr8[(i30 + 255) - (i30 | 255)] ^ (i29 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i29);
        int i31 = iArr9[i6 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i31 >>> 24));
        bArr2[5] = (byte) (bArr8[(-1) - (((-1) - (iArr10[bArr11[1]] >>> 16)) | ((-1) - 255))] ^ (i31 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i31 >>> 8));
        bArr2[7] = (byte) (i31 ^ bArr8[(-1) - (((-1) - iArr10[bArr13[1]]) | ((-1) - 255))]);
        int i32 = iArr9[i6 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i32 >>> 24));
        int i33 = iArr10[bArr11[2]] >>> 16;
        bArr2[9] = (byte) (bArr8[(i33 + 255) - (i33 | 255)] ^ (i32 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i32 >>> 8));
        bArr2[11] = (byte) (i32 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i34 = iArr9[i6 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i34 >>> 24));
        int i35 = iArr10[bArr11[3]] >>> 16;
        bArr2[13] = (byte) (bArr8[(i35 + 255) - (i35 | 255)] ^ (i34 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i34 >>> 8));
        int i36 = iArr10[bArr13[3]];
        bArr2[15] = (byte) (i34 ^ bArr8[(i36 + 255) - (i36 | 255)]);
    }

    private int d() throws IOException {
        if (this.f19907n == Integer.MAX_VALUE) {
            this.f19907n = ((FilterInputStream) this).in.read();
        }
        int i2 = 16;
        if (this.f19909p == 16) {
            byte[] bArr = this.f19901h;
            int i3 = this.f19907n;
            bArr[0] = (byte) i3;
            if (i3 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int i5 = ((FilterInputStream) this).in.read(this.f19901h, i4, 16 - i4);
                if (i5 <= 0) {
                    break;
                }
                i4 += i5;
            } while (i4 < 16);
            if (i4 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i6 = this.f19905l;
            if (i6 == this.f19908o) {
                b(this.f19901h, this.f19904k);
            } else {
                if (this.f19906m <= i6) {
                    b(this.f19901h, this.f19904k);
                } else {
                    byte[] bArr2 = this.f19901h;
                    System.arraycopy(bArr2, 0, this.f19904k, 0, bArr2.length);
                }
                int i7 = this.f19906m;
                if (i7 < this.f19908o) {
                    this.f19906m = i7 + 1;
                } else {
                    this.f19906m = 1;
                }
            }
            int i8 = ((FilterInputStream) this).in.read();
            this.f19907n = i8;
            this.f19909p = 0;
            if (i8 < 0) {
                byte b2 = this.f19904k[15];
                i2 = 16 - ((b2 + 255) - (b2 | 255));
            }
            this.f19910s = i2;
        }
        return this.f19910s;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        d();
        return this.f19910s - this.f19909p;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        d();
        int i2 = this.f19909p;
        if (i2 >= this.f19910s) {
            return -1;
        }
        byte[] bArr = this.f19904k;
        this.f19909p = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            d();
            int i6 = this.f19909p;
            if (i6 >= this.f19910s) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.f19904k;
            this.f19909p = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        return j3;
    }
}
