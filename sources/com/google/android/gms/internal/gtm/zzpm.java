package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DefaultClock;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzpm extends zzpk {
    final /* synthetic */ zzpo zze;
    private final zzpl zzf;
    private final List zzg;
    private final int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzpm(zzpo zzpoVar, int i2, zzpt zzptVar, zzpp zzppVar, List list, int i3, zzpl zzplVar, zzgu zzguVar) {
        super(i2, zzptVar, zzppVar, zzguVar, DefaultClock.getInstance());
        this.zze = zzpoVar;
        this.zzf = zzplVar;
        this.zzg = list;
        this.zzh = i3;
    }

    @Override // com.google.android.gms.internal.gtm.zzpk
    protected final void zza(zzpv zzpvVar) {
        if (zzpvVar.getStatus() == Status.RESULT_SUCCESS) {
            zzho.zzd("Container resource successfully loaded from ".concat(zzpvVar.zzd()));
            if (zzpvVar.zza() == 0) {
                zzpu zzpuVarZzb = zzpvVar.zzb();
                if (!zzpuVarZzb.zzb().zzg()) {
                    this.zze.zzd(zzpvVar.getStatus(), zzpuVarZzb);
                    if (zzpuVarZzb.zzd() != null && zzpuVarZzb.zzd().length > 0) {
                        this.zze.zzc.zzg(zzpuVarZzb.zzb().zzd(), zzpuVarZzb.zzd());
                    }
                }
            }
            this.zzf.zza(zzpvVar);
            return;
        }
        zzho.zzd("Cannot fetch a valid resource from " + zzpvVar.zzd() + ". Response status: " + (true != zzpvVar.getStatus().isSuccess() ? "FAILURE" : "SUCCESS"));
        if (zzpvVar.getStatus().isSuccess()) {
            zzho.zzd("Response source: ".concat(zzpvVar.zzd()));
            zzho.zzd("Response size: " + zzpvVar.zzb().zzd().length);
        }
        this.zze.zzb(this.zza, this.zzg, this.zzh + 1, this.zzf, this.zzd);
    }
}
