package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzxo extends zzbel implements zzbft {
    private static final zzxo zzb;
    private zzbet zzd = zzL();
    private zzbet zze = zzL();
    private zzbet zzf = zzL();

    static {
        zzxo zzxoVar = new zzxo();
        zzb = zzxoVar;
        zzbel.zzR(zzxo.class, zzxoVar);
    }

    private zzxo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"zzd", zzxg.class, "zze", zzxg.class, "zzf", zzxg.class});
        }
        if (i3 == 3) {
            return new zzxo();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzxn(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
