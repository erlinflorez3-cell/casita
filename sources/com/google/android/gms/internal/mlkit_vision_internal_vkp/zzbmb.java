package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbmb extends zzbeh implements zzbft {
    private static final zzbmb zzd;
    private int zze;
    private boolean zzg;
    private byte zzh = 2;
    private zzbet zzf = zzL();

    static {
        zzbmb zzbmbVar = new zzbmb();
        zzd = zzbmbVar;
        zzbel.zzR(zzbmb.class, zzbmbVar);
    }

    private zzbmb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"zze", "zzf", zzbma.class, "zzg"});
        }
        if (i3 == 3) {
            return new zzbmb();
        }
        if (i3 == 4) {
            return new zzbly(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
