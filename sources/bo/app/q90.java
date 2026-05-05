package bo.app;

/* JADX INFO: loaded from: classes4.dex */
public final class q90 {
    /* JADX WARN: Removed duplicated region for block: B:49:0x0029 A[Catch: JSONException -> 0x00aa, TryCatch #0 {JSONException -> 0x00aa, blocks: (B:42:0x0015, B:47:0x0021, B:49:0x0029, B:50:0x002f, B:52:0x0035, B:53:0x003f, B:55:0x0066, B:62:0x0088, B:64:0x008c, B:66:0x0098, B:61:0x0073), top: B:73:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0035 A[Catch: JSONException -> 0x00aa, TryCatch #0 {JSONException -> 0x00aa, blocks: (B:42:0x0015, B:47:0x0021, B:49:0x0029, B:50:0x002f, B:52:0x0035, B:53:0x003f, B:55:0x0066, B:62:0x0088, B:64:0x008c, B:66:0x0098, B:61:0x0073), top: B:73:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0066 A[Catch: JSONException -> 0x00aa, TryCatch #0 {JSONException -> 0x00aa, blocks: (B:42:0x0015, B:47:0x0021, B:49:0x0029, B:50:0x002f, B:52:0x0035, B:53:0x003f, B:55:0x0066, B:62:0x0088, B:64:0x008c, B:66:0x0098, B:61:0x0073), top: B:73:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073 A[Catch: JSONException -> 0x00aa, TryCatch #0 {JSONException -> 0x00aa, blocks: (B:42:0x0015, B:47:0x0021, B:49:0x0029, B:50:0x002f, B:52:0x0035, B:53:0x003f, B:55:0x0066, B:62:0x0088, B:64:0x008c, B:66:0x0098, B:61:0x0073), top: B:73:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bo.app.r90 a(org.json.JSONObject r20, boolean r21) {
        /*
            r19 = this;
            java.lang.String r2 = "expiration_time"
            java.lang.String r1 = "authorization_code"
            java.lang.String r0 = "jsonData"
            r8 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            bo.app.r90 r5 = new bo.app.r90
            r5.<init>()
            r10 = 1
            r9 = 0
            if (r21 != 0) goto L20
            java.lang.String r0 = "enabled"
            boolean r0 = r8.getBoolean(r0)     // Catch: org.json.JSONException -> Laa
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = r9
            goto L21
        L20:
            r0 = r10
        L21:
            r5.f1655a = r0     // Catch: org.json.JSONException -> Laa
            boolean r0 = r8.has(r1)     // Catch: org.json.JSONException -> Laa
            if (r0 == 0) goto L2f
            java.lang.String r0 = r8.getString(r1)     // Catch: org.json.JSONException -> Laa
            r5.f1657c = r0     // Catch: org.json.JSONException -> Laa
        L2f:
            boolean r0 = r8.has(r2)     // Catch: org.json.JSONException -> Laa
            if (r0 == 0) goto L3f
            long r0 = r8.getLong(r2)     // Catch: org.json.JSONException -> Laa
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> Laa
            r5.f1656b = r0     // Catch: org.json.JSONException -> Laa
        L3f:
            java.lang.String r0 = "batching_config"
            org.json.JSONObject r2 = r8.getJSONObject(r0)     // Catch: org.json.JSONException -> Laa
            java.lang.String r0 = "flush_interval_size"
            long r0 = r2.getLong(r0)     // Catch: org.json.JSONException -> Laa
            r5.f1658d = r0     // Catch: org.json.JSONException -> Laa
            java.lang.String r0 = "flush_interval_seconds"
            long r0 = r2.getLong(r0)     // Catch: org.json.JSONException -> Laa
            r5.f1659e = r0     // Catch: org.json.JSONException -> Laa
            java.lang.String r0 = "max_payload_size"
            long r3 = r2.getLong(r0)     // Catch: org.json.JSONException -> Laa
            r5.f1660f = r3     // Catch: org.json.JSONException -> Laa
            long r1 = r5.f1658d     // Catch: org.json.JSONException -> Laa
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L73
            long r1 = r5.f1659e     // Catch: org.json.JSONException -> Laa
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L73
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L71
            goto L73
        L71:
            r10 = r9
            goto L88
        L73:
            com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.INSTANCE     // Catch: org.json.JSONException -> Laa
            bo.app.n90 r0 = new bo.app.n90     // Catch: org.json.JSONException -> Laa
            r0.<init>(r8)     // Catch: org.json.JSONException -> Laa
            r17 = 7
            r18 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r12 = r19
            r16 = r0
            com.braze.support.BrazeLogger.brazelog$default(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: org.json.JSONException -> Laa
        L88:
            java.lang.Long r0 = r5.f1656b     // Catch: org.json.JSONException -> Laa
            if (r0 == 0) goto La7
            long r3 = r0.longValue()     // Catch: org.json.JSONException -> Laa
            long r1 = com.braze.support.DateTimeUtils.nowInSeconds()     // Catch: org.json.JSONException -> Laa
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto La7
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: org.json.JSONException -> Laa
            bo.app.o90 r5 = bo.app.o90.f1430a     // Catch: org.json.JSONException -> Laa
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r19
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: org.json.JSONException -> Laa
            goto Lb9
        La7:
            if (r10 == 0) goto Lbe
            goto Lb9
        Laa:
            r3 = move-exception
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.E
            bo.app.p90 r5 = bo.app.p90.f1501a
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r19
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
        Lb9:
            bo.app.r90 r5 = new bo.app.r90
            r5.<init>()
        Lbe:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.q90.a(org.json.JSONObject, boolean):bo.app.r90");
    }
}
