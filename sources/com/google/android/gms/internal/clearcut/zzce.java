package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzce extends zzav<Float> implements zzcn<Float>, RandomAccess {
    private static final zzce zzjm;
    private int size;
    private float[] zzjn;

    static {
        zzce zzceVar = new zzce();
        zzjm = zzceVar;
        zzceVar.zzv();
    }

    zzce() {
        this(new float[10], 0);
    }

    private zzce(float[] fArr, int i2) {
        this.zzjn = fArr;
        this.size = i2;
    }

    private final void zzc(int i2, float f2) {
        int i3;
        zzw();
        if (i2 < 0 || i2 > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
        float[] fArr = this.zzjn;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.zzjn, i2, fArr2, i2 + 1, this.size - i2);
            this.zzjn = fArr2;
        }
        this.zzjn[i2] = f2;
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
        zzc(i2, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzce)) {
            return super.addAll(collection);
        }
        zzce zzceVar = (zzce) collection;
        int i2 = zzceVar.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.zzjn;
        if (i4 > fArr.length) {
            this.zzjn = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zzceVar.zzjn, 0, this.zzjn, this.size, zzceVar.size);
        this.size = i4;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzce)) {
            return super.equals(obj);
        }
        zzce zzceVar = (zzce) obj;
        if (this.size != zzceVar.size) {
            return false;
        }
        float[] fArr = zzceVar.zzjn;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.zzjn[i2] != fArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Float.valueOf(this.zzjn[i2]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzjn[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zzw();
        zzg(i2);
        float[] fArr = this.zzjn;
        float f2 = fArr[i2];
        int i3 = this.size;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, i3 - i2);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i2 = 0; i2 < this.size; i2++) {
            if (obj.equals(Float.valueOf(this.zzjn[i2]))) {
                float[] fArr = this.zzjn;
                System.arraycopy(fArr, i2 + 1, fArr, i2, this.size - i2);
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
        float[] fArr = this.zzjn;
        System.arraycopy(fArr, i3, fArr, i2, this.size - i3);
        this.size -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzw();
        zzg(i2);
        float[] fArr = this.zzjn;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(float f2) {
        zzc(this.size, f2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Float> zzi(int i2) {
        if (i2 >= this.size) {
            return new zzce(Arrays.copyOf(this.zzjn, i2), this.size);
        }
        throw new IllegalArgumentException();
    }
}
