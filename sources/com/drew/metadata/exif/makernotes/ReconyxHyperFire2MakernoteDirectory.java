package com.drew.metadata.exif.makernotes;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.Directory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ReconyxHyperFire2MakernoteDirectory extends Directory {
    public static final int TAG_AMBIENT_INFRARED = 92;
    public static final int TAG_AMBIENT_LIGHT = 94;
    public static final int TAG_AMBIENT_TEMPERATURE = 80;
    public static final int TAG_AMBIENT_TEMPERATURE_FAHRENHEIT = 78;
    public static final int TAG_BATTERY_TYPE = 102;
    public static final int TAG_BATTERY_VOLTAGE = 98;
    public static final int TAG_BATTERY_VOLTAGE_AVG = 100;
    public static final int TAG_BRIGHTNESS = 84;
    public static final int TAG_CONTRAST = 82;
    public static final int TAG_DATE_TIME_ORIGINAL = 62;
    public static final int TAG_DAY_OF_WEEK = 74;
    public static final int TAG_DIRECTORY_NUMBER = 18;
    public static final int TAG_EVENT_NUMBER = 58;
    public static final int TAG_FILE_NUMBER = 16;
    public static final int TAG_FIRMWARE_DATE = 48;
    public static final int TAG_FIRMWARE_VERSION = 42;
    public static final int TAG_FLASH = 90;
    public static final int TAG_MOON_PHASE = 76;
    public static final int TAG_MOTION_SENSITIVITY = 96;
    public static final int TAG_SATURATION = 88;
    public static final int TAG_SEQUENCE = 54;
    public static final int TAG_SERIAL_NUMBER = 126;
    public static final int TAG_SHARPNESS = 86;
    public static final int TAG_TRIGGER_MODE = 52;
    public static final int TAG_USER_LABEL = 104;
    private static final HashMap<Integer, String> _tagNameMap;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        map.put(16, "File Number");
        map.put(18, "Directory Number");
        map.put(42, "Firmware Version");
        map.put(48, "Firmware Date");
        map.put(52, "Trigger Mode");
        map.put(54, "Sequence");
        map.put(58, "Event Number");
        map.put(62, "Date/Time Original");
        map.put(74, "DaY of Week");
        map.put(76, "Moon Phase");
        map.put(78, "Ambient Temperature Fahrenheit");
        map.put(80, "Ambient Temperature");
        map.put(82, ExifInterface.TAG_CONTRAST);
        map.put(84, "Brightness");
        map.put(86, ExifInterface.TAG_SHARPNESS);
        map.put(88, ExifInterface.TAG_SATURATION);
        map.put(90, ExifInterface.TAG_FLASH);
        map.put(92, "Ambient Infrared");
        map.put(94, "Ambient Light");
        map.put(96, "Motion Sensitivity");
        map.put(98, "Battery Voltage");
        map.put(100, "Battery Voltage Average");
        map.put(102, "Battery Type");
        map.put(104, "User Label");
        map.put(126, "Serial Number");
    }

    public ReconyxHyperFire2MakernoteDirectory() {
        setDescriptor(new ReconyxHyperFire2MakernoteDescriptor(this));
    }

    @Override // com.drew.metadata.Directory
    public String getName() {
        return "Reconyx HyperFire 2 Makernote";
    }

    @Override // com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
