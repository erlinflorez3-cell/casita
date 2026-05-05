package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhy extends zzbel implements zzbft {
    private static final zzhy zzb;
    private zzbeq zzd = zzI();

    static {
        zzhy zzhyVar = new zzhy();
        zzb = zzhyVar;
        zzbel.zzR(zzhy.class, zzhyVar);
    }

    private zzhy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zzd"});
        }
        if (i3 == 3) {
            return new zzhy();
        }
        zzht zzhtVar = null;
        if (i3 == 4) {
            return new zzhx(zzhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
