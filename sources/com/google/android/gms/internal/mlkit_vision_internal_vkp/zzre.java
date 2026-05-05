package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzre extends zzbel implements zzbft {
    private static final zzre zzb;
    private int zzd;
    private zzvc zze;
    private zzwh zzf;
    private long zzg;
    private float zzh;
    private zzut zzi;

    static {
        zzre zzreVar = new zzre();
        zzb = zzreVar;
        zzbel.zzR(zzre.class, zzreVar);
    }

    private zzre() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဃ\u0002\u0004ခ\u0003\u0005ဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzre();
        }
        if (i3 == 4) {
            return new zzrd(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
