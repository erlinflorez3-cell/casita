package com.drew.metadata.exif.makernotes;

import com.drew.metadata.Directory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class AppleMakernoteDirectory extends Directory {
    public static final int TAG_ACCELERATION_VECTOR = 8;
    public static final int TAG_BURST_UUID = 11;
    public static final int TAG_CONTENT_IDENTIFIER = 17;
    public static final int TAG_HDR_IMAGE_TYPE = 10;
    public static final int TAG_IMAGE_UNIQUE_ID = 21;
    public static final int TAG_LIVE_PHOTO_ID = 23;
    public static final int TAG_RUN_TIME = 3;
    private static final HashMap<Integer, String> _tagNameMap;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        map.put(3, "Run Time");
        map.put(8, "Acceleration Vector");
        map.put(10, "HDR Image Type");
        map.put(11, "Burst UUID");
        map.put(17, "Content Identifier");
        map.put(21, "Image Unique ID");
        map.put(23, "Live Photo ID");
    }

    public AppleMakernoteDirectory() {
        setDescriptor(new AppleMakernoteDescriptor(this));
    }

    @Override // com.drew.metadata.Directory
    public String getName() {
        return "Apple Makernote";
    }

    @Override // com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
