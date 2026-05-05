package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdj extends zzbel implements zzbft {
    private static final zzdj zzb;
    private int zzd;
    private int zze = 1;
    private int zzf = 5;

    static {
        zzdj zzdjVar = new zzdj();
        zzb = zzdjVar;
        zzbel.zzR(zzdj.class, zzdjVar);
    }

    private zzdj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", zzdi.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzdj();
        }
        zzdg zzdgVar = null;
        if (i3 == 4) {
            return new zzdh(zzdgVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
