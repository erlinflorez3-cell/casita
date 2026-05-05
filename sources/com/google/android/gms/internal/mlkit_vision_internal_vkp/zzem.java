package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzem extends zzbel implements zzbft {
    private static final zzem zzb;
    private int zzd;
    private zzft zze;
    private zzagf zzf;
    private zzbm zzg;
    private zzfk zzh;
    private zzes zzi;
    private zzep zzj;
    private zzfe zzk;
    private byte zzl = 2;

    static {
        zzem zzemVar = new zzem();
        zzb = zzemVar;
        zzbel.zzR(zzem.class, zzemVar);
    }

    private zzem() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzem();
        }
        if (i3 == 4) {
            return new zzel(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
