package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public static ColorStateList getColorStateList(Context context, TintTypedArray tintTypedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!tintTypedArray.hasValue(i2) || (resourceId = tintTypedArray.getResourceId(i2, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i2) : colorStateList;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i2, int i3) throws Throwable {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (C1607wl.Xd() ^ 12863), (short) (C1607wl.Xd() ^ 5502))).getMethod(C1561oA.od("\"\u001f-\f\u001f\u001b\"\u0019", (short) (Od.Xd() ^ (-23254))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
            typedArrayObtainStyledAttributes.recycle();
            return dimensionPixelSize;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawable = AppCompatResources.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawable;
    }

    public static float getFontScale(Context context) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Kd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (C1580rY.Xd() ^ (-22373))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 25730);
        short sXd2 = (short) (OY.Xd() ^ 15241);
        int[] iArr = new int["#\u001b7\u00191\u0006\u000e\r\u001a\u0016`v".length()];
        QB qb = new QB("#\u001b7\u00191\u0006\u000e\r\u001a\u0016`v");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getConfiguration().fontScale;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static int getIndexWithValue(TypedArray typedArray, int i2, int i3) {
        return typedArray.hasValue(i2) ? i2 : i3;
    }

    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledTextSize(Context context, int i2, int i3) throws Throwable {
        if (i2 == 0) {
            return i3;
        }
        int[] iArr = R.styleable.TextAppearance;
        Class<?> cls = Class.forName(C1561oA.Xd("cqhwupl7mzz\u0002s}\u0005?U\u0003\u0003\n{\u0010\r", (short) (C1633zX.Xd() ^ (-8769))));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), iArr};
        Method method = cls.getMethod(Wg.vd("K?N<IO1SMA77\u0019MJIUO__Ud", (short) (C1607wl.Xd() ^ 25967)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArray.getValue(R.styleable.TextAppearance_android_textSize, typedValue);
            typedArray.recycle();
            if (!value) {
                return i3;
            }
            if (getComplexUnit(typedValue) != 2) {
                int i4 = typedValue.data;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.ud("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (ZN.Xd() ^ 2832))).getMethod(C1561oA.yd("~}\nh\u0001\u0010\t\u0010\u0002sr\u0002", (short) (OY.Xd() ^ 23810)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    return TypedValue.complexToDimensionPixelSize(i4, ((Resources) method2.invoke(context, objArr2)).getDisplayMetrics());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            float fComplexToFloat = TypedValue.complexToFloat(typedValue.data);
            Class<?> cls2 = Class.forName(Qg.kd("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (C1580rY.Xd() ^ (-17250)), (short) (C1580rY.Xd() ^ (-4081))));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr3 = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 6731);
            short sXd2 = (short) (C1607wl.Xd() ^ 2198);
            int[] iArr2 = new int["@=K(:GBGC34A".length()];
            QB qb = new QB("@=K(:GBGC34A");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK) + sXd2);
                i5++;
            }
            Method method3 = cls2.getMethod(new String(iArr2, 0, i5), clsArr2);
            try {
                method3.setAccessible(true);
                return Math.round(fComplexToFloat * ((Resources) method3.invoke(context, objArr3)).getDisplayMetrics().density);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static boolean isFontScaleAtLeast1_3(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("AOFUSNJ\u0015KXX_Q[b\u001d3``gYmj", (short) (ZN.Xd() ^ 17213))).getMethod(Xg.qd("qp\u0001_s\u0003\u007f\u0007\u0005vy\t", (short) (Od.Xd() ^ (-2822)), (short) (Od.Xd() ^ (-18959))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getConfiguration().fontScale >= FONT_SCALE_1_3;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isFontScaleAtLeast2_0(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u00150\u00174\u001a\u001f\u000be\u0012\u000b\u0018\u000f\u0007\u0001\u0014<J\u0006q\b_\u0004n", (short) (C1633zX.Xd() ^ (-23297)), (short) (C1633zX.Xd() ^ (-16654)))).getMethod(ZO.xd("+\r\u0010A|\u0011Kfd;b\u0007", (short) (FB.Xd() ^ 1503), (short) (FB.Xd() ^ 15520)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getConfiguration().fontScale >= 2.0f;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
