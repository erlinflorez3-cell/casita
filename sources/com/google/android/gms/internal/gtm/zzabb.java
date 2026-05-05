package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzabb {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzud.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzabb(Object obj) {
        this.zzk = obj;
    }
}
