package com.google.android.gms.internal.gtm;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzri extends zzqz {
    private final String zzb;
    private final List zzc;

    public zzri(String str, List list) {
        Preconditions.checkNotNull(str, "Instruction name must be a string.");
        Preconditions.checkNotNull(list);
        this.zzb = str;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    /* JADX INFO: renamed from: toString, reason: merged with bridge method [inline-methods] */
    public final String zzc() {
        return ProxyConfig.MATCH_ALL_SCHEMES + this.zzb + ": " + this.zzc.toString();
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zzc;
    }
}
