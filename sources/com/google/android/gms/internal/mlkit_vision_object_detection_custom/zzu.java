package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzu extends zzs implements ListIterator {
    final /* synthetic */ zzv zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(zzv zzvVar) {
        super(zzvVar);
        this.zzd = zzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzv zzvVar, int i2) {
        super(zzvVar, ((List) zzvVar.zzb).listIterator(i2));
        this.zzd = zzvVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        this.zzd.zzf.zzb++;
        if (zIsEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }
}
