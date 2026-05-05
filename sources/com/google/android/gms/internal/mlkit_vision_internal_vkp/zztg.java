package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zztg extends zzbel implements zzbft {
    private static final zztg zzb;
    private int zzd;
    private int zze;
    private zztj zzf;

    static {
        zztg zztgVar = new zztg();
        zzb = zztgVar;
        zzbel.zzR(zztg.class, zztgVar);
    }

    private zztg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzuc.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zztg();
        }
        if (i3 == 4) {
            return new zztf(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
