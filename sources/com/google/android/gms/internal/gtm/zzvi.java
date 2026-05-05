package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzvi implements zzxx {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvg
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzvi.zzb(i2);
        }
    };
    private final int zzf;

    zzvi(int i2) {
        this.zzf = i2;
    }

    public static zzvi zzb(int i2) {
        if (i2 == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return OPEN;
        }
        if (i2 != 2) {
            return null;
        }
        return CLOSED;
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
