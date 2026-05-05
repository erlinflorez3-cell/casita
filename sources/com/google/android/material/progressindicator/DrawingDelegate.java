package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes9.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    protected static class ActiveIndicator {
        int color;
        float endFraction;
        int gapSize;
        float startFraction;

        protected ActiveIndicator() {
        }
    }

    public DrawingDelegate(S s2) {
        this.spec = s2;
    }

    abstract void adjustCanvas(Canvas canvas, Rect rect, float f2, boolean z2, boolean z3);

    abstract void drawStopIndicator(Canvas canvas, Paint paint, int i2, int i3);

    abstract void fillIndicator(Canvas canvas, Paint paint, ActiveIndicator activeIndicator, int i2);

    abstract void fillTrack(Canvas canvas, Paint paint, float f2, float f3, int i2, int i3, int i4);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    void validateSpecAndAdjustCanvas(Canvas canvas, Rect rect, float f2, boolean z2, boolean z3) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f2, z2, z3);
    }
}
