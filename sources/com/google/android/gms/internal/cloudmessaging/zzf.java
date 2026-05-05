package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zzf extends Handler {
    private final Looper zza;

    public zzf() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("\u001f-$31,(r5:u\u00159:<2@", (short) (FB.Xd() ^ 3886))).getDeclaredMethod(Wg.Zd(")a.=\u000fL\u0010#\u0004:x#j", (short) (C1633zX.Xd() ^ (-25865)), (short) (C1633zX.Xd() ^ (-29663))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzf(Looper looper) throws Throwable {
        super(looper);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("lzq\u0001~yu@\u0003\bCb\u0007\b\n\u007f\u000e", (short) (C1633zX.Xd() ^ (-32482)))).getDeclaredMethod(Wg.vd("jgyQ`goLjimai", (short) (Od.Xd() ^ (-28377))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzf(Looper looper, Handler.Callback callback) throws Throwable {
        super(looper, callback);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("_k`mib\\%eh\"?a``T`", (short) (C1607wl.Xd() ^ 21782), (short) (C1607wl.Xd() ^ 29645))).getDeclaredMethod(hg.Vd("52@\u0018+26\u0013544(4", (short) (FB.Xd() ^ 30863), (short) (FB.Xd() ^ 468)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
