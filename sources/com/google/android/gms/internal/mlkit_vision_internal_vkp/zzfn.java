package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfn extends zzbel implements zzbft {
    private static final zzfn zzb;
    private int zzd;
    private boolean zze;
    private float zzf = 0.8f;
    private int zzg;
    private int zzh;

    static {
        zzfn zzfnVar = new zzfn();
        zzb = zzfnVar;
        zzbel.zzR(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzfn();
        }
        zzfl zzflVar = null;
        if (i3 == 4) {
            return new zzfm(zzflVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
