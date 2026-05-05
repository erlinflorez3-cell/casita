package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzff extends zzbel implements zzbft {
    private static final zzff zzb;
    private zzbet zzd = zzL();

    static {
        zzff zzffVar = new zzff();
        zzb = zzffVar;
        zzbel.zzR(zzff.class, zzffVar);
    }

    private zzff() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfe.class});
        }
        if (i3 == 3) {
            return new zzff();
        }
        zzfb zzfbVar = null;
        if (i3 == 4) {
            return new zzfc(zzfbVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
