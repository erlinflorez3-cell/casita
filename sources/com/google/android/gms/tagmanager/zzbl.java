package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes8.dex */
final class zzbl implements AppMeasurement.OnEventListener {
    final /* synthetic */ zzci zza;

    zzbl(zzbm zzbmVar, zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.OnEventListener, com.google.android.gms.measurement.internal.zzjl
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        try {
            this.zza.zze(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
