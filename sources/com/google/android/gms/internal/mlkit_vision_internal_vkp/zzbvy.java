package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbvy extends zzbel implements zzbft {
    private static final zzbvy zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzbvy zzbvyVar = new zzbvy();
        zzb = zzbvyVar;
        zzbel.zzR(zzbvy.class, zzbvyVar);
    }

    private zzbvy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zze", "zzd", zzbxr.class, zzbxc.class, zzbym.class});
        }
        if (i3 == 3) {
            return new zzbvy();
        }
        if (i3 == 4) {
            return new zzbvx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
