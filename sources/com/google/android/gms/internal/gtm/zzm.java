package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzm extends zzxv implements zzzh {
    private static final zzm zza;
    private byte zzf = 2;
    private zzyd zzd = zzah();
    private zzyd zze = zzah();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzxv.zzan(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zzd", zzk.class, "zze", zzg.class});
        }
        if (i3 == 3) {
            return new zzm();
        }
        if (i3 == 4) {
            return new zzl(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
