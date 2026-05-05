package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
final class zzdb extends zzcy {
    /* JADX INFO: Access modifiers changed from: private */
    zzdb() {
        super();
    }

    /* synthetic */ zzdb(zzcz zzczVar) {
        this();
    }

    private static <E> zzcn<E> zzc(Object obj, long j2) {
        return (zzcn) zzfd.zzo(obj, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final void zza(Object obj, long j2) {
        zzc(obj, j2).zzv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.clearcut.zzcn, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.clearcut.zzcn] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.google.android.gms.internal.clearcut.zzcy
    final <E> void zza(Object obj, Object obj2, long j2) {
        zzcn zzcnVarZzc = zzc(obj, j2);
        ?? Zzc = zzc(obj2, j2);
        int size = zzcnVarZzc.size();
        int size2 = Zzc.size();
        ?? r4 = zzcnVarZzc;
        r4 = zzcnVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZzu = zzcnVarZzc.zzu();
            ?? Zzi = zzcnVarZzc;
            if (!zZzu) {
                Zzi = zzcnVarZzc.zzi(size2 + size);
            }
            Zzi.addAll(Zzc);
            r4 = Zzi;
        }
        if (size > 0) {
            Zzc = r4;
        }
        zzfd.zza(obj, j2, (Object) Zzc);
    }
}
