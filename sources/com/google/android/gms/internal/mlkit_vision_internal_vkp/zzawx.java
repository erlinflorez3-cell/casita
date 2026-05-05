package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzawx extends zzbel implements zzbft {
    private static final zzawx zzb;
    private int zzd;
    private zzbhb zze;
    private zzbhx zzf;
    private String zzg = "";

    static {
        zzawx zzawxVar = new zzawx();
        zzb = zzawxVar;
        zzbel.zzR(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    public static zzaww zza() {
        return (zzaww) zzb.zzB();
    }

    public static zzawx zzd(byte[] bArr, zzbdv zzbdvVar) throws zzbew {
        return (zzawx) zzbel.zzH(zzb, bArr, zzbdvVar);
    }

    static /* synthetic */ void zzh(zzawx zzawxVar, zzbhb zzbhbVar) {
        zzbhbVar.getClass();
        zzawxVar.zze = zzbhbVar;
        zzawxVar.zzd |= 1;
    }

    static /* synthetic */ void zzi(zzawx zzawxVar, zzbhx zzbhxVar) {
        zzbhxVar.getClass();
        zzawxVar.zzf = zzbhxVar;
        int i2 = zzawxVar.zzd;
        zzawxVar.zzd = (i2 + 2) - (i2 & 2);
    }

    static /* synthetic */ void zzj(zzawx zzawxVar, String str) {
        zzawxVar.zzd |= 4;
        zzawxVar.zzg = str;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzawx();
        }
        if (i3 == 4) {
            return new zzaww(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbhb zze() {
        zzbhb zzbhbVar = this.zze;
        return zzbhbVar == null ? zzbhb.zzg() : zzbhbVar;
    }

    public final zzbhx zzf() {
        zzbhx zzbhxVar = this.zzf;
        return zzbhxVar == null ? zzbhx.zze() : zzbhxVar;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        int i2 = this.zzd;
        return (i2 + 1) - (i2 | 1) != 0;
    }
}
