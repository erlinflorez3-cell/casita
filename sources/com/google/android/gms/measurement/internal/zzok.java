package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzok {
    final Context zza;

    public zzok(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("7O]$:L\u007faPt\fJTw6\bV\u001b2pz&Z", (short) (Od.Xd() ^ (-30684)), (short) (Od.Xd() ^ (-15453)))).getMethod(C1561oA.Xd("\u001a\u0019)v'(%#\u001e\u001d1'..\u0004118*>;", (short) (Od.Xd() ^ (-13920))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Preconditions.checkNotNull(context2);
            this.zza = context2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
