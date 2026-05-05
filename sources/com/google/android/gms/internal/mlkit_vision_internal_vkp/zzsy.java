package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsy extends zzbel implements zzbft {
    private static final zzsy zzb;
    private int zzd;
    private zzvc zze;
    private zzwh zzf;
    private zzbet zzg = zzL();
    private zzbet zzh = zzL();
    private long zzi;

    static {
        zzsy zzsyVar = new zzsy();
        zzb = zzsyVar;
        zzbel.zzR(zzsy.class, zzsyVar);
    }

    private zzsy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005ဃ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzsx.class, "zzh", zzsx.class, "zzi"});
        }
        if (i3 == 3) {
            return new zzsy();
        }
        if (i3 == 4) {
            return new zzsu(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
