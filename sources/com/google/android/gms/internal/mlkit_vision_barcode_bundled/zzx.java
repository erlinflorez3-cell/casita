package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzx extends zzeh implements zzfn {
    private static final zzx zzb;
    private int zzd;
    private zzaa zze;

    static {
        zzx zzxVar = new zzx();
        zzb = zzxVar;
        zzeh.zzV(zzx.class, zzxVar);
    }

    private zzx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzx();
        }
        if (i3 == 4) {
            return new zzw(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
