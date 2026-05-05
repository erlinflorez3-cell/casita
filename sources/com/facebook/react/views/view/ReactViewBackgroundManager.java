package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.drawable.CSSBackgroundDrawable;

/* JADX INFO: loaded from: classes3.dex */
@UnstableReactNativeAPI
public class ReactViewBackgroundManager {
    private CSSBackgroundDrawable mCSSBackgroundDrawable;
    private int mColor = 0;
    private Overflow mOverflow = Overflow.VISIBLE;
    private View mView;

    private enum Overflow {
        VISIBLE,
        HIDDEN,
        SCROLL
    }

    public ReactViewBackgroundManager(View view) {
        this.mView = view;
    }

    private CSSBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mCSSBackgroundDrawable == null) {
            this.mCSSBackgroundDrawable = new CSSBackgroundDrawable(this.mView.getContext());
            Drawable background = this.mView.getBackground();
            ViewCompat.setBackground(this.mView, null);
            if (background == null) {
                ViewCompat.setBackground(this.mView, this.mCSSBackgroundDrawable);
            } else {
                ViewCompat.setBackground(this.mView, new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, background}));
            }
        }
        return this.mCSSBackgroundDrawable;
    }

    public void cleanup() {
        ViewCompat.setBackground(this.mView, null);
        this.mView = null;
        this.mCSSBackgroundDrawable = null;
    }

    public int getBackgroundColor() {
        return this.mColor;
    }

    public int getBorderColor(int i2) {
        return getOrCreateReactViewBackground().getBorderColor(i2);
    }

    public void maybeClipToPaddingBox(Canvas canvas) {
        if (this.mOverflow == Overflow.VISIBLE) {
            return;
        }
        Rect rect = new Rect();
        this.mView.getDrawingRect(rect);
        CSSBackgroundDrawable cSSBackgroundDrawable = this.mCSSBackgroundDrawable;
        if (cSSBackgroundDrawable == null) {
            canvas.clipRect(rect);
            return;
        }
        Path paddingBoxPath = cSSBackgroundDrawable.getPaddingBoxPath();
        if (paddingBoxPath != null) {
            paddingBoxPath.offset(rect.left, rect.top);
            canvas.clipPath(paddingBoxPath);
        } else {
            RectF paddingBoxRect = cSSBackgroundDrawable.getPaddingBoxRect();
            paddingBoxRect.offset(rect.left, rect.top);
            canvas.clipRect(paddingBoxRect);
        }
    }

    public void setBackgroundColor(int i2) {
        if (i2 == 0 && this.mCSSBackgroundDrawable == null) {
            return;
        }
        getOrCreateReactViewBackground().setColor(i2);
    }

    public void setBorderColor(int i2, Integer num) {
        getOrCreateReactViewBackground().setBorderColor(i2, num);
    }

    public void setBorderRadius(float f2) {
        getOrCreateReactViewBackground().setRadius(f2);
    }

    public void setBorderRadius(float f2, int i2) {
        getOrCreateReactViewBackground().setRadius(f2, i2);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().setBorderStyle(str);
    }

    public void setBorderWidth(int i2, float f2) {
        getOrCreateReactViewBackground().setBorderWidth(i2, f2);
    }

    public void setOverflow(String str) {
        Overflow overflow = this.mOverflow;
        if (ViewProps.HIDDEN.equals(str)) {
            this.mOverflow = Overflow.HIDDEN;
        } else if (ViewProps.SCROLL.equals(str)) {
            this.mOverflow = Overflow.SCROLL;
        } else {
            this.mOverflow = Overflow.VISIBLE;
        }
        if (overflow != this.mOverflow) {
            this.mView.invalidate();
        }
    }
}
