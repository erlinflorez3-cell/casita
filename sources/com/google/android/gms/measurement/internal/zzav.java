package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzav {
    private static volatile Handler zza = null;
    private final zzjc zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzav(zzjc zzjcVar) {
        Preconditions.checkNotNull(zzjcVar);
        this.zzb = zzjcVar;
        this.zzc = new zzay(this, zzjcVar);
    }

    private final Handler zzd() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzav.class) {
            if (zza == null) {
                Context contextZza = this.zzb.zza();
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Yd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (C1633zX.Xd() ^ (-4301)))).getMethod(Xg.qd("ml|VktzY}~\u0001v\u0005", (short) (C1607wl.Xd() ^ 22725), (short) (C1607wl.Xd() ^ 21110)), new Class[0]);
                try {
                    method.setAccessible(true);
                    zza = new com.google.android.gms.internal.measurement.zzdh((Looper) method.invoke(contextZza, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            handler = zza;
        }
        return handler;
    }

    final void zza() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long j2) {
        zza();
        if (j2 >= 0) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            Handler handlerZzd = zzd();
            Runnable runnable = this.zzc;
            Class<?> cls = Class.forName(Jg.Wd("*\u0018\u0002\u007fpZI\u00038<jt\u0002~h`-:", (short) (OY.Xd() ^ 3921), (short) (OY.Xd() ^ 32663)));
            Class<?>[] clsArr = {Class.forName(ZO.xd(">8\\K1?\u001cb@U'\u000eu\u000b.]\u0018d", (short) (C1607wl.Xd() ^ 1279), (short) (C1607wl.Xd() ^ 13123))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            short sXd = (short) (C1633zX.Xd() ^ (-4292));
            short sXd2 = (short) (C1633zX.Xd() ^ (-10500));
            int[] iArr = new int["+\u000f$9\u0007P^\b?W$".length()];
            QB qb = new QB("+\u000f$9\u0007P^\b?W$");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(handlerZzd, objArr)).booleanValue()) {
                    return;
                }
                this.zzb.zzj().zzg().zza(Ig.wd("'t)MD\u0017HJz\t\\0fgpa\u0004|l;\u0002*\u0013-^;R~=-\u0014/v+/rH", (short) (OY.Xd() ^ 2994)), Long.valueOf(j2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public abstract void zzb();

    public final boolean zzc() {
        return this.zzd != 0;
    }
}
