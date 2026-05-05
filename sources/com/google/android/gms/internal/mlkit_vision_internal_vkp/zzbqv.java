package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqv extends zzbel implements zzbft {
    private static final zzbqv zzb;
    private zzbet zzd = zzL();

    static {
        zzbqv zzbqvVar = new zzbqv();
        zzb = zzbqvVar;
        zzbel.zzR(zzbqv.class, zzbqvVar);
    }

    private zzbqv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzbqu.class});
        }
        if (i3 == 3) {
            return new zzbqv();
        }
        if (i3 == 4) {
            return new zzbqs(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
