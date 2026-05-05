package com.google.android.material.color;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final byte APPLICATION_PACKAGE_ID = 127;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor = 0;
    private static final PackageInfo ANDROID_PACKAGE_INFO = new PackageInfo(1, "android");
    private static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.entryId - colorResource2.entryId;
        }
    };

    static class ColorResource {
        private final short entryId;
        private final String name;
        private final byte packageId;
        private final byte typeId;
        private final int value;

        ColorResource(int i2, String str, int i3) {
            this.name = str;
            this.value = i3;
            this.entryId = (short) (65535 & i2);
            this.typeId = (byte) ((i2 >> 16) & 255);
            int i4 = i2 >> 24;
            this.packageId = (byte) ((i4 + 255) - (i4 | 255));
        }
    }

    private static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final ResChunkHeader header;
        private final StringPoolChunk keyStrings;
        private final PackageInfo packageInfo;
        private final TypeSpecChunk typeSpecChunk;
        private final StringPoolChunk typeStrings = new StringPoolChunk(false, "?1", "?2", "?3", "?4", "?5", "color");

        PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
            this.packageInfo = packageInfo;
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = list.get(i2).name;
            }
            this.keyStrings = new StringPoolChunk(true, strArr);
            this.typeSpecChunk = new TypeSpecChunk(list);
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        }

        int getChunkSize() {
            return this.typeStrings.getChunkSize() + 288 + this.keyStrings.getChunkSize() + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageInfo.id));
            char[] charArray = this.packageInfo.name.toCharArray();
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray(charArray[i2]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.typeStrings.getChunkSize() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            this.typeStrings.writeTo(byteArrayOutputStream);
            this.keyStrings.writeTo(byteArrayOutputStream);
            this.typeSpecChunk.writeTo(byteArrayOutputStream);
        }
    }

    static class PackageInfo {
        private final int id;
        private final String name;

        PackageInfo(int i2, String str) {
            this.id = i2;
            this.name = str;
        }
    }

    private static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        ResChunkHeader(short s2, short s3, int i2) {
            this.type = s2;
            this.headerSize = s3;
            this.chunkSize = i2;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.type));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.headerSize));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.chunkSize));
        }
    }

    private static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        ResEntry(int i2, int i3) {
            this.keyStringIndex = i2;
            this.data = i3;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 2));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.keyStringIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.data));
        }
    }

    private static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final ResChunkHeader header;
        private final int packageCount;
        private final List<PackageChunk> packageChunks = new ArrayList();
        private final StringPoolChunk stringPool = new StringPoolChunk(new String[0]);

        ResTable(Map<PackageInfo, List<ColorResource>> map) {
            this.packageCount = map.size();
            for (Map.Entry<PackageInfo, List<ColorResource>> entry : map.entrySet()) {
                List<ColorResource> value = entry.getValue();
                Collections.sort(value, ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR);
                this.packageChunks.add(new PackageChunk(entry.getKey(), value));
            }
            this.header = new ResChunkHeader((short) 2, (short) 12, getOverallSize());
        }

        private int getOverallSize() {
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            int chunkSize = 0;
            while (it.hasNext()) {
                chunkSize += it.next().getChunkSize();
            }
            return this.stringPool.getChunkSize() + 12 + chunkSize;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageCount));
            this.stringPool.writeTo(byteArrayOutputStream);
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            while (it.hasNext()) {
                it.next().writeTo(byteArrayOutputStream);
            }
        }
    }

    private static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final ResChunkHeader header;
        private final int stringCount;
        private final List<Integer> stringIndex;
        private final List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final List<Integer> styledSpanIndex;
        private final List<List<StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        StringPoolChunk(boolean z2, String... strArr) {
            this.stringIndex = new ArrayList();
            this.styledSpanIndex = new ArrayList();
            this.strings = new ArrayList();
            this.styledSpans = new ArrayList();
            this.utf8Encode = z2;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<StringStyledSpan>> pairProcessString = processString(str);
                this.stringIndex.add(Integer.valueOf(length));
                length += ((byte[]) pairProcessString.first).length;
                this.strings.add((byte[]) pairProcessString.first);
                this.styledSpans.add((List) pairProcessString.second);
            }
            int size = 0;
            for (List<StringStyledSpan> list : this.styledSpans) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.stringIndex.add(Integer.valueOf(length));
                    length += stringStyledSpan.styleString.length;
                    this.strings.add(stringStyledSpan.styleString);
                }
                this.styledSpanIndex.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i2 = length % 4;
            int i3 = i2 == 0 ? 0 : 4 - i2;
            this.stringsPaddingSize = i3;
            int size2 = this.strings.size();
            this.stringCount = size2;
            this.styledSpanCount = this.strings.size() - strArr.length;
            boolean z3 = this.strings.size() - strArr.length > 0;
            if (!z3) {
                this.styledSpanIndex.clear();
                this.styledSpans.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.styledSpanIndex.size() * 4);
            this.stringsStart = size3;
            int i4 = length + i3;
            this.styledSpansStart = z3 ? size3 + i4 : 0;
            int i5 = size3 + i4 + (z3 ? size : 0);
            this.chunkSize = i5;
            this.header = new ResChunkHeader((short) 1, (short) 28, i5);
        }

        StringPoolChunk(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<StringStyledSpan>> processString(String str) {
            return new Pair<>(this.utf8Encode ? ColorResourcesTableCreator.stringToByteArrayUtf8(str) : ColorResourcesTableCreator.stringToByteArray(str), Collections.emptyList());
        }

        int getChunkSize() {
            return this.chunkSize;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpanCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.utf8Encode ? 256 : 0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringsStart));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpansStart));
            Iterator<Integer> it = this.stringIndex.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.styledSpanIndex.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.strings.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i2 = this.stringsPaddingSize;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            Iterator<List<StringStyledSpan>> it4 = this.styledSpans.iterator();
            while (it4.hasNext()) {
                Iterator<StringStyledSpan> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().writeTo(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(-1));
            }
        }
    }

    private static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.nameReference));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.firstCharacterIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.lastCharacterIndex));
        }
    }

    private static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final ResChunkHeader header;
        private final int[] offsetTable;
        private final ResEntry[] resEntries;

        TypeChunk(List<ColorResource> list, Set<Short> set, int i2) {
            byte[] bArr = new byte[64];
            this.config = bArr;
            this.entryCount = i2;
            bArr[0] = 64;
            this.resEntries = new ResEntry[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.resEntries[i3] = new ResEntry(i3, list.get(i3).value);
            }
            this.offsetTable = new int[i2];
            int i4 = 0;
            for (short s2 = 0; s2 < i2; s2 = (short) (s2 + 1)) {
                if (set.contains(Short.valueOf(s2))) {
                    this.offsetTable[s2] = i4;
                    i4 += 16;
                } else {
                    this.offsetTable[s2] = -1;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE, HEADER_SIZE, getChunkSize());
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        private int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }

        int getChunkSize() {
            return getEntryStart() + (this.resEntries.length * 16);
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.config);
            for (int i2 : this.offsetTable) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i2));
            }
            for (ResEntry resEntry : this.resEntries) {
                resEntry.writeTo(byteArrayOutputStream);
            }
        }
    }

    private static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final ResChunkHeader header;
        private final TypeChunk typeChunk;

        TypeSpecChunk(List<ColorResource> list) {
            this.entryCount = list.get(list.size() - 1).entryId + 1;
            HashSet hashSet = new HashSet();
            Iterator<ColorResource> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().entryId));
            }
            this.entryFlags = new int[this.entryCount];
            for (short s2 = 0; s2 < this.entryCount; s2 = (short) (s2 + 1)) {
                if (hashSet.contains(Short.valueOf(s2))) {
                    this.entryFlags[s2] = 1073741824;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, (short) 16, getChunkSize());
            this.typeChunk = new TypeChunk(list, hashSet, this.entryCount);
        }

        private int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }

        int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            for (int i2 : this.entryFlags) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i2));
            }
            this.typeChunk.writeTo(byteArrayOutputStream);
        }
    }

    private ColorResourcesTableCreator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] charToByteArray(char c2) {
        int i2 = c2 >> '\b';
        return new byte[]{(byte) ((c2 + 255) - (255 | c2)), (byte) ((i2 + 255) - (i2 | 255))};
    }

    static byte[] create(Context context, Map<Integer, Integer> map) throws Throwable {
        PackageInfo packageInfo;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException(Xg.qd("g\n;\u007f\r\u000b\u000f\u0013A\u0015\t\u0018\u0015\u001c\u001a\f\u000f\u001eK\u001d \u001e&\u001a\u0016\u0018\u0018T\u001c&*X\"\u001c.*--);#7-44t", (short) (C1580rY.Xd() ^ (-1035)), (short) (C1580rY.Xd() ^ (-31832))));
        }
        Class<?> cls = Class.forName(C1593ug.zd("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nd\u0012\u0012\u0019\u000b\u001f\u001c", (short) (FB.Xd() ^ 14120), (short) (FB.Xd() ^ 6247)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-25034));
        int[] iArr = new int["^[iDTU\\QVS;MXO".length()];
        QB qb = new QB("^[iDTU\\QVS;MXO");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageInfo packageInfo2 = new PackageInfo(127, (String) method.invoke(context, objArr));
            HashMap map2 = new HashMap();
            ColorResource colorResource = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                short sXd2 = (short) (ZN.Xd() ^ 14394);
                int[] iArr2 = new int["\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:".length()];
                QB qb2 = new QB("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.Zd("eB_Lo\r\u0018*F\u0005Wt", (short) (FB.Xd() ^ 15594), (short) (FB.Xd() ^ 31819)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    colorResource = new ColorResource(iIntValue, ((Resources) method2.invoke(context, objArr2)).getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Xd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (C1607wl.Xd() ^ 25484))).getMethod(Wg.vd("*)9\u0018$307=/2A", (short) (OY.Xd() ^ 6643)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        if (!((Resources) method3.invoke(context, objArr3)).getResourceTypeName(entry.getKey().intValue()).equals(Qg.kd("Zeace", (short) (C1580rY.Xd() ^ (-30684)), (short) (C1580rY.Xd() ^ (-9533))))) {
                            StringBuilder sbAppend = new StringBuilder(C1561oA.ud("h\t\u00077y\u0005\u0001\u0003\u00051\u0003t\u0002|\u0002}mn(muzrg<!n`kb9", (short) (FB.Xd() ^ 11240))).append(colorResource.name).append(C1561oA.yd("aT,0*\u001e\u0005\u001fz", (short) (FB.Xd() ^ 11906)));
                            byte b2 = colorResource.typeId;
                            throw new IllegalArgumentException(sbAppend.append(Integer.toHexString((b2 + 255) - (b2 | 255))).toString());
                        }
                        if (colorResource.packageId == 1) {
                            packageInfo = ANDROID_PACKAGE_INFO;
                        } else {
                            if (colorResource.packageId != 127) {
                                throw new IllegalArgumentException(hg.Vd("\u007f $N!\"\u001c\u001b\u0019\u001b\u001c\f\nD\u001b\f\u0016\t?\u0014\f\b\n\n\u0011\u00077\u0007vw~sxu/wqF+", (short) (C1607wl.Xd() ^ 17580), (short) (C1607wl.Xd() ^ 12729)) + ((int) colorResource.packageId));
                            }
                            packageInfo = packageInfo2;
                        }
                        if (!map2.containsKey(packageInfo)) {
                            map2.put(packageInfo, new ArrayList());
                        }
                        ((List) map2.get(packageInfo)).add(colorResource);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            byte b3 = colorResource.typeId;
            typeIdColor = b3;
            if (b3 == 0) {
                throw new IllegalArgumentException(C1561oA.Yd(",N\u007fDQOSW\u0006YM\\Y`^PSb\u0010WahbY\u0016]gk\u001ac]oknnj|dxnuu6", (short) (C1633zX.Xd() ^ (-20349))));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ResTable(map2).writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] intToByteArray(int i2) {
        int i3 = i2 >> 8;
        return new byte[]{(byte) (255 & i2), (byte) ((i3 + 255) - (i3 | 255)), (byte) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))), (byte) ((i2 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] shortToByteArray(short s2) {
        int i2 = s2 >> 8;
        return new byte[]{(byte) ((s2 + 255) - (255 | s2)), (byte) ((i2 + 255) - (i2 | 255))};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrShortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = bArrShortToByteArray[0];
        bArr[1] = bArrShortToByteArray[1];
        for (int i2 = 0; i2 < charArray.length; i2++) {
            byte[] bArrCharToByteArray = charToByteArray(charArray[i2]);
            int i3 = i2 * 2;
            bArr[i3 + 2] = bArrCharToByteArray[0];
            bArr[i3 + 3] = bArrCharToByteArray[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArrayUtf8(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
