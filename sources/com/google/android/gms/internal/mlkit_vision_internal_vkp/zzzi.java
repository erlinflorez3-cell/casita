package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzzi extends zzbel implements zzbft {
    private static final zzzi zzb;
    private int zzd;
    private zzvc zze;
    private zzzl zzf;
    private zzut zzg;
    private int zzh;

    static {
        zzzi zzziVar = new zzzi();
        zzb = zzziVar;
        zzbel.zzR(zzzi.class, zzziVar);
    }

    private zzzi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzzi();
        }
        if (i3 == 4) {
            return new zzzh(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
