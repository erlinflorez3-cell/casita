package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzld extends zzkv implements Set {

    @CheckForNull
    private transient zzkz zza;

    zzld() {
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

    public static zzld zzj() {
        return zzlm.zza;
    }

    public static zzld zzl(int i2, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return zzlm.zza;
        }
        if (i2 == 1) {
            return new zzlo(Objects.requireNonNull(objArrCopyOf[0]));
        }
        int iZzf = zzf(i2);
        Object[] objArr2 = new Object[iZzf];
        int i3 = iZzf - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArrCopyOf[i6];
            zzlf.zza(obj, i6);
            int iHashCode = obj.hashCode();
            int iZza = zzks.zza(iHashCode);
            while (true) {
                int i7 = (iZza + i3) - (iZza | i3);
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
            return new zzlo(Objects.requireNonNull(objArrCopyOf[0]));
        }
        if (zzf(i5) < iZzf / 2) {
            return zzl(i5, objArrCopyOf);
        }
        int length = objArrCopyOf.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
        }
        return new zzlm(objArrCopyOf, i4, objArr2, i3, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzld) && zzk() && ((zzld) obj).zzk() && hashCode() != obj.hashCode()) {
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
        return zzln.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzlp iterator();

    public final zzkz zzg() {
        zzkz zzkzVar = this.zza;
        if (zzkzVar != null) {
            return zzkzVar;
        }
        zzkz zzkzVarZzh = zzh();
        this.zza = zzkzVarZzh;
        return zzkzVarZzh;
    }

    zzkz zzh() {
        Object[] array = toArray();
        int i2 = zzkz.zzd;
        return zzkz.zzg(array, array.length);
    }

    boolean zzk() {
        return false;
    }
}
