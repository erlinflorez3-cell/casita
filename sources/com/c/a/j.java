package com.c.a;

import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final short f2756a = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f2757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f2758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f2759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f2769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2770o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2771q;

    public j(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4) throws IOException {
        this(inputStream, iArr, i2, bArr, i3, i4, (byte) 0);
    }

    private j(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f2762g = Integer.MAX_VALUE;
        this.f2771q = 1;
        this.f2757b = new byte[8];
        this.f2758c = new byte[8];
        this.f2759d = new byte[8];
        this.f2760e = 8;
        this.f2761f = 8;
        this.f2765j = Math.min(Math.max(i3, 5), 16);
        this.f2763h = i4;
        if (i4 == 3) {
            System.arraycopy(bArr, 0, this.f2758c, 0, 8);
        }
        long j2 = iArr[0];
        long j3 = ((j2 + 4294967295L) - (j2 | 4294967295L)) << 32;
        long j4 = iArr[1];
        long j5 = (j4 + 4294967295L) - (j4 | 4294967295L);
        long j6 = (j5 + j3) - (j5 & j3);
        if (i2 == 0) {
            this.f2764i = (int) j6;
            long j7 = j6 >> 3;
            short s2 = f2756a;
            this.f2770o = (int) ((((long) s2) * j7) >> 32);
            this.f2766k = (int) (j6 >> 32);
            this.f2767l = (int) (j7 + ((long) s2));
        } else {
            int i5 = (int) j6;
            this.f2764i = i5;
            this.f2770o = i5 * i2;
            this.f2766k = i2 ^ i5;
            this.f2767l = (int) (j6 >> 32);
        }
        this.f2768m = 100;
        this.f2769n = 100;
    }

    private void a() {
        if (this.f2763h == 3) {
            byte[] bArr = this.f2757b;
            System.arraycopy(bArr, 0, this.f2759d, 0, bArr.length);
        }
        byte[] bArr2 = this.f2757b;
        int i2 = ((-1) - (((-1) - (bArr2[0] << Ascii.CAN)) | ((-1) - ViewCompat.MEASURED_STATE_MASK))) + ((-1) - (((-1) - (bArr2[1] << 16)) | ((-1) - 16711680))) + ((-1) - (((-1) - (bArr2[2] << 8)) | ((-1) - 65280))) + ((-1) - (((-1) - bArr2[3]) | ((-1) - 255)));
        int i3 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + ((-1) - (((-1) - 16711680) | ((-1) - (bArr2[5] << 16))));
        int i4 = bArr2[6] << 8;
        int i5 = i3 + ((65280 + i4) - (65280 | i4)) + ((-1) - (((-1) - bArr2[7]) | ((-1) - 255)));
        int i6 = 0;
        while (true) {
            int i7 = this.f2765j;
            if (i6 >= i7) {
                break;
            }
            short s2 = f2756a;
            i5 -= ((((i7 - i6) * s2) + i2) ^ ((i2 << 4) + this.f2766k)) ^ ((i2 >>> 5) + this.f2767l);
            i2 -= (((i5 << 4) + this.f2764i) ^ ((s2 * (i7 - i6)) + i5)) ^ ((i5 >>> 5) + this.f2770o);
            i6++;
        }
        byte[] bArr3 = this.f2757b;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.f2763h == 3) {
            for (int i8 = 0; i8 < 8; i8++) {
                byte[] bArr4 = this.f2757b;
                bArr4[i8] = (byte) (bArr4[i8] ^ this.f2758c[i8]);
            }
            byte[] bArr5 = this.f2759d;
            System.arraycopy(bArr5, 0, this.f2758c, 0, bArr5.length);
        }
    }

    private int d() throws IOException {
        if (this.f2762g == Integer.MAX_VALUE) {
            this.f2762g = ((FilterInputStream) this).in.read();
        }
        int i2 = 8;
        if (this.f2760e == 8) {
            byte[] bArr = this.f2757b;
            int i3 = this.f2762g;
            bArr[0] = (byte) i3;
            if (i3 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int i5 = ((FilterInputStream) this).in.read(this.f2757b, i4, 8 - i4);
                if (i5 <= 0) {
                    break;
                }
                i4 += i5;
            } while (i4 < 8);
            if (i4 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i6 = this.f2768m;
            if (i6 == this.f2769n) {
                a();
            } else {
                if (this.f2771q <= i6) {
                    a();
                }
                int i7 = this.f2771q;
                if (i7 < this.f2769n) {
                    this.f2771q = i7 + 1;
                } else {
                    this.f2771q = 1;
                }
            }
            int i8 = ((FilterInputStream) this).in.read();
            this.f2762g = i8;
            this.f2760e = 0;
            if (i8 < 0) {
                byte b2 = this.f2757b[7];
                i2 = 8 - ((b2 + 255) - (b2 | 255));
            }
            this.f2761f = i2;
        }
        return this.f2761f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        d();
        return this.f2761f - this.f2760e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        d();
        int i2 = this.f2760e;
        if (i2 >= this.f2761f) {
            return -1;
        }
        byte[] bArr = this.f2757b;
        this.f2760e = i2 + 1;
        return (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            d();
            int i6 = this.f2760e;
            if (i6 >= this.f2761f) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.f2757b;
            this.f2760e = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
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
