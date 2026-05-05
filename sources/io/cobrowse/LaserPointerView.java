package io.cobrowse;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes3.dex */
final class LaserPointerView extends View {
    private final Paint paint;
    private PointF position;

    LaserPointerView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        PointF pointF = this.position;
        if (pointF != null) {
            canvas.drawCircle(pointF.x, this.position.y, 20.0f, this.paint);
        }
    }

    public boolean isPointing() {
        return this.position != null;
    }

    public void setLaserPosition(PointF pointF) {
        this.position = pointF;
        invalidate();
    }

    public void stopPointing() {
        this.position = null;
        invalidate();
    }
}
