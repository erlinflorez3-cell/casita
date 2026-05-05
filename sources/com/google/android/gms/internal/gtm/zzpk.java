package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzpk {
    protected final zzpt zza;
    protected final zzpp zzb;
    protected final Clock zzc;
    protected final zzgu zzd;
    private final int zze;

    public zzpk(int i2, zzpt zzptVar, zzpp zzppVar, zzgu zzguVar, Clock clock) {
        this.zza = (zzpt) Preconditions.checkNotNull(zzptVar);
        Preconditions.checkNotNull(zzptVar.zza());
        this.zze = i2;
        this.zzb = (zzpp) Preconditions.checkNotNull(zzppVar);
        this.zzc = (Clock) Preconditions.checkNotNull(clock);
        this.zzd = zzguVar;
    }

    protected abstract void zza(zzpv zzpvVar);

    public final void zzb(int i2, int i3) throws Throwable {
        zzgu zzguVar = this.zzd;
        if (zzguVar != null && i3 == 0 && i2 == 3) {
            zzguVar.zzd();
        }
        zzho.zzd("Failed to fetch the container resource for the container \"" + this.zza.zza().zzb() + "\": " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "Unknown reason" : "Server error" : "IOError" : "Resource not available"));
        zza(new zzpv(Status.RESULT_INTERNAL_ERROR, i3, null, null));
    }

    public final void zzc(byte[] bArr) throws Throwable {
        zzpv zzpvVarZza;
        zzpv zzpvVar;
        try {
            zzpvVarZza = this.zzb.zza(bArr);
        } catch (zzpi unused) {
            zzho.zzc("Resource data is corrupted");
            zzpvVarZza = null;
        }
        zzgu zzguVar = this.zzd;
        if (zzguVar != null && this.zze == 0) {
            zzguVar.zze();
        }
        if (zzpvVarZza == null || zzpvVarZza.getStatus() != Status.RESULT_SUCCESS) {
            zzpvVar = new zzpv(Status.RESULT_INTERNAL_ERROR, this.zze, null, null);
        } else {
            zzpvVar = new zzpv(Status.RESULT_SUCCESS, this.zze, new zzpu(this.zza.zza(), bArr, zzpvVarZza.zzb().zzc(), this.zzc.currentTimeMillis()), zzpvVarZza.zzc());
        }
        zza(zzpvVar);
    }
}
