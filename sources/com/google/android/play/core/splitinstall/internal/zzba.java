package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;
import org.springframework.util.ResourceUtils;

/* JADX INFO: loaded from: classes9.dex */
final class zzba implements zzan {
    zzba() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z2) {
        return zzay.zzd(classLoader, file, file2, z2, ResourceUtils.URL_PROTOCOL_ZIP);
    }
}
