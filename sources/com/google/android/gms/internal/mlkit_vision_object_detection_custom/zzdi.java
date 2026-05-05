package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdi {
    private zzdl zza;
    private Integer zzb;
    private zznb zzc;

    public final zzdi zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdi zzb(zznb zznbVar) {
        this.zzc = zznbVar;
        return this;
    }

    public final zzdi zzc(zzdl zzdlVar) {
        this.zza = zzdlVar;
        return this;
    }

    public final zzdn zze() {
        return new zzdn(this, null);
    }
}
