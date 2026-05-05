package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaej {
    public static final zzaej zza = new zzaej("", "", false);
    private final String zzb;
    private final String zzc;
    private final boolean zzd;

    static {
        new zzaej("\n", "  ", true);
    }

    private zzaej(String str, String str2, boolean z2) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
