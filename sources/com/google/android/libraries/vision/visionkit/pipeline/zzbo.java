package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzagp;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzlv;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbo extends zzbel implements zzbft {
    private static final zzbo zzb;
    private int zzd;
    private zzlv zze;
    private zzagp zzf;
    private boolean zzg;
    private byte zzi = 2;
    private String zzh = "";

    static {
        zzbo zzboVar = new zzbo();
        zzb = zzboVar;
        zzbel.zzR(zzbo.class, zzboVar);
    }

    private zzbo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbo();
        }
        if (i3 == 4) {
            return new zzbn(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
