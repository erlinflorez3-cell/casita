package com.google.android.play.core.splitinstall.testing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
abstract class zzu {
    zzu() {
    }

    abstract zzu zza(int i2);

    abstract zzu zzb(Map map);

    abstract zzv zzc();

    abstract Map zzd();

    final zzv zze() {
        zzb(Collections.unmodifiableMap(zzd()));
        return zzc();
    }
}
