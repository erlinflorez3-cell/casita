package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs extends zzxv implements zzzh {
    private static final zzs zza;
    private int zzd;
    private int zze = 1;
    private int zzf;
    private int zzg;

    static {
        zzs zzsVar = new zzs();
        zza = zzsVar;
        zzxv.zzan(zzs.class, zzsVar);
    }

    private zzs() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", zzq.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzs();
        }
        zzn zznVar = null;
        if (i3 == 4) {
            return new zzo(zznVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
