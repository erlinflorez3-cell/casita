package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxo extends zzbel implements zzbft {
    private static final zzbxo zzb;
    private int zzd;
    private zzbxu zze;
    private zzbyj zzf;
    private zzbxl zzg;
    private zzbwq zzh;
    private zzbwe zzi;
    private zzbyd zzj;
    private zzbww zzk;

    static {
        zzbxo zzbxoVar = new zzbxo();
        zzb = zzbxoVar;
        zzbel.zzR(zzbxo.class, zzbxoVar);
    }

    private zzbxo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzbxo();
        }
        if (i3 == 4) {
            return new zzbxn(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
