package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkc<K, V> {
    static <K, V> int zza(zzkf<K, V> zzkfVar, K k2, V v2) {
        return zziu.zza(zzkfVar.zza, 1, k2) + zziu.zza(zzkfVar.zzc, 2, v2);
    }

    static <K, V> void zza(zzii zziiVar, zzkf<K, V> zzkfVar, K k2, V v2) throws IOException {
        zziu.zza(zziiVar, zzkfVar.zza, 1, k2);
        zziu.zza(zziiVar, zzkfVar.zzc, 2, v2);
    }
}
