package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public enum zzbhq {
    DOUBLE(zzbhr.DOUBLE, 1),
    FLOAT(zzbhr.FLOAT, 5),
    INT64(zzbhr.LONG, 0),
    UINT64(zzbhr.LONG, 0),
    INT32(zzbhr.INT, 0),
    FIXED64(zzbhr.LONG, 1),
    FIXED32(zzbhr.INT, 5),
    BOOL(zzbhr.BOOLEAN, 0),
    STRING(zzbhr.STRING, 2),
    GROUP(zzbhr.MESSAGE, 3),
    MESSAGE(zzbhr.MESSAGE, 2),
    BYTES(zzbhr.BYTE_STRING, 2),
    UINT32(zzbhr.INT, 0),
    ENUM(zzbhr.ENUM, 0),
    SFIXED32(zzbhr.INT, 5),
    SFIXED64(zzbhr.LONG, 1),
    SINT32(zzbhr.INT, 0),
    SINT64(zzbhr.LONG, 0);

    private final zzbhr zzt;
    private final int zzu;

    zzbhq(zzbhr zzbhrVar, int i2) {
        this.zzt = zzbhrVar;
        this.zzu = i2;
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzbhr zzb() {
        return this.zzt;
    }
}
