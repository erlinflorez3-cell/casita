package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbhc extends RuntimeException {
    public zzbhc(zzbfs zzbfsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzbew zza() {
        return new zzbew(getMessage());
    }
}
