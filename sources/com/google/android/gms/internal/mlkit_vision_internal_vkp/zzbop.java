package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbop extends zzbel implements zzbft {
    private static final zzbop zzb;
    private zzbfm zzd = zzbfm.zza();

    static {
        zzbop zzbopVar = new zzbop();
        zzb = zzbopVar;
        zzbel.zzR(zzbop.class, zzbopVar);
    }

    private zzbop() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", zzboo.zza});
        }
        if (i3 == 3) {
            return new zzbop();
        }
        if (i3 == 4) {
            return new zzbon(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
