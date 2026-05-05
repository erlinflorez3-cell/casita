package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private UnknownFieldSetLite(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.memoizedSerializedSize = -1;
        this.count = count;
        this.tags = tags;
        this.objects = objects;
        this.isMutable = isMutable;
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.tags;
        if (minCapacity > iArr.length) {
            int i2 = this.count;
            int i3 = i2 + (i2 / 2);
            if (i3 >= minCapacity) {
                minCapacity = i3;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.tags = Arrays.copyOf(iArr, minCapacity);
            this.objects = Arrays.copyOf(this.objects, minCapacity);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] tags, int count) {
        int i2 = 17;
        for (int i3 = 0; i3 < count; i3++) {
            i2 = (i2 * 31) + tags[i3];
        }
        return i2;
    }

    private static int hashCode(Object[] objects, int count) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < count; i2++) {
            iHashCode = (iHashCode * 31) + objects[i2].hashCode();
        }
        return iHashCode;
    }

    private UnknownFieldSetLite mergeFrom(final CodedInputStream input) throws IOException {
        int tag;
        do {
            tag = input.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, input));
        return this;
    }

    static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite first, UnknownFieldSetLite second) {
        int i2 = first.count + second.count;
        int[] iArrCopyOf = Arrays.copyOf(first.tags, i2);
        System.arraycopy(second.tags, 0, iArrCopyOf, first.count, second.count);
        Object[] objArrCopyOf = Arrays.copyOf(first.objects, i2);
        System.arraycopy(second.objects, 0, objArrCopyOf, first.count, second.count);
        return new UnknownFieldSetLite(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objects1, Object[] objects2, int count) {
        for (int i2 = 0; i2 < count; i2++) {
            if (!objects1[i2].equals(objects2[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] tags1, int[] tags2, int count) {
        for (int i2 = 0; i2 < count; i2++) {
            if (tags1[i2] != tags2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int tag, Object object, Writer writer) throws IOException {
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (ByteString) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) object).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((UnknownFieldSetLite) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((UnknownFieldSetLite) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = this.count;
        return i2 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i2) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.tags[i4];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
            int tagWireType = WireFormat.getTagWireType(i5);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i4]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i4]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i4]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i4]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i4]).intValue());
            }
            i3 += iComputeUInt64Size;
        }
        this.memoizedSerializedSize = i3;
        return i3;
    }

    public int getSerializedSizeAsMessageSet() {
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i3]), (ByteString) this.objects[i3]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i2 = this.count;
        return ((((527 + i2) * 31) + hashCode(this.tags, i2)) * 31) + hashCode(this.objects, this.count);
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    boolean mergeFieldFrom(final int tag, final CodedInputStream input) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            storeField(tag, Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(tag, Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(input);
            input.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(tag, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(tag, Integer.valueOf(input.readFixed32()));
        return true;
    }

    UnknownFieldSetLite mergeFrom(UnknownFieldSetLite other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i2 = this.count + other.count;
        ensureCapacity(i2);
        System.arraycopy(other.tags, 0, this.tags, this.count, other.count);
        System.arraycopy(other.objects, 0, this.objects, this.count, other.count);
        this.count = i2;
        return this;
    }

    UnknownFieldSetLite mergeLengthDelimitedField(final int fieldNumber, final ByteString value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(fieldNumber, 2), value);
        return this;
    }

    UnknownFieldSetLite mergeVarintField(int fieldNumber, int value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    final void printWithIndent(StringBuilder buffer, int indent) {
        for (int i2 = 0; i2 < this.count; i2++) {
            MessageLiteToString.printField(buffer, indent, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i2])), this.objects[i2]);
        }
    }

    void storeField(int tag, Object value) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i2 = this.count;
        iArr[i2] = tag;
        this.objects[i2] = value;
        this.count = i2 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream output) throws IOException {
        for (int i2 = 0; i2 < this.count; i2++) {
            output.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i2]), (ByteString) this.objects[i2]);
        }
    }

    void writeAsMessageSetTo(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i2]), this.objects[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.count; i3++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i3]), this.objects[i3]);
        }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i2 = 0; i2 < this.count; i2++) {
            int i3 = this.tags[i2];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i3);
            int tagWireType = WireFormat.getTagWireType(i3);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((Long) this.objects[i2]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((Long) this.objects[i2]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (ByteString) this.objects[i2]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i2]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                output.writeFixed32(tagFieldNumber, ((Integer) this.objects[i2]).intValue());
            }
        }
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i2 = 0; i2 < this.count; i2++) {
                writeField(this.tags[i2], this.objects[i2], writer);
            }
            return;
        }
        for (int i3 = this.count - 1; i3 >= 0; i3--) {
            writeField(this.tags[i3], this.objects[i3], writer);
        }
    }
}
