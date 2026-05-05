package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzil extends zzeh implements zzfn {
    private static final zzil zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzil zzilVar = new zzil();
        zzb = zzilVar;
        zzeh.zzV(zzil.class, zzilVar);
    }

    private zzil() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzil();
        }
        zzhi zzhiVar = null;
        if (i3 == 4) {
            return new zzik(zzhiVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
