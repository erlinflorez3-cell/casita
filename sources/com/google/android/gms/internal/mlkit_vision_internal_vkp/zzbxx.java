package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxx extends zzbel implements zzbft {
    private static final zzbxx zzb;
    private Object zze;
    private int zzd = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzbxx zzbxxVar = new zzbxx();
        zzb = zzbxxVar;
        zzbel.zzR(zzbxx.class, zzbxxVar);
    }

    private zzbxx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003=\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"zze", "zzd", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbxx();
        }
        zzbxv zzbxvVar = null;
        if (i3 == 4) {
            return new zzbxw(zzbxvVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
