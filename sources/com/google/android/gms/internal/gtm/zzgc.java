package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class zzgc extends Handler {
    private final Looper zza;

    public zzgc() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("1=2?;4.v7:s\u0011322&2", (short) (FB.Xd() ^ 9258))).getDeclaredMethod(C1561oA.yd("khvNiptQ{zzn\u0003", (short) (C1607wl.Xd() ^ 7081)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzgc(Looper looper) throws Throwable {
        super(looper);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("\u0011\u001f\u0016%#\u001e\u001ad',g\u0007+,.$2", (short) (C1580rY.Xd() ^ (-9931)))).getDeclaredMethod(Xg.qd("on~Xmv|[\u007f\u0001\u0003x\u0007", (short) (ZN.Xd() ^ 18231), (short) (ZN.Xd() ^ 5033)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzgc(Looper looper, Handler.Callback callback) throws Throwable {
        super(looper, callback);
        short sXd = (short) (FB.Xd() ^ 18250);
        short sXd2 = (short) (FB.Xd() ^ 1099);
        int[] iArr = new int[",vn]\u001auq\u001b\u001e#=\u001d!!\u00039F".length()];
        QB qb = new QB(",vn]\u001auq\u001b\u001e#=\u001d!!\u00039F");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (OY.Xd() ^ 4478);
        short sXd4 = (short) (OY.Xd() ^ 22009);
        int[] iArr2 = new int["1@y\u0003/(!Ep\ba\u001a\"".length()];
        QB qb2 = new QB("1@y\u0003/(!Ep\ba\u001a\"");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
