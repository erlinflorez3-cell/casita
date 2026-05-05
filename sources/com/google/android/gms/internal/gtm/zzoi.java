package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoi implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        String language;
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        Locale locale = Locale.getDefault();
        if (locale != null && (language = locale.getLanguage()) != null) {
            return new zzrk(language.toLowerCase());
        }
        return new zzrk("");
    }
}
