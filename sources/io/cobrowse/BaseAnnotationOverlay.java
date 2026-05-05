package io.cobrowse;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseAnnotationOverlay extends FrameLayout {
    private final ImageView annotation;
    private final LaserPointerView laser;
    private final AgentTouchesView touches;

    public BaseAnnotationOverlay(Context context) {
        super(context);
        setFitsSystemWindows(false);
        ImageView imageView = new ImageView(getContext());
        this.annotation = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setFitsSystemWindows(false);
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        LaserPointerView laserPointerView = new LaserPointerView(getContext());
        this.laser = laserPointerView;
        laserPointerView.setFitsSystemWindows(false);
        addView(laserPointerView, new FrameLayout.LayoutParams(-1, -1));
        AgentTouchesView agentTouchesView = new AgentTouchesView(getContext());
        this.touches = agentTouchesView;
        agentTouchesView.setFitsSystemWindows(false);
        addView(agentTouchesView, new FrameLayout.LayoutParams(-1, -1));
    }

    public void clear() {
        this.annotation.setImageResource(android.R.color.transparent);
    }

    protected abstract WindowManager getWindowManager();

    abstract void hide();

    public boolean isEmpty() {
        return (this.laser.isPointing() || (this.annotation.getDrawable() instanceof BitmapDrawable) || !this.touches.isEmpty()) ? false : true;
    }

    abstract void show();

    public void updateDrawing(Drawing drawing) {
        if (drawing.image == null || drawing.position == null) {
            clear();
            return;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        PointF pointFScale = DisplayScaling.scale(defaultDisplay, drawing.position);
        PointF pointFScale2 = DisplayScaling.scale(defaultDisplay, drawing.width, drawing.height);
        int[] iArr = new int[2];
        this.annotation.getLocationOnScreen(iArr);
        int i2 = ((int) pointFScale.x) - iArr[0];
        int i3 = ((int) pointFScale.y) - iArr[1];
        this.annotation.setPadding(i2, i3, (int) (r4.getWidth() - (i2 + pointFScale2.x)), (int) (this.annotation.getHeight() - (i3 + pointFScale2.y)));
        this.annotation.setImageBitmap(drawing.image);
    }

    public void updateLaser(Laser laser) {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (laser.position != null) {
            PointF pointFScale = DisplayScaling.scale(defaultDisplay, laser.position);
            this.laser.getLocationOnScreen(new int[2]);
            pointFScale.x -= r2[0];
            pointFScale.y -= r2[1];
            this.laser.setLaserPosition(pointFScale);
        }
        if (laser.isEnd()) {
            this.laser.stopPointing();
        }
    }

    public void updateTouches(Touch touch) {
        PointF pointFScale = DisplayScaling.scale(getWindowManager().getDefaultDisplay(), touch.position);
        this.laser.getLocationOnScreen(new int[2]);
        pointFScale.x -= r3[0];
        pointFScale.y -= r3[1];
        if (touch.isStart()) {
            this.touches.start(pointFScale, touch.id);
        } else if (touch.isMove()) {
            this.touches.move(pointFScale, touch.id);
        } else if (touch.isEnd()) {
            this.touches.end(pointFScale, touch.id);
        }
    }
}
