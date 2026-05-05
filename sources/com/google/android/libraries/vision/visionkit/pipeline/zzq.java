package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbvl;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zziy;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq extends zzbel implements zzbft {
    private static final zzq zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zziy zzg;

    static {
        zzq zzqVar = new zzq();
        zzb = zzqVar;
        zzbel.zzR(zzq.class, zzqVar);
    }

    private zzq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbp.class, zzbvl.class});
        }
        if (i3 == 3) {
            return new zzq();
        }
        if (i3 == 4) {
            return new zzp(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
