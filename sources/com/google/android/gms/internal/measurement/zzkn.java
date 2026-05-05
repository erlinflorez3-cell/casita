package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzkn extends zzie<Long> implements zzjz, zzlo, RandomAccess {
    private static final long[] zza;
    private static final zzkn zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzkn(jArr, 0, false);
    }

    zzkn() {
        this(zza, 0, true);
    }

    private zzkn(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.zzc = jArr;
        this.zzd = i2;
    }

    public static zzkn zzd() {
        return zzb;
    }

    private static int zze(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final String zzf(int i2) {
        return "Index:" + i2 + ", Size:" + this.zzd;
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        long[] jArr = this.zzc;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[zze(jArr.length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i2);
            System.arraycopy(this.zzc, i2, jArr2, i2 + 1, this.zzd - i2);
            this.zzc = jArr2;
        }
        this.zzc[i2] = jLongValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzjv.zza(collection);
        if (!(collection instanceof zzkn)) {
            return super.addAll(collection);
        }
        zzkn zzknVar = (zzkn) collection;
        int i2 = zzknVar.zzd;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzd;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.zzc;
        if (i4 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzknVar.zzc, 0, this.zzc, this.zzd, zzknVar.zzd);
        this.zzd = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkn)) {
            return super.equals(obj);
        }
        zzkn zzknVar = (zzkn) obj;
        if (this.zzd != zzknVar.zzd) {
            return false;
        }
        long[] jArr = zzknVar.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (this.zzc[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(zzb(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            iZza = (iZza * 31) + zzjv.zza(this.zzc[i2]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzc[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzg(i2);
        long[] jArr = this.zzc;
        long j2 = jArr[i2];
        if (i2 < this.zzd - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r2 - i2) - 1);
        }
        this.zzd--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        zza();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i3, jArr, i2, this.zzd - i3);
        this.zzd -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzg(i2);
        long[] jArr = this.zzc;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zza(long j2) {
        zza();
        int i2 = this.zzd;
        long[] jArr = this.zzc;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[zze(jArr.length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, this.zzd);
            this.zzc = jArr2;
        }
        long[] jArr3 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.google.android.gms.internal.measurement.zzjz
    public final long zzb(int i2) {
        zzg(i2);
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzjz zza(int i2) {
        if (i2 >= this.zzd) {
            return new zzkn(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzd(int i2) {
        long[] jArr = this.zzc;
        if (i2 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.zzc = new long[Math.max(i2, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i2) {
            length = zze(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }
}
