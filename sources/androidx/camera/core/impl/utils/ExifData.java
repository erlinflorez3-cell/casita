package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.Preconditions;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public class ExifData {
    private static final boolean DEBUG = false;
    static final ExifTag[] EXIF_POINTER_TAGS;
    static final ExifTag[][] EXIF_TAGS;
    private static final ExifTag[] IFD_EXIF_TAGS;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final String TAG = "ExifData";
    static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final HashSet<String> sTagSetForCompatibility;
    private final List<Map<String, ExifAttribute>> mAttributes;
    private final ByteOrder mByteOrder;

    /* JADX INFO: loaded from: classes.dex */
    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(ExifInterface.TAG_MAKE, 271, 2), new ExifTag(ExifInterface.TAG_MODEL, 272, 2), new ExifTag(ExifInterface.TAG_ORIENTATION, 274, 3), new ExifTag(ExifInterface.TAG_X_RESOLUTION, 282, 5), new ExifTag(ExifInterface.TAG_Y_RESOLUTION, 283, 5), new ExifTag(ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(ExifInterface.TAG_SOFTWARE, 305, 2), new ExifTag(ExifInterface.TAG_DATETIME, 306, 2), new ExifTag(ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_SUB_IFD_POINTER, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 4), new ExifTag(TAG_EXIF_IFD_POINTER, ExifIFD0Directory.TAG_EXIF_SUB_IFD_OFFSET, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, ExifIFD0Directory.TAG_GPS_INFO_OFFSET, 4)};
        IFD_TIFF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(ExifInterface.TAG_EXPOSURE_TIME, ExifDirectoryBase.TAG_EXPOSURE_TIME, 5), new ExifTag(ExifInterface.TAG_F_NUMBER, ExifDirectoryBase.TAG_FNUMBER, 5), new ExifTag(ExifInterface.TAG_EXPOSURE_PROGRAM, ExifDirectoryBase.TAG_EXPOSURE_PROGRAM, 3), new ExifTag(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifDirectoryBase.TAG_ISO_EQUIVALENT, 3), new ExifTag(ExifInterface.TAG_SENSITIVITY_TYPE, ExifDirectoryBase.TAG_SENSITIVITY_TYPE, 3), new ExifTag(ExifInterface.TAG_EXIF_VERSION, ExifDirectoryBase.TAG_EXIF_VERSION, 2), new ExifTag(ExifInterface.TAG_DATETIME_ORIGINAL, ExifDirectoryBase.TAG_DATETIME_ORIGINAL, 2), new ExifTag(ExifInterface.TAG_DATETIME_DIGITIZED, ExifDirectoryBase.TAG_DATETIME_DIGITIZED, 2), new ExifTag(ExifInterface.TAG_COMPONENTS_CONFIGURATION, ExifDirectoryBase.TAG_COMPONENTS_CONFIGURATION, 7), new ExifTag(ExifInterface.TAG_SHUTTER_SPEED_VALUE, ExifDirectoryBase.TAG_SHUTTER_SPEED, 10), new ExifTag(ExifInterface.TAG_APERTURE_VALUE, ExifDirectoryBase.TAG_APERTURE, 5), new ExifTag(ExifInterface.TAG_BRIGHTNESS_VALUE, ExifDirectoryBase.TAG_BRIGHTNESS_VALUE, 10), new ExifTag(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, ExifDirectoryBase.TAG_EXPOSURE_BIAS, 10), new ExifTag(ExifInterface.TAG_MAX_APERTURE_VALUE, ExifDirectoryBase.TAG_MAX_APERTURE, 5), new ExifTag(ExifInterface.TAG_METERING_MODE, ExifDirectoryBase.TAG_METERING_MODE, 3), new ExifTag(ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(ExifInterface.TAG_FLASH, ExifDirectoryBase.TAG_FLASH, 3), new ExifTag(ExifInterface.TAG_FOCAL_LENGTH, ExifDirectoryBase.TAG_FOCAL_LENGTH, 5), new ExifTag(ExifInterface.TAG_SUBSEC_TIME, ExifDirectoryBase.TAG_SUBSECOND_TIME, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifDirectoryBase.TAG_SUBSECOND_TIME_ORIGINAL, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifDirectoryBase.TAG_SUBSECOND_TIME_DIGITIZED, 2), new ExifTag(ExifInterface.TAG_FLASHPIX_VERSION, ExifDirectoryBase.TAG_FLASHPIX_VERSION, 7), new ExifTag(ExifInterface.TAG_COLOR_SPACE, 40961, 3), new ExifTag(ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, ExifDirectoryBase.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 3), new ExifTag(ExifInterface.TAG_SENSING_METHOD, ExifDirectoryBase.TAG_SENSING_METHOD, 3), new ExifTag(ExifInterface.TAG_FILE_SOURCE, ExifDirectoryBase.TAG_FILE_SOURCE, 7), new ExifTag(ExifInterface.TAG_SCENE_TYPE, ExifDirectoryBase.TAG_SCENE_TYPE, 7), new ExifTag(ExifInterface.TAG_CUSTOM_RENDERED, ExifDirectoryBase.TAG_CUSTOM_RENDERED, 3), new ExifTag(ExifInterface.TAG_EXPOSURE_MODE, ExifDirectoryBase.TAG_EXPOSURE_MODE, 3), new ExifTag(ExifInterface.TAG_WHITE_BALANCE, ExifDirectoryBase.TAG_WHITE_BALANCE_MODE, 3), new ExifTag(ExifInterface.TAG_SCENE_CAPTURE_TYPE, ExifDirectoryBase.TAG_SCENE_CAPTURE_TYPE, 3), new ExifTag(ExifInterface.TAG_CONTRAST, ExifDirectoryBase.TAG_CONTRAST, 3), new ExifTag(ExifInterface.TAG_SATURATION, ExifDirectoryBase.TAG_SATURATION, 3), new ExifTag(ExifInterface.TAG_SHARPNESS, ExifDirectoryBase.TAG_SHARPNESS, 3)};
        IFD_EXIF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new ExifTag(ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new ExifTag(ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new ExifTag(ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new ExifTag(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        IFD_GPS_TAGS = exifTagArr3;
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag(TAG_SUB_IFD_POINTER, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 4), new ExifTag(TAG_EXIF_IFD_POINTER, ExifIFD0Directory.TAG_EXIF_SUB_IFD_OFFSET, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, ExifIFD0Directory.TAG_GPS_INFO_OFFSET, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4)};
        ExifTag[] exifTagArr4 = {new ExifTag(ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        sTagSetForCompatibility = new HashSet<>(Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_GPS_TIMESTAMP));
    }

    ExifData(ByteOrder byteOrder, List<Map<String, ExifAttribute>> list) {
        Preconditions.checkState(list.size() == EXIF_TAGS.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.mByteOrder = byteOrder;
        this.mAttributes = list;
    }

    public static ExifData create(ImageProxy imageProxy, int i2) {
        Builder builderBuilderForDevice = builderForDevice();
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builderBuilderForDevice);
        }
        builderBuilderForDevice.setOrientationDegrees(i2);
        return builderBuilderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    public ByteOrder getByteOrder() {
        return this.mByteOrder;
    }

    Map<String, ExifAttribute> getAttributes(int i2) {
        Preconditions.checkArgumentInRange(i2, 0, EXIF_TAGS.length, "Invalid IFD index: " + i2 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.mAttributes.get(i2);
    }

    public String getAttribute(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mByteOrder);
            }
            if (str.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                if (exifAttribute.format != 5 && exifAttribute.format != 10) {
                    Logger.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                LongRational[] longRationalArr = (LongRational[]) exifAttribute.getValue(this.mByteOrder);
                if (longRationalArr == null || longRationalArr.length != 3) {
                    Logger.w(TAG, "Invalid GPS Timestamp array. array=" + Arrays.toString(longRationalArr));
                    return null;
                }
                return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (longRationalArr[0].getNumerator() / longRationalArr[0].getDenominator())), Integer.valueOf((int) (longRationalArr[1].getNumerator() / longRationalArr[1].getDenominator())), Integer.valueOf((int) (longRationalArr[2].getNumerator() / longRationalArr[2].getDenominator())));
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private ExifAttribute getExifAttribute(String str) {
        if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            ExifAttribute exifAttribute = this.mAttributes.get(i2).get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public static Builder builderForDevice() {
        return new Builder(ByteOrder.BIG_ENDIAN).setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(1)).setAttribute(ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_RESOLUTION_UNIT, String.valueOf(2)).setAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING, String.valueOf(1)).setAttribute(ExifInterface.TAG_MAKE, Build.MANUFACTURER).setAttribute(ExifInterface.TAG_MODEL, Build.MODEL);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        final List<Map<String, ExifAttribute>> mAttributes = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int mIfdIndex = 0;

            AnonymousClass2() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public Map<String, ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new HashMap();
            }
        });
        private final ByteOrder mByteOrder;
        private static final Pattern GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final List<HashMap<String, ExifTag>> sExifTagMapsForWriting = Collections.list(new Enumeration<HashMap<String, ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int mIfdIndex = 0;

            AnonymousClass1() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> map = new HashMap<>();
                for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    map.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return map;
            }
        });

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$Builder$1 */
        class AnonymousClass1 implements Enumeration<HashMap<String, ExifTag>> {
            int mIfdIndex = 0;

            AnonymousClass1() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> map = new HashMap<>();
                for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    map.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return map;
            }
        }

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$Builder$2 */
        class AnonymousClass2 implements Enumeration<Map<String, ExifAttribute>> {
            int mIfdIndex = 0;

            AnonymousClass2() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public Map<String, ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new HashMap();
            }
        }

        Builder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public Builder setImageWidth(int i2) {
            return setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i2));
        }

        public Builder setImageHeight(int i2) {
            return setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
        }

        public Builder setOrientationDegrees(int i2) {
            int i3;
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == 90) {
                i3 = 6;
            } else if (i2 == 180) {
                i3 = 3;
            } else if (i2 != 270) {
                Logger.w(ExifData.TAG, "Unexpected orientation value: " + i2 + ". Must be one of 0, 90, 180, 270.");
                i3 = 0;
            } else {
                i3 = 8;
            }
            return setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i3));
        }

        public Builder setFlashState(CameraCaptureMetaData.FlashState flashState) {
            int i2;
            if (flashState == CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i3 = AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[flashState.ordinal()];
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 2) {
                i2 = 32;
            } else {
                if (i3 != 3) {
                    Logger.w(ExifData.TAG, "Unknown flash state: " + flashState);
                    return this;
                }
                i2 = 1;
            }
            if ((1 & i2) == 1) {
                setAttribute(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(4));
            }
            return setAttribute(ExifInterface.TAG_FLASH, String.valueOf(i2));
        }

        public Builder setExposureTimeNanos(long j2) {
            return setAttribute(ExifInterface.TAG_EXPOSURE_TIME, String.valueOf(j2 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public Builder setLensFNumber(float f2) {
            return setAttribute(ExifInterface.TAG_F_NUMBER, String.valueOf(f2));
        }

        public Builder setIso(int i2) {
            return setAttribute(ExifInterface.TAG_SENSITIVITY_TYPE, String.valueOf(3)).setAttribute(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, String.valueOf(Math.min(65535, i2)));
        }

        public Builder setFocalLength(float f2) {
            return setAttribute(ExifInterface.TAG_FOCAL_LENGTH, new LongRational((long) (f2 * 1000.0f), 1000L).toString());
        }

        public Builder setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode) {
            String strValueOf;
            int iOrdinal = whiteBalanceMode.ordinal();
            if (iOrdinal == 0) {
                strValueOf = String.valueOf(0);
            } else {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            }
            return setAttribute(ExifInterface.TAG_WHITE_BALANCE, strValueOf);
        }

        public Builder setAttribute(String str, String str2) {
            setAttributeInternal(str, str2, this.mAttributes);
            return this;
        }

        public Builder removeAttribute(String str) {
            setAttributeInternal(str, null, this.mAttributes);
            return this;
        }

        private void setAttributeIfMissing(String str, String str2, List<Map<String, ExifAttribute>> list) {
            Iterator<Map<String, ExifAttribute>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, list);
        }

        private void setAttributeInternal(String str, String str2, List<Map<String, ExifAttribute>> list) {
            int i2;
            String str3 = str;
            String strReplaceAll = str2;
            Builder builder = this;
            if ((ExifInterface.TAG_DATETIME.equals(str3) || ExifInterface.TAG_DATETIME_ORIGINAL.equals(str3) || ExifInterface.TAG_DATETIME_DIGITIZED.equals(str3)) && strReplaceAll != null) {
                boolean zFind = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
                boolean zFind2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
                if (strReplaceAll.length() == 19 && (zFind || zFind2)) {
                    if (zFind2) {
                        strReplaceAll = strReplaceAll.replaceAll(Global.HYPHEN, Global.COLON);
                    }
                } else {
                    Logger.w(ExifData.TAG, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
            if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str3)) {
                str3 = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            int i3 = 2;
            int i4 = 1;
            if (strReplaceAll != null && ExifData.sTagSetForCompatibility.contains(str3)) {
                if (str3.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                    Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        Logger.w(ExifData.TAG, "Invalid value for " + str3 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(1))) + "/1," + Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(2))) + "/1," + Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new LongRational(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e2) {
                        Logger.w(ExifData.TAG, "Invalid value for " + str3 + " : " + strReplaceAll, e2);
                        return;
                    }
                }
            }
            int i5 = 0;
            int i6 = 0;
            while (i6 < ExifData.EXIF_TAGS.length) {
                ExifTag exifTag = sExifTagMapsForWriting.get(i6).get(str3);
                if (exifTag != null) {
                    if (strReplaceAll == null) {
                        list.get(i6).remove(str3);
                    } else {
                        Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strReplaceAll);
                        if (exifTag.primaryFormat == ((Integer) pairGuessDataFormat.first).intValue() || exifTag.primaryFormat == ((Integer) pairGuessDataFormat.second).intValue()) {
                            i2 = exifTag.primaryFormat;
                        } else if (exifTag.secondaryFormat != -1 && (exifTag.secondaryFormat == ((Integer) pairGuessDataFormat.first).intValue() || exifTag.secondaryFormat == ((Integer) pairGuessDataFormat.second).intValue())) {
                            i2 = exifTag.secondaryFormat;
                        } else if (exifTag.primaryFormat == i4 || exifTag.primaryFormat == 7 || exifTag.primaryFormat == i3) {
                            i2 = exifTag.primaryFormat;
                        }
                        switch (i2) {
                            case 1:
                                list.get(i6).put(str3, ExifAttribute.createByte(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                list.get(i6).put(str3, ExifAttribute.createString(strReplaceAll));
                                continue;
                            case 3:
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                                    iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                }
                                list.get(i6).put(str3, ExifAttribute.createUShort(iArr, builder.mByteOrder));
                                continue;
                            case 4:
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i8 = 0; i8 < strArrSplit2.length; i8++) {
                                    jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                }
                                list.get(i6).put(str3, ExifAttribute.createULong(jArr, builder.mByteOrder));
                                continue;
                            case 5:
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                LongRational[] longRationalArr = new LongRational[strArrSplit3.length];
                                int i9 = i5;
                                while (i9 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i9].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                    longRationalArr[i9] = new LongRational((long) Double.parseDouble(strArrSplit4[i5]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i9++;
                                    i5 = 0;
                                }
                                i4 = 1;
                                list.get(i6).put(str3, ExifAttribute.createURational(longRationalArr, builder.mByteOrder));
                                continue;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                while (i5 < strArrSplit5.length) {
                                    iArr2[i5] = Integer.parseInt(strArrSplit5[i5]);
                                    i5++;
                                }
                                list.get(i6).put(str3, ExifAttribute.createSLong(iArr2, builder.mByteOrder));
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                LongRational[] longRationalArr2 = new LongRational[strArrSplit6.length];
                                int i10 = i5;
                                while (i10 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i10].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                    longRationalArr2[i10] = new LongRational((long) Double.parseDouble(strArrSplit7[i5]), (long) Double.parseDouble(strArrSplit7[i4]));
                                    i10++;
                                    i4 = 1;
                                }
                                builder = this;
                                list.get(i6).put(str3, ExifAttribute.createSRational(longRationalArr2, builder.mByteOrder));
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                while (i5 < strArrSplit8.length) {
                                    dArr[i5] = Double.parseDouble(strArrSplit8[i5]);
                                    i5++;
                                }
                                list.get(i6).put(str3, ExifAttribute.createDouble(dArr, builder.mByteOrder));
                                continue;
                        }
                        i4 = 1;
                    }
                }
                i6++;
                i3 = 2;
                i5 = 0;
            }
        }

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$Builder$3 */
        class AnonymousClass3 implements Enumeration<Map<String, ExifAttribute>> {
            final Enumeration<Map<String, ExifAttribute>> mMapEnumeration;

            AnonymousClass3() {
                this.mMapEnumeration = Collections.enumeration(Builder.this.mAttributes);
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mMapEnumeration.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public Map<String, ExifAttribute> nextElement() {
                return new HashMap(this.mMapEnumeration.nextElement());
            }
        }

        public ExifData build() {
            ArrayList list = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final Enumeration<Map<String, ExifAttribute>> mMapEnumeration;

                AnonymousClass3() {
                    this.mMapEnumeration = Collections.enumeration(Builder.this.mAttributes);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public Map<String, ExifAttribute> nextElement() {
                    return new HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_EXPOSURE_PROGRAM, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_EXIF_VERSION, "0230", list);
                setAttributeIfMissing(ExifInterface.TAG_COMPONENTS_CONFIGURATION, "1,2,3,0", list);
                setAttributeIfMissing(ExifInterface.TAG_METERING_MODE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                setAttributeIfMissing(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, String.valueOf(2), list);
                setAttributeIfMissing(ExifInterface.TAG_FILE_SOURCE, String.valueOf(3), list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_TYPE, String.valueOf(1), list);
                setAttributeIfMissing(ExifInterface.TAG_CUSTOM_RENDERED, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_CAPTURE_TYPE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_CONTRAST, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SATURATION, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SHARPNESS, String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new ExifData(this.mByteOrder, list);
        }

        private static Pair<Integer, Integer> guessDataFormat(String str) {
            int iIntValue;
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strArrSplit[0]);
                if (((Integer) pairGuessDataFormat.first).intValue() == 2) {
                    return pairGuessDataFormat;
                }
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    Pair<Integer, Integer> pairGuessDataFormat2 = guessDataFormat(strArrSplit[i2]);
                    if (!((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.first) && !((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.first)) {
                        iIntValue = -1;
                    } else {
                        iIntValue = ((Integer) pairGuessDataFormat.first).intValue();
                    }
                    int iIntValue2 = (((Integer) pairGuessDataFormat.second).intValue() == -1 || !(((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.second) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.second))) ? -1 : ((Integer) pairGuessDataFormat.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairGuessDataFormat;
            }
            if (str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                String[] strArrSplit2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                if (strArrSplit2.length == 2) {
                    try {
                        long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                        long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                        if (j2 >= 0 && j3 >= 0) {
                            if (j2 <= 2147483647L && j3 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            }
            try {
                try {
                    long j4 = Long.parseLong(str);
                    if (j4 >= 0 && j4 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new Pair<>(3, 4);
                    }
                    if (j4 < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$1 */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState;

        static {
            int[] iArr = new int[CameraCaptureMetaData.FlashState.values().length];
            $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = iArr;
            try {
                iArr[CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
