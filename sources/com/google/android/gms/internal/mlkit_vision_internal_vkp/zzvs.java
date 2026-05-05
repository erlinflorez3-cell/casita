package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvs extends zzbel implements zzbft {
    private static final zzvs zzb;
    private int zzd;
    private zzvu zze;
    private long zzf;
    private int zzg;
    private int zzh;

    static {
        zzvs zzvsVar = new zzvs();
        zzb = zzvsVar;
        zzbel.zzR(zzvs.class, zzvsVar);
    }

    private zzvs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004᠌\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzvs();
        }
        if (i3 == 4) {
            return new zzvr(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
