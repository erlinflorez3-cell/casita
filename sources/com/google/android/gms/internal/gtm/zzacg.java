package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacg extends zzxv implements zzzh {
    private static final zzacg zza;
    private byte zze = 2;
    private zzyd zzd = zzah();

    static {
        zzacg zzacgVar = new zzacg();
        zza = zzacgVar;
        zzxv.zzan(zzacg.class, zzacgVar);
    }

    private zzacg() {
    }

    public static zzacg zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzacf.class});
        }
        if (i3 == 3) {
            return new zzacg();
        }
        zzaca zzacaVar = null;
        if (i3 == 4) {
            return new zzacd(zzacaVar);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
