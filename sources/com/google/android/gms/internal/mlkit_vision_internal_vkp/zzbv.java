package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbv extends zzbel implements zzbft {
    private static final zzbv zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbv zzbvVar = new zzbv();
        zzb = zzbvVar;
        zzbel.zzR(zzbv.class, zzbvVar);
    }

    private zzbv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbv();
        }
        zzbt zzbtVar = null;
        if (i3 == 4) {
            return new zzbu(zzbtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
