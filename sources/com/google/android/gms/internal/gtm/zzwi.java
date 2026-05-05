package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzwi implements zzxx {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzwg
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzwi.zzb(i2);
        }
    };
    private final int zzf;

    zzwi(int i2) {
        this.zzf = i2;
    }

    public static zzwi zzb(int i2) {
        if (i2 == 0) {
            return JS_NORMAL;
        }
        if (i2 == 1) {
            return JS_STRING;
        }
        if (i2 != 2) {
            return null;
        }
        return JS_NUMBER;
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
