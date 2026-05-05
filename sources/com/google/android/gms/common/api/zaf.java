package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1633zX;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    public zaf(Result result) throws Throwable {
        Class<?> cls = Class.forName(Wg.vd("\u001a(\u001f.,'#m05p\u0010457-;", (short) (C1580rY.Xd() ^ (-4130))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-23055));
        short sXd2 = (short) (C1633zX.Xd() ^ (-26819));
        int[] iArr = new int["@=K#6=A\u001e@??3?".length()];
        QB qb = new QB("@=K#6=A\u001e@??3?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            super((Looper) declaredMethod.invoke(null, objArr));
            this.zae = result;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return (R) this.zae;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
