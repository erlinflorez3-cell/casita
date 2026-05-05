package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes4.dex */
public class MotionTelltales extends MockView {
    private static final String TAG = "MotionTelltales";
    Matrix mInvertMatrix;
    MotionLayout mMotionLayout;
    private Paint mPaintTelltales;
    int mTailColor;
    float mTailScale;
    int mVelocityMode;
    float[] velocity;

    public MotionTelltales(Context context) throws Throwable {
        super(context);
        this.mPaintTelltales = new Paint();
        this.velocity = new float[2];
        this.mInvertMatrix = new Matrix();
        this.mVelocityMode = 0;
        this.mTailColor = -65281;
        this.mTailScale = 0.25f;
        init(context, null);
    }

    public MotionTelltales(Context context, AttributeSet attrs) throws Throwable {
        super(context, attrs);
        this.mPaintTelltales = new Paint();
        this.velocity = new float[2];
        this.mInvertMatrix = new Matrix();
        this.mVelocityMode = 0;
        this.mTailColor = -65281;
        this.mTailScale = 0.25f;
        init(context, attrs);
    }

    public MotionTelltales(Context context, AttributeSet attrs, int defStyleAttr) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.mPaintTelltales = new Paint();
        this.velocity = new float[2];
        this.mInvertMatrix = new Matrix();
        this.mVelocityMode = 0;
        this.mTailColor = -65281;
        this.mTailScale = 0.25f;
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) throws Throwable {
        if (attrs != null) {
            Object[] objArr = {attrs, R.styleable.MotionTelltales};
            Method method = Class.forName(C1561oA.Xd("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:", (short) (Od.Xd() ^ (-18429)))).getMethod(Qg.kd("N@Q=DH,LPB:8\u0014FEB80B@0=", (short) (C1580rY.Xd() ^ (-24233)), (short) (C1580rY.Xd() ^ (-8995))), Class.forName(Wg.vd("|\u000b}\r\u000f\n\u0002L\t\tz~EY\n\u000b\u001e\u0016\f $\u0016\u0001\u0014\u0018", (short) (Od.Xd() ^ (-11520)))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                        this.mTailColor = typedArray.getColor(index, this.mTailColor);
                    } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                        this.mVelocityMode = typedArray.getInt(index, this.mVelocityMode);
                    } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                        this.mTailScale = typedArray.getFloat(index, this.mTailScale);
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.mPaintTelltales.setColor(this.mTailColor);
        this.mPaintTelltales.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setText(CharSequence text) {
        this.mText = text.toString();
        requestLayout();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        postInvalidate();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.mInvertMatrix);
        if (this.mMotionLayout == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.mMotionLayout = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i2 = 0; i2 < 5; i2++) {
            float f2 = fArr[i2];
            for (int i3 = 0; i3 < 5; i3++) {
                float f3 = fArr[i3];
                this.mMotionLayout.getViewVelocity(this, f3, f2, this.velocity, this.mVelocityMode);
                this.mInvertMatrix.mapVectors(this.velocity);
                float f4 = width * f3;
                float f5 = height * f2;
                float[] fArr2 = this.velocity;
                float f6 = fArr2[0];
                float f7 = this.mTailScale;
                float f8 = f5 - (fArr2[1] * f7);
                this.mInvertMatrix.mapVectors(fArr2);
                canvas.drawLine(f4, f5, f4 - (f6 * f7), f8, this.mPaintTelltales);
            }
        }
    }
}
