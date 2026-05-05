package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfe extends zzbel implements zzbft {
    private static final zzfe zzb;
    private int zzd;
    private String zze = "";
    private zzbet zzf = zzbel.zzL();
    private boolean zzg;

    static {
        zzfe zzfeVar = new zzfe();
        zzb = zzfeVar;
        zzbel.zzR(zzfe.class, zzfeVar);
    }

    private zzfe() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzfe();
        }
        zzfb zzfbVar = null;
        if (i3 == 4) {
            return new zzfd(zzfbVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
