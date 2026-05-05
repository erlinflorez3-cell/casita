package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbux extends zzbel implements zzbft {
    private static final zzbux zzb;
    private zzbeq zzd = zzI();

    static {
        zzbux zzbuxVar = new zzbux();
        zzb = zzbuxVar;
        zzbel.zzR(zzbux.class, zzbuxVar);
    }

    private zzbux() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zzd"});
        }
        if (i3 == 3) {
            return new zzbux();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbuw(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
