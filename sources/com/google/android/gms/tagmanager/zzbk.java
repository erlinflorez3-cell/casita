package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes8.dex */
final class zzbk implements AppMeasurement.EventInterceptor {
    final /* synthetic */ zzcl zza;

    zzbk(zzbm zzbmVar, zzcl zzclVar) {
        this.zza = zzclVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.EventInterceptor, com.google.android.gms.measurement.internal.zzjm
    public final void interceptEvent(String str, String str2, Bundle bundle, long j2) {
        try {
            this.zza.zze(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
