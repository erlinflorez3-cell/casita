package com.drew.metadata.exif.makernotes;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class LeicaMakernoteDescriptor extends TagDescriptor<LeicaMakernoteDirectory> {
    public LeicaMakernoteDescriptor(LeicaMakernoteDirectory leicaMakernoteDirectory) {
        super(leicaMakernoteDirectory);
    }

    private String getApproximateFNumberDescription() {
        return getSimpleRational(LeicaMakernoteDirectory.TAG_APPROXIMATE_F_NUMBER);
    }

    private String getCameraTemperatureDescription() {
        return getFormattedInt(LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, "%d C");
    }

    private String getExternalSensorBrightnessValueDescription() {
        return getSimpleRational(785);
    }

    private String getMeasuredLvDescription() {
        return getSimpleRational(LeicaMakernoteDirectory.TAG_MEASURED_LV);
    }

    private String getQualityDescription() {
        return getIndexedDescription(768, 1, "Fine", "Basic");
    }

    private String getUserProfileDescription() {
        return getIndexedDescription(768, 1, "User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)");
    }

    private String getWhiteBalanceDescription() {
        return getIndexedDescription(772, "Auto or Manual", "Daylight", "Fluorescent", "Tungsten", ExifInterface.TAG_FLASH, "Cloudy", "Shadow");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == 768) {
            return getQualityDescription();
        }
        if (i2 == 770) {
            return getUserProfileDescription();
        }
        if (i2 == 772) {
            return getWhiteBalanceDescription();
        }
        if (i2 == 800) {
            return getCameraTemperatureDescription();
        }
        switch (i2) {
            case 785:
                return getExternalSensorBrightnessValueDescription();
            case LeicaMakernoteDirectory.TAG_MEASURED_LV /* 786 */:
                return getMeasuredLvDescription();
            case LeicaMakernoteDirectory.TAG_APPROXIMATE_F_NUMBER /* 787 */:
                return getApproximateFNumberDescription();
            default:
                switch (i2) {
                    case LeicaMakernoteDirectory.TAG_WB_RED_LEVEL /* 802 */:
                    case LeicaMakernoteDirectory.TAG_WB_GREEN_LEVEL /* 803 */:
                    case LeicaMakernoteDirectory.TAG_WB_BLUE_LEVEL /* 804 */:
                        return getSimpleRational(i2);
                    default:
                        return super.getDescription(i2);
                }
        }
    }
}
