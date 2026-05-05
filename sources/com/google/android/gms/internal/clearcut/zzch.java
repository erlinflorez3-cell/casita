package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzch extends zzav<Integer> implements zzcn<Integer>, RandomAccess {
    private static final zzch zzkr;
    private int size;
    private int[] zzks;

    static {
        zzch zzchVar = new zzch();
        zzkr = zzchVar;
        zzchVar.zzv();
    }

    zzch() {
        this(new int[10], 0);
    }

    private zzch(int[] iArr, int i2) {
        this.zzks = iArr;
        this.size = i2;
    }

    public static zzch zzbk() {
        return zzkr;
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
    }

    private final String zzh(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.size).toString();
    }

    private final void zzo(int i2, int i3) {
        int i4;
        zzw();
        if (i2 < 0 || i2 > (i4 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
        int[] iArr = this.zzks;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.zzks, i2, iArr2, i2 + 1, this.size - i2);
            this.zzks = iArr2;
        }
        this.zzks[i2] = i3;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        zzo(i2, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzch)) {
            return super.addAll(collection);
        }
        zzch zzchVar = (zzch) collection;
        int i2 = zzchVar.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.zzks;
        if (i4 > iArr.length) {
            this.zzks = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzchVar.zzks, 0, this.zzks, this.size, zzchVar.size);
        this.size = i4;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return super.equals(obj);
        }
        zzch zzchVar = (zzch) obj;
        if (this.size != zzchVar.size) {
            return false;
        }
        int[] iArr = zzchVar.zzks;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.zzks[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(getInt(i2));
    }

    public final int getInt(int i2) {
        zzg(i2);
        return this.zzks[i2];
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            i2 = (i2 * 31) + this.zzks[i3];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zzw();
        zzg(i2);
        int[] iArr = this.zzks;
        int i3 = iArr[i2];
        int i4 = this.size;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, i4 - i2);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i2 = 0; i2 < this.size; i2++) {
            if (obj.equals(Integer.valueOf(this.zzks[i2]))) {
                int[] iArr = this.zzks;
                System.arraycopy(iArr, i2 + 1, iArr, i2, this.size - i2);
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
        int[] iArr = this.zzks;
        System.arraycopy(iArr, i3, iArr, i2, this.size - i3);
        this.size -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zzw();
        zzg(i2);
        int[] iArr = this.zzks;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzac(int i2) {
        zzo(this.size, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Integer> zzi(int i2) {
        if (i2 >= this.size) {
            return new zzch(Arrays.copyOf(this.zzks, i2), this.size);
        }
        throw new IllegalArgumentException();
    }
}
