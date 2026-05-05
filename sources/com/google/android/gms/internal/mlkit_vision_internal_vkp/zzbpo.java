package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbpo extends zzbel implements zzbft {
    private static final zzbpo zzb;
    private byte zze = 2;
    private zzbet zzd = zzL();

    static {
        zzbpo zzbpoVar = new zzbpo();
        zzb = zzbpoVar;
        zzbel.zzR(zzbpo.class, zzbpoVar);
    }

    private zzbpo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzbpl.class});
        }
        if (i3 == 3) {
            return new zzbpo();
        }
        if (i3 == 4) {
            return new zzbpn(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
