package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbnj extends zzbel implements zzbft {
    private static final zzbnj zzb;
    private int zzd;
    private zzaza zzf;
    private byte zzg = 2;
    private zzbet zze = zzL();

    static {
        zzbnj zzbnjVar = new zzbnj();
        zzb = zzbnjVar;
        zzbel.zzR(zzbnj.class, zzbnjVar);
    }

    private zzbnj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zzd", "zze", zzbnh.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzbnj();
        }
        if (i3 == 4) {
            return new zzbni(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
