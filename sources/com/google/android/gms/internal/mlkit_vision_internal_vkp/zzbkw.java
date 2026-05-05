package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbkw extends zzbel implements zzbft {
    private static final zzbkw zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbkw zzbkwVar = new zzbkw();
        zzb = zzbkwVar;
        zzbel.zzR(zzbkw.class, zzbkwVar);
    }

    private zzbkw() {
    }

    public static zzbkw zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbkw();
        }
        zzbkm zzbkmVar = null;
        if (i3 == 4) {
            return new zzbkv(zzbkmVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }
}
