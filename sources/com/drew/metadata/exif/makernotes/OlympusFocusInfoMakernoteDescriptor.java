package com.drew.metadata.exif.makernotes;

import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: loaded from: classes3.dex */
public class OlympusFocusInfoMakernoteDescriptor extends TagDescriptor<OlympusFocusInfoMakernoteDirectory> {
    public OlympusFocusInfoMakernoteDescriptor(OlympusFocusInfoMakernoteDirectory olympusFocusInfoMakernoteDirectory) {
        super(olympusFocusInfoMakernoteDirectory);
    }

    public String getAfPointDescription() {
        Integer integer = ((OlympusFocusInfoMakernoteDirectory) this._directory).getInteger(OlympusFocusInfoMakernoteDirectory.TagAfPoint);
        if (integer == null) {
            return null;
        }
        return integer.toString();
    }

    public String getAutoFocusDescription() {
        return getIndexedDescription(521, "Off", "On");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 0 ? i2 != 521 ? i2 != 773 ? i2 != 776 ? i2 != 4609 ? i2 != 5376 ? i2 != 5632 ? i2 != 4612 ? i2 != 4613 ? i2 != 4617 ? i2 != 4618 ? super.getDescription(i2) : getMacroLedDescription() : getManualFlashDescription() : getExternalFlashZoomDescription() : getExternalFlashBounceDescription() : getImageStabilizationDescription() : getSensorTemperatureDescription() : getExternalFlashDescription() : getAfPointDescription() : getFocusDistanceDescription() : getAutoFocusDescription() : getFocusInfoVersionDescription();
    }

    public String getExternalFlashBounceDescription() {
        return getIndexedDescription(OlympusFocusInfoMakernoteDirectory.TagExternalFlashBounce, "Bounce or Off", "Direct");
    }

    public String getExternalFlashDescription() {
        int[] intArray = ((OlympusFocusInfoMakernoteDirectory) this._directory).getIntArray(4609);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        String str = String.format("%d %d", Short.valueOf((short) intArray[0]), Short.valueOf((short) intArray[1]));
        return str.equals("0 0") ? "Off" : str.equals("1 0") ? "On" : "Unknown (" + str + ")";
    }

    public String getExternalFlashZoomDescription() {
        int[] intArray = ((OlympusFocusInfoMakernoteDirectory) this._directory).getIntArray(OlympusFocusInfoMakernoteDirectory.TagExternalFlashZoom);
        if (intArray == null) {
            Integer integer = ((OlympusFocusInfoMakernoteDirectory) this._directory).getInteger(OlympusFocusInfoMakernoteDirectory.TagExternalFlashZoom);
            if (integer == null) {
                return null;
            }
            intArray = new int[]{integer.intValue()};
        }
        if (intArray.length == 0) {
            return null;
        }
        String str = String.format(TimeModel.NUMBER_FORMAT, Short.valueOf((short) intArray[0]));
        if (intArray.length > 1) {
            str = str + Global.BLANK + String.format(TimeModel.NUMBER_FORMAT, Short.valueOf((short) intArray[1]));
        }
        return str.equals(AdkSettings.PLATFORM_TYPE_MOBILE) ? "Off" : str.equals("1") ? "On" : str.equals("0 0") ? "Off" : str.equals("1 0") ? "On" : "Unknown (" + str + ")";
    }

    public String getFocusDistanceDescription() {
        Rational rational = ((OlympusFocusInfoMakernoteDirectory) this._directory).getRational(773);
        return (rational == null || rational.getNumerator() == 4294967295L || rational.getNumerator() == 0) ? "inf" : (rational.getNumerator() / 1000.0d) + " m";
    }

    public String getFocusInfoVersionDescription() {
        return getVersionBytesDescription(0, 4);
    }

    public String getImageStabilizationDescription() {
        byte[] byteArray = ((OlympusFocusInfoMakernoteDirectory) this._directory).getByteArray(OlympusFocusInfoMakernoteDirectory.TagImageStabilization);
        if (byteArray == null) {
            return null;
        }
        if ((byteArray[0] | byteArray[1] | byteArray[2] | byteArray[3]) == 0) {
            return "Off";
        }
        return "On, ".concat((-1) - (((-1) - byteArray[43]) | ((-1) - 1)) > 0 ? "Mode 1" : "Mode 2");
    }

    public String getMacroLedDescription() {
        return getIndexedDescription(OlympusFocusInfoMakernoteDirectory.TagMacroLed, "Off", "On");
    }

    public String getManualFlashDescription() {
        int[] intArray = ((OlympusFocusInfoMakernoteDirectory) this._directory).getIntArray(OlympusFocusInfoMakernoteDirectory.TagManualFlash);
        if (intArray == null) {
            return null;
        }
        return ((short) intArray[0]) == 0 ? "Off" : ((short) intArray[1]) == 1 ? "Full" : "On (1/" + ((int) ((short) intArray[1])) + " strength)";
    }

    public String getSensorTemperatureDescription() {
        return ((OlympusFocusInfoMakernoteDirectory) this._directory).getString(OlympusFocusInfoMakernoteDirectory.TagSensorTemperature);
    }
}
