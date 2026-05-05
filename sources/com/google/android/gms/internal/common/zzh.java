package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class zzh extends Handler {
    private final Looper zza;

    public zzh() throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 31483);
        short sXd2 = (short) (ZN.Xd() ^ 22441);
        int[] iArr = new int["9J~:\u0001VrCL0Yr8/Tq\u0017".length()];
        QB qb = new QB("9J~:\u0001VrCL0Yr8/Tq\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Ig.wd("6\u000b(\u0018T\u0010\t.'\"%<\u001b", (short) (C1580rY.Xd() ^ (-21973))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzh(Looper looper) throws Throwable {
        super(looper);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("W5zf5\\yl\u000e#Y\u0018\u0007\u0007\u0012*\u0005", (short) (C1580rY.Xd() ^ (-28563)))).getDeclaredMethod(C1561oA.Qd("ro}UhosPrqqeq", (short) (FB.Xd() ^ 10099)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzh(Looper looper, Handler.Callback callback) throws Throwable {
        super(looper, callback);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("P^Udb]Y$fk'Fjkmcq", (short) (FB.Xd() ^ 15435), (short) (FB.Xd() ^ 11126))).getDeclaredMethod(C1561oA.od("pm{SfmqNpooco", (short) (ZN.Xd() ^ 17976)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
