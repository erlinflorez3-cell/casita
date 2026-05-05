package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoa {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzoa zza(Long l2) {
        this.zzc = Long.valueOf((-1) - (((-1) - l2.longValue()) | ((-1) - Long.MAX_VALUE)));
        return this;
    }

    public final zzoa zzb(Long l2) {
        this.zzd = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoa zzc(Long l2) {
        this.zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoa zzd(Long l2) {
        long jLongValue = l2.longValue();
        this.zze = Long.valueOf((jLongValue + Long.MAX_VALUE) - (jLongValue | Long.MAX_VALUE));
        return this;
    }

    public final zzoa zze(Long l2) {
        long jLongValue = l2.longValue();
        this.zzb = Long.valueOf((jLongValue + Long.MAX_VALUE) - (jLongValue | Long.MAX_VALUE));
        return this;
    }

    public final zzoa zzf(Long l2) {
        this.zzf = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoc zzg() {
        return new zzoc(this, null);
    }
}
