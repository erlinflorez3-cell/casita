package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqt {
    private zzqu zza;
    private Boolean zzb;
    private Boolean zzc;
    private Integer zzd;
    private Float zze;
    private zzon zzf;

    public final zzqt zzb(Float f2) {
        this.zze = f2;
        return this;
    }

    public final zzqt zzc(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzqt zzd(zzon zzonVar) {
        this.zzf = zzonVar;
        return this;
    }

    public final zzqt zze(zzqu zzquVar) {
        this.zza = zzquVar;
        return this;
    }

    public final zzqt zzf(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzqt zzg(Boolean bool) {
        this.zzb = bool;
        return this;
    }

    public final zzqw zzi() {
        return new zzqw(this, null);
    }
}
