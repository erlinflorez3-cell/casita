package com.learnium.RNDeviceInfo.resolver;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.learnium.RNDeviceInfo.DeviceType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes5.dex */
public class DeviceTypeResolver {
    private final Context context;

    public DeviceTypeResolver(Context context) {
        this.context = context;
    }

    private DeviceType getDeviceTypeFromPhysicalSize() throws Throwable {
        Context context = this.context;
        String strZd = C1593ug.zd("0#) ,5", (short) (ZN.Xd() ^ 10478), (short) (ZN.Xd() ^ 30767));
        short sXd = (short) (C1633zX.Xd() ^ (-9122));
        int[] iArr = new int["\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014".length()];
        QB qb = new QB("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strZd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("01bc.j\u000e!M4h\u001a@U\u00128", (short) (ZN.Xd() ^ 2359), (short) (ZN.Xd() ^ 20680)), Class.forName(C1561oA.Kd("\u001e\u0016,\u0018e%\u001b)#j\u001132*0*", (short) (C1499aX.Xd() ^ (-29374)))));
        try {
            method.setAccessible(true);
            WindowManager windowManager = (WindowManager) method.invoke(context, objArr);
            if (windowManager == null) {
                return DeviceType.UNKNOWN;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            double dSqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
            return (dSqrt < 3.0d || dSqrt > 6.9d) ? (dSqrt <= 6.9d || dSqrt > 18.0d) ? DeviceType.UNKNOWN : DeviceType.TABLET : DeviceType.HANDSET;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private DeviceType getDeviceTypeFromResourceConfiguration() throws Throwable {
        Context context = this.context;
        Class<?> cls = Class.forName(C1561oA.Xd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (FB.Xd() ^ 23108)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 22553);
        int[] iArr = new int["/.:\u0019)818B43B".length()];
        QB qb = new QB("/.:\u0019)818B43B");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            int i3 = ((Resources) method.invoke(context, objArr)).getConfiguration().smallestScreenWidthDp;
            return i3 == 0 ? DeviceType.UNKNOWN : i3 >= 600 ? DeviceType.TABLET : DeviceType.HANDSET;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public DeviceType getDeviceType() throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1580rY.Xd() ^ (-21331)), (short) (C1580rY.Xd() ^ (-20056)))).getMethod(hg.Vd("2/=\u0018()0%*'\u000e!-\u001f$!-", (short) (C1499aX.Xd() ^ (-7710)), (short) (C1499aX.Xd() ^ (-26885))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {C1561oA.ud("5@3K?={5-=.@)9+r*,4&\u001f34", (short) (C1607wl.Xd() ^ 11104))};
            Method method2 = Class.forName(C1561oA.yd("FTGVXSK\u0016@MIPFPS\u000eec!DZ]bYTS8M_SVU7", (short) (C1580rY.Xd() ^ (-26741)))).getMethod(Xg.qd("\u0003|\u0010p\u0018\u0013\u0015\u0007\u0010i\n\u0007\u001b\u001d\u001b\u000f", (short) (FB.Xd() ^ 2422), (short) (FB.Xd() ^ 31970)), Class.forName(C1561oA.Yd("yq\bsA\u0001v\u0005~Fl\u000f\u000e\u0006\f\u0006", (short) (C1580rY.Xd() ^ (-8180)))));
            try {
                method2.setAccessible(true);
                if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                    return DeviceType.TV;
                }
                Context context2 = this.context;
                Object[] objArr3 = {Jg.Wd("a*\rg;\u0017", (short) (OY.Xd() ^ 12305), (short) (OY.Xd() ^ OlympusMakernoteDirectory.TAG_RAW_DEVELOPMENT_2))};
                Method method3 = Class.forName(ZO.xd("\u001e8?N\u0005FN9Ua\u0005\u0004f\r\u0019!\u0006=6X\u0004!\u0016", (short) (ZN.Xd() ^ 5525), (short) (ZN.Xd() ^ 28490))).getMethod(Ig.wd("\u001cML\t\u0006Sfl:u\u0004tF\n\u007f(", (short) (C1499aX.Xd() ^ (-18273))), Class.forName(C1626yg.Ud("\u0013/G&/X)M&\\&F\u0013N8^", (short) (ZN.Xd() ^ 23250), (short) (ZN.Xd() ^ 27140))));
                try {
                    method3.setAccessible(true);
                    UiModeManager uiModeManager = (UiModeManager) method3.invoke(context2, objArr3);
                    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                        return DeviceType.TV;
                    }
                    DeviceType deviceTypeFromResourceConfiguration = getDeviceTypeFromResourceConfiguration();
                    return (deviceTypeFromResourceConfiguration == null || deviceTypeFromResourceConfiguration == DeviceType.UNKNOWN) ? getDeviceTypeFromPhysicalSize() : deviceTypeFromResourceConfiguration;
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

    public boolean isTablet() {
        return getDeviceType() == DeviceType.TABLET;
    }
}
