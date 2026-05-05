package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzck extends zzbel implements zzbft {
    private static final zzck zzb;
    private int zzd;
    private zzby zze;
    private zzbeq zzf = zzI();

    static {
        zzck zzckVar = new zzck();
        zzb = zzckVar;
        zzbel.zzR(zzck.class, zzckVar);
    }

    private zzck() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0013", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzck();
        }
        if (i3 == 4) {
            return new zzcj(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
