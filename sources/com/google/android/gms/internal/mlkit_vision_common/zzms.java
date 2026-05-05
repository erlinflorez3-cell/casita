package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes8.dex */
public final class zzms {
    private static zzmr zza = null;

    public static synchronized zzmj zza(zzme zzmeVar) {
        if (zza == null) {
            zza = new zzmr(null);
        }
        return (zzmj) zza.get(zzmeVar);
    }

    public static synchronized zzmj zzb(String str) {
        return zza(zzme.zzd("vision-common").zzd());
    }
}
