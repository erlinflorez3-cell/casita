package com.drew.metadata.mov;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeAtomTypes {
    public static final String ATOM_ADOBE_XMP = "XMP_";
    public static final String ATOM_BASE_MEDIA_INFO = "gmhd";
    public static final String ATOM_CANON_THUMBNAIL = "CNTH";
    public static final String ATOM_DATA = "data";
    public static final String ATOM_FILE_TYPE = "ftyp";
    public static final String ATOM_HANDLER = "hdlr";
    public static final String ATOM_KEYS = "keys";
    public static final String ATOM_MEDIA_HEADER = "mdhd";
    public static final String ATOM_MOVIE_HEADER = "mvhd";
    public static final String ATOM_SAMPLE_DESCRIPTION = "stsd";
    public static final String ATOM_SOUND_MEDIA_INFO = "smhd";
    public static final String ATOM_TIMECODE_MEDIA_INFO = "tcmi";
    public static final String ATOM_TIME_TO_SAMPLE = "stts";
    public static final String ATOM_TRACK_HEADER = "tkhd";
    public static final String ATOM_VIDEO_MEDIA_INFO = "vmhd";
    private static final ArrayList<String> _atomList;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        _atomList = arrayList;
        arrayList.add("ftyp");
        arrayList.add("mvhd");
        arrayList.add("vmhd");
        arrayList.add("smhd");
        arrayList.add("gmhd");
        arrayList.add(ATOM_TIMECODE_MEDIA_INFO);
        arrayList.add("hdlr");
        arrayList.add("keys");
        arrayList.add("data");
        arrayList.add("stsd");
        arrayList.add("stts");
        arrayList.add("mdhd");
        arrayList.add(ATOM_CANON_THUMBNAIL);
        arrayList.add(ATOM_ADOBE_XMP);
        arrayList.add("tkhd");
    }
}
