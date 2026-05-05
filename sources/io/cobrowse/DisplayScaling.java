package io.cobrowse;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
final class DisplayScaling {
    DisplayScaling() {
    }

    static DisplayMetrics getMetrics(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    static PointF scale(Display display, double d2, double d3) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new PointF((float) (d2 * ((double) displayMetrics.widthPixels)), (float) (d3 * ((double) displayMetrics.heightPixels)));
    }

    static PointF scale(Display display, PointF pointF) {
        return scale(display, pointF.x, pointF.y);
    }
}
