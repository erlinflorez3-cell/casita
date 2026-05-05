package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgd extends zzbel implements zzbft {
    private static final zzgd zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgd zzgdVar = new zzgd();
        zzb = zzgdVar;
        zzbel.zzR(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzgd();
        }
        zzfz zzfzVar = null;
        if (i3 == 4) {
            return new zzgc(zzfzVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
