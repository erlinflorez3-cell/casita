package com.drew.metadata.mp4.media;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4MetaDirectory extends Mp4MediaDirectory {
    private static final HashMap<Integer, String> _tagNameMap;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        Mp4MediaDirectory.addMp4MediaTags(map);
    }

    public Mp4MetaDirectory() {
        setDescriptor(new Mp4MetaDescriptor(this));
    }

    @Override // com.drew.metadata.mp4.Mp4Directory, com.drew.metadata.Directory
    public String getName() {
        return "MP4 Metadata";
    }

    @Override // com.drew.metadata.mp4.Mp4Directory, com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
