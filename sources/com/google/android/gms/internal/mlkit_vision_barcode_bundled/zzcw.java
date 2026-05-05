package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzcw extends zzcs implements RandomAccess, zzeo {
    private boolean[] zza;
    private int zzb;

    static {
        new zzcw(new boolean[0], 0, false);
    }

    zzcw() {
        this(new boolean[10], 0, true);
    }

    private zzcw(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.zza = zArr;
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i2));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.zza;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.zza, i2, zArr2, i4, this.zzb - i2);
            this.zza = zArr2;
        }
        this.zza[i2] = zBooleanValue;
        this.zzb++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzcw)) {
            return super.addAll(collection);
        }
        zzcw zzcwVar = (zzcw) collection;
        int i2 = zzcwVar.zzb;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzb;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.zza;
        if (i4 > zArr.length) {
            this.zza = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzcwVar.zza, 0, this.zza, this.zzb, zzcwVar.zzb);
        this.zzb = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return super.equals(obj);
        }
        zzcw zzcwVar = (zzcw) obj;
        if (this.zzb != zzcwVar.zzb) {
            return false;
        }
        boolean[] zArr = zzcwVar.zza;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zza[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzh(i2);
        return Boolean.valueOf(this.zza[i2]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            iZza = (iZza * 31) + zzep.zza(this.zza[i2]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.zzb;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zza[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzh(i2);
        boolean[] zArr = this.zza;
        boolean z2 = zArr[i2];
        if (i2 < this.zzb - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        zza();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zza;
        System.arraycopy(zArr, i3, zArr, i2, this.zzb - i3);
        this.zzb -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i2);
        boolean[] zArr = this.zza;
        boolean z2 = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i2) {
        if (i2 >= this.zzb) {
            return new zzcw(Arrays.copyOf(this.zza, i2), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z2) {
        zza();
        int i2 = this.zzb;
        boolean[] zArr = this.zza;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        zArr3[i3] = z2;
    }

    public final boolean zzf(int i2) {
        zzh(i2);
        return this.zza[i2];
    }
}
