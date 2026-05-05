package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcy extends zzbel implements zzbft {
    private static final zzcy zzb;
    private int zzd;
    private zzbzh zze;
    private zzhm zzf;
    private float zzi;
    private zzbhv zzm;
    private String zzg = "en";
    private int zzh = -1;
    private zzbet zzj = zzbel.zzL();
    private zzbet zzk = zzbel.zzL();
    private int zzl = -1;

    static {
        zzcy zzcyVar = new zzcy();
        zzb = zzcyVar;
        zzbel.zzR(zzcy.class, zzcyVar);
    }

    private zzcy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0001\u0002ဈ\u0002\u0003င\u0003\u0004ခ\u0004\u0005\u001a\u0006\u001a\u0007င\u0005\bဉ\u0006\tဉ\u0000", new Object[]{"zzd", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zze"});
        }
        if (i3 == 3) {
            return new zzcy();
        }
        if (i3 == 4) {
            return new zzcx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
