package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzbew extends IOException {
    private boolean zza;

    public zzbew(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzbew(String str) {
        super(str);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }
}
