package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zze extends zzxv implements zzzh {
    public static final zzxt zza;
    private static final zze zzd;
    private int zze;
    private zzm zzf;
    private zzg zzg;
    private byte zzh = 2;

    static {
        zze zzeVar = new zze();
        zzd = zzeVar;
        zzxv.zzan(zze.class, zzeVar);
        zza = zzxv.zzab(zzam.zzj(), zzeVar, zzeVar, null, 47497405, zzaba.MESSAGE, zze.class);
    }

    private zze() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i3 == 2) {
            return zzak(zzd, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zze();
        }
        if (i3 == 4) {
            return new zzd(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
