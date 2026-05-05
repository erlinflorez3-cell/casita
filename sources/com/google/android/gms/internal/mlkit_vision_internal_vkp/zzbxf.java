package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxf extends zzbel implements zzbft {
    private static final zzbxf zzb;
    private zzbes zzd = zzK();

    static {
        zzbxf zzbxfVar = new zzbxf();
        zzb = zzbxfVar;
        zzbel.zzR(zzbxf.class, zzbxfVar);
    }

    private zzbxf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"zzd"});
        }
        if (i3 == 3) {
            return new zzbxf();
        }
        zzbxd zzbxdVar = null;
        if (i3 == 4) {
            return new zzbxe(zzbxdVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
