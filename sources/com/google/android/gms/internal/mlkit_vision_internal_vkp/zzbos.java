package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbos extends zzbel implements zzbft {
    private static final zzbos zzb;
    private int zzd;
    private zzbeq zze = zzI();
    private zzbeq zzf = zzI();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzbos zzbosVar = new zzbos();
        zzb = zzbosVar;
        zzbel.zzR(zzbos.class, zzbosVar);
    }

    private zzbos() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzbos();
        }
        zzboq zzboqVar = null;
        if (i3 == 4) {
            return new zzbor(zzboqVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
