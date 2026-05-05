package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaz extends zzbel implements zzbft {
    private static final zzaz zzb;
    private int zzd;
    private int zze;

    static {
        zzaz zzazVar = new zzaz();
        zzb = zzazVar;
        zzbel.zzR(zzaz.class, zzazVar);
    }

    private zzaz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzaz();
        }
        zzax zzaxVar = null;
        if (i3 == 4) {
            return new zzay(zzaxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
