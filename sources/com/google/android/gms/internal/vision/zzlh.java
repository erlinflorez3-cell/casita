package com.google.android.gms.internal.vision;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
class zzlh<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzlm> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzlo zze;
    private Map<K, V> zzf;
    private volatile zzli zzg;

    private zzlh(int i2) {
        this.zza = i2;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    /* synthetic */ zzlh(int i2, zzlg zzlgVar) {
        this(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.vision.zzlm> r0 = r4.zzb
            int r1 = r0.size()
            int r3 = r1 + (-1)
            if (r3 < 0) goto L25
            java.util.List<com.google.android.gms.internal.vision.zzlm> r0 = r4.zzb
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.vision.zzlm r0 = (com.google.android.gms.internal.vision.zzlm) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = r5.compareTo(r0)
            if (r0 <= 0) goto L22
            int r0 = r1 + 1
        L20:
            int r0 = -r0
            return r0
        L22:
            if (r0 != 0) goto L25
            return r3
        L25:
            r2 = 0
        L26:
            if (r2 > r3) goto L48
            int r0 = r2 + r3
            int r1 = r0 / 2
            java.util.List<com.google.android.gms.internal.vision.zzlm> r0 = r4.zzb
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.vision.zzlm r0 = (com.google.android.gms.internal.vision.zzlm) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = r5.compareTo(r0)
            if (r0 >= 0) goto L43
            int r3 = r1 + (-1)
            goto L26
        L43:
            if (r0 <= 0) goto L4b
            int r2 = r1 + 1
            goto L26
        L48:
            int r0 = r2 + 1
            goto L20
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzlh.zza(java.lang.Comparable):int");
    }

    static <FieldDescriptorType extends zziw<FieldDescriptorType>> zzlh<FieldDescriptorType, Object> zza(int i2) {
        return new zzlg(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i2) {
        zzf();
        V v2 = (V) this.zzb.remove(i2).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzg().entrySet().iterator();
            this.zzb.add(new zzlm(this, it.next()));
            it.remove();
        }
        return v2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzg() {
        zzf();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzf();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
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
            this.zze = new zzlo(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlh)) {
            return super.equals(obj);
        }
        zzlh zzlhVar = (zzlh) obj;
        int size = size();
        if (size != zzlhVar.size()) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc != zzlhVar.zzc()) {
            return entrySet().equals(zzlhVar.entrySet());
        }
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzb(i2).equals(zzlhVar.zzb(i2))) {
                return false;
            }
        }
        if (iZzc != size) {
            return this.zzc.equals(zzlhVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) this.zzb.get(iZza).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzc = zzc();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iHashCode += this.zzb.get(i2).hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzf();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzc(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v2) {
        zzf();
        int iZza = zza(k2);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).setValue(v2);
        }
        zzf();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i2 = -(iZza + 1);
        if (i2 >= this.zza) {
            return zzg().put(k2, v2);
        }
        int size = this.zzb.size();
        int i3 = this.zza;
        if (size == i3) {
            zzlm zzlmVarRemove = this.zzb.remove(i3 - 1);
            zzg().put((Comparable) zzlmVarRemove.getKey(), zzlmVarRemove.getValue());
        }
        this.zzb.add(i2, new zzlm(this, k2, v2));
        return null;
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final Map.Entry<K, V> zzb(int i2) {
        return this.zzb.get(i2);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Iterable<Map.Entry<K, V>> zzd() {
        return this.zzc.isEmpty() ? zzll.zza() : this.zzc.entrySet();
    }

    final Set<Map.Entry<K, V>> zze() {
        if (this.zzg == null) {
            this.zzg = new zzli(this, null);
        }
        return this.zzg;
    }
}
