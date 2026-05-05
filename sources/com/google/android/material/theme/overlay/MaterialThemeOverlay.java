package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, com.google.android.material.R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {com.google.android.material.R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    private static int obtainAndroidThemeOverlayId(Context context, AttributeSet attributeSet) throws Throwable {
        int[] iArr = ANDROID_THEME_OVERLAY_ATTRS;
        short sXd = (short) (ZN.Xd() ^ 17457);
        short sXd2 = (short) (ZN.Xd() ^ 25899);
        int[] iArr2 = new int["=I>KG@:\u00037B@E5=Bz\u000f:8=-?:".length()];
        QB qb = new QB("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = {attributeSet, iArr};
        Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(C1561oA.ud("ugxdkoSswia_;mli_WigWd", (short) (OY.Xd() ^ 778)), Class.forName(hg.Vd("S_Ta]VP\u0019_]QS\u0014&XWTJBTRB/@N", (short) (C1580rY.Xd() ^ (-6261)), (short) (C1580rY.Xd() ^ (-31784)))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            typedArray.recycle();
            return resourceId != 0 ? resourceId : resourceId2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int obtainMaterialThemeOverlayId(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        int[] iArr = MATERIAL_THEME_OVERLAY_ATTR;
        Class<?> cls = Class.forName(C1561oA.yd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6pf\u0014\u0014\u001b\r!\u001e", (short) (C1633zX.Xd() ^ (-5349))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("5C:IGB>\tQQGK\u000e\"VWVNH\\\\N=P`", (short) (Od.Xd() ^ (-14389)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(Xg.qd("nbuclrXz\u0001tnnL\u0001\u0002\u0001xr\u0007\u0007x\b", (short) (OY.Xd() ^ 8890), (short) (OY.Xd() ^ 17018)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(0, 0);
            typedArray.recycle();
            return resourceId;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Context wrap(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i2, i3);
        boolean z2 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z2) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, iObtainMaterialThemeOverlayId);
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("yA2-%\u0018\u007f\u0004&-%\u0018\u0004G:ln\u0016\u0010\u0001,:#", (short) (FB.Xd() ^ 20651), (short) (FB.Xd() ^ 30504))).getMethod(ZO.xd("A=\u0004\u001e$\r\u00045", (short) (C1580rY.Xd() ^ (-16027)), (short) (C1580rY.Xd() ^ (-16363))), new Class[0]);
            try {
                method.setAccessible(true);
                ((Resources.Theme) method.invoke(contextThemeWrapper, objArr)).applyStyle(iObtainAndroidThemeOverlayId, true);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return contextThemeWrapper;
    }
}
