package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.Shimmer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class ShimmerFrameLayout extends FrameLayout {
    private final Paint mContentPaint;
    private final ShimmerDrawable mShimmerDrawable;
    private boolean mShowShimmer;

    public ShimmerFrameLayout(Context context) throws Throwable {
        super(context);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        init(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(context, attributeSet, i2, i3);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) throws Throwable {
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new Shimmer.AlphaHighlightBuilder().build());
            return;
        }
        Object[] objArr = {attributeSet, R.styleable.ShimmerFrameLayout, 0, 0};
        Method method = Class.forName(Ig.wd("rYa\u000b\u0019>!J=lq\u001203mD\u00017}GuXr", (short) (C1499aX.Xd() ^ (-20397)))).getMethod(C1561oA.Qd("RDUAHL0PTF><\u0018JIF<4FD4A", (short) (ZN.Xd() ^ 5420)), Class.forName(EO.Od("3\t\u000fBY\u0011]) @1TAd\u00125P+~w5p6N,", (short) (C1633zX.Xd() ^ (-6829)))), int[].class, Integer.TYPE, Integer.TYPE);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            try {
                setShimmer(((typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_colored) && typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_colored, false)) ? new Shimmer.ColorHighlightBuilder() : new Shimmer.AlphaHighlightBuilder()).consumeAttributes(typedArray).build());
            } finally {
                typedArray.recycle();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    public boolean isShimmerStarted() {
        return this.mShimmerDrawable.isShimmerStarted();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.maybeStartShimmer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    public ShimmerFrameLayout setShimmer(Shimmer shimmer) {
        this.mShimmerDrawable.setShimmer(shimmer);
        if (shimmer == null || !shimmer.clipToChildren) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.mContentPaint);
        }
        return this;
    }

    public void showShimmer(boolean z2) {
        if (this.mShowShimmer) {
            return;
        }
        this.mShowShimmer = true;
        if (z2) {
            startShimmer();
        }
    }

    public void startShimmer() {
        this.mShimmerDrawable.startShimmer();
    }

    public void stopShimmer() {
        this.mShimmerDrawable.stopShimmer();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable;
    }
}
