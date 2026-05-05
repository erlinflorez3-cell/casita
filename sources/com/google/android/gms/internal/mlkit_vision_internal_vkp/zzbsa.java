package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbsa extends zzbel implements zzbft {
    private static final zzbsa zzb;
    private int zzd;
    private float zze = 10.0f;
    private float zzf = 10.0f;
    private float zzg = 5.0f;
    private float zzh = 5.0f;
    private float zzi = 10.0f;
    private float zzj = 10.0f;

    static {
        zzbsa zzbsaVar = new zzbsa();
        zzb = zzbsaVar;
        zzbel.zzR(zzbsa.class, zzbsaVar);
    }

    private zzbsa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzbsa();
        }
        zzbru zzbruVar = null;
        if (i3 == 4) {
            return new zzbrz(zzbruVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
