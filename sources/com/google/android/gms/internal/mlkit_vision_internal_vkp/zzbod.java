package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbod extends zzbel implements zzbft {
    private static final zzbod zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzbet zzj = zzL();
    private zzbet zzk = zzL();

    static {
        zzbod zzbodVar = new zzbod();
        zzb = zzbodVar;
        zzbel.zzR(zzbod.class, zzbodVar);
    }

    private zzbod() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzboc.class, "zzk", zzboc.class});
        }
        if (i3 == 3) {
            return new zzbod();
        }
        zzbne zzbneVar = null;
        if (i3 == 4) {
            return new zzboa(zzbneVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
