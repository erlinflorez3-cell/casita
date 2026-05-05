package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafq extends zzbel implements zzbft {
    private static final zzafq zzb;
    private int zzd;
    private int zze;
    private zzgp zzf;
    private String zzg = "";

    static {
        zzafq zzafqVar = new zzafq();
        zzb = zzafqVar;
        zzbel.zzR(zzafq.class, zzafqVar);
    }

    private zzafq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzafq();
        }
        zzafo zzafoVar = null;
        if (i3 == 4) {
            return new zzafp(zzafoVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
