package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzxb extends zzxv implements zzzh {
    private static final zzxb zza;
    private int zzd;
    private long zzg;
    private long zzh;
    private double zzi;
    private byte zzl = 2;
    private zzyd zze = zzzq.zze();
    private String zzf = "";
    private zzud zzj = zzud.zzb;
    private String zzk = "";

    static {
        zzxb zzxbVar = new zzxb();
        zza = zzxbVar;
        zzxv.zzan(zzxb.class, zzxbVar);
    }

    private zzxb() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i3 == 2) {
            return new zzzr(zza, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzxa.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzxb();
        }
        if (i3 == 4) {
            return new zzwy(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
