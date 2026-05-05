package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaay extends zzbel implements zzbft {
    private static final zzaay zzb;
    private int zzd;
    private zzvc zze;
    private zzut zzf;
    private zzaaw zzg;
    private zzbet zzh = zzL();

    static {
        zzaay zzaayVar = new zzaay();
        zzb = zzaayVar;
        zzbel.zzR(zzaay.class, zzaayVar);
    }

    private zzaay() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzwp.class});
        }
        if (i3 == 3) {
            return new zzaay();
        }
        if (i3 == 4) {
            return new zzaax(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
