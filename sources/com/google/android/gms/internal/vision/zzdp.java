package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes8.dex */
final class zzdp<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object zzd = new Object();

    @NullableDecl
    transient int[] zza;

    @NullableDecl
    transient Object[] zzb;

    @NullableDecl
    transient Object[] zzc;

    @NullableDecl
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @NullableDecl
    private transient Set<K> zzh;

    @NullableDecl
    private transient Set<Map.Entry<K, V>> zzi;

    @NullableDecl
    private transient Collection<V> zzj;

    zzdp() {
        zzde.zza(true, (Object) "Expected size must be >= 0");
        this.zzf = zzfc.zza(3, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    private final int zza(int i2, int i3, int i4, int i5) {
        Object objZza = zzea.zza(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            zzea.zza(objZza, i4 & i6, i5 + 1);
        }
        Object obj = this.zze;
        int[] iArr = this.zza;
        for (int i7 = 0; i7 <= i2; i7++) {
            int iZza = zzea.zza(obj, i7);
            while (iZza != 0) {
                int i8 = iZza - 1;
                int i9 = iArr[i8];
                int i10 = ~i2;
                int i11 = ((i10 + i9) - (i10 | i9)) | i7;
                int i12 = (-1) - (((-1) - i11) | ((-1) - i6));
                int iZza2 = zzea.zza(objZza, i12);
                zzea.zza(objZza, i12, iZza);
                iArr[i8] = zzea.zza(i11, iZza2, i6);
                iZza = (i9 + i2) - (i9 | i2);
            }
        }
        this.zze = objZza;
        zzb(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zza(@NullableDecl Object obj) {
        if (zza()) {
            return -1;
        }
        int iZza = zzec.zza(obj);
        int iZzi = zzi();
        int iZza2 = zzea.zza(this.zze, (iZza + iZzi) - (iZza | iZzi));
        if (iZza2 == 0) {
            return -1;
        }
        int i2 = ~iZzi;
        int i3 = (-1) - (((-1) - iZza) | ((-1) - i2));
        do {
            int i4 = iZza2 - 1;
            int i5 = this.zza[i4];
            if ((i5 & i2) == i3 && zzcz.zza(obj, this.zzb[i4])) {
                return i4;
            }
            iZza2 = (i5 + iZzi) - (i5 | iZzi);
        } while (iZza2 != 0);
        return -1;
    }

    static int zzb(int i2, int i3) {
        return i2 - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public final Object zzb(@NullableDecl Object obj) {
        int iZzi;
        int iZza;
        if (!zza() && (iZza = zzea.zza(obj, null, (iZzi = zzi()), this.zze, this.zza, this.zzb, null)) != -1) {
            Object obj2 = this.zzc[iZza];
            zza(iZza, iZzi);
            this.zzg--;
            zzc();
            return obj2;
        }
        return zzd;
    }

    private final void zzb(int i2) {
        this.zzf = zzea.zza(this.zzf, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    static /* synthetic */ int zzd(zzdp zzdpVar) {
        int i2 = zzdpVar.zzg;
        zzdpVar.zzg = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzi() {
        return (1 << ((-1) - (((-1) - this.zzf) | ((-1) - 31)))) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zza()) {
            return;
        }
        zzc();
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            this.zzf = zzfc.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapZzb.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(this.zzb, 0, this.zzg, (Object) null);
        Arrays.fill(this.zzc, 0, this.zzg, (Object) null);
        Object obj = this.zze;
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(this.zza, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.containsKey(obj) : zza(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.zzg; i2++) {
            if (zzcz.zza(obj, this.zzc[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zzi;
        if (set != null) {
            return set;
        }
        zzdt zzdtVar = new zzdt(this);
        this.zzi = zzdtVar;
        return zzdtVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.get(obj);
        }
        int iZza = zza(obj);
        if (iZza == -1) {
            return null;
        }
        return (V) this.zzc[iZza];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.zzh;
        if (set != null) {
            return set;
        }
        zzdv zzdvVar = new zzdv(this);
        this.zzh = zzdvVar;
        return zzdvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V put(@NullableDecl K k2, @NullableDecl V v2) {
        int iMin;
        if (zza()) {
            zzde.zzb(zza(), "Arrays already allocated");
            int i2 = this.zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzea.zza(iMax2);
            zzb(iMax2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.put(k2, v2);
        }
        int[] iArr = this.zza;
        Object[] objArr = this.zzb;
        Object[] objArr2 = this.zzc;
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int iZza = zzec.zza(k2);
        int iZzi = zzi();
        int i5 = (-1) - (((-1) - iZza) | ((-1) - iZzi));
        int iZza2 = zzea.zza(this.zze, i5);
        if (iZza2 != 0) {
            int i6 = ~iZzi;
            int i7 = iZza & i6;
            int i8 = 0;
            while (true) {
                int i9 = iZza2 - 1;
                int i10 = iArr[i9];
                if ((-1) - (((-1) - i10) | ((-1) - i6)) == i7 && zzcz.zza(k2, objArr[i9])) {
                    V v3 = (V) objArr2[i9];
                    objArr2[i9] = v2;
                    return v3;
                }
                int i11 = (i10 + iZzi) - (i10 | iZzi);
                i8++;
                if (i11 != 0) {
                    iZza2 = i11;
                } else {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzi() + 1, 1.0f);
                        int iZzd = zzd();
                        while (iZzd >= 0) {
                            linkedHashMap.put(this.zzb[iZzd], this.zzc[iZzd]);
                            iZzd = zza(iZzd);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzc();
                        return (V) linkedHashMap.put(k2, v2);
                    }
                    if (i4 > iZzi) {
                        iZzi = zza(iZzi, zzea.zzb(iZzi), iZza, i3);
                    } else {
                        iArr[i9] = zzea.zza(i10, i4, iZzi);
                    }
                }
            }
        } else if (i4 > iZzi) {
            iZzi = zza(iZzi, zzea.zzb(iZzi), iZza, i3);
        } else {
            zzea.zza(this.zze, i5, i4);
        }
        int length = this.zza.length;
        if (i4 > length && (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            this.zza = Arrays.copyOf(this.zza, iMin);
            this.zzb = Arrays.copyOf(this.zzb, iMin);
            this.zzc = Arrays.copyOf(this.zzc, iMin);
        }
        this.zza[i3] = zzea.zza(iZza, 0, iZzi);
        this.zzb[i3] = k2;
        this.zzc[i3] = v2;
        this.zzg = i4;
        zzc();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.remove(obj);
        }
        V v2 = (V) zzb(obj);
        if (v2 == zzd) {
            return null;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzdx zzdxVar = new zzdx(this);
        this.zzj = zzdxVar;
        return zzdxVar;
    }

    final int zza(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
        }
        return -1;
    }

    final void zza(int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int size = size();
        int i6 = size - 1;
        if (i2 >= i6) {
            this.zzb[i2] = null;
            this.zzc[i2] = null;
            this.zza[i2] = 0;
            return;
        }
        Object[] objArr = this.zzb;
        Object obj = objArr[i6];
        objArr[i2] = obj;
        Object[] objArr2 = this.zzc;
        objArr2[i2] = objArr2[i6];
        objArr[i6] = null;
        objArr2[i6] = null;
        int[] iArr2 = this.zza;
        iArr2[i2] = iArr2[i6];
        iArr2[i6] = 0;
        int iZza = zzec.zza(obj);
        int i7 = (iZza + i3) - (iZza | i3);
        int iZza2 = zzea.zza(this.zze, i7);
        if (iZza2 == size) {
            zzea.zza(this.zze, i7, i2 + 1);
            return;
        }
        do {
            i4 = iZza2 - 1;
            iArr = this.zza;
            i5 = iArr[i4];
            iZza2 = i5 & i3;
        } while (iZza2 != size);
        iArr[i4] = zzea.zza(i5, i2 + 1, i3);
    }

    final boolean zza() {
        return this.zze == null;
    }

    @NullableDecl
    final Map<K, V> zzb() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzc() {
        this.zzf += 32;
    }

    final int zzd() {
        return isEmpty() ? -1 : 0;
    }

    final Iterator<K> zze() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.keySet().iterator() : new zzds(this);
    }

    final Iterator<Map.Entry<K, V>> zzf() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.entrySet().iterator() : new zzdr(this);
    }

    final Iterator<V> zzg() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.values().iterator() : new zzdu(this);
    }
}
