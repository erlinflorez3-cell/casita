package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {
    private View mActionBarView;
    Drawable mBackground;
    private View mContextView;
    private int mHeight;
    boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    Drawable mSplitBackground;
    Drawable mStackedBackground;
    private View mTabContainer;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        setBackground(new ActionBarBackgroundDrawable(this));
        int[] iArr = R.styleable.ActionBar;
        Class<?> cls = Class.forName(C1561oA.Qd("\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eFZ\u0006\u0004\tx\u000b\u0006", (short) (C1633zX.Xd() ^ (-9564))));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd("m{r\u0002\u007fzvA\n\n\u007f\u0004FZ\u000f\u0010\u000f\u0007\u0001\u0015\u0015\u0007u\t\u0019", (short) (FB.Xd() ^ 20334), (short) (FB.Xd() ^ 14961))), int[].class};
        Object[] objArr = {attributeSet, iArr};
        short sXd = (short) (Od.Xd() ^ (-26589));
        int[] iArr2 = new int["QCT@GK/OSE=;\u0017IHE;3EC3@".length()];
        QB qb = new QB("QCT@GK/OSE=;\u0017IHE;3EC3@");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.mBackground = typedArray.getDrawable(R.styleable.ActionBar_background);
            this.mStackedBackground = typedArray.getDrawable(R.styleable.ActionBar_backgroundStacked);
            this.mHeight = typedArray.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
            boolean z2 = true;
            if (getId() == R.id.split_action_bar) {
                this.mIsSplit = true;
                this.mSplitBackground = typedArray.getDrawable(R.styleable.ActionBar_backgroundSplit);
            }
            typedArray.recycle();
            if (!this.mIsSplit ? this.mBackground != null || this.mStackedBackground != null : this.mSplitBackground != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = findViewById(R.id.action_bar);
        this.mContextView = findViewById(R.id.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.mBackground;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mBackground);
        }
        this.mBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.mActionBarView;
            if (view != null) {
                this.mBackground.setBounds(view.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.mIsSplit ? this.mBackground != null || this.mStackedBackground != null : this.mSplitBackground != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.invalidateOutline(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.mStackedBackground;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.mStackedBackground);
        }
        this.mStackedBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsStacked && (drawable2 = this.mStackedBackground) != null) {
                drawable2.setBounds(this.mTabContainer.getLeft(), this.mTabContainer.getTop(), this.mTabContainer.getRight(), this.mTabContainer.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.mIsSplit ? this.mBackground != null || this.mStackedBackground != null : this.mSplitBackground != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.invalidateOutline(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.mSplitBackground);
        }
        this.mSplitBackground = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsSplit && (drawable2 = this.mSplitBackground) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.mIsSplit ? !(this.mBackground != null || this.mStackedBackground != null) : this.mSplitBackground == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.invalidateOutline(this);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.mBackground && !this.mIsSplit) || (drawable == this.mStackedBackground && this.mIsStacked) || ((drawable == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mBackground;
        if (drawable != null && drawable.isStateful()) {
            this.mBackground.setState(getDrawableState());
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null && drawable2.isStateful()) {
            this.mStackedBackground.setState(getDrawableState());
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.mSplitBackground.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z2) {
        this.mIsTransitioning = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.mTabContainer;
        if (view != null) {
            removeView(view);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.mTabContainer;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    private boolean isCollapsed(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private int getMeasuredHeightWithMargins(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeightWithMargins;
        int i4;
        if (this.mActionBarView == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.mHeight) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.mActionBarView == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.mTabContainer;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!isCollapsed(this.mActionBarView)) {
            measuredHeightWithMargins = getMeasuredHeightWithMargins(this.mActionBarView);
        } else {
            measuredHeightWithMargins = !isCollapsed(this.mContextView) ? getMeasuredHeightWithMargins(this.mContextView) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(measuredHeightWithMargins + getMeasuredHeightWithMargins(this.mTabContainer), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[PHI: r3
  0x00c0: PHI (r3v6 boolean) = (r3v1 boolean), (r3v1 boolean), (r3v0 boolean) binds: [B:26:0x0078, B:28:0x007c, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            super.onLayout(r9, r10, r11, r12, r13)
            android.view.View r5 = r8.mTabContainer
            r1 = 8
            r7 = 1
            r3 = 0
            if (r5 == 0) goto Lc2
            int r0 = r5.getVisibility()
            if (r0 == r1) goto Lc2
            r6 = r7
        L12:
            if (r5 == 0) goto L33
            int r0 = r5.getVisibility()
            if (r0 == r1) goto L33
            int r4 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r5.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r0 = r2.bottomMargin
            int r4 = r4 - r0
            r5.layout(r10, r1, r12, r4)
        L33:
            boolean r0 = r8.mIsSplit
            if (r0 == 0) goto L4c
            android.graphics.drawable.Drawable r2 = r8.mSplitBackground
            if (r2 == 0) goto Lc0
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L46:
            if (r7 == 0) goto L4b
            r8.invalidate()
        L4b:
            return
        L4c:
            android.graphics.drawable.Drawable r0 = r8.mBackground
            if (r0 == 0) goto L76
            android.view.View r0 = r8.mActionBarView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L92
            android.graphics.drawable.Drawable r4 = r8.mBackground
            android.view.View r0 = r8.mActionBarView
            int r3 = r0.getLeft()
            android.view.View r0 = r8.mActionBarView
            int r2 = r0.getTop()
            android.view.View r0 = r8.mActionBarView
            int r1 = r0.getRight()
            android.view.View r0 = r8.mActionBarView
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L75:
            r3 = r7
        L76:
            r8.mIsStacked = r6
            if (r6 == 0) goto Lc0
            android.graphics.drawable.Drawable r4 = r8.mStackedBackground
            if (r4 == 0) goto Lc0
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L46
        L92:
            android.view.View r0 = r8.mContextView
            if (r0 == 0) goto Lba
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lba
            android.graphics.drawable.Drawable r4 = r8.mBackground
            android.view.View r0 = r8.mContextView
            int r3 = r0.getLeft()
            android.view.View r0 = r8.mContextView
            int r2 = r0.getTop()
            android.view.View r0 = r8.mContextView
            int r1 = r0.getRight()
            android.view.View r0 = r8.mContextView
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L75
        Lba:
            android.graphics.drawable.Drawable r0 = r8.mBackground
            r0.setBounds(r3, r3, r3, r3)
            goto L75
        Lc0:
            r7 = r3
            goto L46
        Lc2:
            r6 = r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: loaded from: classes.dex */
    private static class Api21Impl {
        private Api21Impl() {
        }

        public static void invalidateOutline(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }
}
