package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyk extends zzbel implements zzbft {
    private static final zzyk zzb;
    private int zzd;
    private zzvc zze;
    private zzym zzf;
    private zzut zzg;

    static {
        zzyk zzykVar = new zzyk();
        zzb = zzykVar;
        zzbel.zzR(zzyk.class, zzykVar);
    }

    private zzyk() {
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
            return new zzyk();
        }
        if (i3 == 4) {
            return new zzyj(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
