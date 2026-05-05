package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbzh extends zzbel implements zzbft {
    private static final zzbzh zzb;
    private int zzd;
    private zzhm zze;
    private zzbhv zzf;

    static {
        zzbzh zzbzhVar = new zzbzh();
        zzb = zzbzhVar;
        zzbel.zzR(zzbzh.class, zzbzhVar);
    }

    private zzbzh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbzh();
        }
        if (i3 == 4) {
            return new zzbzg(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
