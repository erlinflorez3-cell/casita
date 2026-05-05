package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrs extends zzbel implements zzbft {
    private static final zzrs zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzrs zzrsVar = new zzrs();
        zzb = zzrsVar;
        zzbel.zzR(zzrs.class, zzrsVar);
    }

    private zzrs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzrr.zza});
        }
        if (i3 == 3) {
            return new zzrs();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzrq(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
