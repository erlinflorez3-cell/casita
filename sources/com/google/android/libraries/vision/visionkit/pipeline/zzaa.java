package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbvv;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaa extends zzbel implements zzbft {
    private static final zzaa zzb;
    private int zzd;
    private zzbvv zze;
    private String zzf = "";
    private boolean zzg;
    private zzen zzh;

    static {
        zzaa zzaaVar = new zzaa();
        zzb = zzaaVar;
        zzbel.zzR(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzaa();
        }
        if (i3 == 4) {
            return new zzz(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
