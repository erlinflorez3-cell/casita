package com.ticnow.sdk.idnowonboarding.steps.stephandler.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ticnow.sdk.idnowonboarding.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class CircleImageView extends AppCompatImageView {
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final boolean DEFAULT_BORDER_OVERLAY = false;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_CIRCLE_BACKGROUND_COLOR = 0;
    private static final int DEFAULT_IMAGE_ALPHA = 255;
    private Bitmap mBitmap;
    private Canvas mBitmapCanvas;
    private final Paint mBitmapPaint;
    private int mBorderColor;
    private boolean mBorderOverlay;
    private final Paint mBorderPaint;
    private float mBorderRadius;
    private final RectF mBorderRect;
    private int mBorderWidth;
    private int mCircleBackgroundColor;
    private final Paint mCircleBackgroundPaint;
    private ColorFilter mColorFilter;
    private boolean mDisableCircularTransformation;
    private boolean mDrawableDirty;
    private float mDrawableRadius;
    private final RectF mDrawableRect;
    private int mImageAlpha;
    private boolean mInitialized;
    private boolean mRebuildShader;
    private final Matrix mShaderMatrix;
    private static final ImageView.ScaleType SCALE_TYPE = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;

    private class OutlineProvider extends ViewOutlineProvider {
        private OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.mDisableCircularTransformation) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.mBorderRect.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context) {
        super(context);
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mCircleBackgroundPaint = new Paint();
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mCircleBackgroundColor = 0;
        this.mImageAlpha = 255;
        init();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mCircleBackgroundPaint = new Paint();
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mCircleBackgroundColor = 0;
        this.mImageAlpha = 255;
        int[] iArr = R.styleable.CircleImageView;
        Class<?> cls = Class.forName(C1561oA.od("\u0013\u001f\u0014!\u001d\u0016\u0010X\r\u0018\u0016\u001b\u000b\u0013\u0018Pd\u0010\u000e\u0013\u0003\u0015\u0010", (short) (C1607wl.Xd() ^ 9825)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("[i`omhd/wwmq4H|}|tn\u0003\u0003tcv\u0007", (short) (C1499aX.Xd() ^ (-10448)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        short sXd = (short) (C1499aX.Xd() ^ (-12172));
        short sXd2 = (short) (C1499aX.Xd() ^ (-7793));
        int[] iArr2 = new int["E\u0003\u001fbtB]\td_!u|v\u000fWd(cx6J".length()];
        QB qb = new QB("E\u0003\u001fbtB]\td_!u|v\u000fWd(cx6J");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.mBorderWidth = typedArray.getDimensionPixelSize(R.styleable.CircleImageView_civ_border_width, 0);
            this.mBorderColor = typedArray.getColor(R.styleable.CircleImageView_civ_border_color, -16777216);
            this.mBorderOverlay = typedArray.getBoolean(R.styleable.CircleImageView_civ_border_overlay, false);
            this.mCircleBackgroundColor = typedArray.getColor(R.styleable.CircleImageView_civ_circle_background_color, 0);
            typedArray.recycle();
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private RectF calculateBounds() {
        float paddingLeft = getPaddingLeft() + ((r1 - r5) / 2.0f);
        float paddingTop = getPaddingTop() + ((r2 - r5) / 2.0f);
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return new RectF(paddingLeft, paddingTop, paddingLeft + fMin, fMin + paddingTop);
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, BITMAP_CONFIG) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private boolean inTouchableArea(float f2, float f3) {
        return this.mBorderRect.isEmpty() || Math.pow((double) (f2 - this.mBorderRect.centerX()), 2.0d) + Math.pow((double) (f3 - this.mBorderRect.centerY()), 2.0d) <= Math.pow((double) this.mBorderRadius, 2.0d);
    }

    private void init() {
        this.mInitialized = true;
        super.setScaleType(SCALE_TYPE);
        this.mBitmapPaint.setAntiAlias(true);
        this.mBitmapPaint.setDither(true);
        this.mBitmapPaint.setFilterBitmap(true);
        this.mBitmapPaint.setAlpha(this.mImageAlpha);
        this.mBitmapPaint.setColorFilter(this.mColorFilter);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        this.mCircleBackgroundPaint.setStyle(Paint.Style.FILL);
        this.mCircleBackgroundPaint.setAntiAlias(true);
        this.mCircleBackgroundPaint.setColor(this.mCircleBackgroundColor);
        setOutlineProvider(new OutlineProvider());
    }

    private void initializeBitmap() {
        Bitmap bitmapFromDrawable = getBitmapFromDrawable(getDrawable());
        this.mBitmap = bitmapFromDrawable;
        if (bitmapFromDrawable == null || !bitmapFromDrawable.isMutable()) {
            this.mBitmapCanvas = null;
        } else {
            this.mBitmapCanvas = new Canvas(this.mBitmap);
        }
        if (this.mInitialized) {
            if (this.mBitmap != null) {
                updateShaderMatrix();
            } else {
                this.mBitmapPaint.setShader(null);
            }
        }
    }

    private void updateDimensions() {
        int i2;
        this.mBorderRect.set(calculateBounds());
        this.mBorderRadius = Math.min((this.mBorderRect.height() - this.mBorderWidth) / 2.0f, (this.mBorderRect.width() - this.mBorderWidth) / 2.0f);
        this.mDrawableRect.set(this.mBorderRect);
        if (!this.mBorderOverlay && (i2 = this.mBorderWidth) > 0) {
            this.mDrawableRect.inset(i2 - 1.0f, i2 - 1.0f);
        }
        this.mDrawableRadius = Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
        updateShaderMatrix();
    }

    private void updateShaderMatrix() {
        float fWidth;
        float fHeight;
        if (this.mBitmap == null) {
            return;
        }
        this.mShaderMatrix.set(null);
        int height = this.mBitmap.getHeight();
        float width = this.mBitmap.getWidth();
        float f2 = height;
        float fWidth2 = 0.0f;
        if (this.mDrawableRect.height() * width > this.mDrawableRect.width() * f2) {
            fWidth = this.mDrawableRect.height() / f2;
            fHeight = 0.0f;
            fWidth2 = (this.mDrawableRect.width() - (width * fWidth)) * 0.5f;
        } else {
            fWidth = this.mDrawableRect.width() / width;
            fHeight = (this.mDrawableRect.height() - (f2 * fWidth)) * 0.5f;
        }
        this.mShaderMatrix.setScale(fWidth, fWidth);
        this.mShaderMatrix.postTranslate(((int) (fWidth2 + 0.5f)) + this.mDrawableRect.left, ((int) (fHeight + 0.5f)) + this.mDrawableRect.top);
        this.mRebuildShader = true;
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    public int getCircleBackgroundColor() {
        return this.mCircleBackgroundColor;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    @Override // android.widget.ImageView
    public int getImageAlpha() {
        return this.mImageAlpha;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.mDrawableDirty = true;
        invalidate();
    }

    public boolean isBorderOverlay() {
        return this.mBorderOverlay;
    }

    public boolean isDisableCircularTransformation() {
        return this.mDisableCircularTransformation;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDisableCircularTransformation) {
            super.onDraw(canvas);
            return;
        }
        if (this.mCircleBackgroundColor != 0) {
            canvas.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mCircleBackgroundPaint);
        }
        if (this.mBitmap != null) {
            if (this.mDrawableDirty && this.mBitmapCanvas != null) {
                this.mDrawableDirty = false;
                Drawable drawable = getDrawable();
                drawable.setBounds(0, 0, this.mBitmapCanvas.getWidth(), this.mBitmapCanvas.getHeight());
                drawable.draw(this.mBitmapCanvas);
            }
            if (this.mRebuildShader) {
                this.mRebuildShader = false;
                BitmapShader bitmapShader = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                bitmapShader.setLocalMatrix(this.mShaderMatrix);
                this.mBitmapPaint.setShader(bitmapShader);
            }
            canvas.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mBitmapPaint);
        }
        if (this.mBorderWidth > 0) {
            canvas.drawCircle(this.mBorderRect.centerX(), this.mBorderRect.centerY(), this.mBorderRadius, this.mBorderPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        updateDimensions();
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mDisableCircularTransformation ? super.onTouchEvent(motionEvent) : inTouchableArea(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z2) {
        if (z2) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i2) {
        if (i2 == this.mBorderColor) {
            return;
        }
        this.mBorderColor = i2;
        this.mBorderPaint.setColor(i2);
        invalidate();
    }

    public void setBorderOverlay(boolean z2) {
        if (z2 == this.mBorderOverlay) {
            return;
        }
        this.mBorderOverlay = z2;
        updateDimensions();
        invalidate();
    }

    public void setBorderWidth(int i2) {
        if (i2 == this.mBorderWidth) {
            return;
        }
        this.mBorderWidth = i2;
        this.mBorderPaint.setStrokeWidth(i2);
        updateDimensions();
        invalidate();
    }

    public void setCircleBackgroundColor(int i2) {
        if (i2 == this.mCircleBackgroundColor) {
            return;
        }
        this.mCircleBackgroundColor = i2;
        this.mCircleBackgroundPaint.setColor(i2);
        invalidate();
    }

    @Deprecated
    public void setCircleBackgroundColorResource(int i2) throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (C1633zX.Xd() ^ (-6974)))).getMethod(Wg.vd("IFT1CPKPL<=J", (short) (C1580rY.Xd() ^ (-6943))), new Class[0]);
        try {
            method.setAccessible(true);
            setCircleBackgroundColor(((Resources) method.invoke(context, objArr)).getColor(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.mColorFilter) {
            return;
        }
        this.mColorFilter = colorFilter;
        if (this.mInitialized) {
            this.mBitmapPaint.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z2) {
        if (z2 == this.mDisableCircularTransformation) {
            return;
        }
        this.mDisableCircularTransformation = z2;
        if (z2) {
            this.mBitmap = null;
            this.mBitmapCanvas = null;
            this.mBitmapPaint.setShader(null);
        } else {
            initializeBitmap();
        }
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i2) {
        int i3 = i2 & 255;
        if (i3 == this.mImageAlpha) {
            return;
        }
        this.mImageAlpha = i3;
        if (this.mInitialized) {
            this.mBitmapPaint.setAlpha(i3);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        initializeBitmap();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        initializeBitmap();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
        initializeBitmap();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        initializeBitmap();
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        updateDimensions();
        invalidate();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        updateDimensions();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != SCALE_TYPE) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
