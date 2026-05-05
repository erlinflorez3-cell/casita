package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbzq extends zzbel implements zzbft {
    private static final zzbzq zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzbzq zzbzqVar = new zzbzq();
        zzb = zzbzqVar;
        zzbel.zzR(zzbzq.class, zzbzqVar);
    }

    private zzbzq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbzq();
        }
        zzbzo zzbzoVar = null;
        if (i3 == 4) {
            return new zzbzp(zzbzoVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
