package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabv extends zzxv implements zzzh {
    private static final zzabv zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;

    static {
        zzabv zzabvVar = new zzabv();
        zza = zzabvVar;
        zzxv.zzan(zzabv.class, zzabvVar);
    }

    private zzabv() {
    }

    public static zzabv zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nဇ\t\u000bဇ\u000b\fဇ\r\rဇ\f\u000eဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzr", "zzq", "zzo"});
        }
        if (i3 == 3) {
            return new zzabv();
        }
        zzabl zzablVar = null;
        if (i3 == 4) {
            return new zzabu(zzablVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
