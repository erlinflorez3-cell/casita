package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mLastWidthSize = -1;
        int[] iArr = R.styleable.ButtonBarLayout;
        short sXd = (short) (OY.Xd() ^ 1967);
        int[] iArr2 = new int["\u0016Z2\u001c\u00021DE\u001e\u001a\u000f~\u001f*0O\u001aTj\\\u0011k\u0002".length()];
        QB qb = new QB("\u0016Z2\u001c\u00021DE\u001e\u001a\u000f~\u001f*0O\u001aTj\\\u0011k\u0002");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i2));
        Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u001d\u001b\u000f\u0011Qc\u0016\u0015\u0012\b\u007f\u0012\u0010\u007fl}\f", (short) (C1633zX.Xd() ^ (-3803)))), int[].class};
        Object[] objArr = {attributeSet, iArr};
        short sXd2 = (short) (C1580rY.Xd() ^ (-26708));
        short sXd3 = (short) (C1580rY.Xd() ^ (-25403));
        int[] iArr3 = new int["K?R@IO5W]QKK)]^]UOccUd".length()];
        QB qb2 = new QB("K?R@IO5W]QKK)]^]UOccUd");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr3[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ButtonBarLayout, attributeSet, typedArray, 0, 0);
            this.mAllowStacking = typedArray.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
            typedArray.recycle();
            if (getOrientation() == 1) {
                setStacked(this.mAllowStacking);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.mAllowStacking != z2) {
            this.mAllowStacking = z2;
            if (!z2 && isStacked()) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int paddingTop = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (isStacked() || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.mAllowStacking && !isStacked()) {
            if ((-1) - (((-1) - getMeasuredWidthAndState()) | ((-1) - ViewCompat.MEASURED_STATE_MASK)) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int nextVisibleChildIndex = getNextVisibleChildIndex(0);
        if (nextVisibleChildIndex >= 0) {
            View childAt = getChildAt(nextVisibleChildIndex);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (isStacked()) {
                int nextVisibleChildIndex2 = getNextVisibleChildIndex(nextVisibleChildIndex + 1);
                if (nextVisibleChildIndex2 >= 0) {
                    paddingTop += getChildAt(nextVisibleChildIndex2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingTop += getPaddingBottom();
            }
        }
        if (ViewCompat.getMinimumHeight(this) != paddingTop) {
            setMinimumHeight(paddingTop);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    private int getNextVisibleChildIndex(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private void setStacked(boolean z2) {
        if (this.mStacked != z2) {
            if (!z2 || this.mAllowStacking) {
                this.mStacked = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? GravityCompat.END : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    private boolean isStacked() {
        return this.mStacked;
    }
}
