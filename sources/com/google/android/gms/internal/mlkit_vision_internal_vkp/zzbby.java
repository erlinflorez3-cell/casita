package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbby extends zzbel implements zzbft {
    private static final zzbby zzb;
    private int zzd;
    private zzbet zze = zzL();
    private zzbet zzf = zzL();
    private int zzg;

    static {
        zzbby zzbbyVar = new zzbby();
        zzb = zzbbyVar;
        zzbel.zzR(zzbby.class, zzbbyVar);
    }

    private zzbby() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"zzd", "zze", zzbca.class, "zzf", zzbbu.class, "zzg"});
        }
        if (i3 == 3) {
            return new zzbby();
        }
        if (i3 == 4) {
            return new zzbbx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
