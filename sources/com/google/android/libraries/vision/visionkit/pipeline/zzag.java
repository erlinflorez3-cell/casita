package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzag extends zzbel<zzag, zzaf> implements zzbft {
    private static final zzag zzb;
    private int zzd;
    private zzbet zze = zzL();
    private String zzf = "";

    static {
        zzag zzagVar = new zzag();
        zzb = zzagVar;
        zzbel.zzR(zzag.class, zzagVar);
    }

    private zzag() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zze", zzam.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzag();
        }
        zzae zzaeVar = null;
        if (i3 == 4) {
            return new zzaf(zzaeVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzc() {
        return this.zze;
    }
}
