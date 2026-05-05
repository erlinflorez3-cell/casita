package com.drew.metadata.exif;

import com.drew.metadata.Directory;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class ExifSubIFDDirectory extends ExifDirectoryBase {
    public static final int TAG_INTEROP_OFFSET = 40965;
    private static final HashMap<Integer, String> _tagNameMap;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        addExifTagNames(map);
    }

    public ExifSubIFDDirectory() {
        setDescriptor(new ExifSubIFDDescriptor(this));
    }

    private TimeZone getTimeZone(int i2) {
        String string = getString(i2);
        if (string == null || !string.matches("[\\+\\-]\\d\\d:\\d\\d")) {
            return null;
        }
        return TimeZone.getTimeZone("GMT" + string);
    }

    public Date getDateDigitized() {
        return getDateDigitized(null);
    }

    public Date getDateDigitized(TimeZone timeZone) {
        TimeZone timeZone2 = getTimeZone(ExifDirectoryBase.TAG_TIME_ZONE_DIGITIZED);
        String string = getString(ExifDirectoryBase.TAG_SUBSECOND_TIME_DIGITIZED);
        if (timeZone2 != null) {
            timeZone = timeZone2;
        }
        return getDate(ExifDirectoryBase.TAG_DATETIME_DIGITIZED, string, timeZone);
    }

    public Date getDateModified() {
        return getDateModified(null);
    }

    public Date getDateModified(TimeZone timeZone) {
        Directory parent = getParent();
        if (!(parent instanceof ExifIFD0Directory)) {
            return null;
        }
        TimeZone timeZone2 = getTimeZone(ExifDirectoryBase.TAG_TIME_ZONE);
        String string = getString(ExifDirectoryBase.TAG_SUBSECOND_TIME);
        if (timeZone2 != null) {
            timeZone = timeZone2;
        }
        return parent.getDate(306, string, timeZone);
    }

    public Date getDateOriginal() {
        return getDateOriginal(null);
    }

    public Date getDateOriginal(TimeZone timeZone) {
        TimeZone timeZone2 = getTimeZone(ExifDirectoryBase.TAG_TIME_ZONE_ORIGINAL);
        String string = getString(ExifDirectoryBase.TAG_SUBSECOND_TIME_ORIGINAL);
        if (timeZone2 != null) {
            timeZone = timeZone2;
        }
        return getDate(ExifDirectoryBase.TAG_DATETIME_ORIGINAL, string, timeZone);
    }

    @Override // com.drew.metadata.Directory
    public String getName() {
        return "Exif SubIFD";
    }

    @Override // com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
