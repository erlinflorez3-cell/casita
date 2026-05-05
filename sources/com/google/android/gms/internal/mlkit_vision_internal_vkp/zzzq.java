package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzzq extends zzbel implements zzbft {
    private static final zzzq zzb;
    private int zzd;
    private zzvc zze;
    private zzut zzf;
    private int zzg;
    private float zzh;
    private int zzi;

    static {
        zzzq zzzqVar = new zzzq();
        zzb = zzzqVar;
        zzbel.zzR(zzzq.class, zzzqVar);
    }

    private zzzq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဋ\u0002\u0005ခ\u0003\u0006᠌\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzzp.zza});
        }
        if (i3 == 3) {
            return new zzzq();
        }
        if (i3 == 4) {
            return new zzzo(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
