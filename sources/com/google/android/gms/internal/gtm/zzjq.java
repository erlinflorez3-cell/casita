package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.stats.ConnectionTracker;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjq implements ServiceConnection {
    private final Context zza;
    private final ConnectionTracker zzb;
    private volatile boolean zzc = false;
    private volatile boolean zzd = false;
    private zzhm zze;

    zzjq(Context context, ConnectionTracker connectionTracker) {
        this.zza = context;
        this.zzb = connectionTracker;
    }

    private static final void zzf(zzhj zzhjVar, String str) {
        try {
            zzhjVar.zze(false, str);
        } catch (RemoteException e2) {
            zzho.zzb("Error - local callback should not throw RemoteException", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhm zzhkVar;
        synchronized (this) {
            if (iBinder == null) {
                zzhkVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                zzhkVar = iInterfaceQueryLocalInterface instanceof zzhm ? (zzhm) iInterfaceQueryLocalInterface : new zzhk(iBinder);
            }
            this.zze = zzhkVar;
            this.zzc = true;
            this.zzd = false;
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.zze = null;
            this.zzc = false;
            this.zzd = false;
        }
    }

    public final void zza() {
        if (zzd()) {
            try {
                this.zze.zze();
            } catch (RemoteException e2) {
                zzho.zzf("Error calling service to dispatch pending events", e2);
            }
        }
    }

    public final void zzb(String str, Bundle bundle, String str2, long j2, boolean z2) {
        if (zzd()) {
            try {
                this.zze.zzf(str, bundle, str2, j2, z2);
            } catch (RemoteException e2) {
                zzho.zzf("Error calling service to emit event", e2);
            }
        }
    }

    public final void zzc(String str, String str2, String str3, zzhj zzhjVar) {
        if (!zzd()) {
            zzf(zzhjVar, str);
            return;
        }
        try {
            this.zze.zzh(str, str2, null, zzhjVar);
        } catch (RemoteException e2) {
            zzho.zzf("Error calling service to load container", e2);
            zzf(zzhjVar, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzjq.zzd():boolean");
    }

    public final boolean zze() {
        if (!zzd()) {
            return false;
        }
        try {
            this.zze.zzi();
            return true;
        } catch (RemoteException e2) {
            zzho.zzf("Error in resetting service", e2);
            return false;
        }
    }
}
