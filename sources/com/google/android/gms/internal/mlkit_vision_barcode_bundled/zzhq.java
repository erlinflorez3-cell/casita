package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhq extends zzeh implements zzfn {
    private static final zzhq zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhq zzhqVar = new zzhq();
        zzb = zzhqVar;
        zzeh.zzV(zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhq();
        }
        zzhi zzhiVar = null;
        if (i3 == 4) {
            return new zzhp(zzhiVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
