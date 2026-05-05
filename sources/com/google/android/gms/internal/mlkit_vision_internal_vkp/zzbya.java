package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbya extends zzbel implements zzbft {
    private static final zzbya zzb;
    private long zze;
    private long zzf;
    private zzbdd zzd = zzbdd.zzb;
    private zzbet zzg = zzL();

    static {
        zzbya zzbyaVar = new zzbya();
        zzb = zzbyaVar;
        zzbel.zzR(zzbya.class, zzbyaVar);
    }

    private zzbya() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzbwt.class});
        }
        if (i3 == 3) {
            return new zzbya();
        }
        if (i3 == 4) {
            return new zzbxz(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
