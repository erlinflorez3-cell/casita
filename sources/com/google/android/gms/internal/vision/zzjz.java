package com.google.android.gms.internal.vision;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzjz extends zzju {
    /* JADX INFO: Access modifiers changed from: private */
    zzjz() {
        super();
    }

    /* synthetic */ zzjz(zzjx zzjxVar) {
        this();
    }

    private static <E> zzjl<E> zzc(Object obj, long j2) {
        return (zzjl) zzma.zzf(obj, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final <L> List<L> zza(Object obj, long j2) {
        zzjl zzjlVarZzc = zzc(obj, j2);
        if (zzjlVarZzc.zza()) {
            return zzjlVarZzc;
        }
        int size = zzjlVarZzc.size();
        zzjl zzjlVarZza = zzjlVarZzc.zza(size == 0 ? 10 : size << 1);
        zzma.zza(obj, j2, zzjlVarZza);
        return zzjlVarZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.vision.zzjl, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.vision.zzjl] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.google.android.gms.internal.vision.zzju
    final <E> void zza(Object obj, Object obj2, long j2) {
        zzjl zzjlVarZzc = zzc(obj, j2);
        ?? Zzc = zzc(obj2, j2);
        int size = zzjlVarZzc.size();
        int size2 = Zzc.size();
        ?? r4 = zzjlVarZzc;
        r4 = zzjlVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZza = zzjlVarZzc.zza();
            ?? Zza = zzjlVarZzc;
            if (!zZza) {
                Zza = zzjlVarZzc.zza(size2 + size);
            }
            Zza.addAll(Zzc);
            r4 = Zza;
        }
        if (size > 0) {
            Zzc = r4;
        }
        zzma.zza(obj, j2, (Object) Zzc);
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final void zzb(Object obj, long j2) {
        zzc(obj, j2).zzb();
    }
}
