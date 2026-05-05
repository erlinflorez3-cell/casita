package com.google.android.gms.internal.mlkit_common;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zza extends Handler {
    public zza() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\u0014\u0017Pm\u0010\u000f\u000f\u0003\u000f", (short) (C1633zX.Xd() ^ (-8675)), (short) (C1633zX.Xd() ^ (-30430)))).getDeclaredMethod(hg.Vd("VSa9LSW4VUUIU", (short) (C1499aX.Xd() ^ (-4945)), (short) (C1499aX.Xd() ^ (-17971))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zza(Looper looper) throws Throwable {
        super(looper);
        Class<?> cls = Class.forName(C1561oA.ud("\u001a&\u001b($\u001d\u0017_ #\\y\u001c\u001b\u001b\u000f\u001b", (short) (C1499aX.Xd() ^ (-29582))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-15186));
        int[] iArr = new int["\u0006\u0003\u0011h\u0004\u000b\u000fk\u0006\u0005\u0005x\r".length()];
        QB qb = new QB("\u0006\u0003\u0011h\u0004\u000b\u000fk\u0006\u0005\u0005x\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
