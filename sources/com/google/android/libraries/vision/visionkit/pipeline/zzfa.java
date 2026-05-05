package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzmt;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfa extends zzbel implements zzbft {
    private static final zzfa zzb;
    private int zzd;
    private String zze = "";
    private zzbet zzf = zzbel.zzL();
    private zzbet zzg = zzbel.zzL();
    private zzbet zzh = zzbel.zzL();
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbd zzi;
    private zzmt zzj;

    static {
        zzfa zzfaVar = new zzfa();
        zzb = zzfaVar;
        zzbel.zzR(zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0001\u0004\u001a\u0005ဉ\u0002\u0006\u001a", new Object[]{"zzd", "zze", "zzf", "zzi", "zzh", "zzj", "zzg"});
        }
        if (i3 == 3) {
            return new zzfa();
        }
        if (i3 == 4) {
            return new zzez(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
