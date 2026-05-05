package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes8.dex */
final class zzbms implements zzbep {
    static final zzbep zza = new zzbms();

    private zzbms() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbep
    public final boolean zza(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 901 && i2 != 902) {
            switch (i2) {
                default:
                    switch (i2) {
                        case 201:
                        case 202:
                        case 203:
                            break;
                        default:
                            return false;
                    }
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION /* 112 */:
                    return true;
            }
        }
        return true;
    }
}
