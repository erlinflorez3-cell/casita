package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzy extends zzxv implements zzzh {
    private static final zzy zza;
    private byte zzg = 2;
    private zzyd zzd = zzah();
    private zzyd zze = zzah();
    private zzyd zzf = zzah();

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzxv.zzan(zzy.class, zzyVar);
    }

    private zzy() {
    }

    public static zzy zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zzd", zzam.class, "zze", zzam.class, "zzf", zzw.class});
        }
        if (i3 == 3) {
            return new zzy();
        }
        if (i3 == 4) {
            return new zzx(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzd;
    }
}
