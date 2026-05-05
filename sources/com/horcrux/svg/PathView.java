package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
class PathView extends RenderableView {
    private Path mPath;

    public PathView(ReactContext reactContext) {
        super(reactContext);
        PathParser.mScale = this.mScale;
        this.mPath = new Path();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return this.mPath;
    }

    public void setD(String str) {
        this.mPath = PathParser.parse(str);
        this.elements = PathParser.elements;
        Iterator<PathElement> it = this.elements.iterator();
        while (it.hasNext()) {
            for (Point point : it.next().points) {
                point.f3547x *= (double) this.mScale;
                point.f3548y *= (double) this.mScale;
            }
        }
        invalidate();
    }
}
