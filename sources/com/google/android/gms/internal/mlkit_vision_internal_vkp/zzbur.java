package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbur extends zzbel implements zzbft {
    private static final zzbur zzb;
    private int zzd = 0;
    private Object zze;
    private float zzf;

    static {
        zzbur zzburVar = new zzbur();
        zzb = zzburVar;
        zzbel.zzR(zzbur.class, zzburVar);
    }

    private zzbur() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00017\u0000\u00024\u0000\u0003Ȼ\u0000\u0004\u0001", new Object[]{"zze", "zzd", "zzf"});
        }
        if (i3 == 3) {
            return new zzbur();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbuq(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
