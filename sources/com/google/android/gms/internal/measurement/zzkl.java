package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzkl implements zzkm {
    zzkl() {
    }

    private static <E> zzkc<E> zzc(Object obj, long j2) {
        return (zzkc) zzml.zze(obj, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final <L> List<L> zza(Object obj, long j2) {
        zzkc zzkcVarZzc = zzc(obj, j2);
        if (zzkcVarZzc.zzc()) {
            return zzkcVarZzc;
        }
        int size = zzkcVarZzc.size();
        zzkc zzkcVarZza = zzkcVarZzc.zza(size == 0 ? 10 : size << 1);
        zzml.zza(obj, j2, zzkcVarZza);
        return zzkcVarZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.measurement.zzkc, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.measurement.zzkc] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.google.android.gms.internal.measurement.zzkm
    public final <E> void zza(Object obj, Object obj2, long j2) {
        zzkc zzkcVarZzc = zzc(obj, j2);
        ?? Zzc = zzc(obj2, j2);
        int size = zzkcVarZzc.size();
        int size2 = Zzc.size();
        ?? r4 = zzkcVarZzc;
        r4 = zzkcVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZzc = zzkcVarZzc.zzc();
            ?? Zza = zzkcVarZzc;
            if (!zZzc) {
                Zza = zzkcVarZzc.zza(size2 + size);
            }
            Zza.addAll(Zzc);
            r4 = Zza;
        }
        if (size > 0) {
            Zzc = r4;
        }
        zzml.zza(obj, j2, (Object) Zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzb(Object obj, long j2) {
        zzc(obj, j2).zzb();
    }
}
