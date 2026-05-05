package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbma extends zzbel implements zzbft {
    private static final zzbma zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzbet zzg = zzL();

    static {
        zzbma zzbmaVar = new zzbma();
        zzb = zzbmaVar;
        zzbel.zzR(zzbma.class, zzbmaVar);
    }

    private zzbma() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzblx.class});
        }
        if (i3 == 3) {
            return new zzbma();
        }
        if (i3 == 4) {
            return new zzblz(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
