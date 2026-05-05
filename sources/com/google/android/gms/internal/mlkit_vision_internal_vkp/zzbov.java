package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbov extends zzbel implements zzbft {
    private static final zzbov zzb;
    private zzbet zzd = zzL();
    private zzbet zze = zzL();

    static {
        zzbov zzbovVar = new zzbov();
        zzb = zzbovVar;
        zzbel.zzR(zzbov.class, zzbovVar);
    }

    private zzbov() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zzbos.class, "zze", zzbqi.class});
        }
        if (i3 == 3) {
            return new zzbov();
        }
        if (i3 == 4) {
            return new zzbou(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
