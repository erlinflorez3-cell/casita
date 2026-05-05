package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbas extends zzbel implements zzbft {
    private static final zzbas zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzber zzg = zzJ();

    static {
        zzbas zzbasVar = new zzbas();
        zzb = zzbasVar;
        zzbel.zzR(zzbas.class, zzbasVar);
    }

    private zzbas() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0001\u0002င\u0000\u0003ࠞ", new Object[]{"zzd", "zzf", "zze", "zzg", zzbat.zza});
        }
        if (i3 == 3) {
            return new zzbas();
        }
        zzazt zzaztVar = null;
        if (i3 == 4) {
            return new zzbar(zzaztVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
