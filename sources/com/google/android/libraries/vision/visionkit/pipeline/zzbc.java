package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbqm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbc extends zzbel implements zzbft {
    private static final zzbc zzb;
    private Object zze;
    private int zzd = 0;
    private byte zzg = 2;
    private zzbet zzf = zzL();

    static {
        zzbc zzbcVar = new zzbc();
        zzb = zzbcVar;
        zzbel.zzR(zzbc.class, zzbcVar);
    }

    private zzbc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л", new Object[]{"zze", "zzd", "zzf", zzbqm.class});
        }
        if (i3 == 3) {
            return new zzbc();
        }
        if (i3 == 4) {
            return new zzbb(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
