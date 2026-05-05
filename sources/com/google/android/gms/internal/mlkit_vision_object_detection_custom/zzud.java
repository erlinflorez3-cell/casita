package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: loaded from: classes8.dex */
final class zzud extends LazyInstanceMap {
    private zzud() {
        throw null;
    }

    /* synthetic */ zzud(zzuc zzucVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        zztm zztmVar = (zztm) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zztt(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zztn(MlKitContext.getInstance().getApplicationContext(), zztmVar), zztmVar.zzb());
    }
}
