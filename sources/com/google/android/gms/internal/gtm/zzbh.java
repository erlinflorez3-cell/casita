package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbh extends com.google.android.gms.analytics.zzj {
    private int zza;

    public zzbh() {
        UUID uuidRandomUUID = UUID.randomUUID();
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        int i2 = (int) ((leastSignificantBits + 2147483647L) - (leastSignificantBits | 2147483647L));
        if (i2 == 0) {
            long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
            i2 = (int) ((mostSignificantBits + 2147483647L) - (mostSignificantBits | 2147483647L));
            if (i2 == 0) {
                i2 = Integer.MAX_VALUE;
            }
        }
        Preconditions.checkNotZero(i2);
        this.zza = i2;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("screenName", null);
        map.put("interstitial", false);
        map.put("automatic", false);
        map.put("screenId", Integer.valueOf(this.zza));
        map.put("referrerScreenId", 0);
        map.put("referrerScreenName", null);
        map.put("referrerUri", null);
        return zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbh zzbhVar = (zzbh) zzjVar;
        TextUtils.isEmpty(null);
        int i2 = this.zza;
        if (i2 != 0) {
            zzbhVar.zza = i2;
        }
        TextUtils.isEmpty(null);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        TextUtils.isEmpty(null);
    }

    public final int zzd() {
        return this.zza;
    }
}
