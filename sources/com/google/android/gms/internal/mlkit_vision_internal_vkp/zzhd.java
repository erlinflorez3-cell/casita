package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhd extends zzbel implements zzbft {
    private static final zzhd zzb;
    private int zzd;
    private String zze = "";
    private float zzf;

    static {
        zzhd zzhdVar = new zzhd();
        zzb = zzhdVar;
        zzbel.zzR(zzhd.class, zzhdVar);
    }

    private zzhd() {
    }

    public static zzhc zza() {
        return (zzhc) zzb.zzB();
    }

    static /* synthetic */ void zzd(zzhd zzhdVar, String str) {
        int i2 = zzhdVar.zzd;
        zzhdVar.zzd = (i2 + 1) - (i2 & 1);
        zzhdVar.zze = "/m/0bl9f";
    }

    static /* synthetic */ void zze(zzhd zzhdVar, float f2) {
        int i2 = zzhdVar.zzd;
        zzhdVar.zzd = (i2 + 2) - (i2 & 2);
        zzhdVar.zzf = 0.46f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhd();
        }
        if (i3 == 4) {
            return new zzhc(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
