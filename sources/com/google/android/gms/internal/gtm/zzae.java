package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzae extends zzxv implements zzzh {
    private static final zzae zza;
    private zzya zzd = zzag();
    private zzya zze = zzag();
    private zzya zzf = zzag();
    private zzya zzg = zzag();
    private zzya zzh = zzag();
    private zzya zzi = zzag();
    private zzya zzj = zzag();
    private zzya zzk = zzag();
    private zzya zzl = zzag();
    private zzya zzm = zzag();

    static {
        zzae zzaeVar = new zzae();
        zza = zzaeVar;
        zzxv.zzan(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i3 == 3) {
            return new zzae();
        }
        zzn zznVar = null;
        if (i3 == 4) {
            return new zzad(zznVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzc() {
        return this.zzj;
    }

    public final List zzd() {
        return this.zzl;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzh;
    }

    public final List zzg() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzd;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzm;
    }

    public final List zzk() {
        return this.zzg;
    }

    public final List zzl() {
        return this.zzi;
    }
}
