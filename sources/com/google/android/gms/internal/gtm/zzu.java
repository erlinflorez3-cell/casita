package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzu extends zzxv implements zzzh {
    private static final zzu zza;
    private int zzd;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private byte zzj = 2;
    private zzya zze = zzag();

    static {
        zzu zzuVar = new zzu();
        zza = zzuVar;
        zzxv.zzan(zzu.class, zzuVar);
    }

    private zzu() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဇ\u0003\u0002ᔄ\u0000\u0003\u0016\u0004င\u0001\u0006ဇ\u0002", new Object[]{"zzd", "zzi", "zzf", "zze", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzu();
        }
        zzn zznVar = null;
        if (i3 == 4) {
            return new zzt(zznVar);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzc() {
        return this.zze;
    }
}
