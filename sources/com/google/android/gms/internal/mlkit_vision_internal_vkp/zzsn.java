package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsn extends zzbel implements zzbft {
    private static final zzsn zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;

    static {
        zzsn zzsnVar = new zzsn();
        zzb = zzsnVar;
        zzbel.zzR(zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဃ\u0002\u0004᠌\u0003", new Object[]{"zzd", "zze", zzsm.zza, "zzf", "zzg", "zzh", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzsn();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzsl(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
