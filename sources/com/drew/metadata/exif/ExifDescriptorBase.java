package com.drew.metadata.exif;

import androidx.exifinterface.media.ExifInterface;
import com.drew.imaging.PhotographicConversions;
import com.drew.lang.Rational;
import com.drew.metadata.Directory;
import com.drew.metadata.TagDescriptor;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExifDescriptorBase<T extends Directory> extends TagDescriptor<T> {
    private final boolean _allowDecimalRepresentationOfRationals;

    public ExifDescriptorBase(T t2) {
        super(t2);
        this._allowDecimalRepresentationOfRationals = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x004c A[PHI: r3 r8
  0x004c: PHI (r3v2 short) = (r3v1 short), (r3v4 short) binds: [B:47:0x0034, B:49:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r8v1 short) = (r8v0 short), (r8v3 short) binds: [B:47:0x0034, B:49:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] decodeCfaPattern(int r12) {
        /*
            r11 = this;
            T extends com.drew.metadata.Directory r0 = r11._directory
            byte[] r7 = r0.getByteArray(r12)
            if (r7 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r7.length
            r6 = 4
            r10 = 0
            if (r0 >= r6) goto L1d
            int r0 = r7.length
            int[] r1 = new int[r0]
        L12:
            int r0 = r7.length
            if (r10 >= r0) goto L1c
            r0 = r7[r10]
            r1[r10] = r0
            int r10 = r10 + 1
            goto L12
        L1c:
            return r1
        L1d:
            int r0 = r7.length
            r9 = 2
            int r0 = r0 - r9
            int[] r4 = new int[r0]
            com.drew.lang.ByteArrayReader r5 = new com.drew.lang.ByteArrayReader     // Catch: java.io.IOException -> L63
            r5.<init>(r7)     // Catch: java.io.IOException -> L63
            short r8 = r5.getInt16(r10)     // Catch: java.io.IOException -> L63
            short r3 = r5.getInt16(r9)     // Catch: java.io.IOException -> L63
            int r1 = r8 * r3
            int r1 = r1 + r9
            int r0 = r7.length     // Catch: java.io.IOException -> L63
            r2 = 1
            if (r1 <= r0) goto L4c
            boolean r0 = r5.isMotorolaByteOrder()     // Catch: java.io.IOException -> L63
            r0 = r0 ^ r2
            r5.setMotorolaByteOrder(r0)     // Catch: java.io.IOException -> L63
            short r8 = r5.getInt16(r10)     // Catch: java.io.IOException -> L63
            short r3 = r5.getInt16(r9)     // Catch: java.io.IOException -> L63
            int r1 = r7.length     // Catch: java.io.IOException -> L63
            int r0 = r8 * r3
            int r0 = r0 + r9
            if (r1 < r0) goto L4e
        L4c:
            r0 = r2
            goto L4f
        L4e:
            r0 = r10
        L4f:
            if (r0 == 0) goto L7c
            r4[r10] = r8     // Catch: java.io.IOException -> L63
            r4[r2] = r3     // Catch: java.io.IOException -> L63
        L55:
            int r0 = r7.length     // Catch: java.io.IOException -> L63
            if (r6 >= r0) goto L7c
            int r1 = r6 + (-2)
            byte r0 = r5.getInt8(r6)     // Catch: java.io.IOException -> L63
            r4[r1] = r0     // Catch: java.io.IOException -> L63
            int r6 = r6 + 1
            goto L55
        L63:
            r3 = move-exception
            T extends com.drew.metadata.Directory r2 = r11._directory
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "IO exception processing data: "
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.addError(r0)
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.exif.ExifDescriptorBase.decodeCfaPattern(int):int[]");
    }

    private static String formatCFAPattern(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length < 2) {
            return "<truncated data>";
        }
        int i2 = iArr[0];
        if (i2 == 0 && iArr[1] == 0) {
            return "<zero pattern size>";
        }
        int i3 = i2 * iArr[1];
        int i4 = i3 + 2;
        if (i4 > iArr.length) {
            return "<invalid pattern size>";
        }
        String[] strArr = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "White"};
        StringBuilder sb = new StringBuilder("[");
        for (int i5 = 2; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (i6 <= 6) {
                sb.append(strArr[i6]);
            } else {
                sb.append("Unknown");
            }
            if ((i5 - 2) % iArr[1] == 0) {
                sb.append(",");
            } else if (i5 != i3 + 1) {
                sb.append("][");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private String getUnicodeDescription(int i2) {
        byte[] byteArray = this._directory.getByteArray(i2);
        if (byteArray == null) {
            return null;
        }
        try {
            return new String(byteArray, "UTF-16LE").trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    static String getWhiteBalanceDescription(int i2) {
        if (i2 == 0) {
            return "Unknown";
        }
        if (i2 == 1) {
            return "Daylight";
        }
        if (i2 == 2) {
            return "Florescent";
        }
        if (i2 == 3) {
            return "Tungsten (Incandescent)";
        }
        if (i2 == 4) {
            return ExifInterface.TAG_FLASH;
        }
        if (i2 == 255) {
            return "Other";
        }
        switch (i2) {
            case 9:
                return "Fine Weather";
            case 10:
                return "Cloudy";
            case 11:
                return "Shade";
            case 12:
                return "Daylight Fluorescent";
            case 13:
                return "Day White Fluorescent";
            case 14:
                return "Cool White Fluorescent";
            case 15:
                return "White Fluorescent";
            case 16:
                return "Warm White Fluorescent";
            case 17:
                return "Standard light A";
            case 18:
                return "Standard light B";
            case 19:
                return "Standard light C";
            case 20:
                return "D55";
            case 21:
                return "D65";
            case 22:
                return "D75";
            case 23:
                return "D50";
            case 24:
                return "ISO Studio Tungsten";
            default:
                return "Unknown (" + i2 + ")";
        }
    }

    public String get35mmFilmEquivFocalLengthDescription() {
        Integer integer = this._directory.getInteger(ExifDirectoryBase.TAG_35MM_FILM_EQUIV_FOCAL_LENGTH);
        if (integer == null) {
            return null;
        }
        return integer.intValue() == 0 ? "Unknown" : getFocalLengthDescription(integer.intValue());
    }

    public String getAccelerationDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_ACCELERATION);
        if (rational == null) {
            return null;
        }
        if (rational.getDenominator() == 4294967295L) {
            return "Unknown";
        }
        return new DecimalFormat("0.0##").format(rational.doubleValue()) + " mGal";
    }

    public String getApertureValueDescription() {
        Double doubleObject = this._directory.getDoubleObject(ExifDirectoryBase.TAG_APERTURE);
        if (doubleObject == null) {
            return null;
        }
        return getFStopDescription(PhotographicConversions.apertureToFStop(doubleObject.doubleValue()));
    }

    public String getBitsPerSampleDescription() {
        String string = this._directory.getString(258);
        if (string == null) {
            return null;
        }
        return string + " bits/component/pixel";
    }

    public String getBrightnessValueDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_BRIGHTNESS_VALUE);
        if (rational == null) {
            return null;
        }
        return rational.getNumerator() == 4294967295L ? "Unknown" : new DecimalFormat("0.0##").format(rational.doubleValue());
    }

    public String getCameraElevationAngleDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_CAMERA_ELEVATION_ANGLE);
        if (rational == null) {
            return null;
        }
        if (rational.getDenominator() == 4294967295L) {
            return "Unknown";
        }
        return new DecimalFormat("0.##").format(rational.doubleValue()) + " degrees";
    }

    public String getCfaPattern2Description() {
        byte[] byteArray = this._directory.getByteArray(ExifDirectoryBase.TAG_CFA_PATTERN_2);
        if (byteArray == null) {
            return null;
        }
        int[] intArray = this._directory.getIntArray(ExifDirectoryBase.TAG_CFA_REPEAT_PATTERN_DIM);
        if (intArray == null) {
            return String.format("Repeat Pattern not found for CFAPattern (%s)", super.getDescription(ExifDirectoryBase.TAG_CFA_PATTERN_2));
        }
        if (intArray.length == 2) {
            int length = byteArray.length;
            int i2 = intArray[0];
            int i3 = intArray[1];
            if (length == i2 * i3) {
                int[] iArr = new int[byteArray.length + 2];
                iArr[0] = i2;
                iArr[1] = i3;
                for (int i4 = 0; i4 < byteArray.length; i4++) {
                    iArr[i4 + 2] = byteArray[i4] & 255;
                }
                return formatCFAPattern(iArr);
            }
        }
        return String.format("Unknown Pattern (%s)", super.getDescription(ExifDirectoryBase.TAG_CFA_PATTERN_2));
    }

    public String getCfaPatternDescription() {
        return formatCFAPattern(decodeCfaPattern(ExifDirectoryBase.TAG_CFA_PATTERN));
    }

    public String getColorSpaceDescription() {
        Integer integer = this._directory.getInteger(40961);
        if (integer == null) {
            return null;
        }
        return integer.intValue() == 1 ? "sRGB" : integer.intValue() == 65535 ? "Undefined" : "Unknown (" + integer + ")";
    }

    public String getComponentConfigurationDescription() {
        int[] intArray = this._directory.getIntArray(ExifDirectoryBase.TAG_COMPONENTS_CONFIGURATION);
        if (intArray == null) {
            return null;
        }
        String[] strArr = {"", "Y", "Cb", "Cr", "R", "G", "B"};
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < Math.min(4, intArray.length); i2++) {
            int i3 = intArray[i2];
            if (i3 > 0 && i3 < 7) {
                sb.append(strArr[i3]);
            }
        }
        return sb.toString();
    }

    public String getCompressedAverageBitsPerPixelDescription() {
        StringBuilder sbAppend;
        String str;
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_COMPRESSED_AVERAGE_BITS_PER_PIXEL);
        if (rational == null) {
            return null;
        }
        String simpleString = rational.toSimpleString(true);
        if (rational.isInteger() && rational.intValue() == 1) {
            sbAppend = new StringBuilder().append(simpleString);
            str = " bit/pixel";
        } else {
            sbAppend = new StringBuilder().append(simpleString);
            str = " bits/pixel";
        }
        return sbAppend.append(str).toString();
    }

    public String getCompressionDescription() {
        Integer integer = this._directory.getInteger(259);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 32766) {
            return "Next";
        }
        if (iIntValue == 32767) {
            return "Sony ARW Compressed";
        }
        switch (iIntValue) {
            case 1:
                return "Uncompressed";
            case 2:
                return "CCITT 1D";
            case 3:
                return "T4/Group 3 Fax";
            case 4:
                return "T6/Group 4 Fax";
            case 5:
                return "LZW";
            case 6:
                return "JPEG (old-style)";
            case 7:
                return "JPEG";
            case 8:
                return "Adobe Deflate";
            case 9:
                return "JBIG B&W";
            case 10:
                return "JBIG Color";
            default:
                switch (iIntValue) {
                    case 99:
                        return "JPEG";
                    case 262:
                        return "Kodak 262";
                    case 32809:
                        return "Thunderscan";
                    case 32867:
                        return "Kodak KDC Compressed";
                    case 34661:
                        return "JBIG";
                    case 34715:
                        return "JBIG2 TIFF FX";
                    case ExifInterface.DATA_LOSSY_JPEG /* 34892 */:
                        return "Lossy JPEG";
                    case 65000:
                        return "Kodak DCR Compressed";
                    case 65535:
                        return "Pentax PEF Compressed";
                    default:
                        switch (iIntValue) {
                            case PanasonicMakernoteDirectory.TAG_SCENE_MODE /* 32769 */:
                                return "Packed RAW";
                            case FujifilmMakernoteDirectory.TAG_ORDER_NUMBER /* 32770 */:
                                return "Samsung SRW Compressed";
                            case FujifilmMakernoteDirectory.TAG_FRAME_NUMBER /* 32771 */:
                                return "CCIRLEW";
                            case PanasonicMakernoteDirectory.TAG_WB_RED_LEVEL /* 32772 */:
                                return "Samsung SRW Compressed 2";
                            case 32773:
                                return "PackBits";
                            default:
                                switch (iIntValue) {
                                    case 32895:
                                        return "IT8CTPAD";
                                    case 32896:
                                        return "IT8LW";
                                    case 32897:
                                        return "IT8MP";
                                    case 32898:
                                        return "IT8BL";
                                    default:
                                        switch (iIntValue) {
                                            case 32908:
                                                return "PixarFilm";
                                            case 32909:
                                                return "PixarLog";
                                            default:
                                                switch (iIntValue) {
                                                    case 32946:
                                                        return "Deflate";
                                                    case 32947:
                                                        return "DCS";
                                                    default:
                                                        switch (iIntValue) {
                                                            case 34676:
                                                                return "SGILog";
                                                            case 34677:
                                                                return "SGILog24";
                                                            default:
                                                                switch (iIntValue) {
                                                                    case 34712:
                                                                        return "JPEG 2000";
                                                                    case 34713:
                                                                        return "Nikon NEF Compressed";
                                                                    default:
                                                                        switch (iIntValue) {
                                                                            case 34718:
                                                                                return "Microsoft Document Imaging (MDI) Binary Level Codec";
                                                                            case 34719:
                                                                                return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                                                                            case 34720:
                                                                                return "Microsoft Document Imaging (MDI) Vector";
                                                                            default:
                                                                                return "Unknown (" + integer + ")";
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public String getContrastDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_CONTRAST, "None", "Soft", "Hard");
    }

    public String getCustomRenderedDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_CUSTOM_RENDERED, "Normal process", "Custom process");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == 1) {
            return getInteropIndexDescription();
        }
        if (i2 == 2) {
            return getInteropVersionDescription();
        }
        if (i2 == 262) {
            return getPhotometricInterpretationDescription();
        }
        if (i2 == 263) {
            return getThresholdingDescription();
        }
        if (i2 == 338) {
            return getExtraSamplesDescription();
        }
        if (i2 == 339) {
            return getSampleFormatDescription();
        }
        switch (i2) {
            case 254:
                return getNewSubfileTypeDescription();
            case 255:
                return getSubfileTypeDescription();
            case 256:
                return getImageWidthDescription();
            case 257:
                return getImageHeightDescription();
            case 258:
                return getBitsPerSampleDescription();
            case 259:
                return getCompressionDescription();
            default:
                switch (i2) {
                    case 266:
                        return getFillOrderDescription();
                    case 274:
                        return getOrientationDescription();
                    case 296:
                        return getResolutionDescription();
                    case 512:
                        return getJpegProcDescription();
                    case ExifDirectoryBase.TAG_CFA_PATTERN_2 /* 33422 */:
                        return getCfaPattern2Description();
                    case ExifDirectoryBase.TAG_EXPOSURE_TIME /* 33434 */:
                        return getExposureTimeDescription();
                    case ExifDirectoryBase.TAG_FNUMBER /* 33437 */:
                        return getFNumberDescription();
                    case ExifDirectoryBase.TAG_EXPOSURE_PROGRAM /* 34850 */:
                        return getExposureProgramDescription();
                    case ExifDirectoryBase.TAG_ISO_EQUIVALENT /* 34855 */:
                        return getIsoEquivalentDescription();
                    case ExifDirectoryBase.TAG_SENSITIVITY_TYPE /* 34864 */:
                        return getSensitivityTypeRangeDescription();
                    case ExifDirectoryBase.TAG_EXIF_VERSION /* 36864 */:
                        return getExifVersionDescription();
                    case ExifDirectoryBase.TAG_SHUTTER_SPEED /* 37377 */:
                        return getShutterSpeedDescription();
                    case ExifDirectoryBase.TAG_APERTURE /* 37378 */:
                        return getApertureValueDescription();
                    case ExifDirectoryBase.TAG_BRIGHTNESS_VALUE /* 37379 */:
                        return getBrightnessValueDescription();
                    case ExifDirectoryBase.TAG_EXPOSURE_BIAS /* 37380 */:
                        return getExposureBiasDescription();
                    case ExifDirectoryBase.TAG_MAX_APERTURE /* 37381 */:
                        return getMaxApertureValueDescription();
                    case ExifDirectoryBase.TAG_SUBJECT_DISTANCE /* 37382 */:
                        return getSubjectDistanceDescription();
                    case ExifDirectoryBase.TAG_METERING_MODE /* 37383 */:
                        return getMeteringModeDescription();
                    case 37384:
                        return getWhiteBalanceDescription();
                    case ExifDirectoryBase.TAG_FLASH /* 37385 */:
                        return getFlashDescription();
                    case ExifDirectoryBase.TAG_FOCAL_LENGTH /* 37386 */:
                        return getFocalLengthDescription();
                    case ExifDirectoryBase.TAG_USER_COMMENT /* 37510 */:
                        return getUserCommentDescription();
                    case ExifDirectoryBase.TAG_WIN_TITLE /* 40091 */:
                        return getWindowsTitleDescription();
                    case ExifDirectoryBase.TAG_WIN_COMMENT /* 40092 */:
                        return getWindowsCommentDescription();
                    case ExifDirectoryBase.TAG_WIN_AUTHOR /* 40093 */:
                        return getWindowsAuthorDescription();
                    case ExifDirectoryBase.TAG_WIN_KEYWORDS /* 40094 */:
                        return getWindowsKeywordsDescription();
                    case ExifDirectoryBase.TAG_WIN_SUBJECT /* 40095 */:
                        return getWindowsSubjectDescription();
                    case ExifDirectoryBase.TAG_FLASHPIX_VERSION /* 40960 */:
                        return getFlashPixVersionDescription();
                    case 40961:
                        return getColorSpaceDescription();
                    case 40962:
                        return getExifImageWidthDescription();
                    case 40963:
                        return getExifImageHeightDescription();
                    case ExifDirectoryBase.TAG_FOCAL_PLANE_X_RESOLUTION /* 41486 */:
                        return getFocalPlaneXResolutionDescription();
                    case ExifDirectoryBase.TAG_FOCAL_PLANE_Y_RESOLUTION /* 41487 */:
                        return getFocalPlaneYResolutionDescription();
                    case ExifDirectoryBase.TAG_FOCAL_PLANE_RESOLUTION_UNIT /* 41488 */:
                        return getFocalPlaneResolutionUnitDescription();
                    case ExifDirectoryBase.TAG_SENSING_METHOD /* 41495 */:
                        return getSensingMethodDescription();
                    case ExifDirectoryBase.TAG_FILE_SOURCE /* 41728 */:
                        return getFileSourceDescription();
                    case ExifDirectoryBase.TAG_SCENE_TYPE /* 41729 */:
                        return getSceneTypeDescription();
                    case ExifDirectoryBase.TAG_CFA_PATTERN /* 41730 */:
                        return getCfaPatternDescription();
                    case ExifDirectoryBase.TAG_CUSTOM_RENDERED /* 41985 */:
                        return getCustomRenderedDescription();
                    case ExifDirectoryBase.TAG_EXPOSURE_MODE /* 41986 */:
                        return getExposureModeDescription();
                    case ExifDirectoryBase.TAG_WHITE_BALANCE_MODE /* 41987 */:
                        return getWhiteBalanceModeDescription();
                    case ExifDirectoryBase.TAG_DIGITAL_ZOOM_RATIO /* 41988 */:
                        return getDigitalZoomRatioDescription();
                    case ExifDirectoryBase.TAG_35MM_FILM_EQUIV_FOCAL_LENGTH /* 41989 */:
                        return get35mmFilmEquivFocalLengthDescription();
                    case ExifDirectoryBase.TAG_SCENE_CAPTURE_TYPE /* 41990 */:
                        return getSceneCaptureTypeDescription();
                    case ExifDirectoryBase.TAG_GAIN_CONTROL /* 41991 */:
                        return getGainControlDescription();
                    case ExifDirectoryBase.TAG_CONTRAST /* 41992 */:
                        return getContrastDescription();
                    case ExifDirectoryBase.TAG_SATURATION /* 41993 */:
                        return getSaturationDescription();
                    case ExifDirectoryBase.TAG_SHARPNESS /* 41994 */:
                        return getSharpnessDescription();
                    case ExifDirectoryBase.TAG_SUBJECT_DISTANCE_RANGE /* 41996 */:
                        return getSubjectDistanceRangeDescription();
                    case ExifDirectoryBase.TAG_LENS_SPECIFICATION /* 42034 */:
                        return getLensSpecificationDescription();
                    default:
                        switch (i2) {
                            case 277:
                                return getSamplesPerPixelDescription();
                            case 278:
                                return getRowsPerStripDescription();
                            case 279:
                                return getStripByteCountsDescription();
                            default:
                                switch (i2) {
                                    case 282:
                                        return getXResolutionDescription();
                                    case 283:
                                        return getYResolutionDescription();
                                    case 284:
                                        return getPlanarConfigurationDescription();
                                    default:
                                        switch (i2) {
                                            case 530:
                                                return getYCbCrSubsamplingDescription();
                                            case 531:
                                                return getYCbCrPositioningDescription();
                                            case 532:
                                                return getReferenceBlackWhiteDescription();
                                            default:
                                                switch (i2) {
                                                    case ExifDirectoryBase.TAG_COMPONENTS_CONFIGURATION /* 37121 */:
                                                        return getComponentConfigurationDescription();
                                                    case ExifDirectoryBase.TAG_COMPRESSED_AVERAGE_BITS_PER_PIXEL /* 37122 */:
                                                        return getCompressedAverageBitsPerPixelDescription();
                                                    default:
                                                        switch (i2) {
                                                            case ExifDirectoryBase.TAG_TEMPERATURE /* 37888 */:
                                                                return getTemperatureDescription();
                                                            case ExifDirectoryBase.TAG_HUMIDITY /* 37889 */:
                                                                return getHumidityDescription();
                                                            case ExifDirectoryBase.TAG_PRESSURE /* 37890 */:
                                                                return getPressureDescription();
                                                            case ExifDirectoryBase.TAG_WATER_DEPTH /* 37891 */:
                                                                return getWaterDepthDescription();
                                                            case ExifDirectoryBase.TAG_ACCELERATION /* 37892 */:
                                                                return getAccelerationDescription();
                                                            case ExifDirectoryBase.TAG_CAMERA_ELEVATION_ANGLE /* 37893 */:
                                                                return getCameraElevationAngleDescription();
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

    public String getDigitalZoomRatioDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_DIGITAL_ZOOM_RATIO);
        if (rational == null) {
            return null;
        }
        return rational.getNumerator() == 0 ? "Digital zoom not used" : new DecimalFormat("0.#").format(rational.doubleValue());
    }

    public String getExifImageHeightDescription() {
        Integer integer = this._directory.getInteger(40963);
        if (integer == null) {
            return null;
        }
        return integer + " pixels";
    }

    public String getExifImageWidthDescription() {
        Integer integer = this._directory.getInteger(40962);
        if (integer == null) {
            return null;
        }
        return integer + " pixels";
    }

    public String getExifVersionDescription() {
        return getVersionBytesDescription(ExifDirectoryBase.TAG_EXIF_VERSION, 2);
    }

    public String getExposureBiasDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_EXPOSURE_BIAS);
        if (rational == null) {
            return null;
        }
        return rational.toSimpleString(true) + " EV";
    }

    public String getExposureModeDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_EXPOSURE_MODE, "Auto exposure", "Manual exposure", "Auto bracket");
    }

    public String getExposureProgramDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_EXPOSURE_PROGRAM, 1, "Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode");
    }

    public String getExposureTimeDescription() {
        String string = this._directory.getString(ExifDirectoryBase.TAG_EXPOSURE_TIME);
        if (string == null) {
            return null;
        }
        return string + " sec";
    }

    public String getExtraSamplesDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_EXTRA_SAMPLES, "Unspecified", "Associated alpha", "Unassociated alpha");
    }

    public String getFNumberDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_FNUMBER);
        if (rational == null) {
            return null;
        }
        return getFStopDescription(rational.doubleValue());
    }

    public String getFileSourceDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_FILE_SOURCE, 1, "Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)");
    }

    public String getFillOrderDescription() {
        return getIndexedDescription(266, 1, ReactProgressBarViewManager.DEFAULT_STYLE, "Reversed");
    }

    public String getFlashDescription() {
        Integer integer = this._directory.getInteger(ExifDirectoryBase.TAG_FLASH);
        if (integer == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if ((-1) - (((-1) - integer.intValue()) | ((-1) - 1)) != 0) {
            sb.append("Flash fired");
        } else {
            sb.append("Flash did not fire");
        }
        int iIntValue = integer.intValue();
        if ((iIntValue + 4) - (iIntValue | 4) != 0) {
            if ((-1) - (((-1) - integer.intValue()) | ((-1) - 2)) != 0) {
                sb.append(", return detected");
            } else {
                sb.append(", return not detected");
            }
        }
        if ((-1) - (((-1) - integer.intValue()) | ((-1) - 16)) != 0) {
            int iIntValue2 = integer.intValue();
            if ((iIntValue2 + 15) - (iIntValue2 | 15) != 0) {
                sb.append(", auto");
            }
        }
        int iIntValue3 = integer.intValue();
        if ((iIntValue3 + 64) - (iIntValue3 | 64) != 0) {
            sb.append(", red-eye reduction");
        }
        return sb.toString();
    }

    public String getFlashPixVersionDescription() {
        return getVersionBytesDescription(ExifDirectoryBase.TAG_FLASHPIX_VERSION, 2);
    }

    public String getFocalLengthDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_FOCAL_LENGTH);
        if (rational == null) {
            return null;
        }
        return getFocalLengthDescription(rational.doubleValue());
    }

    public String getFocalPlaneResolutionUnitDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 1, "(No unit)", "Inches", "cm");
    }

    public String getFocalPlaneXResolutionDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_FOCAL_PLANE_X_RESOLUTION);
        if (rational == null) {
            return null;
        }
        String focalPlaneResolutionUnitDescription = getFocalPlaneResolutionUnitDescription();
        return rational.getReciprocal().toSimpleString(true) + (focalPlaneResolutionUnitDescription == null ? "" : Global.BLANK + focalPlaneResolutionUnitDescription.toLowerCase());
    }

    public String getFocalPlaneYResolutionDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_FOCAL_PLANE_Y_RESOLUTION);
        if (rational == null) {
            return null;
        }
        String focalPlaneResolutionUnitDescription = getFocalPlaneResolutionUnitDescription();
        return rational.getReciprocal().toSimpleString(true) + (focalPlaneResolutionUnitDescription == null ? "" : Global.BLANK + focalPlaneResolutionUnitDescription.toLowerCase());
    }

    public String getGainControlDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_GAIN_CONTROL, "None", "Low gain up", "Low gain down", "High gain up", "High gain down");
    }

    public String getHumidityDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_HUMIDITY);
        if (rational == null) {
            return null;
        }
        if (rational.getDenominator() == 4294967295L) {
            return "Unknown";
        }
        return new DecimalFormat("0.0").format(rational.doubleValue()) + " %";
    }

    public String getImageHeightDescription() {
        String string = this._directory.getString(257);
        if (string == null) {
            return null;
        }
        return string + " pixels";
    }

    public String getImageWidthDescription() {
        String string = this._directory.getString(256);
        if (string == null) {
            return null;
        }
        return string + " pixels";
    }

    public String getInteropIndexDescription() {
        String string = this._directory.getString(1);
        if (string == null) {
            return null;
        }
        return "R98".equalsIgnoreCase(string.trim()) ? "Recommended Exif Interoperability Rules (ExifR98)" : "Unknown (" + string + ")";
    }

    public String getInteropVersionDescription() {
        return getVersionBytesDescription(2, 2);
    }

    public String getIsoEquivalentDescription() {
        Integer integer = this._directory.getInteger(ExifDirectoryBase.TAG_ISO_EQUIVALENT);
        if (integer != null) {
            return Integer.toString(integer.intValue());
        }
        return null;
    }

    public String getJpegProcDescription() {
        Integer integer = this._directory.getInteger(512);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 1 ? iIntValue != 14 ? "Unknown (" + integer + ")" : "Lossless" : "Baseline";
    }

    public String getLensSpecificationDescription() {
        return getLensSpecificationDescription(ExifDirectoryBase.TAG_LENS_SPECIFICATION);
    }

    public String getMaxApertureValueDescription() {
        Double doubleObject = this._directory.getDoubleObject(ExifDirectoryBase.TAG_MAX_APERTURE);
        if (doubleObject == null) {
            return null;
        }
        return getFStopDescription(PhotographicConversions.apertureToFStop(doubleObject.doubleValue()));
    }

    public String getMeteringModeDescription() {
        Integer integer = this._directory.getInteger(ExifDirectoryBase.TAG_METERING_MODE);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 255) {
            return "(Other)";
        }
        switch (iIntValue) {
            case 0:
                return "Unknown";
            case 1:
                return "Average";
            case 2:
                return "Center weighted average";
            case 3:
                return "Spot";
            case 4:
                return "Multi-spot";
            case 5:
                return "Multi-segment";
            case 6:
                return "Partial";
            default:
                return "Unknown (" + integer + ")";
        }
    }

    public String getNewSubfileTypeDescription() {
        return getIndexedDescription(254, 0, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image");
    }

    public String getOrientationDescription() {
        return super.getOrientationDescription(274);
    }

    public String getPhotometricInterpretationDescription() {
        Integer integer = this._directory.getInteger(262);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        if (iIntValue == 32803) {
            return "Color Filter Array";
        }
        if (iIntValue == 32892) {
            return "Linear Raw";
        }
        switch (iIntValue) {
            case 0:
                return "WhiteIsZero";
            case 1:
                return "BlackIsZero";
            case 2:
                return "RGB";
            case 3:
                return "RGB Palette";
            case 4:
                return "Transparency Mask";
            case 5:
                return "CMYK";
            case 6:
                return "YCbCr";
            default:
                switch (iIntValue) {
                    case 8:
                        return "CIELab";
                    case 9:
                        return "ICCLab";
                    case 10:
                        return "ITULab";
                    default:
                        switch (iIntValue) {
                            case 32844:
                                return "Pixar LogL";
                            case 32845:
                                return "Pixar LogLuv";
                            default:
                                return "Unknown colour space";
                        }
                }
        }
    }

    public String getPlanarConfigurationDescription() {
        return getIndexedDescription(284, 1, "Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)");
    }

    public String getPressureDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_PRESSURE);
        if (rational == null) {
            return null;
        }
        if (rational.getDenominator() == 4294967295L) {
            return "Unknown";
        }
        return new DecimalFormat("0.0").format(rational.doubleValue()) + " hPa";
    }

    public String getReferenceBlackWhiteDescription() {
        int[] intArray = this._directory.getIntArray(532);
        if (intArray == null || intArray.length < 6) {
            Object object = this._directory.getObject(532);
            if (object == null || !(object instanceof long[])) {
                return null;
            }
            long[] jArr = (long[]) object;
            if (jArr.length < 6) {
                return null;
            }
            intArray = new int[jArr.length];
            for (int i2 = 0; i2 < jArr.length; i2++) {
                intArray[i2] = (int) jArr[i2];
            }
        }
        int i3 = intArray[0];
        int i4 = intArray[1];
        return String.format("[%d,%d,%d] [%d,%d,%d]", Integer.valueOf(i3), Integer.valueOf(intArray[2]), Integer.valueOf(intArray[4]), Integer.valueOf(i4), Integer.valueOf(intArray[3]), Integer.valueOf(intArray[5]));
    }

    public String getResolutionDescription() {
        return getIndexedDescription(296, 1, "(No unit)", "Inch", "cm");
    }

    public String getRowsPerStripDescription() {
        String string = this._directory.getString(278);
        if (string == null) {
            return null;
        }
        return string + " rows/strip";
    }

    public String getSampleFormatDescription() {
        int[] intArray = this._directory.getIntArray(ExifDirectoryBase.TAG_SAMPLE_FORMAT);
        if (intArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 : intArray) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            switch (i2) {
                case 1:
                    sb.append("Unsigned");
                    break;
                case 2:
                    sb.append("Signed");
                    break;
                case 3:
                    sb.append("Float");
                    break;
                case 4:
                    sb.append("Undefined");
                    break;
                case 5:
                    sb.append("Complex int");
                    break;
                case 6:
                    sb.append("Complex float");
                    break;
                default:
                    sb.append("Unknown (").append(i2).append(")");
                    break;
            }
        }
        return sb.toString();
    }

    public String getSamplesPerPixelDescription() {
        String string = this._directory.getString(277);
        if (string == null) {
            return null;
        }
        return string + " samples/pixel";
    }

    public String getSaturationDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SATURATION, "None", "Low saturation", "High saturation");
    }

    public String getSceneCaptureTypeDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SCENE_CAPTURE_TYPE, "Standard", "Landscape", "Portrait", "Night scene");
    }

    public String getSceneTypeDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SCENE_TYPE, 1, "Directly photographed image");
    }

    public String getSensingMethodDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SENSING_METHOD, 1, "(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", null, "Trilinear sensor", "Color sequential linear sensor");
    }

    public String getSensitivityTypeRangeDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SENSITIVITY_TYPE, "Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed");
    }

    public String getSharpnessDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SHARPNESS, "None", "Low", "Hard");
    }

    public String getShutterSpeedDescription() {
        return super.getShutterSpeedDescription(ExifDirectoryBase.TAG_SHUTTER_SPEED);
    }

    public String getStripByteCountsDescription() {
        String string = this._directory.getString(279);
        if (string == null) {
            return null;
        }
        return string + " bytes";
    }

    public String getSubfileTypeDescription() {
        return getIndexedDescription(255, 1, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image");
    }

    public String getSubjectDistanceDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_SUBJECT_DISTANCE);
        if (rational == null) {
            return null;
        }
        if (rational.getNumerator() == 4294967295L) {
            return "Infinity";
        }
        if (rational.getNumerator() == 0) {
            return "Unknown";
        }
        return new DecimalFormat("0.0##").format(rational.doubleValue()) + " metres";
    }

    public String getSubjectDistanceRangeDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_SUBJECT_DISTANCE_RANGE, "Unknown", "Macro", "Close view", "Distant view");
    }

    public String getTemperatureDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_TEMPERATURE);
        if (rational == null) {
            return null;
        }
        if (rational.getDenominator() == 4294967295L) {
            return "Unknown";
        }
        return new DecimalFormat("0.0").format(rational.doubleValue()) + " °C";
    }

    public String getThresholdingDescription() {
        return getIndexedDescription(263, 1, "No dithering or halftoning", "Ordered dither or halftone", "Randomized dither");
    }

    public String getUserCommentDescription() {
        return getEncodedTextDescription(ExifDirectoryBase.TAG_USER_COMMENT);
    }

    public String getWaterDepthDescription() {
        Rational rational = this._directory.getRational(ExifDirectoryBase.TAG_WATER_DEPTH);
        if (rational == null) {
            return null;
        }
        if (rational.getDenominator() == 4294967295L) {
            return "Unknown";
        }
        return new DecimalFormat("0.0##").format(rational.doubleValue()) + " metres";
    }

    public String getWhiteBalanceDescription() {
        Integer integer = this._directory.getInteger(37384);
        if (integer == null) {
            return null;
        }
        return getWhiteBalanceDescription(integer.intValue());
    }

    public String getWhiteBalanceModeDescription() {
        return getIndexedDescription(ExifDirectoryBase.TAG_WHITE_BALANCE_MODE, "Auto white balance", "Manual white balance");
    }

    public String getWindowsAuthorDescription() {
        return getUnicodeDescription(ExifDirectoryBase.TAG_WIN_AUTHOR);
    }

    public String getWindowsCommentDescription() {
        return getUnicodeDescription(ExifDirectoryBase.TAG_WIN_COMMENT);
    }

    public String getWindowsKeywordsDescription() {
        return getUnicodeDescription(ExifDirectoryBase.TAG_WIN_KEYWORDS);
    }

    public String getWindowsSubjectDescription() {
        return getUnicodeDescription(ExifDirectoryBase.TAG_WIN_SUBJECT);
    }

    public String getWindowsTitleDescription() {
        return getUnicodeDescription(ExifDirectoryBase.TAG_WIN_TITLE);
    }

    public String getXResolutionDescription() {
        Rational rational = this._directory.getRational(282);
        if (rational == null) {
            return null;
        }
        String resolutionDescription = getResolutionDescription();
        return String.format("%s dots per %s", rational.toSimpleString(true), resolutionDescription == null ? "unit" : resolutionDescription.toLowerCase());
    }

    public String getYCbCrPositioningDescription() {
        return getIndexedDescription(531, 1, "Center of pixel array", "Datum point");
    }

    public String getYCbCrSubsamplingDescription() {
        int[] intArray = this._directory.getIntArray(530);
        if (intArray == null || intArray.length < 2) {
            return null;
        }
        int i2 = intArray[0];
        return (i2 == 2 && intArray[1] == 1) ? "YCbCr4:2:2" : (i2 == 2 && intArray[1] == 2) ? "YCbCr4:2:0" : "(Unknown)";
    }

    public String getYResolutionDescription() {
        Rational rational = this._directory.getRational(283);
        if (rational == null) {
            return null;
        }
        String resolutionDescription = getResolutionDescription();
        return String.format("%s dots per %s", rational.toSimpleString(true), resolutionDescription == null ? "unit" : resolutionDescription.toLowerCase());
    }
}
