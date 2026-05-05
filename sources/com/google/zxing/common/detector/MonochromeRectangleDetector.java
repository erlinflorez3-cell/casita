package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x002a A[EDGE_INSN: B:68:0x002a->B:19:0x002a BREAK  A[LOOP:1: B:13:0x001c->B:71:0x001c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057 A[EDGE_INSN: B:84:0x0057->B:39:0x0057 BREAK  A[LOOP:3: B:33:0x0049->B:89:0x0049], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] blackWhiteRange(int r5, int r6, int r7, int r8, boolean r9) {
        /*
            r4 = this;
            int r0 = r7 + r8
            int r3 = r0 / 2
            r2 = r3
        L5:
            if (r2 < r7) goto L30
            com.google.zxing.common.BitMatrix r0 = r4.image
            if (r9 == 0) goto L14
            boolean r0 = r0.get(r2, r5)
            if (r0 == 0) goto L1b
        L11:
            int r2 = r2 + (-1)
            goto L5
        L14:
            boolean r0 = r0.get(r5, r2)
            if (r0 == 0) goto L1b
            goto L11
        L1b:
            r1 = r2
        L1c:
            int r1 = r1 + (-1)
            if (r1 < r7) goto L2a
            com.google.zxing.common.BitMatrix r0 = r4.image
            if (r9 == 0) goto L6f
            boolean r0 = r0.get(r1, r5)
            if (r0 == 0) goto L1c
        L2a:
            int r0 = r2 - r1
            if (r1 < r7) goto L30
            if (r0 <= r6) goto L76
        L30:
            int r2 = r2 + 1
        L32:
            if (r3 >= r8) goto L5d
            com.google.zxing.common.BitMatrix r0 = r4.image
            if (r9 == 0) goto L41
            boolean r0 = r0.get(r3, r5)
            if (r0 == 0) goto L48
        L3e:
            int r3 = r3 + 1
            goto L32
        L41:
            boolean r0 = r0.get(r5, r3)
            if (r0 == 0) goto L48
            goto L3e
        L48:
            r1 = r3
        L49:
            int r1 = r1 + 1
            if (r1 >= r8) goto L57
            com.google.zxing.common.BitMatrix r0 = r4.image
            if (r9 == 0) goto L66
            boolean r0 = r0.get(r1, r5)
            if (r0 == 0) goto L49
        L57:
            int r0 = r1 - r3
            if (r1 >= r8) goto L5d
            if (r0 <= r6) goto L6d
        L5d:
            int r0 = r3 + (-1)
            if (r0 <= r2) goto L78
            int[] r0 = new int[]{r2, r0}
            return r0
        L66:
            boolean r0 = r0.get(r5, r1)
            if (r0 == 0) goto L49
            goto L57
        L6d:
            r3 = r1
            goto L32
        L6f:
            boolean r0 = r0.get(r5, r1)
            if (r0 == 0) goto L1c
            goto L2a
        L76:
            r2 = r1
            goto L5
        L78:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.detector.MonochromeRectangleDetector.blackWhiteRange(int, int, int, int, boolean):int[]");
    }

    private ResultPoint findCornerFromCenter(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) throws NotFoundException {
        int[] iArr = null;
        int i11 = i2;
        int i12 = i6;
        while (i12 < i9 && i12 >= i8 && i11 < i5 && i11 >= i4) {
            int[] iArrBlackWhiteRange = i3 == 0 ? blackWhiteRange(i12, i10, i4, i5, true) : blackWhiteRange(i11, i10, i8, i9, false);
            if (iArrBlackWhiteRange == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i3 == 0) {
                    int i13 = i12 - i7;
                    if (iArr[0] >= i2) {
                        return new ResultPoint(iArr[1], i13);
                    }
                    if (iArr[1] > i2) {
                        return new ResultPoint(iArr[i7 > 0 ? (char) 0 : (char) 1], i13);
                    }
                    return new ResultPoint(iArr[0], i13);
                }
                int i14 = i11 - i3;
                if (iArr[0] >= i6) {
                    return new ResultPoint(i14, iArr[1]);
                }
                if (iArr[1] > i6) {
                    return new ResultPoint(i14, iArr[i3 < 0 ? (char) 0 : (char) 1]);
                }
                return new ResultPoint(i14, iArr[0]);
            }
            i12 += i7;
            i11 += i3;
            iArr = iArrBlackWhiteRange;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i2 = height / 2;
        int i3 = width / 2;
        int iMax = Math.max(1, height / 256);
        int iMax2 = Math.max(1, width / 256);
        int i4 = -iMax;
        int i5 = i3 / 2;
        int y2 = ((int) findCornerFromCenter(i3, 0, 0, width, i2, i4, 0, height, i5).getY()) - 1;
        int i6 = i2 / 2;
        ResultPoint resultPointFindCornerFromCenter = findCornerFromCenter(i3, -iMax2, 0, width, i2, 0, y2, height, i6);
        int x2 = ((int) resultPointFindCornerFromCenter.getX()) - 1;
        ResultPoint resultPointFindCornerFromCenter2 = findCornerFromCenter(i3, iMax2, x2, width, i2, 0, y2, height, i6);
        int x3 = ((int) resultPointFindCornerFromCenter2.getX()) + 1;
        ResultPoint resultPointFindCornerFromCenter3 = findCornerFromCenter(i3, 0, x2, x3, i2, iMax, y2, height, i5);
        return new ResultPoint[]{findCornerFromCenter(i3, 0, x2, x3, i2, i4, y2, ((int) resultPointFindCornerFromCenter3.getY()) + 1, i3 / 4), resultPointFindCornerFromCenter, resultPointFindCornerFromCenter2, resultPointFindCornerFromCenter3};
    }
}
