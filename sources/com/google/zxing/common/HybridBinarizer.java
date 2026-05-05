package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x00a8 A[PHI: r14
  0x00a8: PHI (r14v3 int) = (r14v2 int), (r14v5 int), (r14v5 int) binds: [B:87:0x007e, B:89:0x0082, B:90:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[][] calculateBlackPoints(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r2 = 8
            int r8 = r21 + (-8)
            int r7 = r20 + (-8)
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 1
            r10 = r18
            r1[r0] = r10
            r12 = 0
            r9 = r19
            r1[r12] = r9
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r0, r1)
            int[][] r6 = (int[][]) r6
            r5 = r12
        L1c:
            if (r5 >= r9) goto Lb1
            int r4 = r5 << 3
            if (r4 <= r8) goto L23
            r4 = r8
        L23:
            r3 = r12
        L24:
            if (r3 >= r10) goto Laa
            int r0 = r3 << 3
            if (r0 <= r7) goto L2b
            r0 = r7
        L2b:
            int r16 = r4 * r20
            int r16 = r16 + r0
            r15 = 255(0xff, float:3.57E-43)
            r14 = r12
            r1 = r14
            r11 = r15
        L34:
            if (r12 >= r2) goto L79
            r13 = 0
        L37:
            if (r13 >= r2) goto L50
            int r0 = r16 + r13
            r0 = r17[r0]
            int r2 = (-1) - r0
            int r0 = (-1) - r15
            r2 = r2 | r0
            int r0 = (-1) - r2
            int r14 = r14 + r0
            if (r0 >= r11) goto L48
            r11 = r0
        L48:
            if (r0 <= r1) goto L4b
            r1 = r0
        L4b:
            int r13 = r13 + 1
            r2 = 8
            goto L37
        L50:
            int r2 = r1 - r11
            r0 = 24
            if (r2 <= r0) goto L72
        L56:
            int r12 = r12 + 1
            int r16 = r16 + r20
            r0 = 8
            if (r12 >= r0) goto L72
            r2 = 0
        L5f:
            if (r2 >= r0) goto L56
            int r0 = r16 + r2
            r0 = r17[r0]
            int r13 = (-1) - r0
            int r0 = (-1) - r15
            r13 = r13 | r0
            int r0 = (-1) - r13
            int r14 = r14 + r0
            int r2 = r2 + 1
            r0 = 8
            goto L5f
        L72:
            r0 = 1
            int r12 = r12 + r0
            int r16 = r16 + r20
            r2 = 8
            goto L34
        L79:
            int r14 = r14 >> 6
            int r1 = r1 - r11
            r0 = 24
            if (r1 > r0) goto La8
            int r14 = r11 / 2
            if (r5 <= 0) goto La8
            if (r3 <= 0) goto La8
            int r0 = r5 + (-1)
            r13 = r6[r0]
            r12 = r13[r3]
            r0 = r6[r5]
            int r2 = r3 + (-1)
            r1 = r0[r2]
            r0 = 2
            int r1 = r1 * r0
            int r12 = r12 + r1
            r0 = r13[r2]
            int r12 = r12 + r0
            int r0 = r12 / 4
            if (r11 >= r0) goto L9d
            r14 = r0
        L9d:
            r0 = r6[r5]
            r0[r3] = r14
            int r3 = r3 + 1
            r2 = 8
            r12 = 0
            goto L24
        La8:
            r0 = 2
            goto L9d
        Laa:
            int r5 = r5 + 1
            r2 = 8
            r12 = 0
            goto L1c
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.HybridBinarizer.calculateBlackPoints(byte[], int, int, int, int):int[][]");
    }

    private static void calculateThresholdForBlock(byte[] bArr, int i2, int i3, int i4, int i5, int[][] iArr, BitMatrix bitMatrix) {
        int i6 = i5 - 8;
        int i7 = i4 - 8;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = i8 << 3;
            if (i9 > i6) {
                i9 = i6;
            }
            int iCap = cap(i8, i3 - 3);
            for (int i10 = 0; i10 < i2; i10++) {
                int i11 = i10 << 3;
                if (i11 > i7) {
                    i11 = i7;
                }
                int iCap2 = cap(i10, i2 - 3);
                int i12 = 0;
                for (int i13 = -2; i13 <= 2; i13++) {
                    int[] iArr2 = iArr[iCap + i13];
                    i12 += iArr2[iCap2 - 2] + iArr2[iCap2 - 1] + iArr2[iCap2] + iArr2[iCap2 + 1] + iArr2[2 + iCap2];
                }
                thresholdBlock(bArr, i11, i9, i12 / 25, i4, bitMatrix);
            }
        }
    }

    private static int cap(int i2, int i3) {
        if (i2 < 2) {
            return 2;
        }
        return Math.min(i2, i3);
    }

    private static void thresholdBlock(byte[] bArr, int i2, int i3, int i4, int i5, BitMatrix bitMatrix) {
        int i6 = (i3 * i5) + i2;
        int i7 = 0;
        while (i7 < 8) {
            for (int i8 = 0; i8 < 8; i8++) {
                if ((-1) - (((-1) - bArr[i6 + i8]) | ((-1) - 255)) <= i4) {
                    bitMatrix.set(i2 + i8, i3 + i7);
                }
            }
            i7++;
            i6 += i5;
        }
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        BitMatrix bitMatrix = this.matrix;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            this.matrix = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i2 = width >> 3;
            if ((7 & width) != 0) {
                i2++;
            }
            int i3 = height >> 3;
            if ((-1) - (((-1) - height) | ((-1) - 7)) != 0) {
                i3++;
            }
            int[][] iArrCalculateBlackPoints = calculateBlackPoints(matrix, i2, i3, width, height);
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            calculateThresholdForBlock(matrix, i2, i3, width, height, iArrCalculateBlackPoints, bitMatrix2);
            this.matrix = bitMatrix2;
        }
        return this.matrix;
    }
}
