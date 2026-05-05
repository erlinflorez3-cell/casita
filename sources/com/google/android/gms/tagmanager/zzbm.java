package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbm extends zzcn {
    final /* synthetic */ AppMeasurement zza;

    zzbm(AppMeasurement appMeasurement) {
        this.zza = appMeasurement;
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final Map zzb() {
        return this.zza.getUserProperties(true);
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final void zzc(String str, String str2, Bundle bundle, long j2) {
        this.zza.logEventInternalNoInterceptor(str, str2, bundle, j2);
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final void zzd(zzci zzciVar) {
        this.zza.registerOnMeasurementEventListener(new zzbl(this, zzciVar));
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final void zze(zzcl zzclVar) {
        this.zza.setEventInterceptor(new zzbk(this, zzclVar));
    }
}
