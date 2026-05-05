package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzda extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzct();
    zzcz zza;
    int zzb;
    int zzc;
    final zzcz zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzcv zzh;
    private zzcx zzi;

    public zzda() {
        this(zze, true);
    }

    public zzda(Comparator comparator, boolean z2) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z2;
        this.zzd = new zzcz(z2);
    }

    public zzda(boolean z2) {
        this(zze, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x002f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzf(com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L60
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r7 = r9.zzb
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r6 = r9.zzc
            r5 = 0
            if (r7 == 0) goto L42
            int r4 = r7.zzi
        Lb:
            if (r6 == 0) goto L40
            int r2 = r6.zzi
        Lf:
            int r1 = r4 - r2
            r0 = -2
            r3 = 1
            if (r1 != r0) goto L44
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r1 = r6.zzb
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r0 = r6.zzc
            if (r0 == 0) goto L3e
            int r0 = r0.zzi
        L1d:
            if (r1 == 0) goto L3c
            int r1 = r1.zzi
        L21:
            int r1 = r1 - r0
            r0 = -1
            if (r1 == r0) goto L3a
            if (r1 != 0) goto L32
            if (r10 != 0) goto L33
        L29:
            r8.zzh(r9)
            r3 = r5
        L2d:
            if (r3 != 0) goto L60
        L2f:
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r9 = r9.zza
            goto L0
        L32:
            r3 = r10
        L33:
            r8.zzi(r6)
            r8.zzh(r9)
            goto L2d
        L3a:
            r5 = r10
            goto L29
        L3c:
            r1 = r5
            goto L21
        L3e:
            r0 = r5
            goto L1d
        L40:
            r2 = r5
            goto Lf
        L42:
            r4 = r5
            goto Lb
        L44:
            r0 = 2
            if (r1 != r0) goto L6f
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r2 = r7.zzb
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz r0 = r7.zzc
            if (r0 == 0) goto L6d
            int r1 = r0.zzi
        L4f:
            if (r2 == 0) goto L6b
            int r0 = r2.zzi
        L53:
            int r0 = r0 - r1
            if (r0 == r3) goto L69
            if (r0 != 0) goto L61
            if (r10 != 0) goto L62
        L5a:
            r8.zzi(r9)
            r3 = r5
        L5e:
            if (r3 == 0) goto L2f
        L60:
            return
        L61:
            r3 = r10
        L62:
            r8.zzh(r7)
            r8.zzi(r9)
            goto L5e
        L69:
            r5 = r10
            goto L5a
        L6b:
            r0 = r5
            goto L53
        L6d:
            r1 = r5
            goto L4f
        L6f:
            if (r1 != 0) goto L78
            int r0 = r4 + 1
            r9.zzi = r0
            if (r10 == 0) goto L2f
            goto L60
        L78:
            int r0 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r3
            r9.zzi = r0
            if (r10 != 0) goto L2f
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzda.zzf(com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcz, boolean):void");
    }

    private final void zzg(zzcz zzczVar, zzcz zzczVar2) {
        zzcz zzczVar3 = zzczVar.zza;
        zzczVar.zza = null;
        if (zzczVar2 != null) {
            zzczVar2.zza = zzczVar3;
        }
        if (zzczVar3 == null) {
            this.zza = zzczVar2;
        } else if (zzczVar3.zzb == zzczVar) {
            zzczVar3.zzb = zzczVar2;
        } else {
            zzczVar3.zzc = zzczVar2;
        }
    }

    private final void zzh(zzcz zzczVar) {
        zzcz zzczVar2 = zzczVar.zzb;
        zzcz zzczVar3 = zzczVar.zzc;
        zzcz zzczVar4 = zzczVar3.zzb;
        zzcz zzczVar5 = zzczVar3.zzc;
        zzczVar.zzc = zzczVar4;
        if (zzczVar4 != null) {
            zzczVar4.zza = zzczVar;
        }
        zzg(zzczVar, zzczVar3);
        zzczVar3.zzb = zzczVar;
        zzczVar.zza = zzczVar3;
        int iMax = Math.max(zzczVar2 != null ? zzczVar2.zzi : 0, zzczVar4 != null ? zzczVar4.zzi : 0) + 1;
        zzczVar.zzi = iMax;
        zzczVar3.zzi = Math.max(iMax, zzczVar5 != null ? zzczVar5.zzi : 0) + 1;
    }

    private final void zzi(zzcz zzczVar) {
        zzcz zzczVar2 = zzczVar.zzb;
        zzcz zzczVar3 = zzczVar.zzc;
        zzcz zzczVar4 = zzczVar2.zzb;
        zzcz zzczVar5 = zzczVar2.zzc;
        zzczVar.zzb = zzczVar5;
        if (zzczVar5 != null) {
            zzczVar5.zza = zzczVar;
        }
        zzg(zzczVar, zzczVar2);
        zzczVar2.zzc = zzczVar;
        zzczVar.zza = zzczVar2;
        int iMax = Math.max(zzczVar3 != null ? zzczVar3.zzi : 0, zzczVar5 != null ? zzczVar5.zzi : 0) + 1;
        zzczVar.zzi = iMax;
        zzczVar2.zzi = Math.max(iMax, zzczVar4 != null ? zzczVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzcz zzczVar = this.zzd;
        zzczVar.zze = zzczVar;
        zzczVar.zzd = zzczVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzcv zzcvVar = this.zzh;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzcv zzcvVar2 = new zzcv(this);
        this.zzh = zzcvVar2;
        return zzcvVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzcz zzczVarZzc = zzc(obj);
        if (zzczVarZzc != null) {
            return zzczVarZzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzcx zzcxVar = this.zzi;
        if (zzcxVar != null) {
            return zzcxVar;
        }
        zzcx zzcxVar2 = new zzcx(this);
        this.zzi = zzcxVar2;
        return zzcxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzcz zzczVarZza = zza(obj, true);
        Object obj3 = zzczVarZza.zzh;
        zzczVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzcz zzczVarZzd = zzd(obj);
        if (zzczVarZzd != null) {
            return zzczVarZzd.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzcz zza(Object obj, boolean z2) {
        int iCompareTo;
        zzcz zzczVar;
        Comparator comparator = this.zzf;
        zzcz zzczVar2 = this.zza;
        if (zzczVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzczVar2.zzf) : comparator.compare(obj, zzczVar2.zzf);
                if (iCompareTo == 0) {
                    return zzczVar2;
                }
                zzcz zzczVar3 = iCompareTo < 0 ? zzczVar2.zzb : zzczVar2.zzc;
                if (zzczVar3 == null) {
                    break;
                }
                zzczVar2 = zzczVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z2) {
            return null;
        }
        zzcz zzczVar4 = this.zzd;
        if (zzczVar2 != null) {
            zzczVar = new zzcz(this.zzg, zzczVar2, obj, zzczVar4, zzczVar4.zze);
            if (iCompareTo < 0) {
                zzczVar2.zzb = zzczVar;
            } else {
                zzczVar2.zzc = zzczVar;
            }
            zzf(zzczVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            zzczVar = new zzcz(this.zzg, null, obj, zzczVar4, zzczVar4.zze);
            this.zza = zzczVar;
        }
        this.zzb++;
        this.zzc++;
        return zzczVar;
    }

    final zzcz zzb(Map.Entry entry) {
        zzcz zzczVarZzc = zzc(entry.getKey());
        if (zzczVarZzc == null || !Objects.equals(zzczVarZzc.zzh, entry.getValue())) {
            return null;
        }
        return zzczVarZzc;
    }

    final zzcz zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    final zzcz zzd(Object obj) {
        zzcz zzczVarZzc = zzc(obj);
        if (zzczVarZzc != null) {
            zze(zzczVarZzc, true);
        }
        return zzczVarZzc;
    }

    final void zze(zzcz zzczVar, boolean z2) {
        zzcz zzczVar2;
        int i2;
        if (z2) {
            zzcz zzczVar3 = zzczVar.zze;
            zzczVar3.zzd = zzczVar.zzd;
            zzczVar.zzd.zze = zzczVar3;
        }
        zzcz zzczVar4 = zzczVar.zzb;
        zzcz zzczVar5 = zzczVar.zzc;
        zzcz zzczVar6 = zzczVar.zza;
        int i3 = 0;
        if (zzczVar4 == null || zzczVar5 == null) {
            if (zzczVar4 != null) {
                zzg(zzczVar, zzczVar4);
                zzczVar.zzb = null;
            } else if (zzczVar5 != null) {
                zzg(zzczVar, zzczVar5);
                zzczVar.zzc = null;
            } else {
                zzg(zzczVar, null);
            }
            zzf(zzczVar6, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzczVar4.zzi > zzczVar5.zzi) {
            do {
                zzczVar2 = zzczVar4;
                zzczVar4 = zzczVar4.zzc;
            } while (zzczVar4 != null);
        } else {
            do {
                zzczVar2 = zzczVar5;
                zzczVar5 = zzczVar5.zzb;
            } while (zzczVar5 != null);
        }
        zze(zzczVar2, false);
        zzcz zzczVar7 = zzczVar.zzb;
        if (zzczVar7 != null) {
            i2 = zzczVar7.zzi;
            zzczVar2.zzb = zzczVar7;
            zzczVar7.zza = zzczVar2;
            zzczVar.zzb = null;
        } else {
            i2 = 0;
        }
        zzcz zzczVar8 = zzczVar.zzc;
        if (zzczVar8 != null) {
            i3 = zzczVar8.zzi;
            zzczVar2.zzc = zzczVar8;
            zzczVar8.zza = zzczVar2;
            zzczVar.zzc = null;
        }
        zzczVar2.zzi = Math.max(i2, i3) + 1;
        zzg(zzczVar, zzczVar2);
    }
}
