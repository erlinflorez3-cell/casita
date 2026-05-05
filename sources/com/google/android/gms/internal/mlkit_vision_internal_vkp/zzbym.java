package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbym extends zzbel implements zzbft {
    private static final zzbym zzb;

    static {
        zzbym zzbymVar = new zzbym();
        zzb = zzbymVar;
        zzbel.zzR(zzbym.class, zzbymVar);
    }

    private zzbym() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        zzbyk zzbykVar = null;
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0000", null);
        }
        if (i3 == 3) {
            return new zzbym();
        }
        if (i3 == 4) {
            return new zzbyl(zzbykVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
