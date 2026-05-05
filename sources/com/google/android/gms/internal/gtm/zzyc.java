package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyc extends AbstractList {
    private final List zza;
    private final zzyb zzb;

    public zzyc(List list, zzyb zzybVar) {
        this.zza = list;
        this.zzb = zzybVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.zzb.zzb(this.zza.get(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
