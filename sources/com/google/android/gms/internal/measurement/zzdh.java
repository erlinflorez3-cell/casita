package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdh extends Handler {
    public zzdh() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("\u001d+\"1/*&p38s\u001378:0>", (short) (OY.Xd() ^ 15166), (short) (OY.Xd() ^ 6578))).getDeclaredMethod(C1561oA.od("%\"0\b\u001b\"&\u0003%$$\u0018$", (short) (C1607wl.Xd() ^ 25706)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzdh(Looper looper) throws Throwable {
        super(looper);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u001c!\\{ !#\u0019'", (short) (FB.Xd() ^ 5544))).getDeclaredMethod(Wg.Zd("l\"/E\u0017tWVWMk>)", (short) (C1580rY.Xd() ^ (-8979)), (short) (C1580rY.Xd() ^ (-12090))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
