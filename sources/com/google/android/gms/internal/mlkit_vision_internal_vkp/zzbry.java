package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbry extends zzbel implements zzbft {
    private static final zzbry zzb;
    private zzbeq zzd = zzI();
    private zzbeq zze = zzI();
    private zzbeq zzf = zzI();
    private zzbeq zzg = zzI();
    private zzbeq zzh = zzI();
    private zzbeq zzi = zzI();

    static {
        zzbry zzbryVar = new zzbry();
        zzb = zzbryVar;
        zzbel.zzR(zzbry.class, zzbryVar);
    }

    private zzbry() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013\u0005\u0013\u0006\u0013", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzbry();
        }
        zzbru zzbruVar = null;
        if (i3 == 4) {
            return new zzbrx(zzbruVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
