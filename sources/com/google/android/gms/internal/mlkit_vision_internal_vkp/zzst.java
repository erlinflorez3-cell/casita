package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzst extends zzbel implements zzbft {
    private static final zzst zzb;
    private int zzd;
    private zzwh zze;
    private int zzf;

    static {
        zzst zzstVar = new zzst();
        zzb = zzstVar;
        zzbel.zzR(zzst.class, zzstVar);
    }

    private zzst() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzst();
        }
        if (i3 == 4) {
            return new zzss(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
