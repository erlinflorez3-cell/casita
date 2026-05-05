package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzei extends zzbel implements zzbft {
    private static final zzei zzb;
    private int zzd;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbd zze;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbj zzf;
    private zzef zzg;
    private boolean zzh;
    private byte zzi = 2;

    static {
        zzei zzeiVar = new zzei();
        zzb = zzeiVar;
        zzbel.zzR(zzei.class, zzeiVar);
    }

    private zzei() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဇ\u0003\u0003ᐉ\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzh", "zzg", "zzf"});
        }
        if (i3 == 3) {
            return new zzei();
        }
        if (i3 == 4) {
            return new zzeh(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
