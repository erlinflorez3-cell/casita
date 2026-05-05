package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeu extends zzbel implements zzbft {
    private static final zzeu zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzeu zzeuVar = new zzeu();
        zzb = zzeuVar;
        zzbel.zzR(zzeu.class, zzeuVar);
    }

    private zzeu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzbf.class, zzcb.class});
        }
        if (i3 == 3) {
            return new zzeu();
        }
        if (i3 == 4) {
            return new zzet(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
