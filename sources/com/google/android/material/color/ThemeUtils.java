package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class ThemeUtils {
    private ThemeUtils() {
    }

    public static void applyThemeOverlay(Context context, int i2) throws Throwable {
        Resources.Theme windowDecorViewTheme;
        Class<?> cls = Class.forName(hg.Vd("9E:GC<6~3><A19>v\u000b649);6", (short) (FB.Xd() ^ 24611), (short) (FB.Xd() ^ 16815)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 30469);
        int[] iArr = new int["xu\u0004buqxo".length()];
        QB qb = new QB("xu\u0004buqxo");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).applyStyle(i2, true);
            if (!(context instanceof Activity) || (windowDecorViewTheme = getWindowDecorViewTheme((Activity) context)) == null) {
                return;
            }
            windowDecorViewTheme.applyStyle(i2, true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Resources.Theme getWindowDecorViewTheme(Activity activity) throws Throwable {
        View viewPeekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\R\u007f\u007f\u0007x\r\n", (short) (ZN.Xd() ^ 26624))).getMethod(C1561oA.Yd("\u0002\u0001\u0011q\u0007\u0005\u000e\u0007", (short) (Od.Xd() ^ (-7402))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Resources.Theme) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
