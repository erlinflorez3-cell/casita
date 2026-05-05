package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzce extends zzbz {
    final transient Object zza;

    zzce(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzca(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append("[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv
    /* JADX INFO: renamed from: zza */
    public final zzcf iterator() {
        return new zzca(this.zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zze(Object[] objArr, int i2) {
        objArr[0] = this.zza;
        return 1;
    }
}
