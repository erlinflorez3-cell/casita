package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzag extends zzxv implements zzzh {
    public static final zzxt zza;
    private static final zzag zzd;
    private int zze;
    private int zzi;
    private int zzk;
    private int zzl;
    private zzya zzf = zzag();
    private zzya zzg = zzag();
    private zzya zzh = zzag();
    private zzya zzj = zzag();

    static {
        zzag zzagVar = new zzag();
        zzd = zzagVar;
        zzxv.zzan(zzag.class, zzagVar);
        zza = zzxv.zzab(zzam.zzj(), zzagVar, zzagVar, null, 101, zzaba.MESSAGE, zzag.class);
    }

    private zzag() {
    }

    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004င\u0000\u0005\u0016\u0006င\u0001\u0007င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i3 == 3) {
            return new zzag();
        }
        if (i3 == 4) {
            return new zzaf(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzd;
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzh.size();
    }

    public final List zzf() {
        return this.zzf;
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzj;
    }
}
