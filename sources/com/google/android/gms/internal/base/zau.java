package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zau extends Handler {
    private final Looper zaa;

    public zau() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("esjywrn9{\u0001<[\u007f\u0001\u0003x\u0007", (short) (C1499aX.Xd() ^ (-4104)))).getDeclaredMethod(Wg.vd("tq\u0004[jqyV\u0005\u0004\b{\u0004", (short) (C1580rY.Xd() ^ (-24517))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zaa = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zau(Looper looper) throws Throwable {
        super(looper);
        short sXd = (short) (OY.Xd() ^ 18362);
        short sXd2 = (short) (OY.Xd() ^ 18174);
        int[] iArr = new int["#/$1-& h),e\u0003%$$\u0018$".length()];
        QB qb = new QB("#/$1-& h),e\u0003%$$\u0018$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(hg.Vd("liwObimJlkk_k", (short) (C1580rY.Xd() ^ (-13623)), (short) (C1580rY.Xd() ^ (-18636))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zaa = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zau(Looper looper, Handler.Callback callback) throws Throwable {
        super(looper, callback);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("T`Ub^WQ\u001aZ]\u00174VUUIU", (short) (Od.Xd() ^ (-9819)))).getDeclaredMethod(C1561oA.yd("feuO\\ekJfgi_e", (short) (C1499aX.Xd() ^ (-32352))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zaa = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
