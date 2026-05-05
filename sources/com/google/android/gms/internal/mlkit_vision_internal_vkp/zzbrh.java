package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbrh extends zzbel implements zzbft {
    private static final zzbrh zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        zzbrh zzbrhVar = new zzbrh();
        zzb = zzbrhVar;
        zzbel.zzR(zzbrh.class, zzbrhVar);
    }

    private zzbrh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbrh();
        }
        zzbrf zzbrfVar = null;
        if (i3 == 4) {
            return new zzbrg(zzbrfVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
