package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdg<K, V> {
    static <K, V> int zza(zzdh<K, V> zzdhVar, K k2, V v2) {
        return zzby.zza(zzdhVar.zzmb, 1, k2) + zzby.zza(zzdhVar.zzmd, 2, v2);
    }

    static <K, V> void zza(zzbn zzbnVar, zzdh<K, V> zzdhVar, K k2, V v2) throws IOException {
        zzby.zza(zzbnVar, zzdhVar.zzmb, 1, k2);
        zzby.zza(zzbnVar, zzdhVar.zzmd, 2, v2);
    }
}
