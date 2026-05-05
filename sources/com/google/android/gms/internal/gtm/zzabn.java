package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzabn implements zzxx {
    DF_NONE(0),
    DF_HTTPHEADER(1),
    DF_COOKIE(2),
    DF_URL(3),
    DF_CGI_ARGS(4),
    DF_HOST_ORDER(5),
    DF_BYTE_SWAPPED(6),
    DF_LOGGING_ELEMENT_TYPE_ID(7);

    private static final zzxy zzi = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzabm
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            zzabn zzabnVar = zzabn.DF_NONE;
            switch (i2) {
                case 0:
                    return zzabn.DF_NONE;
                case 1:
                    return zzabn.DF_HTTPHEADER;
                case 2:
                    return zzabn.DF_COOKIE;
                case 3:
                    return zzabn.DF_URL;
                case 4:
                    return zzabn.DF_CGI_ARGS;
                case 5:
                    return zzabn.DF_HOST_ORDER;
                case 6:
                    return zzabn.DF_BYTE_SWAPPED;
                case 7:
                    return zzabn.DF_LOGGING_ELEMENT_TYPE_ID;
                default:
                    return null;
            }
        }
    };
    private final int zzk;

    zzabn(int i2) {
        this.zzk = i2;
    }

    public static zzxy zzb() {
        return zzi;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzk;
    }
}
