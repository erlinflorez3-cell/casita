package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbk extends zzav {
    static final zzav zza = new zzbk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzbk(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzi.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        return Objects.requireNonNull(this.zzb[i2]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzav, com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzaq
    final Object[] zze() {
        return this.zzb;
    }
}
