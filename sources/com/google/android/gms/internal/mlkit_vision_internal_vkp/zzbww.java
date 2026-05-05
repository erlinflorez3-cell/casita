package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbww extends zzbel implements zzbft {
    private static final zzbww zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzbww zzbwwVar = new zzbww();
        zzb = zzbwwVar;
        zzbel.zzR(zzbww.class, zzbwwVar);
    }

    private zzbww() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzbwz.class, zzbxf.class});
        }
        if (i3 == 3) {
            return new zzbww();
        }
        if (i3 == 4) {
            return new zzbwv(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
