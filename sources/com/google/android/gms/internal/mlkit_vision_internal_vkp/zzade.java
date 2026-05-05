package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzade extends zzbel implements zzbft {
    private static final zzade zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private float zzg;
    private float zzh;
    private long zzi;
    private zzadd zzj;

    static {
        zzade zzadeVar = new zzade();
        zzb = zzadeVar;
        zzbel.zzR(zzade.class, zzadeVar);
    }

    private zzade() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဉ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzade();
        }
        zzny zznyVar = null;
        if (i3 == 4) {
            return new zzadb(zznyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
