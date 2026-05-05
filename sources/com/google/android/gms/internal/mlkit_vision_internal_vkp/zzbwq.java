package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwq extends zzbel implements zzbft {
    private static final zzbwq zzb;
    private zzbet zzd = zzL();
    private zzbet zze = zzL();

    static {
        zzbwq zzbwqVar = new zzbwq();
        zzb = zzbwqVar;
        zzbel.zzR(zzbwq.class, zzbwqVar);
    }

    private zzbwq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zzbwk.class, "zze", zzbwn.class});
        }
        if (i3 == 3) {
            return new zzbwq();
        }
        if (i3 == 4) {
            return new zzbwp(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
