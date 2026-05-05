package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbka extends zzbel implements zzbft {
    private static final zzbka zzb;
    private int zzd;
    private int zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzbka zzbkaVar = new zzbka();
        zzb = zzbkaVar;
        zzbel.zzR(zzbka.class, zzbkaVar);
    }

    private zzbka() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbka();
        }
        zzbht zzbhtVar = null;
        if (i3 == 4) {
            return new zzbjz(zzbhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
