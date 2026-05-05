package com.google.android.gms.internal.vision;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes8.dex */
final class zzeu<K, V> extends zzee<Map.Entry<K, V>> {
    private final /* synthetic */ zzer zza;

    zzeu(zzer zzerVar) {
        this.zza = zzerVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzde.zza(i2, this.zza.zzd);
        int i3 = i2 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zza.zzb[i3], this.zza.zzb[i3 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzd;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final boolean zzf() {
        return true;
    }
}
