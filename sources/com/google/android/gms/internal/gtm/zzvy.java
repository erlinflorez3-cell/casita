package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvy extends zzxr implements zzzh {
    private static final zzvy zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzvy zzvyVar = new zzvy();
        zzd = zzvyVar;
        zzxv.zzan(zzvy.class, zzvyVar);
    }

    private zzvy() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i3 == 2) {
            return new zzzr(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzvk.zza, "zzg", zzvh.zza, "zzh", zzvt.zza, "zzi", zzvw.zza, "zzj", zzvq.zza, "zzk", zzvn.zza});
        }
        if (i3 == 3) {
            return new zzvy();
        }
        if (i3 == 4) {
            return new zzvf(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
