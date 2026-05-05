package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfi extends zzbel implements zzbft {
    private static final zzfi zzb;
    private int zzd;
    private int zze = 1;
    private boolean zzf;

    static {
        zzfi zzfiVar = new zzfi();
        zzb = zzfiVar;
        zzbel.zzR(zzfi.class, zzfiVar);
    }

    private zzfi() {
    }

    public static zzfh zza() {
        return (zzfh) zzb.zzB();
    }

    static /* synthetic */ void zzd(zzfi zzfiVar, boolean z2) {
        zzfiVar.zzd |= 2;
        zzfiVar.zzf = true;
    }

    static /* synthetic */ void zze(zzfi zzfiVar, int i2) {
        zzfiVar.zze = i2 - 1;
        zzfiVar.zzd = (-1) - (((-1) - zzfiVar.zzd) & ((-1) - 1));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", zzn.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzfi();
        }
        if (i3 == 4) {
            return new zzfh(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
