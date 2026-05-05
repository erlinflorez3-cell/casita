package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;

/* JADX INFO: loaded from: classes8.dex */
final class zzag implements zzel {
    static final zzel zza = new zzag();

    private zzag() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final boolean zza(int i2) {
        if (i2 == 129 || i2 == 161 || i2 == 209 || i2 == 2705 || i2 == 20753 || i2 == 20769 || i2 == 215 || i2 == 216 || i2 == 1297 || i2 == 1298) {
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
                return true;
            default:
                switch (i2) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i2) {
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case JpegTranscoderUtils.DEFAULT_JPEG_QUALITY /* 85 */:
                                return true;
                            default:
                                switch (i2) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 169:
                                        return true;
                                    default:
                                        switch (i2) {
                                            case 211:
                                            case Mp4VideoDirectory.TAG_OPCOLOR /* 212 */:
                                            case Mp4VideoDirectory.TAG_COLOR_TABLE /* 213 */:
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
