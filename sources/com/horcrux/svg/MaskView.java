package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.Brush;

/* JADX INFO: loaded from: classes7.dex */
class MaskView extends GroupView {
    SVGLength mH;
    private Brush.BrushUnits mMaskContentUnits;
    MaskType mMaskType;
    private Brush.BrushUnits mMaskUnits;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    enum MaskType {
        LUMINANCE,
        ALPHA
    }

    public MaskView(ReactContext reactContext) {
        super(reactContext);
    }

    public MaskType getMaskType() {
        return this.mMaskType;
    }

    public Brush.BrushUnits getMaskUnits() {
        return this.mMaskUnits;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
        invalidate();
    }

    public void setMaskContentUnits(int i2) {
        if (i2 == 0) {
            this.mMaskContentUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i2 == 1) {
            this.mMaskContentUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setMaskType(int i2) {
        if (i2 == 0) {
            this.mMaskType = MaskType.LUMINANCE;
        } else if (i2 == 1) {
            this.mMaskType = MaskType.ALPHA;
        }
        invalidate();
    }

    public void setMaskUnits(int i2) {
        if (i2 == 0) {
            this.mMaskUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i2 == 1) {
            this.mMaskUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.from(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.from(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.from(dynamic);
        invalidate();
    }
}
