package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvz extends zzbel implements zzbft {
    private static final zzvz zzb;
    private int zzd;
    private zzwh zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private zzber zzk = zzJ();

    static {
        zzvz zzvzVar = new zzvz();
        zzb = zzvzVar;
        zzbel.zzR(zzvz.class, zzvzVar);
    }

    private zzvz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003᠌\u0002\u0004ဃ\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u0016", new Object[]{"zzd", "zze", "zzf", "zzg", zzuc.zza, "zzh", "zzi", zzvy.zza, "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzvz();
        }
        if (i3 == 4) {
            return new zzvx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
