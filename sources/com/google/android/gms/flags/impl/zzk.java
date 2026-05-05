package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzk implements Callable<SharedPreferences> {
    private final /* synthetic */ Context val$context;

    zzk(Context context) {
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        Context context = this.val$context;
        Object[] objArr = {C1561oA.ud("\u0019 \u001f\u0016\u001a\u0012\u000b\u001e\u000e\u0014\u0007\r\u0012\u0006\u000b\u0016", (short) (ZN.Xd() ^ 18576)), 0};
        Method method = Class.forName(C1561oA.yd("DPIVVOM\u0016NY[`T\\e\u001e6ach\\nm", (short) (Od.Xd() ^ (-19212)))).getMethod(Xg.qd("\r\f\u001c{\u0012\f\u001e\u0012\u0012~\"\u0016\u0018\u0018&\u001a$\u001a\u001d,", (short) (C1633zX.Xd() ^ (-31088)), (short) (C1633zX.Xd() ^ (-8132))), Class.forName(C1561oA.Yd("\u0017\u000f%\u0011^\u001e\u0014\"\u001cc\n,+#)#", (short) (Od.Xd() ^ (-4457)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
