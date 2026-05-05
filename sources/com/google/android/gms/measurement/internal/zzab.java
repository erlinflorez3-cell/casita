package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzab {
    zzab(Context context) {
    }

    public static boolean zza() throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        short sXd = (short) (C1607wl.Xd() ^ 14092);
        int[] iArr = new int["!_\u00049v&|>'n+c28-;\u0006".length()];
        QB qb = new QB("!_\u00049v&|>'n+c28-;\u0006");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Qd("=:H 3:>\u001b=<<0<", (short) (C1580rY.Xd() ^ (-1914))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
