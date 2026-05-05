package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwq extends zzxv implements zzzh {
    private static final zzwq zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzwq zzwqVar = new zzwq();
        zza = zzwqVar;
        zzxv.zzan(zzwq.class, zzwqVar);
    }

    private zzwq() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzzr(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzwq();
        }
        zzus zzusVar = null;
        if (i3 == 4) {
            return new zzwp(zzusVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
