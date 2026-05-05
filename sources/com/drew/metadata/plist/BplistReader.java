package com.drew.metadata.plist;

import com.drew.lang.SequentialByteArrayReader;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class BplistReader {
    private static final byte[] BPLIST_HEADER = {98, 112, 108, 105, 115, 116, 48, 48};
    private static final String PLIST_DTD = "<!DOCTYPE plist PUBLIC \"-//Apple Computer//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">";

    public static class PropertyListResults {
        private final List<Object> objects;
        private final Trailer trailer;

        public PropertyListResults(List<Object> list, Trailer trailer) {
            this.objects = list;
            this.trailer = trailer;
        }

        public Set<Map.Entry<Byte, Byte>> getEntrySet() {
            Object obj = getObjects().get((int) getTrailer().topObject);
            if (obj instanceof Map) {
                return ((Map) obj).entrySet();
            }
            return null;
        }

        public List<Object> getObjects() {
            return this.objects;
        }

        public Trailer getTrailer() {
            return this.trailer;
        }

        public String toXML() {
            StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE plist PUBLIC \"-//Apple Computer//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\"><plist version=\"1.0\">");
            Set<Map.Entry<Byte, Byte>> entrySet = getEntrySet();
            if (entrySet != null) {
                sb.append("<dict>");
                for (Map.Entry<Byte, Byte> entry : entrySet) {
                    sb.append("<key>").append((String) getObjects().get(entry.getKey().byteValue())).append("</key><integer>");
                    sb.append(getObjects().get(entry.getValue().byteValue()).toString()).append("</integer>");
                }
                sb.append("</dict>");
            }
            sb.append("</plist>");
            return sb.toString();
        }
    }

    private static class Trailer {
        public static final int STRUCT_SIZE = 32;
        long numObjects;
        byte objectRefSize;
        byte offsetIntSize;
        long offsetTableOffset;
        long topObject;

        private Trailer() {
        }
    }

    private static void handleData(int i2, byte b2, SequentialByteArrayReader sequentialByteArrayReader, ArrayList<Object> arrayList) throws IOException {
        int uInt16 = (-1) - (((-1) - b2) | ((-1) - 15));
        if (uInt16 == 15) {
            int i3 = sequentialByteArrayReader.getByte() >> 4;
            if ((i3 + 15) - (i3 | 15) != 1) {
                throw new IllegalArgumentException("Invalid size marker");
            }
            int iPow = (int) Math.pow(2.0d, (15 + r2) - (15 | r2));
            if (iPow == 1) {
                uInt16 = sequentialByteArrayReader.getInt8();
            } else if (iPow == 2) {
                uInt16 = sequentialByteArrayReader.getUInt16();
            }
        }
        arrayList.add(i2, sequentialByteArrayReader.getBytes(uInt16));
    }

    private static void handleDict(int i2, byte b2, SequentialByteArrayReader sequentialByteArrayReader, ArrayList<Object> arrayList) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = (b2 + 15) - (b2 | 15);
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = sequentialByteArrayReader.getByte();
        }
        for (int i5 = 0; i5 < i3; i5++) {
            linkedHashMap.put(Byte.valueOf(bArr[i5]), Byte.valueOf(sequentialByteArrayReader.getByte()));
        }
        arrayList.add(i2, linkedHashMap);
    }

    private static void handleInt(int i2, byte b2, SequentialByteArrayReader sequentialByteArrayReader, ArrayList<Object> arrayList) throws IOException {
        int iPow = (int) Math.pow(2.0d, b2 & Ascii.SI);
        if (iPow == 1) {
            arrayList.add(i2, Byte.valueOf(sequentialByteArrayReader.getByte()));
            return;
        }
        if (iPow == 2) {
            arrayList.add(i2, Integer.valueOf(sequentialByteArrayReader.getUInt16()));
        } else if (iPow == 4) {
            arrayList.add(i2, Long.valueOf(sequentialByteArrayReader.getUInt32()));
        } else if (iPow == 8) {
            arrayList.add(i2, Long.valueOf(sequentialByteArrayReader.getInt64()));
        }
    }

    public static boolean isValid(byte[] bArr) {
        if (bArr.length < BPLIST_HEADER.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = BPLIST_HEADER;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static PropertyListResults parse(byte[] bArr) throws IOException {
        if (!isValid(bArr)) {
            throw new IllegalArgumentException("Input is not a bplist");
        }
        ArrayList arrayList = new ArrayList();
        Trailer trailer = readTrailer(bArr);
        SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr, (int) (trailer.offsetTableOffset + trailer.topObject));
        int i2 = (int) trailer.numObjects;
        int[] iArr = new int[i2];
        for (long j2 = 0; j2 < trailer.numObjects; j2++) {
            if (trailer.offsetIntSize == 1) {
                iArr[(int) j2] = sequentialByteArrayReader.getByte();
            } else if (trailer.offsetIntSize == 2) {
                iArr[(int) j2] = sequentialByteArrayReader.getUInt16();
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            SequentialByteArrayReader sequentialByteArrayReader2 = new SequentialByteArrayReader(bArr, iArr[i3]);
            byte b2 = sequentialByteArrayReader2.getByte();
            int i4 = (-1) - (((-1) - (b2 >> 4)) | ((-1) - 15));
            if (i4 == 1) {
                handleInt(i3, b2, sequentialByteArrayReader2, arrayList);
            } else if (i4 == 13) {
                handleDict(i3, b2, sequentialByteArrayReader2, arrayList);
            } else if (i4 == 4) {
                handleData(i3, b2, sequentialByteArrayReader2, arrayList);
            } else {
                if (i4 != 5) {
                    throw new IOException("Un-handled objectFormat encountered");
                }
                arrayList.add(i3, sequentialByteArrayReader2.getString((-1) - (((-1) - b2) | ((-1) - 15))));
            }
        }
        return new PropertyListResults(arrayList, trailer);
    }

    private static Trailer readTrailer(byte[] bArr) throws IOException {
        SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr, bArr.length - 32);
        sequentialByteArrayReader.skip(5L);
        sequentialByteArrayReader.skip(1L);
        Trailer trailer = new Trailer();
        trailer.offsetIntSize = sequentialByteArrayReader.getByte();
        trailer.objectRefSize = sequentialByteArrayReader.getByte();
        trailer.numObjects = sequentialByteArrayReader.getInt64();
        trailer.topObject = sequentialByteArrayReader.getInt64();
        trailer.offsetTableOffset = sequentialByteArrayReader.getInt64();
        return trailer;
    }
}
