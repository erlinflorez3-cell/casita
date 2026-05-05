package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjb extends zzbel implements zzbft {
    private static final zzjb zzb;
    private int zzd;
    private zzhm zzg;
    private zzhm zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzbhv zzm;
    private String zze = "";
    private String zzf = "";
    private int zzl = 1;

    static {
        zzjb zzjbVar = new zzjb();
        zzb = zzjbVar;
        zzbel.zzR(zzjb.class, zzjbVar);
    }

    private zzjb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004ဉ\u0002\u0006ဇ\u0004\u0007င\u0007\bဉ\b\tဉ\u0003\nဈ\u0001", new Object[]{"zzd", "zze", "zzj", "zzk", "zzg", "zzi", "zzl", "zzm", "zzh", "zzf"});
        }
        if (i3 == 3) {
            return new zzjb();
        }
        if (i3 == 4) {
            return new zzja(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
