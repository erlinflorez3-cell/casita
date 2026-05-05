package com.drew.metadata.exif.makernotes;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.TagDescriptor;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public class PentaxMakernoteDescriptor extends TagDescriptor<PentaxMakernoteDirectory> {
    public PentaxMakernoteDescriptor(PentaxMakernoteDirectory pentaxMakernoteDirectory) {
        super(pentaxMakernoteDirectory);
    }

    public String getCaptureModeDescription() {
        return getIndexedDescription(1, "Auto", "Night-scene", "Manual", null, "Multiple");
    }

    public String getColourDescription() {
        return getIndexedDescription(23, 1, ReactProgressBarViewManager.DEFAULT_STYLE, "Black & White", "Sepia");
    }

    public String getContrastDescription() {
        return getIndexedDescription(12, ReactProgressBarViewManager.DEFAULT_STYLE, "Low", "High");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == 1) {
            return getCaptureModeDescription();
        }
        if (i2 == 2) {
            return getQualityLevelDescription();
        }
        if (i2 == 3) {
            return getFocusModeDescription();
        }
        if (i2 == 4) {
            return getFlashModeDescription();
        }
        if (i2 == 7) {
            return getWhiteBalanceDescription();
        }
        if (i2 == 20) {
            return getIsoSpeedDescription();
        }
        if (i2 == 23) {
            return getColourDescription();
        }
        switch (i2) {
            case 10:
                return getDigitalZoomDescription();
            case 11:
                return getSharpnessDescription();
            case 12:
                return getContrastDescription();
            case 13:
                return getSaturationDescription();
            default:
                return super.getDescription(i2);
        }
    }

    public String getDigitalZoomDescription() {
        Float floatObject = ((PentaxMakernoteDirectory) this._directory).getFloatObject(10);
        if (floatObject == null) {
            return null;
        }
        return floatObject.floatValue() == 0.0f ? "Off" : Float.toString(floatObject.floatValue());
    }

    public String getFlashModeDescription() {
        return getIndexedDescription(4, 1, "Auto", "Flash On", null, "Flash Off", null, "Red-eye Reduction");
    }

    public String getFocusModeDescription() {
        return getIndexedDescription(3, 2, TypedValues.Custom.NAME, "Auto");
    }

    public String getIsoSpeedDescription() {
        Integer integer = ((PentaxMakernoteDirectory) this._directory).getInteger(20);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 10 ? iIntValue != 16 ? iIntValue != 100 ? iIntValue != 200 ? "Unknown (" + integer + ")" : "ISO 200" : "ISO 100" : "ISO 200" : "ISO 100";
    }

    public String getQualityLevelDescription() {
        return getIndexedDescription(2, "Good", "Better", "Best");
    }

    public String getSaturationDescription() {
        return getIndexedDescription(13, ReactProgressBarViewManager.DEFAULT_STYLE, "Low", "High");
    }

    public String getSharpnessDescription() {
        return getIndexedDescription(11, ReactProgressBarViewManager.DEFAULT_STYLE, "Soft", "Hard");
    }

    public String getWhiteBalanceDescription() {
        return getIndexedDescription(7, "Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual");
    }
}
