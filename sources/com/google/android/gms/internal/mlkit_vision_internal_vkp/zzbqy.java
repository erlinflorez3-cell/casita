package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqy extends zzbel implements zzbft {
    private static final zzbqy zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzbqy zzbqyVar = new zzbqy();
        zzb = zzbqyVar;
        zzbel.zzR(zzbqy.class, zzbqyVar);
    }

    private zzbqy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzbqp.class, zzbqr.class, zzbre.class, zzbqv.class});
        }
        if (i3 == 3) {
            return new zzbqy();
        }
        if (i3 == 4) {
            return new zzbqx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
