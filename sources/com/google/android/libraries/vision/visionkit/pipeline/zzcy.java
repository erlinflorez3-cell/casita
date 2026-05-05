package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcy extends zzbel implements zzbft {
    private static final zzcy zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";

    static {
        zzcy zzcyVar = new zzcy();
        zzb = zzcyVar;
        zzbel.zzR(zzcy.class, zzcyVar);
    }

    private zzcy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzcy();
        }
        zzcw zzcwVar = null;
        if (i3 == 4) {
            return new zzcx(zzcwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
