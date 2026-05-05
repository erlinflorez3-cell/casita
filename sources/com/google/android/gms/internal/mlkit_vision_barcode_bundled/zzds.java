package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzds {
    static final zzds zza = new zzds(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzds() {
        this.zzd = new HashMap();
    }

    zzds(boolean z2) {
        this.zzd = Collections.emptyMap();
    }

    public static zzds zza() {
        int i2 = zzfu.zza;
        return zza;
    }

    public final zzef zzb(zzfm zzfmVar, int i2) {
        return (zzef) this.zzd.get(new zzdr(zzfmVar, i2));
    }
}
