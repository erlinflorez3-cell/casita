package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class MaterialDialogs {
    private MaterialDialogs() {
    }

    public static Rect getDialogBackgroundInsets(Context context, int i2, int i3) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, null, R.styleable.MaterialAlertDialog, i2, i3, new int[0]);
        int i4 = R.styleable.MaterialAlertDialog_backgroundInsetStart;
        short sXd = (short) (ZN.Xd() ^ 26425);
        int[] iArr = new int["_mdsqlh3ivv}oy\u0001;Q~~\u0006w\f\t".length()];
        QB qb = new QB("_mdsqlh3ivv}oy\u0001;Q~~\u0006w\f\t");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd + i5));
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(Wg.vd("\u000e\r\u001d{\b\u0017\u0014\u001b\u0011\u0003\u0006\u0015", (short) (OY.Xd() ^ 19003)), new Class[0]);
        try {
            method.setAccessible(true);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
            int i6 = R.styleable.MaterialAlertDialog_backgroundInsetTop;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Qg.kd("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012J^\n\b\r|\u000f\n", (short) (C1580rY.Xd() ^ (-32450)), (short) (C1580rY.Xd() ^ (-32533)))).getMethod(hg.Vd("\u000e\u000b\u0019u\b\u0015\u0010\u0015\u0011\u0001\u0002\u000f", (short) (C1607wl.Xd() ^ 24862), (short) (C1607wl.Xd() ^ 17701)), new Class[0]);
            try {
                method2.setAccessible(true);
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, ((Resources) method2.invoke(context, objArr2)).getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
                int i7 = R.styleable.MaterialAlertDialog_backgroundInsetEnd;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.ud("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w", (short) (FB.Xd() ^ 18475))).getMethod(C1561oA.yd("0/?\u001e2A>E3%(7", (short) (C1580rY.Xd() ^ (-13335))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, ((Resources) method3.invoke(context, objArr3)).getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
                    int i8 = R.styleable.MaterialAlertDialog_backgroundInsetBottom;
                    short sXd2 = (short) (FB.Xd() ^ 10560);
                    int[] iArr2 = new int["drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e".length()];
                    QB qb2 = new QB("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e");
                    int i9 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i9] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i9));
                        i9++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(new String(iArr2, 0, i9)).getMethod(Xg.qd("GFV5IXU\\ZLO^", (short) (C1607wl.Xd() ^ 2389), (short) (C1607wl.Xd() ^ 15048)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i8, ((Resources) method4.invoke(context, objArr4)).getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
                        typedArrayObtainStyledAttributes.recycle();
                        Object[] objArr5 = new Object[0];
                        Method method5 = Class.forName(Jg.Wd("\u0003Dq6j\u001dOO<|3o\u0018Y\u0017\u0007S4j'O\u001bN", (short) (FB.Xd() ^ 28563), (short) (FB.Xd() ^ 9683))).getMethod(ZO.xd("\u000bph33M\u001du1SV7", (short) (FB.Xd() ^ 4241), (short) (FB.Xd() ^ 18676)), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            if (((Resources) method5.invoke(context, objArr5)).getConfiguration().getLayoutDirection() == 1) {
                                dimensionPixelSize3 = dimensionPixelSize;
                                dimensionPixelSize = dimensionPixelSize3;
                            }
                            return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    public static InsetDrawable insetDrawable(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
