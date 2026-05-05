package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvq extends zzbel implements zzbft {
    private static final zzvq zzb;
    private int zzd;
    private zzvu zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private int zzi;

    static {
        zzvq zzvqVar = new zzvq();
        zzb = zzvqVar;
        zzbel.zzR(zzvq.class, zzvqVar);
    }

    private zzvq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဃ\u0003\u0005᠌\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzvq();
        }
        if (i3 == 4) {
            return new zzvp(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
