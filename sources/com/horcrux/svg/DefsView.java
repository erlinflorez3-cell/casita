package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes7.dex */
class DefsView extends DefinitionView {
    public DefsView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.DefinitionView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f2) {
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
