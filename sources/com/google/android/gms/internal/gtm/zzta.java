package com.google.android.gms.internal.gtm;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzta extends zzst {
    final /* synthetic */ zztb zza;

    zzta(zztb zztbVar) {
        this.zza = zztbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzsl.zza(i2, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zztb zztbVar = this.zza;
        int i3 = i2 + i2;
        Object obj = zztbVar.zzb[i3];
        obj.getClass();
        Object obj2 = zztbVar.zzb[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
