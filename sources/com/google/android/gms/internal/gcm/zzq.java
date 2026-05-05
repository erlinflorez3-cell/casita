package com.google.android.gms.internal.gcm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq {
    private static final zzr zzdq;
    private static final int zzdr;

    static final class zzd extends zzr {
        zzd() {
        }

        @Override // com.google.android.gms.internal.gcm.zzr
        public final void zzd(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0006, B:6:0x000e, B:7:0x0014, B:9:0x001c, B:10:0x0022), top: B:24:0x0006 }] */
    static {
        /*
            java.lang.Integer r5 = zzac()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L14
            int r1 = r5.intValue()     // Catch: java.lang.Throwable -> L2b
            r0 = 19
            if (r1 < r0) goto L14
            com.google.android.gms.internal.gcm.zzv r0 = new com.google.android.gms.internal.gcm.zzv     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            goto L64
        L14:
            java.lang.String r0 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L22
            com.google.android.gms.internal.gcm.zzu r0 = new com.google.android.gms.internal.gcm.zzu     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            goto L64
        L22:
            com.google.android.gms.internal.gcm.zzq$zzd r0 = new com.google.android.gms.internal.gcm.zzq$zzd     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            goto L64
        L28:
            r4 = move-exception
            r5 = 0
            goto L2c
        L2b:
            r4 = move-exception
        L2c:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.gcm.zzq$zzd> r0 = com.google.android.gms.internal.gcm.zzq.zzd.class
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            int r0 = r0 + 133
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r2)
            java.lang.String r0 = "will be used. The error is: "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.println(r0)
            java.io.PrintStream r0 = java.lang.System.err
            r4.printStackTrace(r0)
            com.google.android.gms.internal.gcm.zzq$zzd r0 = new com.google.android.gms.internal.gcm.zzq$zzd
            r0.<init>()
        L64:
            com.google.android.gms.internal.gcm.zzq.zzdq = r0
            if (r5 != 0) goto L6c
            r0 = 1
        L69:
            com.google.android.gms.internal.gcm.zzq.zzdr = r0
            return
        L6c:
            int r0 = r5.intValue()
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gcm.zzq.<clinit>():void");
    }

    private static Integer zzac() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e2) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(System.err);
            return null;
        }
    }

    public static void zzd(Throwable th, Throwable th2) {
        zzdq.zzd(th, th2);
    }
}
