package com.drew.metadata.jpeg;

import com.drew.metadata.Directory;
import com.drew.metadata.MetadataException;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class HuffmanTablesDirectory extends Directory {
    public static final int TAG_NUMBER_OF_TABLES = 1;
    private static final HashMap<Integer, String> _tagNameMap;
    protected final List<HuffmanTable> tables = new ArrayList(4);
    static final byte[] TYPICAL_LUMINANCE_DC_LENGTHS = {0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
    static final byte[] TYPICAL_LUMINANCE_DC_VALUES = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT};
    static final byte[] TYPICAL_CHROMINANCE_DC_LENGTHS = {0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
    static final byte[] TYPICAL_CHROMINANCE_DC_VALUES = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT};
    static final byte[] TYPICAL_LUMINANCE_AC_LENGTHS = {0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125};
    static final byte[] TYPICAL_LUMINANCE_AC_VALUES = {1, 2, 3, 0, 4, 17, 5, Ascii.DC2, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, Ascii.DC4, 50, -127, -111, -95, 8, 35, 66, -79, MessagePack.Code.NEVER_USED, Ascii.NAK, 82, MessagePack.Code.INT16, -16, 36, 51, 98, 114, -126, 9, 10, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, MessagePack.Code.FALSE, MessagePack.Code.TRUE, MessagePack.Code.BIN8, MessagePack.Code.BIN16, MessagePack.Code.BIN32, MessagePack.Code.EXT8, MessagePack.Code.EXT16, MessagePack.Code.EXT32, MessagePack.Code.FLOAT32, MessagePack.Code.INT32, MessagePack.Code.INT64, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT16, MessagePack.Code.STR8, MessagePack.Code.STR16, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6};
    static final byte[] TYPICAL_CHROMINANCE_AC_LENGTHS = {0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119};
    static final byte[] TYPICAL_CHROMINANCE_AC_VALUES = {0, 1, 2, 3, 17, 4, 5, 33, 49, 6, Ascii.DC2, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, Ascii.DC4, 66, -111, -95, -79, MessagePack.Code.NEVER_USED, 9, 35, 51, 82, -16, Ascii.NAK, 98, 114, MessagePack.Code.INT16, 10, Ascii.SYN, 36, 52, -31, 37, -15, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, MessagePack.Code.FALSE, MessagePack.Code.TRUE, MessagePack.Code.BIN8, MessagePack.Code.BIN16, MessagePack.Code.BIN32, MessagePack.Code.EXT8, MessagePack.Code.EXT16, MessagePack.Code.EXT32, MessagePack.Code.FLOAT32, MessagePack.Code.INT32, MessagePack.Code.INT64, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT16, MessagePack.Code.STR8, MessagePack.Code.STR16, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6};

    public static class HuffmanTable {
        private final byte[] _lengthBytes;
        private final HuffmanTableClass _tableClass;
        private final int _tableDestinationId;
        private final int _tableLength;
        private final byte[] _valueBytes;

        public enum HuffmanTableClass {
            DC,
            AC,
            UNKNOWN;

            public static HuffmanTableClass typeOf(int i2) {
                return i2 != 0 ? i2 != 1 ? UNKNOWN : AC : DC;
            }
        }

        public HuffmanTable(HuffmanTableClass huffmanTableClass, int i2, byte[] bArr, byte[] bArr2) {
            if (bArr == null) {
                throw new IllegalArgumentException("lengthBytes cannot be null.");
            }
            if (bArr2 == null) {
                throw new IllegalArgumentException("valueBytes cannot be null.");
            }
            this._tableClass = huffmanTableClass;
            this._tableDestinationId = i2;
            this._lengthBytes = bArr;
            this._valueBytes = bArr2;
            this._tableLength = bArr2.length + 17;
        }

        public byte[] getLengthBytes() {
            byte[] bArr = this._lengthBytes;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public HuffmanTableClass getTableClass() {
            return this._tableClass;
        }

        public int getTableDestinationId() {
            return this._tableDestinationId;
        }

        public int getTableLength() {
            return this._tableLength;
        }

        public byte[] getValueBytes() {
            byte[] bArr = this._valueBytes;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public boolean isOptimized() {
            return !isTypical();
        }

        public boolean isTypical() {
            if (this._tableClass == HuffmanTableClass.DC) {
                if (Arrays.equals(this._lengthBytes, HuffmanTablesDirectory.TYPICAL_LUMINANCE_DC_LENGTHS) && Arrays.equals(this._valueBytes, HuffmanTablesDirectory.TYPICAL_LUMINANCE_DC_VALUES)) {
                    return true;
                }
                return Arrays.equals(this._lengthBytes, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_DC_LENGTHS) && Arrays.equals(this._valueBytes, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_DC_VALUES);
            }
            if (this._tableClass != HuffmanTableClass.AC) {
                return false;
            }
            if (Arrays.equals(this._lengthBytes, HuffmanTablesDirectory.TYPICAL_LUMINANCE_AC_LENGTHS) && Arrays.equals(this._valueBytes, HuffmanTablesDirectory.TYPICAL_LUMINANCE_AC_VALUES)) {
                return true;
            }
            return Arrays.equals(this._lengthBytes, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_AC_LENGTHS) && Arrays.equals(this._valueBytes, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_AC_VALUES);
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        _tagNameMap = map;
        map.put(1, "Number of Tables");
    }

    public HuffmanTablesDirectory() {
        setDescriptor(new HuffmanTablesDescriptor(this));
    }

    @Override // com.drew.metadata.Directory
    public String getName() {
        return "Huffman";
    }

    public int getNumberOfTables() throws MetadataException {
        return getInt(1);
    }

    public HuffmanTable getTable(int i2) {
        return this.tables.get(i2);
    }

    protected List<HuffmanTable> getTables() {
        return this.tables;
    }

    @Override // com.drew.metadata.Directory
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }

    public boolean isOptimized() {
        return !isTypical();
    }

    public boolean isTypical() {
        if (this.tables.size() == 0) {
            return false;
        }
        Iterator<HuffmanTable> it = this.tables.iterator();
        while (it.hasNext()) {
            if (!it.next().isTypical()) {
                return false;
            }
        }
        return true;
    }
}
