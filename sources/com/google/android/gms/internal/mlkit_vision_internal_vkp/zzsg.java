package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsg extends zzbel implements zzbft {
    private static final zzsg zzb;
    private int zzd;
    private zzvc zze;
    private zzrs zzf;
    private zzut zzg;

    static {
        zzsg zzsgVar = new zzsg();
        zzb = zzsgVar;
        zzbel.zzR(zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzsg();
        }
        if (i3 == 4) {
            return new zzsf(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
