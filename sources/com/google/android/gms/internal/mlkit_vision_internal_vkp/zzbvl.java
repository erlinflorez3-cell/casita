package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbvl extends zzbel implements zzbft {
    private static final zzbvl zzb;
    private int zzd;
    private zzhm zze;
    private String zzf = "";

    static {
        zzbvl zzbvlVar = new zzbvl();
        zzb = zzbvlVar;
        zzbel.zzR(zzbvl.class, zzbvlVar);
    }

    private zzbvl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbvl();
        }
        if (i3 == 4) {
            return new zzbvk(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
