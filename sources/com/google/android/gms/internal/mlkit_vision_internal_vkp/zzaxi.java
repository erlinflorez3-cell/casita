package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxi {
    private long zza;
    private long zzb;
    private final zzkw zzc = new zzkw();
    private final zzkw zzd = new zzkw();
    private final zzkw zze = new zzkw();
    private int zzf;

    public final zzavd zza() {
        zzkj.zzf(this.zza != 0);
        zzkj.zzf(this.zzb != 0);
        long j2 = this.zzb - this.zza;
        zzavd zzavdVar = new zzavd();
        zzavdVar.zzd(Long.valueOf(j2));
        zzavdVar.zzh(this.zzc.zzc());
        zzavdVar.zzg(this.zzd.zzc());
        zzavdVar.zze(this.zze.zzc());
        int i2 = this.zzf;
        if (i2 != 0) {
            zzavdVar.zzf(Integer.valueOf(i2));
        }
        return zzavdVar;
    }

    public final void zzb(zzave zzaveVar) {
        this.zze.zzb(zzaveVar);
    }

    public final void zzc(zzave zzaveVar) {
        this.zzd.zzb(zzaveVar);
    }

    public final void zzd(zzave zzaveVar) {
        this.zzc.zzb(zzaveVar);
    }

    public final void zze() {
        this.zzb = SystemClock.elapsedRealtime();
    }

    public final void zzf(int i2) {
        this.zzf = i2;
    }

    public final void zzg() {
        this.zza = SystemClock.elapsedRealtime();
    }
}
