package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzzu extends zzbel implements zzbft {
    private static final zzzu zzb;
    private int zzd;
    private zzaaa zze;
    private int zzf;

    static {
        zzzu zzzuVar = new zzzu();
        zzb = zzzuVar;
        zzbel.zzR(zzzu.class, zzzuVar);
    }

    private zzzu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzuc.zza});
        }
        if (i3 == 3) {
            return new zzzu();
        }
        if (i3 == 4) {
            return new zzzt(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
