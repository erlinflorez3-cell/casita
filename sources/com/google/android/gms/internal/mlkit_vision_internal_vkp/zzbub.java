package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbub extends zzbel implements zzbft {
    private static final zzbub zzb;
    private Object zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzd = 0;
    private zzbet zzi = zzL();

    static {
        zzbub zzbubVar = new zzbub();
        zzb = zzbubVar;
        zzbel.zzR(zzbub.class, zzbubVar);
    }

    private zzbub() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u0004\u0004\u001b\u00057\u0000\u0006\u0004", new Object[]{"zze", "zzd", "zzf", zzbua.class, "zzg", "zzi", zzbcq.class, "zzh"});
        }
        if (i3 == 3) {
            return new zzbub();
        }
        if (i3 == 4) {
            return new zzbty(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
