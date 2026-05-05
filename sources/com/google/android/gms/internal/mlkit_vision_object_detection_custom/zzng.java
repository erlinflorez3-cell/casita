package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public enum zzng implements zzca {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);

    private final int zzl;

    zzng(int i2) {
        this.zzl = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzca
    public final int zza() {
        return this.zzl;
    }
}
