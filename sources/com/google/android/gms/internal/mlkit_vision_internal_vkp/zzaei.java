package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaei extends zzbel implements zzbft {
    private static final zzaei zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzaei zzaeiVar = new zzaei();
        zzb = zzaeiVar;
        zzbel.zzR(zzaei.class, zzaeiVar);
    }

    private zzaei() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzaei();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzaeh(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
