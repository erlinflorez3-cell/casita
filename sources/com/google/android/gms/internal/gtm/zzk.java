package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzk extends zzxv implements zzzh {
    private static final zzk zza;
    private int zzd;
    private zzam zzk;
    private byte zzl = 2;
    private zzyd zze = zzah();
    private zzyd zzf = zzah();
    private zzyd zzg = zzah();
    private zzyd zzh = zzah();
    private zzyd zzi = zzah();
    private zzyd zzj = zzah();

    static {
        zzk zzkVar = new zzk();
        zza = zzkVar;
        zzxv.zzan(zzk.class, zzkVar);
    }

    private zzk() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zzd", "zze", zzg.class, "zzf", zzg.class, "zzg", zzg.class, "zzh", zzg.class, "zzi", zzg.class, "zzj", zzg.class, "zzk"});
        }
        if (i3 == 3) {
            return new zzk();
        }
        if (i3 == 4) {
            return new zzj(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
