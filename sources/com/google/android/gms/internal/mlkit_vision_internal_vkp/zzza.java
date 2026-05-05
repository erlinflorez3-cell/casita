package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzza extends zzbel implements zzbft {
    private static final zzza zzb;
    private int zzd;
    private zzvc zze;
    private zzagb zzf;
    private zzut zzg;
    private zzum zzh;
    private int zzi;
    private int zzj;

    static {
        zzza zzzaVar = new zzza();
        zzb = zzzaVar;
        zzbel.zzR(zzza.class, zzzaVar);
    }

    private zzza() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzza();
        }
        if (i3 == 4) {
            return new zzyz(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
