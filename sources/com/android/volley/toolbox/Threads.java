package com.android.volley.toolbox;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.Od;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
final class Threads {
    private Threads() {
    }

    static void throwIfNotOnMainThread() throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("\u0015#\u0016%\u001f\u001a\u0012\\\u001b Wv\u0017\u0018\u0016\f\u0016", (short) (C1499aX.Xd() ^ (-28046)))).getDeclaredMethod(C1561oA.Yd("hgwQfouTxy{q\u007f", (short) (ZN.Xd() ^ 4232)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper != ((Looper) declaredMethod.invoke(null, objArr))) {
                throw new IllegalStateException(Xg.qd("_\t\b\n6y}9\u0004\n\u0013\r\n\u0005\u0005A\t\u0016\u0014\u0013F\u001c\u0011\u000fJ\u0019\u000e\u0017\u001dO%\u001a%\u0019\u0016\u001ad", (short) (Od.Xd() ^ (-6227)), (short) (Od.Xd() ^ (-7112))));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
