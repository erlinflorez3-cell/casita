package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzuy extends zzxv implements zzzh {
    private static final zzuy zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private boolean zzi;

    static {
        zzuy zzuyVar = new zzuy();
        zza = zzuyVar;
        zzxv.zzan(zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzzr(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzuy();
        }
        zzus zzusVar = null;
        if (i3 == 4) {
            return new zzux(zzusVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
