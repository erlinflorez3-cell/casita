package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbnd extends zzbeh implements zzbft {
    private static final zzbnd zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        zzbnd zzbndVar = new zzbnd();
        zzd = zzbndVar;
        zzbel.zzR(zzbnd.class, zzbndVar);
    }

    private zzbnd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zze", "zzf", zzbnc.zza});
        }
        if (i3 == 3) {
            return new zzbnd();
        }
        if (i3 == 4) {
            return new zzbnb(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
