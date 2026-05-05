package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbut extends zzbel implements zzbft {
    private static final zzbut zzb;
    private int zzd = 0;
    private Object zze;
    private int zzf;
    private float zzg;

    static {
        zzbut zzbutVar = new zzbut();
        zzb = zzbutVar;
        zzbel.zzR(zzbut.class, zzbutVar);
    }

    private zzbut() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003?\u0000\u0004Ȼ\u0000", new Object[]{"zze", "zzd", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbut();
        }
        zzbtx zzbtxVar = null;
        if (i3 == 4) {
            return new zzbus(zzbtxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
