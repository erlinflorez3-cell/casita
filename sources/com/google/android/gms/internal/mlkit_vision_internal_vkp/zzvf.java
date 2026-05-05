package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvf extends zzbel implements zzbft {
    private static final zzvf zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzvf zzvfVar = new zzvf();
        zzb = zzvfVar;
        zzbel.zzR(zzvf.class, zzvfVar);
    }

    private zzvf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဃ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"zzd", "zze", "zzf", zzve.zza, "zzg", zzus.zza, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzvf();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzvd(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
