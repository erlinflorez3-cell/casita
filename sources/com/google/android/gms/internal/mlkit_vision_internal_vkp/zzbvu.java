package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbvu extends zzbel implements zzbft {
    private static final zzbvu zzb;
    private int zzd;
    private String zze = "";
    private zzbdd zzf = zzbdd.zzb;

    static {
        zzbvu zzbvuVar = new zzbvu();
        zzb = zzbvuVar;
        zzbel.zzR(zzbvu.class, zzbvuVar);
    }

    private zzbvu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbvu();
        }
        zzbvr zzbvrVar = null;
        if (i3 == 4) {
            return new zzbvt(zzbvrVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
