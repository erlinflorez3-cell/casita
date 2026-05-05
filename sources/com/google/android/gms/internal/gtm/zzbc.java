package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import io.sentry.protocol.Device;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbc extends com.google.android.gms.analytics.zzj {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap map = new HashMap();
        map.put(Device.JsonKeys.LANGUAGE, this.zzc);
        map.put("screenColors", 0);
        map.put("screenWidth", Integer.valueOf(this.zza));
        map.put("screenHeight", Integer.valueOf(this.zzb));
        map.put("viewportWidth", 0);
        map.put("viewportHeight", 0);
        return zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbc zzbcVar = (zzbc) zzjVar;
        int i2 = this.zza;
        if (i2 != 0) {
            zzbcVar.zza = i2;
        }
        int i3 = this.zzb;
        if (i3 != 0) {
            zzbcVar.zzb = i3;
        }
        if (TextUtils.isEmpty(this.zzc)) {
            return;
        }
        zzbcVar.zzc = this.zzc;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
