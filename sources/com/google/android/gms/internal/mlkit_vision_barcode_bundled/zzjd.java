package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjd extends zzeh implements zzfn {
    private static final zzjd zzb;
    private int zzd;
    private zzeo zze = zzP();
    private zzjf zzf;
    private zzhm zzg;

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzeh.zzV(zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", zzjp.class, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzjd();
        }
        if (i3 == 4) {
            return new zzjc(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
