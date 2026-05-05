package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzby extends zzbel implements zzbft {
    private static final zzby zzb;
    private int zzd;
    private int zze = -1;
    private float zzf = 0.3f;
    private int zzg = 5;
    private float zzh = 0.5f;
    private int zzi = 1;
    private boolean zzj = true;
    private float zzk = 0.85f;
    private boolean zzl = true;
    private float zzm;

    static {
        zzby zzbyVar = new zzby();
        zzb = zzbyVar;
        zzbel.zzR(zzby.class, zzbyVar);
    }

    private zzby() {
    }

    public static zzbw zza() {
        return (zzbw) zzb.zzB();
    }

    static /* synthetic */ void zzd(zzby zzbyVar, float f2) {
        zzbyVar.zzd |= 64;
        zzbyVar.zzk = 0.0f;
    }

    static /* synthetic */ void zze(zzby zzbyVar, boolean z2) {
        zzbyVar.zzd = (-1) - (((-1) - zzbyVar.zzd) & ((-1) - 128));
        zzbyVar.zzl = false;
    }

    static /* synthetic */ void zzf(zzby zzbyVar, int i2) {
        zzbyVar.zzd |= 4;
        zzbyVar.zzg = i2;
    }

    static /* synthetic */ void zzg(zzby zzbyVar, float f2) {
        zzbyVar.zzd |= 8;
        zzbyVar.zzh = 0.2f;
    }

    static /* synthetic */ void zzh(zzby zzbyVar, int i2) {
        zzbyVar.zzi = 2;
        zzbyVar.zzd |= 16;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001င\u0000\u0005ခ\u0001\u0006င\u0002\u0007ခ\u0003\f᠌\u0004\u000eဇ\u0005\u000fခ\u0006\u0010ဇ\u0007\u0011ခ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzbx.zza, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i3 == 3) {
            return new zzby();
        }
        if (i3 == 4) {
            return new zzbw(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
