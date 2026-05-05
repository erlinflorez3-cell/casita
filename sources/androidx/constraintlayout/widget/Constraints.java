package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class Constraints extends ViewGroup {
    public static final String TAG = "Constraints";
    ConstraintSet myConstraintSet;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public LayoutParams(int width, int height) {
            super(width, height);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(LayoutParams source) {
            super((ConstraintLayout.LayoutParams) source);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(Context c2, AttributeSet attrs) throws Throwable {
            super(c2, attrs);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            Object[] objArr = {attrs, R.styleable.ConstraintSet};
            Method method = Class.forName(Wg.Zd("y\u001cs?]\u001dy|S5u\u0019K6}T+-M\u0011_8U", (short) (ZN.Xd() ^ 17178), (short) (ZN.Xd() ^ 10983))).getMethod(Wg.vd("ym|jw}_\u0002{oeeG{xw\u0004}\u000e\u000e\u0004\u0013", (short) (C1499aX.Xd() ^ (-22279))), Class.forName(C1561oA.Xd("'5,;940zCC9=\u007f\u0014HIH@:NN@/BR", (short) (C1580rY.Xd() ^ (-262)))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(c2, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.ConstraintSet_android_alpha) {
                        this.alpha = typedArray.getFloat(index, this.alpha);
                    } else if (index == R.styleable.ConstraintSet_android_elevation) {
                        this.elevation = typedArray.getFloat(index, this.elevation);
                        this.applyElevation = true;
                    } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                        this.rotationX = typedArray.getFloat(index, this.rotationX);
                    } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                        this.rotationY = typedArray.getFloat(index, this.rotationY);
                    } else if (index == R.styleable.ConstraintSet_android_rotation) {
                        this.rotation = typedArray.getFloat(index, this.rotation);
                    } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                        this.scaleX = typedArray.getFloat(index, this.scaleX);
                    } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                        this.scaleY = typedArray.getFloat(index, this.scaleY);
                    } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                        this.transformPivotX = typedArray.getFloat(index, this.transformPivotX);
                    } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                        this.transformPivotY = typedArray.getFloat(index, this.transformPivotY);
                    } else if (index == R.styleable.ConstraintSet_android_translationX) {
                        this.translationX = typedArray.getFloat(index, this.translationX);
                    } else if (index == R.styleable.ConstraintSet_android_translationY) {
                        this.translationY = typedArray.getFloat(index, this.translationY);
                    } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                        this.translationZ = typedArray.getFloat(index, this.translationZ);
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private void init(AttributeSet attrs) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new ConstraintLayout.LayoutParams(p2);
    }

    public ConstraintSet getConstraintSet() {
        if (this.myConstraintSet == null) {
            this.myConstraintSet = new ConstraintSet();
        }
        this.myConstraintSet.clone(this);
        return this.myConstraintSet;
    }
}
