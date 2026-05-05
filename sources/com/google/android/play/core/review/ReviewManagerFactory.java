package com.google.android.play.core.review;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1607wl;
import yg.Jg;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public class ReviewManagerFactory {
    private ReviewManagerFactory() {
    }

    public static ReviewManager create(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("'Zb\u001a)M{O7l}.25\u001e`(n\u0011AD\u0011/", (short) (C1580rY.Xd() ^ (-24646)), (short) (C1580rY.Xd() ^ (-28425)))).getMethod(ZO.xd("|Hh26B&ml\f=l##\u001d\u0006S\u0007\u0007h[", (short) (C1607wl.Xd() ^ 19470), (short) (C1607wl.Xd() ^ 27376)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            if (context2 != null) {
                context = context2;
            }
            return new zzd(new zzi(context));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
