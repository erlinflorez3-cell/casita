package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzra {
    private zzqw zza;
    private zznz zzb;
    private Long zzc;
    private Long zzd;
    private zzav zze;

    public final zzra zzd(zzqw zzqwVar) {
        this.zza = zzqwVar;
        return this;
    }

    public final zzra zze(zznz zznzVar) {
        this.zzb = zznzVar;
        return this;
    }

    public final zzra zzf(Long l2) {
        long jLongValue = l2.longValue();
        this.zzd = Long.valueOf((jLongValue + Long.MAX_VALUE) - (jLongValue | Long.MAX_VALUE));
        return this;
    }

    public final zzra zzg(zzav zzavVar) {
        this.zze = zzavVar;
        return this;
    }

    public final zzra zzh(Long l2) {
        this.zzc = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzrc zzi() {
        return new zzrc(this, null);
    }
}
