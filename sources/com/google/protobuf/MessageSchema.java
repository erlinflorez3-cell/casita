package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, MessageLite defaultInstance, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = buffer;
        this.objects = objects;
        this.minFieldNumber = minFieldNumber;
        this.maxFieldNumber = maxFieldNumber;
        this.lite = defaultInstance instanceof GeneratedMessageLite;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(defaultInstance);
        this.useCachedSizeField = useCachedSizeField;
        this.intArray = intArray;
        this.checkInitializedCount = checkInitialized;
        this.repeatedFieldOffsetStart = mapFieldPositions;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    private static <T> boolean booleanAt(T message, long offset) {
        return UnsafeUtil.getBoolean(message, offset);
    }

    private static void checkMutable(Object message) {
        if (!isMutable(message)) {
            throw new IllegalArgumentException("Mutating immutable message: " + message);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] data, int position, int limit, MapEntryLite.Metadata<K, V> metadata, Map<K, V> target, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0 || i2 > limit - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i3 = i2 + iDecodeVarint32;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i4 = data[iDecodeVarint32];
            if (i4 < 0) {
                iDecodeVarint322 = ArrayDecoders.decodeVarint32(i4, data, iDecodeVarint322, registers);
                i4 = registers.int1;
            }
            int i5 = i4 >>> 3;
            int i6 = (-1) - (((-1) - i4) | ((-1) - 7));
            if (i5 != 1) {
                if (i5 == 2 && i6 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(data, iDecodeVarint322, limit, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i4, data, iDecodeVarint322, limit, registers);
                }
            } else if (i6 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(data, iDecodeVarint322, limit, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i4, data, iDecodeVarint322, limit, registers);
            }
        }
        if (iDecodeVarint32 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        target.put(obj, obj2);
        return i3;
    }

    private int decodeMapEntryValue(byte[] data, int position, int limit, WireFormat.FieldType fieldType, Class<?> messageType, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(data, position, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(data, position));
                return position + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) messageType), data, position, limit, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T message, long offset) {
        return UnsafeUtil.getDouble(message, offset);
    }

    private boolean equals(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(message, other, pos) && Double.doubleToLongBits(UnsafeUtil.getDouble(message, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(other, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(message, other, pos) && Float.floatToIntBits(UnsafeUtil.getFloat(message, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(other, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getBoolean(message, jOffset) == UnsafeUtil.getBoolean(other, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (isOneofCaseEqual(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i2);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i2)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i2)) == null) ? ub : (UB) filterUnknownEnumMap(i2, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i2, int i3, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i3, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T message, long offset) {
        return UnsafeUtil.getFloat(message, offset);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int pos) {
        return (Internal.EnumVerifier) this.objects[((pos / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int pos) {
        return this.objects[(pos / 3) * 2];
    }

    private Schema getMessageFieldSchema(int pos) {
        int i2 = (pos / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    static UnknownFieldSetLite getMutableUnknownFields(Object message) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSize(schema.getFromMessage(message));
    }

    private static <T> int intAt(T message, long offset) {
        return UnsafeUtil.getInt(message, offset);
    }

    private static boolean isEnforceUtf8(int value) {
        return (value + 536870912) - (value | 536870912) != 0;
    }

    private boolean isFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j2 = (1048575 + iPresenceMaskAndOffsetAt) - (1048575 | iPresenceMaskAndOffsetAt);
        if (j2 != 1048575) {
            int i2 = 1 << (iPresenceMaskAndOffsetAt >>> 20);
            int i3 = UnsafeUtil.getInt(message, j2);
            return (i3 + i2) - (i3 | i2) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(message, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(message, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(message, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(message, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(message, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(message, jOffset));
            case 11:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(message, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean isFieldPresent(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        return presenceFieldOffset == 1048575 ? isFieldPresent(message, pos) : (-1) - (((-1) - presenceField) | ((-1) - presenceMask)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object message, int typeAndOffset, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(message, offset(typeAndOffset)));
    }

    private static boolean isLegacyEnumIsClosed(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object message, int typeAndOffset, int pos) {
        List list = (List) UnsafeUtil.getObject(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!messageFieldSchema.isInitialized(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private boolean isMapInitialized(T t2, int i2, int i3) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t2, offset(i2)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i3)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) message).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T message, T other, int pos) {
        long jPresenceMaskAndOffsetAt = (-1) - (((-1) - presenceMaskAndOffsetAt(pos)) | ((-1) - 1048575));
        return UnsafeUtil.getInt(message, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(other, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T message, int fieldNumber, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        return UnsafeUtil.getInt(message, (long) ((iPresenceMaskAndOffsetAt + 1048575) - (iPresenceMaskAndOffsetAt | 1048575))) == fieldNumber;
    }

    private static boolean isRequired(int value) {
        return (value + REQUIRED_MASK) - (value | REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T message, long offset) {
        return UnsafeUtil.getLong(message, offset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x05a1, code lost:
    
        r3 = r30.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x05a5, code lost:
    
        if (r3 >= r30.repeatedFieldOffsetStart) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x05a7, code lost:
    
        r8 = filterMapUnknownEnumValues(r33, r30.intArray[r3], r8, r31, r33);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x05b9, code lost:
    
        if (r8 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x05bb, code lost:
    
        r31.setBuilderToMessage(r33, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x05be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05e6 A[LOOP:1: B:176:0x05e2->B:178:0x05e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05fa  */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.protobuf.UnknownFieldSchema, com.google.protobuf.UnknownFieldSchema<UT, UB>] */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.google.protobuf.Reader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r31, com.google.protobuf.ExtensionSchema<ET> r32, T r33, com.google.protobuf.Reader r34, com.google.protobuf.ExtensionRegistryLite r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object message, int pos, Object mapDefaultEntry, ExtensionRegistryLite extensionRegistry, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(pos));
        Object object = UnsafeUtil.getObject(message, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(mapDefaultEntry);
            UnsafeUtil.putObject(message, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(message, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isFieldPresent(targetParent, pos)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(targetParent, jOffset, object);
                }
                setFieldPresent(targetParent, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T targetParent, T sourceParent, int pos) {
        int iNumberAt = numberAt(pos);
        if (isOneofPresent(sourceParent, iNumberAt, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isOneofPresent(targetParent, iNumberAt, pos)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(targetParent, jOffset, object);
                }
                setOneofPresent(targetParent, iNumberAt, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(pos);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putDouble(message, jOffset, UnsafeUtil.getDouble(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putFloat(message, jOffset, UnsafeUtil.getFloat(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putBoolean(message, jOffset, UnsafeUtil.getBoolean(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 17:
                mergeMessage(message, other, pos);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(message, other, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, message, other, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                }
                break;
            case 60:
                mergeOneofMessage(message, other, pos);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                }
                break;
            case 68:
                mergeOneofMessage(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T message, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        long jOffset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T message, int fieldNumber, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, offset(typeAndOffsetAt(pos)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> MessageSchema<T> newSchema(Class<T> messageClass, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        FieldInfo[] fields = messageInfo.getFields();
        int i2 = 0;
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i3 = 0;
        int i4 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i3++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i4++;
            }
        }
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] iArr4 = i4 > 0 ? new int[i4] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i2 < fields.length) {
            FieldInfo fieldInfo2 = fields[i2];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr2, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr3[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                iArr4[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
            }
            i2++;
            i5 += 3;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        if (iArr4 == null) {
            iArr4 = EMPTY_INT_ARRAY;
        }
        int length2 = checkInitialized.length + iArr3.length + iArr4.length;
        if (length2 > 0) {
            iArr = new int[length2];
            System.arraycopy(checkInitialized, 0, iArr, 0, checkInitialized.length);
            System.arraycopy(iArr3, 0, iArr, checkInitialized.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr, checkInitialized.length + iArr3.length, iArr4.length);
        } else {
            iArr = EMPTY_INT_ARRAY;
        }
        return new MessageSchema<>(iArr2, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), true, iArr, checkInitialized.length, checkInitialized.length + iArr3.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r34, com.google.protobuf.NewInstanceSchema r35, com.google.protobuf.ListFieldSchema r36, com.google.protobuf.UnknownFieldSchema<?, ?> r37, com.google.protobuf.ExtensionSchema<?> r38, com.google.protobuf.MapFieldSchema r39) {
        /*
            Method dump skipped, instruction units count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    private int numberAt(int pos) {
        return this.buffer[pos];
    }

    private static long offset(int value) {
        return value & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((Boolean) UnsafeUtil.getObject(message, offset)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T message, long offset) {
        return ((Double) UnsafeUtil.getObject(message, offset)).doubleValue();
    }

    private static <T> float oneofFloatAt(T message, long offset) {
        return ((Float) UnsafeUtil.getObject(message, offset)).floatValue();
    }

    private static <T> int oneofIntAt(T message, long offset) {
        return ((Integer) UnsafeUtil.getObject(message, offset)).intValue();
    }

    private static <T> long oneofLongAt(T message, long offset) {
        return ((Long) UnsafeUtil.getObject(message, offset)).longValue();
    }

    private <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(message, fieldOffset, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(data, position, limit, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        int i2 = this.buffer[bufferPosition + 2];
        long j2 = (i2 + 1048575) - (i2 | 1048575);
        switch (fieldType) {
            case 51:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Double.valueOf(ArrayDecoders.decodeDouble(data, position)));
                int i3 = position + 8;
                unsafe.putInt(message, j2, number);
                return i3;
            case 52:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Float.valueOf(ArrayDecoders.decodeFloat(data, position)));
                int i4 = position + 4;
                unsafe.putInt(message, j2, number);
                return i4;
            case 53:
            case 54:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(registers.long1));
                unsafe.putInt(message, j2, number);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.int1));
                unsafe.putInt(message, j2, number);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Long.valueOf(ArrayDecoders.decodeFixed64(data, position)));
                int i5 = position + 8;
                unsafe.putInt(message, j2, number);
                return i5;
            case 57:
            case 64:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(ArrayDecoders.decodeFixed32(data, position)));
                int i6 = position + 4;
                unsafe.putInt(message, j2, number);
                return i6;
            case 58:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(message, j2, number);
                return iDecodeVarint642;
            case 59:
                if (wireType != 2) {
                    return position;
                }
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
                int i7 = registers.int1;
                if (i7 == 0) {
                    unsafe.putObject(message, fieldOffset, "");
                } else {
                    if ((typeAndOffset & 536870912) != 0 && !Utf8.isValidUtf8(data, iDecodeVarint322, iDecodeVarint322 + i7)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(message, fieldOffset, new String(data, iDecodeVarint322, i7, Internal.UTF_8));
                    iDecodeVarint322 += i7;
                }
                unsafe.putInt(message, j2, number);
                return iDecodeVarint322;
            case 60:
                if (wireType != 2) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (wireType != 2) {
                    return position;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(data, position, registers);
                unsafe.putObject(message, fieldOffset, registers.object1);
                unsafe.putInt(message, j2, number);
                return iDecodeBytes;
            case 63:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint323 = ArrayDecoders.decodeVarint32(data, position, registers);
                int i8 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i8)) {
                    getMutableUnknownFields(message).storeField(tag, Long.valueOf(i8));
                    return iDecodeVarint323;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(i8));
                unsafe.putInt(message, j2, number);
                return iDecodeVarint323;
            case 66:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint324 = ArrayDecoders.decodeVarint32(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(message, j2, number);
                return iDecodeVarint324;
            case 67:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(message, j2, number);
                return iDecodeVarint643;
            case 68:
                if (wireType != 3) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (-1) - (((-1) - ((-1) - (((-1) - tag) | ((-1) - (-8))))) & ((-1) - 4)), registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return position;
        }
    }

    private int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(message, fieldOffset);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(protobufListMutableCopyWithCapacity2.size() * 2);
            unsafe.putObject(message, fieldOffset, protobufListMutableCopyWithCapacity2);
        }
        switch (fieldType) {
            case 18:
            case 35:
                return wireType == 2 ? ArrayDecoders.decodePackedDoubleList(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 1 ? ArrayDecoders.decodeDoubleList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 19:
            case 36:
                return wireType == 2 ? ArrayDecoders.decodePackedFloatList(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 5 ? ArrayDecoders.decodeFloatList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 20:
            case 21:
            case 37:
            case 38:
                return wireType == 2 ? ArrayDecoders.decodePackedVarint64List(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 0 ? ArrayDecoders.decodeVarint64List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 22:
            case 29:
            case 39:
            case 43:
                return wireType == 2 ? ArrayDecoders.decodePackedVarint32List(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 0 ? ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 23:
            case 32:
            case 40:
            case 46:
                return wireType == 2 ? ArrayDecoders.decodePackedFixed64List(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 1 ? ArrayDecoders.decodeFixed64List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 24:
            case 31:
            case 41:
            case 45:
                return wireType == 2 ? ArrayDecoders.decodePackedFixed32List(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 5 ? ArrayDecoders.decodeFixed32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 25:
            case 42:
                return wireType == 2 ? ArrayDecoders.decodePackedBoolList(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 0 ? ArrayDecoders.decodeBoolList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 26:
                return wireType == 2 ? (typeAndOffset & 536870912) == 0 ? ArrayDecoders.decodeStringList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : ArrayDecoders.decodeStringListRequireUtf8(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 27:
                return wireType == 2 ? ArrayDecoders.decodeMessageList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 28:
                return wireType == 2 ? ArrayDecoders.decodeBytesList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 30:
            case 44:
                if (wireType == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(data, position, protobufListMutableCopyWithCapacity2, registers);
                } else {
                    if (wireType != 0) {
                        return position;
                    }
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) message, number, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(bufferPosition), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                return wireType == 2 ? ArrayDecoders.decodePackedSInt32List(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 0 ? ArrayDecoders.decodeSInt32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 34:
            case 48:
                return wireType == 2 ? ArrayDecoders.decodePackedSInt64List(data, position, protobufListMutableCopyWithCapacity2, registers) : wireType == 0 ? ArrayDecoders.decodeSInt64List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            case 49:
                return wireType == 3 ? ArrayDecoders.decodeGroupList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers) : position;
            default:
                return position;
        }
    }

    private int positionForFieldNumber(final int number) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    private int positionForFieldNumber(final int number, final int min) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    private int presenceMaskAndOffsetAt(int pos) {
        return this.buffer[pos + 2];
    }

    private <E> void readGroupList(Object message, long offset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(message, offset), schema, extensionRegistry);
    }

    private <E> void readMessageList(Object message, int typeAndOffset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    private void readString(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readString());
        } else {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    private void readStringList(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e2) {
            java.lang.reflect.Field[] declaredFields = messageClass.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + fieldName + " for " + messageClass.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e2);
        }
    }

    private void setFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j2 = (1048575 + iPresenceMaskAndOffsetAt) - (1048575 | iPresenceMaskAndOffsetAt);
        if (j2 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(message, j2, (-1) - (((-1) - (1 << (iPresenceMaskAndOffsetAt >>> 20))) & ((-1) - UnsafeUtil.getInt(message, j2))));
    }

    private void setOneofPresent(T message, int fieldNumber, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        UnsafeUtil.putInt(message, (iPresenceMaskAndOffsetAt + 1048575) - (iPresenceMaskAndOffsetAt | 1048575), fieldNumber);
    }

    private int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.buffer.length / 3) - 1;
        while (min <= length) {
            int i2 = (length + min) >>> 1;
            int i3 = i2 * 3;
            int iNumberAt = numberAt(i3);
            if (number == iNumberAt) {
                return i3;
            }
            if (number < iNumberAt) {
                length = i2 - 1;
            } else {
                min = i2 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r9, int[] r10, int r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T message, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    private void storeOneofMessageField(T message, int fieldNumber, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    private static int type(int value) {
        return ((-1) - (((-1) - value) | ((-1) - FIELD_TYPE_MASK))) >>> 20;
    }

    private int typeAndOffsetAt(int pos) {
        return this.buffer[pos + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0566  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrder(T r24, com.google.protobuf.Writer r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0587  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r10, com.google.protobuf.Writer r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.writeMap(number, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(pos)), this.mapFieldSchema.forMapData(mapField));
        }
    }

    private void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writer.writeString(fieldNumber, (String) value);
        } else {
            writer.writeBytes(fieldNumber, (ByteString) value);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> schema, T message, Writer writer) throws IOException {
        schema.writeTo(schema.getFromMessage(message), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T message, T other) {
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!equals(message, other, i2)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t2) {
        int i2;
        int iComputeGroupSize;
        int iComputeSizeSInt64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        int iComputeGroupSize2;
        int iComputeFixed32Size;
        Unsafe unsafe = UNSAFE;
        boolean z2 = false;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iComputeSFixed32Size = 0;
        int i6 = 1048575;
        while (i5 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i5);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i5);
            int i7 = this.buffer[i5 + 2];
            int i8 = i7 & i3;
            if (iType <= 17) {
                if (i8 != i6) {
                    i4 = i8 == i3 ? z2 ? 1 : 0 : unsafe.getInt(t2, i8 == true ? 1L : 0L);
                    i6 = i8 == true ? 1 : 0;
                }
                i2 = 1 << (i7 >>> 20);
            } else {
                i2 = z2 ? 1 : 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i8 = z2 ? 1 : 0;
            }
            switch (iType) {
                case 0:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeFixed32Size = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeFixed32Size = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeFixed32Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeFixed32Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeFixed32Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeFixed32Size = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        z2 = false;
                        iComputeFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeSFixed32Size += iComputeFixed32Size;
                    }
                    z2 = false;
                    break;
                case 7:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 8:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        Object object = unsafe.getObject(t2, jOffset);
                        iComputeGroupSize2 = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 9:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), getMessageFieldSchema(i5));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 10:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 11:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 12:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 13:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeSFixed32Size += CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                    }
                    z2 = false;
                    break;
                case 14:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 15:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 16:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 17:
                    if (isFieldPresent(t2, i5, (i6 == true ? 1 : 0) == true ? 1 : 0, i4 == true ? 1 : 0, i2)) {
                        iComputeGroupSize2 = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i5));
                        iComputeSFixed32Size += iComputeGroupSize2;
                    }
                    z2 = false;
                    break;
                case 18:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 19:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 20:
                    iComputeGroupSize = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 21:
                    iComputeGroupSize = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 22:
                    iComputeGroupSize = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 23:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 24:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 25:
                    iComputeGroupSize = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 26:
                    iComputeGroupSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 27:
                    iComputeGroupSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i5));
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 28:
                    iComputeGroupSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 29:
                    iComputeGroupSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 30:
                    iComputeGroupSize = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 31:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 32:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 33:
                    iComputeGroupSize = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 34:
                    iComputeGroupSize = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), z2);
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 35:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 36:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 37:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 38:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 39:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 40:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 41:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 42:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 43:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 44:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 45:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 46:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 47:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 48:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 49:
                    iComputeGroupSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i5));
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 50:
                    iComputeGroupSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t2, jOffset), getMapFieldDefaultEntry(i5));
                    iComputeSFixed32Size += iComputeGroupSize;
                    break;
                case 51:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed32Size(iNumberAt, z2 ? 1 : 0);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        Object object2 = unsafe.getObject(t2, jOffset);
                        iComputeGroupSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), getMessageFieldSchema(i5));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed32Size(iNumberAt, z2 ? 1 : 0);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        iComputeGroupSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i5));
                        iComputeSFixed32Size += iComputeGroupSize;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeSFixed32Size + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t2);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T message) {
        int i2;
        int iHashCode;
        int length = this.buffer.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i4);
            int iNumberAt = numberAt(i4);
            long jOffset = offset(iTypeAndOffsetAt);
            int iType = type(iTypeAndOffsetAt);
            int iHashCode2 = 37;
            switch (iType) {
                case 0:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(message, jOffset)));
                    i3 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iHashCode = Float.floatToIntBits(UnsafeUtil.getFloat(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(message, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(message, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashBoolean(UnsafeUtil.getBoolean(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iHashCode = ((String) UnsafeUtil.getObject(message, jOffset)).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(message, jOffset);
                    if (object != null) {
                        iHashCode2 = object.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode2;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(message, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(message, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(message, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(message, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(message, jOffset);
                    if (object2 != null) {
                        iHashCode2 = object2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(message, jOffset)));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Float.floatToIntBits(oneofFloatAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(message, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(message, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashBoolean(oneofBooleanAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = ((String) UnsafeUtil.getObject(message, jOffset)).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(message, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(message, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(message, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(message, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(message, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
            }
        }
        int iHashCode3 = (i3 * 53) + this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (iHashCode3 * 53) + this.extensionSchema.getExtensions(message).hashCode() : iHashCode3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(T r17) {
        /*
            r16 = this;
            r3 = r16
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r8 = r4
            r14 = r9
            r2 = r14
        L9:
            int r0 = r3.checkInitializedCount
            r15 = 1
            r5 = r17
            if (r2 >= r0) goto L9e
            int[] r0 = r3.intArray
            r12 = r0[r2]
            int r7 = r3.numberAt(r12)
            int r6 = r3.typeAndOffsetAt(r12)
            int[] r1 = r3.buffer
            int r0 = r12 + 2
            r1 = r1[r0]
            int r13 = r1 + r4
            r0 = r1 | r4
            int r13 = r13 - r0
            int r0 = r1 >>> 20
            int r15 = r15 << r0
            if (r13 == r8) goto L9c
            if (r13 == r4) goto L35
            sun.misc.Unsafe r8 = com.google.protobuf.MessageSchema.UNSAFE
            long r0 = (long) r13
            int r14 = r8.getInt(r5, r0)
        L35:
            boolean r0 = isRequired(r6)
            if (r0 == 0) goto L45
            r10 = r16
            r11 = r5
            boolean r0 = r10.isFieldPresent(r11, r12, r13, r14, r15)
            if (r0 != 0) goto L45
            return r9
        L45:
            int r1 = type(r6)
            r0 = 9
            if (r1 == r0) goto L88
            r0 = 17
            if (r1 == r0) goto L88
            r0 = 27
            if (r1 == r0) goto L81
            r0 = 60
            if (r1 == r0) goto L70
            r0 = 68
            if (r1 == r0) goto L70
            r0 = 49
            if (r1 == r0) goto L81
            r0 = 50
            if (r1 == r0) goto L69
        L65:
            int r2 = r2 + 1
            r8 = r13
            goto L9
        L69:
            boolean r0 = r3.isMapInitialized(r5, r6, r12)
            if (r0 != 0) goto L65
            return r9
        L70:
            boolean r0 = r3.isOneofPresent(r5, r7, r12)
            if (r0 == 0) goto L65
            com.google.protobuf.Schema r0 = r3.getMessageFieldSchema(r12)
            boolean r0 = isInitialized(r5, r6, r0)
            if (r0 != 0) goto L65
            return r9
        L81:
            boolean r0 = r3.isListInitialized(r5, r6, r12)
            if (r0 != 0) goto L65
            return r9
        L88:
            r10 = r16
            r11 = r5
            boolean r0 = r10.isFieldPresent(r11, r12, r13, r14, r15)
            if (r0 == 0) goto L65
            com.google.protobuf.Schema r0 = r3.getMessageFieldSchema(r12)
            boolean r0 = isInitialized(r5, r6, r0)
            if (r0 != 0) goto L65
            return r9
        L9c:
            r13 = r8
            goto L35
        L9e:
            boolean r0 = r3.hasExtensions
            if (r0 == 0) goto Laf
            com.google.protobuf.ExtensionSchema<?> r0 = r3.extensionSchema
            com.google.protobuf.FieldSet r0 = r0.getExtensions(r5)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Laf
            return r9
        Laf:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, Reader reader, ExtensionRegistryLite extensionRegistry) throws Throwable {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            mergeSingleField(message, other, i2);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, byte[] data, int position, int limit, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(message, data, position, limit, 0, registers);
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00ed. Please report as an issue. */
    int parseMessage(T t2, byte[] bArr, int i2, int i3, int i4, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        int i5;
        int i6;
        int iDecodeUnknownField = i2;
        MessageSchema<T> messageSchema = this;
        byte[] bArr2 = bArr;
        int i7 = i4;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(t2);
        Unsafe unsafe = UNSAFE;
        int iPositionForFieldNumber = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1;
        int i11 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i3) {
                iDecodeVarint32 = iDecodeUnknownField + 1;
                i8 = bArr2[iDecodeUnknownField];
                if (i8 < 0) {
                    iDecodeVarint32 = ArrayDecoders.decodeVarint32(i8, bArr2, iDecodeVarint32, registers2);
                    i8 = registers2.int1;
                }
                int i12 = (i8 == true ? 1 : 0) >>> 3;
                int i13 = (i8 == true ? 1 : 0) & 7;
                iPositionForFieldNumber = i12 > i10 ? messageSchema.positionForFieldNumber(i12, iPositionForFieldNumber / 3) : messageSchema.positionForFieldNumber(i12);
                if (iPositionForFieldNumber == -1) {
                    iPositionForFieldNumber = 0;
                } else {
                    int i14 = messageSchema.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i14);
                    long jOffset = offset(i14);
                    if (iType <= 17) {
                        int i15 = messageSchema.buffer[iPositionForFieldNumber + 2];
                        int i16 = 1 << (i15 >>> 20);
                        int i17 = 1048575;
                        int i18 = i15 & 1048575;
                        if (i18 != i11) {
                            if (i11 != 1048575) {
                                unsafe.putInt(t2, i11, i9);
                                i17 = 1048575;
                            }
                            i9 = i18 == i17 ? 0 : unsafe.getInt(t2, i18);
                            i11 = i18;
                        }
                        switch (iType) {
                            case 0:
                                if (i13 == 1) {
                                    UnsafeUtil.putDouble(t2, jOffset, ArrayDecoders.decodeDouble(bArr2, iDecodeVarint32));
                                    iDecodeUnknownField = iDecodeVarint32 + 8;
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 1:
                                if (i13 == 5) {
                                    UnsafeUtil.putFloat(t2, jOffset, ArrayDecoders.decodeFloat(bArr2, iDecodeVarint32));
                                    iDecodeUnknownField = iDecodeVarint32 + 4;
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i13 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr2, iDecodeVarint32, registers2);
                                    unsafe.putLong(t2, jOffset, registers2.long1);
                                    i9 = (-1) - (((-1) - i9) & ((-1) - i16));
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 4:
                            case 11:
                                if (i13 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, iDecodeVarint32, registers2);
                                    unsafe.putInt(t2, jOffset, registers2.int1);
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i13 == 1) {
                                    unsafe.putLong(t2, jOffset, ArrayDecoders.decodeFixed64(bArr2, iDecodeVarint32));
                                    iDecodeUnknownField = iDecodeVarint32 + 8;
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i13 == 5) {
                                    unsafe.putInt(t2, jOffset, ArrayDecoders.decodeFixed32(bArr2, iDecodeVarint32));
                                    iDecodeUnknownField = iDecodeVarint32 + 4;
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 7:
                                if (i13 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr2, iDecodeVarint32, registers2);
                                    UnsafeUtil.putBoolean(t2, jOffset, registers2.long1 != 0);
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 8:
                                if (i13 == 2) {
                                    iDecodeUnknownField = isEnforceUtf8(i14) ? ArrayDecoders.decodeStringRequireUtf8(bArr2, iDecodeVarint32, registers2) : ArrayDecoders.decodeString(bArr2, iDecodeVarint32, registers2);
                                    unsafe.putObject(t2, jOffset, registers2.object1);
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 9:
                                if (i13 == 2) {
                                    Object objMutableMessageFieldForMerge = messageSchema.mutableMessageFieldForMerge(t2, iPositionForFieldNumber);
                                    iDecodeUnknownField = ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, messageSchema.getMessageFieldSchema(iPositionForFieldNumber), bArr2, iDecodeVarint32, i3, registers2);
                                    messageSchema.storeMessageField(t2, iPositionForFieldNumber, objMutableMessageFieldForMerge);
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 10:
                                if (i13 == 2) {
                                    iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr2, iDecodeVarint32, registers2);
                                    unsafe.putObject(t2, jOffset, registers2.object1);
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 12:
                                if (i13 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, iDecodeVarint32, registers2);
                                    int i19 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema.getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (!isLegacyEnumIsClosed(i14) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i19)) {
                                        unsafe.putInt(t2, jOffset, i19);
                                        i9 = (i9 + i16) - (i9 & i16);
                                        i7 = i4;
                                        bArr2 = bArr2;
                                        i10 = i12;
                                    } else {
                                        getMutableUnknownFields(t2).storeField(i8 == true ? 1 : 0, Long.valueOf(i19));
                                        i7 = i4;
                                        i10 = i12;
                                        bArr2 = bArr2;
                                    }
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 15:
                                if (i13 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, iDecodeVarint32, registers2);
                                    unsafe.putInt(t2, jOffset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i9 = (i9 + i16) - (i9 & i16);
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 16:
                                if (i13 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr2, iDecodeVarint32, registers2);
                                    unsafe.putLong(t2, jOffset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i9 = (-1) - (((-1) - i9) & ((-1) - i16));
                                    i7 = i4;
                                    bArr2 = bArr2;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            case 17:
                                if (i13 == 3) {
                                    Object objMutableMessageFieldForMerge2 = messageSchema.mutableMessageFieldForMerge(t2, iPositionForFieldNumber);
                                    iDecodeUnknownField = ArrayDecoders.mergeGroupField(objMutableMessageFieldForMerge2, messageSchema.getMessageFieldSchema(iPositionForFieldNumber), bArr2, iDecodeVarint32, i3, (-1) - (((-1) - (i12 << 3)) & ((-1) - 4)), registers2);
                                    messageSchema.storeMessageField(t2, iPositionForFieldNumber, objMutableMessageFieldForMerge2);
                                    i9 |= i16;
                                    bArr2 = bArr2;
                                    i7 = i4;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                }
                                break;
                            default:
                                i7 = i4;
                                break;
                        }
                    } else {
                        if (iType == 27) {
                            if (i13 == 2) {
                                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t2, jOffset);
                                if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                    int size = protobufListMutableCopyWithCapacity2.size();
                                    protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                    unsafe.putObject(t2, jOffset, protobufListMutableCopyWithCapacity2);
                                }
                                iDecodeUnknownField = ArrayDecoders.decodeMessageList(messageSchema.getMessageFieldSchema(iPositionForFieldNumber), (i8 == true ? 1 : 0) == true ? 1 : 0, bArr2, iDecodeVarint32, i3, protobufListMutableCopyWithCapacity2, registers2);
                                i7 = i4;
                                i10 = i12;
                                bArr2 = bArr2;
                            } else {
                                i6 = i8 == true ? 1 : 0;
                                i7 = i4;
                            }
                        } else if (iType <= 49) {
                            int i20 = iDecodeVarint32;
                            i6 = i8 == true ? 1 : 0;
                            iDecodeUnknownField = parseRepeatedField(t2, bArr2, i20, i3, (i8 == true ? 1 : 0) == true ? 1 : 0, i12, i13, iPositionForFieldNumber, i14, iType, jOffset, registers2);
                            if (iDecodeUnknownField != i20) {
                                messageSchema = this;
                                bArr2 = bArr2;
                                i7 = i4;
                                registers2 = registers2;
                                i8 = i6;
                                i10 = i12;
                            } else {
                                i7 = i4;
                                iDecodeVarint32 = iDecodeUnknownField;
                            }
                        } else {
                            i6 = i8 == true ? 1 : 0;
                            if (iType != 50) {
                                iDecodeUnknownField = parseOneofField(t2, bArr2, iDecodeVarint32, i3, i6 == true ? 1 : 0, i12, i13, i14, iType, jOffset, iPositionForFieldNumber, registers2);
                                if (iDecodeUnknownField != iDecodeVarint32) {
                                    messageSchema = this;
                                    bArr2 = bArr2;
                                    i7 = i4;
                                    registers2 = registers2;
                                    i8 = i6;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                    iDecodeVarint32 = iDecodeUnknownField;
                                }
                            } else if (i13 == 2) {
                                iDecodeUnknownField = parseMapField(t2, bArr2, iDecodeVarint32, i3, iPositionForFieldNumber, jOffset, registers2);
                                if (iDecodeUnknownField != iDecodeVarint32) {
                                    messageSchema = this;
                                    bArr2 = bArr2;
                                    i7 = i4;
                                    registers2 = registers2;
                                    i8 = i6;
                                    i10 = i12;
                                } else {
                                    i7 = i4;
                                    iDecodeVarint32 = iDecodeUnknownField;
                                }
                            } else {
                                i7 = i4;
                            }
                        }
                        i8 = i6;
                    }
                }
                if (i8 != i7 || i7 == 0) {
                    messageSchema = this;
                    iDecodeUnknownField = (!messageSchema.hasExtensions || registers2.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? ArrayDecoders.decodeUnknownField((i8 == true ? 1 : 0) == true ? 1 : 0, bArr2, iDecodeVarint32, i3, getMutableUnknownFields(t2), registers2) : ArrayDecoders.decodeExtensionOrUnknownField((i8 == true ? 1 : 0) == true ? 1 : 0, bArr2, iDecodeVarint32, i3, t2, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, registers2);
                    bArr2 = bArr2;
                    registers2 = registers2;
                    i10 = i12;
                } else {
                    i5 = 1048575;
                    messageSchema = this;
                }
            } else {
                iDecodeVarint32 = iDecodeUnknownField;
                i5 = 1048575;
            }
        }
        if (i11 != i5) {
            unsafe.putInt(t2, i11, i9);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i21 = messageSchema.checkInitializedCount; i21 < messageSchema.repeatedFieldOffsetStart; i21++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t2, messageSchema.intArray[i21], unknownFieldSetLite, messageSchema.unknownFieldSchema, t2);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t2, unknownFieldSetLite);
        }
        if (i7 == 0) {
            if (iDecodeVarint32 != i3) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iDecodeVarint32 > i3 || i8 != i7) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iDecodeVarint32;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T message, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }
}
