package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbjm extends zzbel implements zzbft {
    private static final zzbjm zzb;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        zzbjm zzbjmVar = new zzbjm();
        zzb = zzbjmVar;
        zzbel.zzR(zzbjm.class, zzbjmVar);
    }

    private zzbjm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", zzbjk.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbjm();
        }
        zzbht zzbhtVar = null;
        if (i3 == 4) {
            return new zzbjl(zzbhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
