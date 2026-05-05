package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwb extends zzbel implements zzbft {
    private static final zzbwb zzb;
    private String zzd = "";
    private zzbet zze = zzL();

    static {
        zzbwb zzbwbVar = new zzbwb();
        zzb = zzbwbVar;
        zzbel.zzR(zzbwb.class, zzbwbVar);
    }

    private zzbwb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzbwh.class});
        }
        if (i3 == 3) {
            return new zzbwb();
        }
        zzbvz zzbvzVar = null;
        if (i3 == 4) {
            return new zzbwa(zzbvzVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
