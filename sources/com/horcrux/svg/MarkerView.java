package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes7.dex */
class MarkerView extends GroupView {
    String mAlign;
    private SVGLength mMarkerHeight;
    private String mMarkerUnits;
    private SVGLength mMarkerWidth;
    int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private String mOrient;
    private SVGLength mRefX;
    private SVGLength mRefY;
    private float mVbHeight;
    private float mVbWidth;
    Matrix markerTransform;

    public MarkerView(ReactContext reactContext) {
        super(reactContext);
        this.markerTransform = new Matrix();
    }

    void renderMarker(Canvas canvas, Paint paint, float f2, RNSVGMarkerPosition rNSVGMarkerPosition, float f3) {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.markerTransform.reset();
        Point point = rNSVGMarkerPosition.origin;
        this.markerTransform.setTranslate((float) point.f3547x, (float) point.f3548y);
        double d2 = "auto".equals(this.mOrient) ? -1.0d : Double.parseDouble(this.mOrient);
        if (d2 == -1.0d) {
            d2 = rNSVGMarkerPosition.angle;
        }
        this.markerTransform.preRotate(((float) d2) + 180.0f);
        if ("strokeWidth".equals(this.mMarkerUnits)) {
            this.markerTransform.preScale(f3 / this.mScale, f3 / this.mScale);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.mMarkerWidth) / ((double) this.mScale)), (float) (relativeOnHeight(this.mMarkerHeight) / ((double) this.mScale)));
        if (this.mAlign != null) {
            float[] fArr = new float[9];
            ViewBox.getTransform(new RectF(this.mMinX * this.mScale, this.mMinY * this.mScale, (this.mMinX + this.mVbWidth) * this.mScale, (this.mMinY + this.mVbHeight) * this.mScale), rectF, this.mAlign, this.mMeetOrSlice).getValues(fArr);
            this.markerTransform.preScale(fArr[0], fArr[4]);
        }
        this.markerTransform.preTranslate((float) (-relativeOnWidth(this.mRefX)), (float) (-relativeOnHeight(this.mRefY)));
        canvas.concat(this.markerTransform);
        drawGroup(canvas, paint, f2);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
    }

    public void setMarkerHeight(Dynamic dynamic) {
        this.mMarkerHeight = SVGLength.from(dynamic);
        invalidate();
    }

    public void setMarkerUnits(String str) {
        this.mMarkerUnits = str;
        invalidate();
    }

    public void setMarkerWidth(Dynamic dynamic) {
        this.mMarkerWidth = SVGLength.from(dynamic);
        invalidate();
    }

    public void setMeetOrSlice(int i2) {
        this.mMeetOrSlice = i2;
        invalidate();
    }

    public void setMinX(float f2) {
        this.mMinX = f2;
        invalidate();
    }

    public void setMinY(float f2) {
        this.mMinY = f2;
        invalidate();
    }

    public void setOrient(String str) {
        this.mOrient = str;
        invalidate();
    }

    public void setRefX(Dynamic dynamic) {
        this.mRefX = SVGLength.from(dynamic);
        invalidate();
    }

    public void setRefY(Dynamic dynamic) {
        this.mRefY = SVGLength.from(dynamic);
        invalidate();
    }

    public void setVbHeight(float f2) {
        this.mVbHeight = f2;
        invalidate();
    }

    public void setVbWidth(float f2) {
        this.mVbWidth = f2;
        invalidate();
    }
}
