package com.google.android.material.elevation;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(int i2) {
        this.elevationResId = i2;
    }

    public static int getColorForElevation(Context context, float f2) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, R.attr.colorSurface, 0), f2);
    }

    public int getColor(Context context) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 31891);
        short sXd2 = (short) (ZN.Xd() ^ 2422);
        int[] iArr = new int["@NETRMI\u0014JWW^PZa\u001c2__fXli".length()];
        QB qb = new QB("@NETRMI\u0014JWW^PZa\u001c2__fXli");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("EBP-?LGLH89F", (short) (C1499aX.Xd() ^ (-18014))), new Class[0]);
        try {
            method.setAccessible(true);
            return getColorForElevation(context, ((Resources) method.invoke(context, objArr)).getDimension(this.elevationResId));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
