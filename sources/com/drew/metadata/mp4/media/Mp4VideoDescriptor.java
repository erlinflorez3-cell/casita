package com.drew.metadata.mp4.media;

import androidx.webkit.Profile;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4VideoDescriptor extends TagDescriptor<Mp4VideoDirectory> {
    public Mp4VideoDescriptor(Mp4VideoDirectory mp4VideoDirectory) {
        super(mp4VideoDirectory);
    }

    private String getColorTableDescription() {
        Integer integer = ((Mp4VideoDirectory) this._directory).getInteger(Mp4VideoDirectory.TAG_COLOR_TABLE);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue != -1) {
            return iIntValue != 0 ? "Unknown (" + integer + ")" : "Color table within file";
        }
        Integer integer2 = ((Mp4VideoDirectory) this._directory).getInteger(Mp4VideoDirectory.TAG_DEPTH);
        return (integer2 != null && integer2.intValue() < 16) ? Profile.DEFAULT_PROFILE_NAME : "None";
    }

    private String getDepthDescription() {
        Integer integer = ((Mp4VideoDirectory) this._directory).getInteger(Mp4VideoDirectory.TAG_DEPTH);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return (iIntValue == 1 || iIntValue == 2 || iIntValue == 4 || iIntValue == 8 || iIntValue == 16 || iIntValue == 24 || iIntValue == 32) ? integer + "-bit color" : (iIntValue == 34 || iIntValue == 36 || iIntValue == 40) ? (integer.intValue() - 32) + "-bit grayscale" : "Unknown (" + integer + ")";
    }

    private String getGraphicsModeDescription() {
        Integer integer = ((Mp4VideoDirectory) this._directory).getInteger(211);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 0) {
            return "Copy";
        }
        if (iIntValue == 32) {
            return "Blend";
        }
        if (iIntValue == 36) {
            return "Transparent";
        }
        if (iIntValue == 64) {
            return "Dither copy";
        }
        switch (iIntValue) {
            case 256:
                return "Straight alpha";
            case 257:
                return "Premul white alpha";
            case 258:
                return "Premul black alpha";
            case 259:
                return "Composition (dither copy)";
            case 260:
                return "Straight alpha blend";
            default:
                return "Unknown (" + integer + ")";
        }
    }

    private String getPixelDescription(int i2) {
        String string = ((Mp4VideoDirectory) this._directory).getString(i2);
        if (string == null) {
            return null;
        }
        return string + " pixels";
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return (i2 == 204 || i2 == 205) ? getPixelDescription(i2) : i2 != 209 ? i2 != 211 ? i2 != 213 ? super.getDescription(i2) : getColorTableDescription() : getGraphicsModeDescription() : getDepthDescription();
    }
}
