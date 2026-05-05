package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbsq;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzjb;

/* JADX INFO: loaded from: classes8.dex */
public final class zzer extends zzbel implements zzbft {
    private static final zzer zzb;
    private int zzd;
    private int zze;
    private zzbsq zzf;
    private zzjb zzg;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzdx zzh;
    private zzaa zzi;
    private byte zzj = 2;

    static {
        zzer zzerVar = new zzer();
        zzb = zzerVar;
        zzbel.zzR(zzer.class, zzerVar);
    }

    private zzer() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003᠌\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zzd", "zzg", "zzh", "zze", zzeq.zza, "zzi", "zzf"});
        }
        if (i3 == 3) {
            return new zzer();
        }
        if (i3 == 4) {
            return new zzep(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
