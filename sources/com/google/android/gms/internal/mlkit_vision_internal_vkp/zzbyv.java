package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbyv extends zzbel implements zzbft {
    private static final zzbyv zzb;
    private int zzd;
    private zzbyy zze;
    private zzbys zzf;
    private String zzg = "";

    static {
        zzbyv zzbyvVar = new zzbyv();
        zzb = zzbyvVar;
        zzbel.zzR(zzbyv.class, zzbyvVar);
    }

    private zzbyv() {
    }

    public static zzbyu zze() {
        return (zzbyu) zzb.zzB();
    }

    static /* synthetic */ void zzi(zzbyv zzbyvVar, zzbyy zzbyyVar) {
        zzbyyVar.getClass();
        zzbyvVar.zze = zzbyyVar;
        int i2 = zzbyvVar.zzd;
        zzbyvVar.zzd = (i2 + 1) - (i2 & 1);
    }

    static /* synthetic */ void zzj(zzbyv zzbyvVar, zzbys zzbysVar) {
        zzbysVar.getClass();
        zzbyvVar.zzf = zzbysVar;
        int i2 = zzbyvVar.zzd;
        zzbyvVar.zzd = (i2 + 2) - (i2 & 2);
    }

    static /* synthetic */ void zzk(zzbyv zzbyvVar, String str) {
        str.getClass();
        zzbyvVar.zzg = str;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbyv();
        }
        if (i3 == 4) {
            return new zzbyu(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbys zzc() {
        zzbys zzbysVar = this.zzf;
        return zzbysVar == null ? zzbys.zzg() : zzbysVar;
    }

    public final zzbyy zzg() {
        zzbyy zzbyyVar = this.zze;
        return zzbyyVar == null ? zzbyy.zzf() : zzbyyVar;
    }

    public final String zzh() {
        return this.zzg;
    }
}
