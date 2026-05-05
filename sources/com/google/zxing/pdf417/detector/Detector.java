package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] INDEXES_START_PATTERN = {0, 4, 1, 5};
    private static final int[] INDEXES_STOP_PATTERN = {6, 2, 7, 3};
    private static final int[] START_PATTERN = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] STOP_PATTERN = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private Detector() {
    }

    private static void copyToResult(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            resultPointArr[iArr[i2]] = resultPointArr2[i2];
        }
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z2) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        List<ResultPoint[]> listDetect = detect(z2, blackMatrix);
        if (listDetect.isEmpty()) {
            blackMatrix = blackMatrix.m7800clone();
            blackMatrix.rotate180();
            listDetect = detect(z2, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, listDetect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r4 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r4.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r2 = (com.google.zxing.ResultPoint[]) r4.next();
        r0 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r1 = (int) java.lang.Math.max(r1, r0.getY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r0 = r2[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r1 = java.lang.Math.max(r1, (int) r0.getY());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.google.zxing.ResultPoint[]> detect(boolean r9, com.google.zxing.common.BitMatrix r10) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8 = 0
            r1 = r8
            r2 = r1
        L8:
            r7 = r2
        L9:
            int r0 = r10.getHeight()
            if (r1 >= r0) goto L76
            com.google.zxing.ResultPoint[] r4 = findVertices(r10, r1, r2)
            r0 = r4[r8]
            r6 = 1
            if (r0 != 0) goto L4f
            r5 = 3
            r0 = r4[r5]
            if (r0 != 0) goto L4f
            if (r7 == 0) goto L76
            java.util.Iterator r4 = r3.iterator()
        L23:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r4.next()
            com.google.zxing.ResultPoint[] r2 = (com.google.zxing.ResultPoint[]) r2
            r0 = r2[r6]
            if (r0 == 0) goto L3d
            float r1 = (float) r1
            float r0 = r0.getY()
            float r0 = java.lang.Math.max(r1, r0)
            int r1 = (int) r0
        L3d:
            r0 = r2[r5]
            if (r0 == 0) goto L23
            float r0 = r0.getY()
            int r0 = (int) r0
            int r1 = java.lang.Math.max(r1, r0)
            goto L23
        L4b:
            int r1 = r1 + 5
            r2 = r8
            goto L8
        L4f:
            r3.add(r4)
            if (r9 == 0) goto L76
            r1 = 2
            r0 = r4[r1]
            if (r0 == 0) goto L67
            float r0 = r0.getX()
            int r2 = (int) r0
            r0 = r4[r1]
            float r0 = r0.getY()
        L64:
            int r1 = (int) r0
            r7 = r6
            goto L9
        L67:
            r1 = 4
            r0 = r4[r1]
            float r0 = r0.getX()
            int r2 = (int) r0
            r0 = r4[r1]
            float r0 = r0.getY()
            goto L64
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.detector.Detector.detect(boolean, com.google.zxing.common.BitMatrix):java.util.List");
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (bitMatrix.get(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        int i7 = i2;
        int i8 = 0;
        boolean z2 = false;
        while (i2 < i4) {
            if (bitMatrix.get(i2, i3) != z2) {
                iArr2[i8] = iArr2[i8] + 1;
            } else {
                if (i8 != length - 1) {
                    i8++;
                } else {
                    if (patternMatchVariance(iArr2, iArr) < MAX_AVG_VARIANCE) {
                        return new int[]{i7, i2};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = i8 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i8--;
                }
                iArr2[i8] = 1;
                z2 = !z2;
            }
            i2++;
        }
        if (i8 != length - 1 || patternMatchVariance(iArr2, iArr) >= MAX_AVG_VARIANCE) {
            return null;
        }
        return new int[]{i7, i2 - 1};
    }

    private static ResultPoint[] findRowsWithPattern(BitMatrix bitMatrix, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z2;
        int i6 = i4;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        while (true) {
            if (i6 >= i2) {
                z2 = false;
                break;
            }
            int[] iArrFindGuardPattern = findGuardPattern(bitMatrix, i5, i6, i3, iArr, iArr2);
            if (iArrFindGuardPattern != null) {
                while (i6 > 0) {
                    int i7 = i6 - 1;
                    int[] iArrFindGuardPattern2 = findGuardPattern(bitMatrix, i5, i7, i3, iArr, iArr2);
                    if (iArrFindGuardPattern2 == null) {
                        break;
                    }
                    iArrFindGuardPattern = iArrFindGuardPattern2;
                    i6 = i7;
                }
                float f2 = i6;
                resultPointArr[0] = new ResultPoint(iArrFindGuardPattern[0], f2);
                resultPointArr[1] = new ResultPoint(iArrFindGuardPattern[1], f2);
                z2 = true;
            } else {
                i6 += 5;
            }
        }
        int i8 = i6 + 1;
        if (z2) {
            int[] iArr3 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i9 = 0;
            while (i8 < i2) {
                int[] iArrFindGuardPattern3 = findGuardPattern(bitMatrix, iArr3[0], i8, i3, iArr, iArr2);
                if (iArrFindGuardPattern3 != null && Math.abs(iArr3[0] - iArrFindGuardPattern3[0]) < 5 && Math.abs(iArr3[1] - iArrFindGuardPattern3[1]) < 5) {
                    iArr3 = iArrFindGuardPattern3;
                    i9 = 0;
                } else {
                    if (i9 > 25) {
                        break;
                    }
                    i9++;
                }
                i8++;
            }
            i8 -= i9 + 1;
            float f3 = i8;
            resultPointArr[2] = new ResultPoint(iArr3[0], f3);
            resultPointArr[3] = new ResultPoint(iArr3[1], f3);
        }
        if (i8 - i6 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    private static ResultPoint[] findVertices(BitMatrix bitMatrix, int i2, int i3) {
        int y2 = i2;
        int x2 = i3;
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, y2, x2, START_PATTERN), INDEXES_START_PATTERN);
        ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            x2 = (int) resultPoint.getX();
            y2 = (int) resultPointArr[4].getY();
        }
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, y2, x2, STOP_PATTERN), INDEXES_STOP_PATTERN);
        return resultPointArr;
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i2;
        float f3 = f2 / i3;
        float f4 = 0.8f * f3;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            float f6 = iArr2[i5] * f3;
            float f7 = iArr[i5];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
