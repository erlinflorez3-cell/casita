package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzem extends zzbel implements zzbft {
    private static final zzem zzb;
    private int zzd;
    private String zze = "";

    static {
        zzem zzemVar = new zzem();
        zzb = zzemVar;
        zzbel.zzR(zzem.class, zzemVar);
    }

    private zzem() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzem();
        }
        zzej zzejVar = null;
        if (i3 == 4) {
            return new zzel(zzejVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
