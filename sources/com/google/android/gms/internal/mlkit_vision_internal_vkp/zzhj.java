package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhj extends zzbel implements zzbft {
    private static final zzhj zzb;
    private int zzd;
    private Object zzf;
    private float zzg;
    private boolean zzi;
    private int zze = 0;
    private String zzh = "";

    static {
        zzhj zzhjVar = new zzhj();
        zzb = zzhjVar;
        zzbel.zzR(zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001;\u0000\u0002ခ\u0000\u0003;\u0000\u0004ဈ\u0001\u0005ဇ\u0002", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzhj();
        }
        zzhh zzhhVar = null;
        if (i3 == 4) {
            return new zzhi(zzhhVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
