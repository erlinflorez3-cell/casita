package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes8.dex */
final class zzci extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    zzci() {
        zzp(3);
    }

    zzci(int i2) {
        zzp(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        return (int[]) Objects.requireNonNull(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        return (Object[]) Objects.requireNonNull(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        return (Object[]) Objects.requireNonNull(this.zzc);
    }

    static /* synthetic */ Object zzg(zzci zzciVar, int i2) {
        return zzciVar.zzB()[i2];
    }

    static /* synthetic */ Object zzj(zzci zzciVar, int i2) {
        return zzciVar.zzC()[i2];
    }

    static /* synthetic */ void zzn(zzci zzciVar, int i2, Object obj) {
        zzciVar.zzC()[i2] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        int i2 = this.zzf;
        return (1 << ((i2 + 31) - (i2 | 31))) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(@CheckForNull Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        int iZzc = zzcj.zzc(Objects.requireNonNull(this.zze), (iZza + iZzv) - (iZza | iZzv));
        if (iZzc != 0) {
            int i2 = ~iZzv;
            int i3 = iZza & i2;
            do {
                int i4 = iZzc - 1;
                int i5 = zzA()[i4];
                if ((i5 + i2) - (i5 | i2) == i3 && zzax.zza(obj, zzB()[i4])) {
                    return i4;
                }
                iZzc = (i5 + iZzv) - (i5 | iZzv);
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i2, int i3, int i4, int i5) {
        int i6 = i3 - 1;
        Object objZzd = zzcj.zzd(i3);
        if (i5 != 0) {
            zzcj.zze(objZzd, (-1) - (((-1) - i4) | ((-1) - i6)), i5 + 1);
        }
        Object objRequireNonNull = Objects.requireNonNull(this.zze);
        int[] iArrZzA = zzA();
        for (int i7 = 0; i7 <= i2; i7++) {
            int iZzc = zzcj.zzc(objRequireNonNull, i7);
            while (iZzc != 0) {
                int i8 = iZzc - 1;
                int i9 = iArrZzA[i8];
                int i10 = (-1) - (((-1) - ((~i2) & i9)) & ((-1) - i7));
                int i11 = (i10 + i6) - (i10 | i6);
                int iZzc2 = zzcj.zzc(objZzd, i11);
                zzcj.zze(objZzd, i11, iZzc);
                int i12 = ~i6;
                iArrZzA[i8] = (-1) - (((-1) - ((i12 + i10) - (i12 | i10))) & ((-1) - (iZzc2 & i6)));
                iZzc = (-1) - (((-1) - i9) | ((-1) - i2));
            }
        }
        this.zze = objZzd;
        zzz(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(@CheckForNull Object obj) {
        int iZzv;
        int iZzb;
        if (zzr() || (iZzb = zzcj.zzb(obj, null, (iZzv = zzv()), Objects.requireNonNull(this.zze), zzA(), zzB(), null)) == -1) {
            return zzd;
        }
        Object obj2 = zzC()[iZzb];
        zzq(iZzb, iZzv);
        this.zzg--;
        zzo();
        return obj2;
    }

    private final void zzz(int i2) {
        this.zzf = (-1) - (((-1) - ((32 - Integer.numberOfLeadingZeros(i2)) & 31)) & ((-1) - ((-1) - (((-1) - this.zzf) | ((-1) - (-32))))));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzdw.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object objRequireNonNull = Objects.requireNonNull(this.zze);
        if (objRequireNonNull instanceof byte[]) {
            Arrays.fill((byte[]) objRequireNonNull, (byte) 0);
        } else if (objRequireNonNull instanceof short[]) {
            Arrays.fill((short[]) objRequireNonNull, (short) 0);
        } else {
            Arrays.fill((int[]) objRequireNonNull, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.zzg; i2++) {
            if (zzax.zza(obj, zzC()[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzcc zzccVar = new zzcc(this);
        this.zzi = zzccVar;
        return zzccVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzcf zzcfVar = new zzcf(this);
        this.zzh = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int i2;
        int i3;
        int iMin;
        if (zzr()) {
            zzaz.zzf(zzr(), "Arrays already allocated");
            int i4 = this.zzf;
            int iMax = Math.max(i4 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzcj.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i4];
            this.zzb = new Object[i4];
            this.zzc = new Object[i4];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i5 = this.zzg;
        int i6 = i5 + 1;
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        int i7 = (-1) - (((-1) - iZza) | ((-1) - iZzv));
        int iZzc = zzcj.zzc(Objects.requireNonNull(this.zze), i7);
        if (iZzc != 0) {
            int i8 = ~iZzv;
            int i9 = (-1) - (((-1) - iZza) | ((-1) - i8));
            int i10 = 0;
            do {
                i2 = iZzc - 1;
                int i11 = iArrZzA[i2];
                i3 = (-1) - (((-1) - i11) | ((-1) - i8));
                if (i3 == i9 && zzax.zza(obj, objArrZzB[i2])) {
                    Object obj3 = objArrZzC[i2];
                    objArrZzC[i2] = obj2;
                    return obj3;
                }
                iZzc = (-1) - (((-1) - i11) | ((-1) - iZzv));
                i10++;
            } while (iZzc != 0);
            if (i10 >= 9) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                int iZze = zze();
                while (iZze >= 0) {
                    linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                    iZze = zzf(iZze);
                }
                this.zze = linkedHashMap;
                this.zza = null;
                this.zzb = null;
                this.zzc = null;
                zzo();
                return linkedHashMap.put(obj, obj2);
            }
            if (i6 > iZzv) {
                iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i5);
            } else {
                iArrZzA[i2] = (i6 & iZzv) | i3;
            }
        } else if (i6 > iZzv) {
            iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i5);
        } else {
            zzcj.zze(Objects.requireNonNull(this.zze), i7, i6);
        }
        int length = zzA().length;
        if (i6 > length && (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), iMin);
            this.zzb = Arrays.copyOf(zzB(), iMin);
            this.zzc = Arrays.copyOf(zzC(), iMin);
        }
        int i12 = ~iZzv;
        zzA()[i5] = (i12 + iZza) - (i12 | iZza);
        zzB()[i5] = obj;
        zzC()[i5] = obj2;
        this.zzg = i6;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzch zzchVar = new zzch(this);
        this.zzj = zzchVar;
        return zzchVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
        }
        return -1;
    }

    @CheckForNull
    final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzo() {
        this.zzf += 32;
    }

    final void zzp(int i2) {
        this.zzf = zzdw.zza(i2, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzq(int i2, int i3) {
        int i4;
        int i5;
        Object objRequireNonNull = Objects.requireNonNull(this.zze);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i6 = size - 1;
        if (i2 >= i6) {
            objArrZzB[i2] = null;
            objArrZzC[i2] = null;
            iArrZzA[i2] = 0;
            return;
        }
        int i7 = i2 + 1;
        Object obj = objArrZzB[i6];
        objArrZzB[i2] = obj;
        objArrZzC[i2] = objArrZzC[i6];
        objArrZzB[i6] = null;
        objArrZzC[i6] = null;
        iArrZzA[i2] = iArrZzA[i6];
        iArrZzA[i6] = 0;
        int iZza = (-1) - (((-1) - zzck.zza(obj)) | ((-1) - i3));
        int iZzc = zzcj.zzc(objRequireNonNull, iZza);
        if (iZzc == size) {
            zzcj.zze(objRequireNonNull, iZza, i7);
            return;
        }
        do {
            i4 = iZzc - 1;
            i5 = iArrZzA[i4];
            iZzc = (i5 + i3) - (i5 | i3);
        } while (iZzc != size);
        int i8 = ~i3;
        int i9 = (i5 + i8) - (i5 | i8);
        int i10 = (i3 + i7) - (i3 | i7);
        iArrZzA[i4] = (i9 + i10) - (i9 & i10);
    }

    final boolean zzr() {
        return this.zze == null;
    }
}
