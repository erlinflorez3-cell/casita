package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbir extends zzbel implements zzbft {
    private static final zzbir zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzbir zzbirVar = new zzbir();
        zzb = zzbirVar;
        zzbel.zzR(zzbir.class, zzbirVar);
    }

    private zzbir() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzbis.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzbir();
        }
        zzbht zzbhtVar = null;
        if (i3 == 4) {
            return new zzbiq(zzbhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
