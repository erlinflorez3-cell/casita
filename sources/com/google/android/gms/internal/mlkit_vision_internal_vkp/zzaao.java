package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaao extends zzbel implements zzbft {
    private static final zzaao zzb;
    private int zzd;
    private zzaam zze;

    static {
        zzaao zzaaoVar = new zzaao();
        zzb = zzaaoVar;
        zzbel.zzR(zzaao.class, zzaaoVar);
    }

    private zzaao() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzaao();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzaan(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
