package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzcd extends zzbz {
    static final zzcd zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzcd(objArr, 0, objArr, 0, 0);
    }

    zzcd(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.zzb = objArr;
        this.zze = i2;
        this.zzc = objArr2;
        this.zzf = i3;
        this.zzg = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZza = zzbu.zza(obj.hashCode());
                while (true) {
                    int i2 = this.zzf;
                    int i3 = (iZza + i2) - (iZza | i2);
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZza = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv
    /* JADX INFO: renamed from: zza */
    public final zzcf iterator() {
        return zzi().listIterator(0);
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
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zze(Object[] objArr, int i2) {
        Object[] objArr2 = this.zzb;
        int i3 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz
    final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz
    final zzby zzj() {
        return zzby.zzh(this.zzb, this.zzg);
    }
}
