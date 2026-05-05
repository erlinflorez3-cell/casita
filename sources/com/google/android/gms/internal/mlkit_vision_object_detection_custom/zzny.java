package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public enum zzny implements zzca {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzny(int i2) {
        this.zzf = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzca
    public final int zza() {
        return this.zzf;
    }
}
