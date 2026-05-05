package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzae extends zzbel implements zzbft {
    private static final zzae zzb;
    private int zzd;
    private zzav zze;
    private zzbcg zzf;
    private String zzg = "";

    static {
        zzae zzaeVar = new zzae();
        zzb = zzaeVar;
        zzbel.zzR(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0002\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzg", "zzf"});
        }
        if (i3 == 3) {
            return new zzae();
        }
        if (i3 == 4) {
            return new zzad(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
