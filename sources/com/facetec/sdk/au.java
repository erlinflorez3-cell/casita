package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
class au extends RelativeLayout {
    private int Code;

    public au(Context context) {
        super(context);
        this.Code = (int) (Resources.getSystem().getDisplayMetrics().widthPixels * ba.V());
    }

    public au(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Code = (int) (Resources.getSystem().getDisplayMetrics().widthPixels * ba.V());
    }

    public void setXFraction(float f2) {
        int i2 = this.Code;
        setX(i2 > 0 ? f2 * i2 : -9999.0f);
    }
}
