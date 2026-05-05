package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzhy implements zznh {
    final /* synthetic */ zzic zza;

    /* synthetic */ zzhy(zzic zzicVar, zzhx zzhxVar) {
        this.zza = zzicVar;
    }

    @Override // com.google.android.gms.internal.gtm.zznh
    public final Object zza(String str, Map map) {
        try {
            this.zza.zze.zzc(str, map);
            return null;
        } catch (RemoteException e2) {
            zzho.zza("Error calling customEvaluator proxy:".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }
}
