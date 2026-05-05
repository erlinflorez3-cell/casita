package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi extends zzxv implements zzzh {
    private static final zzi zza;
    private int zzd;
    private zzam zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzi zziVar = new zzi();
        zza = zziVar;
        zzxv.zzan(zzi.class, zziVar);
    }

    private zzi() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzi();
        }
        if (i3 == 4) {
            return new zzh(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
