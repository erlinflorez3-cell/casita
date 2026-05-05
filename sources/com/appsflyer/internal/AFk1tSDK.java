package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1tSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private short component1;
    private int component2;
    private int component3;
    private long[] component4;
    private long[] getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private int getRevenue;
    private int toString;

    public AFk1tSDK(InputStream inputStream, int i2, int i3, short s2, int i4, int i5) throws IOException {
        this(inputStream, i2, i3, s2, i4, i5, (byte) 0);
    }

    private AFk1tSDK(InputStream inputStream, int i2, int i3, short s2, int i4, int i5, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.component3 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s2, 4), 8);
        this.getMonetizationNetwork = iMin;
        this.areAllFieldsValid = new byte[iMin];
        this.getCurrencyIso4217Code = new long[4];
        this.component4 = new long[4];
        this.component2 = iMin;
        this.toString = iMin;
        this.getCurrencyIso4217Code = AFk1sSDK.getCurrencyIso4217Code(i2 ^ i5, iMin ^ i5);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i3 ^ i5, i4 ^ i5);
        this.AFAdRevenueData = 100;
        this.getMediationNetwork = 100;
    }

    private int getCurrencyIso4217Code() throws IOException {
        int i2;
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i3 = this.component3;
            bArr[0] = (byte) i3;
            if (i3 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int i5 = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i4, this.getMonetizationNetwork - i4);
                if (i5 <= 0) {
                    break;
                }
                i4 += i5;
            } while (i4 < this.getMonetizationNetwork);
            if (i4 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i6 = this.AFAdRevenueData;
            if (i6 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getRevenue <= i6) {
                    getMonetizationNetwork();
                }
                int i7 = this.getRevenue;
                if (i7 < this.getMediationNetwork) {
                    this.getRevenue = i7 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i8 = ((FilterInputStream) this).in.read();
            this.component3 = i8;
            this.component2 = 0;
            if (i8 < 0) {
                int i9 = this.getMonetizationNetwork;
                byte b2 = this.areAllFieldsValid[i9 - 1];
                i2 = i9 - ((b2 + 255) - (b2 | 255));
            } else {
                i2 = this.getMonetizationNetwork;
            }
            this.toString = i2;
        }
        return this.toString;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.component4;
        short s2 = this.component1;
        long j2 = jArr[s2 % 4] * 2147483085;
        long j3 = jArr2[(s2 + 2) % 4];
        int i2 = (s2 + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j3) / 2147483647L;
        jArr[i2] = (j2 + j3) % 2147483647L;
        for (int i3 = 0; i3 < this.getMonetizationNetwork; i3++) {
            byte[] bArr = this.areAllFieldsValid;
            long j4 = bArr[i3];
            long j5 = this.getCurrencyIso4217Code[this.component1] >> (i3 << 3);
            bArr[i3] = (byte) (j4 ^ ((j5 + 255) - (j5 | 255)));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.toString - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i2 = this.component2;
        if (i2 >= this.toString) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component2 = i2 + 1;
        return (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            getCurrencyIso4217Code();
            int i6 = this.component2;
            if (i6 >= this.toString) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component2 = i6 + 1;
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
