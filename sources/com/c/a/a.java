package com.c.a;

import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f2723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f2724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f2726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f2727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2728k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2730o;

    public a(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z2, int i3) throws IOException {
        this(inputStream, iArr, bArr, i2, z2, i3, (byte) 0);
    }

    private a(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z2, int i3, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f2721d = 1;
        this.f2728k = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i2, 3), 16);
        this.f2719b = iMin;
        this.f2727j = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f2723f = bArr2;
        this.f2724g = new byte[8];
        this.f2726i = new int[2];
        this.f2725h = 8;
        this.f2729n = 8;
        this.f2730o = i3;
        if (i3 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f2718a = new b(iArr, iMin, true, z2);
        this.f2722e = 100;
        this.f2720c = 100;
    }

    private void a() {
        if (this.f2730o == 2) {
            byte[] bArr = this.f2727j;
            System.arraycopy(bArr, 0, this.f2724g, 0, bArr.length);
        }
        byte[] bArr2 = this.f2727j;
        int i2 = (-1) - (((-1) - (bArr2[0] << Ascii.CAN)) | ((-1) - ViewCompat.MEASURED_STATE_MASK));
        int i3 = bArr2[1] << 16;
        int i4 = i2 + ((i3 + 16711680) - (i3 | 16711680)) + ((-1) - (((-1) - (bArr2[2] << 8)) | ((-1) - 65280)));
        byte b2 = bArr2[3];
        c.a(i4 + ((b2 + 255) - (b2 | 255)), ((-1) - (((-1) - ViewCompat.MEASURED_STATE_MASK) | ((-1) - (bArr2[4] << Ascii.CAN)))) + ((-1) - (((-1) - 16711680) | ((-1) - (bArr2[5] << 16)))) + ((-1) - (((-1) - 65280) | ((-1) - (bArr2[6] << 8)))) + (bArr2[7] & 255), false, this.f2719b, this.f2718a.f2733d, this.f2718a.f2734e, this.f2726i);
        int[] iArr = this.f2726i;
        int i5 = iArr[0];
        int i6 = iArr[1];
        byte[] bArr3 = this.f2727j;
        bArr3[0] = (byte) (i5 >> 24);
        bArr3[1] = (byte) (i5 >> 16);
        bArr3[2] = (byte) (i5 >> 8);
        bArr3[3] = (byte) i5;
        bArr3[4] = (byte) (i6 >> 24);
        bArr3[5] = (byte) (i6 >> 16);
        bArr3[6] = (byte) (i6 >> 8);
        bArr3[7] = (byte) i6;
        if (this.f2730o == 2) {
            for (int i7 = 0; i7 < 8; i7++) {
                byte[] bArr4 = this.f2727j;
                bArr4[i7] = (byte) (bArr4[i7] ^ this.f2723f[i7]);
            }
            byte[] bArr5 = this.f2724g;
            System.arraycopy(bArr5, 0, this.f2723f, 0, bArr5.length);
        }
    }

    private int c() throws IOException {
        if (this.f2728k == Integer.MAX_VALUE) {
            this.f2728k = ((FilterInputStream) this).in.read();
        }
        if (this.f2725h == 8) {
            byte[] bArr = this.f2727j;
            int i2 = this.f2728k;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.f2727j, i3, 8 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 8);
            if (i3 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.f2722e;
            if (i5 == this.f2720c) {
                a();
            } else {
                if (this.f2721d <= i5) {
                    a();
                }
                int i6 = this.f2721d;
                if (i6 < this.f2720c) {
                    this.f2721d = i6 + 1;
                } else {
                    this.f2721d = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.f2728k = i7;
            this.f2725h = 0;
            this.f2729n = i7 < 0 ? 8 - (this.f2727j[7] & 255) : 8;
        }
        return this.f2729n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        c();
        return this.f2729n - this.f2725h;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        c();
        int i2 = this.f2725h;
        if (i2 >= this.f2729n) {
            return -1;
        }
        byte[] bArr = this.f2727j;
        this.f2725h = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            c();
            int i6 = this.f2725h;
            if (i6 >= this.f2729n) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.f2727j;
            this.f2725h = i6 + 1;
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
