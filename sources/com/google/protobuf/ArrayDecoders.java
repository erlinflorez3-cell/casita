package com.google.protobuf;

import com.google.common.base.Ascii;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@CheckReturnValue
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* JADX INFO: renamed from: com.google.protobuf.ArrayDecoders$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(ExtensionRegistryLite extensionRegistry) {
            extensionRegistry.getClass();
            this.extensionRegistry = extensionRegistry;
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int depth) throws InvalidProtocolBufferException {
        if (depth >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    static int decodeBoolList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int iDecodeVarint64 = decodeVarint64(data, position, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    static int decodeBytes(byte[] data, int position, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > data.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(data, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    static int decodeBytesList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > data.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            list.add(ByteString.EMPTY);
        } else {
            list.add(ByteString.copyFrom(data, iDecodeVarint32, i2));
            iDecodeVarint32 += i2;
        }
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint322 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint322, registers);
            int i3 = registers.int1;
            if (i3 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i3 > data.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i3 == 0) {
                list.add(ByteString.EMPTY);
            } else {
                list.add(ByteString.copyFrom(data, iDecodeVarint32, i3));
                iDecodeVarint32 += i3;
            }
        }
        return iDecodeVarint32;
    }

    static double decodeDouble(byte[] data, int position) {
        return Double.longBitsToDouble(decodeFixed64(data, position));
    }

    static int decodeDoubleList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        doubleArrayList.addDouble(decodeDouble(data, position));
        int i2 = position + 8;
        while (i2 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i2, registers);
            if (tag != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(data, iDecodeVarint32));
            i2 = iDecodeVarint32 + 8;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int tag, byte[] data, int position, int limit, GeneratedMessageLite.ExtendableMessage<?, ?> message, GeneratedMessageLite.GeneratedExtension<?, ?> extension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        int iDecodeString = position;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = message.extensions;
        int i2 = tag >>> 3;
        if (extension.descriptor.isRepeated() && extension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(data, iDecodeString, doubleArrayList, registers);
                    fieldSet.setField(extension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(data, iDecodeString, floatArrayList, registers);
                    fieldSet.setField(extension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(data, iDecodeString, longArrayList, registers);
                    fieldSet.setField(extension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(data, iDecodeString, intArrayList, registers);
                    fieldSet.setField(extension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(data, iDecodeString, longArrayList2, registers);
                    fieldSet.setField(extension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(data, iDecodeString, intArrayList2, registers);
                    fieldSet.setField(extension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(data, iDecodeString, booleanArrayList, registers);
                    fieldSet.setField(extension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(data, iDecodeString, intArrayList3, registers);
                    fieldSet.setField(extension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(data, iDecodeString, longArrayList3, registers);
                    fieldSet.setField(extension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(data, iDecodeString, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) message, i2, (List<Integer>) intArrayList4, extension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(extension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (extension.getLiteType() == WireFormat.FieldType.ENUM) {
            iDecodeString = decodeVarint32(data, iDecodeString, registers);
            if (extension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(message, i2, registers.int1, null, unknownFieldSchema);
                return iDecodeString;
            }
            objValueOf = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(decodeDouble(data, iDecodeString));
                    iDecodeString += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(decodeFloat(data, iDecodeString));
                    iDecodeString += 4;
                    break;
                case 3:
                case 4:
                    iDecodeString = decodeVarint64(data, iDecodeString, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    iDecodeString = decodeVarint32(data, iDecodeString, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(decodeFixed64(data, iDecodeString));
                    iDecodeString += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(decodeFixed32(data, iDecodeString));
                    iDecodeString += 4;
                    break;
                case 11:
                    iDecodeString = decodeVarint64(data, iDecodeString, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    iDecodeString = decodeVarint32(data, iDecodeString, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    iDecodeString = decodeVarint64(data, iDecodeString, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    iDecodeString = decodeBytes(data, iDecodeString, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    iDecodeString = decodeString(data, iDecodeString, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i3 = i2 << 3;
                    int i4 = (i3 + 4) - (i3 & 4);
                    Schema schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, data, iDecodeString, limit, i4, registers);
                        fieldSet.addRepeatedField(extension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(extension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(extension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, data, iDecodeString, limit, i4, registers);
                case 18:
                    Schema schemaSchemaFor2 = Protobuf.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, data, iDecodeString, limit, registers);
                        fieldSet.addRepeatedField(extension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(extension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(extension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, data, iDecodeString, limit, registers);
            }
        }
        if (extension.isRepeated()) {
            fieldSet.addRepeatedField(extension.descriptor, objValueOf);
            return iDecodeString;
        }
        fieldSet.setField(extension.descriptor, objValueOf);
        return iDecodeString;
    }

    static int decodeExtensionOrUnknownField(int tag, byte[] data, int position, int limit, Object message, MessageLite defaultInstance, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(defaultInstance, tag >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(tag, data, position, limit, MessageSchema.getMutableUnknownFields(message), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) message;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(tag, data, position, limit, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    static int decodeFixed32(byte[] data, int position) {
        byte b2 = data[position];
        return ((data[position + 3] & 255) << 24) | ((-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - ((data[position + 1] & 255) << 8)))) | (((-1) - (((-1) - data[position + 2]) | ((-1) - 255))) << 16);
    }

    static int decodeFixed32List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) list;
        intArrayList.addInt(decodeFixed32(data, position));
        int i2 = position + 4;
        while (i2 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i2, registers);
            if (tag != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(data, iDecodeVarint32));
            i2 = iDecodeVarint32 + 4;
        }
        return i2;
    }

    static long decodeFixed64(byte[] data, int position) {
        long j2 = (-1) - (((-1) - ((long) data[position])) | ((-1) - 255));
        long j3 = ((-1) - (((-1) - ((long) data[position + 1])) | ((-1) - 255))) << 8;
        long j4 = (j2 + j3) - (j2 & j3);
        long j5 = data[position + 2];
        long j6 = ((j5 + 255) - (j5 | 255)) << 16;
        long j7 = ((j4 + j6) - (j4 & j6)) | (((-1) - (((-1) - ((long) data[position + 3])) | ((-1) - 255))) << 24) | (((-1) - (((-1) - ((long) data[position + 4])) | ((-1) - 255))) << 32);
        long j8 = (((long) data[position + 5]) & 255) << 40;
        long j9 = (j7 + j8) - (j7 & j8);
        long j10 = ((-1) - (((-1) - ((long) data[position + 6])) | ((-1) - 255))) << 48;
        return (-1) - (((-1) - ((((long) data[position + 7]) & 255) << 56)) & ((-1) - ((j9 + j10) - (j9 & j10))));
    }

    static int decodeFixed64List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) list;
        longArrayList.addLong(decodeFixed64(data, position));
        int i2 = position + 8;
        while (i2 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i2, registers);
            if (tag != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(data, iDecodeVarint32));
            i2 = iDecodeVarint32 + 8;
        }
        return i2;
    }

    static float decodeFloat(byte[] data, int position) {
        return Float.intBitsToFloat(decodeFixed32(data, position));
    }

    static int decodeFloatList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) list;
        floatArrayList.addFloat(decodeFloat(data, position));
        int i2 = position + 4;
        while (i2 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i2, registers);
            if (tag != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(data, iDecodeVarint32));
            i2 = iDecodeVarint32 + 4;
        }
        return i2;
    }

    static <T> int decodeGroupField(Schema<T> schema, byte[] data, int position, int limit, int endGroup, Registers registers) throws IOException {
        T tNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(tNewInstance, schema, data, position, limit, endGroup, registers);
        schema.makeImmutable(tNewInstance);
        registers.object1 = tNewInstance;
        return iMergeGroupField;
    }

    static int decodeGroupList(Schema<?> schema, int tag, byte[] data, int position, int limit, Internal.ProtobufList<Object> output, Registers registers) throws IOException {
        int i2 = (-1) - (((-1) - ((tag - 8) - ((-8) | tag))) & ((-1) - 4));
        int iDecodeGroupField = decodeGroupField(schema, data, position, limit, i2, registers);
        output.add(registers.object1);
        while (iDecodeGroupField < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeGroupField, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, data, iDecodeVarint32, limit, i2, registers);
            output.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    static <T> int decodeMessageField(Schema<T> schema, byte[] data, int position, int limit, Registers registers) throws IOException {
        T tNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(tNewInstance, schema, data, position, limit, registers);
        schema.makeImmutable(tNewInstance);
        registers.object1 = tNewInstance;
        return iMergeMessageField;
    }

    static int decodeMessageList(Schema<?> schema, int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        int iDecodeMessageField = decodeMessageField(schema, data, position, limit, registers);
        list.add(registers.object1);
        while (iDecodeMessageField < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeMessageField, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, data, iDecodeVarint32, limit, registers);
            list.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    static int decodePackedBoolList(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(data, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        int i3 = iDecodeVarint32 + i2;
        if (i3 > data.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        doubleArrayList.ensureCapacity(doubleArrayList.size() + (i2 / 8));
        while (iDecodeVarint32 < i3) {
            doubleArrayList.addDouble(decodeDouble(data, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        int i3 = iDecodeVarint32 + i2;
        if (i3 > data.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        intArrayList.ensureCapacity(intArrayList.size() + (i2 / 4));
        while (iDecodeVarint32 < i3) {
            intArrayList.addInt(decodeFixed32(data, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        int i3 = iDecodeVarint32 + i2;
        if (i3 > data.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        longArrayList.ensureCapacity(longArrayList.size() + (i2 / 8));
        while (iDecodeVarint32 < i3) {
            longArrayList.addLong(decodeFixed64(data, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        int i3 = iDecodeVarint32 + i2;
        if (i3 > data.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        floatArrayList.ensureCapacity(floatArrayList.size() + (i2 / 4));
        while (iDecodeVarint32 < i3) {
            floatArrayList.addFloat(decodeFloat(data, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint32List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeSInt32List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint322 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    static int decodeSInt64List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) list;
        int iDecodeVarint64 = decodeVarint64(data, position, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    static int decodeString(byte[] data, int position, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new String(data, iDecodeVarint32, i2, Internal.UTF_8);
        return iDecodeVarint32 + i2;
    }

    static int decodeStringList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            list.add("");
        } else {
            list.add(new String(data, iDecodeVarint32, i2, Internal.UTF_8));
            iDecodeVarint32 += i2;
        }
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint322 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint322, registers);
            int i3 = registers.int1;
            if (i3 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i3 == 0) {
                list.add("");
            } else {
                list.add(new String(data, iDecodeVarint32, i3, Internal.UTF_8));
                iDecodeVarint32 += i3;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringListRequireUtf8(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            list.add("");
        } else {
            int i3 = iDecodeVarint32 + i2;
            if (!Utf8.isValidUtf8(data, iDecodeVarint32, i3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            list.add(new String(data, iDecodeVarint32, i2, Internal.UTF_8));
            iDecodeVarint32 = i3;
        }
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint322 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint322, registers);
            int i4 = registers.int1;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 == 0) {
                list.add("");
            } else {
                int i5 = iDecodeVarint32 + i4;
                if (!Utf8.isValidUtf8(data, iDecodeVarint32, i5)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                list.add(new String(data, iDecodeVarint32, i4, Internal.UTF_8));
                iDecodeVarint32 = i5;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringRequireUtf8(byte[] data, int position, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(data, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    static int decodeUnknownField(int tag, byte[] data, int position, int limit, UnknownFieldSetLite unknownFields, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = position;
        if (WireFormat.getTagFieldNumber(tag) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            unknownFields.storeField(tag, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFields.storeField(tag, Long.valueOf(decodeFixed64(data, iDecodeVarint32)));
            return iDecodeVarint32 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint322 = decodeVarint32(data, iDecodeVarint32, registers);
            int i2 = registers.int1;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i2 > data.length - iDecodeVarint322) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 == 0) {
                unknownFields.storeField(tag, ByteString.EMPTY);
            } else {
                unknownFields.storeField(tag, ByteString.copyFrom(data, iDecodeVarint322, i2));
            }
            return iDecodeVarint322 + i2;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFields.storeField(tag, Integer.valueOf(decodeFixed32(data, iDecodeVarint32)));
            return iDecodeVarint32 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i3 = (-1) - (((-1) - (tag & (-8))) & ((-1) - 4));
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int i4 = 0;
        while (iDecodeVarint32 < limit) {
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint32, registers);
            i4 = registers.int1;
            if (i4 == i3) {
                break;
            }
            iDecodeVarint32 = decodeUnknownField(i4, data, iDecodeVarint32, limit, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (iDecodeVarint32 > limit || i4 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFields.storeField(tag, unknownFieldSetLiteNewInstance);
        return iDecodeVarint32;
    }

    static int decodeVarint32(int firstByte, byte[] data, int position, Registers registers) {
        int i2 = (-1) - (((-1) - firstByte) | ((-1) - 127));
        int i3 = position + 1;
        byte b2 = data[position];
        if (b2 >= 0) {
            int i4 = b2 << 7;
            registers.int1 = (i2 + i4) - (i2 & i4);
            return i3;
        }
        int i5 = (b2 & 127) << 7;
        int i6 = (i2 + i5) - (i2 & i5);
        int i7 = position + 2;
        byte b3 = data[i3];
        if (b3 >= 0) {
            int i8 = b3 << Ascii.SO;
            registers.int1 = (i6 + i8) - (i6 & i8);
            return i7;
        }
        int i9 = ((-1) - (((-1) - b3) | ((-1) - 127))) << 14;
        int i10 = (i6 + i9) - (i6 & i9);
        int i11 = position + 3;
        byte b4 = data[i7];
        if (b4 >= 0) {
            registers.int1 = (-1) - (((-1) - i10) & ((-1) - (b4 << Ascii.NAK)));
            return i11;
        }
        int i12 = (-1) - (((-1) - i10) & ((-1) - ((b4 & 127) << 21)));
        int i13 = position + 4;
        byte b5 = data[i11];
        if (b5 >= 0) {
            registers.int1 = (-1) - (((-1) - i12) & ((-1) - (b5 << Ascii.FS)));
            return i13;
        }
        int i14 = (-1) - (((-1) - i12) & ((-1) - (((-1) - (((-1) - b5) | ((-1) - 127))) << 28)));
        while (true) {
            int i15 = i13 + 1;
            if (data[i13] >= 0) {
                registers.int1 = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int decodeVarint32(byte[] data, int position, Registers registers) {
        int i2 = position + 1;
        byte b2 = data[position];
        if (b2 < 0) {
            return decodeVarint32(b2, data, i2, registers);
        }
        registers.int1 = b2;
        return i2;
    }

    static int decodeVarint32List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint322 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    static int decodeVarint64(long firstByte, byte[] data, int position, Registers registers) {
        int i2 = position + 1;
        byte b2 = data[position];
        long j2 = (-1) - (((-1) - ((firstByte + 127) - (firstByte | 127))) & ((-1) - (((long) ((-1) - (((-1) - b2) | ((-1) - 127)))) << 7)));
        int i3 = 7;
        while (b2 < 0) {
            b2 = data[i2];
            i3 += 7;
            long j3 = ((long) (127 & b2)) << i3;
            j2 = (j2 + j3) - (j2 & j3);
            i2++;
        }
        registers.long1 = j2;
        return i2;
    }

    static int decodeVarint64(byte[] data, int position, Registers registers) {
        int i2 = position + 1;
        long j2 = data[position];
        if (j2 < 0) {
            return decodeVarint64(j2, data, i2, registers);
        }
        registers.long1 = j2;
        return i2;
    }

    static int decodeVarint64List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) list;
        int iDecodeVarint64 = decodeVarint64(data, position, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    static <T> int mergeGroupField(Object msg, Schema<T> schema, byte[] data, int position, int limit, int endGroup, Registers registers) throws IOException {
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int message = ((MessageSchema) schema).parseMessage(msg, data, position, limit, endGroup, registers);
        registers.recursionDepth--;
        registers.object1 = msg;
        return message;
    }

    static <T> int mergeMessageField(Object msg, Schema<T> schema, byte[] data, int position, int limit, Registers registers) throws IOException {
        int iDecodeVarint32 = position + 1;
        int i2 = data[position];
        if (i2 < 0) {
            iDecodeVarint32 = decodeVarint32(i2, data, iDecodeVarint32, registers);
            i2 = registers.int1;
        }
        if (i2 < 0 || i2 > limit - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int i3 = i2 + iDecodeVarint32;
        schema.mergeFrom(msg, data, iDecodeVarint32, i3, registers);
        registers.recursionDepth--;
        registers.object1 = msg;
        return i3;
    }

    public static void setRecursionLimit(int limit) {
        recursionLimit = limit;
    }

    static int skipField(int tag, byte[] data, int position, int limit, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(tag) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            return decodeVarint64(data, position, registers);
        }
        if (tagWireType == 1) {
            return position + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(data, position, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return position + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i2 = tag & (-8);
        int i3 = (i2 + 4) - (i2 & 4);
        int i4 = 0;
        while (position < limit) {
            position = decodeVarint32(data, position, registers);
            i4 = registers.int1;
            if (i4 == i3) {
                break;
            }
            position = skipField(i4, data, position, limit, registers);
        }
        if (position > limit || i4 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return position;
    }
}
