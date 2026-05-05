package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbip extends zzbel implements zzbft {
    private static final zzbip zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzbet zzg = zzbel.zzL();
    private int zzh;

    static {
        zzbip zzbipVar = new zzbip();
        zzb = zzbipVar;
        zzbel.zzR(zzbip.class, zzbipVar);
    }

    private zzbip() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", zzbio.zza, "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbip();
        }
        zzbht zzbhtVar = null;
        if (i3 == 4) {
            return new zzbin(zzbhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
