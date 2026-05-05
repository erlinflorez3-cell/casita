package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzog {
    private zzoh zza;
    private Integer zzb;

    public final zzog zza(zzoh zzohVar) {
        this.zza = zzohVar;
        return this;
    }

    public final zzog zzb(Integer num) {
        int iIntValue = num.intValue();
        this.zzb = Integer.valueOf((iIntValue + Integer.MAX_VALUE) - (iIntValue | Integer.MAX_VALUE));
        return this;
    }

    public final zzoj zzd() {
        return new zzoj(this, null);
    }
}
