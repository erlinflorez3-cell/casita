package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbtf extends zzbel implements zzbft {
    private static final zzbtf zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";
    private String zzh = "";
    private zzbdd zzi = zzbdd.zzb;

    static {
        zzbtf zzbtfVar = new zzbtf();
        zzb = zzbtfVar;
        zzbel.zzR(zzbtf.class, zzbtfVar);
    }

    private zzbtf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003<\u0000\u0004<\u0000\u0005ည\u0002", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", zzbsz.class, zzbtt.class, "zzi"});
        }
        if (i3 == 3) {
            return new zzbtf();
        }
        if (i3 == 4) {
            return new zzbte(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
