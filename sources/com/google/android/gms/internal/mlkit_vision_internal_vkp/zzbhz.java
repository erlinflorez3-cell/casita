package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbhz extends zzbel implements zzbft {
    private static final zzbhz zzb;
    private int zzd;
    private zzbjq zze;
    private zzbet zzf = zzL();
    private zzbet zzg = zzL();

    static {
        zzbhz zzbhzVar = new zzbhz();
        zzb = zzbhzVar;
        zzbel.zzR(zzbhz.class, zzbhzVar);
    }

    private zzbhz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zzd", "zze", "zzf", zzbkg.class, "zzg", zzbhv.class});
        }
        if (i3 == 3) {
            return new zzbhz();
        }
        if (i3 == 4) {
            return new zzbhy(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
