package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzba extends zzaw implements Set {

    @CheckForNull
    private transient zzaz zza;

    zzba() {
    }

    static int zzf(int i2) {
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

    @SafeVarargs
    public static zzba zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = {"ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "COUNTRY", "LOCALITY", "POSTAL_CODE", "SCHOOL_DISTRICT"};
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        return zzk(6, objArr2);
    }

    private static zzba zzk(int i2, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return zzbd.zza;
        }
        if (i2 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            return new zzbe(obj);
        }
        int iZzf = zzf(i2);
        Object[] objArr2 = new Object[iZzf];
        int i3 = iZzf - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArrCopyOf[i6];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i6);
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzav.zza(iHashCode);
            while (true) {
                int i7 = iZza & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArrCopyOf[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArrCopyOf, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArrCopyOf[0];
            obj4.getClass();
            return new zzbe(obj4);
        }
        if (zzf(i5) < iZzf / 2) {
            return zzk(i5, objArrCopyOf);
        }
        if (i5 < 4) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
        }
        return new zzbd(objArrCopyOf, i4, objArr2, i3, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzba) && zzj() && ((zzba) obj).zzj() && hashCode() != obj.hashCode()) {
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

    @Override // com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbf iterator();

    public final zzaz zzg() {
        zzaz zzazVar = this.zza;
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarZzh = zzh();
        this.zza = zzazVarZzh;
        return zzazVarZzh;
    }

    zzaz zzh() {
        Object[] array = toArray();
        int i2 = zzaz.zzd;
        return zzaz.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }
}
