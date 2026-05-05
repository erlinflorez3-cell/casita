package fr.antelop.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.app.ActivityCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourcesHelper {
    public static Rect getLocalRectForView(Activity activity, View view) {
        int statusBarHeight = getStatusBarHeight(activity, view.getResources());
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        rect.top -= statusBarHeight;
        rect.bottom -= statusBarHeight;
        return rect;
    }

    public static int getStatusBarHeight(Activity activity, Resources resources) {
        if (activity != null) {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        }
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Drawable resolveResourceAsDrawable(Context context, String str) throws Throwable {
        if (str == null) {
            return null;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("myn{wpj3grpuemr+?jhm]oj", (short) (FB.Xd() ^ 39))).getMethod(C1561oA.yd("\t\b\u0014r\u000b\u001a\u0013\u001a\u001c\u000e\r\u001c", (short) (C1580rY.Xd() ^ (-27325))), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                String strTrimExtensionFile = trimExtensionFile(str);
                String strYd = C1561oA.Yd("`o_vacnh", (short) (FB.Xd() ^ 5638));
                Class<?> cls = Class.forName(Xg.qd("6D;JHC?\n@MMTFPW\u0012(UU\\Nb_", (short) (C1607wl.Xd() ^ 6916), (short) (C1607wl.Xd() ^ 27635)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (ZN.Xd() ^ 19388);
                short sXd2 = (short) (ZN.Xd() ^ 31012);
                int[] iArr = new int[" cRGWt^nt\u0010S\u0006\b\u001e".length()];
                QB qb = new QB(" cRGWt^nt\u0010S\u0006\b\u001e");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    return ActivityCompat.getDrawable(context, resources.getIdentifier(strTrimExtensionFile, strYd, (String) method2.invoke(context, objArr2)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String trimExtensionFile(String str) {
        if (str == null) {
            return null;
        }
        return str.contains(".") ? str.substring(0, str.lastIndexOf(46)) : str;
    }
}
