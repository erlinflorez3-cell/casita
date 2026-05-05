package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzwd implements zzxx {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzwb
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzwd.zzb(i2);
        }
    };
    private final int zzf;

    zzwd(int i2) {
        this.zzf = i2;
    }

    public static zzwd zzb(int i2) {
        if (i2 == 0) {
            return STRING;
        }
        if (i2 == 1) {
            return CORD;
        }
        if (i2 != 2) {
            return null;
        }
        return STRING_PIECE;
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
