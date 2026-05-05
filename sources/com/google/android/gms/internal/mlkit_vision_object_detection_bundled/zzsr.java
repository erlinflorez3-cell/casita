package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
public enum zzsr implements zzbw {
    UNKNOWN(0),
    CANONICAL(1),
    TFLITE(2),
    TFLITE_SUPPORT(3);

    private final int zzf;

    zzsr(int i2) {
        this.zzf = i2;
    }

    public static zzsr zzb(int i2) {
        for (zzsr zzsrVar : values()) {
            if (zzsrVar.zzf == i2) {
                return zzsrVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzbw
    public final int zza() {
        return this.zzf;
    }
}
