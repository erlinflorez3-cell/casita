package com.incode.welcome_sdk.commons.utils;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: b */
    private static int f6634b = 1;

    /* JADX INFO: renamed from: c */
    private static int f6635c = 0;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0026, code lost:
    
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(r4) == 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.q.f6635c
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.q.f6634b = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L10
            goto L1b
        L10:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Exception -> L49 java.lang.NoClassDefFoundError -> L4e
            int r0 = r0.isGooglePlayServicesAvailable(r4)     // Catch: java.lang.Exception -> L49 java.lang.NoClassDefFoundError -> L4e
            if (r0 != 0) goto L36
            goto L28
        L1b:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Exception -> L49 java.lang.NoClassDefFoundError -> L4e
            int r1 = r0.isGooglePlayServicesAvailable(r4)     // Catch: java.lang.Exception -> L49 java.lang.NoClassDefFoundError -> L4e
            r0 = 84
            int r0 = r0 / r2
            if (r1 != 0) goto L36
        L28:
            int r0 = com.incode.welcome_sdk.commons.utils.q.f6635c
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.q.f6634b = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L34
            return r2
        L34:
            r0 = 1
            return r0
        L36:
            int r0 = com.incode.welcome_sdk.commons.utils.q.f6635c
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.q.f6634b = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L42
            return r2
        L42:
            r0 = 0
            r0.hashCode()
            throw r0
        L47:
            r0 = move-exception
            throw r0
        L49:
            r0 = move-exception
            r0.printStackTrace()
            goto L52
        L4e:
            r0 = move-exception
            r0.printStackTrace()
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.q.d(android.content.Context):boolean");
    }
}
