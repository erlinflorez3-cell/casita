package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class zzbd implements zzan {
    zzbd() {
    }

    static void zzc(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzbb());
    }

    static boolean zzd(ClassLoader classLoader, File file, File file2, boolean z2) {
        return zzat.zze(classLoader, file, file2, z2, new zzav(), "path", new zzbc());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzc(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z2) {
        return zzd(classLoader, file, file2, z2);
    }
}
