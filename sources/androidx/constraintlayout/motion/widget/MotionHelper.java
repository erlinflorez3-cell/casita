package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {
    private float mProgress;
    private boolean mUseOnHide;
    private boolean mUseOnShow;
    protected View[] views;

    public boolean isDecorator() {
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onFinishedMotionScene(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPostDraw(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreDraw(Canvas canvas) {
    }

    public void onPreSetup(MotionLayout motionLayout, HashMap<View, MotionController> controllerMap) {
    }

    public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {
    }

    public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
    }

    public void setProgress(View view, float progress) {
    }

    public MotionHelper(Context context) {
        super(context);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
    }

    public MotionHelper(Context context, AttributeSet attrs) throws Throwable {
        super(context, attrs);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attrs);
    }

    public MotionHelper(Context context, AttributeSet attrs, int defStyleAttr) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attrs);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attrs) throws Throwable {
        super.init(attrs);
        if (attrs != null) {
            Context context = getContext();
            Object[] objArr = {attrs, R.styleable.MotionHelper};
            Method method = Class.forName(hg.Vd("lxmzvoi2fqotdlq*>igl\\ni", (short) (C1607wl.Xd() ^ 27082), (short) (C1607wl.Xd() ^ 26200))).getMethod(C1561oA.yd("\f\u007f\u0013\u0001\u0002\bm\u0010\u000e\u0002{{Q\u0006\u0007\u0006\u0016\u0010$$\u000e\u001d", (short) (Od.Xd() ^ (-23559))), Class.forName(C1561oA.ud("O[P]YRL\u0015[YMO\u0010\"TSPF>PN>+<J", (short) (C1633zX.Xd() ^ (-20756)))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.MotionHelper_onShow) {
                        this.mUseOnShow = typedArray.getBoolean(index, this.mUseOnShow);
                    } else if (index == R.styleable.MotionHelper_onHide) {
                        this.mUseOnHide = typedArray.getBoolean(index, this.mUseOnHide);
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUsedOnShow() {
        return this.mUseOnShow;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUseOnHide() {
        return this.mUseOnHide;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.mProgress;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float progress) {
        this.mProgress = progress;
        int i2 = 0;
        if (this.mCount > 0) {
            this.views = getViews((ConstraintLayout) getParent());
            while (i2 < this.mCount) {
                setProgress(this.views[i2], progress);
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, progress);
            }
            i2++;
        }
    }
}
