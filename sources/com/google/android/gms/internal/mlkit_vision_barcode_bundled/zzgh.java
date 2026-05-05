package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgh extends zzgo {
    zzgh() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgo
    public final void zza() {
        if (!zzj()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                ((zzdw) ((zzgi) zzg(i2)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzdw) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
