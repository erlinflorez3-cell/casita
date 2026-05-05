package com.drew.metadata.exif.makernotes;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.ByteArrayReader;
import com.drew.lang.Charsets;
import com.drew.metadata.Age;
import com.drew.metadata.Face;
import com.drew.metadata.TagDescriptor;
import com.dynatrace.android.agent.Global;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.mlkit.vision.objects.defaults.PredefinedCategory;
import cz.msebera.android.httpclient.HttpHeaders;
import java.io.IOException;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class PanasonicMakernoteDescriptor extends TagDescriptor<PanasonicMakernoteDirectory> {
    private static final String[] _sceneModes = {ReactProgressBarViewManager.DEFAULT_STYLE, "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", "Night Scenery", PredefinedCategory.FOOD, "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", "Clipboard", "High Speed Continuous Shooting", "Intelligent Auto", null, "Multi-aspect", null, "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", null, null, null, null, "HDR"};

    public PanasonicMakernoteDescriptor(PanasonicMakernoteDirectory panasonicMakernoteDirectory) {
        super(panasonicMakernoteDirectory);
    }

    private String buildFacesDescription(Face[] faceArr) {
        if (faceArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < faceArr.length) {
            int i3 = i2 + 1;
            sb.append("Face ").append(i3).append(": ").append(faceArr[i2].toString()).append("\n");
            i2 = i3;
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }

    private String getTransformDescription(int i2) {
        byte[] byteArray = ((PanasonicMakernoteDirectory) this._directory).getByteArray(i2);
        if (byteArray == null) {
            return null;
        }
        ByteArrayReader byteArrayReader = new ByteArrayReader(byteArray);
        try {
            int uInt16 = byteArrayReader.getUInt16(0);
            int uInt162 = byteArrayReader.getUInt16(2);
            return (uInt16 == -1 && uInt162 == 1) ? "Slim Low" : (uInt16 == -3 && uInt162 == 2) ? "Slim High" : (uInt16 == 0 && uInt162 == 0) ? "Off" : (uInt16 == 1 && uInt162 == 1) ? "Stretch Low" : (uInt16 == 3 && uInt162 == 2) ? "Stretch High" : "Unknown (" + uInt16 + Global.BLANK + uInt162 + ")";
        } catch (IOException unused) {
            return null;
        }
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public String getAccelerometerXDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(141);
        if (integer == null) {
            return null;
        }
        return String.valueOf((int) integer.shortValue());
    }

    public String getAccelerometerYDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(142);
        if (integer == null) {
            return null;
        }
        return String.valueOf((int) integer.shortValue());
    }

    public String getAccelerometerZDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(140);
        if (integer == null) {
            return null;
        }
        return String.valueOf((int) integer.shortValue());
    }

    public String getAdvancedSceneModeDescription() {
        return getIndexedDescription(61, 1, ReactProgressBarViewManager.DEFAULT_STYLE, "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", null, "Expressive", "Retro", "Pure", "Elegant", null, "Monochrome", "Dynamic Art", "Silhouette");
    }

    public String getAfAreaModeDescription() {
        int[] intArray = ((PanasonicMakernoteDirectory) this._directory).getIntArray(15);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        int i2 = intArray[0];
        if (i2 == 0) {
            int i3 = intArray[1];
            return i3 != 1 ? i3 != 16 ? "Unknown (" + intArray[0] + Global.BLANK + intArray[1] + ")" : "Spot Mode Off" : "Spot Mode On";
        }
        if (i2 == 1) {
            int i4 = intArray[1];
            return i4 != 0 ? i4 != 1 ? "Unknown (" + intArray[0] + Global.BLANK + intArray[1] + ")" : "5-area" : "Spot Focusing";
        }
        if (i2 == 16) {
            int i5 = intArray[1];
            return i5 != 0 ? i5 != 16 ? "Unknown (" + intArray[0] + Global.BLANK + intArray[1] + ")" : "1-area (high speed)" : "1-area";
        }
        if (i2 != 32) {
            return i2 != 64 ? "Unknown (" + intArray[0] + Global.BLANK + intArray[1] + ")" : "Face Detect";
        }
        int i6 = intArray[1];
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? "Unknown (" + intArray[0] + Global.BLANK + intArray[1] + ")" : "3-area (right)" : "3-area (center)" : "3-area (left)" : "Auto or Face Detect";
    }

    public String getAfAssistLampDescription() {
        return getIndexedDescription(49, 1, "Fired", "Enabled but not used", "Disabled but required", "Disabled and not required");
    }

    public String getAudioDescription() {
        return getIndexedDescription(32, 1, "Off", "On");
    }

    public String getBabyAge1Description() {
        Age age = ((PanasonicMakernoteDirectory) this._directory).getAge(PanasonicMakernoteDirectory.TAG_BABY_AGE_1);
        if (age == null) {
            return null;
        }
        return age.toFriendlyString();
    }

    public String getBabyAgeDescription() {
        Age age = ((PanasonicMakernoteDirectory) this._directory).getAge(51);
        if (age == null) {
            return null;
        }
        return age.toFriendlyString();
    }

    public String getBabyNameDescription() {
        return trim(getStringFromBytes(102, Charsets.UTF_8));
    }

    public String getBracketSettingsDescription() {
        return getIndexedDescription(69, "No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+");
    }

    public String getBurstModeDescription() {
        return getIndexedDescription(42, "Off", null, "On", "Indefinite", "Unlimited");
    }

    public String getCameraOrientationDescription() {
        return getIndexedDescription(143, ReactProgressBarViewManager.DEFAULT_STYLE, "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards");
    }

    public String getCityDescription() {
        return trim(getStringFromBytes(109, Charsets.UTF_8));
    }

    public String getClearRetouchDescription() {
        return getIndexedDescription(124, "Off", "On");
    }

    public String getColorEffectDescription() {
        return getIndexedDescription(40, 1, "Off", "Warm", "Cool", "Black & White", "Sepia");
    }

    public String getColorModeDescription() {
        return getIndexedDescription(50, ReactProgressBarViewManager.DEFAULT_STYLE, "Natural", "Vivid");
    }

    public String getContrastDescription() {
        return getIndexedDescription(57, ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    public String getContrastModeDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(44);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 6 ? iIntValue != 7 ? iIntValue != 256 ? iIntValue != 272 ? iIntValue != 288 ? "Unknown (" + integer + ")" : "High" : ReactProgressBarViewManager.DEFAULT_STYLE : "Low" : "Medium High" : "Medium Low" : "High" : "Low" : ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    public String getConversionLensDescription() {
        return getIndexedDescription(53, 1, "Off", "Wide", "Telephoto", "Macro");
    }

    public String getCountryDescription() {
        return trim(getStringFromBytes(105, Charsets.UTF_8));
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        switch (i2) {
            case 1:
                return getQualityModeDescription();
            case 2:
                return getVersionDescription();
            case 3:
                return getWhiteBalanceDescription();
            case 7:
                return getFocusModeDescription();
            case 15:
                return getAfAreaModeDescription();
            case 26:
                return getImageStabilizationDescription();
            case 28:
                return getMacroModeDescription();
            case 31:
                return getRecordModeDescription();
            case 32:
                return getAudioDescription();
            case 33:
                return getUnknownDataDumpDescription();
            case 37:
                return getInternalSerialNumberDescription();
            case 38:
                return getExifVersionDescription();
            case 40:
                return getColorEffectDescription();
            case 41:
                return getUptimeDescription();
            case 42:
                return getBurstModeDescription();
            case 44:
                return getContrastModeDescription();
            case 45:
                return getNoiseReductionDescription();
            case 46:
                return getSelfTimerDescription();
            case 48:
                return getRotationDescription();
            case 49:
                return getAfAssistLampDescription();
            case 50:
                return getColorModeDescription();
            case 51:
                return getBabyAgeDescription();
            case 52:
                return getOpticalZoomModeDescription();
            case 53:
                return getConversionLensDescription();
            case 57:
                return getContrastDescription();
            case 58:
                return getWorldTimeLocationDescription();
            case 59:
                return getTextStampDescription();
            case 61:
                return getAdvancedSceneModeDescription();
            case 62:
                return getTextStamp1Description();
            case 69:
                return getBracketSettingsDescription();
            case 72:
                return getFlashCurtainDescription();
            case 73:
                return getLongExposureNoiseReductionDescription();
            case 78:
                return getDetectedFacesDescription();
            case 89:
                return getTransformDescription();
            case 93:
                return getIntelligentExposureDescription();
            case 96:
                return getLensFirmwareVersionDescription();
            case 97:
                return getRecognizedFacesDescription();
            case 98:
                return getFlashWarningDescription();
            case 101:
                return getTitleDescription();
            case 102:
                return getBabyNameDescription();
            case 103:
                return getLocationDescription();
            case 105:
                return getCountryDescription();
            case 107:
                return getStateDescription();
            case 109:
                return getCityDescription();
            case 111:
                return getLandmarkDescription();
            case PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION /* 112 */:
                return getIntelligentResolutionDescription();
            case 121:
                return getIntelligentDRangeDescription();
            case 124:
                return getClearRetouchDescription();
            case 137:
                return getPhotoStyleDescription();
            case 138:
                return getShadingCompensationDescription();
            case 140:
                return getAccelerometerZDescription();
            case 141:
                return getAccelerometerXDescription();
            case 142:
                return getAccelerometerYDescription();
            case 143:
                return getCameraOrientationDescription();
            case 144:
                return getRollAngleDescription();
            case 145:
                return getPitchAngleDescription();
            case 147:
                return getSweepPanoramaDirectionDescription();
            case 150:
                return getTimerRecordingDescription();
            case 158:
                return getHDRDescription();
            case 159:
                return getShutterTypeDescription();
            case 171:
                return getTouchAeDescription();
            case 32768:
                return getMakernoteVersionDescription();
            case PanasonicMakernoteDirectory.TAG_SCENE_MODE /* 32769 */:
                return getSceneModeDescription();
            case PanasonicMakernoteDirectory.TAG_FLASH_FIRED /* 32775 */:
                return getFlashFiredDescription();
            case PanasonicMakernoteDirectory.TAG_TEXT_STAMP_2 /* 32776 */:
                return getTextStamp2Description();
            case PanasonicMakernoteDirectory.TAG_TEXT_STAMP_3 /* 32777 */:
                return getTextStamp3Description();
            case PanasonicMakernoteDirectory.TAG_BABY_AGE_1 /* 32784 */:
                return getBabyAge1Description();
            case PanasonicMakernoteDirectory.TAG_TRANSFORM_1 /* 32786 */:
                return getTransform1Description();
            default:
                return super.getDescription(i2);
        }
    }

    public String getDetectedFacesDescription() {
        return buildFacesDescription(((PanasonicMakernoteDirectory) this._directory).getDetectedFaces());
    }

    public String getExifVersionDescription() {
        return getVersionBytesDescription(38, 2);
    }

    public String getFlashCurtainDescription() {
        return getIndexedDescription(72, "n/a", "1st", "2nd");
    }

    public String getFlashFiredDescription() {
        return getIndexedDescription(PanasonicMakernoteDirectory.TAG_FLASH_FIRED, 1, "Off", "On");
    }

    public String getFlashWarningDescription() {
        return getIndexedDescription(98, "No", "Yes (Flash required but disabled)");
    }

    public String getFocusModeDescription() {
        return getIndexedDescription(7, 1, "Auto", "Manual", null, "Auto, Focus Button", "Auto, Continuous");
    }

    public String getHDRDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(158);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 0 ? iIntValue != 100 ? iIntValue != 200 ? iIntValue != 300 ? iIntValue != 32868 ? iIntValue != 32968 ? iIntValue != 33068 ? String.format("Unknown (%d)", integer) : "3 EV (Auto)" : "2 EV (Auto)" : "1 EV (Auto)" : "3 EV" : "2 EV" : "1 EV" : "Off";
    }

    public String getImageStabilizationDescription() {
        return getIndexedDescription(26, 2, "On, Mode 1", "Off", "On, Mode 2");
    }

    public String getIntelligentDRangeDescription() {
        return getIndexedDescription(121, "Off", "Low", "Standard", "High");
    }

    public String getIntelligentExposureDescription() {
        return getIndexedDescription(93, "Off", "Low", "Standard", "High");
    }

    public String getIntelligentResolutionDescription() {
        return getIndexedDescription(PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, "Off", null, "Auto", "On");
    }

    public String getInternalSerialNumberDescription() {
        return get7BitStringFromBytes(37);
    }

    public String getLandmarkDescription() {
        return trim(getStringFromBytes(111, Charsets.UTF_8));
    }

    public String getLensFirmwareVersionDescription() {
        byte[] byteArray = ((PanasonicMakernoteDirectory) this._directory).getByteArray(96);
        if (byteArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < byteArray.length; i2++) {
            sb.append((int) byteArray[i2]);
            if (i2 < byteArray.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public String getLocationDescription() {
        return trim(getStringFromBytes(103, Charsets.UTF_8));
    }

    public String getLongExposureNoiseReductionDescription() {
        return getIndexedDescription(73, 1, "Off", "On");
    }

    public String getMacroModeDescription() {
        return getIndexedDescription(28, 1, "Off", "On");
    }

    public String getMakernoteVersionDescription() {
        return getVersionBytesDescription(32768, 2);
    }

    public String getNoiseReductionDescription() {
        return getIndexedDescription(45, "Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)");
    }

    public String getOpticalZoomModeDescription() {
        return getIndexedDescription(52, 1, "Standard", "Extended");
    }

    public String getPhotoStyleDescription() {
        return getIndexedDescription(137, "Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait");
    }

    public String getPitchAngleDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(145);
        if (integer == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(((double) (-integer.shortValue())) / 10.0d);
    }

    public String getQualityModeDescription() {
        return getIndexedDescription(1, 2, "High", ReactProgressBarViewManager.DEFAULT_STYLE, null, null, "Very High", "Raw", null, "Motion Picture");
    }

    public String getRecognizedFacesDescription() {
        return buildFacesDescription(((PanasonicMakernoteDirectory) this._directory).getRecognizedFaces());
    }

    public String getRecordModeDescription() {
        return getIndexedDescription(31, 1, _sceneModes);
    }

    public String getRollAngleDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(144);
        if (integer == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(((double) integer.shortValue()) / 10.0d);
    }

    public String getRotationDescription() {
        Integer integer = ((PanasonicMakernoteDirectory) this._directory).getInteger(48);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 1 ? iIntValue != 3 ? iIntValue != 6 ? iIntValue != 8 ? "Unknown (" + integer + ")" : "Rotate 270 CW" : "Rotate 90 CW" : "Rotate 180" : "Horizontal";
    }

    public String getSceneModeDescription() {
        return getIndexedDescription(PanasonicMakernoteDirectory.TAG_SCENE_MODE, 1, _sceneModes);
    }

    public String getSelfTimerDescription() {
        return getIndexedDescription(46, 1, "Off", "10 s", "2 s");
    }

    public String getShadingCompensationDescription() {
        return getIndexedDescription(138, "Off", "On");
    }

    public String getShutterTypeDescription() {
        return getIndexedDescription(159, "Mechanical", "Electronic", "Hybrid");
    }

    public String getStateDescription() {
        return trim(getStringFromBytes(107, Charsets.UTF_8));
    }

    public String getSweepPanoramaDirectionDescription() {
        return getIndexedDescription(147, "Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top");
    }

    public String getTextStamp1Description() {
        return getIndexedDescription(62, 1, "Off", "On");
    }

    public String getTextStamp2Description() {
        return getIndexedDescription(PanasonicMakernoteDirectory.TAG_TEXT_STAMP_2, 1, "Off", "On");
    }

    public String getTextStamp3Description() {
        return getIndexedDescription(PanasonicMakernoteDirectory.TAG_TEXT_STAMP_3, 1, "Off", "On");
    }

    public String getTextStampDescription() {
        return getIndexedDescription(59, 1, "Off", "On");
    }

    public String getTimerRecordingDescription() {
        return getIndexedDescription(150, "Off", "Time Lapse", "Stop-motion Animation");
    }

    public String getTitleDescription() {
        return trim(getStringFromBytes(101, Charsets.UTF_8));
    }

    public String getTouchAeDescription() {
        return getIndexedDescription(171, "Off", "On");
    }

    public String getTransform1Description() {
        return getTransformDescription(PanasonicMakernoteDirectory.TAG_TRANSFORM_1);
    }

    public String getTransformDescription() {
        return getTransformDescription(89);
    }

    public String getUnknownDataDumpDescription() {
        return getByteLengthDescription(33);
    }

    public String getUptimeDescription() {
        if (((PanasonicMakernoteDirectory) this._directory).getInteger(41) == null) {
            return null;
        }
        return (r0.intValue() / 100.0f) + " s";
    }

    public String getVersionDescription() {
        return getVersionBytesDescription(2, 2);
    }

    public String getWhiteBalanceDescription() {
        return getIndexedDescription(3, 1, "Auto", "Daylight", "Cloudy", "Incandescent", "Manual", null, null, ExifInterface.TAG_FLASH, null, "Black & White", "Manual", "Shade");
    }

    public String getWorldTimeLocationDescription() {
        return getIndexedDescription(58, 1, "Home", HttpHeaders.DESTINATION);
    }
}
