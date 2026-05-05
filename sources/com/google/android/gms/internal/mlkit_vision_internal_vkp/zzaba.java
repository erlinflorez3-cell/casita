package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaba extends zzbel implements zzbft {
    private static final zzaba zzb;
    private int zzd;
    private zzaaw zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzbet zzi = zzL();

    static {
        zzaba zzabaVar = new zzaba();
        zzb = zzabaVar;
        zzbel.zzR(zzaba.class, zzabaVar);
    }

    private zzaba() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005\u001b", new Object[]{"zzd", "zze", "zzf", zzuc.zza, "zzg", "zzh", "zzi", zzacv.class});
        }
        if (i3 == 3) {
            return new zzaba();
        }
        if (i3 == 4) {
            return new zzaaz(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
