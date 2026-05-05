package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxu extends zzbel implements zzbft {
    private static final zzbxu zzb;
    private int zzd;
    private zzbs zze;
    private zzbet zzf = zzL();

    static {
        zzbxu zzbxuVar = new zzbxu();
        zzb = zzbxuVar;
        zzbel.zzR(zzbxu.class, zzbxuVar);
    }

    private zzbxu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zzbwh.class});
        }
        if (i3 == 3) {
            return new zzbxu();
        }
        if (i3 == 4) {
            return new zzbxt(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
