package com.drew.metadata.exif.makernotes;

import com.drew.metadata.Directory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class AppleRunTimeMakernoteDirectory extends Directory {
    public static final int CMTimeEpoch = 2;
    public static final int CMTimeFlags = 1;
    public static final int CMTimeScale = 3;
    public static final int CMTimeValue = 4;
    protected static final HashMap<Integer, String> _tagNameMap;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        map.put(1, "Flags");
        map.put(2, "Epoch");
        map.put(3, "Scale");
        map.put(4, "Value");
    }

    public AppleRunTimeMakernoteDirectory() {
        super.setDescriptor(new AppleRunTimeMakernoteDescriptor(this));
    }

    @Override // com.drew.metadata.Directory
    public String getName() {
        return "Apple Run Time";
    }

    @Override // com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
