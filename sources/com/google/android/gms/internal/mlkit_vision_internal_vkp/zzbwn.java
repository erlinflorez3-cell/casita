package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwn extends zzbel implements zzbft {
    private static final zzbwn zzb;
    private String zzd = "";
    private zzbet zze = zzL();
    private String zzf = "";

    static {
        zzbwn zzbwnVar = new zzbwn();
        zzb = zzbwnVar;
        zzbel.zzR(zzbwn.class, zzbwnVar);
    }

    private zzbwn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"zzd", "zze", zzbwk.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzbwn();
        }
        if (i3 == 4) {
            return new zzbwm(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
