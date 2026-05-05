package com.google.android.gms.internal.tapandpay;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcc extends zzby {
    static final zzby zza = new zzcc(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzcc(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzbr.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        return Objects.requireNonNull(this.zzb[i2]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzby, com.google.android.gms.internal.tapandpay.zzbv
    final int zze(Object[] objArr, int i2) {
        Object[] objArr2 = this.zzb;
        int i3 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }
}
