package com.journeyapps.barcodescanner;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public class RawImageData {
    private byte[] data;
    private int height;
    private int width;

    public RawImageData(byte[] bArr, int i2, int i3) {
        this.data = bArr;
        this.width = i2;
        this.height = i3;
    }

    public static byte[] rotate180(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        byte[] bArr2 = new byte[i4];
        int i5 = i4 - 1;
        for (int i6 = 0; i6 < i4; i6++) {
            bArr2[i5] = bArr[i6];
            i5--;
        }
        return bArr2;
    }

    public static byte[] rotateCCW(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        byte[] bArr2 = new byte[i4];
        int i5 = i4 - 1;
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = i3 - 1; i7 >= 0; i7--) {
                bArr2[i5] = bArr[(i7 * i2) + i6];
                i5--;
            }
        }
        return bArr2;
    }

    public static byte[] rotateCW(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i2 * i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = i3 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i2) + i5];
                i4++;
            }
        }
        return bArr2;
    }

    public RawImageData cropAndScale(Rect rect, int i2) {
        int iWidth = rect.width() / i2;
        int iHeight = rect.height() / i2;
        int i3 = rect.top;
        byte[] bArr = new byte[iWidth * iHeight];
        if (i2 == 1) {
            int i4 = (i3 * this.width) + rect.left;
            for (int i5 = 0; i5 < iHeight; i5++) {
                System.arraycopy(this.data, i4, bArr, i5 * iWidth, iWidth);
                i4 += this.width;
            }
        } else {
            int i6 = (i3 * this.width) + rect.left;
            for (int i7 = 0; i7 < iHeight; i7++) {
                int i8 = i7 * iWidth;
                int i9 = i6;
                for (int i10 = 0; i10 < iWidth; i10++) {
                    bArr[i8] = this.data[i9];
                    i9 += i2;
                    i8++;
                }
                i6 += this.width * i2;
            }
        }
        return new RawImageData(bArr, iWidth, iHeight);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public RawImageData rotateCameraPreview(int i2) {
        return i2 != 90 ? i2 != 180 ? i2 != 270 ? this : new RawImageData(rotateCCW(this.data, this.width, this.height), this.height, this.width) : new RawImageData(rotate180(this.data, this.width, this.height), this.width, this.height) : new RawImageData(rotateCW(this.data, this.width, this.height), this.height, this.width);
    }
}
