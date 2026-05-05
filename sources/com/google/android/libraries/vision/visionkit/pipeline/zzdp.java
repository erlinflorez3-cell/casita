package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdp extends zzbel implements zzbft {
    private static final zzdp zzb;
    private int zzd;
    private boolean zze;

    static {
        zzdp zzdpVar = new zzdp();
        zzb = zzdpVar;
        zzbel.zzR(zzdp.class, zzdpVar);
    }

    private zzdp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzdp();
        }
        zzdn zzdnVar = null;
        if (i3 == 4) {
            return new zzdo(zzdnVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
