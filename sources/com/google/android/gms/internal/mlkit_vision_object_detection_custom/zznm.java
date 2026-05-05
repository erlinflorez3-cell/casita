package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zznm {
    private Long zza;
    private zznz zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;
    private zzav zzf;

    public final zznm zzb(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zznm zzc(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zznm zzd(Long l2) {
        long jLongValue = l2.longValue();
        this.zza = Long.valueOf((jLongValue + Long.MAX_VALUE) - (jLongValue | Long.MAX_VALUE));
        return this;
    }

    public final zznm zze(zznz zznzVar) {
        this.zzb = zznzVar;
        return this;
    }

    public final zznm zzf(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zznm zzg(zzav zzavVar) {
        this.zzf = zzavVar;
        return this;
    }

    public final zzno zzh() {
        return new zzno(this, null);
    }
}
