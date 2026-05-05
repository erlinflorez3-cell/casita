package com.google.android.libraries.vision.visionkit.pipeline;

import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcu extends zzbel implements zzbft {
    private static final zzcu zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzcu zzcuVar = new zzcu();
        zzb = zzcuVar;
        zzbel.zzR(zzcu.class, zzcuVar);
    }

    private zzcu() {
    }

    public static zzcp zza() {
        return (zzcp) zzb.zzB();
    }

    static /* synthetic */ void zzd(zzcu zzcuVar, String str) {
        int i2 = zzcuVar.zzd;
        zzcuVar.zzd = (i2 + 1) - (i2 & 1);
        zzcuVar.zzg = "MobileObjectLocalizerV3_1TfLiteClient";
    }

    static /* synthetic */ void zze(zzcu zzcuVar, long j2) {
        zzcuVar.zze = 2;
        zzcuVar.zzf = Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzct.class});
        }
        if (i3 == 3) {
            return new zzcu();
        }
        if (i3 == 4) {
            return new zzcp(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
