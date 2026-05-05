package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcv extends zzbel implements zzbft {
    private static final zzcv zzb;
    private zzbet zzd = zzL();

    static {
        zzcv zzcvVar = new zzcv();
        zzb = zzcvVar;
        zzbel.zzR(zzcv.class, zzcvVar);
    }

    private zzcv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzcu.class});
        }
        if (i3 == 3) {
            return new zzcv();
        }
        if (i3 == 4) {
            return new zzcs(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
