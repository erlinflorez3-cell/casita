package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzw extends zzxv implements zzzh {
    private static final zzw zza;
    private int zzd;
    private long zzf;
    private boolean zzh;
    private long zzi;
    private String zze = "";
    private long zzg = 2147483647L;

    static {
        zzw zzwVar = new zzw();
        zza = zzwVar;
        zzxv.zzan(zzw.class, zzwVar);
    }

    private zzw() {
    }

    public final long zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzw();
        }
        zzn zznVar = null;
        if (i3 == 4) {
            return new zzv(zznVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        int i2 = this.zzd;
        return (i2 + 1) - (i2 | 1) != 0;
    }
}
