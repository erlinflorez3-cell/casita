package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhk extends zzeh implements zzfn {
    private static final zzhk zzb;
    private int zzd;
    private int zze;
    private zzjp zzf;
    private zzjb zzg;
    private zzjd zzh;

    static {
        zzhk zzhkVar = new zzhk();
        zzb = zzhkVar;
        zzeh.zzV(zzhk.class, zzhkVar);
    }

    private zzhk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", zzij.zza, "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzhk();
        }
        if (i3 == 4) {
            return new zzhj(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
