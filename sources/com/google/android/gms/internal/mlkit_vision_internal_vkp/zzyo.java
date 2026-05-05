package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zzyo extends zzbel implements zzbft {
    private static final zzyo zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private zztv zzg;
    private int zzh;

    static {
        zzyo zzyoVar = new zzyo();
        zzb = zzyoVar;
        zzbel.zzR(zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဋ\u0003", new Object[]{"zzd", "zze", "zzf", zzuc.zza, "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzyo();
        }
        if (i3 == 4) {
            return new zzyn(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
