package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VirtualLayout extends ConstraintHelper {
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;

    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VirtualLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attrs) throws Throwable {
        super.init(attrs);
        if (attrs != null) {
            Context context = getContext();
            Object[] objArr = {attrs, R.styleable.ConstraintLayout_Layout};
            Method method = Class.forName(ZO.xd("[\b\u001f<yA+hll\u0014\u0010`[_g\u007f\u0017\u0001\u0013P\u001bG", (short) (FB.Xd() ^ 7584), (short) (FB.Xd() ^ 1581))).getMethod(Ig.wd("2oO1` \u0015v$\u001c\u000fS\u0001B*\u000bXG#e\u000fy", (short) (C1499aX.Xd() ^ (-27063))), Class.forName(C1626yg.Ud("O\u000b8YB\u00073\n$nddQ\u0001\u001f`Z\\O\u001c\u001f\u0004\\\u00140", (short) (ZN.Xd() ^ 24888), (short) (ZN.Xd() ^ 14723))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                        this.mApplyVisibilityOnAttach = true;
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                        this.mApplyElevationOnAttach = true;
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws Throwable {
        super.onAttachedToWindow();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.mCount; i2++) {
                    View viewById = constraintLayout.getViewById(this.mIds[i2]);
                    if (viewById != null) {
                        if (this.mApplyVisibilityOnAttach) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.mApplyElevationOnAttach && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void applyLayoutFeaturesInConstraintSet(ConstraintLayout container) {
        applyLayoutFeatures(container);
    }
}
