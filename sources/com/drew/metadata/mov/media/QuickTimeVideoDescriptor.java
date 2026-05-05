package com.drew.metadata.mov.media;

import androidx.webkit.Profile;
import com.drew.metadata.mov.QuickTimeDescriptor;
import com.drew.metadata.mov.QuickTimeDirectory;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeVideoDescriptor extends QuickTimeDescriptor {
    public QuickTimeVideoDescriptor(QuickTimeVideoDirectory quickTimeVideoDirectory) {
        super(quickTimeVideoDirectory);
    }

    private String getColorTableDescription(int i2) {
        Integer integer = ((QuickTimeDirectory) this._directory).getInteger(i2);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue != -1) {
            return iIntValue != 0 ? "Unknown (" + integer + ")" : "Color table within file";
        }
        Integer integer2 = ((QuickTimeDirectory) this._directory).getInteger(9);
        return (integer2 == null || integer2.intValue() >= 16) ? "None" : Profile.DEFAULT_PROFILE_NAME;
    }

    private String getDepthDescription(int i2) {
        Integer integer = ((QuickTimeDirectory) this._directory).getInteger(i2);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return (iIntValue == 1 || iIntValue == 2 || iIntValue == 4 || iIntValue == 8 || iIntValue == 16 || iIntValue == 24 || iIntValue == 32) ? integer + "-bit color" : (iIntValue == 34 || iIntValue == 36 || iIntValue == 40) ? (integer.intValue() - 32) + "-bit grayscale" : "Unknown (" + integer + ")";
    }

    private String getGraphicsModeDescription() {
        Integer integer = ((QuickTimeDirectory) this._directory).getInteger(11);
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
        String string = ((QuickTimeDirectory) this._directory).getString(i2);
        if (string == null) {
            return null;
        }
        return string + " pixels";
    }

    @Override // com.drew.metadata.mov.QuickTimeDescriptor, com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return (i2 == 4 || i2 == 5) ? getPixelDescription(i2) : i2 != 9 ? i2 != 11 ? i2 != 13 ? super.getDescription(i2) : getColorTableDescription(i2) : getGraphicsModeDescription() : getDepthDescription(i2);
    }
}
