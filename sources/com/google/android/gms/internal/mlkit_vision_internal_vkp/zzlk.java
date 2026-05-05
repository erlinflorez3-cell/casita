package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzlk extends zzkz {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    zzlk(Object[] objArr, int i2, int i3) {
        this.zza = objArr;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzkj.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        return Objects.requireNonNull(this.zza[i2 + i2 + this.zzb]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
