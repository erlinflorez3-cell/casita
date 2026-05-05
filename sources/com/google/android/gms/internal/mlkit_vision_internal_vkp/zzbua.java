package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbua extends zzbel implements zzbft {
    private static final zzbua zzb;
    private int zzd;
    private zzber zze = zzJ();

    static {
        zzbua zzbuaVar = new zzbua();
        zzb = zzbuaVar;
        zzbel.zzR(zzbua.class, zzbuaVar);
    }

    private zzbua() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002'", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzbua();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbtz(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
