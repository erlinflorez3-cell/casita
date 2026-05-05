package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzva extends zzxv implements zzzh {
    private static final zzva zza;
    private int zzd;
    private boolean zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzva zzvaVar = new zzva();
        zza = zzvaVar;
        zzxv.zzan(zzva.class, zzvaVar);
    }

    private zzva() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzzr(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzva();
        }
        zzus zzusVar = null;
        if (i3 == 4) {
            return new zzuz(zzusVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
