package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfw extends zzbel implements zzbft {
    private static final zzfw zzb;
    private int zzd;
    private float zze = 0.7f;
    private int zzf = 2;
    private float zzg = 0.2f;

    static {
        zzfw zzfwVar = new zzfw();
        zzb = zzfwVar;
        zzbel.zzR(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzfw();
        }
        zzfu zzfuVar = null;
        if (i3 == 4) {
            return new zzfv(zzfuVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
