package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes7.dex */
class SymbolView extends GroupView {
    private String mAlign;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private float mVbHeight;
    private float mVbWidth;

    public SymbolView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f2) {
        saveDefinition();
    }

    void drawSymbol(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        if (this.mAlign != null) {
            canvas.concat(ViewBox.getTransform(new RectF(this.mMinX * this.mScale, this.mMinY * this.mScale, (this.mMinX + this.mVbWidth) * this.mScale, (this.mMinY + this.mVbHeight) * this.mScale), new RectF(0.0f, 0.0f, f3, f4), this.mAlign, this.mMeetOrSlice));
            super.draw(canvas, paint, f2);
        }
    }

    public void setAlign(String str) {
        this.mAlign = str;
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

    public void setVbHeight(float f2) {
        this.mVbHeight = f2;
        invalidate();
    }

    public void setVbWidth(float f2) {
        this.mVbWidth = f2;
        invalidate();
    }
}
