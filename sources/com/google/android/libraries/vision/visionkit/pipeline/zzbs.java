package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbs extends zzbel implements zzbft {
    private static final zzbs zzb;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzdf zzf;
    private zzx zzg;

    static {
        zzbs zzbsVar = new zzbs();
        zzb = zzbsVar;
        zzbel.zzR(zzbs.class, zzbsVar);
    }

    private zzbs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzbr.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbs();
        }
        if (i3 == 4) {
            return new zzbq(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
