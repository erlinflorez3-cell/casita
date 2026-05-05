package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxi extends zzbel implements zzbft {
    private static final zzbxi zzb;
    private int zzd;
    private zzbxx zze;
    private double zzf;

    static {
        zzbxi zzbxiVar = new zzbxi();
        zzb = zzbxiVar;
        zzbel.zzR(zzbxi.class, zzbxiVar);
    }

    private zzbxi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbxi();
        }
        zzbxg zzbxgVar = null;
        if (i3 == 4) {
            return new zzbxh(zzbxgVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
