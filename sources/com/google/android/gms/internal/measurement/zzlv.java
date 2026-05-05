package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
class zzlv<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzmb zze;
    private Map<K, V> zzf;

    private zzlv() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(K r5) {
        /*
            r4 = this;
            int r1 = r4.zzb
            int r3 = r1 + (-1)
            if (r3 < 0) goto L1f
            java.lang.Object[] r0 = r4.zza
            r0 = r0[r3]
            com.google.android.gms.internal.measurement.zzlz r0 = (com.google.android.gms.internal.measurement.zzlz) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = r5.compareTo(r0)
            if (r0 <= 0) goto L1c
            int r0 = r1 + 1
        L1a:
            int r0 = -r0
            return r0
        L1c:
            if (r0 != 0) goto L1f
            return r3
        L1f:
            r2 = 0
        L20:
            if (r2 > r3) goto L40
            int r0 = r2 + r3
            int r1 = r0 / 2
            java.lang.Object[] r0 = r4.zza
            r0 = r0[r1]
            com.google.android.gms.internal.measurement.zzlz r0 = (com.google.android.gms.internal.measurement.zzlz) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = r5.compareTo(r0)
            if (r0 >= 0) goto L3b
            int r3 = r1 + (-1)
            goto L20
        L3b:
            if (r0 <= 0) goto L43
            int r2 = r1 + 1
            goto L20
        L40:
            int r0 = r2 + 1
            goto L1a
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlv.zza(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i2) {
        zzg();
        V v2 = (V) ((zzlz) this.zza[i2]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.zzb - i2) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzlz(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v2;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzmb(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlv)) {
            return super.equals(obj);
        }
        zzlv zzlvVar = (zzlv) obj;
        int size = size();
        if (size != zzlvVar.size()) {
            return false;
        }
        int i2 = this.zzb;
        if (i2 != zzlvVar.zzb) {
            return entrySet().equals(zzlvVar.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!zza(i3).equals(zzlvVar.zza(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.zzc.equals(zzlvVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) ((zzlz) this.zza[iZza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i2 = this.zzb;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzb(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb + this.zzc.size();
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v2) {
        zzg();
        int iZza = zza(k2);
        if (iZza >= 0) {
            return (V) ((zzlz) this.zza[iZza]).setValue(v2);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i2 = -(iZza + 1);
        if (i2 >= 16) {
            return zzf().put(k2, v2);
        }
        int i3 = this.zzb;
        if (i3 == 16) {
            zzlz zzlzVar = (zzlz) this.zza[15];
            this.zzb = i3 - 1;
            zzf().put((Comparable) zzlzVar.getKey(), zzlzVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2, objArr, i2 + 1, (objArr.length - i2) - 1);
        this.zza[i2] = new zzlz(this, k2, v2);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i2) {
        if (i2 < this.zzb) {
            return (zzlz) this.zza[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    final Set<Map.Entry<K, V>> zzc() {
        return new zzma(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
