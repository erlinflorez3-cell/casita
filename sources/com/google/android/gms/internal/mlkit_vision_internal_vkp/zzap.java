package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzap extends zzbel implements zzbft {
    private static final zzap zzb;
    private int zzd;
    private double zze;
    private double zzf;

    static {
        zzap zzapVar = new zzap();
        zzb = zzapVar;
        zzbel.zzR(zzap.class, zzapVar);
    }

    private zzap() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzap();
        }
        zzan zzanVar = null;
        if (i3 == 4) {
            return new zzao(zzanVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
