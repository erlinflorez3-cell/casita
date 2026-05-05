package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzae extends zzs {
    final /* synthetic */ zzag zza;
    private final Object zzb;
    private int zzc;

    zzae(zzag zzagVar, int i2) {
        this.zza = zzagVar;
        this.zzb = zzag.zzg(zzagVar, i2);
        this.zzc = i2;
    }

    private final void zza() {
        int i2 = this.zzc;
        if (i2 == -1 || i2 >= this.zza.size() || !zzc.zza(this.zzb, zzag.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzs, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            return null;
        }
        return zzag.zzj(this.zza, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzag zzagVar = this.zza;
        Object objZzj = zzag.zzj(zzagVar, i2);
        zzag.zzn(zzagVar, this.zzc, obj);
        return objZzj;
    }
}
