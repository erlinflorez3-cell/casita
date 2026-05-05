package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(context, attributeSet, i2, i3);
        Class<?> cls = Class.forName(Ig.wd("v)Q\u007f\u0015i8b`\t\u000627J\\|D\u0003*H\u0002M'", (short) (C1607wl.Xd() ^ 27726)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-14420));
        int[] iArr = new int["%SD\u0007i,@\u0007&\u0018\u0010\b".length()];
        QB qb = new QB("%SD\u0007i,@\u0007&\u0018\u0010\b");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            int dimensionPixelSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
            Class<?> cls2 = Class.forName(C1561oA.Qd("x\u0005y\u0007\u0003{u>r}{\u0001px}6Jusxhzu", (short) (ZN.Xd() ^ 30412)));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (ZN.Xd() ^ 22675);
            short sXd3 = (short) (ZN.Xd() ^ 3453);
            int[] iArr2 = new int["\u000e\r\u001d{\u0010\u001f\u001c#!\u0013\u0016%".length()];
            QB qb2 = new QB("\u000e\r\u001d{\u0010\u001f\u001c#!\u0013\u0016%");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i5)) - sXd3);
                i5++;
            }
            Method method2 = cls2.getMethod(new String(iArr2, 0, i5), clsArr2);
            try {
                method2.setAccessible(true);
                int dimensionPixelSize2 = ((Resources) method2.invoke(context, objArr2)).getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
                TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.CircularProgressIndicator, i2, i3, new int[0]);
                this.indicatorSize = Math.max(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.trackThickness * 2);
                this.indicatorInset = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
                this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
                typedArrayObtainStyledAttributes.recycle();
                validateSpec();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    int getIndicatorTrackGapSizeDegree() {
        if (this.indicatorTrackGapSize == 0) {
            return 0;
        }
        return (int) Math.round(360.0d / ((((double) ((this.indicatorSize - (this.indicatorInset * 2)) - this.trackThickness)) * 3.141592653589793d) / ((double) (this.indicatorTrackGapSize + this.trackCornerRadius))));
    }
}
