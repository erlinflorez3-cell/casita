package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzvl implements zzxx {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);

    private static final zzxy zze = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvj
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzvl.zzb(i2);
        }
    };
    private final int zzg;

    zzvl(int i2) {
        this.zzg = i2;
    }

    public static zzvl zzb(int i2) {
        if (i2 == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i2 == 1) {
            return EXPLICIT;
        }
        if (i2 == 2) {
            return IMPLICIT;
        }
        if (i2 != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzg;
    }
}
