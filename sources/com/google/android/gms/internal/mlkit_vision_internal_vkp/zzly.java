package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzly extends zzbeh implements zzbft {
    private static final zzly zzd;
    private int zze;
    private boolean zzf;
    private byte zzg = 2;

    static {
        zzly zzlyVar = new zzly();
        zzd = zzlyVar;
        zzbel.zzR(zzly.class, zzlyVar);
    }

    private zzly() {
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
            return new zzly();
        }
        if (i3 == 4) {
            return new zzlx(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
