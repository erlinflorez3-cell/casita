package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzik extends zzbel implements zzbft {
    private static final zzik zzb;
    private int zzd;
    private zzii zzf;
    private zzhm zzg;
    private zzbzh zzh;
    private zzbhv zzk;
    private String zze = "";
    private String zzi = "en";
    private int zzj = 1;
    private int zzl = -1;
    private String zzm = "";

    static {
        zzik zzikVar = new zzik();
        zzb = zzikVar;
        zzbel.zzR(zzik.class, zzikVar);
    }

    private zzik() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0005\u0004ဉ\u0006\u0005ဉ\u0002\u0006ဈ\u0004\u0007င\u0007\bဉ\u0003\tဈ\b", new Object[]{"zzd", "zze", "zzf", "zzj", zzij.zza, "zzk", "zzg", "zzi", "zzl", "zzh", "zzm"});
        }
        if (i3 == 3) {
            return new zzik();
        }
        if (i3 == 4) {
            return new zzig(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
