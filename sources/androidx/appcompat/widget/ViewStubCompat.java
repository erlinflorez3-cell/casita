package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {
    private OnInflateListener mInflateListener;
    private int mInflatedId;
    private WeakReference<View> mInflatedViewRef;
    private LayoutInflater mInflater;
    private int mLayoutResource;

    public interface OnInflateListener {
        void onInflate(ViewStubCompat viewStubCompat, View view);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.mLayoutResource = 0;
        int[] iArr = R.styleable.ViewStubCompat;
        Class<?> cls = Class.forName(Xg.qd("!/&53.*t+88?1;B|\u0013@@G9MJ", (short) (C1633zX.Xd() ^ (-28494)), (short) (C1633zX.Xd() ^ (-17596))));
        Class<?>[] clsArr = new Class[4];
        short sXd = (short) (C1607wl.Xd() ^ 18847);
        short sXd2 = (short) (C1607wl.Xd() ^ 6386);
        int[] iArr2 = new int["\\\u007f\u0013(DSK4\u0001\u001f+,\u0016(y\u0010\r*\u001fHfUi}\"".length()];
        QB qb = new QB("\\\u007f\u0013(DSK4\u0001\u001f+,\u0016(y\u0010\r*\u001fHfUi}\"");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = int[].class;
        clsArr[2] = Integer.TYPE;
        clsArr[3] = Integer.TYPE;
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        Method method = cls.getMethod(ZO.xd("\b8E-_\fs9j0n\u0007\u001cE\u001c$U)u\f\u0005\u001f", (short) (ZN.Xd() ^ 29451), (short) (ZN.Xd() ^ 5709)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.mInflatedId = typedArray.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
            this.mLayoutResource = typedArray.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
            setId(typedArray.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
            typedArray.recycle();
            setVisibility(8);
            setWillNotDraw(true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int getInflatedId() {
        return this.mInflatedId;
    }

    public void setInflatedId(int i2) {
        this.mInflatedId = i2;
    }

    public int getLayoutResource() {
        return this.mLayoutResource;
    }

    public void setLayoutResource(int i2) {
        this.mLayoutResource = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.mInflater;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.mInflatedViewRef;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            inflate();
        }
    }

    public View inflate() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.mLayoutResource != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflaterFrom = this.mInflater;
                if (layoutInflaterFrom == null) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(this.mLayoutResource, viewGroup, false);
                int i2 = this.mInflatedId;
                if (i2 != -1) {
                    viewInflate.setId(i2);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.mInflatedViewRef = new WeakReference<>(viewInflate);
                OnInflateListener onInflateListener = this.mInflateListener;
                if (onInflateListener != null) {
                    onInflateListener.onInflate(this, viewInflate);
                }
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.mInflateListener = onInflateListener;
    }
}
