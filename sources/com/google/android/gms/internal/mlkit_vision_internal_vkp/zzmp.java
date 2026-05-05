package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmp extends zzbel implements zzbft {
    private static final zzmp zzb;
    private Object zze;
    private int zzd = 0;
    private zzbet zzf = zzL();

    static {
        zzmp zzmpVar = new zzmp();
        zzb = zzmpVar;
        zzbel.zzR(zzmp.class, zzmpVar);
    }

    private zzmp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001;\u0000\u00023\u0000\u0003<\u0000\u0004\u001b", new Object[]{"zze", "zzd", zzmt.class, "zzf", zzmp.class});
        }
        if (i3 == 3) {
            return new zzmp();
        }
        zzmn zzmnVar = null;
        if (i3 == 4) {
            return new zzmo(zzmnVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
