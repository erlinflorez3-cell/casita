package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.swiperefreshlayout.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
class CircleImageView extends ImageView {
    private static final int DEFAULT_BACKGROUND_COLOR = -328966;
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private int mBackgroundColor;
    private Animation.AnimationListener mListener;
    private int mShadowRadius;

    private boolean elevationSupported() {
        return true;
    }

    CircleImageView(Context context) throws Throwable {
        ShapeDrawable shapeDrawable;
        super(context);
        Context context2 = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("_mdsqlh3ivv}oy\u0001;Q~~\u0006w\f\t", (short) (C1633zX.Xd() ^ (-9042)), (short) (C1633zX.Xd() ^ (-23359)))).getMethod(C1561oA.od("NKY6HUPUQABO", (short) (FB.Xd() ^ 18893)), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context2, objArr)).getDisplayMetrics().density;
            int i2 = (int) (Y_OFFSET * f2);
            int i3 = (int) (0.0f * f2);
            this.mShadowRadius = (int) (SHADOW_RADIUS * f2);
            Context context3 = getContext();
            int[] iArr = R.styleable.SwipeRefreshLayout;
            short sXd = (short) (FB.Xd() ^ 4215);
            int[] iArr2 = new int["jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014".length()];
            QB qb = new QB("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i4] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i4));
                i4++;
            }
            Object[] objArr2 = {iArr};
            Method method2 = Class.forName(new String(iArr2, 0, i4)).getMethod(Wg.Zd(":h\u007fY^M:AZ\u0013%lfd\fSZ9V=?u", (short) (C1633zX.Xd() ^ (-20736)), (short) (C1633zX.Xd() ^ (-942))), int[].class);
            try {
                method2.setAccessible(true);
                TypedArray typedArray = (TypedArray) method2.invoke(context3, objArr2);
                this.mBackgroundColor = typedArray.getColor(R.styleable.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, DEFAULT_BACKGROUND_COLOR);
                typedArray.recycle();
                if (elevationSupported()) {
                    shapeDrawable = new ShapeDrawable(new OvalShape());
                    ViewCompat.setElevation(this, f2 * 4.0f);
                } else {
                    shapeDrawable = new ShapeDrawable(new OvalShadow(this, this.mShadowRadius));
                    setLayerType(1, shapeDrawable.getPaint());
                    shapeDrawable.getPaint().setShadowLayer(this.mShadowRadius, i3, i2, KEY_SHADOW_COLOR);
                    int i5 = this.mShadowRadius;
                    setPadding(i5, i5, i5, i5);
                }
                shapeDrawable.getPaint().setColor(this.mBackgroundColor);
                ViewCompat.setBackground(this, shapeDrawable);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (elevationSupported()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.mShadowRadius * 2), getMeasuredHeight() + (this.mShadowRadius * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.mListener = animationListener;
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
            this.mBackgroundColor = i2;
        }
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    private static class OvalShadow extends OvalShape {
        private CircleImageView mCircleImageView;
        private Paint mShadowPaint = new Paint();
        private int mShadowRadius;

        OvalShadow(CircleImageView circleImageView, int i2) {
            this.mCircleImageView = circleImageView;
            this.mShadowRadius = i2;
            updateRadialGradient((int) rect().width());
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            updateRadialGradient((int) f2);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.mCircleImageView.getWidth() / 2;
            float height = this.mCircleImageView.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.mShadowPaint);
            canvas.drawCircle(width, height, r3 - this.mShadowRadius, paint);
        }

        private void updateRadialGradient(int i2) {
            float f2 = i2 / 2;
            this.mShadowPaint.setShader(new RadialGradient(f2, f2, this.mShadowRadius, new int[]{CircleImageView.FILL_SHADOW_COLOR, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }
    }
}
