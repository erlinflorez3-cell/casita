package com.journeyapps.barcodescanner;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1633zX;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class Util {
    public static void validateMainThread() {
        short sXd = (short) (C1633zX.Xd() ^ (-8584));
        int[] iArr = new int["\"0'6,'#m(-h\b$%'\u001dC".length()];
        QB qb = new QB("\"0'6,'#m(-h\b$%'\u001dC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("SP^6IPT1SRRFR", (short) (C1580rY.Xd() ^ (-32562)), (short) (C1580rY.Xd() ^ (-10860))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)) == Looper.myLooper()) {
                return;
            }
            short sXd2 = (short) (C1499aX.Xd() ^ (-26583));
            short sXd3 = (short) (C1499aX.Xd() ^ (-23596));
            int[] iArr2 = new int["W~{{&gi#eblkca\u001calhe\u0017j]Y\u0013_RY]\u000eaT]OJL\u0015".length()];
            QB qb2 = new QB("W~{{&gi#eblkca\u001calhe\u0017j]Y\u0013_RY]\u000eaT]OJL\u0015");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                i3++;
            }
            throw new IllegalStateException(new String(iArr2, 0, i3));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
