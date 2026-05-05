package com.google.android.gms.internal.vision;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcy<T> implements Serializable {
    zzcy() {
    }

    public static <T> zzcy<T> zza(T t2) {
        return new zzdd(zzde.zza(t2));
    }

    public static <T> zzcy<T> zzc() {
        return zzcv.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();
}
