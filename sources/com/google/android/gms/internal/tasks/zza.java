package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zza extends Handler {
    private final Looper zza;

    public zza() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("bpgvtok6x}9X|}\u007fu\u0004", (short) (C1633zX.Xd() ^ (-25214)))).getDeclaredMethod(Xg.qd("0/?\u0019.7=\u001c@AC9G", (short) (C1499aX.Xd() ^ (-11660)), (short) (C1499aX.Xd() ^ (-3485))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zza(Looper looper) throws Throwable {
        super(looper);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd("yce\u0001*18/|}d\u0010An{}7", (short) (ZN.Xd() ^ 1751), (short) (ZN.Xd() ^ 31663))).getDeclaredMethod(ZO.xd("\u001erB|{L<vk'~\u001aO", (short) (Od.Xd() ^ (-25662)), (short) (Od.Xd() ^ (-25543))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zza = (Looper) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
