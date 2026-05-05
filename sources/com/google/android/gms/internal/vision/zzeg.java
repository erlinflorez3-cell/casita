package com.google.android.gms.internal.vision;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes8.dex */
final class zzeg<E> extends zzee<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzee zzc;

    zzeg(zzee zzeeVar, int i2, int i3) {
        this.zzc = zzeeVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final E get(int i2) {
        zzde.zza(i2, this.zzb);
        return this.zzc.get(i2 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzee, java.util.List
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzee
    /* JADX INFO: renamed from: zza */
    public final zzee<E> subList(int i2, int i3) {
        zzde.zza(i2, i3, this.zzb);
        zzee zzeeVar = this.zzc;
        int i4 = this.zza;
        return (zzee) zzeeVar.subList(i2 + i4, i3 + i4);
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return true;
    }
}
