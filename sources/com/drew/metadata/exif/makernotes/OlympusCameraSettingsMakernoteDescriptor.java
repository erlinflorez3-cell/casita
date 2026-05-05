package com.drew.metadata.exif.makernotes;

import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.mlkit.vision.objects.defaults.PredefinedCategory;
import java.text.DecimalFormat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class OlympusCameraSettingsMakernoteDescriptor extends TagDescriptor<OlympusCameraSettingsMakernoteDirectory> {
    private static final HashMap<Integer, String> _filters;
    private static final HashMap<Integer, String> _toneLevelType;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _toneLevelType = map;
        HashMap<Integer, String> map2 = new HashMap<>();
        _filters = map2;
        map2.put(0, "Off");
        map2.put(1, "Soft Focus");
        map2.put(2, "Pop Art");
        map2.put(3, "Pale & Light Color");
        map2.put(4, "Light Tone");
        map2.put(5, "Pin Hole");
        map2.put(6, "Grainy Film");
        map2.put(9, "Diorama");
        map2.put(10, "Cross Process");
        map2.put(12, "Fish Eye");
        map2.put(13, "Drawing");
        map2.put(14, "Gentle Sepia");
        map2.put(15, "Pale & Light Color II");
        map2.put(16, "Pop Art II");
        map2.put(17, "Pin Hole II");
        map2.put(18, "Pin Hole III");
        map2.put(19, "Grainy Film II");
        map2.put(20, "Dramatic Tone");
        map2.put(21, "Punk");
        map2.put(22, "Soft Focus 2");
        map2.put(23, "Sparkle");
        map2.put(24, "Watercolor");
        map2.put(25, "Key Line");
        map2.put(26, "Key Line II");
        map2.put(27, "Miniature");
        map2.put(28, "Reflection");
        map2.put(29, "Fragmented");
        map2.put(31, "Cross Process II");
        map2.put(32, "Dramatic Tone II");
        map2.put(33, "Watercolor I");
        map2.put(34, "Watercolor II");
        map2.put(35, "Diorama II");
        map2.put(36, "Vintage");
        map2.put(37, "Vintage II");
        map2.put(38, "Vintage III");
        map2.put(39, "Partial Color");
        map2.put(40, "Partial Color II");
        map2.put(41, "Partial Color III");
        map.put(0, AdkSettings.PLATFORM_TYPE_MOBILE);
        map.put(-31999, "Highlights ");
        map.put(-31998, "Shadows ");
        map.put(-31997, "Midtones ");
    }

    public OlympusCameraSettingsMakernoteDescriptor(OlympusCameraSettingsMakernoteDirectory olympusCameraSettingsMakernoteDirectory) {
        super(olympusCameraSettingsMakernoteDirectory);
    }

    private String getFiltersDescription(int i2) {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(i2);
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < intArray.length; i3++) {
            if (i3 == 0) {
                HashMap<Integer, String> map = _filters;
                sb.append(map.containsKey(Integer.valueOf(intArray[i3])) ? map.get(Integer.valueOf(intArray[i3])) : "[unknown]");
            } else {
                sb.append(intArray[i3]);
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    private String getValueMinMaxDescription(int i2) {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(i2);
        if (intArray == null || intArray.length < 3) {
            return null;
        }
        return String.format("%d (min %d, max %d)", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]), Integer.valueOf(intArray[2]));
    }

    public String getAeLockDescription() {
        return getIndexedDescription(513, "Off", "On");
    }

    public String getAfAreasDescription() {
        Object object = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getObject(772);
        if (object == null || !(object instanceof long[])) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (long j2 : (long[]) object) {
            if (j2 != 0) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                if (j2 == 913916549) {
                    sb.append("Left ");
                } else if (j2 == 2038007173) {
                    sb.append("Center ");
                } else if (j2 == 3178875269L) {
                    sb.append("Right ");
                }
                sb.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", Long.valueOf((-1) - (((-1) - (j2 >> 24)) | ((-1) - 255))), Long.valueOf((j2 >> 16) & 255), Long.valueOf((-1) - (((-1) - (j2 >> 8)) | ((-1) - 255))), Long.valueOf((j2 + 255) - (j2 | 255))));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public String getAfFineTuneDescription() {
        return getIndexedDescription(774, "Off", "On");
    }

    public String getAfPointSelectedDescription() {
        Rational[] rationalArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getRationalArray(773);
        if (rationalArray == null) {
            return "n/a";
        }
        if (rationalArray.length < 4) {
            return null;
        }
        int i2 = 0;
        if (rationalArray.length == 5 && rationalArray[0].longValue() == 0) {
            i2 = 1;
        }
        int iDoubleValue = (int) (rationalArray[i2].doubleValue() * 100.0d);
        int iDoubleValue2 = (int) (rationalArray[i2 + 1].doubleValue() * 100.0d);
        int iDoubleValue3 = (int) (rationalArray[i2 + 2].doubleValue() * 100.0d);
        int iDoubleValue4 = (int) (rationalArray[i2 + 3].doubleValue() * 100.0d);
        return ((iDoubleValue + iDoubleValue2) + iDoubleValue3) + iDoubleValue4 == 0 ? "n/a" : String.format("(%d%%,%d%%) (%d%%,%d%%)", Integer.valueOf(iDoubleValue), Integer.valueOf(iDoubleValue2), Integer.valueOf(iDoubleValue3), Integer.valueOf(iDoubleValue4));
    }

    public String getAfSearchDescription() {
        return getIndexedDescription(771, "Not Ready", "Ready");
    }

    public String getArtFilterDescription() {
        return getFiltersDescription(OlympusCameraSettingsMakernoteDirectory.TagArtFilter);
    }

    public String getArtFilterEffectDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagArtFilterEffect);
        if (intArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            if (i2 == 0) {
                HashMap<Integer, String> map = _filters;
                sb.append(map.containsKey(Integer.valueOf(intArray[i2])) ? map.get(Integer.valueOf(intArray[i2])) : "[unknown]").append("; ");
            } else if (i2 == 3) {
                sb.append("Partial Color ").append(intArray[i2]).append("; ");
            } else if (i2 == 4) {
                switch (intArray[i2]) {
                    case 0:
                        sb.append("No Effect");
                        break;
                    case PanasonicMakernoteDirectory.TAG_BABY_AGE_1 /* 32784 */:
                        sb.append("Star Light");
                        break;
                    case 32800:
                        sb.append("Pin Hole");
                        break;
                    case 32816:
                        sb.append("Frame");
                        break;
                    case 32832:
                        sb.append("Soft Focus");
                        break;
                    case 32848:
                        sb.append("White Edge");
                        break;
                    case 32864:
                        sb.append("B&W");
                        break;
                    default:
                        sb.append("Unknown (").append(intArray[i2]).append(")");
                        break;
                }
                sb.append("; ");
            } else if (i2 == 6) {
                int i3 = intArray[i2];
                if (i3 == 0) {
                    sb.append("No Color Filter");
                } else if (i3 == 1) {
                    sb.append("Yellow Color Filter");
                } else if (i3 == 2) {
                    sb.append("Orange Color Filter");
                } else if (i3 == 3) {
                    sb.append("Red Color Filter");
                } else if (i3 != 4) {
                    sb.append("Unknown (").append(intArray[i2]).append(")");
                } else {
                    sb.append("Green Color Filter");
                }
                sb.append("; ");
            } else {
                sb.append(intArray[i2]).append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getCameraSettingsVersionDescription() {
        return getVersionBytesDescription(0, 4);
    }

    public String getColorCreatorEffectDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagColorCreatorEffect);
        if (intArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            if (i2 == 0) {
                sb.append("Color ").append(intArray[i2]).append("; ");
            } else if (i2 == 3) {
                sb.append("Strength ").append(intArray[i2]).append("; ");
            } else {
                sb.append(intArray[i2]).append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getColorSpaceDescription() {
        return getIndexedDescription(1287, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    public String getContrastSettingDescription() {
        return getValueMinMaxDescription(1285);
    }

    public String getCustomSaturationDescription() {
        return getValueMinMaxDescription(1283);
    }

    public String getDateTimeUTCDescription() {
        Object object = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getObject(OlympusCameraSettingsMakernoteDirectory.TagDateTimeUtc);
        if (object == null) {
            return null;
        }
        return object.toString();
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 != 0) {
            if (i2 == 1280) {
                return getWhiteBalance2Description();
            }
            if (i2 == 1281) {
                return getWhiteBalanceTemperatureDescription();
            }
            if (i2 == 1312) {
                return getPictureModeDescription();
            }
            if (i2 == 1313) {
                return getPictureModeSaturationDescription();
            }
            if (i2 == 1536) {
                return getDriveModeDescription();
            }
            if (i2 == 1537) {
                return getPanoramaModeDescription();
            }
            switch (i2) {
                case 0:
                    break;
                case 256:
                    return getPreviewImageValidDescription();
                case 768:
                    return getMacroModeDescription();
                case 769:
                    return getFocusModeDescription();
                case 770:
                    return getFocusProcessDescription();
                case 771:
                    return getAfSearchDescription();
                case 772:
                    return getAfAreasDescription();
                case 773:
                    return getAfPointSelectedDescription();
                case 774:
                    return getAfFineTuneDescription();
                case 1024:
                    return getFlashModeDescription();
                case 1295:
                    return getGradationDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagArtFilter /* 1321 */:
                    return getArtFilterDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagColorCreatorEffect /* 1330 */:
                    return getColorCreatorEffectDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagImageQuality2 /* 1539 */:
                    return getImageQuality2Description();
                case OlympusCameraSettingsMakernoteDirectory.TagImageStabilization /* 1540 */:
                    return getImageStabilizationDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagStackedImage /* 2052 */:
                    return getStackedImageDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagManometerPressure /* 2304 */:
                    return getManometerPressureDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagManometerReading /* 2305 */:
                    return getManometerReadingDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagExtendedWBDetect /* 2306 */:
                    return getExtendedWBDetectDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagRollAngle /* 2307 */:
                    return getRollAngleDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagPitchAngle /* 2308 */:
                    return getPitchAngleDescription();
                case OlympusCameraSettingsMakernoteDirectory.TagDateTimeUtc /* 2312 */:
                    return getDateTimeUTCDescription();
                default:
                    switch (i2) {
                        case 512:
                            return getExposureModeDescription();
                        case 513:
                            return getAeLockDescription();
                        case 514:
                            return getMeteringModeDescription();
                        case 515:
                            return getExposureShiftDescription();
                        case 516:
                            return getNdFilterDescription();
                        default:
                            switch (i2) {
                                case 1027:
                                    return getFlashRemoteControlDescription();
                                case 1028:
                                    return getFlashControlModeDescription();
                                case 1029:
                                    return getFlashIntensityDescription();
                                case 1030:
                                    return getManualFlashStrengthDescription();
                                default:
                                    switch (i2) {
                                        case 1283:
                                            return getCustomSaturationDescription();
                                        case 1284:
                                            return getModifiedSaturationDescription();
                                        case 1285:
                                            return getContrastSettingDescription();
                                        case 1286:
                                            return getSharpnessSettingDescription();
                                        case 1287:
                                            return getColorSpaceDescription();
                                        default:
                                            switch (i2) {
                                                case 1289:
                                                    return getSceneModeDescription();
                                                case 1290:
                                                    return getNoiseReductionDescription();
                                                case 1291:
                                                    return getDistortionCorrectionDescription();
                                                case 1292:
                                                    return getShadingCompensationDescription();
                                                default:
                                                    switch (i2) {
                                                        case OlympusCameraSettingsMakernoteDirectory.TagPictureModeContrast /* 1315 */:
                                                            return getPictureModeContrastDescription();
                                                        case OlympusCameraSettingsMakernoteDirectory.TagPictureModeSharpness /* 1316 */:
                                                            return getPictureModeSharpnessDescription();
                                                        case OlympusCameraSettingsMakernoteDirectory.TagPictureModeBWFilter /* 1317 */:
                                                            return getPictureModeBWFilterDescription();
                                                        case OlympusCameraSettingsMakernoteDirectory.TagPictureModeTone /* 1318 */:
                                                            return getPictureModeToneDescription();
                                                        case OlympusCameraSettingsMakernoteDirectory.TagNoiseFilter /* 1319 */:
                                                            return getNoiseFilterDescription();
                                                        default:
                                                            switch (i2) {
                                                                case OlympusCameraSettingsMakernoteDirectory.TagMagicFilter /* 1324 */:
                                                                    return getMagicFilterDescription();
                                                                case OlympusCameraSettingsMakernoteDirectory.TagPictureModeEffect /* 1325 */:
                                                                    return getPictureModeEffectDescription();
                                                                case OlympusCameraSettingsMakernoteDirectory.TagToneLevel /* 1326 */:
                                                                    return getToneLevelDescription();
                                                                case OlympusCameraSettingsMakernoteDirectory.TagArtFilterEffect /* 1327 */:
                                                                    return getArtFilterEffectDescription();
                                                                default:
                                                                    return super.getDescription(i2);
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return getCameraSettingsVersionDescription();
    }

    public String getDistortionCorrectionDescription() {
        return getIndexedDescription(1291, "Off", "On");
    }

    public String getDriveModeDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(1536);
        if (intArray == null) {
            return null;
        }
        if (intArray.length == 0 || intArray[0] == 0) {
            return "Single Shot";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = intArray[0];
        if (i2 == 5 && intArray.length >= 3) {
            int i3 = intArray[2];
            if ((i3 + 1) - (1 | i3) > 0) {
                sb.append("AE");
            }
            if (((i3 >> 1) & 1) > 0) {
                sb.append("WB");
            }
            int i4 = i3 >> 2;
            if ((i4 + 1) - (i4 | 1) > 0) {
                sb.append("FL");
            }
            if ((-1) - (((-1) - (i3 >> 3)) | ((-1) - 1)) > 0) {
                sb.append("MF");
            }
            if (((i3 >> 6) & 1) > 0) {
                sb.append("Focus");
            }
            sb.append(" Bracketing");
        } else if (i2 == 1) {
            sb.append("Continuous Shooting");
        } else if (i2 == 2) {
            sb.append("Exposure Bracketing");
        } else if (i2 == 3) {
            sb.append("White Balance Bracketing");
        } else if (i2 != 4) {
            sb.append("Unknown (").append(intArray[0]).append(")");
        } else {
            sb.append("Exposure+WB Bracketing");
        }
        sb.append(", Shot ").append(intArray[1]);
        return sb.toString();
    }

    public String getExposureModeDescription() {
        return getIndexedDescription(512, 1, "Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift");
    }

    public String getExposureShiftDescription() {
        return getRationalOrDoubleString(515);
    }

    public String getExtendedWBDetectDescription() {
        return getIndexedDescription(OlympusCameraSettingsMakernoteDirectory.TagExtendedWBDetect, "Off", "On");
    }

    public String getFlashControlModeDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(1028);
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = intArray[0];
        if (i2 == 0) {
            sb.append("Off");
        } else if (i2 == 3) {
            sb.append("TTL");
        } else if (i2 == 4) {
            sb.append("Auto");
        } else if (i2 != 5) {
            sb.append("Unknown (").append(intArray[0]).append(")");
        } else {
            sb.append("Manual");
        }
        for (int i3 = 1; i3 < intArray.length; i3++) {
            sb.append("; ").append(intArray[i3]);
        }
        return sb.toString();
    }

    public String getFlashIntensityDescription() {
        Rational[] rationalArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getRationalArray(1029);
        if (rationalArray == null || rationalArray.length == 0) {
            return null;
        }
        if (rationalArray.length == 3) {
            if (rationalArray[0].getDenominator() == 0 && rationalArray[1].getDenominator() == 0 && rationalArray[2].getDenominator() == 0) {
                return "n/a";
            }
        } else if (rationalArray.length == 4 && rationalArray[0].getDenominator() == 0 && rationalArray[1].getDenominator() == 0 && rationalArray[2].getDenominator() == 0 && rationalArray[3].getDenominator() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (Rational rational : rationalArray) {
            sb.append(rational).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getFlashModeDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1024);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() == 0) {
            return "Off";
        }
        StringBuilder sb = new StringBuilder();
        int iIntValue = integer.intValue();
        if ((1 & iIntValue) != 0) {
            sb.append("On, ");
        }
        if ((-1) - (((-1) - (iIntValue >> 1)) | ((-1) - 1)) != 0) {
            sb.append("Fill-in, ");
        }
        if (((iIntValue >> 2) & 1) != 0) {
            sb.append("Red-eye, ");
        }
        int i2 = iIntValue >> 3;
        if ((i2 + 1) - (i2 | 1) != 0) {
            sb.append("Slow-sync, ");
        }
        if (((iIntValue >> 4) & 1) != 0) {
            sb.append("Forced On, ");
        }
        if ((-1) - (((-1) - (iIntValue >> 5)) | ((-1) - 1)) != 0) {
            sb.append("2nd Curtain, ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getFlashRemoteControlDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1027);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 0) {
            return "Off";
        }
        if (iIntValue == 1) {
            return "Channel 1, Low";
        }
        if (iIntValue == 2) {
            return "Channel 2, Low";
        }
        if (iIntValue == 3) {
            return "Channel 3, Low";
        }
        if (iIntValue == 4) {
            return "Channel 4, Low";
        }
        switch (iIntValue) {
            case 9:
                return "Channel 1, Mid";
            case 10:
                return "Channel 2, Mid";
            case 11:
                return "Channel 3, Mid";
            case 12:
                return "Channel 4, Mid";
            default:
                switch (iIntValue) {
                    case 17:
                        return "Channel 1, High";
                    case 18:
                        return "Channel 2, High";
                    case 19:
                        return "Channel 3, High";
                    case 20:
                        return "Channel 4, High";
                    default:
                        return "Unknown (" + integer + ")";
                }
        }
    }

    public String getFocusModeDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(769);
        if (intArray == null) {
            Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(769);
            if (integer == null) {
                return null;
            }
            intArray = new int[]{integer.intValue()};
        }
        if (intArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = intArray[0];
        if (i2 == 0) {
            sb.append("Single AF");
        } else if (i2 == 1) {
            sb.append("Sequential shooting AF");
        } else if (i2 == 2) {
            sb.append("Continuous AF");
        } else if (i2 == 3) {
            sb.append("Multi AF");
        } else if (i2 == 4) {
            sb.append("Face detect");
        } else if (i2 != 10) {
            sb.append("Unknown (" + intArray[0] + ")");
        } else {
            sb.append("MF");
        }
        if (intArray.length > 1) {
            sb.append("; ");
            int i3 = intArray[1];
            if (i3 == 0) {
                sb.append("(none)");
            } else {
                if ((i3 + 1) - (1 | i3) > 0) {
                    sb.append("S-AF, ");
                }
                int i4 = i3 >> 2;
                if ((i4 + 1) - (i4 | 1) > 0) {
                    sb.append("C-AF, ");
                }
                if ((-1) - (((-1) - (i3 >> 4)) | ((-1) - 1)) > 0) {
                    sb.append("MF, ");
                }
                int i5 = i3 >> 5;
                if ((i5 + 1) - (i5 | 1) > 0) {
                    sb.append("Face detect, ");
                }
                if (((i3 >> 6) & 1) > 0) {
                    sb.append("Imager AF, ");
                }
                if ((-1) - (((-1) - (i3 >> 7)) | ((-1) - 1)) > 0) {
                    sb.append("Live View Magnification Frame, ");
                }
                int i6 = i3 >> 8;
                if ((i6 + 1) - (i6 | 1) > 0) {
                    sb.append("AF sensor, ");
                }
                sb.setLength(sb.length() - 2);
            }
        }
        return sb.toString();
    }

    public String getFocusProcessDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(770);
        if (intArray == null) {
            Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(770);
            if (integer == null) {
                return null;
            }
            intArray = new int[]{integer.intValue()};
        }
        if (intArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = intArray[0];
        if (i2 == 0) {
            sb.append("AF not used");
        } else if (i2 != 1) {
            sb.append("Unknown (" + intArray[0] + ")");
        } else {
            sb.append("AF used");
        }
        if (intArray.length > 1) {
            sb.append("; " + intArray[1]);
        }
        return sb.toString();
    }

    public String getGradationDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(1295);
        if (intArray == null || intArray.length < 3) {
            return null;
        }
        String str = String.format("%d %d %d", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]), Integer.valueOf(intArray[2]));
        String str2 = str.equals("0 0 0") ? "n/a" : str.equals("-1 -1 1") ? "Low Key" : str.equals("0 -1 1") ? ReactProgressBarViewManager.DEFAULT_STYLE : str.equals("1 -1 1") ? "High Key" : "Unknown (" + str + ")";
        if (intArray.length <= 3) {
            return str2;
        }
        int i2 = intArray[3];
        return i2 == 0 ? str2 + "; User-Selected" : i2 == 1 ? str2 + "; Auto-Override" : str2;
    }

    public String getImageQuality2Description() {
        return getIndexedDescription(OlympusCameraSettingsMakernoteDirectory.TagImageQuality2, 1, "SQ", "HQ", "SHQ", "RAW", "SQ (5)");
    }

    public String getImageStabilizationDescription() {
        return getIndexedDescription(OlympusCameraSettingsMakernoteDirectory.TagImageStabilization, "Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4");
    }

    public String getMacroModeDescription() {
        return getIndexedDescription(768, "Off", "On", "Super Macro");
    }

    public String getMagicFilterDescription() {
        return getFiltersDescription(OlympusCameraSettingsMakernoteDirectory.TagMagicFilter);
    }

    public String getManometerPressureDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(OlympusCameraSettingsMakernoteDirectory.TagManometerPressure);
        if (integer == null) {
            return null;
        }
        return String.format("%s kPa", new DecimalFormat("#.##").format(((double) integer.intValue()) / 10.0d));
    }

    public String getManometerReadingDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagManometerReading);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s m, %s ft", decimalFormat.format(((double) intArray[0]) / 10.0d), decimalFormat.format(((double) intArray[1]) / 10.0d));
    }

    public String getManualFlashStrengthDescription() {
        Rational[] rationalArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getRationalArray(1030);
        if (rationalArray == null || rationalArray.length == 0) {
            return "n/a";
        }
        if (rationalArray.length == 3) {
            if (rationalArray[0].getDenominator() == 0 && rationalArray[1].getDenominator() == 0 && rationalArray[2].getDenominator() == 0) {
                return "n/a";
            }
        } else if (rationalArray.length == 4 && rationalArray[0].getDenominator() == 0 && rationalArray[1].getDenominator() == 0 && rationalArray[2].getDenominator() == 0 && rationalArray[3].getDenominator() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (Rational rational : rationalArray) {
            sb.append(rational).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getMeteringModeDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(514);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 2 ? iIntValue != 3 ? iIntValue != 5 ? iIntValue != 261 ? iIntValue != 515 ? iIntValue != 1027 ? "Unknown (" + integer + ")" : "Spot+Shadow control" : "Spot+Highlight control" : "Pattern+AF" : "ESP" : "Spot" : "Center-weighted average";
    }

    public String getModifiedSaturationDescription() {
        return getIndexedDescription(1284, "Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)");
    }

    public String getNdFilterDescription() {
        return getIndexedDescription(516, "Off", "On");
    }

    public String getNoiseFilterDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagNoiseFilter);
        if (intArray == null) {
            return null;
        }
        String str = String.format("%d %d %d", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]), Integer.valueOf(intArray[2]));
        return str.equals("0 0 0") ? "n/a" : str.equals("-2 -2 1") ? "Off" : str.equals("-1 -2 1") ? "Low" : str.equals("0 -2 1") ? "Standard" : str.equals("1 -2 1") ? "High" : "Unknown (" + str + ")";
    }

    public String getNoiseReductionDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1290);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int iIntValue = integer.intValue();
        if ((1 & iIntValue) != 0) {
            sb.append("Noise Reduction, ");
        }
        if ((-1) - (((-1) - (iIntValue >> 1)) | ((-1) - 1)) != 0) {
            sb.append("Noise Filter, ");
        }
        int i2 = iIntValue >> 2;
        if ((i2 + 1) - (i2 | 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        int i3 = iIntValue >> 3;
        if ((i3 + 1) - (i3 | 1) != 0) {
            sb.append("Auto, ");
        }
        return sb.length() != 0 ? sb.substring(0, sb.length() - 2) : "(none)";
    }

    public String getPanoramaModeDescription() {
        int i2;
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(1537);
        if (intArray == null) {
            return null;
        }
        if (intArray.length == 0 || (i2 = intArray[0]) == 0) {
            return "Off";
        }
        return String.format("%s, Shot %d", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown (" + intArray[0] + ")" : "Top to Bottom" : "Bottom to Top" : "Right to Left" : "Left to Right", Integer.valueOf(intArray[1]));
    }

    public String getPictureModeBWFilterDescription() {
        return getIndexedDescription(OlympusCameraSettingsMakernoteDirectory.TagPictureModeBWFilter, "n/a", "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    public String getPictureModeContrastDescription() {
        return getValueMinMaxDescription(OlympusCameraSettingsMakernoteDirectory.TagPictureModeContrast);
    }

    public String getPictureModeDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(1312);
        if (intArray == null) {
            Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1290);
            if (integer == null) {
                return null;
            }
            intArray = new int[]{integer.intValue()};
        }
        if (intArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = intArray[0];
        if (i2 == 1) {
            sb.append("Vivid");
        } else if (i2 == 2) {
            sb.append("Natural");
        } else if (i2 == 3) {
            sb.append("Muted");
        } else if (i2 == 4) {
            sb.append("Portrait");
        } else if (i2 == 5) {
            sb.append("i-Enhance");
        } else if (i2 == 256) {
            sb.append("Monotone");
        } else if (i2 != 512) {
            sb.append("Unknown (").append(intArray[0]).append(")");
        } else {
            sb.append("Sepia");
        }
        if (intArray.length > 1) {
            sb.append("; ").append(intArray[1]);
        }
        return sb.toString();
    }

    public String getPictureModeEffectDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagPictureModeEffect);
        if (intArray == null) {
            return null;
        }
        String str = String.format("%d %d %d", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]), Integer.valueOf(intArray[2]));
        return str.equals("0 0 0") ? "n/a" : str.equals("-1 -1 1") ? "Low" : str.equals("0 -1 1") ? "Standard" : str.equals("1 -1 1") ? "High" : "Unknown (" + str + ")";
    }

    public String getPictureModeSaturationDescription() {
        return getValueMinMaxDescription(OlympusCameraSettingsMakernoteDirectory.TagPictureModeSaturation);
    }

    public String getPictureModeSharpnessDescription() {
        return getValueMinMaxDescription(OlympusCameraSettingsMakernoteDirectory.TagPictureModeSharpness);
    }

    public String getPictureModeToneDescription() {
        return getIndexedDescription(OlympusCameraSettingsMakernoteDirectory.TagPictureModeTone, "n/a", "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    public String getPitchAngleDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagPitchAngle);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        int i2 = intArray[0];
        return String.format("%s %d", i2 != 0 ? Double.toString(((double) i2) / 10.0d) : "n/a", Integer.valueOf(intArray[1]));
    }

    public String getPreviewImageValidDescription() {
        return getIndexedDescription(256, "No", "Yes");
    }

    public String getRollAngleDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagRollAngle);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        int i2 = intArray[0];
        return String.format("%s %d", i2 != 0 ? Double.toString(((double) (-i2)) / 10.0d) : "n/a", Integer.valueOf(intArray[1]));
    }

    public String getSceneModeDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1289);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 0) {
            return "Standard";
        }
        if (iIntValue == 54) {
            return "Face Portrait";
        }
        if (iIntValue == 57) {
            return "Bulb";
        }
        if (iIntValue == 142) {
            return "Hand-held Starlight";
        }
        if (iIntValue == 154) {
            return "HDR";
        }
        if (iIntValue == 59) {
            return "Smile Shot";
        }
        if (iIntValue == 60) {
            return "Quick Shutter";
        }
        switch (iIntValue) {
            case 6:
                return "Auto";
            case 7:
                return "Sport";
            case 8:
                return "Portrait";
            case 9:
                return "Landscape+Portrait";
            case 10:
                return "Landscape";
            case 11:
                return "Night Scene";
            case 12:
                return "Self Portrait";
            case 13:
                return "Panorama";
            case 14:
                return "2 in 1";
            case 15:
                return "Movie";
            case 16:
                return "Landscape+Portrait";
            case 17:
                return "Night+Portrait";
            case 18:
                return "Indoor";
            case 19:
                return "Fireworks";
            case 20:
                return "Sunset";
            case 21:
                return "Beauty Skin";
            case 22:
                return "Macro";
            case 23:
                return "Super Macro";
            case 24:
                return PredefinedCategory.FOOD;
            case 25:
                return "Documents";
            case 26:
                return "Museum";
            case 27:
                return "Shoot & Select";
            case 28:
                return "Beach & Snow";
            case 29:
                return "Self Portrait+Timer";
            case 30:
                return "Candle";
            case 31:
                return "Available Light";
            case 32:
                return "Behind Glass";
            case 33:
                return "My Mode";
            case 34:
                return "Pet";
            case 35:
                return "Underwater Wide1";
            case 36:
                return "Underwater Macro";
            case 37:
                return "Shoot & Select1";
            case 38:
                return "Shoot & Select2";
            case 39:
                return "High Key";
            case 40:
                return "Digital Image Stabilization";
            case 41:
                return "Auction";
            case 42:
                return "Beach";
            case 43:
                return "Snow";
            case 44:
                return "Underwater Wide2";
            case 45:
                return "Low Key";
            case 46:
                return "Children";
            case 47:
                return "Vivid";
            case 48:
                return "Nature Macro";
            case 49:
                return "Underwater Snapshot";
            case 50:
                return "Shooting Guide";
            default:
                switch (iIntValue) {
                    case 63:
                        return "Slow Shutter";
                    case 64:
                        return "Bird Watching";
                    case 65:
                        return "Multiple Exposure";
                    case 66:
                        return "e-Portrait";
                    case 67:
                        return "Soft Background Shot";
                    default:
                        return "Unknown (" + integer + ")";
                }
        }
    }

    public String getShadingCompensationDescription() {
        return getIndexedDescription(1292, "Off", "On");
    }

    public String getSharpnessSettingDescription() {
        return getValueMinMaxDescription(1286);
    }

    public String getStackedImageDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagStackedImage);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        int i2 = intArray[0];
        int i3 = intArray[1];
        return (i2 == 0 && i3 == 0) ? "No" : (i2 == 9 && i3 == 8) ? "Focus-stacked (8 images)" : String.format("Unknown (%d %d)", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public String getToneLevelDescription() {
        int[] intArray = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getIntArray(OlympusCameraSettingsMakernoteDirectory.TagToneLevel);
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            if (i2 == 0 || i2 == 4 || i2 == 8 || i2 == 12 || i2 == 16 || i2 == 20 || i2 == 24) {
                sb.append(_toneLevelType.get(Integer.valueOf(intArray[i2]))).append("; ");
            } else {
                sb.append(intArray[i2]).append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getWhiteBalance2Description() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1280);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 0) {
            return "Auto";
        }
        if (iIntValue == 1) {
            return "Auto (Keep Warm Color Off)";
        }
        if (iIntValue == 48) {
            return "3600K (Tungsten light-like)";
        }
        if (iIntValue == 67) {
            return "Underwater";
        }
        switch (iIntValue) {
            case 16:
                return "7500K (Fine Weather with Shade)";
            case 17:
                return "6000K (Cloudy)";
            case 18:
                return "5300K (Fine Weather)";
            default:
                switch (iIntValue) {
                    case 20:
                        return "3000K (Tungsten light)";
                    case 21:
                        return "3600K (Tungsten light-like)";
                    case 22:
                        return "Auto Setup";
                    case 23:
                        return "5500K (Flash)";
                    default:
                        switch (iIntValue) {
                            case 33:
                                return "6600K (Daylight fluorescent)";
                            case 34:
                                return "4500K (Neutral white fluorescent)";
                            case 35:
                                return "4000K (Cool white fluorescent)";
                            case 36:
                                return "White Fluorescent";
                            default:
                                switch (iIntValue) {
                                    case 256:
                                        return "One Touch WB 1";
                                    case 257:
                                        return "One Touch WB 2";
                                    case 258:
                                        return "One Touch WB 3";
                                    case 259:
                                        return "One Touch WB 4";
                                    default:
                                        switch (iIntValue) {
                                            case 512:
                                                return "Custom WB 1";
                                            case 513:
                                                return "Custom WB 2";
                                            case 514:
                                                return "Custom WB 3";
                                            case 515:
                                                return "Custom WB 4";
                                            default:
                                                return "Unknown (" + integer + ")";
                                        }
                                }
                        }
                }
        }
    }

    public String getWhiteBalanceTemperatureDescription() {
        Integer integer = ((OlympusCameraSettingsMakernoteDirectory) this._directory).getInteger(1281);
        if (integer == null) {
            return null;
        }
        return integer.intValue() == 0 ? "Auto" : integer.toString();
    }
}
