package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.FilterProperties;
import com.horcrux.svg.SVGLength;

/* JADX INFO: loaded from: classes7.dex */
public class FilterRegion {
    SVGLength mH;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    private double getRelativeOrDefault(VirtualView virtualView, SVGLength sVGLength, float f2, double d2) {
        return (sVGLength == null || sVGLength.unit == SVGLength.UnitType.UNKNOWN) ? d2 : virtualView.relativeOn(sVGLength, f2);
    }

    public Rect getCropRect(VirtualView virtualView, FilterProperties.Units units, RectF rectF) {
        double relativeOrDefault;
        double relativeOrDefault2;
        double relativeOrDefault3;
        double relativeOrDefault4;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (units == FilterProperties.Units.OBJECT_BOUNDING_BOX) {
            relativeOrDefault = ((double) rectF.left) + virtualView.relativeOnFraction(this.mX, rectF.width());
            relativeOrDefault2 = ((double) rectF.top) + virtualView.relativeOnFraction(this.mY, rectF.height());
            relativeOrDefault3 = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault4 = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
        }
        return new Rect((int) relativeOrDefault, (int) relativeOrDefault2, (int) (relativeOrDefault + relativeOrDefault3), (int) (relativeOrDefault2 + relativeOrDefault4));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.from(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.from(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.from(dynamic);
    }
}
