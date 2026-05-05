package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwf extends zzxv implements zzzh {
    private static final zzwf zza;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzwf zzwfVar = new zzwf();
        zza = zzwfVar;
        zzxv.zzan(zzwf.class, zzwfVar);
    }

    private zzwf() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzzr(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0003\u0002ဈ\u0001\u0003᠌\u0000\u0004᠌\u0002", new Object[]{"zzd", "zzh", "zzf", "zze", zzuu.zza, "zzg", zzuu.zza});
        }
        if (i3 == 3) {
            return new zzwf();
        }
        zzus zzusVar = null;
        if (i3 == 4) {
            return new zzwe(zzusVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
