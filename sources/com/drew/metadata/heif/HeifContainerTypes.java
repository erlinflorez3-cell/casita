package com.drew.metadata.heif;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class HeifContainerTypes {
    public static final String BOX_IMAGE_PROPERTY = "iprp";
    public static final String BOX_ITEM_PROPERTY = "ipco";
    public static final String BOX_MEDIA_DATA = "mdat";
    public static final String BOX_METADATA = "meta";
    private static final ArrayList<String> _containerList;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        _containerList = arrayList;
        arrayList.add("meta");
        arrayList.add(BOX_IMAGE_PROPERTY);
        arrayList.add(BOX_ITEM_PROPERTY);
    }
}
