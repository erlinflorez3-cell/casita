package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.ReplaceWith;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class NavUtils {
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final String TAG = "NavUtils";

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00179,%\u0001e>LLF@\u001fdM}2\u0013~qSG\u001d#CCE@\u001f\u0018\u000fmXR8j\u0015M1.\u001f\t\u000b[n`\b}n\u001e", imports = {})
    @Deprecated
    public static boolean shouldUpRecreateTask(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void navigateUpFromSameTask(Activity activity) {
        Intent parentActivityIntent = getParentActivityIntent(activity);
        if (parentActivityIntent == null) {
            throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        }
        navigateUpTo(activity, parentActivityIntent);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00179,%\u0001e>LLF@\u001fdM}-\f\u0006eND<\u0018FN6=a,\u000bQre*ma\u0002", imports = {})
    @Deprecated
    public static void navigateUpTo(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static Intent getParentActivityIntent(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String parentActivityName = getParentActivityName(activity);
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, parentActivityName);
        try {
            if (getParentActivityName(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = "getParentActivityIntent: bad parentActivityName '" + parentActivityName + "' in manifest";
            return null;
        }
    }

    public static Intent getParentActivityIntent(Context context, Class<?> cls) throws Throwable {
        String parentActivityName = getParentActivityName(context, new ComponentName(context, cls));
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, parentActivityName);
        return getParentActivityName(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentName) throws Throwable {
        String parentActivityName = getParentActivityName(context, componentName);
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), parentActivityName);
        return getParentActivityName(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String getParentActivityName(Activity activity) {
        try {
            return getParentActivityName(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String getParentActivityName(Context context, ComponentName componentName) throws Throwable {
        String string;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b", (short) (FB.Xd() ^ 9365))).getMethod(Wg.Zd("9~\u0002AFMI#\u001d^;34+&\b\t", (short) (ZN.Xd() ^ 19249), (short) (ZN.Xd() ^ 16638)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072;
            short sXd = (short) (Od.Xd() ^ (-10056));
            int[] iArr = new int["iwn}{vr=s\u0001\u0001\by\u0004\u000bE\t\u0007Hk}\u0001\n\u0001\b\u0007o\u0005\u0013\u0007\u000e\r\u001b".length()];
            QB qb = new QB("iwn}{vr=s\u0001\u0001\by\u0004\u000bE\t\u0007Hk}\u0001\n\u0001\b\u0007o\u0005\u0013\u0007\u000e\r\u001b");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Class.forName(Wg.vd("_mdsid`+ivv}gqx31^]aYYQ[jEYfW", (short) (ZN.Xd() ^ 29723))), Integer.TYPE};
            Object[] objArr2 = {componentName, Integer.valueOf(i2)};
            Method method2 = cls.getMethod(Qg.kd("\u0018\u0015#n\u0010 \u0014 \u0012\u001c n\u0013\n\u0012", (short) (C1499aX.Xd() ^ (-12284)), (short) (C1499aX.Xd() ^ (-24229))), clsArr);
            try {
                method2.setAccessible(true);
                ActivityInfo activityInfo = (ActivityInfo) method2.invoke(packageManager, objArr2);
                String str = activityInfo.parentActivityName;
                if (str != null) {
                    return str;
                }
                if (activityInfo.metaData == null || (string = activityInfo.metaData.getString(hg.Vd("Zf[hd]W de_^\\^_\u00189)9+38B#$4(4&04", (short) (ZN.Xd() ^ 6438), (short) (ZN.Xd() ^ 8275)))) == null) {
                    return null;
                }
                if (string.charAt(0) != '.') {
                    return string;
                }
                StringBuilder sb = new StringBuilder();
                short sXd2 = (short) (Od.Xd() ^ (-31130));
                int[] iArr2 = new int["\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007".length()];
                QB qb2 = new QB("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
                    i4++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr2, 0, i4)).getMethod(C1561oA.yd("zw\u0006`xy\u0001u\u0003\u007fgy\r\u0004", (short) (C1633zX.Xd() ^ (-27592))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    return sb.append((String) method3.invoke(context, objArr3)).append(string).toString();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private NavUtils() {
    }
}
