package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzku<K, V> {
    static <K, V> int zza(zzkt<K, V> zzktVar, K k2, V v2) {
        return zzjm.zza(zzktVar.zza, 1, k2) + zzjm.zza(zzktVar.zzc, 2, v2);
    }

    static <K, V> void zza(zzjc zzjcVar, zzkt<K, V> zzktVar, K k2, V v2) throws IOException {
        zzjm.zza(zzjcVar, zzktVar.zza, 1, k2);
        zzjm.zza(zzjcVar, zzktVar.zzc, 2, v2);
    }
}
