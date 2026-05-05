package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Process;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1626yg;
import yg.Ig;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgg {
    private static final Object zza = new Object();
    private static zzgg zzb = null;
    private volatile AdvertisingIdClient.Info zzg;
    private volatile long zzh;
    private volatile long zzi;
    private final Context zzj;
    private final Clock zzk;
    private final Thread zzl;
    private volatile long zzc = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    private volatile long zzd = 30000;
    private volatile boolean zze = true;
    private volatile boolean zzf = false;
    private final Object zzm = new Object();
    private final zzgf zzn = new zzgd(this);

    public zzgg(Context context, zzgf zzgfVar, Clock clock) throws Throwable {
        this.zzk = clock;
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("\u0004|\u0015a\u0013\u001e|}MFabY^_v\u0003q].E}j", (short) (OY.Xd() ^ 31852), (short) (OY.Xd() ^ 4441))).getMethod(Ig.wd("1w\u0019\n`+\u0007T'5F]81\u0002T\u0016\u0012[bG", (short) (ZN.Xd() ^ 8316)), new Class[0]);
            try {
                method.setAccessible(true);
                this.zzj = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            this.zzj = null;
        }
        this.zzh = clock.currentTimeMillis();
        this.zzl = new Thread(new zzge(this));
    }

    public static zzgg zzb(Context context) {
        if (zzb == null) {
            synchronized (zza) {
                if (zzb == null) {
                    zzgg zzggVar = new zzgg(context, null, DefaultClock.getInstance());
                    zzb = zzggVar;
                    zzggVar.zzl.start();
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zze(zzgg zzggVar) {
        Process.setThreadPriority(10);
        while (true) {
            boolean z2 = zzggVar.zzf;
            AdvertisingIdClient.Info infoZza = zzggVar.zze ? zzggVar.zzn.zza() : null;
            if (infoZza != null) {
                zzggVar.zzg = infoZza;
                zzggVar.zzi = zzggVar.zzk.currentTimeMillis();
                zzho.zzc("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (zzggVar) {
                zzggVar.notifyAll();
            }
            try {
                synchronized (zzggVar.zzm) {
                    zzggVar.zzm.wait(zzggVar.zzc);
                }
            } catch (InterruptedException unused) {
                zzho.zzc("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private final void zzg() {
        if (this.zzk.currentTimeMillis() - this.zzi > 3600000) {
            this.zzg = null;
        }
    }

    private final void zzh() {
        if (this.zzk.currentTimeMillis() - this.zzh > this.zzd) {
            synchronized (this.zzm) {
                this.zzm.notify();
            }
            this.zzh = this.zzk.currentTimeMillis();
        }
    }

    private final void zzi() {
        synchronized (this) {
            try {
                zzh();
                wait(500L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public final String zzc() {
        if (this.zzg == null) {
            zzi();
        } else {
            zzh();
        }
        zzg();
        if (this.zzg == null) {
            return null;
        }
        return this.zzg.getId();
    }

    public final boolean zzf() {
        if (this.zzg == null) {
            zzi();
        } else {
            zzh();
        }
        zzg();
        if (this.zzg == null) {
            return true;
        }
        return this.zzg.isLimitAdTrackingEnabled();
    }
}
