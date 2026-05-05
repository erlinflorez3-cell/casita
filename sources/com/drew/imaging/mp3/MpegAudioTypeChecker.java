package com.drew.imaging.mp3;

import com.drew.imaging.FileType;
import com.drew.imaging.TypeChecker;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;

/* JADX INFO: loaded from: classes3.dex */
public class MpegAudioTypeChecker implements TypeChecker {
    @Override // com.drew.imaging.TypeChecker
    public FileType checkType(byte[] bArr) {
        if (bArr[0] == -1) {
            byte b2 = bArr[1];
            if ((b2 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (224 | b2) == 224) {
                if (((b2 >> 3) & 3) == 1) {
                    return FileType.Unknown;
                }
                int i2 = b2 >> 1;
                if ((i2 + 3) - (i2 | 3) != 0 && (bArr[2] >> 4) != 15) {
                    return FileType.Mp3;
                }
                return FileType.Unknown;
            }
        }
        return FileType.Unknown;
    }

    @Override // com.drew.imaging.TypeChecker
    public int getByteCount() {
        return 3;
    }
}
