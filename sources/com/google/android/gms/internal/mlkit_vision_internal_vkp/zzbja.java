package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbja extends zzbel implements zzbft {
    private static final zzbja zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzbja zzbjaVar = new zzbja();
        zzb = zzbjaVar;
        zzbel.zzR(zzbja.class, zzbjaVar);
    }

    private zzbja() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzbja();
        }
        zzbht zzbhtVar = null;
        if (i3 == 4) {
            return new zzbiz(zzbhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
