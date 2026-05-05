package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzix extends zzeh implements zzfn {
    private static final zzix zzb;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        zzix zzixVar = new zzix();
        zzb = zzixVar;
        zzeh.zzV(zzix.class, zzixVar);
    }

    private zzix() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", zziv.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzix();
        }
        if (i3 == 4) {
            return new zziw(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
