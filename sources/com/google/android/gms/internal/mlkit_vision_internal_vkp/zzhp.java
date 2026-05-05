package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhp extends zzbel implements zzbft {
    private static final zzhp zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzhp zzhpVar = new zzhp();
        zzb = zzhpVar;
        zzbel.zzR(zzhp.class, zzhpVar);
    }

    private zzhp() {
    }

    public static zzho zze() {
        return (zzho) zzb.zzB();
    }

    static /* synthetic */ void zzg(zzhp zzhpVar, int i2) {
        zzhpVar.zzd |= 1;
        zzhpVar.zze = i2;
    }

    static /* synthetic */ void zzh(zzhp zzhpVar, long j2) {
        zzhpVar.zzd |= 2;
        zzhpVar.zzf = j2;
    }

    static /* synthetic */ void zzi(zzhp zzhpVar, long j2) {
        zzhpVar.zzd = (-1) - (((-1) - zzhpVar.zzd) & ((-1) - 4));
        zzhpVar.zzg = j2;
    }

    public final int zza() {
        return this.zze;
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
            return new zzhp();
        }
        if (i3 == 4) {
            return new zzho(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzg;
    }
}
