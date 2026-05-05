package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes7.dex */
final class BoundingBox {
    private final ResultPoint bottomLeft;
    private final ResultPoint bottomRight;
    private final BitMatrix image;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final ResultPoint topLeft;
    private final ResultPoint topRight;

    BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        boolean z2 = resultPoint == null || resultPoint2 == null;
        boolean z3 = resultPoint3 == null || resultPoint4 == null;
        if (z2 && z3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z2) {
            resultPoint = new ResultPoint(0.0f, resultPoint3.getY());
            resultPoint2 = new ResultPoint(0.0f, resultPoint4.getY());
        } else if (z3) {
            resultPoint3 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint.getY());
            resultPoint4 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint2.getY());
        }
        this.image = bitMatrix;
        this.topLeft = resultPoint;
        this.bottomLeft = resultPoint2;
        this.topRight = resultPoint3;
        this.bottomRight = resultPoint4;
        this.minX = (int) Math.min(resultPoint.getX(), resultPoint2.getX());
        this.maxX = (int) Math.max(resultPoint3.getX(), resultPoint4.getX());
        this.minY = (int) Math.min(resultPoint.getY(), resultPoint3.getY());
        this.maxY = (int) Math.max(resultPoint2.getY(), resultPoint4.getY());
    }

    BoundingBox(BoundingBox boundingBox) {
        this.image = boundingBox.image;
        this.topLeft = boundingBox.topLeft;
        this.bottomLeft = boundingBox.bottomLeft;
        this.topRight = boundingBox.topRight;
        this.bottomRight = boundingBox.bottomRight;
        this.minX = boundingBox.minX;
        this.maxX = boundingBox.maxX;
        this.minY = boundingBox.minY;
        this.maxY = boundingBox.maxY;
    }

    static BoundingBox merge(BoundingBox boundingBox, BoundingBox boundingBox2) throws NotFoundException {
        return boundingBox == null ? boundingBox2 : boundingBox2 == null ? boundingBox : new BoundingBox(boundingBox.image, boundingBox.topLeft, boundingBox.bottomLeft, boundingBox2.topRight, boundingBox2.bottomRight);
    }

    BoundingBox addMissingRows(int i2, int i3, boolean z2) throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3 = this.topLeft;
        ResultPoint resultPoint4 = this.bottomLeft;
        ResultPoint resultPoint5 = this.topRight;
        ResultPoint resultPoint6 = this.bottomRight;
        if (i2 > 0) {
            ResultPoint resultPoint7 = z2 ? resultPoint3 : resultPoint5;
            int y2 = ((int) resultPoint7.getY()) - i2;
            if (y2 < 0) {
                y2 = 0;
            }
            resultPoint = new ResultPoint(resultPoint7.getX(), y2);
            if (!z2) {
                resultPoint5 = resultPoint;
                resultPoint = resultPoint3;
            }
        } else {
            resultPoint = resultPoint3;
        }
        if (i3 > 0) {
            ResultPoint resultPoint8 = z2 ? this.bottomLeft : this.bottomRight;
            int y3 = ((int) resultPoint8.getY()) + i3;
            if (y3 >= this.image.getHeight()) {
                y3 = this.image.getHeight() - 1;
            }
            resultPoint2 = new ResultPoint(resultPoint8.getX(), y3);
            if (!z2) {
                resultPoint6 = resultPoint2;
                resultPoint2 = resultPoint4;
            }
        } else {
            resultPoint2 = resultPoint4;
        }
        return new BoundingBox(this.image, resultPoint, resultPoint2, resultPoint5, resultPoint6);
    }

    ResultPoint getBottomLeft() {
        return this.bottomLeft;
    }

    ResultPoint getBottomRight() {
        return this.bottomRight;
    }

    int getMaxX() {
        return this.maxX;
    }

    int getMaxY() {
        return this.maxY;
    }

    int getMinX() {
        return this.minX;
    }

    int getMinY() {
        return this.minY;
    }

    ResultPoint getTopLeft() {
        return this.topLeft;
    }

    ResultPoint getTopRight() {
        return this.topRight;
    }
}
