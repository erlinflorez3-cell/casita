package com.dynatrace.android.agent.metrics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.SdkVersionProvider;
import com.dynatrace.android.agent.util.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class AppVersionTracker {
    private static final String LOGTAG = Global.LOG_PREFIX + "AppVersionTracker";
    private final Context context;
    private final SdkVersionProvider sdkVersionProvider;

    public AppVersionTracker(Context context, SdkVersionProvider sdkVersionProvider) {
        this.context = context;
        this.sdkVersionProvider = sdkVersionProvider;
    }

    public AppVersion determineAppVersion() {
        PackageInfo packageInfo;
        try {
            if (this.sdkVersionProvider.sdkVersion() >= 33) {
                Context context = this.context;
                Class<?> cls = Class.forName(C1561oA.Kd(" .%42-)s*77>0:A{\u0012??F8LI", (short) (C1580rY.Xd() ^ (-11829))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-3327));
                short sXd2 = (short) (C1633zX.Xd() ^ (-18068));
                int[] iArr = new int["Jb\u0015rCLzOs\r\u0018JZT]z*".length()];
                QB qb = new QB("Jb\u0015rCLzOs\r\u0018JZT]z*");
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
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Context context2 = this.context;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Xd("*8/><73}4AAH:DK\u0006\u001cIIPBVS", (short) (ZN.Xd() ^ 14927))).getMethod(Wg.vd("OL^9MNYNGD0BQH", (short) (C1607wl.Xd() ^ 11132)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str = (String) method2.invoke(context2, objArr2);
                        PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                        Class<?> cls2 = Class.forName(Qg.kd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016N\u0010\fKl|}\u0005y~{bu\u0002sxu\u0002", (short) (ZN.Xd() ^ 7387), (short) (ZN.Xd() ^ 10011)));
                        Class<?>[] clsArr2 = new Class[2];
                        short sXd3 = (short) (C1499aX.Xd() ^ (-29528));
                        short sXd4 = (short) (C1499aX.Xd() ^ (-27386));
                        int[] iArr2 = new int["wm\u0002k7thtl2Vvsime".length()];
                        QB qb2 = new QB("wm\u0002k7thtl2Vvsime");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                            i3++;
                        }
                        clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                        clsArr2[1] = Class.forName(C1561oA.ud("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[\u001d\u0019Xy\n\u000b\u0012\u0007\f\to\u0003\u000f\u0001\u0006\u0003\u000f?jz{\u0003w|y\\\u0001w\u007fUzns~", (short) (C1499aX.Xd() ^ (-26449))));
                        Object[] objArr3 = {str, packageInfoFlagsOf};
                        Method method3 = cls2.getMethod(C1561oA.yd("lk{XbenetsX~oy", (short) (Od.Xd() ^ (-15487))), clsArr2);
                        try {
                            method3.setAccessible(true);
                            packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                Context context3 = this.context;
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(C1561oA.Yd("-;2A?:6\u00017DDK=GN\t\u001fLLSEYV", (short) (C1633zX.Xd() ^ (-29019)))).getMethod(Xg.qd("baqN`clcjiRguipo}", (short) (C1607wl.Xd() ^ 12823), (short) (C1607wl.Xd() ^ 7341)), new Class[0]);
                try {
                    method4.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method4.invoke(context3, objArr4);
                    Context context4 = this.context;
                    short sXd5 = (short) (OY.Xd() ^ 3703);
                    short sXd6 = (short) (OY.Xd() ^ 12010);
                    int[] iArr3 = new int["\u000eM\u0016vFr@\\d#tM\u0011L%1Y8\nb&k:".length()];
                    QB qb3 = new QB("\u000eM\u0016vFr@\\d#tM\u0011L%1Y8\nb&k:");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd6) ^ sXd5));
                        i4++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                    Class<?>[] clsArr3 = new Class[0];
                    Object[] objArr5 = new Object[0];
                    short sXd7 = (short) (FB.Xd() ^ 943);
                    short sXd8 = (short) (FB.Xd() ^ 12182);
                    int[] iArr4 = new int["^\\W@\u0012?A.9\u0001\u0007\bO\u001f".length()];
                    QB qb4 = new QB("^\\W@\u0012?A.9\u0001\u0007\bO\u001f");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd8) + sXd7)));
                        i5++;
                    }
                    Method method5 = cls3.getMethod(new String(iArr4, 0, i5), clsArr3);
                    try {
                        method5.setAccessible(true);
                        String str2 = (String) method5.invoke(context4, objArr5);
                        Class<?> cls4 = Class.forName(C1626yg.Ud(".>\u0004z`k\u0011v,Uc0\u0007RHpVT>Y.;lqC\u0014A\u0004}-\u0004l@", (short) (OY.Xd() ^ 26130), (short) (OY.Xd() ^ 23158)));
                        Class<?>[] clsArr4 = new Class[2];
                        clsArr4[0] = Class.forName(Ig.wd("V\u0016zGys~Ik AJ}|_<", (short) (ZN.Xd() ^ 32148)));
                        clsArr4[1] = Integer.TYPE;
                        Object[] objArr6 = {str2, 0};
                        Method method6 = cls4.getMethod(EO.Od("Fu37I\u007fcR~A'f\t\u0018", (short) (C1633zX.Xd() ^ (-18627))), clsArr4);
                        try {
                            method6.setAccessible(true);
                            packageInfo = (PackageInfo) method6.invoke(packageManager2, objArr6);
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            }
            if (packageInfo == null) {
                return null;
            }
            return new AppVersion(this.sdkVersionProvider.sdkVersion() >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e8) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, C1561oA.Qd("n\t\u0010\u0012\n\bB\u0016\u0010?\u0003\u0003\u0011\u0001\r\u0007\u0002\u0006{5u\u0004\u00031\u0007t\u0001\u0001uzx)nyur$Scdk`ebEi`h", (short) (FB.Xd() ^ 27297)), e8);
            }
            return null;
        }
    }
}
