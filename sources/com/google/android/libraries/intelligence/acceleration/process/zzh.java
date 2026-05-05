package com.google.android.libraries.intelligence.acceleration.process;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzh {
    private static final AtomicBoolean zza = new AtomicBoolean(false);

    static void zza(Context context) throws Throwable {
        if (zza.getAndSet(true)) {
            return;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1607wl.Xd() ^ 11812), (short) (C1607wl.Xd() ^ 7568))).getMethod(hg.Vd("\u001b\u0018&q \u001f\u001a\u0016\u000f\f\u001e\u0012\u0017\u0015h\u0014\u0012\u0017\u0007\u0019\u0014", (short) (Od.Xd() ^ (-6205)), (short) (Od.Xd() ^ (-17367))), new Class[0]);
        try {
            method.setAccessible(true);
            Application application = (Application) ((Context) method.invoke(context, objArr));
            Object[] objArr2 = {new zzg()};
            Method method2 = Class.forName(C1561oA.ud("nzo|xqk4fts0Bpojf_\\nbge", (short) (ZN.Xd() ^ 520))).getMethod(C1561oA.Yd("H<?BMOAO\u001fBTJXLX^2PNNMdOYS2Q]^UUXaj", (short) (ZN.Xd() ^ 648)), Class.forName(C1561oA.yd("\u001f+$11*(p\u0017%(dz),'\u0017\u0010\u0011#\u001b \"Vf\b\u001c\u0010 \u0012 $i\u0006\u0006\u0004\u0005\u001a\u0007\u000fzWx\u0003\u0006z|}x\u007f", (short) (C1499aX.Xd() ^ (-1643)))));
            try {
                method2.setAccessible(true);
                method2.invoke(application, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
