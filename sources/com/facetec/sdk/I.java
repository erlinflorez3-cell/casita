package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class I extends SurfaceView {
    private int Code;
    private int V;

    public I(Context context) {
        this(context, null);
    }

    public I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public I(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.V = 0;
        this.Code = 0;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int i5 = this.V;
        if (i5 == 0 || (i4 = this.Code) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i4 * size) / i5);
        }
    }

    public final void setAspectRatio(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.V = i2;
        this.Code = i3;
        requestLayout();
    }
}
