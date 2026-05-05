package com.google.android.gms.dynamite;

import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes8.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    zzk() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r0
  0x001d: PHI (r0v2 int) = (r0v1 int), (r0v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r5, java.lang.String r6, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r7) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r4 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r3 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r3.<init>()
            int r0 = r7.zza(r5, r6)
            r3.localVersion = r0
            r2 = 1
            int r1 = r7.zzb(r5, r6, r2)
            r3.remoteVersion = r1
            int r0 = r3.localVersion
            if (r0 != 0) goto L1d
            r0 = 0
            if (r1 != 0) goto L1d
            r2 = r0
        L1a:
            r3.selection = r2
            return r3
        L1d:
            if (r1 < r0) goto L20
            goto L1a
        L20:
            r2 = -1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.zzk.selectModule(android.content.Context, java.lang.String, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions):com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult");
    }
}
