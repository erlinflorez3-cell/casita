package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes8.dex */
public enum zzra implements zzfc {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzra(int i2) {
        this.zzf = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfc
    public final int zza() {
        return this.zzf;
    }
}
