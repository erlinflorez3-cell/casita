package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzcy {
    private static volatile Handler zza = null;
    private final zzbx zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzcy(zzbx zzbxVar) {
        Preconditions.checkNotNull(zzbxVar);
        this.zzb = zzbxVar;
        this.zzc = new zzcx(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcy.class) {
            if (zza == null) {
                Context contextZza = this.zzb.zza();
                Class<?> cls = Class.forName(Ig.wd("\u000bf*\u001c\b5`9D !\u0005GVToPnE?u`\u000e", (short) (C1633zX.Xd() ^ (-15071))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1607wl.Xd() ^ 15958);
                int[] iArr = new int["\u0018eDzq'NUXyv\fd".length()];
                QB qb = new QB("\u0018eDzq'NUXyv\fd");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    zza = new zzgc((Looper) method.invoke(contextZza, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            handler = zza;
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
    }

    public final void zze(long j2) throws Throwable {
        if (zzh()) {
            if (j2 < 0) {
                zzf();
                return;
            }
            long jAbs = j2 - Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
            long j3 = jAbs >= 0 ? jAbs : 0L;
            zzi().removeCallbacks(this.zzc);
            Handler handlerZzi = zzi();
            Runnable runnable = this.zzc;
            Class<?> cls = Class.forName(C1561oA.Qd("dpernga*jm'@XdY`Xd", (short) (Od.Xd() ^ (-9801))));
            Class<?>[] clsArr = {Class.forName(C1593ug.zd("ph~j8wm{u=b\u0007\u0001\u0002uw\u0003|", (short) (C1607wl.Xd() ^ 17493), (short) (C1607wl.Xd() ^ 8635))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j3)};
            Method method = cls.getMethod(C1561oA.od("4255\u0004$*\u001e5 \u001e", (short) (ZN.Xd() ^ 31715)), clsArr);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(handlerZzi, objArr)).booleanValue()) {
                    return;
                }
                this.zzb.zzm().zzJ(C1561oA.Kd("\u0001\u001d&*$$`62c&*1=<>j02:0I66rDDIK\u0006xNDIB", (short) (C1499aX.Xd() ^ (-11548))), Long.valueOf(j3));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j2) {
        zzf();
        if (j2 >= 0) {
            this.zzd = this.zzb.zzr().currentTimeMillis();
            Handler handlerZzi = zzi();
            Runnable runnable = this.zzc;
            short sXd = (short) (Od.Xd() ^ (-26956));
            short sXd2 = (short) (Od.Xd() ^ (-22387));
            int[] iArr = new int["z8\u001b\u001e\b&\u000eH~/NUc!\u0004pV\u0018".length()];
            QB qb = new QB("z8\u001b\u001e\b&\u000eH~/NUc!\u0004pV\u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {Class.forName(C1561oA.Xd("f^t`.mcqk3X|vwkmxr", (short) (C1499aX.Xd() ^ (-14767)))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            Method method = cls.getMethod(Wg.vd("\u0005\u0003\u0006\u0006Ttzn\u0016\u0001~", (short) (OY.Xd() ^ 25072)), clsArr);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(handlerZzi, objArr)).booleanValue()) {
                    return;
                }
                this.zzb.zzm().zzJ(Qg.kd("!;BD<:tHBqD3731A7/h,,2&=(&`0.11iZ.\"%\u001c", (short) (Od.Xd() ^ (-14273)), (short) (Od.Xd() ^ (-14836))), Long.valueOf(j2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
