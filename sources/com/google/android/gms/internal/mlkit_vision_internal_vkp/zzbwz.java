package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwz extends zzbel implements zzbft {
    private static final zzbwz zzb;
    private zzbeq zzd = zzI();

    static {
        zzbwz zzbwzVar = new zzbwz();
        zzb = zzbwzVar;
        zzbel.zzR(zzbwz.class, zzbwzVar);
    }

    private zzbwz() {
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
            return new zzbwz();
        }
        zzbwx zzbwxVar = null;
        if (i3 == 4) {
            return new zzbwy(zzbwxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
