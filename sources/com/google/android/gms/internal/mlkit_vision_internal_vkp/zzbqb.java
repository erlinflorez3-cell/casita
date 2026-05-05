package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqb extends zzbeh implements zzbft {
    private static final zzbqb zzd;
    private int zze;
    private zzbpt zzf;
    private float zzh;
    private float zzi;
    private zzbpt zzl;
    private zzbpl zzm;
    private byte zzo = 2;
    private zzbet zzg = zzL();
    private zzbet zzj = zzL();
    private zzbdd zzk = zzbdd.zzb;
    private zzbet zzn = zzL();

    static {
        zzbqb zzbqbVar = new zzbqb();
        zzd = zzbqbVar;
        zzbel.zzR(zzbqb.class, zzbqbVar);
    }

    private zzbqb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zze", "zzf", "zzg", zzbqa.class, "zzh", "zzj", zzbpw.class, "zzm", "zzn", zzbpr.class, "zzk", "zzl", "zzi"});
        }
        if (i3 == 3) {
            return new zzbqb();
        }
        if (i3 == 4) {
            return new zzbpu(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
