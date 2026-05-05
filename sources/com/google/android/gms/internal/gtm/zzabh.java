package com.google.android.gms.internal.gtm;

import androidx.webkit.ProxyConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabh extends zzxv implements zzzh {
    private static final zzabh zza;
    private int zzd;
    private int zze;
    private String zzf = ProxyConfig.MATCH_ALL_SCHEMES;

    static {
        zzabh zzabhVar = new zzabh();
        zza = zzabhVar;
        zzxv.zzan(zzabh.class, zzabhVar);
    }

    private zzabh() {
    }

    public static zzabh zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzabj.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzabh();
        }
        zzabf zzabfVar = null;
        if (i3 == 4) {
            return new zzabg(zzabfVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
