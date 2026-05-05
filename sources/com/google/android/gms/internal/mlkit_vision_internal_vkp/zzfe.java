package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfe extends zzbel implements zzbft {
    private static final zzfe zzb;
    private int zzd;
    private float zze;

    static {
        zzfe zzfeVar = new zzfe();
        zzb = zzfeVar;
        zzbel.zzR(zzfe.class, zzfeVar);
    }

    private zzfe() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzfe();
        }
        zzfc zzfcVar = null;
        if (i3 == 4) {
            return new zzfd(zzfcVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
