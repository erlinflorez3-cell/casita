package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafe extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzaex();
    zzafd zza;
    int zzb;
    int zzc;
    final zzafd zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzaez zzh;
    private zzafb zzi;

    public zzafe() {
        this(zze, true);
    }

    public zzafe(Comparator comparator, boolean z2) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z2;
        this.zzd = new zzafd(z2);
    }

    public zzafe(boolean z2) {
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
    private final void zzf(com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L60
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r7 = r9.zzb
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r6 = r9.zzc
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
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r1 = r6.zzb
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r0 = r6.zzc
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
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r9 = r9.zza
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
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r2 = r7.zzb
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd r0 = r7.zzc
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafe.zzf(com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafd, boolean):void");
    }

    private final void zzg(zzafd zzafdVar, zzafd zzafdVar2) {
        zzafd zzafdVar3 = zzafdVar.zza;
        zzafdVar.zza = null;
        if (zzafdVar2 != null) {
            zzafdVar2.zza = zzafdVar3;
        }
        if (zzafdVar3 == null) {
            this.zza = zzafdVar2;
        } else if (zzafdVar3.zzb == zzafdVar) {
            zzafdVar3.zzb = zzafdVar2;
        } else {
            zzafdVar3.zzc = zzafdVar2;
        }
    }

    private final void zzh(zzafd zzafdVar) {
        zzafd zzafdVar2 = zzafdVar.zzb;
        zzafd zzafdVar3 = zzafdVar.zzc;
        zzafd zzafdVar4 = zzafdVar3.zzb;
        zzafd zzafdVar5 = zzafdVar3.zzc;
        zzafdVar.zzc = zzafdVar4;
        if (zzafdVar4 != null) {
            zzafdVar4.zza = zzafdVar;
        }
        zzg(zzafdVar, zzafdVar3);
        zzafdVar3.zzb = zzafdVar;
        zzafdVar.zza = zzafdVar3;
        int iMax = Math.max(zzafdVar2 != null ? zzafdVar2.zzi : 0, zzafdVar4 != null ? zzafdVar4.zzi : 0) + 1;
        zzafdVar.zzi = iMax;
        zzafdVar3.zzi = Math.max(iMax, zzafdVar5 != null ? zzafdVar5.zzi : 0) + 1;
    }

    private final void zzi(zzafd zzafdVar) {
        zzafd zzafdVar2 = zzafdVar.zzb;
        zzafd zzafdVar3 = zzafdVar.zzc;
        zzafd zzafdVar4 = zzafdVar2.zzb;
        zzafd zzafdVar5 = zzafdVar2.zzc;
        zzafdVar.zzb = zzafdVar5;
        if (zzafdVar5 != null) {
            zzafdVar5.zza = zzafdVar;
        }
        zzg(zzafdVar, zzafdVar2);
        zzafdVar2.zzc = zzafdVar;
        zzafdVar.zza = zzafdVar2;
        int iMax = Math.max(zzafdVar3 != null ? zzafdVar3.zzi : 0, zzafdVar5 != null ? zzafdVar5.zzi : 0) + 1;
        zzafdVar.zzi = iMax;
        zzafdVar2.zzi = Math.max(iMax, zzafdVar4 != null ? zzafdVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzafd zzafdVar = this.zzd;
        zzafdVar.zze = zzafdVar;
        zzafdVar.zzd = zzafdVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzaez zzaezVar = this.zzh;
        if (zzaezVar != null) {
            return zzaezVar;
        }
        zzaez zzaezVar2 = new zzaez(this);
        this.zzh = zzaezVar2;
        return zzaezVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzafd zzafdVarZzc = zzc(obj);
        if (zzafdVarZzc != null) {
            return zzafdVarZzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzafb zzafbVar = this.zzi;
        if (zzafbVar != null) {
            return zzafbVar;
        }
        zzafb zzafbVar2 = new zzafb(this);
        this.zzi = zzafbVar2;
        return zzafbVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzafd zzafdVarZza = zza(obj, true);
        Object obj3 = zzafdVarZza.zzh;
        zzafdVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzafd zzafdVarZzd = zzd(obj);
        if (zzafdVarZzd != null) {
            return zzafdVarZzd.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzafd zza(Object obj, boolean z2) {
        int iCompareTo;
        zzafd zzafdVar;
        Comparator comparator = this.zzf;
        zzafd zzafdVar2 = this.zza;
        if (zzafdVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzafdVar2.zzf) : comparator.compare(obj, zzafdVar2.zzf);
                if (iCompareTo == 0) {
                    return zzafdVar2;
                }
                zzafd zzafdVar3 = iCompareTo < 0 ? zzafdVar2.zzb : zzafdVar2.zzc;
                if (zzafdVar3 == null) {
                    break;
                }
                zzafdVar2 = zzafdVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z2) {
            return null;
        }
        zzafd zzafdVar4 = this.zzd;
        if (zzafdVar2 != null) {
            zzafdVar = new zzafd(this.zzg, zzafdVar2, obj, zzafdVar4, zzafdVar4.zze);
            if (iCompareTo < 0) {
                zzafdVar2.zzb = zzafdVar;
            } else {
                zzafdVar2.zzc = zzafdVar;
            }
            zzf(zzafdVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            zzafdVar = new zzafd(this.zzg, null, obj, zzafdVar4, zzafdVar4.zze);
            this.zza = zzafdVar;
        }
        this.zzb++;
        this.zzc++;
        return zzafdVar;
    }

    final zzafd zzb(Map.Entry entry) {
        zzafd zzafdVarZzc = zzc(entry.getKey());
        if (zzafdVarZzc == null || !Objects.equals(zzafdVarZzc.zzh, entry.getValue())) {
            return null;
        }
        return zzafdVarZzc;
    }

    final zzafd zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    final zzafd zzd(Object obj) {
        zzafd zzafdVarZzc = zzc(obj);
        if (zzafdVarZzc != null) {
            zze(zzafdVarZzc, true);
        }
        return zzafdVarZzc;
    }

    final void zze(zzafd zzafdVar, boolean z2) {
        zzafd zzafdVar2;
        int i2;
        if (z2) {
            zzafd zzafdVar3 = zzafdVar.zze;
            zzafdVar3.zzd = zzafdVar.zzd;
            zzafdVar.zzd.zze = zzafdVar3;
        }
        zzafd zzafdVar4 = zzafdVar.zzb;
        zzafd zzafdVar5 = zzafdVar.zzc;
        zzafd zzafdVar6 = zzafdVar.zza;
        int i3 = 0;
        if (zzafdVar4 == null || zzafdVar5 == null) {
            if (zzafdVar4 != null) {
                zzg(zzafdVar, zzafdVar4);
                zzafdVar.zzb = null;
            } else if (zzafdVar5 != null) {
                zzg(zzafdVar, zzafdVar5);
                zzafdVar.zzc = null;
            } else {
                zzg(zzafdVar, null);
            }
            zzf(zzafdVar6, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzafdVar4.zzi > zzafdVar5.zzi) {
            do {
                zzafdVar2 = zzafdVar4;
                zzafdVar4 = zzafdVar4.zzc;
            } while (zzafdVar4 != null);
        } else {
            do {
                zzafdVar2 = zzafdVar5;
                zzafdVar5 = zzafdVar5.zzb;
            } while (zzafdVar5 != null);
        }
        zze(zzafdVar2, false);
        zzafd zzafdVar7 = zzafdVar.zzb;
        if (zzafdVar7 != null) {
            i2 = zzafdVar7.zzi;
            zzafdVar2.zzb = zzafdVar7;
            zzafdVar7.zza = zzafdVar2;
            zzafdVar.zzb = null;
        } else {
            i2 = 0;
        }
        zzafd zzafdVar8 = zzafdVar.zzc;
        if (zzafdVar8 != null) {
            i3 = zzafdVar8.zzi;
            zzafdVar2.zzc = zzafdVar8;
            zzafdVar8.zza = zzafdVar2;
            zzafdVar.zzc = null;
        }
        zzafdVar2.zzi = Math.max(i2, i3) + 1;
        zzg(zzafdVar, zzafdVar2);
    }
}
