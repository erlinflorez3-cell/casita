package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbdv {
    static final zzbdv zza = new zzbdv(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzbdv zzd = null;
    private final Map zze;

    zzbdv() {
        this.zze = new HashMap();
    }

    zzbdv(boolean z2) {
        this.zze = Collections.emptyMap();
    }

    public static zzbdv zza() {
        int i2 = zzbgb.zza;
        return zza;
    }

    public static zzbdv zzb() {
        zzbdv zzbdvVar = zzd;
        if (zzbdvVar != null) {
            return zzbdvVar;
        }
        synchronized (zzbdv.class) {
            zzbdv zzbdvVar2 = zzd;
            if (zzbdvVar2 != null) {
                return zzbdvVar2;
            }
            int i2 = zzbgb.zza;
            zzbdv zzbdvVarZzb = zzbed.zzb(zzbdv.class);
            zzd = zzbdvVarZzb;
            return zzbdvVarZzb;
        }
    }

    public final zzbej zzc(zzbfs zzbfsVar, int i2) {
        return (zzbej) this.zze.get(new zzbdu(zzbfsVar, i2));
    }
}
