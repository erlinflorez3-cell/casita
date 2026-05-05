package com.google.android.gms.common.util;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1633zX;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd {
    public static boolean zza() throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-1110));
        short sXd2 = (short) (C1633zX.Xd() ^ (-11581));
        int[] iArr = new int["YeZgc\\V\u001f_b\u001c9[ZZNZ".length()];
        QB qb = new QB("YeZgc\\V\u001f_b\u001c9[ZZNZ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(hg.Vd("olzRelpMonnbn", (short) (C1580rY.Xd() ^ (-13102)), (short) (C1580rY.Xd() ^ (-13872))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)) == Looper.myLooper();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
