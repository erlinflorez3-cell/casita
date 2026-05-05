package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcu extends zzbel implements zzbft {
    private static final zzcu zzb;
    private int zzd;
    private zzbdd zze = zzbdd.zzb;
    private float zzf;
    private zzgx zzg;
    private long zzh;

    static {
        zzcu zzcuVar = new zzcu();
        zzb = zzcuVar;
        zzbel.zzR(zzcu.class, zzcuVar);
    }

    private zzcu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzcu();
        }
        if (i3 == 4) {
            return new zzct(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
