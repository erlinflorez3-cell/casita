package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes9.dex */
public final class zzn extends zzeh implements zzfn {
    private static final zzn zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzeh.zzV(zzn.class, zznVar);
    }

    private zzn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", zzt.class, zzz.class, zzw.class});
        }
        if (i3 == 3) {
            return new zzn();
        }
        if (i3 == 4) {
            return new zzm(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
