package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzia implements zznh {
    final /* synthetic */ zzic zza;

    /* synthetic */ zzia(zzic zzicVar, zzhz zzhzVar) {
        this.zza = zzicVar;
    }

    @Override // com.google.android.gms.internal.gtm.zznh
    public final Object zza(String str, Map map) {
        try {
            return this.zza.zze.zzb(str, map);
        } catch (RemoteException e2) {
            zzho.zza("Error calling customEvaluator proxy:".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }
}
