package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private static final EstimatedModuleComparator moduleComparator = new EstimatedModuleComparator();
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    private static final class EstimatedModuleComparator implements Serializable, Comparator<FinderPattern> {
        private EstimatedModuleComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new ArrayList();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    private static float centerFromEnd(int[] iArr, int i2) {
        return ((i2 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean crossCheckDiagonal(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i7 = 0;
        while (i2 >= i7 && i3 >= i7 && this.image.get(i3 - i7, i2 - i7)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i7++;
        }
        if (crossCheckStateCount[2] == 0) {
            return false;
        }
        while (i2 >= i7 && i3 >= i7 && !this.image.get(i3 - i7, i2 - i7)) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i7++;
        }
        if (crossCheckStateCount[1] == 0) {
            return false;
        }
        while (i2 >= i7 && i3 >= i7 && this.image.get(i3 - i7, i2 - i7)) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i7++;
        }
        if (crossCheckStateCount[0] == 0) {
            return false;
        }
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i8 = 1;
        while (true) {
            int i9 = i2 + i8;
            if (i9 >= height || (i6 = i3 + i8) >= width || !this.image.get(i6, i9)) {
                break;
            }
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i8++;
        }
        while (true) {
            int i10 = i2 + i8;
            if (i10 >= height || (i5 = i3 + i8) >= width || this.image.get(i5, i10)) {
                break;
            }
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i8++;
        }
        if (crossCheckStateCount[3] == 0) {
            return false;
        }
        while (true) {
            int i11 = i2 + i8;
            if (i11 >= height || (i4 = i3 + i8) >= width || !this.image.get(i4, i11)) {
                break;
            }
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i8++;
        }
        if (crossCheckStateCount[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(crossCheckStateCount);
    }

    private float crossCheckHorizontal(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i9 = i2;
        while (i9 >= 0 && bitMatrix.get(i9, i3)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i9--;
        }
        if (i9 < 0) {
            return Float.NaN;
        }
        while (i9 >= 0 && !bitMatrix.get(i9, i3)) {
            int i10 = crossCheckStateCount[1];
            if (i10 > i4) {
                break;
            }
            crossCheckStateCount[1] = i10 + 1;
            i9--;
        }
        if (i9 >= 0 && crossCheckStateCount[1] <= i4) {
            while (i9 >= 0 && bitMatrix.get(i9, i3) && (i8 = crossCheckStateCount[0]) <= i4) {
                crossCheckStateCount[0] = i8 + 1;
                i9--;
            }
            if (crossCheckStateCount[0] > i4) {
                return Float.NaN;
            }
            int i11 = i2 + 1;
            while (i11 < width && bitMatrix.get(i11, i3)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i11++;
            }
            if (i11 == width) {
                return Float.NaN;
            }
            while (i11 < width && !bitMatrix.get(i11, i3) && (i7 = crossCheckStateCount[3]) < i4) {
                crossCheckStateCount[3] = i7 + 1;
                i11++;
            }
            if (i11 != width && crossCheckStateCount[3] < i4) {
                while (i11 < width && bitMatrix.get(i11, i3) && (i6 = crossCheckStateCount[4]) < i4) {
                    crossCheckStateCount[4] = i6 + 1;
                    i11++;
                }
                int i12 = crossCheckStateCount[4];
                if (i12 < i4 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i12) - i5) * 5 < i5 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i11);
                }
            }
        }
        return Float.NaN;
    }

    private float crossCheckVertical(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i9 = i2;
        while (i9 >= 0 && bitMatrix.get(i3, i9)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i9--;
        }
        if (i9 < 0) {
            return Float.NaN;
        }
        while (i9 >= 0 && !bitMatrix.get(i3, i9)) {
            int i10 = crossCheckStateCount[1];
            if (i10 > i4) {
                break;
            }
            crossCheckStateCount[1] = i10 + 1;
            i9--;
        }
        if (i9 >= 0 && crossCheckStateCount[1] <= i4) {
            while (i9 >= 0 && bitMatrix.get(i3, i9) && (i8 = crossCheckStateCount[0]) <= i4) {
                crossCheckStateCount[0] = i8 + 1;
                i9--;
            }
            if (crossCheckStateCount[0] > i4) {
                return Float.NaN;
            }
            int i11 = i2 + 1;
            while (i11 < height && bitMatrix.get(i3, i11)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i11++;
            }
            if (i11 == height) {
                return Float.NaN;
            }
            while (i11 < height && !bitMatrix.get(i3, i11) && (i7 = crossCheckStateCount[3]) < i4) {
                crossCheckStateCount[3] = i7 + 1;
                i11++;
            }
            if (i11 != height && crossCheckStateCount[3] < i4) {
                while (i11 < height && bitMatrix.get(i3, i11) && (i6 = crossCheckStateCount[4]) < i4) {
                    crossCheckStateCount[4] = i6 + 1;
                    i11++;
                }
                int i12 = crossCheckStateCount[4];
                if (i12 < i4 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i12) - i5) * 5 < i5 * 2 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i11);
                }
            }
        }
        return Float.NaN;
    }

    protected static void doClearCounts(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    protected static void doShiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private int findRowSkip() {
        if (this.possibleCenters.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.possibleCenters) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.hasSkipped = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    protected static boolean foundPatternCross(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            i2 += i4;
        }
        if (i2 < 7) {
            return false;
        }
        float f2 = i2 / 7.0f;
        float f3 = f2 / 2.0f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    protected static boolean foundPatternDiagonal(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            i2 += i4;
        }
        if (i2 < 7) {
            return false;
        }
        float f2 = i2 / 7.0f;
        float f3 = f2 / 1.333f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    private int[] getCrossCheckStateCount() {
        doClearCounts(this.crossCheckStateCount);
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        int size = this.possibleCenters.size();
        float fAbs = 0.0f;
        int i2 = 0;
        float estimatedModuleSize = 0.0f;
        for (FinderPattern finderPattern : this.possibleCenters) {
            if (finderPattern.getCount() >= 2) {
                i2++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i2 < 3) {
            return false;
        }
        float f2 = estimatedModuleSize / size;
        Iterator<FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().getEstimatedModuleSize() - f2);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.zxing.qrcode.detector.FinderPattern[] selectBestPatterns() throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.selectBestPatterns():com.google.zxing.qrcode.detector.FinderPattern[]");
    }

    private static double squaredDistance(FinderPattern finderPattern, FinderPattern finderPattern2) {
        double x2 = finderPattern.getX() - finderPattern2.getX();
        double y2 = finderPattern.getY() - finderPattern2.getY();
        return (x2 * x2) + (y2 * y2);
    }

    @Deprecated
    protected final void clearCounts(int[] iArr) {
        doClearCounts(iArr);
    }

    final FinderPatternInfo find(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z2 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i2 = (height * 3) / 388;
        if (i2 < 3 || z2) {
            i2 = 3;
        }
        int[] iArr = new int[5];
        int i3 = i2 - 1;
        boolean zHaveMultiplyConfirmedCenters = false;
        while (i3 < height && !zHaveMultiplyConfirmedCenters) {
            doClearCounts(iArr);
            int i4 = 0;
            int i5 = 0;
            while (i4 < width) {
                if (this.image.get(i4, i3)) {
                    if ((i5 + 1) - (1 | i5) == 1) {
                        i5++;
                    }
                    iArr[i5] = iArr[i5] + 1;
                } else if ((1 & i5) != 0) {
                    iArr[i5] = iArr[i5] + 1;
                } else if (i5 != 4) {
                    i5++;
                    iArr[i5] = iArr[i5] + 1;
                } else if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i3, i4)) {
                    i2 = 2;
                    if (this.hasSkipped) {
                        zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                    } else {
                        int iFindRowSkip = findRowSkip();
                        int i6 = iArr[2];
                        if (iFindRowSkip > i6) {
                            i3 += (iFindRowSkip - i6) - 2;
                            i4 = width - 1;
                        }
                    }
                    doClearCounts(iArr);
                    i5 = 0;
                } else {
                    doShiftCounts2(iArr);
                    i5 = 3;
                }
                i4++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i3, width)) {
                i2 = iArr[0];
                if (this.hasSkipped) {
                    zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                }
            }
            i3 += i2;
        }
        FinderPattern[] finderPatternArrSelectBestPatterns = selectBestPatterns();
        ResultPoint.orderBestPatterns(finderPatternArrSelectBestPatterns);
        return new FinderPatternInfo(finderPatternArrSelectBestPatterns);
    }

    protected final BitMatrix getImage() {
        return this.image;
    }

    protected final List<FinderPattern> getPossibleCenters() {
        return this.possibleCenters;
    }

    protected final boolean handlePossibleCenter(int[] iArr, int i2, int i3) {
        int i4 = 0;
        int i5 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iCenterFromEnd = (int) centerFromEnd(iArr, i3);
        float fCrossCheckVertical = crossCheckVertical(i2, iCenterFromEnd, iArr[2], i5);
        if (!Float.isNaN(fCrossCheckVertical)) {
            int i6 = (int) fCrossCheckVertical;
            float fCrossCheckHorizontal = crossCheckHorizontal(iCenterFromEnd, i6, iArr[2], i5);
            if (!Float.isNaN(fCrossCheckHorizontal) && crossCheckDiagonal(i6, (int) fCrossCheckHorizontal)) {
                float f2 = i5 / 7.0f;
                while (true) {
                    if (i4 < this.possibleCenters.size()) {
                        FinderPattern finderPattern = this.possibleCenters.get(i4);
                        if (finderPattern.aboutEquals(f2, fCrossCheckVertical, fCrossCheckHorizontal)) {
                            this.possibleCenters.set(i4, finderPattern.combineEstimate(fCrossCheckVertical, fCrossCheckHorizontal, f2));
                            break;
                        }
                        i4++;
                    } else {
                        FinderPattern finderPattern2 = new FinderPattern(fCrossCheckHorizontal, fCrossCheckVertical, f2);
                        this.possibleCenters.add(finderPattern2);
                        ResultPointCallback resultPointCallback = this.resultPointCallback;
                        if (resultPointCallback != null) {
                            resultPointCallback.foundPossibleResultPoint(finderPattern2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    protected final boolean handlePossibleCenter(int[] iArr, int i2, int i3, boolean z2) {
        return handlePossibleCenter(iArr, i2, i3);
    }

    @Deprecated
    protected final void shiftCounts2(int[] iArr) {
        doShiftCounts2(iArr);
    }
}
