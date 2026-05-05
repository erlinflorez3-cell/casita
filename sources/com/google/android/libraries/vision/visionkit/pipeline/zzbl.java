package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbl extends zzbel implements zzbft {
    private static final zzbl zzb;
    private int zzd;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzed zze;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzej zzf;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzeg zzg;

    static {
        zzbl zzblVar = new zzbl();
        zzb = zzblVar;
        zzbel.zzR(zzbl.class, zzblVar);
    }

    private zzbl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbl();
        }
        if (i3 == 4) {
            return new zzbk(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
