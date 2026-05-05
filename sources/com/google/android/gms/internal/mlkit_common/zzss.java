package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes8.dex */
public final class zzss {
    private static zzsr zza = null;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        if (zza == null) {
            zza = new zzsr(null);
        }
        return (zzsh) zza.get(zzsbVar);
    }

    public static synchronized zzsh zzb(String str) {
        return zza(zzsb.zzd("common").zzd());
    }
}
