package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbyy extends zzbel implements zzbft {
    private static final zzbyy zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzbyy zzbyyVar = new zzbyy();
        zzb = zzbyyVar;
        zzbel.zzR(zzbyy.class, zzbyyVar);
    }

    private zzbyy() {
    }

    public static zzbyx zzc() {
        return (zzbyx) zzb.zzB();
    }

    public static zzbyy zzf() {
        return zzb;
    }

    static /* synthetic */ void zzl(zzbyy zzbyyVar, String str) {
        str.getClass();
        zzbyyVar.zzd = str;
    }

    static /* synthetic */ void zzm(zzbyy zzbyyVar, String str) {
        str.getClass();
        zzbyyVar.zzg = str;
    }

    static /* synthetic */ void zzn(zzbyy zzbyyVar, String str) {
        str.getClass();
        zzbyyVar.zzh = str;
    }

    static /* synthetic */ void zzo(zzbyy zzbyyVar, String str) {
        str.getClass();
        zzbyyVar.zze = str;
    }

    static /* synthetic */ void zzp(zzbyy zzbyyVar, String str) {
        str.getClass();
        zzbyyVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzbyy();
        }
        if (i3 == 4) {
            return new zzbyx(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzg() {
        return this.zzh;
    }

    public final String zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzg;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
