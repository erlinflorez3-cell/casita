package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzwu implements zzxx {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzws
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzwu.zzb(i2);
        }
    };
    private final int zzf;

    zzwu(int i2) {
        this.zzf = i2;
    }

    public static zzwu zzb(int i2) {
        if (i2 == 1) {
            return SPEED;
        }
        if (i2 == 2) {
            return CODE_SIZE;
        }
        if (i2 != 3) {
            return null;
        }
        return LITE_RUNTIME;
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
