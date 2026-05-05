package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzboz extends zzbel implements zzbft {
    private static final zzboz zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        zzboz zzbozVar = new zzboz();
        zzb = zzbozVar;
        zzbel.zzR(zzboz.class, zzbozVar);
    }

    private zzboz() {
    }

    public static zzboz zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", zzboy.zza, "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzboz();
        }
        zzbow zzbowVar = null;
        if (i3 == 4) {
            return new zzbox(zzbowVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
