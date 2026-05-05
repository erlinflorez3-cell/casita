package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbpt extends zzbel implements zzbft {
    private static final zzbpt zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        zzbpt zzbptVar = new zzbpt();
        zzb = zzbptVar;
        zzbel.zzR(zzbpt.class, zzbptVar);
    }

    private zzbpt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbpt();
        }
        zzbpp zzbppVar = null;
        if (i3 == 4) {
            return new zzbps(zzbppVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
