package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcq extends zzbel implements zzbft {
    private static final zzbcq zzb;
    private String zzd = "";
    private zzbdd zze = zzbdd.zzb;

    static {
        zzbcq zzbcqVar = new zzbcq();
        zzb = zzbcqVar;
        zzbel.zzR(zzbcq.class, zzbcqVar);
    }

    private zzbcq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzbgd(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzbcq();
        }
        if (i3 == 4) {
            return new zzbcp(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
