package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbj extends zzbel implements zzbft {
    private static final zzbbj zzb;
    private int zzd;
    private zzazv zze;
    private byte zzg = 2;
    private zzber zzf = zzJ();

    static {
        zzbbj zzbbjVar = new zzbbj();
        zzb = zzbbjVar;
        zzbel.zzR(zzbbj.class, zzbbjVar);
    }

    private zzbbj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbbj();
        }
        if (i3 == 4) {
            return new zzbbi(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
