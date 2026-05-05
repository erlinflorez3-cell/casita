package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmz {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzmz zza(Long l2) {
        this.zzc = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmz zzb(Long l2) {
        this.zzd = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmz zzc(Long l2) {
        long jLongValue = l2.longValue();
        this.zza = Long.valueOf((jLongValue + Long.MAX_VALUE) - (jLongValue | Long.MAX_VALUE));
        return this;
    }

    public final zzmz zzd(Long l2) {
        this.zze = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmz zze(Long l2) {
        this.zzb = Long.valueOf((-1) - (((-1) - l2.longValue()) | ((-1) - Long.MAX_VALUE)));
        return this;
    }

    public final zzmz zzf(Long l2) {
        this.zzf = Long.valueOf((-1) - (((-1) - l2.longValue()) | ((-1) - Long.MAX_VALUE)));
        return this;
    }

    public final zznb zzg() {
        return new zznb(this, null);
    }
}
