package com.drew.metadata.exif.makernotes;

import com.drew.metadata.MetadataException;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class AppleRunTimeMakernoteDescriptor extends TagDescriptor<AppleRunTimeMakernoteDirectory> {
    public AppleRunTimeMakernoteDescriptor(AppleRunTimeMakernoteDirectory appleRunTimeMakernoteDirectory) {
        super(appleRunTimeMakernoteDirectory);
    }

    private String calculateTimeInSeconds() {
        try {
            return String.format("%d seconds", Long.valueOf(((AppleRunTimeMakernoteDirectory) this._directory).getLong(4) / ((AppleRunTimeMakernoteDirectory) this._directory).getLong(3)));
        } catch (MetadataException unused) {
            return null;
        }
    }

    private String flagsDescription() {
        try {
            int i2 = ((AppleRunTimeMakernoteDirectory) this._directory).getInt(1);
            StringBuilder sb = new StringBuilder();
            if ((1 & i2) == 1) {
                sb.append("Valid");
            } else {
                sb.append("Invalid");
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                sb.append(", rounded");
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                sb.append(", positive infinity");
            }
            if ((8 & i2) != 0) {
                sb.append(", negative infinity");
            }
            if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
                sb.append(", indefinite");
            }
            return sb.toString();
        } catch (MetadataException unused) {
            return null;
        }
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? i2 != 4 ? super.getDescription(i2) : calculateTimeInSeconds() : flagsDescription();
    }
}
