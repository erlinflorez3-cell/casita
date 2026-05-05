package com.facetec.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.UUID;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class bz {
    bz() {
    }

    static String B(String str) {
        int iNextInt = new Random().nextInt(8);
        int i2 = iNextInt + 2;
        String strReplace = UUID.randomUUID().toString().replace(Global.HYPHEN, "");
        String string = new StringBuilder().append(strReplace.substring(0, 1)).append(i2).append(strReplace.substring(2)).toString();
        return new StringBuilder().append(string.substring(0, i2)).append(str).append(string.substring(iNextInt + 3)).toString();
    }

    static boolean B(Context context) throws Throwable {
        String strWd = Ig.wd("F\u001d(]:\u0004v9 \u0018\u001bH", (short) (C1607wl.Xd() ^ 22935));
        Class<?> cls = Class.forName(EO.Od("9\u001f\u0017EY(v\u0019\u0011A6b\"-#\u0003l\u001bRp$s\u0006", (short) (Od.Xd() ^ (-14918))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Qd("MCWA\rJ>JB\b,LI?C;", (short) (C1607wl.Xd() ^ 1873)))};
        Object[] objArr = {strWd};
        short sXd = (short) (ZN.Xd() ^ 6378);
        short sXd2 = (short) (ZN.Xd() ^ 20750);
        int[] iArr = new int[".-=\u001dD?A3<#6DI=8;".length()];
        QB qb = new QB(".-=\u001dD?A3<#6DI=8;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) method.invoke(context, objArr)).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if ((-1) - (((-1) - (activeNetworkInfo.isConnected() ? 1 : 0)) | ((-1) - (activeNetworkInfo.getType() == 1 ? 1 : 0))) != 0) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static String Code(String str) {
        int iNextInt = new Random().nextInt(8);
        int i2 = iNextInt + 2;
        String strReplace = UUID.randomUUID().toString().replace(Global.HYPHEN, "");
        String string = new StringBuilder().append(strReplace.substring(0, 1)).append(i2).append(strReplace.substring(2)).toString();
        int length = (strReplace.length() - 1) - i2;
        String string2 = new StringBuilder().append(string.substring(0, i2)).append(str.charAt(0)).append(string.substring(iNextInt + 3)).toString();
        return new StringBuilder().append(string2.substring(0, length)).append(str.charAt(1)).append(string2.substring(length + 1)).toString();
    }
}
