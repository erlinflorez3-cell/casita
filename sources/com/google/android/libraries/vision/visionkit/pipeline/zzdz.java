package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdz extends zzbel implements zzbft {
    private static final zzdz zzb;
    private zzbet zzd = zzL();

    static {
        zzdz zzdzVar = new zzdz();
        zzb = zzdzVar;
        zzbel.zzR(zzdz.class, zzdzVar);
    }

    private zzdz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzdy.class});
        }
        if (i3 == 3) {
            return new zzdz();
        }
        zzdv zzdvVar = null;
        if (i3 == 4) {
            return new zzdw(zzdvVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
