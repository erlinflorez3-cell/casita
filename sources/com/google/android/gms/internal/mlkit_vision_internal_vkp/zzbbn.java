package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbn extends zzbel implements zzbft {
    private static final zzbbn zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private zzbbp zzj;
    private zzbav zzl;
    private zzbas zzm;
    private byte zzo = 2;
    private zzbdd zze = zzbdd.zzb;
    private String zzh = "";
    private zzbet zzi = zzL();
    private zzbet zzk = zzL();
    private zzbet zzn = zzL();

    static {
        zzbbn zzbbnVar = new zzbbn();
        zzb = zzbbnVar;
        zzbel.zzR(zzbbn.class, zzbbnVar);
    }

    private zzbbn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001ᔊ\u0000\u0002ဈ\u0003\u0003Л\u0004ဉ\u0004\u0005Л\u0006ဉ\u0005\u0007ဉ\u0006\bЛ\tင\u0001\nင\u0002", new Object[]{"zzd", "zze", "zzh", "zzi", zzbap.class, "zzj", "zzk", zzbbl.class, "zzl", "zzm", "zzn", zzbbj.class, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbbn();
        }
        if (i3 == 4) {
            return new zzbbm(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
