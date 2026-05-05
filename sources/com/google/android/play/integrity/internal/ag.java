package com.google.android.play.integrity.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class ag {
    public static Context a(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("]i^kg`Z#Wb`eU]b\u001b/ZX]M_Z", (short) (ZN.Xd() ^ 29602), (short) (ZN.Xd() ^ 21450))).getMethod(C1561oA.ud("\u001a\u0017%p\u001f\u001e\u0019\u0015\u000e\u000b\u001d\u0011\u0016\u0014g\u0013\u0011\u0016\u0006\u0018\u0013", (short) (C1499aX.Xd() ^ (-26076))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            return context2 != null ? context2 : context;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
