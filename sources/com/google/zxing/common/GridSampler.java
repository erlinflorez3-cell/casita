package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GridSampler {
    private static GridSampler gridSampler = new DefaultGridSampler();

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static void checkAndNudgePoints(com.google.zxing.common.BitMatrix r11, float[] r12) throws com.google.zxing.NotFoundException {
        /*
            int r6 = r11.getWidth()
            int r5 = r11.getHeight()
            int r9 = r12.length
            r11 = 1
            int r9 = r9 - r11
            r10 = 0
            r0 = r11
            r4 = r10
        Le:
            r8 = 0
            r7 = -1
            if (r4 >= r9) goto L48
            if (r0 == 0) goto L48
            r0 = r12[r4]
            int r3 = (int) r0
            int r2 = r4 + 1
            r0 = r12[r2]
            int r1 = (int) r0
            if (r3 < r7) goto L43
            if (r3 > r6) goto L43
            if (r1 < r7) goto L43
            if (r1 > r5) goto L43
            if (r3 != r7) goto L39
            r12[r4] = r8
        L28:
            r0 = r11
        L29:
            if (r1 != r7) goto L31
            r12[r2] = r8
        L2d:
            r0 = r11
        L2e:
            int r4 = r4 + 2
            goto Le
        L31:
            if (r1 != r5) goto L2e
            int r0 = r5 + (-1)
            float r0 = (float) r0
            r12[r2] = r0
            goto L2d
        L39:
            if (r3 != r6) goto L41
            int r0 = r6 + (-1)
            float r0 = (float) r0
            r12[r4] = r0
            goto L28
        L41:
            r0 = r10
            goto L29
        L43:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r0
        L48:
            int r0 = r12.length
            int r4 = r0 + (-2)
            r0 = r11
        L4c:
            if (r4 < 0) goto L84
            if (r0 == 0) goto L84
            r0 = r12[r4]
            int r3 = (int) r0
            int r2 = r4 + 1
            r0 = r12[r2]
            int r1 = (int) r0
            if (r3 < r7) goto L7f
            if (r3 > r6) goto L7f
            if (r1 < r7) goto L7f
            if (r1 > r5) goto L7f
            if (r3 != r7) goto L75
            r12[r4] = r8
        L64:
            r0 = r11
        L65:
            if (r1 != r7) goto L6d
            r12[r2] = r8
        L69:
            r0 = r11
        L6a:
            int r4 = r4 + (-2)
            goto L4c
        L6d:
            if (r1 != r5) goto L6a
            int r0 = r5 + (-1)
            float r0 = (float) r0
            r12[r2] = r0
            goto L69
        L75:
            if (r3 != r6) goto L7d
            int r0 = r6 + (-1)
            float r0 = (float) r0
            r12[r4] = r0
            goto L64
        L7d:
            r0 = r10
            goto L65
        L7f:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.GridSampler.checkAndNudgePoints(com.google.zxing.common.BitMatrix, float[]):void");
    }

    public static GridSampler getInstance() {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler gridSampler2) {
        gridSampler = gridSampler2;
    }

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) throws NotFoundException;

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i2, int i3, PerspectiveTransform perspectiveTransform) throws NotFoundException;
}
