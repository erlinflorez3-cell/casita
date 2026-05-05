package com.google.android.gms.maps;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(Context context) {
        return initialize(context, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: RemoteException -> 0x0053, all -> 0x0088, TryCatch #0 {RemoteException -> 0x0053, blocks: (B:16:0x0041, B:18:0x0047, B:19:0x004b), top: B:41:0x0041, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:35:0x0081, B:7:0x001e, B:8:0x0022, B:9:0x0031, B:11:0x0036, B:16:0x0041, B:18:0x0047, B:19:0x004b, B:22:0x0058, B:24:0x006c, B:21:0x0054, B:28:0x0074, B:29:0x0079, B:31:0x007b), top: B:45:0x0003, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int initialize(android.content.Context r6, com.google.android.gms.maps.MapsInitializer.Renderer r7, com.google.android.gms.maps.OnMapsSdkInitializedCallback r8) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r5 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r5)
            java.lang.String r0 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = com.google.android.gms.maps.MapsInitializer.zza     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "preferredRenderer: "
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L88
            boolean r0 = com.google.android.gms.maps.MapsInitializer.zzb     // Catch: java.lang.Throwable -> L88
            r4 = 0
            if (r0 == 0) goto L1e
            goto L7f
        L1e:
            com.google.android.gms.maps.internal.zzf r3 = com.google.android.gms.maps.internal.zzcc.zza(r6, r7)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L7a java.lang.Throwable -> L88
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r0 = r3.zze()     // Catch: android.os.RemoteException -> L73 java.lang.Throwable -> L88
            com.google.android.gms.maps.CameraUpdateFactory.zza(r0)     // Catch: android.os.RemoteException -> L73 java.lang.Throwable -> L88
            com.google.android.gms.internal.maps.zzi r0 = r3.zzj()     // Catch: android.os.RemoteException -> L73 java.lang.Throwable -> L88
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r0)     // Catch: android.os.RemoteException -> L73 java.lang.Throwable -> L88
            r2 = 1
            com.google.android.gms.maps.MapsInitializer.zzb = r2     // Catch: java.lang.Throwable -> L88
            r1 = 2
            if (r7 == 0) goto L3e
            int r0 = r7.ordinal()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L41
            if (r0 == r2) goto L40
        L3e:
            r2 = r4
            goto L41
        L40:
            r2 = r1
        L41:
            int r0 = r3.zzd()     // Catch: android.os.RemoteException -> L53 java.lang.Throwable -> L88
            if (r0 != r1) goto L4b
            com.google.android.gms.maps.MapsInitializer$Renderer r0 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch: android.os.RemoteException -> L53 java.lang.Throwable -> L88
            com.google.android.gms.maps.MapsInitializer.zzc = r0     // Catch: android.os.RemoteException -> L53 java.lang.Throwable -> L88
        L4b:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r6)     // Catch: android.os.RemoteException -> L53 java.lang.Throwable -> L88
            r3.zzl(r0, r2)     // Catch: android.os.RemoteException -> L53 java.lang.Throwable -> L88
            goto L58
        L53:
            r0 = move-exception
            java.lang.String r0 = com.google.android.gms.maps.MapsInitializer.zza     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "Failed to retrieve renderer type or log initialization."
        L58:
            java.lang.String r0 = com.google.android.gms.maps.MapsInitializer.zza     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.maps.MapsInitializer$Renderer r0 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "loadedRenderer: "
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L71
            com.google.android.gms.maps.MapsInitializer$Renderer r0 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L88
            r8.onMapsSdkInitialized(r0)     // Catch: java.lang.Throwable -> L88
        L71:
            monitor-exit(r5)
            return r4
        L73:
            r1 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L88
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L7a:
            r0 = move-exception
            int r0 = r0.errorCode     // Catch: java.lang.Throwable -> L88
            monitor-exit(r5)
            return r0
        L7f:
            if (r8 == 0) goto L86
            com.google.android.gms.maps.MapsInitializer$Renderer r0 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L88
            r8.onMapsSdkInitialized(r0)     // Catch: java.lang.Throwable -> L88
        L86:
            monitor-exit(r5)
            return r4
        L88:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L88
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
