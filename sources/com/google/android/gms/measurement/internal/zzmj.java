package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
final class zzmj implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbf zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzls zzf;

    zzmj(zzls zzlsVar, boolean z2, zzo zzoVar, boolean z3, zzbf zzbfVar, String str) {
        this.zza = z2;
        this.zzb = zzoVar;
        this.zzc = z3;
        this.zzd = zzbfVar;
        this.zze = str;
        this.zzf = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long jElapsedRealtime;
        long jCurrentTimeMillis;
        zzgb zzgbVar = this.zzf.zzb;
        if (zzgbVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzgbVar, this.zzc ? null : this.zzd, this.zzb);
        } else {
            boolean zZza = this.zzf.zze().zza(zzbh.zzce);
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    if (zZza) {
                        jCurrentTimeMillis = this.zzf.zzu.zzb().currentTimeMillis();
                        try {
                            jElapsedRealtime = this.zzf.zzu.zzb().elapsedRealtime();
                        } catch (RemoteException e2) {
                            e = e2;
                            jElapsedRealtime = 0;
                            this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
                            if (zZza && jCurrentTimeMillis != 0) {
                                zzgm.zza(this.zzf.zzu).zza(36301, 13, jCurrentTimeMillis, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - jElapsedRealtime));
                            }
                            this.zzf.zzar();
                        }
                    } else {
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        zzgbVar.zza(this.zzd, this.zzb);
                        if (zZza) {
                            this.zzf.zzj().zzp().zza("Logging telemetry for logEvent");
                            zzgm.zza(this.zzf.zzu).zza(36301, 0, jCurrentTimeMillis, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
                        if (zZza) {
                            zzgm.zza(this.zzf.zzu).zza(36301, 13, jCurrentTimeMillis, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else {
                    zzgbVar.zza(this.zzd, this.zze, this.zzf.zzj().zzx());
                }
            } catch (RemoteException e4) {
                e = e4;
                jElapsedRealtime = 0;
                jCurrentTimeMillis = 0;
            }
        }
        this.zzf.zzar();
    }
}
