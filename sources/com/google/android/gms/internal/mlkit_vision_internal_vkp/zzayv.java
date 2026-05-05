package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzayv extends zzbel implements zzbft {
    private static final zzayv zzb;
    private int zzd;
    private zzayt zze;
    private double zzf;
    private boolean zzg;
    private zzaza zzh;
    private byte zzi = 2;

    static {
        zzayv zzayvVar = new zzayv();
        zzb = zzayvVar;
        zzbel.zzR(zzayv.class, zzayvVar);
    }

    private zzayv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzayv();
        }
        if (i3 == 4) {
            return new zzayu(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
