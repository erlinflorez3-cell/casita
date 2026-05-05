package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzaz extends zzav<Boolean> implements zzcn<Boolean>, RandomAccess {
    private static final zzaz zzfg;
    private int size;
    private boolean[] zzfh;

    static {
        zzaz zzazVar = new zzaz();
        zzfg = zzazVar;
        zzazVar.zzv();
    }

    zzaz() {
        this(new boolean[10], 0);
    }

    private zzaz(boolean[] zArr, int i2) {
        this.zzfh = zArr;
        this.size = i2;
    }

    private final void zza(int i2, boolean z2) {
        int i3;
        zzw();
        if (i2 < 0 || i2 > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
        boolean[] zArr = this.zzfh;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.zzfh, i2, zArr2, i2 + 1, this.size - i2);
            this.zzfh = zArr2;
        }
        this.zzfh[i2] = z2;
        this.size++;
        this.modCount++;
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
    }

    private final String zzh(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.size).toString();
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        zza(i2, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzaz)) {
            return super.addAll(collection);
        }
        zzaz zzazVar = (zzaz) collection;
        int i2 = zzazVar.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.zzfh;
        if (i4 > zArr.length) {
            this.zzfh = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzazVar.zzfh, 0, this.zzfh, this.size, zzazVar.size);
        this.size = i4;
        this.modCount++;
        return true;
    }

    public final void addBoolean(boolean z2) {
        zza(this.size, z2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaz)) {
            return super.equals(obj);
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.size != zzazVar.size) {
            return false;
        }
        boolean[] zArr = zzazVar.zzfh;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.zzfh[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Boolean.valueOf(this.zzfh[i2]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            iZzc = (iZzc * 31) + zzci.zzc(this.zzfh[i2]);
        }
        return iZzc;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zzw();
        zzg(i2);
        boolean[] zArr = this.zzfh;
        boolean z2 = zArr[i2];
        int i3 = this.size;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, i3 - i2);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i2 = 0; i2 < this.size; i2++) {
            if (obj.equals(Boolean.valueOf(this.zzfh[i2]))) {
                boolean[] zArr = this.zzfh;
                System.arraycopy(zArr, i2 + 1, zArr, i2, this.size - i2);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        zzw();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzfh;
        System.arraycopy(zArr, i3, zArr, i2, this.size - i3);
        this.size -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzw();
        zzg(i2);
        boolean[] zArr = this.zzfh;
        boolean z2 = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Boolean> zzi(int i2) {
        if (i2 >= this.size) {
            return new zzaz(Arrays.copyOf(this.zzfh, i2), this.size);
        }
        throw new IllegalArgumentException();
    }
}
