package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzym extends zzbel implements zzbft {
    private static final zzym zzb;
    private int zzd;
    private float zze;
    private boolean zzf;
    private float zzg;

    static {
        zzym zzymVar = new zzym();
        zzb = zzymVar;
        zzbel.zzR(zzym.class, zzymVar);
    }

    private zzym() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzym();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzyl(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
