package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public enum zzoh implements zzca {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zzoh(int i2) {
        this.zzh = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzca
    public final int zza() {
        return this.zzh;
    }
}
