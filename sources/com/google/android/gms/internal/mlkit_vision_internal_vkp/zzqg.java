package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqg extends zzbel implements zzbft {
    private static final zzqg zzb;
    private int zzd;
    private zzqf zze;
    private int zzf;
    private zzub zzg;

    static {
        zzqg zzqgVar = new zzqg();
        zzb = zzqgVar;
        zzbel.zzR(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzqg();
        }
        if (i3 == 4) {
            return new zzqd(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
