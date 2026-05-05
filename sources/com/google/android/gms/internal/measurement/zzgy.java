package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgy implements zzhh {
    private final SimpleArrayMap<String, SimpleArrayMap<String, String>> zza;

    zzgy(SimpleArrayMap<String, SimpleArrayMap<String, String>> simpleArrayMap) {
        this.zza = simpleArrayMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e A[RETURN] */
    @Override // com.google.android.gms.internal.measurement.zzhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza(android.net.Uri r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L16
            java.lang.String r5 = r4.toString()
        L7:
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String>> r0 = r3.zza
            if (r0 != 0) goto Lf
        Lb:
            r1 = r2
        Lc:
            if (r1 != 0) goto L19
            return r2
        Lf:
            java.lang.Object r1 = r0.get(r5)
            androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
            goto Lc
        L16:
            if (r5 == 0) goto Lb
            goto L7
        L19:
            if (r6 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r7 = r0.toString()
        L2c:
            java.lang.Object r0 = r1.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgy.zza(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
