package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzaxa extends IOException {
    private final zzags zza;

    zzaxa(zzags zzagsVar, String str) {
        super(str);
        this.zza = zzagsVar;
    }

    zzaxa(zzags zzagsVar, String str, Throwable th) {
        super(str, th);
        this.zza = zzagsVar;
    }

    final zzags zza() {
        return this.zza;
    }
}
