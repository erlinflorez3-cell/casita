package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public enum zzrv implements zzca {
    UNKNOWN(0),
    CANONICAL(1),
    TFLITE(2),
    TFLITE_SUPPORT(3);

    private final int zzf;

    zzrv(int i2) {
        this.zzf = i2;
    }

    public static zzrv zzb(int i2) {
        for (zzrv zzrvVar : values()) {
            if (zzrvVar.zzf == i2) {
                return zzrvVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzca
    public final int zza() {
        return this.zzf;
    }
}
