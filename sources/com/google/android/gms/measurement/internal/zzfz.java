package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfz<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfx<V> zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzf;
    private volatile V zzg;

    private zzfz(String str, V v2, V v3, zzfx<V> zzfxVar) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v2;
        this.zzc = zzfxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V zza(V r6) {
        /*
            r5 = this;
            java.lang.Object r1 = r5.zze
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L7
            return r6
        L7:
            com.google.android.gms.measurement.internal.zzab r0 = com.google.android.gms.measurement.internal.zzga.zza
            if (r0 != 0) goto Le
            V r0 = r5.zzd
            return r0
        Le:
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzfz.zza
            monitor-enter(r1)
            boolean r0 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L23
            V r0 = r5.zzg     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L1f
            V r0 = r5.zzd     // Catch: java.lang.Throwable -> L6b
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            goto L22
        L1f:
            V r0 = r5.zzg     // Catch: java.lang.Throwable -> L6b
            goto L1d
        L22:
            return r0
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            java.util.List r0 = com.google.android.gms.measurement.internal.zzbh.zzdl()     // Catch: java.lang.SecurityException -> L59
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.SecurityException -> L59
        L2c:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L59
            if (r0 == 0) goto L59
            java.lang.Object r3 = r4.next()     // Catch: java.lang.SecurityException -> L59
            com.google.android.gms.measurement.internal.zzfz r3 = (com.google.android.gms.measurement.internal.zzfz) r3     // Catch: java.lang.SecurityException -> L59
            boolean r0 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.SecurityException -> L59
            if (r0 != 0) goto L51
            r2 = 0
            com.google.android.gms.measurement.internal.zzfx<V> r0 = r3.zzc     // Catch: java.lang.IllegalStateException -> L47 java.lang.SecurityException -> L59
            if (r0 == 0) goto L47
            java.lang.Object r2 = r0.zza()     // Catch: java.lang.IllegalStateException -> L47 java.lang.SecurityException -> L59
        L47:
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzfz.zza     // Catch: java.lang.SecurityException -> L59
            monitor-enter(r1)     // Catch: java.lang.SecurityException -> L59
            r3.zzg = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            goto L2c
        L4e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.SecurityException -> L59
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L59
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r1.<init>(r0)     // Catch: java.lang.SecurityException -> L59
            throw r1     // Catch: java.lang.SecurityException -> L59
        L59:
            com.google.android.gms.measurement.internal.zzfx<V> r0 = r5.zzc
            if (r0 != 0) goto L60
            V r0 = r5.zzd
            return r0
        L60:
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.IllegalStateException -> L65 java.lang.SecurityException -> L68
            return r0
        L65:
            V r0 = r5.zzd
            return r0
        L68:
            V r0 = r5.zzd
            return r0
        L6b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfz.zza(java.lang.Object):java.lang.Object");
    }

    public final String zza() {
        return this.zzb;
    }
}
