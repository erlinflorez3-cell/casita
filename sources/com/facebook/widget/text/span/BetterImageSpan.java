package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class BetterImageSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private Rect mBounds;
    private final Drawable mDrawable;
    private final Paint.FontMetricsInt mFontMetricsInt;
    protected int mHeight;
    private final Rect mMargin;
    protected int mWidth;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BetterImageSpanAlignment {
    }

    public BetterImageSpan(Drawable drawable) {
        this(drawable, 1);
    }

    public BetterImageSpan(Drawable drawable, int i2) {
        this(drawable, i2, new Rect());
    }

    public BetterImageSpan(Drawable drawable, int i2, Rect rect) {
        this.mFontMetricsInt = new Paint.FontMetricsInt();
        this.mDrawable = drawable;
        this.mAlignment = i2;
        this.mMargin = rect;
        updateBounds();
    }

    public static final int normalizeAlignment(int i2) {
        if (i2 != 0) {
            return i2 != 2 ? 1 : 2;
        }
        return 0;
    }

    protected int calculateLineWidthAndFontHeight(Paint.FontMetricsInt fontMetricsInt) {
        int i2;
        int offsetAboveBaseline = getOffsetAboveBaseline(fontMetricsInt.ascent, fontMetricsInt.descent);
        int i3 = this.mHeight + offsetAboveBaseline;
        if (this.mAlignment == 2) {
            i2 = offsetAboveBaseline - this.mMargin.top;
            i3 += this.mMargin.bottom;
        } else {
            i2 = offsetAboveBaseline - this.mMargin.top;
        }
        updateFontHeight(fontMetricsInt, i2, i3);
        return this.mWidth;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        paint.getFontMetricsInt(this.mFontMetricsInt);
        float f3 = f2 + this.mMargin.left;
        canvas.translate(f3, getIconTop(i5, this.mFontMetricsInt.ascent, this.mFontMetricsInt.descent, i4, i6));
        this.mDrawable.draw(canvas);
        canvas.translate(-f3, -r2);
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    protected int getIconTop(int i2, int i3, int i4, int i5, int i6) {
        return i2 + getOffsetAboveBaseline(this.mFontMetricsInt.ascent, this.mFontMetricsInt.descent);
    }

    public Rect getMargin() {
        return this.mMargin;
    }

    protected int getOffsetAboveBaseline(int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.mAlignment;
        if (i6 == 0) {
            return (i3 - this.mHeight) - this.mMargin.bottom;
        }
        if (i6 != 2) {
            i4 = -this.mHeight;
            i5 = this.mMargin.bottom;
        } else {
            i4 = i2 + (((((i3 - i2) + this.mMargin.top) + this.mMargin.bottom) - this.mHeight) / 2);
            i5 = this.mMargin.bottom;
        }
        return i4 - i5;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        updateBounds();
        return fontMetricsInt == null ? this.mWidth : calculateLineWidthAndFontHeight(fontMetricsInt);
    }

    public void updateBounds() {
        Rect bounds = this.mDrawable.getBounds();
        this.mBounds = bounds;
        this.mWidth = bounds.width() + this.mMargin.left + this.mMargin.right;
        this.mHeight = this.mBounds.height();
    }

    protected void updateFontHeight(Paint.FontMetricsInt fontMetricsInt, int i2, int i3) {
        if (i2 < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = i2;
        }
        if (i2 < fontMetricsInt.top) {
            fontMetricsInt.top = i2;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
    }
}
