package io.cobrowse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
final class CompatibilityUtils {
    private static Integer hostAppTargetSdk = null;

    static class VERSION_CODES {
        public static final int VANILLA_ICE_CREAM = 35;

        VERSION_CODES() {
        }
    }

    CompatibilityUtils() {
    }

    static void registerBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Throwable {
        if (Build.VERSION.SDK_INT < 34) {
            Object[] objArr = {broadcastReceiver, intentFilter};
            Method method = Class.forName(C1561oA.yd("#1(750,v\u001d**1#-4nt\"\")\u001b/,", (short) (C1607wl.Xd() ^ 18370))).getMethod(Jg.Wd("zyD\u000fS\u001d\u0016o\neLV\u0015j&{", (short) (C1580rY.Xd() ^ (-8968)), (short) (C1580rY.Xd() ^ (-17605))), Class.forName(C1561oA.Yd("%3*972.x/<<C5?F\u0001\u0016GE8<<;NP/CBEJXHV", (short) (C1633zX.Xd() ^ (-8938)))), Class.forName(Xg.qd("!/&53.*t+88?1;B|\u0019?F8BI\u001c@DM?M", (short) (C1607wl.Xd() ^ 1116), (short) (C1607wl.Xd() ^ 16198))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd = (short) (C1499aX.Xd() ^ (-13972));
        int[] iArr = new int["=I>KG@:\u00037B@E5=Bz\u000f:8=-?:".length()];
        QB qb = new QB("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[3];
        clsArr[0] = Class.forName(Qg.kd("XdYfb[U\u001eR][`PX]\u0016)XTEGEBSS0B?@CO=I", (short) (OY.Xd() ^ 28776), (short) (OY.Xd() ^ 27340)));
        short sXd2 = (short) (C1499aX.Xd() ^ (-1745));
        short sXd3 = (short) (C1499aX.Xd() ^ (-14295));
        int[] iArr2 = new int["q}r\u007f{tn7kvtyiqv/Imrbjo@bdk[g".length()];
        QB qb2 = new QB("q}r\u007f{tn7kvtyiqv/Imrbjo@bdk[g");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        clsArr[2] = Integer.TYPE;
        Object[] objArr2 = {broadcastReceiver, intentFilter, 4};
        Method method2 = cls.getMethod(C1561oA.ud("OABCLL<H'967:F4@", (short) (C1633zX.Xd() ^ (-26005))), clsArr);
        try {
            method2.setAccessible(true);
            method2.invoke(context, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static int targetSdkVersion() {
        Object obj;
        if (hostAppTargetSdk == null) {
            ApplicationInfo applicationInfo = CobrowseInitProvider.getApplication().getApplicationInfo();
            String strXd = ZO.xd("\u0010\u000bSb4I?L\u0012Dp7kW/,e\u0004\f6]$\u0019ZD~!pQl2K~4", (short) (C1633zX.Xd() ^ (-10536)), (short) (C1633zX.Xd() ^ (-6947)));
            String strUd = C1626yg.Ud("F\u000f^@C!\u00106\u0005?0&zx`I", (short) (C1580rY.Xd() ^ (-28418)), (short) (C1580rY.Xd() ^ (-2528)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            hostAppTargetSdk = Integer.valueOf(((Integer) obj).intValue());
        }
        return hostAppTargetSdk.intValue();
    }
}
