package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
class EllipseView extends RenderableView {
    private SVGLength mCx;
    private SVGLength mCy;
    private SVGLength mRx;
    private SVGLength mRy;

    public EllipseView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.mCx);
        double dRelativeOnHeight = relativeOnHeight(this.mCy);
        double dRelativeOnWidth2 = relativeOnWidth(this.mRx);
        double dRelativeOnHeight2 = relativeOnHeight(this.mRy);
        double d2 = dRelativeOnWidth - dRelativeOnWidth2;
        double d3 = dRelativeOnHeight - dRelativeOnHeight2;
        double d4 = dRelativeOnWidth2 + dRelativeOnWidth;
        double d5 = dRelativeOnHeight2 + dRelativeOnHeight;
        path.addOval(new RectF((float) d2, (float) d3, (float) d4, (float) d5), Path.Direction.CW);
        this.elements = new ArrayList<>();
        this.elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, new Point[]{new Point(dRelativeOnWidth, d3)}));
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(dRelativeOnWidth, d3), new Point(d4, dRelativeOnHeight)}));
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(d4, dRelativeOnHeight), new Point(dRelativeOnWidth, d5)}));
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(dRelativeOnWidth, d5), new Point(d2, dRelativeOnHeight)}));
        this.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(d2, dRelativeOnHeight), new Point(dRelativeOnWidth, d3)}));
        return path;
    }

    public void setCx(Dynamic dynamic) {
        this.mCx = SVGLength.from(dynamic);
        invalidate();
    }

    public void setCy(Dynamic dynamic) {
        this.mCy = SVGLength.from(dynamic);
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.mRx = SVGLength.from(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.mRy = SVGLength.from(dynamic);
        invalidate();
    }
}
