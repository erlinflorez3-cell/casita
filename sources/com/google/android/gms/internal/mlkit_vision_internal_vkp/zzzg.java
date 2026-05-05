package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzzg extends zzbel implements zzbft {
    private static final zzzg zzb;
    private int zzd;
    private zzzl zze;
    private int zzf;
    private long zzg;

    static {
        zzzg zzzgVar = new zzzg();
        zzb = zzzgVar;
        zzbel.zzR(zzzg.class, zzzgVar);
    }

    private zzzg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဃ\u0002", new Object[]{"zzd", "zze", "zzf", zzuc.zza, "zzg"});
        }
        if (i3 == 3) {
            return new zzzg();
        }
        if (i3 == 4) {
            return new zzzf(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
