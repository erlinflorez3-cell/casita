package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlz extends AbstractList<String> implements zzjv, RandomAccess {
    private final zzjv zza;

    public zzlz(zzjv zzjvVar) {
        this.zza = zzjvVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.zza.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzmb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new zzly(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final void zza(zzht zzhtVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final Object zzb(int i2) {
        return this.zza.zzb(i2);
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final List<?> zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final zzjv zze() {
        return this;
    }
}
