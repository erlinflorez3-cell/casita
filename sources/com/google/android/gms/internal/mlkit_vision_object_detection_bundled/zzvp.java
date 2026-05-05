package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: loaded from: classes8.dex */
final class zzvp extends LazyInstanceMap {
    private zzvp() {
        throw null;
    }

    /* synthetic */ zzvp(zzvo zzvoVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzuy zzuyVar = (zzuy) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzvf(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zzuz(MlKitContext.getInstance().getApplicationContext(), zzuyVar), zzuyVar.zzb());
    }
}
