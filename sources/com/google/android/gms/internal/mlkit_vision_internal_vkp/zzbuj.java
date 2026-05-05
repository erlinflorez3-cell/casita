package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbuj extends zzbel implements zzbft {
    private static final zzbuj zzb;
    private int zzd;
    private float zze;

    static {
        zzbuj zzbujVar = new zzbuj();
        zzb = zzbujVar;
        zzbel.zzR(zzbuj.class, zzbujVar);
    }

    private zzbuj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzbuj();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbui(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
