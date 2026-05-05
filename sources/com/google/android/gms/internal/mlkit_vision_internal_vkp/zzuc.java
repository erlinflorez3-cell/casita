package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import cz.msebera.android.httpclient.HttpStatus;

/* JADX INFO: loaded from: classes8.dex */
final class zzuc implements zzbep {
    static final zzbep zza = new zzuc();

    private zzuc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbep
    public final boolean zza(int i2) {
        if (i2 == 500 || i2 == 501 || i2 == 9999) {
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
            case 7:
            case 8:
            case 9:
                return true;
            default:
                switch (i2) {
                    case 100:
                    case 101:
                    case 102:
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
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                        return true;
                    default:
                        switch (i2) {
                            case 201:
                            case 202:
                            case 203:
                            case 204:
                            case 205:
                            case 206:
                            case 207:
                                return true;
                            default:
                                switch (i2) {
                                    case 301:
                                    case 302:
                                    case 303:
                                    case 304:
                                    case 305:
                                        return true;
                                    default:
                                        switch (i2) {
                                            case 400:
                                            case 401:
                                            case 402:
                                            case 403:
                                            case HttpStatus.SC_NOT_FOUND /* 404 */:
                                            case HttpStatus.SC_METHOD_NOT_ALLOWED /* 405 */:
                                            case HttpStatus.SC_NOT_ACCEPTABLE /* 406 */:
                                            case HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                                                return true;
                                            default:
                                                switch (i2) {
                                                    case 600:
                                                    case 601:
                                                    case 602:
                                                    case TypedValues.MotionType.TYPE_EASING /* 603 */:
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
