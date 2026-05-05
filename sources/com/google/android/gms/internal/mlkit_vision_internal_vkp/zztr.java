package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zztr extends zzbel implements zzbft {
    private static final zztr zzb;
    private int zzd;
    private zztv zze;
    private long zzg;
    private int zzi;
    private boolean zzk;
    private String zzf = "";
    private String zzh = "";
    private zzbet zzj = zzL();

    static {
        zztr zztrVar = new zztr();
        zzb = zztrVar;
        zzbel.zzR(zztr.class, zztrVar);
    }

    private zztr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006\u001b\u0007ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zztz.class, "zzk"});
        }
        if (i3 == 3) {
            return new zztr();
        }
        if (i3 == 4) {
            return new zztq(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
