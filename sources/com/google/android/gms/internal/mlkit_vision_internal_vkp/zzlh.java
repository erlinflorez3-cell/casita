package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzlh extends zzkz {
    final /* synthetic */ zzli zza;

    zzlh(zzli zzliVar) {
        this.zza = zzliVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzkj.zza(i2, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        int i3 = i2 + i2;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(this.zza.zzb[i3]), Objects.requireNonNull(this.zza.zzb[i3 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
