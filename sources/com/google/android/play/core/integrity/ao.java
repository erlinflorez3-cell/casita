package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes9.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f3356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3357c = null;

    /* synthetic */ ao(String str, Long l2, Object obj, an anVar) {
        this.f3355a = str;
        this.f3356b = l2;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f3356b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 != r5) goto L4
            return r4
        L4:
            boolean r0 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r3 = 0
            if (r0 == 0) goto L43
            r2 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r2 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r2
            java.lang.String r1 = r5.f3355a
            java.lang.String r0 = r2.nonce()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L43
            java.lang.Long r1 = r5.f3356b
            if (r1 != 0) goto L38
            java.lang.Long r0 = r2.cloudProjectNumber()
            if (r0 != 0) goto L43
        L22:
            r1 = r4
        L23:
            boolean r0 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r0 == 0) goto L36
            boolean r0 = a()
            if (r0 == 0) goto L36
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r1 == 0) goto L34
            java.lang.Object r0 = r6.f3357c
        L33:
            return r4
        L34:
            r4 = r3
            goto L33
        L36:
            r4 = r1
            goto L33
        L38:
            java.lang.Long r0 = r2.cloudProjectNumber()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L43
            goto L22
        L43:
            r1 = r3
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f3355a.hashCode() ^ 1000003;
        Long l2 = this.f3356b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l2 == null ? 0 : l2.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f3355a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f3355a + ", cloudProjectNumber=" + this.f3356b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
