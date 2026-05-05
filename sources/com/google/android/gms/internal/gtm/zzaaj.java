package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaaj extends RuntimeException {
    public zzaaj(zzzg zzzgVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzyg zza() {
        return new zzyg(getMessage());
    }
}
