package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqz extends zzbeh implements zzbft {
    private static final zzbqz zzd;
    private byte zzf = 2;
    private zzbet zze = zzL();

    static {
        zzbqz zzbqzVar = new zzbqz();
        zzd = zzbqzVar;
        zzbel.zzR(zzbqz.class, zzbqzVar);
    }

    private zzbqz() {
    }

    public static zzbqz zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"zze", zzbqy.class});
        }
        if (i3 == 3) {
            return new zzbqz();
        }
        if (i3 == 4) {
            return new zzbqw(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
