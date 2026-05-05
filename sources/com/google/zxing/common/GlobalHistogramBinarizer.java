package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public class GlobalHistogramBinarizer extends Binarizer {
    private static final byte[] EMPTY = new byte[0];
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int[] buckets;
    private byte[] luminances;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.luminances = EMPTY;
        this.buckets = new int[32];
    }

    private static int estimateBlackPoint(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            if (i6 > i2) {
                i4 = i5;
                i2 = i6;
            }
            if (i6 > i3) {
                i3 = i6;
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 - i4;
            int i11 = iArr[i9] * i10 * i10;
            if (i11 > i8) {
                i7 = i9;
                i8 = i11;
            }
        }
        if (i4 <= i7) {
            int i12 = i4;
            i4 = i7;
            i7 = i12;
        }
        if (i4 - i7 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i13 = i4 - 1;
        int i14 = -1;
        int i15 = i13;
        while (i13 > i7) {
            int i16 = i13 - i7;
            int i17 = i16 * i16 * (i4 - i13) * (i3 - iArr[i13]);
            if (i17 > i14) {
                i15 = i13;
                i14 = i17;
            }
            i13--;
        }
        return i15 << 3;
    }

    private void initArrays(int i2) {
        if (this.luminances.length < i2) {
            this.luminances = new byte[i2];
        }
        for (int i3 = 0; i3 < 32; i3++) {
            this.buckets[i3] = 0;
        }
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        initArrays(width);
        int[] iArr = this.buckets;
        for (int i2 = 1; i2 < 5; i2++) {
            byte[] row = luminanceSource.getRow((height * i2) / 5, this.luminances);
            int i3 = (width << 2) / 5;
            for (int i4 = width / 5; i4 < i3; i4++) {
                byte b2 = row[i4];
                int i5 = ((b2 + 255) - (b2 | 255)) >> 3;
                iArr[i5] = iArr[i5] + 1;
            }
        }
        int iEstimateBlackPoint = estimateBlackPoint(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i6 = 0; i6 < height; i6++) {
            int i7 = i6 * width;
            for (int i8 = 0; i8 < width; i8++) {
                if ((matrix[i7 + i8] & 255) < iEstimateBlackPoint) {
                    bitMatrix.set(i8, i6);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public BitArray getBlackRow(int i2, BitArray bitArray) throws NotFoundException {
        int i3;
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (bitArray == null || bitArray.getSize() < width) {
            bitArray = new BitArray(width);
        } else {
            bitArray.clear();
        }
        initArrays(width);
        byte[] row = luminanceSource.getRow(i2, this.luminances);
        int[] iArr = this.buckets;
        int i4 = 0;
        while (true) {
            i3 = 1;
            if (i4 >= width) {
                break;
            }
            byte b2 = row[i4];
            int i5 = ((b2 + 255) - (b2 | 255)) >> 3;
            iArr[i5] = iArr[i5] + 1;
            i4++;
        }
        int iEstimateBlackPoint = estimateBlackPoint(iArr);
        if (width < 3) {
            for (int i6 = 0; i6 < width; i6++) {
                byte b3 = row[i6];
                if ((b3 + 255) - (b3 | 255) < iEstimateBlackPoint) {
                    bitArray.set(i6);
                }
            }
        } else {
            byte b4 = row[0];
            int i7 = (b4 + 255) - (b4 | 255);
            int i8 = (-1) - (((-1) - row[1]) | ((-1) - 255));
            while (i3 < width - 1) {
                int i9 = i3 + 1;
                byte b5 = row[i9];
                int i10 = (b5 + 255) - (b5 | 255);
                if ((((i8 << 2) - i7) - i10) / 2 < iEstimateBlackPoint) {
                    bitArray.set(i3);
                }
                i7 = i8;
                i3 = i9;
                i8 = i10;
            }
        }
        return bitArray;
    }
}
