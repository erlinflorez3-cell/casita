package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwx extends zzxr implements zzzh {
    private static final zzwx zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzk;
    private zzvy zzl;
    private byte zzn = 2;
    private String zzj = "";
    private zzyd zzm = zzzq.zze();

    static {
        zzwx zzwxVar = new zzwx();
        zzd = zzwxVar;
        zzxv.zzan(zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    public static zzwx zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i3 == 2) {
            return new zzzr(zzd, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004\u000bဇ\u0005\fᐉ\u0006ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzxb.class});
        }
        if (i3 == 3) {
            return new zzwx();
        }
        if (i3 == 4) {
            return new zzww(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
