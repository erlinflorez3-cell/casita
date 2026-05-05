package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;
import org.springframework.util.ResourceUtils;

/* JADX INFO: loaded from: classes9.dex */
final class zzau implements zzan {
    zzau() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzat.zzd(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z2) {
        return zzat.zze(classLoader, file, file2, z2, new zzap(), ResourceUtils.URL_PROTOCOL_ZIP, new zzaq());
    }
}
