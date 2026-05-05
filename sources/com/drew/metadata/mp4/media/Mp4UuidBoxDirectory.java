package com.drew.metadata.mp4.media;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4UuidBoxDirectory extends Mp4MediaDirectory {
    public static final Integer TAG_USER_DATA;
    public static final Integer TAG_UUID = 901;
    private static final HashMap<Integer, String> _tagNameMap;

    static {
        Integer numValueOf = Integer.valueOf(TypedValues.Custom.TYPE_COLOR);
        TAG_USER_DATA = numValueOf;
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        addMp4MediaTags(map);
        map.put(901, "UUID");
        map.put(numValueOf, "Data");
    }

    public Mp4UuidBoxDirectory() {
        setDescriptor(new Mp4UuidBoxDescriptor(this));
    }

    @Override // com.drew.metadata.mp4.Mp4Directory, com.drew.metadata.Directory
    public String getName() {
        return "UUID";
    }

    @Override // com.drew.metadata.mp4.Mp4Directory, com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
