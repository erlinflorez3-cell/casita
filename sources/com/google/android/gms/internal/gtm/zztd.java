package com.google.android.gms.internal.gtm;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zztd extends zzst {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zztd(Object[] objArr, int i2, int i3) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzsl.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i2 + i2 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
