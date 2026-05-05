package com.dynatrace.android.agent.metrics;

import android.content.Context;
import android.os.BatteryManager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class BatteryTracker {
    private static final String LOG_TAG = "BatteryTracker";
    private final BatteryManager batteryManager;

    BatteryTracker(BatteryManager batteryManager) {
        this.batteryManager = batteryManager;
    }

    public static BatteryTracker generateBatteryTracker(Context context) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 10788);
        short sXd2 = (short) (C1607wl.Xd() ^ 21307);
        int[] iArr = new int["LF:<GA|RN\u007fUTDGP\u0006[PN\nMMabTbj\u0012fYgl`[^".length()];
        QB qb = new QB("LF:<GA|RN\u007fUTDGP\u0006[PN\nMMabTbj\u0012fYgl`[^");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (OY.Xd() ^ 13130);
        int[] iArr2 = new int["\u000e,>=-9?\u00196$%,%1".length()];
        QB qb2 = new QB("\u000e,>=-9?\u00196$%,%1");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        short sXd4 = (short) (C1607wl.Xd() ^ 4564);
        int[] iArr3 = new int["\u0007\u0007\u001b\u001c\u000e\u001c$\u0019\u000e\u001c\u0010\u0017\u0016$".length()];
        QB qb3 = new QB("\u0007\u0007\u001b\u001c\u000e\u001c$\u0019\u000e\u001c\u0010\u0017\u0016$");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
            i4++;
        }
        String str3 = new String(iArr3, 0, i4);
        try {
            Class<?> cls = Class.forName(Wg.Zd("$Wz/Yy\"\u0012t'S\u007f\u001eM\u0001`#u\"Nl&O", (short) (C1607wl.Xd() ^ 3111), (short) (C1607wl.Xd() ^ 17232)));
            Class<?>[] clsArr = new Class[1];
            short sXd5 = (short) (C1580rY.Xd() ^ (-31980));
            int[] iArr4 = new int["3+A-z:0>8\u007f&HG?E?".length()];
            QB qb4 = new QB("3+A-z:0>8\u007f&HG?E?");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 + i5));
                i5++;
            }
            clsArr[0] = Class.forName(new String(iArr4, 0, i5));
            Object[] objArr = {str3};
            Method method = cls.getMethod(Wg.vd("XUgEf_cSV;P\\[MJK", (short) (C1499aX.Xd() ^ (-31042))), clsArr);
            try {
                method.setAccessible(true);
                BatteryManager batteryManager = (BatteryManager) method.invoke(context, objArr);
                if (batteryManager != null) {
                    return new BatteryTracker(batteryManager);
                }
                if (Global.DEBUG) {
                    Utility.zlogD(str2, str);
                }
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            if (Global.DEBUG) {
                Utility.zlogD(str2, str, e3);
            }
            return null;
        }
    }

    public int captureBatteryLevel() {
        try {
            int intProperty = this.batteryManager.getIntProperty(4);
            if (intProperty >= 0 && intProperty <= 100) {
                return intProperty;
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "invalid battery level '" + intProperty + "' detected");
            }
            return Integer.MIN_VALUE;
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "unable to determine the battery level", e2);
            }
            return Integer.MIN_VALUE;
        }
    }
}
