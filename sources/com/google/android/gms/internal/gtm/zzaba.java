package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzaba {
    DOUBLE(zzabb.DOUBLE, 1),
    FLOAT(zzabb.FLOAT, 5),
    INT64(zzabb.LONG, 0),
    UINT64(zzabb.LONG, 0),
    INT32(zzabb.INT, 0),
    FIXED64(zzabb.LONG, 1),
    FIXED32(zzabb.INT, 5),
    BOOL(zzabb.BOOLEAN, 0),
    STRING(zzabb.STRING, 2),
    GROUP(zzabb.MESSAGE, 3),
    MESSAGE(zzabb.MESSAGE, 2),
    BYTES(zzabb.BYTE_STRING, 2),
    UINT32(zzabb.INT, 0),
    ENUM(zzabb.ENUM, 0),
    SFIXED32(zzabb.INT, 5),
    SFIXED64(zzabb.LONG, 1),
    SINT32(zzabb.INT, 0),
    SINT64(zzabb.LONG, 0);

    private final zzabb zzt;

    zzaba(zzabb zzabbVar, int i2) {
        this.zzt = zzabbVar;
    }

    public final zzabb zza() {
        return this.zzt;
    }
}
