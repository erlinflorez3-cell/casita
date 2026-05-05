package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzib extends zzbel implements zzbft {
    private static final zzib zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private int zzh;
    private int zze = 0;
    private zzbet zzi = zzL();

    static {
        zzib zzibVar = new zzib();
        zzb = zzibVar;
        zzbel.zzR(zzib.class, zzibVar);
    }

    private zzib() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001=\u0000\u0002င\u0000\u0003င\u0001\u0004<\u0000\u0005\u001b", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", zzia.class, "zzi", zzhw.class});
        }
        if (i3 == 3) {
            return new zzib();
        }
        if (i3 == 4) {
            return new zzhu(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
