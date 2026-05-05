package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjl extends zzhl {
    private final Map zza;
    private final ExecutorService zzb;
    private final zzgt zzc;
    private final com.google.android.gms.tagmanager.zzco zzd;
    private final Context zze;

    public zzjl(Context context, com.google.android.gms.tagmanager.zzco zzcoVar, com.google.android.gms.tagmanager.zzcf zzcfVar) {
        zzgt zzgtVar = new zzgt(context, zzcoVar, zzcfVar);
        ExecutorService executorServiceZza = zzjn.zza(context);
        this.zza = new HashMap(1);
        Preconditions.checkNotNull(zzcoVar);
        this.zzd = zzcoVar;
        this.zzc = zzgtVar;
        this.zzb = executorServiceZza;
        this.zze = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zze() {
        this.zzb.execute(new zzjk(this));
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzf(String str, Bundle bundle, String str2, long j2, boolean z2) throws RemoteException {
        this.zzb.execute(new zzjj(this, new zzgz(str, bundle, str2, new Date(j2), z2, this.zzd)));
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzg(String str, String str2, String str3) throws RemoteException {
        zzh(str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzh(String str, String str2, String str3, zzhj zzhjVar) throws RemoteException {
        this.zzb.execute(new zzji(this, str, str2, str3, zzhjVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzi() throws RemoteException {
        this.zza.clear();
    }
}
