package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzblx extends zzbel implements zzbft {
    private static final zzblx zzb;
    private int zzd;
    private int zze;
    private float zzf;

    static {
        zzblx zzblxVar = new zzblx();
        zzb = zzblxVar;
        zzbel.zzR(zzblx.class, zzblxVar);
    }

    private zzblx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", zzblw.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzblx();
        }
        zzbkm zzbkmVar = null;
        if (i3 == 4) {
            return new zzblv(zzbkmVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
