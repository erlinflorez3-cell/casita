package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsp extends zzbel implements zzbft {
    private static final zzsp zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzsp zzspVar = new zzsp();
        zzb = zzspVar;
        zzbel.zzR(zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzuc.zza, "zzh"});
        }
        if (i3 == 3) {
            return new zzsp();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzso(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
