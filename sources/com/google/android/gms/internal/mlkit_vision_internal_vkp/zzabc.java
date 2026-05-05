package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabc extends zzbel implements zzbft {
    private static final zzabc zzb;
    private int zzd;
    private zzvc zze;
    private zzut zzf;
    private zzabi zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzabc zzabcVar = new zzabc();
        zzb = zzabcVar;
        zzbel.zzR(zzabc.class, zzabcVar);
    }

    private zzabc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzabc();
        }
        if (i3 == 4) {
            return new zzabb(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
