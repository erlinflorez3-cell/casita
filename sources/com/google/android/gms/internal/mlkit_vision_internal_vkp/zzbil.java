package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbil extends zzbel implements zzbft {
    private static final zzbil zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        zzbil zzbilVar = new zzbil();
        zzb = zzbilVar;
        zzbel.zzR(zzbil.class, zzbilVar);
    }

    private zzbil() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzbik.zza, "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbil();
        }
        zzbht zzbhtVar = null;
        if (i3 == 4) {
            return new zzbij(zzbhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
