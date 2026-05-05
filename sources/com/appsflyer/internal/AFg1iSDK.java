package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1iSDK {
    public static boolean getMonetizationNetwork(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (Od.Xd() ^ (-15165)))).getMethod(Wg.Zd("\u0001%#ii_V7,\u000edc_F;$ ", (short) (C1633zX.Xd() ^ (-431)), (short) (C1633zX.Xd() ^ (-7212))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![\u001f\u001d^\u0002\u0014\u0017 \u0017\u001e\u001d\u0006\u001b)\u001d$#1", (short) (C1607wl.Xd() ^ 31251))).getMethod(Wg.vd("\u001c'y *,\u0016$\u001fl\u0019\u001a", (short) (FB.Xd() ^ 5222)), new Class[0]);
            try {
                method2.setAccessible(true);
                return ((Boolean) method2.invoke(packageManager, objArr2)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
