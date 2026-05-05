package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzr implements zzxx {
    NO_CACHE(1),
    PRIVATE(2),
    PUBLIC(3);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzp
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzr.zzb(i2);
        }
    };
    private final int zzf;

    zzr(int i2) {
        this.zzf = i2;
    }

    public static zzr zzb(int i2) {
        if (i2 == 1) {
            return NO_CACHE;
        }
        if (i2 == 2) {
            return PRIVATE;
        }
        if (i2 != 3) {
            return null;
        }
        return PUBLIC;
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
