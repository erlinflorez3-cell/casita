package com.google.android.gms.internal.tapandpay;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbz extends zzbv implements Set {
    private transient zzby zza;

    zzbz() {
    }

    public static zzbz zzf(Object obj, Object obj2) {
        return zzk(2, obj, obj2);
    }

    static int zzg(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    private static zzbz zzk(int i2, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return zzcd.zza;
        }
        if (i2 == 1) {
            return new zzce(Objects.requireNonNull(objArrCopyOf[0]));
        }
        int iZzg = zzg(i2);
        Object[] objArr2 = new Object[iZzg];
        int i3 = iZzg - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArrCopyOf[i6];
            zzcb.zza(obj, i6);
            int iHashCode = obj.hashCode();
            int iZza = zzbu.zza(iHashCode);
            while (true) {
                int i7 = iZza & i3;
                Object obj2 = objArr2[i7];
                if (obj2 == null) {
                    objArrCopyOf[i5] = obj;
                    objArr2[i7] = obj;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj2.equals(obj)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArrCopyOf, i5, i2, (Object) null);
        if (i5 == 1) {
            return new zzce(Objects.requireNonNull(objArrCopyOf[0]));
        }
        if (zzg(i5) < iZzg / 2) {
            return zzk(i5, objArrCopyOf);
        }
        if (i5 <= 0) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
        }
        return new zzcd(objArrCopyOf, i4, objArr2, i3, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbz) && zzh() && ((zzbz) obj).zzh() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza */
    public abstract zzcf iterator();

    boolean zzh() {
        return false;
    }

    public final zzby zzi() {
        zzby zzbyVar = this.zza;
        if (zzbyVar != null) {
            return zzbyVar;
        }
        zzby zzbyVarZzj = zzj();
        this.zza = zzbyVarZzj;
        return zzbyVarZzj;
    }

    zzby zzj() {
        Object[] array = toArray();
        int i2 = zzby.zzd;
        return zzby.zzh(array, array.length);
    }
}
