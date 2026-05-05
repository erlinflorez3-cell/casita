package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzlb<E> extends zzhj<E> implements RandomAccess {
    private static final zzlb<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzlb<Object> zzlbVar = new zzlb<>(new Object[0], 0);
        zza = zzlbVar;
        zzlbVar.zzb();
    }

    zzlb() {
        this(new Object[10], 0);
    }

    private zzlb(E[] eArr, int i2) {
        this.zzb = eArr;
        this.zzc = i2;
    }

    private final void zzb(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i2));
        }
    }

    private final String zzc(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.zzc).toString();
    }

    public static <E> zzlb<E> zzd() {
        return (zzlb<E>) zza;
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        zzc();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzc(i2));
        }
        E[] eArr = this.zzb;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.zzb, i2, eArr2, i2 + 1, this.zzc - i2);
            this.zzb = eArr2;
        }
        this.zzb[i2] = e2;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        zzc();
        int i2 = this.zzc;
        E[] eArr = this.zzb;
        if (i2 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        zzb(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        zzc();
        zzb(i2);
        E[] eArr = this.zzb;
        E e2 = eArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e2;
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        zzc();
        zzb(i2);
        E[] eArr = this.zzb;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i2) {
        if (i2 >= this.zzc) {
            return new zzlb(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }
}
