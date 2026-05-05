package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzzy extends zzbel implements zzbft {
    private static final zzzy zzb;
    private int zzd;
    private zzaaa zze;
    private long zzg;
    private long zzh;
    private zzber zzf = zzJ();
    private zzbet zzi = zzL();

    static {
        zzzy zzzyVar = new zzzy();
        zzb = zzzyVar;
        zzbel.zzR(zzzy.class, zzzyVar);
    }

    private zzzy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ࠞ\u0003ဃ\u0001\u0004ဃ\u0002\u0005\u001b", new Object[]{"zzd", "zze", "zzf", zzuc.zza, "zzg", "zzh", "zzi", zzacv.class});
        }
        if (i3 == 3) {
            return new zzzy();
        }
        if (i3 == 4) {
            return new zzzx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
