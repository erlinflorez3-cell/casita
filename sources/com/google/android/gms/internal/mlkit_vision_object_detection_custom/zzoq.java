package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoq {
    private Float zza;
    private Integer zzb;
    private Integer zzc;

    public final zzoq zza(Float f2) {
        this.zza = f2;
        return this;
    }

    public final zzoq zzb(Integer num) {
        this.zzc = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzoq zzc(Integer num) {
        this.zzb = num;
        return this;
    }

    public final zzos zzd() {
        return new zzos(this, null);
    }
}
