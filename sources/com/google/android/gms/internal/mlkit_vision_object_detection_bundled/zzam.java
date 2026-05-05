package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
final class zzam extends zzs implements Serializable {
    final Object zza;
    final Object zzb;

    zzam(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzs, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzs, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
