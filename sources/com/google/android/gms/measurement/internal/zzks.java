package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
final class zzks implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zza;
    private final /* synthetic */ zzjq zzb;

    zzks(zzjq zzjqVar, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = zzjqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zzb
            com.google.android.gms.measurement.internal.zznb r6 = r0.zzp()
            com.google.android.gms.measurement.internal.zzha r0 = r6.zzk()
            com.google.android.gms.measurement.internal.zzje r0 = r0.zzo()
            boolean r0 = r0.zzh()
            r5 = 0
            if (r0 != 0) goto L37
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzv()
            java.lang.String r0 = "Analytics storage consent denied; will not get session id"
            r1.zza(r0)
        L22:
            r1 = r5
        L23:
            if (r1 == 0) goto L69
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zzb
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzos r3 = r0.zzt()
            com.google.android.gms.internal.measurement.zzdo r2 = r7.zza
            long r0 = r1.longValue()
            r3.zza(r2, r0)
            return
        L37:
            com.google.android.gms.measurement.internal.zzha r2 = r6.zzk()
            com.google.android.gms.common.util.Clock r0 = r6.zzb()
            long r0 = r0.currentTimeMillis()
            boolean r0 = r2.zza(r0)
            if (r0 != 0) goto L22
            com.google.android.gms.measurement.internal.zzha r0 = r6.zzk()
            com.google.android.gms.measurement.internal.zzhb r0 = r0.zzl
            long r3 = r0.zza()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            goto L22
        L5a:
            com.google.android.gms.measurement.internal.zzha r0 = r6.zzk()
            com.google.android.gms.measurement.internal.zzhb r0 = r0.zzl
            long r0 = r0.zza()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L23
        L69:
            com.google.android.gms.internal.measurement.zzdo r0 = r7.zza     // Catch: android.os.RemoteException -> L6f
            r0.zza(r5)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zzb
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzgo r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()
            java.lang.String r0 = "getSessionId failed with exception"
            r1.zza(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.run():void");
    }
}
