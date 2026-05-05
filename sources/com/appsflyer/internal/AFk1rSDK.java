package com.appsflyer.internal;

import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1rSDK extends FilterInputStream {
    private static final short getMonetizationNetwork = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFAdRevenueData;
    private int AFInAppEventType;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private int getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private int toString;

    public AFk1rSDK(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4) throws IOException {
        this(inputStream, iArr, i2, bArr, i3, i4, (byte) 0);
    }

    private AFk1rSDK(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = Integer.MAX_VALUE;
        this.AFInAppEventType = 1;
        this.getMediationNetwork = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getRevenue = new byte[8];
        this.getCurrencyIso4217Code = 8;
        this.component4 = 8;
        this.component2 = Math.min(Math.max(i3, 5), 16);
        this.component1 = i4;
        if (i4 == 3) {
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, 8);
        }
        long j2 = (((long) iArr[0]) & 4294967295L) << 32;
        long j3 = iArr[1];
        long j4 = (j3 + 4294967295L) - (j3 | 4294967295L);
        long j5 = (j4 + j2) - (j4 & j2);
        if (i2 == 0) {
            this.areAllFieldsValid = (int) j5;
            long j6 = j5 >> 3;
            short s2 = getMonetizationNetwork;
            this.copy = (int) ((((long) s2) * j6) >> 32);
            this.toString = (int) (j5 >> 32);
            this.hashCode = (int) (j6 + ((long) s2));
        } else {
            int i5 = (int) j5;
            this.areAllFieldsValid = i5;
            this.copy = i5 * i2;
            this.toString = i2 ^ i5;
            this.hashCode = (int) (j5 >> 32);
        }
        this.equals = 100;
        this.copydefault = 100;
    }

    private void AFAdRevenueData() {
        if (this.component1 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getRevenue, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        int i2 = ((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((-1) - (((-1) - (bArr2[1] << 16)) | ((-1) - 16711680))) + ((-1) - (((-1) - (bArr2[2] << 8)) | ((-1) - 65280))) + (bArr2[3] & 255);
        int i3 = ((-1) - (((-1) - ViewCompat.MEASURED_STATE_MASK) | ((-1) - (bArr2[4] << Ascii.CAN)))) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + ((-1) - (((-1) - bArr2[7]) | ((-1) - 255)));
        int i4 = 0;
        while (true) {
            int i5 = this.component2;
            if (i4 >= i5) {
                break;
            }
            short s2 = getMonetizationNetwork;
            i3 -= ((((i5 - i4) * s2) + i2) ^ ((i2 << 4) + this.toString)) ^ ((i2 >>> 5) + this.hashCode);
            i2 -= (((i3 << 4) + this.areAllFieldsValid) ^ ((s2 * (i5 - i4)) + i3)) ^ ((i3 >>> 5) + this.copy);
            i4++;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i3 >> 24);
        bArr3[5] = (byte) (i3 >> 16);
        bArr3[6] = (byte) (i3 >> 8);
        bArr3[7] = (byte) i3;
        if (this.component1 == 3) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.AFAdRevenueData[i6]);
            }
            byte[] bArr5 = this.getRevenue;
            System.arraycopy(bArr5, 0, this.AFAdRevenueData, 0, bArr5.length);
        }
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.getCurrencyIso4217Code == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i2 = this.component3;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i3, 8 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 8);
            if (i3 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.equals;
            if (i5 == this.copydefault) {
                AFAdRevenueData();
            } else {
                if (this.AFInAppEventType <= i5) {
                    AFAdRevenueData();
                }
                int i6 = this.AFInAppEventType;
                if (i6 < this.copydefault) {
                    this.AFInAppEventType = i6 + 1;
                } else {
                    this.AFInAppEventType = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.component3 = i7;
            this.getCurrencyIso4217Code = 0;
            this.component4 = i7 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMonetizationNetwork();
        return this.component4 - this.getCurrencyIso4217Code;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i2 = this.getCurrencyIso4217Code;
        if (i2 >= this.component4) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getCurrencyIso4217Code = i2 + 1;
        return (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            getMonetizationNetwork();
            int i6 = this.getCurrencyIso4217Code;
            if (i6 >= this.component4) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getCurrencyIso4217Code = i6 + 1;
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
