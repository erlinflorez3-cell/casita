package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zztc extends zzbel implements zzbft {
    private static final zztc zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zzbel.zzR(zztc.class, zztcVar);
    }

    private zztc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", zzwb.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zztc();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zztb(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
