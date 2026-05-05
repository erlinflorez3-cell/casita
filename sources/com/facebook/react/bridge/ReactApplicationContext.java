package com.facebook.react.bridge;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReactApplicationContext extends ReactContext {
    /* JADX WARN: Illegal instructions before constructor call */
    public ReactApplicationContext(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd(",8-:6/)q&1/4$,1i})',\u001c.)", (short) (C1607wl.Xd() ^ 10438), (short) (C1607wl.Xd() ^ 27626))).getMethod(C1561oA.ud("pm{Gutokdasglj>igl\\ni", (short) (C1580rY.Xd() ^ (-4983))), new Class[0]);
        try {
            method.setAccessible(true);
            super((Context) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
