package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzvd implements zzxx {
    DECLARATION(0),
    UNVERIFIED(1);

    private static final zzxy zzc = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvb
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzvd.zzb(i2);
        }
    };
    private final int zze;

    zzvd(int i2) {
        this.zze = i2;
    }

    public static zzvd zzb(int i2) {
        if (i2 == 0) {
            return DECLARATION;
        }
        if (i2 != 1) {
            return null;
        }
        return UNVERIFIED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zze;
    }
}
