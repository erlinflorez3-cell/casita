package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoa implements zzjw {
    private final String zza = Build.MANUFACTURER;
    private final String zzb = Build.MODEL;

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        String str = this.zza;
        String str2 = this.zzb;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            str2 = str + Global.BLANK + str2;
        }
        return new zzrk(str2);
    }
}
