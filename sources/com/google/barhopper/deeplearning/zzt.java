package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes9.dex */
public final class zzt extends zzeh implements zzfn {
    private static final zzt zzb;

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzeh.zzV(zzt.class, zztVar);
    }

    private zzt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        zzr zzrVar = null;
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0000", null);
        }
        if (i3 == 3) {
            return new zzt();
        }
        if (i3 == 4) {
            return new zzs(zzrVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
