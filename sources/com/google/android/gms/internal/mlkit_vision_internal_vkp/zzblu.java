package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzblu extends zzbel implements zzbft {
    private static final zzblu zzb;
    private int zzd;
    private int zze;
    private zzblm zzf;
    private zzblg zzg;

    static {
        zzblu zzbluVar = new zzblu();
        zzb = zzbluVar;
        zzbel.zzR(zzblu.class, zzbluVar);
    }

    private zzblu() {
    }

    public static zzblu zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzbls.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzblu();
        }
        if (i3 == 4) {
            return new zzblr(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzf() {
        int iZza = zzblt.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
