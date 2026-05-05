package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzbds extends zzbcm implements RandomAccess, zzbet, zzbga {
    private double[] zza;
    private int zzb;

    static {
        new zzbds(new double[0], 0, false);
    }

    zzbds() {
        this(new double[10], 0, true);
    }

    private zzbds(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.zza = dArr;
        this.zzb = i2;
    }

    private final String zzg(int i2) {
        return "Index:" + i2 + ", Size:" + this.zzb;
    }

    private final void zzh(int i2) {
        if (i2 < 0 || i2 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i2));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i2));
        }
        int i4 = i2 + 1;
        double[] dArr = this.zza;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.zza, i2, dArr2, i4, this.zzb - i2);
            this.zza = dArr2;
        }
        this.zza[i2] = dDoubleValue;
        this.zzb++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzbeu.zzb;
        collection.getClass();
        if (!(collection instanceof zzbds)) {
            return super.addAll(collection);
        }
        zzbds zzbdsVar = (zzbds) collection;
        int i2 = zzbdsVar.zzb;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzb;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.zza;
        if (i4 > dArr.length) {
            this.zza = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzbdsVar.zza, 0, this.zza, this.zzb, zzbdsVar.zzb);
        this.zzb = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbds)) {
            return super.equals(obj);
        }
        zzbds zzbdsVar = (zzbds) obj;
        if (this.zzb != zzbdsVar.zzb) {
            return false;
        }
        double[] dArr = zzbdsVar.zza;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (Double.doubleToLongBits(this.zza[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzh(i2);
        return Double.valueOf(this.zza[i2]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zza[i3]);
            byte[] bArr = zzbeu.zzb;
            i2 = (i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.zzb;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zza[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzh(i2);
        double[] dArr = this.zza;
        double d2 = dArr[i2];
        if (i2 < this.zzb - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r2 - i2) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        zza();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zza;
        System.arraycopy(dArr, i3, dArr, i2, this.zzb - i3);
        this.zzb -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i2);
        double[] dArr = this.zza;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet
    public final /* bridge */ /* synthetic */ zzbet zzd(int i2) {
        if (i2 >= this.zzb) {
            return new zzbds(Arrays.copyOf(this.zza, i2), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i2) {
        zzh(i2);
        return this.zza[i2];
    }

    public final void zzf(double d2) {
        zza();
        int i2 = this.zzb;
        double[] dArr = this.zza;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        dArr3[i3] = d2;
    }
}
