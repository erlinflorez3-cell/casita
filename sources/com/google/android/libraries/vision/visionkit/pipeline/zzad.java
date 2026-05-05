package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zziy;

/* JADX INFO: loaded from: classes8.dex */
public final class zzad extends zzbel implements zzbft {
    private static final zzad zzb;
    private int zzd;
    private int zzf;
    private zzbet zze = zzL();
    private zzbet zzg = zzbel.zzL();

    static {
        zzad zzadVar = new zzad();
        zzb = zzadVar;
        zzbel.zzR(zzad.class, zzadVar);
    }

    private zzad() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003\u001a", new Object[]{"zzd", "zze", zziy.class, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzad();
        }
        if (i3 == 4) {
            return new zzac(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
