package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgs {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final zzid zze;
    private final zzpo zzf;
    private final ExecutorService zzg;
    private final ScheduledExecutorService zzh;
    private final com.google.android.gms.tagmanager.zzco zzi;
    private final Clock zzj;
    private final zzgu zzk;
    private zzic zzl;
    private volatile int zzm = 1;
    private List zzn = new ArrayList();
    private ScheduledFuture zzo = null;
    private boolean zzp = false;

    zzgs(Context context, String str, String str2, String str3, zzid zzidVar, zzpo zzpoVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, com.google.android.gms.tagmanager.zzco zzcoVar, Clock clock, zzgu zzguVar) {
        this.zza = context;
        String str4 = (String) Preconditions.checkNotNull(str);
        this.zzb = str4;
        this.zze = (zzid) Preconditions.checkNotNull(zzidVar);
        this.zzf = (zzpo) Preconditions.checkNotNull(zzpoVar);
        ExecutorService executorService2 = (ExecutorService) Preconditions.checkNotNull(executorService);
        this.zzg = executorService2;
        this.zzh = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        com.google.android.gms.tagmanager.zzco zzcoVar2 = (com.google.android.gms.tagmanager.zzco) Preconditions.checkNotNull(zzcoVar);
        this.zzi = zzcoVar2;
        this.zzj = (Clock) Preconditions.checkNotNull(clock);
        this.zzk = (zzgu) Preconditions.checkNotNull(zzguVar);
        this.zzc = str3;
        this.zzd = str2;
        this.zzn.add(new zzgz("gtm.load", new Bundle(), "gtm", new Date(), false, zzcoVar2));
        zzho.zzd("Container " + str4 + "is scheduled for loading.");
        executorService2.execute(new zzgn(this, null));
    }

    static /* bridge */ /* synthetic */ void zzr(zzgs zzgsVar, long j2) {
        ScheduledFuture scheduledFuture = zzgsVar.zzo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        zzho.zzd("Refresh container " + zzgsVar.zzb + " in " + j2 + "ms.");
        zzgsVar.zzo = zzgsVar.zzh.schedule(new zzgj(zzgsVar), j2, TimeUnit.MILLISECONDS);
    }

    public final void zzs() {
        this.zzg.execute(new zzgi(this));
    }

    public final void zzt(zzgz zzgzVar) {
        this.zzg.execute(new zzgo(this, zzgzVar));
    }
}
