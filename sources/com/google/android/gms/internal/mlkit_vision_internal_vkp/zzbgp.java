package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgp extends zzbgw {
    zzbgp() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbgw
    public final void zza() {
        if (!zzj()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                ((zzbdz) ((zzbgq) zzg(i2)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzbdz) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
