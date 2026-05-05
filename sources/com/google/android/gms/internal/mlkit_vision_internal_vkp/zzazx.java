package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzazx extends zzbel implements zzbft {
    private static final zzazx zzb;
    private int zzd;
    private int zze = -1;
    private int zzf = -1;
    private zzbeq zzg = zzI();
    private zzber zzh = zzJ();
    private zzbeq zzi = zzI();

    static {
        zzazx zzazxVar = new zzazx();
        zzb = zzazxVar;
        zzbel.zzR(zzazx.class, zzazxVar);
    }

    private zzazx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004\u0016\u0006\u0013", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzazx();
        }
        zzazt zzaztVar = null;
        if (i3 == 4) {
            return new zzazw(zzaztVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
