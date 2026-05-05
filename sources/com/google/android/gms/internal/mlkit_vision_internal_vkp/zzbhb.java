package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbhb extends zzbel implements zzbft {
    private static final zzbhb zzb;
    private long zzd;
    private int zze;

    static {
        zzbhb zzbhbVar = new zzbhb();
        zzb = zzbhbVar;
        zzbel.zzR(zzbhb.class, zzbhbVar);
    }

    private zzbhb() {
    }

    public static zzbha zze() {
        return (zzbha) zzb.zzB();
    }

    public static zzbhb zzg() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzbgd(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzbhb();
        }
        if (i3 == 4) {
            return new zzbha(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzd;
    }
}
