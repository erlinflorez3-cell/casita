package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzvx implements zzxx {
    UTF8_VALIDATION_UNKNOWN(0),
    UNVERIFIED(1),
    VERIFY(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvv
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzvx.zzb(i2);
        }
    };
    private final int zzf;

    zzvx(int i2) {
        this.zzf = i2;
    }

    public static zzvx zzb(int i2) {
        if (i2 == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i2 == 1) {
            return UNVERIFIED;
        }
        if (i2 != 2) {
            return null;
        }
        return VERIFY;
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
