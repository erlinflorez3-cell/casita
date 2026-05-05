package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzai extends zzxv implements zzzh {
    private static final zzai zza;
    private int zzd;
    private zzam zzf;
    private zzy zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzai zzaiVar = new zzai();
        zza = zzaiVar;
        zzxv.zzan(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public final zzy zza() {
        zzy zzyVar = this.zzg;
        return zzyVar == null ? zzy.zzc() : zzyVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzai();
        }
        if (i3 == 4) {
            return new zzah(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzf() {
        int i2 = this.zzd;
        return (i2 + 1) - (i2 | 1) != 0;
    }
}
