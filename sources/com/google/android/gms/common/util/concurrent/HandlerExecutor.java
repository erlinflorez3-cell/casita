package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class HandlerExecutor implements Executor {
    private final Handler zza;

    public HandlerExecutor(Looper looper) {
        this.zza = new zzh(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws Throwable {
        Handler handler = this.zza;
        Object[] objArr = {runnable};
        Method method = Class.forName(Wg.Zd("mm\u001dt*5*|9>2\u0016g\u0006u\u0007zI", (short) (ZN.Xd() ^ 12971), (short) (ZN.Xd() ^ 22303))).getMethod(Wg.vd("\u0004\u0002\u0005\u0005", (short) (OY.Xd() ^ 13592)), Class.forName(C1561oA.Xd("80F2\u007f?5C=\u0005*NHI=?JD", (short) (Od.Xd() ^ (-28394)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
