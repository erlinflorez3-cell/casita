package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaag extends zzbel implements zzbft {
    private static final zzaag zzb;
    private int zzd;
    private zzvc zze;
    private zzaaj zzf;
    private zzut zzg;
    private zzbet zzh = zzL();

    static {
        zzaag zzaagVar = new zzaag();
        zzb = zzaagVar;
        zzbel.zzR(zzaag.class, zzaagVar);
    }

    private zzaag() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzva.class});
        }
        if (i3 == 3) {
            return new zzaag();
        }
        if (i3 == 4) {
            return new zzaaf(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
