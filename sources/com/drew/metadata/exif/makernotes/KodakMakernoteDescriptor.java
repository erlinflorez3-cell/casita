package com.drew.metadata.exif.makernotes;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.TagDescriptor;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public class KodakMakernoteDescriptor extends TagDescriptor<KodakMakernoteDirectory> {
    public KodakMakernoteDescriptor(KodakMakernoteDirectory kodakMakernoteDirectory) {
        super(kodakMakernoteDirectory);
    }

    public String getBurstModeDescription() {
        return getIndexedDescription(10, "Off", "On");
    }

    public String getColorModeDescription() {
        Integer integer = ((KodakMakernoteDirectory) this._directory).getInteger(102);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 32 ? iIntValue != 64 ? iIntValue != 256 ? iIntValue != 512 ? iIntValue != 8192 ? iIntValue != 16384 ? "Unknown (" + integer + ")" : "Sepia" : "B&W" : "Neutral Color" : "Saturated Color" : "Neutral Color" : "Saturated Color" : "B&W Red Filter" : "B&W Yellow Filter" : "Sepia" : "B&W";
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 9 ? i2 != 10 ? i2 != 27 ? i2 != 56 ? i2 != 64 ? i2 != 102 ? i2 != 107 ? i2 != 92 ? i2 != 93 ? super.getDescription(i2) : getFlashFiredDescription() : getFlashModeDescription() : getSharpnessDescription() : getColorModeDescription() : getWhiteBalanceDescription() : getFocusModeDescription() : getShutterModeDescription() : getBurstModeDescription() : getQualityDescription();
    }

    public String getFlashFiredDescription() {
        return getIndexedDescription(93, "No", "Yes");
    }

    public String getFlashModeDescription() {
        Integer integer = ((KodakMakernoteDirectory) this._directory).getInteger(92);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 16 ? iIntValue != 32 ? iIntValue != 64 ? "Unknown (" + integer + ")" : "Red Eye" : "Off" : "Fill Flash" : "Red Eye" : "Off" : "Fill Flash" : "Auto";
    }

    public String getFocusModeDescription() {
        return getIndexedDescription(56, ReactProgressBarViewManager.DEFAULT_STYLE, null, "Macro");
    }

    public String getQualityDescription() {
        return getIndexedDescription(9, 1, "Fine", ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    public String getSharpnessDescription() {
        return getIndexedDescription(107, ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    public String getShutterModeDescription() {
        Integer integer = ((KodakMakernoteDirectory) this._directory).getInteger(27);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 0 ? iIntValue != 8 ? iIntValue != 32 ? "Unknown (" + integer + ")" : "Manual" : "Aperture Priority" : "Auto";
    }

    public String getWhiteBalanceDescription() {
        return getIndexedDescription(64, "Auto", ExifInterface.TAG_FLASH, "Tungsten", "Daylight");
    }
}
