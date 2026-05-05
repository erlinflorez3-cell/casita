package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zao extends ContextCompat {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!zan.zaa()) {
            Class<?> cls = Class.forName(EO.Od("` Dq.uTeZ*#KgnpK\u000eX~=m8^", (short) (C1499aX.Xd() ^ (-21192))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1580rY.Xd() ^ (-21715));
            int[] iArr = new int["u\u0002v\u0004\u007fxr;ozx}muz3Fuqbdb_ppM_\\]`lZf".length()];
            QB qb = new QB("u\u0002v\u0004\u007fxr;ozx}muz3Fuqbdb_ppM_\\]`lZf");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Class.forName(C1593ug.zd("&4+:83/y0==D6@G\u0002\u001eDK=GN!EIRDR", (short) (ZN.Xd() ^ 3207), (short) (ZN.Xd() ^ 6766)));
            Object[] objArr = {broadcastReceiver, intentFilter};
            Method method = cls.getMethod(C1561oA.od("\u001d\u000f\u0010\u0011\u001a\u001a\n\u0016t\u0007\u0004\u0005\b\u0014\u0002\u000e", (short) (Od.Xd() ^ (-19639))), clsArr);
            try {
                method.setAccessible(true);
                return (Intent) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i3 = true != zan.zaa() ? 0 : 2;
        Class<?> cls2 = Class.forName(Jg.Wd("b_\u0006D1\u001bD>c \u000f\u0007(aW\u0011D!\u0010\u0006'lX", (short) (C1580rY.Xd() ^ (-24567)), (short) (C1580rY.Xd() ^ (-6296))));
        Class<?>[] clsArr2 = new Class[3];
        short sXd2 = (short) (ZN.Xd() ^ 15889);
        short sXd3 = (short) (ZN.Xd() ^ 10336);
        int[] iArr2 = new int["D@$\u0014R]_\\\u00026?\u001b\u001b\r=D/\u0010Eu0\u007f\fX\u001d\u0011cR\u0001\frCf".length()];
        QB qb2 = new QB("D@$\u0014R]_\\\u00026?\u001b\u001b\r=D/\u0010Eu0\u007f\fX\u001d\u0011cR\u0001\frCf");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd3) + sXd2)));
            i4++;
        }
        clsArr2[0] = Class.forName(new String(iArr2, 0, i4));
        clsArr2[1] = Class.forName(C1626yg.Ud("z\u001717kHezy\u0003&.S\u00016=k5[;'\u001cPs\rQ\u00166", (short) (ZN.Xd() ^ 19516), (short) (ZN.Xd() ^ 26651)));
        clsArr2[2] = Integer.TYPE;
        Object[] objArr2 = {broadcastReceiver, intentFilter, Integer.valueOf(i3)};
        short sXd4 = (short) (ZN.Xd() ^ 9121);
        int[] iArr3 = new int["~.\\w'kJ%Fzx\u001ftuf;".length()];
        QB qb3 = new QB("~.\\w'kJ%Fzx\u001ftuf;");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd4 + i5)));
            i5++;
        }
        Method method2 = cls2.getMethod(new String(iArr3, 0, i5), clsArr2);
        try {
            method2.setAccessible(true);
            return (Intent) method2.invoke(context, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
