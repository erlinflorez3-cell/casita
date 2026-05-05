package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwx extends zzbel implements zzbft {
    private static final zzwx zzb;
    private int zzd;
    private zzbet zze = zzL();
    private int zzf;

    static {
        zzwx zzwxVar = new zzwx();
        zzb = zzwxVar;
        zzbel.zzR(zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzd", "zze", zzxe.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzwx();
        }
        if (i3 == 4) {
            return new zzww(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
