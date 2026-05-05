package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyu extends zzbel implements zzbft {
    private static final zzyu zzb;
    private int zzd;
    private int zze;

    static {
        zzyu zzyuVar = new zzyu();
        zzb = zzyuVar;
        zzbel.zzR(zzyu.class, zzyuVar);
    }

    private zzyu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzyu();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzyt(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
