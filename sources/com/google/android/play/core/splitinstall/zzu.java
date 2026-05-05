package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzbr;

/* JADX INFO: loaded from: classes9.dex */
public final class zzu {
    private static zzp zza = null;

    public static synchronized zzp zza(Context context) {
        if (zza == null) {
            zzc zzcVar = new zzc(null);
            zzcVar.zza(new zzac(zzbr.zza(context)));
            zza = zzcVar.zzb();
        }
        return zza;
    }
}
