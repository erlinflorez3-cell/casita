package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.Clock;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgz implements Clock {
    private final Bundle zza;
    private final String zzb;
    private final Date zzc;
    private final String zzd;
    private Map zze;
    private boolean zzf;
    private final com.google.android.gms.tagmanager.zzco zzg;

    public zzgz(String str, Bundle bundle, String str2, Date date, boolean z2, com.google.android.gms.tagmanager.zzco zzcoVar) {
        this.zzb = str;
        this.zza = bundle == null ? new Bundle() : bundle;
        this.zzc = date;
        this.zzd = str2;
        this.zzf = z2;
        this.zzg = zzcoVar;
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentTimeMillis() {
        return this.zzc.getTime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long nanoTime() {
        return System.nanoTime();
    }

    public final Bundle zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map zzd() {
        if (this.zze == null) {
            try {
                this.zze = this.zzg.zzb();
            } catch (RemoteException e2) {
                zzho.zza("Error calling measurement proxy:".concat(String.valueOf(e2.getMessage())));
            }
        }
        return this.zze;
    }

    public final void zze(boolean z2) {
        this.zzf = false;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
