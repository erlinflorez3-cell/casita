package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwh extends zzbel implements zzbft {
    private static final zzbwh zzb;
    private String zzd = "";
    private String zze = "";
    private double zzf;

    static {
        zzbwh zzbwhVar = new zzbwh();
        zzb = zzbwhVar;
        zzbel.zzR(zzbwh.class, zzbwhVar);
    }

    private zzbwh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003Ȉ", new Object[]{"zzd", "zzf", "zze"});
        }
        if (i3 == 3) {
            return new zzbwh();
        }
        zzbwf zzbwfVar = null;
        if (i3 == 4) {
            return new zzbwg(zzbwfVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
