package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzej {
    private zzem zza;
    private Integer zzb;
    private zzoc zzc;

    public final zzej zza(Integer num) {
        int iIntValue = num.intValue();
        this.zzb = Integer.valueOf((iIntValue + Integer.MAX_VALUE) - (iIntValue | Integer.MAX_VALUE));
        return this;
    }

    public final zzej zzb(zzoc zzocVar) {
        this.zzc = zzocVar;
        return this;
    }

    public final zzej zzc(zzem zzemVar) {
        this.zza = zzemVar;
        return this;
    }

    public final zzeo zze() {
        return new zzeo(this, null);
    }
}
