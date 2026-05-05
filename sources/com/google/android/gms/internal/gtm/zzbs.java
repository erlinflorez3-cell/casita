package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbs extends zzbu {
    private final zzcm zza;

    public zzbs(zzbx zzbxVar, zzby zzbyVar) {
        super(zzbxVar);
        Preconditions.checkNotNull(zzbyVar);
        this.zza = new zzcm(zzbxVar, zzbyVar);
    }

    public final long zza(zzbz zzbzVar) {
        zzV();
        Preconditions.checkNotNull(zzbzVar);
        com.google.android.gms.analytics.zzr.zzh();
        long jZzb = this.zza.zzb(zzbzVar, true);
        if (jZzb != 0) {
            return jZzb;
        }
        this.zza.zzk(zzbzVar);
        return 0L;
    }

    public final void zzc() throws Throwable {
        zzV();
        Context contextZzo = zzo();
        if (!zzfk.zzb(contextZzo) || !zzfp.zzh(contextZzo)) {
            zze(null);
            return;
        }
        Intent intent = new Intent(hg.Vd("\u0012\u001d\u001aY\u0012\u0019\u0018\u000f\u0013\u000bR\u0005\u0011\u0006\u0013\u000f\b\u0002J\u0003\b\rFx\u0005v\u0001\r\u0007zs\u0003<NZLVb\\PIXcGKTP@R@D", (short) (FB.Xd() ^ 377), (short) (FB.Xd() ^ 20767)));
        intent.setComponent(new ComponentName(contextZzo, C1561oA.ud("\u0018# _\u0018\u001f\u001e\u0015\u0019\u0011X\u000b\u0017\f\u0019\u0015\u000e\bP\t\u000e\u0013L~\u000b|\u0007\u0013\r\u0001y\tBT\u0001r|\t\u0003vo~]nz}ohi", (short) (OY.Xd() ^ 5496))));
        Class<?> cls = Class.forName(C1561oA.yd("R^Wdd][$LWY^RZc\u001cDoqvj|{", (short) (C1580rY.Xd() ^ (-10136))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ 31292);
        int[] iArr = new int["\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u0006,3%/6".length()];
        QB qb = new QB("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u0006,3%/6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {intent};
        Method method = cls.getMethod(Xg.qd("9;);>\u001e1?D836", (short) (OY.Xd() ^ 3812), (short) (OY.Xd() ^ 24809)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(contextZzo, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzdb zzdbVar) {
        zzV();
        zzq().zzi(new zzbq(this, zzdbVar));
    }

    public final void zzf(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzq().zzi(new zzbm(this, str, runnable));
    }

    public final void zzg() {
        zzV();
        zzw();
        zzq().zzi(new zzbp(this));
    }

    public final void zzh(zzez zzezVar) {
        Preconditions.checkNotNull(zzezVar);
        zzV();
        zzF("Hit delivery requested", zzezVar);
        zzq().zzi(new zzbo(this, zzezVar));
    }

    final void zzi() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zza.zzl();
    }

    final void zzj() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zza.zzm();
    }

    public final void zzk() {
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        com.google.android.gms.analytics.zzr.zzh();
        zzcm zzcmVar = this.zza;
        zzcmVar.zzV();
        zzcmVar.zzN("Service disconnected");
    }

    public final void zzl(int i2) {
        zzV();
        zzF("setLocalDispatchPeriod (sec)", Integer.valueOf(i2));
        zzq().zzi(new zzbn(this, i2));
    }

    public final void zzm() {
        this.zza.zzZ();
    }

    public final boolean zzn() {
        zzV();
        try {
            zzq().zzg(new zzbr(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e2) {
            zzR("syncDispatchLocalHits interrupted", e2);
            return false;
        } catch (ExecutionException e3) {
            zzJ("syncDispatchLocalHits failed", e3);
            return false;
        } catch (TimeoutException e4) {
            zzR("syncDispatchLocalHits timed out", e4);
            return false;
        }
    }
}
