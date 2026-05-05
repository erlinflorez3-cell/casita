package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzew;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.android.gms.internal.gtm.zzft;
import com.google.android.gms.internal.gtm.zzfv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class GoogleAnalytics extends zza {
    private static List zzb = new ArrayList();
    private boolean zzc;
    private final Set zzd;
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    public GoogleAnalytics(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzd = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzbx.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            List list = zzb;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                zzb = null;
            }
        }
    }

    public void dispatchLocalHits() throws Throwable {
        zzb().zzf().zzc();
    }

    public void enableAutoActivityReports(Application application) throws Throwable {
        if (this.zze) {
            return;
        }
        Object[] objArr = {new zze(this)};
        Method method = Class.forName(Qg.kd("]i^kg`Z#Ucb\u001f1_^YUNK]QVT", (short) (C1607wl.Xd() ^ 17137), (short) (C1607wl.Xd() ^ 8764))).getMethod(C1561oA.ud("'\u0019\u001a\u001b$$\u0014 m\u000f\u001f\u0013\u001f\u0011\u001b\u001fp\r\t\u0007\u0004\u0019\u0002\n\u0002^{\u0006\u0005ywx\u007f\u0007", (short) (FB.Xd() ^ 7248)), Class.forName(hg.Vd("`lanjc]&Xfe\"4ba\\XQN`TYW\f(IYMYKUY+GCA>S<D<\u00196@?423:A", (short) (ZN.Xd() ^ 29431), (short) (ZN.Xd() ^ 16302))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
            this.zze = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    @Deprecated
    public Logger getLogger() {
        return zzfc.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    public Tracker newTracker(int i2) {
        Tracker tracker;
        zzft zzftVar;
        synchronized (this) {
            tracker = new Tracker(zzb(), null, null);
            if (i2 > 0 && (zzftVar = (zzft) new zzfs(zzb()).zza(i2)) != null) {
                tracker.zzm(zzftVar);
            }
            tracker.zzW();
        }
        return tracker;
    }

    public Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzb(), str, null);
            tracker.zzW();
        }
        return tracker;
    }

    public void reportActivityStart(Activity activity) {
        if (this.zze) {
            return;
        }
        zzh(activity);
    }

    public void reportActivityStop(Activity activity) {
        if (this.zze) {
            return;
        }
        zzi(activity);
    }

    public void setAppOptOut(boolean z2) {
        this.zzg = z2;
        if (this.zzg) {
            zzb().zzf().zzg();
        }
    }

    public void setDryRun(boolean z2) {
        this.zzf = z2;
    }

    public void setLocalDispatchPeriod(int i2) {
        zzb().zzf().zzl(i2);
    }

    @Deprecated
    public void setLogger(Logger logger) {
        zzfc.zzc(logger);
        if (this.zzh) {
            return;
        }
        String str = "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzew.zzc.zzb()) + " DEBUG";
        this.zzh = true;
    }

    public final void zzg() {
        zzfv zzfvVarZzq = zzb().zzq();
        zzfvVarZzq.zzf();
        if (zzfvVarZzq.zze()) {
            setDryRun(zzfvVarZzq.zzc());
        }
        zzfvVarZzq.zzf();
        this.zzc = true;
    }

    final void zzh(Activity activity) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zza(activity);
        }
    }

    final void zzi(Activity activity) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzb(activity);
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    final void zzk(zzv zzvVar) {
        this.zzd.add(zzvVar);
        Context contextZza = zzb().zza();
        if (contextZza instanceof Application) {
            enableAutoActivityReports((Application) contextZza);
        }
    }

    final void zzl(zzv zzvVar) {
        this.zzd.remove(zzvVar);
    }
}
