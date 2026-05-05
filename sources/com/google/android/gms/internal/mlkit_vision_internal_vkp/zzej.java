package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzej extends zzbel implements zzbft {
    private static final zzej zzb;
    private int zzd;
    private long zze;
    private float zzf;

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzbel.zzR(zzej.class, zzejVar);
    }

    private zzej() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzej();
        }
        zzeh zzehVar = null;
        if (i3 == 4) {
            return new zzei(zzehVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
