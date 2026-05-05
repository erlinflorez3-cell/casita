package com.drew.metadata.exif.makernotes;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.Directory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SamsungType2MakernoteDirectory extends Directory {
    public static final int TagCameraTemperature = 67;
    public static final int TagColorSpace = 40977;
    public static final int TagDeviceType = 2;
    public static final int TagEncryptionKey = 40992;
    public static final int TagExposureCompensation = 40979;
    public static final int TagExposureTime = 40984;
    public static final int TagFNumber = 40985;
    public static final int TagFaceDetect = 256;
    public static final int TagFaceName = 291;
    public static final int TagFaceRecognition = 288;
    public static final int TagFirmwareName = 40961;
    public static final int TagFocalLengthIn35mmFormat = 40986;
    public static final int TagISO = 40980;
    public static final int TagInternalLensSerialNumber = 40965;
    public static final int TagLensFirmware = 40964;
    public static final int TagLensType = 40963;
    public static final int TagLocalLocationName = 48;
    public static final int TagMakerNoteVersion = 1;
    public static final int TagOrientationInfo = 17;
    public static final int TagPictureWizard = 33;
    public static final int TagPreviewIfd = 53;
    public static final int TagRawDataByteOrder = 64;
    public static final int TagRawDataCFAPattern = 80;
    public static final int TagSamsungModelId = 3;
    public static final int TagSensorAreas = 40976;
    public static final int TagSerialNumber = 40962;
    public static final int TagSmartAlbumColor = 32;
    public static final int TagSmartRange = 40978;
    public static final int TagWhiteBalanceSetup = 65;
    private static final HashMap<Integer, String> _tagNameMap;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        map.put(1, "Maker Note Version");
        map.put(2, "Device Type");
        map.put(3, "Model Id");
        map.put(17, "Orientation Info");
        map.put(32, "Smart Album Color");
        map.put(33, "Picture Wizard");
        map.put(48, "Local Location Name");
        map.put(53, "Preview IFD");
        map.put(64, "Raw Data Byte Order");
        map.put(65, "White Balance Setup");
        map.put(67, "Camera Temperature");
        map.put(80, "Raw Data CFA Pattern");
        map.put(256, "Face Detect");
        map.put(288, "Face Recognition");
        map.put(291, "Face Name");
        map.put(40961, "Firmware Name");
        map.put(40962, "Serial Number");
        map.put(40963, "Lens Type");
        map.put(40964, "Lens Firmware");
        map.put(40965, "Internal Lens Serial Number");
        map.put(Integer.valueOf(TagSensorAreas), "Sensor Areas");
        map.put(Integer.valueOf(TagColorSpace), "Color Space");
        map.put(Integer.valueOf(TagSmartRange), "Smart Range");
        map.put(Integer.valueOf(TagExposureCompensation), "Exposure Compensation");
        map.put(Integer.valueOf(TagISO), ExifInterface.TAG_RW2_ISO);
        map.put(Integer.valueOf(TagExposureTime), "Exposure Time");
        map.put(Integer.valueOf(TagFNumber), "F-Number");
        map.put(Integer.valueOf(TagFocalLengthIn35mmFormat), "Focal Length in 35mm Format");
        map.put(Integer.valueOf(TagEncryptionKey), "Encryption Key");
    }

    public SamsungType2MakernoteDirectory() {
        setDescriptor(new SamsungType2MakernoteDescriptor(this));
    }

    @Override // com.drew.metadata.Directory
    public String getName() {
        return "Samsung Makernote";
    }

    @Override // com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
