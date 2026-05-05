package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfe {
    private static final zzfd zza;
    private static final int zzb;

    static final class zza extends zzfd {
        zza() {
        }

        @Override // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0006, B:6:0x000e, B:7:0x0014, B:9:0x001c, B:10:0x0022), top: B:24:0x0006 }] */
    static {
        /*
            java.lang.Integer r5 = zza()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L14
            int r1 = r5.intValue()     // Catch: java.lang.Throwable -> L2b
            r0 = 19
            if (r1 < r0) goto L14
            com.google.android.gms.internal.vision.zzfj r0 = new com.google.android.gms.internal.vision.zzfj     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            goto L64
        L14:
            java.lang.String r0 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L22
            com.google.android.gms.internal.vision.zzfh r0 = new com.google.android.gms.internal.vision.zzfh     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            goto L64
        L22:
            com.google.android.gms.internal.vision.zzfe$zza r0 = new com.google.android.gms.internal.vision.zzfe$zza     // Catch: java.lang.Throwable -> L2b
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
            java.lang.Class<com.google.android.gms.internal.vision.zzfe$zza> r0 = com.google.android.gms.internal.vision.zzfe.zza.class
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
            com.google.android.gms.internal.vision.zzfe$zza r0 = new com.google.android.gms.internal.vision.zzfe$zza
            r0.<init>()
        L64:
            com.google.android.gms.internal.vision.zzfe.zza = r0
            if (r5 != 0) goto L6c
            r0 = 1
        L69:
            com.google.android.gms.internal.vision.zzfe.zzb = r0
            return
        L6c:
            int r0 = r5.intValue()
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.<clinit>():void");
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e2) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(System.err);
            return null;
        }
    }

    public static void zza(Throwable th) {
        zza.zza(th);
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }
}
