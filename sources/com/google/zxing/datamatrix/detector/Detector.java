package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.WhiteRectangleDetector;

/* JADX INFO: loaded from: classes7.dex */
public final class Detector {
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.image = bitMatrix;
        this.rectangleDetector = new WhiteRectangleDetector(bitMatrix);
    }

    private ResultPoint correctTopRight(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[2];
        ResultPoint resultPoint4 = resultPointArr[3];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        ResultPoint resultPointShiftPoint = shiftPoint(resultPoint, resultPoint2, (transitionsBetween(resultPoint2, resultPoint4) + 1) << 2);
        ResultPoint resultPointShiftPoint2 = shiftPoint(resultPoint3, resultPoint2, (iTransitionsBetween + 1) << 2);
        int iTransitionsBetween2 = transitionsBetween(resultPointShiftPoint, resultPoint4);
        int iTransitionsBetween3 = transitionsBetween(resultPointShiftPoint2, resultPoint4);
        float f2 = iTransitionsBetween2 + 1;
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + ((resultPoint3.getX() - resultPoint2.getX()) / f2), resultPoint4.getY() + ((resultPoint3.getY() - resultPoint2.getY()) / f2));
        float f3 = iTransitionsBetween3 + 1;
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + ((resultPoint.getX() - resultPoint2.getX()) / f3), resultPoint4.getY() + ((resultPoint.getY() - resultPoint2.getY()) / f3));
        if (isValid(resultPoint5)) {
            return (isValid(resultPoint6) && transitionsBetween(resultPointShiftPoint, resultPoint5) + transitionsBetween(resultPointShiftPoint2, resultPoint5) <= transitionsBetween(resultPointShiftPoint, resultPoint6) + transitionsBetween(resultPointShiftPoint2, resultPoint6)) ? resultPoint6 : resultPoint5;
        }
        if (isValid(resultPoint6)) {
            return resultPoint6;
        }
        return null;
    }

    private ResultPoint[] detectSolid1(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[3];
        ResultPoint resultPoint4 = resultPointArr[2];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint2);
        int iTransitionsBetween2 = transitionsBetween(resultPoint2, resultPoint3);
        int iTransitionsBetween3 = transitionsBetween(resultPoint3, resultPoint4);
        int iTransitionsBetween4 = transitionsBetween(resultPoint4, resultPoint);
        ResultPoint[] resultPointArr2 = {resultPoint4, resultPoint, resultPoint2, resultPoint3};
        if (iTransitionsBetween > iTransitionsBetween2) {
            resultPointArr2[0] = resultPoint;
            resultPointArr2[1] = resultPoint2;
            resultPointArr2[2] = resultPoint3;
            resultPointArr2[3] = resultPoint4;
            iTransitionsBetween = iTransitionsBetween2;
        }
        if (iTransitionsBetween > iTransitionsBetween3) {
            resultPointArr2[0] = resultPoint2;
            resultPointArr2[1] = resultPoint3;
            resultPointArr2[2] = resultPoint4;
            resultPointArr2[3] = resultPoint;
        } else {
            iTransitionsBetween3 = iTransitionsBetween;
        }
        if (iTransitionsBetween3 > iTransitionsBetween4) {
            resultPointArr2[0] = resultPoint3;
            resultPointArr2[1] = resultPoint4;
            resultPointArr2[2] = resultPoint;
            resultPointArr2[3] = resultPoint2;
        }
        return resultPointArr2;
    }

    private ResultPoint[] detectSolid2(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[2];
        ResultPoint resultPoint4 = resultPointArr[3];
        int iTransitionsBetween = (transitionsBetween(resultPoint, resultPoint4) + 1) << 2;
        if (transitionsBetween(shiftPoint(resultPoint2, resultPoint3, iTransitionsBetween), resultPoint) < transitionsBetween(shiftPoint(resultPoint3, resultPoint2, iTransitionsBetween), resultPoint4)) {
            resultPointArr[0] = resultPoint;
            resultPointArr[1] = resultPoint2;
            resultPointArr[2] = resultPoint3;
            resultPointArr[3] = resultPoint4;
        } else {
            resultPointArr[0] = resultPoint2;
            resultPointArr[1] = resultPoint3;
            resultPointArr[2] = resultPoint4;
            resultPointArr[3] = resultPoint;
        }
        return resultPointArr;
    }

    private boolean isValid(ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() < ((float) this.image.getWidth()) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) this.image.getHeight());
    }

    private static ResultPoint moveAway(ResultPoint resultPoint, float f2, float f3) {
        float x2 = resultPoint.getX();
        float y2 = resultPoint.getY();
        return new ResultPoint(x2 < f2 ? x2 - 1.0f : x2 + 1.0f, y2 < f3 ? y2 - 1.0f : y2 + 1.0f);
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i2, int i3) throws NotFoundException {
        float f2 = i2 - 0.5f;
        float f3 = i3 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i2, i3, 0.5f, 0.5f, f2, 0.5f, f2, f3, 0.5f, f3, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private static ResultPoint shiftPoint(ResultPoint resultPoint, ResultPoint resultPoint2, int i2) {
        float f2 = i2 + 1;
        return new ResultPoint(resultPoint.getX() + ((resultPoint2.getX() - resultPoint.getX()) / f2), resultPoint.getY() + ((resultPoint2.getY() - resultPoint.getY()) / f2));
    }

    private ResultPoint[] shiftToModuleCenter(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[2];
        ResultPoint resultPoint4 = resultPointArr[3];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint4) + 1;
        ResultPoint resultPointShiftPoint = shiftPoint(resultPoint, resultPoint2, (transitionsBetween(resultPoint3, resultPoint4) + 1) << 2);
        ResultPoint resultPointShiftPoint2 = shiftPoint(resultPoint3, resultPoint2, iTransitionsBetween << 2);
        int iTransitionsBetween2 = transitionsBetween(resultPointShiftPoint, resultPoint4);
        int i2 = iTransitionsBetween2 + 1;
        int iTransitionsBetween3 = transitionsBetween(resultPointShiftPoint2, resultPoint4);
        int i3 = iTransitionsBetween3 + 1;
        if ((i2 + 1) - (1 | i2) == 1) {
            i2 = iTransitionsBetween2 + 2;
        }
        if ((1 & i3) == 1) {
            i3 = iTransitionsBetween3 + 2;
        }
        float x2 = (((resultPoint.getX() + resultPoint2.getX()) + resultPoint3.getX()) + resultPoint4.getX()) / 4.0f;
        float y2 = (((resultPoint.getY() + resultPoint2.getY()) + resultPoint3.getY()) + resultPoint4.getY()) / 4.0f;
        ResultPoint resultPointMoveAway = moveAway(resultPoint, x2, y2);
        ResultPoint resultPointMoveAway2 = moveAway(resultPoint2, x2, y2);
        ResultPoint resultPointMoveAway3 = moveAway(resultPoint3, x2, y2);
        ResultPoint resultPointMoveAway4 = moveAway(resultPoint4, x2, y2);
        int i4 = i3 << 2;
        int i5 = i2 << 2;
        return new ResultPoint[]{shiftPoint(shiftPoint(resultPointMoveAway, resultPointMoveAway2, i4), resultPointMoveAway4, i5), shiftPoint(shiftPoint(resultPointMoveAway2, resultPointMoveAway, i4), resultPointMoveAway3, i5), shiftPoint(shiftPoint(resultPointMoveAway3, resultPointMoveAway4, i4), resultPointMoveAway2, i5), shiftPoint(shiftPoint(resultPointMoveAway4, resultPointMoveAway3, i4), resultPointMoveAway, i5)};
    }

    private int transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x2 = (int) resultPoint.getX();
        int y2 = (int) resultPoint.getY();
        int x3 = (int) resultPoint2.getX();
        int y3 = (int) resultPoint2.getY();
        int i2 = 0;
        boolean z2 = Math.abs(y3 - y2) > Math.abs(x3 - x2);
        if (z2) {
            y2 = x2;
            x2 = y2;
            y3 = x3;
            x3 = y3;
        }
        int iAbs = Math.abs(x3 - x2);
        int iAbs2 = Math.abs(y3 - y2);
        int i3 = (-iAbs) / 2;
        int i4 = y2 < y3 ? 1 : -1;
        int i5 = x2 >= x3 ? -1 : 1;
        boolean z3 = this.image.get(z2 ? y2 : x2, z2 ? x2 : y2);
        while (x2 != x3) {
            boolean z4 = this.image.get(z2 ? y2 : x2, z2 ? x2 : y2);
            if (z4 != z3) {
                i2++;
                z3 = z4;
            }
            i3 += iAbs2;
            if (i3 > 0) {
                if (y2 == y3) {
                    break;
                }
                y2 += i4;
                i3 -= iAbs;
            }
            x2 += i5;
        }
        return i2;
    }

    public DetectorResult detect() throws NotFoundException {
        ResultPoint[] resultPointArrDetectSolid2 = detectSolid2(detectSolid1(this.rectangleDetector.detect()));
        ResultPoint resultPointCorrectTopRight = correctTopRight(resultPointArrDetectSolid2);
        resultPointArrDetectSolid2[3] = resultPointCorrectTopRight;
        if (resultPointCorrectTopRight == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint[] resultPointArrShiftToModuleCenter = shiftToModuleCenter(resultPointArrDetectSolid2);
        ResultPoint resultPoint = resultPointArrShiftToModuleCenter[0];
        ResultPoint resultPoint2 = resultPointArrShiftToModuleCenter[1];
        ResultPoint resultPoint3 = resultPointArrShiftToModuleCenter[2];
        ResultPoint resultPoint4 = resultPointArrShiftToModuleCenter[3];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        int iMax = iTransitionsBetween + 1;
        int iTransitionsBetween2 = transitionsBetween(resultPoint3, resultPoint4);
        int i2 = iTransitionsBetween2 + 1;
        if ((1 & iMax) == 1) {
            iMax = iTransitionsBetween + 2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) == 1) {
            i2 = iTransitionsBetween2 + 2;
        }
        if (iMax * 4 < i2 * 7 && i2 * 4 < iMax * 7) {
            iMax = Math.max(iMax, i2);
            i2 = iMax;
        }
        return new DetectorResult(sampleGrid(this.image, resultPoint, resultPoint2, resultPoint3, resultPoint4, iMax, i2), new ResultPoint[]{resultPoint, resultPoint2, resultPoint3, resultPoint4});
    }
}
