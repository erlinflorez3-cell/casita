package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacf extends zzbel implements zzbft {
    private static final zzacf zzb;
    private int zzd;
    private zzvc zze;
    private zzut zzf;
    private zzads zzg;
    private zzbet zzh = zzL();
    private zzbeq zzi = zzI();

    static {
        zzacf zzacfVar = new zzacf();
        zzb = zzacfVar;
        zzbel.zzR(zzacf.class, zzacfVar);
    }

    private zzacf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005$", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzado.class, "zzi"});
        }
        if (i3 == 3) {
            return new zzacf();
        }
        if (i3 == 4) {
            return new zzace(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
