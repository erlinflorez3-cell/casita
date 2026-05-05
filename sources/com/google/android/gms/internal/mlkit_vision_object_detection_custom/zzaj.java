package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzaj extends zzx {
    final /* synthetic */ zzal zza;
    private final Object zzb;
    private int zzc;

    zzaj(zzal zzalVar, int i2) {
        this.zza = zzalVar;
        this.zzb = zzal.zzg(zzalVar, i2);
        this.zzc = i2;
    }

    private final void zza() {
        int i2 = this.zzc;
        if (i2 == -1 || i2 >= this.zza.size() || !zzh.zza(this.zzb, zzal.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzx, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzx, java.util.Map.Entry
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
        return zzal.zzj(this.zza, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzx, java.util.Map.Entry
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
        zzal zzalVar = this.zza;
        Object objZzj = zzal.zzj(zzalVar, i2);
        zzal.zzn(zzalVar, this.zzc, obj);
        return objZzj;
    }
}
