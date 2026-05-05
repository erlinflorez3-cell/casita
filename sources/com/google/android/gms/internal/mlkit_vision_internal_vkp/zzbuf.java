package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbuf extends zzbel implements zzbft {
    private static final zzbuf zzb;
    private int zzd;
    private zzbvd zze;
    private zzbvd zzf;

    static {
        zzbuf zzbufVar = new zzbuf();
        zzb = zzbufVar;
        zzbel.zzR(zzbuf.class, zzbufVar);
    }

    private zzbuf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbuf();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbue(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
