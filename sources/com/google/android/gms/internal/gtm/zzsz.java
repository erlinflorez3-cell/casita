package com.google.android.gms.internal.gtm;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zzsz extends zzst {
    static final zzst zza = new zzsz(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzsz(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzsl.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i2];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzst, com.google.android.gms.internal.gtm.zzsq
    final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    final Object[] zze() {
        return this.zzb;
    }
}
