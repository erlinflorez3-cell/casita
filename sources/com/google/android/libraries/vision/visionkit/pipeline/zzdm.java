package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzgp;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzjh;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdm extends zzbel implements zzbft {
    private static final zzdm zzb;
    private int zzd;
    private zzgp zze;
    private zzbet zzf = zzL();
    private zzbet zzg = zzL();

    static {
        zzdm zzdmVar = new zzdm();
        zzb = zzdmVar;
        zzbel.zzR(zzdm.class, zzdmVar);
    }

    private zzdm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zzd", "zze", "zzf", zzjh.class, "zzg", com.google.android.gms.internal.mlkit_vision_internal_vkp.zzcv.class});
        }
        if (i3 == 3) {
            return new zzdm();
        }
        if (i3 == 4) {
            return new zzdl(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
