package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zznd extends zzbeh implements zzbft {
    private static final zznd zzd;
    private int zze;
    private byte zzg = 2;
    private boolean zzf = true;

    static {
        zznd zzndVar = new zznd();
        zzd = zzndVar;
        zzbel.zzR(zznd.class, zzndVar);
    }

    private zznd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zznd();
        }
        if (i3 == 4) {
            return new zznc(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
