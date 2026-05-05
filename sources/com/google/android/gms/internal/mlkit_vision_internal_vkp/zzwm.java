package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwm extends zzbel implements zzbft {
    private static final zzwm zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzwm zzwmVar = new zzwm();
        zzb = zzwmVar;
        zzbel.zzR(zzwm.class, zzwmVar);
    }

    private zzwm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzacs.zza, "zzf", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzwm();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzwl(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
