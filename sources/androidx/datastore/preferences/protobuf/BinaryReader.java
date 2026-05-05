package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class BinaryReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    public abstract int getTotalBytesRead();

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* synthetic */ BinaryReader(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static BinaryReader newInstance(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return new SafeHeapReader(byteBuffer, z2);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private BinaryReader() {
    }

    private static final class SafeHeapReader extends BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z2) {
            super(null);
            this.bufferIsImmutable = z2;
            this.buffer = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.pos = iArrayOffset;
            this.initialPos = iArrayOffset;
            this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryReader
        public int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int getFieldNumber() throws IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int varint32 = readVarint32();
            this.tag = varint32;
            if (varint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(varint32);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int getTag() {
            return this.tag;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public boolean skipField() throws IOException {
            int i2;
            if (!isAtEnd() && (i2 = this.tag) != this.endGroupTag) {
                int tagWireType = WireFormat.getTagWireType(i2);
                if (tagWireType == 0) {
                    skipVarint();
                    return true;
                }
                if (tagWireType == 1) {
                    skipBytes(8);
                    return true;
                }
                if (tagWireType == 2) {
                    skipBytes(readVarint32());
                    return true;
                }
                if (tagWireType == 3) {
                    skipGroup();
                    return true;
                }
                if (tagWireType == 5) {
                    skipBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public double readDouble() throws IOException {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public float readFloat() throws IOException {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readUInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public boolean readBool() throws IOException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public String readString() throws IOException {
            return readStringInternal(false);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public String readStringRequireUtf8() throws IOException {
            return readStringInternal(true);
        }

        public String readStringInternal(boolean z2) throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return "";
            }
            requireBytes(varint32);
            if (z2) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                if (!Utf8.isValidUtf8(bArr, i2, i2 + varint32)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.buffer, this.pos, varint32, Internal.UTF_8);
            this.pos += varint32;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(2);
            return (T) readMessage(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(2);
            return (T) readMessage(schema, extensionRegistryLite);
        }

        private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i2 = this.limit;
            int i3 = this.pos + varint32;
            this.limit = i3;
            try {
                T tNewInstance = schema.newInstance();
                schema.mergeFrom(tNewInstance, this, extensionRegistryLite);
                schema.makeImmutable(tNewInstance);
                if (this.pos == i3) {
                    return tNewInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.limit = i2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(3);
            return (T) readGroup(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readGroupBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(3);
            return (T) readGroup(schema, extensionRegistryLite);
        }

        private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i2 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            try {
                T tNewInstance = schema.newInstance();
                schema.mergeFrom(tNewInstance, this, extensionRegistryLite);
                schema.makeImmutable(tNewInstance);
                if (this.tag == this.endGroupTag) {
                    return tNewInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.endGroupTag = i2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public ByteString readBytes() throws IOException {
            ByteString byteStringCopyFrom;
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return ByteString.EMPTY;
            }
            requireBytes(varint32);
            if (this.bufferIsImmutable) {
                byteStringCopyFrom = ByteString.wrap(this.buffer, this.pos, varint32);
            } else {
                byteStringCopyFrom = ByteString.copyFrom(this.buffer, this.pos, varint32);
            }
            this.pos += varint32;
            return byteStringCopyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readUInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readEnum() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readSFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readSFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readSInt32() throws IOException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readSInt64() throws IOException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readDoubleList(List<Double> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof DoubleArrayList) {
                DoubleArrayList doubleArrayList = (DoubleArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        doubleArrayList.addDouble(readDouble());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed64Length(varint32);
                    int i4 = this.pos + varint32;
                    while (this.pos < i4) {
                        doubleArrayList.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed64Length(varint322);
                int i5 = this.pos + varint322;
                while (this.pos < i5) {
                    list.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFloatList(List<Float> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof FloatArrayList) {
                FloatArrayList floatArrayList = (FloatArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i4 = this.pos + varint32;
                    while (this.pos < i4) {
                        floatArrayList.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        floatArrayList.addFloat(readFloat());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i5 = this.pos + varint322;
                while (this.pos < i5) {
                    list.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readUInt64List(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readUInt64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(varint32);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(Long.valueOf(readUInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            if (tagWireType2 == 2) {
                int varint322 = this.pos + readVarint32();
                while (this.pos < varint322) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint322);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readInt64List(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readInt64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(varint32);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(Long.valueOf(readInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            if (tagWireType2 == 2) {
                int varint322 = this.pos + readVarint32();
                while (this.pos < varint322) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint322);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readInt32List(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        intArrayList.addInt(readInt32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        intArrayList.addInt(readVarint32());
                    }
                    requirePosition(varint32);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(Integer.valueOf(readInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            if (tagWireType2 == 2) {
                int varint322 = this.pos + readVarint32();
                while (this.pos < varint322) {
                    list.add(Integer.valueOf(readVarint32()));
                }
                requirePosition(varint322);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFixed64List(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readFixed64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed64Length(varint32);
                    int i4 = this.pos + varint32;
                    while (this.pos < i4) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(Long.valueOf(readFixed64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed64Length(varint322);
                int i5 = this.pos + varint322;
                while (this.pos < i5) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFixed32List(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i4 = this.pos + varint32;
                    while (this.pos < i4) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i5 = this.pos + varint322;
                while (this.pos < i5) {
                    list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readBoolList(List<Boolean> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof BooleanArrayList) {
                BooleanArrayList booleanArrayList = (BooleanArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            booleanArrayList.addBoolean(readVarint32() != 0);
                        }
                        requirePosition(varint32);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    booleanArrayList.addBoolean(readBool());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i3 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i3;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint322 = this.pos + readVarint32();
                    while (this.pos < varint322) {
                        list.add(Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(varint322);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Boolean.valueOf(readBool()));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readStringList(List<String> list) throws IOException {
            readStringListInternal(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readStringListRequireUtf8(List<String> list) throws IOException {
            readStringListInternal(list, true);
        }

        public void readStringListInternal(List<String> list, boolean z2) throws IOException {
            int i2;
            int i3;
            if (WireFormat.getTagWireType(this.tag) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if ((list instanceof LazyStringList) && !z2) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(readBytes());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i3 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i3;
                return;
            }
            do {
                list.add(readStringInternal(z2));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            readMessageList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i2;
            if (WireFormat.getTagWireType(this.tag) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i3 = this.tag;
            do {
                list.add(readMessage(schema, extensionRegistryLite));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == i3);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            readGroupList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i2;
            if (WireFormat.getTagWireType(this.tag) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i3 = this.tag;
            do {
                list.add(readGroup(schema, extensionRegistryLite));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == i3);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readBytesList(List<ByteString> list) throws IOException {
            int i2;
            if (WireFormat.getTagWireType(this.tag) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readUInt32List(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readUInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i3 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i3;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint322 = this.pos + readVarint32();
                    while (this.pos < varint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readUInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readEnumList(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readEnum());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i3 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i3;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint322 = this.pos + readVarint32();
                    while (this.pos < varint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readEnum()));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed32List(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i4 = this.pos + varint32;
                    while (this.pos < i4) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readSFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i5 = this.pos + varint322;
                while (this.pos < i5) {
                    list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed64List(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readSFixed64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i3 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i3;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed64Length(varint32);
                    int i4 = this.pos + varint32;
                    while (this.pos < i4) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(Long.valueOf(readSFixed64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed64Length(varint322);
                int i5 = this.pos + varint322;
                while (this.pos < i5) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSInt32List(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            intArrayList.addInt(CodedInputStream.decodeZigZag32(readVarint32()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readSInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i3 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i3;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint322 = this.pos + readVarint32();
                    while (this.pos < varint322) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readSInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSInt64List(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            longArrayList.addLong(CodedInputStream.decodeZigZag64(readVarint64()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readSInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i3 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i3;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint322 = this.pos + readVarint32();
                    while (this.pos < varint322) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readSInt64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.Reader
        public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i2 = this.limit;
            this.limit = this.pos + varint32;
            try {
                Object field = metadata.defaultKey;
                Object field2 = metadata.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(field, field2);
                        return;
                    }
                    if (fieldNumber == 1) {
                        field = readField(metadata.keyType, null, null);
                    } else if (fieldNumber == 2) {
                        field2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                    } else {
                        try {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    }
                }
            } finally {
                this.limit = i2;
            }
        }

        private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x0072 A[PHI: r1
  0x0072: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:72:0x0056, B:76:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int readVarint32() throws java.io.IOException {
            /*
                r7 = this;
                int r5 = r7.pos
                int r1 = r7.limit
                if (r1 == r5) goto L7b
                byte[] r4 = r7.buffer
                int r3 = r5 + 1
                r2 = r4[r5]
                if (r2 < 0) goto L11
                r7.pos = r3
                return r2
            L11:
                int r1 = r1 - r3
                r0 = 9
                if (r1 >= r0) goto L1c
                long r1 = r7.readVarint64SlowPath()
                int r0 = (int) r1
                return r0
            L1c:
                int r1 = r5 + 2
                r0 = r4[r3]
                int r6 = r0 << 7
                r6 = r6 ^ r2
                if (r6 >= 0) goto L2a
                r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
            L27:
                r7.pos = r1
                return r0
            L2a:
                int r3 = r5 + 3
                r0 = r4[r1]
                int r2 = r0 << 14
                r2 = r2 ^ r6
                if (r2 < 0) goto L37
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L35:
                r1 = r3
                goto L27
            L37:
                int r1 = r5 + 4
                r0 = r4[r3]
                int r0 = r0 << 21
                r2 = r2 ^ r0
                if (r2 >= 0) goto L45
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
            L44:
                goto L27
            L45:
                int r3 = r5 + 5
                r1 = r4[r1]
                int r0 = r1 << 28
                r2 = r2 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r0
                if (r1 >= 0) goto L74
                int r1 = r5 + 6
                r0 = r4[r3]
                if (r0 >= 0) goto L72
                int r3 = r5 + 7
                r0 = r4[r1]
                if (r0 >= 0) goto L74
                int r1 = r5 + 8
                r0 = r4[r3]
                if (r0 >= 0) goto L72
                int r3 = r5 + 9
                r0 = r4[r1]
                if (r0 >= 0) goto L74
                int r1 = r5 + 10
                r0 = r4[r3]
                if (r0 < 0) goto L76
                r0 = r2
                goto L27
            L72:
                r0 = r2
                goto L44
            L74:
                r0 = r2
                goto L35
            L76:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
            L7b:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryReader.SafeHeapReader.readVarint32():int");
        }

        public long readVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.pos = i4;
                return b2;
            }
            if (i3 - i4 < 9) {
                return readVarint64SlowPath();
            }
            int i5 = i2 + 2;
            int i6 = (bArr[i4] << 7) ^ b2;
            if (i6 < 0) {
                j2 = i6 ^ (-128);
            } else {
                int i7 = i2 + 3;
                int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                if (i8 >= 0) {
                    j2 = i8 ^ 16256;
                    i5 = i7;
                } else {
                    int i9 = i2 + 4;
                    int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                    if (i10 < 0) {
                        j2 = (-2080896) ^ i10;
                        i5 = i9;
                    } else {
                        i5 = i2 + 5;
                        long j5 = ((long) i10) ^ (((long) bArr[i9]) << 28);
                        if (j5 >= 0) {
                            j4 = 266354560;
                        } else {
                            int i11 = i2 + 6;
                            long j6 = j5 ^ (((long) bArr[i5]) << 35);
                            if (j6 < 0) {
                                j3 = -34093383808L;
                            } else {
                                i5 = i2 + 7;
                                j5 = j6 ^ (((long) bArr[i11]) << 42);
                                if (j5 >= 0) {
                                    j4 = 4363953127296L;
                                } else {
                                    i11 = i2 + 8;
                                    j6 = j5 ^ (((long) bArr[i5]) << 49);
                                    if (j6 < 0) {
                                        j3 = -558586000294016L;
                                    } else {
                                        i5 = i2 + 9;
                                        j2 = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                        if (j2 < 0) {
                                            int i12 = i2 + 10;
                                            if (bArr[i5] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i5 = i12;
                                        }
                                    }
                                }
                            }
                            j2 = j6 ^ j3;
                            i5 = i11;
                        }
                        j2 = j5 ^ j4;
                    }
                }
            }
            this.pos = i5;
            return j2;
        }

        private long readVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte b2 = readByte();
                j2 |= ((long) (127 & b2)) << i2;
                if ((-1) - (((-1) - b2) | ((-1) - 128)) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private byte readByte() throws IOException {
            int i2 = this.pos;
            if (i2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        private int readLittleEndian32() throws IOException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private long readLittleEndian64() throws IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i2 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            byte b2 = bArr[i2];
            byte b3 = bArr[i2 + 1];
            int i3 = ((b2 + 255) - (b2 | 255)) | (((b3 + 255) - (b3 | 255)) << 8);
            byte b4 = bArr[i2 + 2];
            return ((bArr[i2 + 3] & 255) << 24) | i3 | (((b4 + 255) - (b4 | 255)) << 16);
        }

        private long readLittleEndian64_NoCheck() {
            int i2 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            long j2 = bArr[i2];
            long j3 = (j2 + 255) - (j2 | 255);
            long j4 = bArr[i2 + 1];
            long j5 = ((j4 + 255) - (j4 | 255)) << 8;
            long j6 = ((j3 + j5) - (j3 & j5)) | (((-1) - (((-1) - ((long) bArr[i2 + 2])) | ((-1) - 255))) << 16);
            long j7 = bArr[i2 + 3];
            long j8 = j6 | (((j7 + 255) - (j7 | 255)) << 24);
            long j9 = bArr[i2 + 4];
            long j10 = ((j9 + 255) - (j9 | 255)) << 32;
            long j11 = (j8 + j10) - (j8 & j10);
            long j12 = bArr[i2 + 5];
            long j13 = ((j12 + 255) - (j12 | 255)) << 40;
            return (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56) | ((-1) - (((-1) - ((j11 + j13) - (j11 & j13))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48))));
        }

        private void skipVarint() throws IOException {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.buffer;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.pos = i5;
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipBytes(int i2) throws IOException {
            requireBytes(i2);
            this.pos += i2;
        }

        private void skipGroup() throws IOException {
            int i2 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag != this.endGroupTag) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i2;
        }

        private void requireBytes(int i2) throws IOException {
            if (i2 < 0 || i2 > this.limit - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i2) throws IOException {
            if (WireFormat.getTagWireType(this.tag) != i2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void verifyPackedFixed64Length(int i2) throws IOException {
            requireBytes(i2);
            if ((i2 + 7) - (i2 | 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed32Length(int i2) throws IOException {
            requireBytes(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void requirePosition(int i2) throws IOException {
            if (this.pos != i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }
}
