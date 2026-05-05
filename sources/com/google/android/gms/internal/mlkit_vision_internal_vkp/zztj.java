package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zztj extends zzbel implements zzbft {
    private static final zztj zzb;
    private zzber zzd = zzJ();

    static {
        zztj zztjVar = new zztj();
        zzb = zztjVar;
        zzbel.zzR(zztj.class, zztjVar);
    }

    private zztj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zzti.zza});
        }
        if (i3 == 3) {
            return new zztj();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzth(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
