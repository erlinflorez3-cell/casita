package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzvr implements zzxx {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvp
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzvr.zzb(i2);
        }
    };
    private final int zzf;

    zzvr(int i2) {
        this.zzf = i2;
    }

    public static zzvr zzb(int i2) {
        if (i2 == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i2 == 1) {
            return LENGTH_PREFIXED;
        }
        if (i2 != 2) {
            return null;
        }
        return DELIMITED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzf;
    }
}
