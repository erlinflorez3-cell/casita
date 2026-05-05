package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.Jg;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbr {
    public static Context zza(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("pLZ\u0002Ys\bgu\u0013,\u000b\u0015<[m\u001dZ2NX\fb", (short) (Od.Xd() ^ (-14788)), (short) (Od.Xd() ^ (-43)))).getMethod(ZO.xd("3\f\u0004\u0015;]s297\u0016\u0013\u0014\f9#$B\u001eQ ", (short) (Od.Xd() ^ (-32267)), (short) (Od.Xd() ^ (-22171))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            return context2 != null ? context2 : context;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
