package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;

/* JADX INFO: loaded from: classes8.dex */
final class zzbpi implements zzbep {
    static final zzbep zza = new zzbpi();

    private zzbpi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbep
    public final boolean zza(int i2) {
        if (i2 == 200 || i2 == 300 || i2 == 302 || i2 == 312 || i2 == 15000 || i2 == 304 || i2 == 305) {
            return true;
        }
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                switch (i2) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        switch (i2) {
                            case 43:
                            case 44:
                            case 45:
                                return true;
                            default:
                                switch (i2) {
                                    case 220:
                                    case 221:
                                    case 222:
                                    case 223:
                                    case CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY /* 224 */:
                                    case JfifUtil.MARKER_APP1 /* 225 */:
                                    case 226:
                                    case 227:
                                        return true;
                                    default:
                                        switch (i2) {
                                            case 238:
                                            case 239:
                                            case 240:
                                            case 241:
                                            case 242:
                                            case 243:
                                                return true;
                                            default:
                                                switch (i2) {
                                                    case 314:
                                                    case 315:
                                                    case 316:
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
