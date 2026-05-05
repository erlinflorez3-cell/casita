package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFa1ySDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String stringExtra;
        String strXd = C1561oA.Xd("p~\u007f}\u00020z\u00013V\b\u0006x||{\u000f\u0011o\u0004\u0003\u0006\u000b\u0019\t\u0017E", (short) (C1580rY.Xd() ^ (-12833)));
        String strVd = Wg.vd("\u0019\r\u000f\u000f\u0015\u0016\n\u0018", (short) (C1580rY.Xd() ^ (-21206)));
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra(strVd);
        } catch (Throwable th) {
            AFLogger.afErrorLog(strXd, th);
            stringExtra = null;
        }
        if (stringExtra != null && AFa1ySDK.d_(context).getString(strVd, null) != null) {
            AFa1ySDK.getRevenue().AFAdRevenueData(context, stringExtra);
            return;
        }
        AFLogger.afInfoLog(Qg.kd("\n1'.\"(#\u001b}\"&&\u0012\u001c\u001bo\u001f\u001b\f\u000e\f\t\u001a\u001av\t\u0006\u0007\n\u0016\u0004\u0010<~{\u0006\u0005|z", (short) (ZN.Xd() ^ 11029), (short) (ZN.Xd() ^ 29505)));
        AFa1ySDK.getRevenue().b_(context, intent);
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (C1607wl.Xd() ^ 5248), (short) (C1607wl.Xd() ^ 14024))).getMethod(C1561oA.ud("-*8\u0013#$+ %\"\t\u001c(\u001a\u001f\u001c(", (short) (C1499aX.Xd() ^ (-1505))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            String strYd = C1561oA.yd("u\u0001}=o{p}yrl5|jrgkog-GKOO;EDVH::8DC5A", (short) (Od.Xd() ^ (-25302)));
            Intent intent2 = new Intent(strYd);
            Class<?> cls = Class.forName(C1561oA.Yd("Q_Vec^Z%[hhoakr-pn0SehqhonWlznut\u0003", (short) (OY.Xd() ^ 8634)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1499aX.Xd() ^ (-25252));
            short sXd2 = (short) (C1499aX.Xd() ^ (-5921));
            int[] iArr = new int["\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")c\u007f&-\u001f)0".length()];
            QB qb = new QB("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")c\u007f&-\u001f)0");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {intent2, 0};
            Method method2 = cls.getMethod(Jg.Wd("c\u007fA7\u001c= tU0\u0012t\u0017\u0003P*(\u0005\u0019\u001c[BA", (short) (C1607wl.Xd() ^ 145), (short) (C1607wl.Xd() ^ 16028)), clsArr);
            try {
                method2.setAccessible(true);
                for (ResolveInfo resolveInfo : (List) method2.invoke(packageManager, objArr2)) {
                    String action = intent.getAction();
                    String str = ((PackageItemInfo) resolveInfo.activityInfo).packageName;
                    Class<?> cls2 = Class.forName(ZO.xd("K\u0011\u0003v7\u0001\u0004RVg4\u0004K!VKd!\u001fjWM)", (short) (C1499aX.Xd() ^ (-2074)), (short) (C1499aX.Xd() ^ (-3107))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (Od.Xd() ^ (-18863));
                    short sXd4 = (short) (Od.Xd() ^ (-247));
                    int[] iArr2 = new int["VU\u0016\u001e{`xx\u0012\u0018lQ4U".length()];
                    QB qb2 = new QB("VU\u0016\u001e{`xx\u0012\u0018lQ4U");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                    try {
                        method3.setAccessible(true);
                        if (str.equals((String) method3.invoke(context, objArr3)) && strYd.equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                            AFLogger.afInfoLog(new StringBuilder(Ig.wd("\u0010[0\u0007\u0007O\t6b.\u001c\tWW;#\\'tp7_\u001c\u0018\f}", (short) (C1633zX.Xd() ^ (-4507)))).append(((PackageItemInfo) resolveInfo.activityInfo).name).toString());
                            try {
                                ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                            } catch (Throwable th2) {
                                AFLogger.afErrorLog(new StringBuilder(strXd).append(((PackageItemInfo) resolveInfo.activityInfo).name).toString(), th2);
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
