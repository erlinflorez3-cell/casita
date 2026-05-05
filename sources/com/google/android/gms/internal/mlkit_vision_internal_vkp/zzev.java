package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzev extends zzbel implements zzbft {
    private static final zzev zzb;
    private int zzd;
    private boolean zze;
    private float zzf = 0.2f;
    private zzbet zzg = zzL();

    static {
        zzev zzevVar = new zzev();
        zzb = zzevVar;
        zzbel.zzR(zzev.class, zzevVar);
    }

    private zzev() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzey.class});
        }
        if (i3 == 3) {
            return new zzev();
        }
        zzet zzetVar = null;
        if (i3 == 4) {
            return new zzeu(zzetVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
