package com.drew.metadata.exif.makernotes;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.drew.imaging.PhotographicConversions;
import com.drew.lang.DateUtil;
import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class OlympusMakernoteDescriptor extends TagDescriptor<OlympusMakernoteDirectory> {
    public OlympusMakernoteDescriptor(OlympusMakernoteDirectory olympusMakernoteDirectory) {
        super(olympusMakernoteDirectory);
    }

    public String getApertureValueDescription() {
        Double doubleObject = ((OlympusMakernoteDirectory) this._directory).getDoubleObject(4098);
        if (doubleObject == null) {
            return null;
        }
        return getFStopDescription(PhotographicConversions.apertureToFStop(doubleObject.doubleValue()));
    }

    public String getApexApertureDescription() {
        if (((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_APEX_APERTURE_VALUE) == null) {
            return null;
        }
        return getFStopDescription(Math.pow((r0.longValue() / 16.0d) - 0.5d, 2.0d));
    }

    public String getApexBrightnessDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_APEX_BRIGHTNESS_VALUE);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (longObject == null) {
            return null;
        }
        return decimalFormat.format((longObject.longValue() / 8.0d) - 6.0d);
    }

    public String getApexFilmSpeedDescription() {
        if (((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_APEX_FILM_SPEED_VALUE) == null) {
            return null;
        }
        double dPow = Math.pow((r0.longValue() / 8.0d) - 1.0d, 2.0d) * 3.125d;
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(dPow);
    }

    public String getApexShutterSpeedTimeDescription() {
        if (((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_APEX_SHUTTER_SPEED_TIME_VALUE) == null) {
            return null;
        }
        double dPow = Math.pow((49 - r0.longValue()) / 8.0d, 2.0d);
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(dPow) + " sec";
    }

    public String getBWModeDescription() {
        return getIndexedDescription(515, "Off", "On");
    }

    public String getBlackAndWhiteFilterDescription() {
        return super.getDescription(OlympusMakernoteDirectory.CameraSettings.TAG_BLACK_AND_WHITE_FILTER);
    }

    public String getBlueBalanceDescription() {
        int[] intArray = ((OlympusMakernoteDirectory) this._directory).getIntArray(OlympusMakernoteDirectory.TAG_BLUE_BALANCE);
        if (intArray == null) {
            return null;
        }
        return String.valueOf(((double) ((short) intArray[0])) / 256.0d);
    }

    public String getBracketStepDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_BRACKET_STEP, "1/3 EV", "2/3 EV", "1 EV");
    }

    public String getCameraIdDescription() {
        byte[] byteArray = ((OlympusMakernoteDirectory) this._directory).getByteArray(521);
        if (byteArray == null) {
            return null;
        }
        return new String(byteArray);
    }

    public String getCameraModelDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_CAMERA_MODEL, "DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414");
    }

    public String getCameraTypeDescription() {
        String string = ((OlympusMakernoteDirectory) this._directory).getString(519);
        if (string == null) {
            return null;
        }
        return OlympusMakernoteDirectory.OlympusCameraTypes.containsKey(string) ? OlympusMakernoteDirectory.OlympusCameraTypes.get(string) : string;
    }

    public String getColorFilterDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_COLOR_FILTER);
        if (longObject == null) {
            return null;
        }
        return Long.toString(longObject.longValue() - 3);
    }

    public String getColorMatrixDescription() {
        int[] intArray = ((OlympusMakernoteDirectory) this._directory).getIntArray(4113);
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

    public String getColorModeCameraSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_COLOR_MODE, "Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB");
    }

    public String getColorModeDescription() {
        return getIndexedDescription(257, "Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB");
    }

    public String getContrastCameraSettingDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_CONTRAST);
        if (longObject == null) {
            return null;
        }
        return Long.toString(longObject.longValue() - 3);
    }

    public String getContrastDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.TAG_CONTRAST, "High", ReactProgressBarViewManager.DEFAULT_STYLE, "Low");
    }

    public String getDateDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_DATE);
        if (longObject == null) {
            return null;
        }
        int iLongValue = (int) (longObject.longValue() & 255);
        long jLongValue = longObject.longValue() >> 16;
        int i2 = (int) ((jLongValue + 255) - (jLongValue | 255));
        long jLongValue2 = longObject.longValue() >> 8;
        int i3 = ((int) ((255 + jLongValue2) - (255 | jLongValue2))) + 1970;
        return !DateUtil.isValidDate(i3, i2, iLongValue) ? "Invalid date" : String.format("%04d-%02d-%02d", Integer.valueOf(i3), Integer.valueOf(i2 + 1), Integer.valueOf(iLongValue));
    }

    public String getDecSwitchPositionDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_DEC_SWITCH_POSITION, "Exposure", ExifInterface.TAG_CONTRAST, ExifInterface.TAG_SATURATION, "Filter");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == 0) {
            return getMakernoteVersionDescription();
        }
        if (i2 == 519) {
            return getCameraTypeDescription();
        }
        if (i2 == 521) {
            return getCameraIdDescription();
        }
        if (i2 == 770) {
            return getOneTouchWbDescription();
        }
        if (i2 == 4100) {
            return getFlashModeDescription();
        }
        if (i2 == 4111) {
            return getSharpnessDescription();
        }
        if (i2 == 4113) {
            return getColorMatrixDescription();
        }
        if (i2 == 4117) {
            return getWbModeDescription();
        }
        if (i2 == 4137) {
            return getContrastDescription();
        }
        if (i2 == 4149) {
            return getPreviewImageValidDescription();
        }
        if (i2 == 4106) {
            return getFocusRangeDescription();
        }
        if (i2 == 4107) {
            return getFocusModeDescription();
        }
        if (i2 == 4119) {
            return getRedBalanceDescription();
        }
        if (i2 == 4120) {
            return getBlueBalanceDescription();
        }
        switch (i2) {
            case 257:
                return getColorModeDescription();
            case 258:
                return getImageQuality1Description();
            case 259:
                return getImageQuality2Description();
            default:
                switch (i2) {
                    case 512:
                        return getSpecialModeDescription();
                    case 513:
                        return getJpegQualityDescription();
                    case 514:
                        return getMacroModeDescription();
                    case 515:
                        return getBWModeDescription();
                    case 516:
                        return getDigitalZoomDescription();
                    case 517:
                        return getFocalPlaneDiagonalDescription();
                    default:
                        switch (i2) {
                            case 4096:
                                return getShutterSpeedDescription();
                            case 4097:
                                return getIsoValueDescription();
                            case 4098:
                                return getApertureValueDescription();
                            default:
                                switch (i2) {
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_EXPOSURE_MODE /* 61442 */:
                                        return getExposureModeDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_FLASH_MODE /* 61443 */:
                                        return getFlashModeCameraSettingDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE /* 61444 */:
                                        return getWhiteBalanceDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_IMAGE_SIZE /* 61445 */:
                                        return getImageSizeDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_IMAGE_QUALITY /* 61446 */:
                                        return getImageQualityDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_SHOOTING_MODE /* 61447 */:
                                        return getShootingModeDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_METERING_MODE /* 61448 */:
                                        return getMeteringModeDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_APEX_FILM_SPEED_VALUE /* 61449 */:
                                        return getApexFilmSpeedDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_APEX_SHUTTER_SPEED_TIME_VALUE /* 61450 */:
                                        return getApexShutterSpeedTimeDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_APEX_APERTURE_VALUE /* 61451 */:
                                        return getApexApertureDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_MACRO_MODE /* 61452 */:
                                        return getMacroModeCameraSettingDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_DIGITAL_ZOOM /* 61453 */:
                                        return getDigitalZoomCameraSettingDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_EXPOSURE_COMPENSATION /* 61454 */:
                                        return getExposureCompensationDescription();
                                    case OlympusMakernoteDirectory.CameraSettings.TAG_BRACKET_STEP /* 61455 */:
                                        return getBracketStepDescription();
                                    default:
                                        switch (i2) {
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_INTERVAL_LENGTH /* 61457 */:
                                                return getIntervalLengthDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_INTERVAL_NUMBER /* 61458 */:
                                                return getIntervalNumberDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_FOCAL_LENGTH /* 61459 */:
                                                return getFocalLengthDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_FOCUS_DISTANCE /* 61460 */:
                                                return getFocusDistanceDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_FLASH_FIRED /* 61461 */:
                                                return getFlashFiredDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_DATE /* 61462 */:
                                                return getDateDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_TIME /* 61463 */:
                                                return getTimeDescription();
                                            case OlympusMakernoteDirectory.CameraSettings.TAG_MAX_APERTURE_AT_FOCAL_LENGTH /* 61464 */:
                                                return getMaxApertureAtFocalLengthDescription();
                                            default:
                                                switch (i2) {
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_FILE_NUMBER_MEMORY /* 61467 */:
                                                        return getFileNumberMemoryDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_LAST_FILE_NUMBER /* 61468 */:
                                                        return getLastFileNumberDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE_RED /* 61469 */:
                                                        return getWhiteBalanceRedDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE_GREEN /* 61470 */:
                                                        return getWhiteBalanceGreenDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE_BLUE /* 61471 */:
                                                        return getWhiteBalanceBlueDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_SATURATION /* 61472 */:
                                                        return getSaturationDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_CONTRAST /* 61473 */:
                                                        return getContrastCameraSettingDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_SHARPNESS /* 61474 */:
                                                        return getSharpnessCameraSettingDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_SUBJECT_PROGRAM /* 61475 */:
                                                        return getSubjectProgramDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_FLASH_COMPENSATION /* 61476 */:
                                                        return getFlashCompensationDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_ISO_SETTING /* 61477 */:
                                                        return getIsoSettingDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_CAMERA_MODEL /* 61478 */:
                                                        return getCameraModelDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_INTERVAL_MODE /* 61479 */:
                                                        return getIntervalModeDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_FOLDER_NAME /* 61480 */:
                                                        return getFolderNameDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_COLOR_MODE /* 61481 */:
                                                        return getColorModeCameraSettingDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_COLOR_FILTER /* 61482 */:
                                                        return getColorFilterDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_BLACK_AND_WHITE_FILTER /* 61483 */:
                                                        return getBlackAndWhiteFilterDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_INTERNAL_FLASH /* 61484 */:
                                                        return getInternalFlashDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_APEX_BRIGHTNESS_VALUE /* 61485 */:
                                                        return getApexBrightnessDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_SPOT_FOCUS_POINT_X_COORDINATE /* 61486 */:
                                                        return getSpotFocusPointXCoordinateDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_SPOT_FOCUS_POINT_Y_COORDINATE /* 61487 */:
                                                        return getSpotFocusPointYCoordinateDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_WIDE_FOCUS_ZONE /* 61488 */:
                                                        return getWideFocusZoneDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_FOCUS_MODE /* 61489 */:
                                                        return getFocusModeCameraSettingDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_FOCUS_AREA /* 61490 */:
                                                        return getFocusAreaDescription();
                                                    case OlympusMakernoteDirectory.CameraSettings.TAG_DEC_SWITCH_POSITION /* 61491 */:
                                                        return getDecSwitchPositionDescription();
                                                    default:
                                                        return super.getDescription(i2);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public String getDigitalZoomCameraSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_DIGITAL_ZOOM, "Off", "Electronic magnification", "Digital zoom 2x");
    }

    public String getDigitalZoomDescription() {
        Rational rational = ((OlympusMakernoteDirectory) this._directory).getRational(516);
        if (rational == null) {
            return null;
        }
        return rational.toSimpleString(false);
    }

    public String getExposureCompensationDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_EXPOSURE_COMPENSATION);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (longObject == null) {
            return null;
        }
        return decimalFormat.format((longObject.longValue() / 3.0d) - 2.0d) + " EV";
    }

    public String getExposureModeDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_EXPOSURE_MODE, "P", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ExifInterface.LATITUDE_SOUTH, "M");
    }

    public String getFileNumberMemoryDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_FILE_NUMBER_MEMORY, "Off", "On");
    }

    public String getFlashCompensationDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_FLASH_COMPENSATION);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (longObject == null) {
            return null;
        }
        return decimalFormat.format((longObject.longValue() - 6) / 3.0d) + " EV";
    }

    public String getFlashFiredDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_FLASH_FIRED, "No", "Yes");
    }

    public String getFlashModeCameraSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_FLASH_MODE, ReactProgressBarViewManager.DEFAULT_STYLE, "Red-eye reduction", "Rear flash sync", "Wireless");
    }

    public String getFlashModeDescription() {
        return getIndexedDescription(4100, null, null, "On", "Off");
    }

    public String getFocalLengthDescription() {
        if (((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_FOCAL_LENGTH) == null) {
            return null;
        }
        return getFocalLengthDescription(r0.longValue() / 256.0d);
    }

    public String getFocalPlaneDiagonalDescription() {
        Rational rational = ((OlympusMakernoteDirectory) this._directory).getRational(517);
        if (rational == null) {
            return null;
        }
        return new DecimalFormat("0.###").format(rational.doubleValue()) + " mm";
    }

    public String getFocusAreaDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_FOCUS_AREA, "Wide Focus (Normal)", "Spot Focus");
    }

    public String getFocusDistanceDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_FOCUS_DISTANCE);
        if (longObject == null) {
            return null;
        }
        return longObject.longValue() == 0 ? "Infinity" : longObject + " mm";
    }

    public String getFocusModeCameraSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_FOCUS_MODE, "Auto Focus", "Manual Focus");
    }

    public String getFocusModeDescription() {
        return getIndexedDescription(4107, "Auto", "Manual");
    }

    public String getFocusRangeDescription() {
        return getIndexedDescription(4106, ReactProgressBarViewManager.DEFAULT_STYLE, "Macro");
    }

    public String getFolderNameDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_FOLDER_NAME, "Standard Form", "Data Form");
    }

    public String getImageQuality1Description() {
        return getIndexedDescription(258, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    public String getImageQuality2Description() {
        return getIndexedDescription(259, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    public String getImageQualityDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_IMAGE_QUALITY, "Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine");
    }

    public String getImageSizeDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_IMAGE_SIZE, "2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480");
    }

    public String getInternalFlashDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_INTERNAL_FLASH, "Did Not Fire", "Fired");
    }

    public String getIntervalLengthDescription() {
        if (!((OlympusMakernoteDirectory) this._directory).isIntervalMode()) {
            return "N/A";
        }
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_INTERVAL_LENGTH);
        if (longObject == null) {
            return null;
        }
        return longObject + " min";
    }

    public String getIntervalModeDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_INTERVAL_MODE, "Still Image", "Time Lapse Movie");
    }

    public String getIntervalNumberDescription() {
        if (!((OlympusMakernoteDirectory) this._directory).isIntervalMode()) {
            return "N/A";
        }
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_INTERVAL_NUMBER);
        if (longObject == null) {
            return null;
        }
        return Long.toString(longObject.longValue());
    }

    public String getIsoSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_ISO_SETTING, "100", "200", "400", "800", "Auto", "64");
    }

    public String getIsoValueDescription() {
        Rational rational = ((OlympusMakernoteDirectory) this._directory).getRational(4097);
        if (rational == null) {
            return null;
        }
        return String.valueOf(Math.round(Math.pow(2.0d, rational.doubleValue() - 5.0d) * 100.0d));
    }

    public String getJpegQualityDescription() {
        String string = ((OlympusMakernoteDirectory) this._directory).getString(519);
        if (string == null) {
            return getIndexedDescription(513, 1, "Standard Quality", "High Quality", "Super High Quality");
        }
        Integer integer = ((OlympusMakernoteDirectory) this._directory).getInteger(513);
        if (integer == null) {
            return null;
        }
        if ((!string.startsWith("SX") || string.startsWith("SX151")) && !string.startsWith("D4322")) {
            int iIntValue = integer.intValue();
            return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 4 ? iIntValue != 5 ? iIntValue != 6 ? iIntValue != 33 ? "Unknown (" + integer.toString() + ")" : "Uncompressed" : "Small-Fine" : "Medium-Fine" : "RAW" : "Super High Quality (Fine)" : "High Quality (Normal)" : "Standard Quality (Low)";
        }
        int iIntValue2 = integer.intValue();
        return iIntValue2 != 0 ? iIntValue2 != 1 ? iIntValue2 != 2 ? iIntValue2 != 6 ? "Unknown (" + integer.toString() + ")" : "RAW" : "Super High Quality (Fine)" : "High Quality (Normal)" : "Standard Quality (Low)";
    }

    public String getLastFileNumberDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_LAST_FILE_NUMBER);
        if (longObject == null) {
            return null;
        }
        return longObject.longValue() == 0 ? "File Number Memory Off" : Long.toString(longObject.longValue());
    }

    public String getMacroModeCameraSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_MACRO_MODE, "Off", "On");
    }

    public String getMacroModeDescription() {
        return getIndexedDescription(514, "Normal (no macro)", "Macro");
    }

    public String getMakernoteVersionDescription() {
        return getVersionBytesDescription(0, 2);
    }

    public String getMaxApertureAtFocalLengthDescription() {
        if (((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_TIME) == null) {
            return null;
        }
        return getFStopDescription(Math.pow((r0.longValue() / 16.0d) - 0.5d, 2.0d));
    }

    public String getMeteringModeDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_METERING_MODE, "Multi-Segment", "Centre Weighted", "Spot");
    }

    public String getOneTouchWbDescription() {
        return getIndexedDescription(770, "Off", "On", "On (Preset)");
    }

    public String getPreviewImageValidDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE_VALID, "No", "Yes");
    }

    public String getRedBalanceDescription() {
        int[] intArray = ((OlympusMakernoteDirectory) this._directory).getIntArray(OlympusMakernoteDirectory.TAG_RED_BALANCE);
        if (intArray == null) {
            return null;
        }
        return String.valueOf(((double) ((short) intArray[0])) / 256.0d);
    }

    public String getSaturationDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_SATURATION);
        if (longObject == null) {
            return null;
        }
        return Long.toString(longObject.longValue() - 3);
    }

    public String getSharpnessCameraSettingDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_SHARPNESS, "Hard", ReactProgressBarViewManager.DEFAULT_STYLE, "Soft");
    }

    public String getSharpnessDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.TAG_SHARPNESS, ReactProgressBarViewManager.DEFAULT_STYLE, "Hard", "Soft");
    }

    public String getShootingModeDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_SHOOTING_MODE, "Single", "Continuous", "Self Timer", null, "Bracketing", "Interval", "UHS Continuous", "HS Continuous");
    }

    public String getShutterSpeedDescription() {
        return super.getShutterSpeedDescription(4096);
    }

    public String getSpecialModeDescription() {
        int i2;
        long[] jArr = (long[]) ((OlympusMakernoteDirectory) this._directory).getObject(512);
        if (jArr == null) {
            return null;
        }
        if (jArr.length < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i3 = (int) jArr[0];
        if (i3 == 0) {
            sb.append("Normal picture taking mode");
        } else if (i3 == 1) {
            sb.append("Unknown picture taking mode");
        } else if (i3 == 2) {
            sb.append("Fast picture taking mode");
        } else if (i3 != 3) {
            sb.append("Unknown picture taking mode");
        } else {
            sb.append("Panorama picture taking mode");
        }
        if (jArr.length >= 2 && (i2 = (int) jArr[1]) != 0) {
            if (i2 == 1) {
                sb.append(" / 1st in a sequence");
            } else if (i2 == 2) {
                sb.append(" / 2nd in a sequence");
            } else if (i2 != 3) {
                sb.append(" / ");
                sb.append(jArr[1]);
                sb.append("th in a sequence");
            } else {
                sb.append(" / 3rd in a sequence");
            }
        }
        if (jArr.length >= 3) {
            int i4 = (int) jArr[2];
            if (i4 == 1) {
                sb.append(" / Left to right panorama direction");
            } else if (i4 == 2) {
                sb.append(" / Right to left panorama direction");
            } else if (i4 == 3) {
                sb.append(" / Bottom to top panorama direction");
            } else if (i4 == 4) {
                sb.append(" / Top to bottom panorama direction");
            }
        }
        return sb.toString();
    }

    public String getSpotFocusPointXCoordinateDescription() {
        return super.getDescription(OlympusMakernoteDirectory.CameraSettings.TAG_SPOT_FOCUS_POINT_X_COORDINATE);
    }

    public String getSpotFocusPointYCoordinateDescription() {
        return super.getDescription(OlympusMakernoteDirectory.CameraSettings.TAG_SPOT_FOCUS_POINT_Y_COORDINATE);
    }

    public String getSubjectProgramDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_SUBJECT_PROGRAM, "None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action");
    }

    public String getTimeDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_TIME);
        if (longObject == null) {
            return null;
        }
        int iLongValue = (int) ((longObject.longValue() >> 8) & 255);
        int iLongValue2 = (int) ((longObject.longValue() >> 16) & 255);
        int iLongValue3 = (int) ((-1) - (((-1) - 255) | ((-1) - longObject.longValue())));
        return !DateUtil.isValidTime(iLongValue, iLongValue2, iLongValue3) ? "Invalid time" : String.format("%02d:%02d:%02d", Integer.valueOf(iLongValue), Integer.valueOf(iLongValue2), Integer.valueOf(iLongValue3));
    }

    public String getWbModeDescription() {
        int[] intArray = ((OlympusMakernoteDirectory) this._directory).getIntArray(OlympusMakernoteDirectory.TAG_WB_MODE);
        if (intArray == null) {
            return null;
        }
        String str = String.format("%d %d", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]));
        return str.equals("1 0") ? "Auto" : str.equals("1 2") ? "Auto (2)" : str.equals("1 4") ? "Auto (4)" : str.equals("2 2") ? "3000 Kelvin" : str.equals("2 3") ? "3700 Kelvin" : str.equals("2 4") ? "4000 Kelvin" : str.equals("2 5") ? "4500 Kelvin" : str.equals("2 6") ? "5500 Kelvin" : str.equals("2 7") ? "6500 Kelvin" : str.equals("2 8") ? "7500 Kelvin" : str.equals("3 0") ? "One-touch" : "Unknown " + str;
    }

    public String getWhiteBalanceBlueDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE_BLUE);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (longObject == null) {
            return null;
        }
        return decimalFormat.format(longObject.longValue() / 256.0d);
    }

    public String getWhiteBalanceDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE, "Auto", "Daylight", "Cloudy", "Tungsten", null, TypedValues.Custom.NAME, null, "Fluorescent", "Fluorescent 2", null, null, "Custom 2", "Custom 3");
    }

    public String getWhiteBalanceGreenDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE_GREEN);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (longObject == null) {
            return null;
        }
        return decimalFormat.format(longObject.longValue() / 256.0d);
    }

    public String getWhiteBalanceRedDescription() {
        Long longObject = ((OlympusMakernoteDirectory) this._directory).getLongObject(OlympusMakernoteDirectory.CameraSettings.TAG_WHITE_BALANCE_RED);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (longObject == null) {
            return null;
        }
        return decimalFormat.format(longObject.longValue() / 256.0d);
    }

    public String getWideFocusZoneDescription() {
        return getIndexedDescription(OlympusMakernoteDirectory.CameraSettings.TAG_WIDE_FOCUS_ZONE, "No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone");
    }
}
