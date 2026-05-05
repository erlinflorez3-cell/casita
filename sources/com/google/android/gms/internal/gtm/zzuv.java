package com.google.android.gms.internal.gtm;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes8.dex */
public enum zzuv implements zzxx {
    EDITION_UNKNOWN(0),
    EDITION_PROTO2(998),
    EDITION_PROTO3(999),
    EDITION_2023(1000),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(DescriptorProtos.Edition.EDITION_99997_TEST_ONLY_VALUE),
    EDITION_99998_TEST_ONLY(DescriptorProtos.Edition.EDITION_99998_TEST_ONLY_VALUE),
    EDITION_99999_TEST_ONLY(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);

    private static final zzxy zzj = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzut
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzuv.zzb(i2);
        }
    };
    private final int zzl;

    zzuv(int i2) {
        this.zzl = i2;
    }

    public static zzuv zzb(int i2) {
        if (i2 == 0) {
            return EDITION_UNKNOWN;
        }
        if (i2 == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i2 == 2) {
            return EDITION_2_TEST_ONLY;
        }
        switch (i2) {
            case 998:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case 1000:
                return EDITION_2023;
            default:
                switch (i2) {
                    case EDITION_99997_TEST_ONLY_VALUE:
                        return EDITION_99997_TEST_ONLY;
                    case EDITION_99998_TEST_ONLY_VALUE:
                        return EDITION_99998_TEST_ONLY;
                    case EDITION_99999_TEST_ONLY_VALUE:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzl);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzl;
    }
}
