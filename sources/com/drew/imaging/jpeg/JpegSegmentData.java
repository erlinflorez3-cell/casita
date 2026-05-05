package com.drew.imaging.jpeg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class JpegSegmentData {
    private final HashMap<Byte, List<byte[]>> _segmentDataMap = new HashMap<>(10);

    private List<byte[]> getOrCreateSegmentList(byte b2) {
        if (this._segmentDataMap.containsKey(Byte.valueOf(b2))) {
            return this._segmentDataMap.get(Byte.valueOf(b2));
        }
        ArrayList arrayList = new ArrayList();
        this._segmentDataMap.put(Byte.valueOf(b2), arrayList);
        return arrayList;
    }

    private List<byte[]> getSegmentList(byte b2) {
        return this._segmentDataMap.get(Byte.valueOf(b2));
    }

    public void addSegment(byte b2, byte[] bArr) {
        getOrCreateSegmentList(b2).add(bArr);
    }

    public boolean containsSegment(byte b2) {
        return this._segmentDataMap.containsKey(Byte.valueOf(b2));
    }

    public boolean containsSegment(JpegSegmentType jpegSegmentType) {
        return containsSegment(jpegSegmentType.byteValue);
    }

    public byte[] getSegment(byte b2) {
        return getSegment(b2, 0);
    }

    public byte[] getSegment(byte b2, int i2) {
        List<byte[]> segmentList = getSegmentList(b2);
        if (segmentList == null || segmentList.size() <= i2) {
            return null;
        }
        return segmentList.get(i2);
    }

    public byte[] getSegment(JpegSegmentType jpegSegmentType) {
        return getSegment(jpegSegmentType.byteValue, 0);
    }

    public byte[] getSegment(JpegSegmentType jpegSegmentType, int i2) {
        return getSegment(jpegSegmentType.byteValue, i2);
    }

    public int getSegmentCount(byte b2) {
        List<byte[]> segmentList = getSegmentList(b2);
        if (segmentList == null) {
            return 0;
        }
        return segmentList.size();
    }

    public int getSegmentCount(JpegSegmentType jpegSegmentType) {
        return getSegmentCount(jpegSegmentType.byteValue);
    }

    public Iterable<JpegSegmentType> getSegmentTypes() {
        HashSet hashSet = new HashSet();
        for (Byte b2 : this._segmentDataMap.keySet()) {
            JpegSegmentType jpegSegmentTypeFromByte = JpegSegmentType.fromByte(b2.byteValue());
            if (jpegSegmentTypeFromByte == null) {
                throw new IllegalStateException("Should not have a segmentTypeByte that is not in the enum: " + Integer.toHexString(b2.byteValue()));
            }
            hashSet.add(jpegSegmentTypeFromByte);
        }
        return hashSet;
    }

    public Iterable<byte[]> getSegments(byte b2) {
        List<byte[]> segmentList = getSegmentList(b2);
        return segmentList == null ? new ArrayList() : segmentList;
    }

    public Iterable<byte[]> getSegments(JpegSegmentType jpegSegmentType) {
        return getSegments(jpegSegmentType.byteValue);
    }

    public void removeSegment(byte b2) {
        this._segmentDataMap.remove(Byte.valueOf(b2));
    }

    public void removeSegment(JpegSegmentType jpegSegmentType) {
        removeSegment(jpegSegmentType.byteValue);
    }

    public void removeSegmentOccurrence(byte b2, int i2) {
        this._segmentDataMap.get(Byte.valueOf(b2)).remove(i2);
    }

    public void removeSegmentOccurrence(JpegSegmentType jpegSegmentType, int i2) {
        removeSegmentOccurrence(jpegSegmentType.byteValue, i2);
    }
}
