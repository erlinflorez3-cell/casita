package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbso extends zzbel implements zzbft {
    private static final zzbso zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzbso zzbsoVar = new zzbso();
        zzb = zzbsoVar;
        zzbel.zzR(zzbso.class, zzbsoVar);
    }

    private zzbso() {
    }

    public static zzbsn zzc() {
        return (zzbsn) zzb.zzB();
    }

    static /* synthetic */ void zzf(zzbso zzbsoVar, int i2) {
        zzbsoVar.zzd = (-1) - (((-1) - zzbsoVar.zzd) & ((-1) - 1));
        zzbsoVar.zze = i2;
    }

    static /* synthetic */ void zzg(zzbso zzbsoVar, long j2) {
        int i2 = zzbsoVar.zzd;
        zzbsoVar.zzd = (i2 + 2) - (i2 & 2);
        zzbsoVar.zzf = j2;
    }

    static /* synthetic */ void zzh(zzbso zzbsoVar, long j2) {
        zzbsoVar.zzd = (-1) - (((-1) - zzbsoVar.zzd) & ((-1) - 4));
        zzbsoVar.zzg = j2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbso();
        }
        if (i3 == 4) {
            return new zzbsn(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
