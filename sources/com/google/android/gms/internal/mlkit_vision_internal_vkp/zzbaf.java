package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbaf extends zzbel implements zzbft {
    private static final zzbaf zzb;
    private int zzd;
    private zzbad zze;
    private double zzf;
    private boolean zzg;

    static {
        zzbaf zzbafVar = new zzbaf();
        zzb = zzbafVar;
        zzbel.zzR(zzbaf.class, zzbafVar);
    }

    private zzbaf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbaf();
        }
        zzazt zzaztVar = null;
        if (i3 == 4) {
            return new zzbae(zzaztVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
