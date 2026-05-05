package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzj extends zzbel implements zzbft {
    private static final zzj zzb;
    private int zzd;
    private int zze;
    private zzdj zzf;

    static {
        zzj zzjVar = new zzj();
        zzb = zzjVar;
        zzbel.zzR(zzj.class, zzjVar);
    }

    private zzj() {
    }

    public static zzi zza() {
        return (zzi) zzb.zzB();
    }

    static /* synthetic */ void zzd(zzj zzjVar, int i2) {
        zzjVar.zze = 1;
        int i3 = zzjVar.zzd;
        zzjVar.zzd = (1 + i3) - (1 & i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzn.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzj();
        }
        if (i3 == 4) {
            return new zzi(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
