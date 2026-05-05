package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbul extends zzbel implements zzbft {
    private static final zzbul zzb;
    private String zzd = "";
    private String zze = "";
    private float zzf;

    static {
        zzbul zzbulVar = new zzbul();
        zzb = zzbulVar;
        zzbel.zzR(zzbul.class, zzbulVar);
    }

    private zzbul() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbul();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbuk(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
