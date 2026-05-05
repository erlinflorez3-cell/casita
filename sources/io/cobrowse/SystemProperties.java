package io.cobrowse;

/* JADX INFO: loaded from: classes3.dex */
final class SystemProperties {
    private static final String SYSTEM_GETPROP_FILE = "/system/bin/getprop";

    SystemProperties() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String read(java.lang.String r6) throws java.lang.Throwable {
        /*
            java.lang.String r4 = "/system/bin/getprop"
            r5 = 0
            java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r0[r1] = r4     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r1 = 1
            r0[r1] = r6     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.ProcessBuilder r0 = r2.command(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r1)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.Process r3 = r0.start()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5f
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5f
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5f
            r2.<init>(r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5f
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            r2.close()     // Catch: java.io.IOException -> L34
        L34:
            if (r3 == 0) goto L39
            r3.destroy()
        L39:
            return r0
        L3a:
            r0 = move-exception
            goto L45
        L3c:
            r0 = move-exception
            r2 = r5
            goto L45
        L3f:
            r0 = move-exception
            r3 = r5
            goto L60
        L42:
            r0 = move-exception
            r3 = r5
            r2 = r3
        L45:
            java.lang.String r0 = "CobrowseIO"
            java.lang.String r1 = "Failed to read property %s from %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r4}     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L56
            r2.close()     // Catch: java.io.IOException -> L56
        L56:
            if (r3 == 0) goto L5b
            r3.destroy()
        L5b:
            return r5
        L5c:
            r0 = move-exception
            r5 = r2
            goto L60
        L5f:
            r0 = move-exception
        L60:
            if (r5 == 0) goto L65
            r5.close()     // Catch: java.io.IOException -> L65
        L65:
            if (r3 == 0) goto L6a
            r3.destroy()
        L6a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.cobrowse.SystemProperties.read(java.lang.String):java.lang.String");
    }
}
