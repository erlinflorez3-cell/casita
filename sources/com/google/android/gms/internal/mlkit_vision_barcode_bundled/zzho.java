package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzho extends zzeh implements zzfn {
    private static final zzho zzb;
    private int zzd;
    private int zze = -1;

    static {
        zzho zzhoVar = new zzho();
        zzb = zzhoVar;
        zzeh.zzV(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzho();
        }
        zzhi zzhiVar = null;
        if (i3 == 4) {
            return new zzhn(zzhiVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
