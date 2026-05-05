package com.drew.metadata.exif.makernotes;

import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public class OlympusRawInfoMakernoteDescriptor extends TagDescriptor<OlympusRawInfoMakernoteDirectory> {
    public OlympusRawInfoMakernoteDescriptor(OlympusRawInfoMakernoteDirectory olympusRawInfoMakernoteDirectory) {
        super(olympusRawInfoMakernoteDirectory);
    }

    public String getColorMatrix2Description() {
        int[] intArray = ((OlympusRawInfoMakernoteDirectory) this._directory).getIntArray(512);
        if (intArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            sb.append((int) ((short) intArray[i2]));
            if (i2 < intArray.length - 1) {
                sb.append(Global.BLANK);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 0 ? i2 != 512 ? i2 != 1537 ? i2 != 4096 ? super.getDescription(i2) : getOlympusLightSourceDescription() : getYCbCrCoefficientsDescription() : getColorMatrix2Description() : getVersionBytesDescription(0, 4);
    }

    public String getOlympusLightSourceDescription() {
        Integer integer = ((OlympusRawInfoMakernoteDirectory) this._directory).getInteger(4096);
        if (integer == null) {
            return null;
        }
        short sShortValue = integer.shortValue();
        if (sShortValue == 0) {
            return "Unknown";
        }
        if (sShortValue == 20) {
            return "Tungsten (Incandescent)";
        }
        if (sShortValue == 22) {
            return "Evening Sunlight";
        }
        if (sShortValue == 256) {
            return "One Touch White Balance";
        }
        if (sShortValue == 512) {
            return "Custom 1-4";
        }
        switch (sShortValue) {
            case 16:
                return "Shade";
            case 17:
                return "Cloudy";
            case 18:
                return "Fine Weather";
            default:
                switch (sShortValue) {
                    case 33:
                        return "Daylight Fluorescent";
                    case 34:
                        return "Day White Fluorescent";
                    case 35:
                        return "Cool White Fluorescent";
                    case 36:
                        return "White Fluorescent";
                    default:
                        return "Unknown (" + integer + ")";
                }
        }
    }

    public String getYCbCrCoefficientsDescription() {
        int[] intArray = ((OlympusRawInfoMakernoteDirectory) this._directory).getIntArray(1537);
        if (intArray == null) {
            return null;
        }
        int length = intArray.length / 2;
        Rational[] rationalArr = new Rational[length];
        for (int i2 = 0; i2 < intArray.length / 2; i2++) {
            int i3 = i2 * 2;
            rationalArr[i2] = new Rational((short) intArray[i3], (short) intArray[i3 + 1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(rationalArr[i4].doubleValue());
            if (i4 < length - 1) {
                sb.append(Global.BLANK);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
