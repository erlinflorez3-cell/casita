package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
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
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    private static boolean isEnforceUtf8(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 536870912)) != 0;
    }

    private static boolean isRequired(int i2) {
        return (i2 & REQUIRED_MASK) != 0;
    }

    private static long offset(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - OFFSET_MASK));
    }

    private static int type(int i2) {
        return ((-1) - (((-1) - i2) | ((-1) - FIELD_TYPE_MASK))) >>> 20;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, boolean z2, boolean z3, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i2;
        this.maxFieldNumber = i3;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z2;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z3;
        this.intArray = iArr2;
        this.checkInitializedCount = i4;
        this.repeatedFieldOffsetStart = i5;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:321:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo r45, androidx.datastore.preferences.protobuf.NewInstanceSchema r46, androidx.datastore.preferences.protobuf.ListFieldSchema r47, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r48, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r49, androidx.datastore.preferences.protobuf.MapFieldSchema r50) {
        /*
            Method dump skipped, instruction units count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i2 = 0;
        boolean z2 = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
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
        int[] iArr2 = null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        if (i4 > 0) {
            iArr2 = new int[i4];
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
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
            storeFieldData(fieldInfo2, iArr, i5, z2, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr3[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                iArr2[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
            }
            i2++;
            i5 += 3;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr3.length + iArr2.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length + iArr3.length, iArr2.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z2, true, iArr4, checkInitialized.length, checkInitialized.length + iArr3.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo r9, int[] r10, int r11, boolean r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, boolean, java.lang.Object[]):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t2, T t3) {
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!equals(t2, t3, i2)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t2).equals(this.unknownFieldSchema.getFromMessage(t3))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t2).equals(this.extensionSchema.getExtensions(t3));
        }
        return true;
    }

    private boolean equals(T t2, T t3, int i2) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i2);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(t2, t3, i2) && Double.doubleToLongBits(UnsafeUtil.getDouble(t2, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t3, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(t2, t3, i2) && Float.floatToIntBits(UnsafeUtil.getFloat(t2, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t3, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getLong(t2, jOffset) == UnsafeUtil.getLong(t3, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getLong(t2, jOffset) == UnsafeUtil.getLong(t3, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getInt(t2, jOffset) == UnsafeUtil.getInt(t3, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getLong(t2, jOffset) == UnsafeUtil.getLong(t3, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getInt(t2, jOffset) == UnsafeUtil.getInt(t3, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getBoolean(t2, jOffset) == UnsafeUtil.getBoolean(t3, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(t2, t3, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(t2, t3, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(t2, t3, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getInt(t2, jOffset) == UnsafeUtil.getInt(t3, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getInt(t2, jOffset) == UnsafeUtil.getInt(t3, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getInt(t2, jOffset) == UnsafeUtil.getInt(t3, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getLong(t2, jOffset) == UnsafeUtil.getLong(t3, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getInt(t2, jOffset) == UnsafeUtil.getInt(t3, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(t2, t3, i2) && UnsafeUtil.getLong(t2, jOffset) == UnsafeUtil.getLong(t3, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(t2, t3, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
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
                if (isOneofCaseEqual(t2, t3, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t2) {
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
                    iHashCode = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t2, jOffset)));
                    i3 = i2 + iHashCode;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iHashCode = Float.floatToIntBits(UnsafeUtil.getFloat(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashBoolean(UnsafeUtil.getBoolean(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iHashCode = ((String) UnsafeUtil.getObject(t2, jOffset)).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t2, jOffset);
                    if (object != null) {
                        iHashCode2 = object.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode2;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getObject(t2, jOffset).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iHashCode;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iHashCode = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = i2 + iHashCode;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t2, jOffset);
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
                    iHashCode = UnsafeUtil.getObject(t2, jOffset).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iHashCode = UnsafeUtil.getObject(t2, jOffset).hashCode();
                    i3 = i2 + iHashCode;
                    break;
                case 51:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t2, jOffset)));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Float.floatToIntBits(oneofFloatAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(t2, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(t2, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashBoolean(oneofBooleanAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = ((String) UnsafeUtil.getObject(t2, jOffset)).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = UnsafeUtil.getObject(t2, jOffset).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = UnsafeUtil.getObject(t2, jOffset).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(t2, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(t2, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(t2, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = oneofIntAt(t2, jOffset);
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = i2 + iHashCode;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iHashCode = UnsafeUtil.getObject(t2, jOffset).hashCode();
                        i3 = i2 + iHashCode;
                    }
                    break;
            }
        }
        int iHashCode3 = (i3 * 53) + this.unknownFieldSchema.getFromMessage(t2).hashCode();
        return this.hasExtensions ? (iHashCode3 * 53) + this.extensionSchema.getExtensions(t2).hashCode() : iHashCode3;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t2, T t3) {
        t3.getClass();
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            mergeSingleField(t2, t3, i2);
        }
        if (this.proto3) {
            return;
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t2, t3);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t2, t3);
        }
    }

    private void mergeSingleField(T t2, T t3, int i2) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i2);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i2);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putDouble(t2, jOffset, UnsafeUtil.getDouble(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 1:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putFloat(t2, jOffset, UnsafeUtil.getFloat(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 2:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 3:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 4:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 5:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 6:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 7:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putBoolean(t2, jOffset, UnsafeUtil.getBoolean(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 8:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 9:
                mergeMessage(t2, t3, i2);
                break;
            case 10:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 11:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 12:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 13:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 14:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 15:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 16:
                if (isFieldPresent(t3, i2)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i2);
                }
                break;
            case 17:
                mergeMessage(t2, t3, i2);
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
                this.listFieldSchema.mergeListsAt(t2, t3, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t2, t3, jOffset);
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
                if (isOneofPresent(t3, iNumberAt, i2)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setOneofPresent(t2, iNumberAt, i2);
                }
                break;
            case 60:
                mergeOneofMessage(t2, t3, i2);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t3, iNumberAt, i2)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setOneofPresent(t2, iNumberAt, i2);
                }
                break;
            case 68:
                mergeOneofMessage(t2, t3, i2);
                break;
        }
    }

    private void mergeMessage(T t2, T t3, int i2) {
        long jOffset = offset(typeAndOffsetAt(i2));
        if (isFieldPresent(t3, i2)) {
            Object object = UnsafeUtil.getObject(t2, jOffset);
            Object object2 = UnsafeUtil.getObject(t3, jOffset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t2, jOffset, Internal.mergeMessage(object, object2));
                setFieldPresent(t2, i2);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t2, jOffset, object2);
                setFieldPresent(t2, i2);
            }
        }
    }

    private void mergeOneofMessage(T t2, T t3, int i2) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i2);
        int iNumberAt = numberAt(i2);
        long jOffset = offset(iTypeAndOffsetAt);
        if (isOneofPresent(t3, iNumberAt, i2)) {
            Object object = UnsafeUtil.getObject(t2, jOffset);
            Object object2 = UnsafeUtil.getObject(t3, jOffset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t2, jOffset, Internal.mergeMessage(object, object2));
                setOneofPresent(t2, iNumberAt, i2);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t2, jOffset, object2);
                setOneofPresent(t2, iNumberAt, i2);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t2) {
        return this.proto3 ? getSerializedSizeProto3(t2) : getSerializedSizeProto2(t2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(T t2) {
        int i2;
        int i3;
        int iComputeGroupSize;
        int iComputeSFixed32Size;
        int iComputeSizeSInt64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        int iComputeSizeSInt64List;
        int iComputeFixed32Size;
        Unsafe unsafe = UNSAFE;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.buffer.length; i7 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i7);
            int iNumberAt = numberAt(i7);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i2 = this.buffer[i7 + 2];
                int i8 = (-1) - (((-1) - OFFSET_MASK) | ((-1) - i2));
                i3 = 1 << (i2 >>> 20);
                if (i8 != i4) {
                    i6 = unsafe.getInt(t2, i8);
                    i4 = i8;
                }
            } else {
                i2 = (!this.useCachedSizeField || iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : (-1) - (((-1) - this.buffer[i7 + 2]) | ((-1) - OFFSET_MASK));
                i3 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i6 & i3) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 1:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 2:
                    if ((-1) - (((-1) - i6) | ((-1) - i3)) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 3:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 4:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 5:
                    if ((-1) - (((-1) - i6) | ((-1) - i3)) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 6:
                    if ((-1) - (((-1) - i6) | ((-1) - i3)) != 0) {
                        iComputeFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i5 += iComputeFixed32Size;
                    }
                    break;
                case 7:
                    if ((i6 & i3) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 8:
                    if ((i6 & i3) != 0) {
                        Object object = unsafe.getObject(t2, jOffset);
                        iComputeGroupSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 9:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeGroupSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), getMessageFieldSchema(i7));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 10:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 11:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 12:
                    if ((-1) - (((-1) - i6) | ((-1) - i3)) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 13:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 15:
                    if ((-1) - (((-1) - i6) | ((-1) - i3)) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 16:
                    if ((i6 + i3) - (i6 | i3) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 17:
                    if ((-1) - (((-1) - i6) | ((-1) - i3)) != 0) {
                        iComputeGroupSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i7));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 18:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeGroupSize;
                    break;
                case 19:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 20:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 21:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 22:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 23:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 24:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 25:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 26:
                    iComputeGroupSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    i5 += iComputeGroupSize;
                    break;
                case 27:
                    iComputeGroupSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i7));
                    i5 += iComputeGroupSize;
                    break;
                case 28:
                    iComputeGroupSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    i5 += iComputeGroupSize;
                    break;
                case 29:
                    iComputeGroupSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeGroupSize;
                    break;
                case 30:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 31:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 32:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 33:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 34:
                    iComputeSizeSInt64List = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 += iComputeSizeSInt64List;
                    break;
                case 35:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeGroupSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i7));
                    i5 += iComputeGroupSize;
                    break;
                case 50:
                    iComputeGroupSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t2, jOffset), getMapFieldDefaultEntry(i7));
                    i5 += iComputeGroupSize;
                    break;
                case 51:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        Object object2 = unsafe.getObject(t2, jOffset);
                        iComputeGroupSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), getMessageFieldSchema(i7));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i5 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i5 += iComputeGroupSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t2, iNumberAt, i7)) {
                        iComputeGroupSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), getMessageFieldSchema(i7));
                        i5 += iComputeGroupSize;
                    }
                    break;
            }
        }
        int unknownFieldsSerializedSize = i5 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t2);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t2) {
        int i2;
        int iComputeGroupSize;
        int iComputeSizeSInt64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i3 = 0;
        for (int i4 = 0; i4 < this.buffer.length; i4 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i4);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i4);
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i2 = 0;
            } else {
                int i5 = this.buffer[i4 + 2];
                i2 = (i5 + OFFSET_MASK) - (i5 | OFFSET_MASK);
            }
            switch (iType) {
                case 0:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeInt64Size(iNumberAt, UnsafeUtil.getLong(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt64Size(iNumberAt, UnsafeUtil.getLong(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeInt32Size(iNumberAt, UnsafeUtil.getInt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t2, i4)) {
                        Object object = UnsafeUtil.getObject(t2, jOffset);
                        if (object instanceof ByteString) {
                            iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object);
                        } else {
                            iComputeGroupSize = CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        }
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t2, jOffset), getMessageFieldSchema(i4));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt32Size(iNumberAt, UnsafeUtil.getInt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeEnumSize(iNumberAt, UnsafeUtil.getInt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt32Size(iNumberAt, UnsafeUtil.getInt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt64Size(iNumberAt, UnsafeUtil.getLong(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(t2, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t2, jOffset), getMessageFieldSchema(i4));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 18:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 19:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 20:
                    iComputeGroupSize = SchemaUtil.computeSizeInt64List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 21:
                    iComputeGroupSize = SchemaUtil.computeSizeUInt64List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 22:
                    iComputeGroupSize = SchemaUtil.computeSizeInt32List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 23:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 24:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 25:
                    iComputeGroupSize = SchemaUtil.computeSizeBoolList(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 26:
                    iComputeGroupSize = SchemaUtil.computeSizeStringList(iNumberAt, listAt(t2, jOffset));
                    i3 += iComputeGroupSize;
                    break;
                case 27:
                    iComputeGroupSize = SchemaUtil.computeSizeMessageList(iNumberAt, listAt(t2, jOffset), getMessageFieldSchema(i4));
                    i3 += iComputeGroupSize;
                    break;
                case 28:
                    iComputeGroupSize = SchemaUtil.computeSizeByteStringList(iNumberAt, listAt(t2, jOffset));
                    i3 += iComputeGroupSize;
                    break;
                case 29:
                    iComputeGroupSize = SchemaUtil.computeSizeUInt32List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 30:
                    iComputeGroupSize = SchemaUtil.computeSizeEnumList(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 31:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 32:
                    iComputeGroupSize = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 33:
                    iComputeGroupSize = SchemaUtil.computeSizeSInt32List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 34:
                    iComputeGroupSize = SchemaUtil.computeSizeSInt64List(iNumberAt, listAt(t2, jOffset), false);
                    i3 += iComputeGroupSize;
                    break;
                case 35:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 36:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 37:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 38:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 39:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 40:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 41:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 42:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 43:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 44:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 45:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 46:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 47:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 48:
                    iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t2, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeSInt64ListNoTag);
                        iComputeGroupSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeSInt64ListNoTag;
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 49:
                    iComputeGroupSize = SchemaUtil.computeSizeGroupList(iNumberAt, listAt(t2, jOffset), getMessageFieldSchema(i4));
                    i3 += iComputeGroupSize;
                    break;
                case 50:
                    iComputeGroupSize = this.mapFieldSchema.getSerializedSize(iNumberAt, UnsafeUtil.getObject(t2, jOffset), getMapFieldDefaultEntry(i4));
                    i3 += iComputeGroupSize;
                    break;
                case 51:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        Object object2 = UnsafeUtil.getObject(t2, jOffset);
                        if (object2 instanceof ByteString) {
                            iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2);
                        } else {
                            iComputeGroupSize = CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        }
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t2, jOffset), getMessageFieldSchema(i4));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i3 += iComputeGroupSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeGroupSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t2, jOffset), getMessageFieldSchema(i4));
                        i3 += iComputeGroupSize;
                    }
                    break;
            }
        }
        return i3 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t2);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t2) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t2));
    }

    private static List<?> listAt(Object obj, long j2) {
        return (List) UnsafeUtil.getObject(obj, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t2, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t2, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t2, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t2, writer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:416:0x04cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(T r18, androidx.datastore.preferences.protobuf.Writer r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:450:0x0581  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:449:0x0587  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r10, androidx.datastore.preferences.protobuf.Writer r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            writer.writeMap(i2, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i3)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t2, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t2), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t2, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t2, reader, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:512:0x05dc, code lost:
    
        r1 = r24.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x05e0, code lost:
    
        if (r1 >= r24.repeatedFieldOffsetStart) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x05e2, code lost:
    
        r8 = filterMapUnknownEnumValues(r27, r24.intArray[r1], r8, r25);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x05ed, code lost:
    
        if (r8 == null) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x05ef, code lost:
    
        r25.setBuilderToMessage(r27, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x05f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r25, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r26, T r27, androidx.datastore.preferences.protobuf.Reader r28, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1 */
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

    private int decodeMapEntryValue(byte[] bArr, int i2, int i3, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i2, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i2));
                return i2 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i2, i3, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i2, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i2, int i3, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0 || i4 > i3 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = i4 + iDecodeVarint32;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i5) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i6 = bArr[iDecodeVarint32];
            if (i6 < 0) {
                iDecodeVarint322 = ArrayDecoders.decodeVarint32(i6, bArr, iDecodeVarint322, registers);
                i6 = registers.int1;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 == 1) {
                if (i8 == metadata.keyType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, iDecodeVarint322, i3, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i6, bArr, iDecodeVarint322, i3, registers);
                }
            } else if (i7 == 2 && i8 == metadata.valueType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, iDecodeVarint322, i3, metadata.valueType, metadata.defaultValue.getClass(), registers);
                obj2 = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i6, bArr, iDecodeVarint322, i3, registers);
            }
        }
        if (iDecodeVarint32 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int parseRepeatedField(T t2, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t2, j3);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t2, j3, protobufListMutableCopyWithCapacity2);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 1 ? ArrayDecoders.decodeDoubleList(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 19:
            case 36:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 5 ? ArrayDecoders.decodeFloatList(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 0 ? ArrayDecoders.decodeVarint64List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 0 ? ArrayDecoders.decodeVarint32List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 1 ? ArrayDecoders.decodeFixed64List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 5 ? ArrayDecoders.decodeFixed32List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 25:
            case 42:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 0 ? ArrayDecoders.decodeBoolList(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 26:
                if (i6 != 2) {
                    return i2;
                }
                if ((j2 & 536870912) == 0) {
                    return ArrayDecoders.decodeStringList(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers);
                }
                return ArrayDecoders.decodeStringListRequireUtf8(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers);
            case 27:
                return i6 == 2 ? ArrayDecoders.decodeMessageList(getMessageFieldSchema(i7), i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 28:
                return i6 == 2 ? ArrayDecoders.decodeBytesList(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 30:
            case 44:
                if (i6 == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                } else {
                    if (i6 != 0) {
                        return i2;
                    }
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.filterUnknownEnumList(i5, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i7), unknownFieldSetLite, (UnknownFieldSchema<UT, UnknownFieldSetLite>) this.unknownFieldSchema);
                if (unknownFieldSetLite2 == null) {
                    return iDecodeVarint32List;
                }
                generatedMessageLite.unknownFields = unknownFieldSetLite2;
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 0 ? ArrayDecoders.decodeSInt32List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 34:
            case 48:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return i6 == 0 ? ArrayDecoders.decodeSInt64List(i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            case 49:
                return i6 == 3 ? ArrayDecoders.decodeGroupList(getMessageFieldSchema(i7), i4, bArr, i2, i3, protobufListMutableCopyWithCapacity2, registers) : i2;
            default:
                return i2;
        }
    }

    private <K, V> int parseMapField(T t2, byte[] bArr, int i2, int i3, int i4, long j2, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i4);
        Object object = unsafe.getObject(t2, j2);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t2, j2, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i2, i3, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t2, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j3 = (-1) - (((-1) - this.buffer[i9 + 2]) | ((-1) - OFFSET_MASK));
        switch (i8) {
            case 51:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(t2, j2, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i2)));
                int i10 = i2 + 8;
                unsafe.putInt(t2, j3, i5);
                return i10;
            case 52:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(t2, j2, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i2)));
                int i11 = i2 + 4;
                unsafe.putInt(t2, j3, i5);
                return i11;
            case 53:
            case 54:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                unsafe.putObject(t2, j2, Long.valueOf(registers.long1));
                unsafe.putInt(t2, j3, i5);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                unsafe.putObject(t2, j2, Integer.valueOf(registers.int1));
                unsafe.putInt(t2, j3, i5);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(t2, j2, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i2)));
                int i12 = i2 + 8;
                unsafe.putInt(t2, j3, i5);
                return i12;
            case 57:
            case 64:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(t2, j2, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i2)));
                int i13 = i2 + 4;
                unsafe.putInt(t2, j3, i5);
                return i13;
            case 58:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                unsafe.putObject(t2, j2, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t2, j3, i5);
                return iDecodeVarint642;
            case 59:
                if (i6 != 2) {
                    return i2;
                }
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                int i14 = registers.int1;
                if (i14 == 0) {
                    unsafe.putObject(t2, j2, "");
                } else {
                    if ((-1) - (((-1) - i7) | ((-1) - 536870912)) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i14)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t2, j2, new String(bArr, iDecodeVarint322, i14, Internal.UTF_8));
                    iDecodeVarint322 += i14;
                }
                unsafe.putInt(t2, j3, i5);
                return iDecodeVarint322;
            case 60:
                if (i6 != 2) {
                    return i2;
                }
                int iDecodeMessageField = ArrayDecoders.decodeMessageField(getMessageFieldSchema(i9), bArr, i2, i3, registers);
                Object object = unsafe.getInt(t2, j3) == i5 ? unsafe.getObject(t2, j2) : null;
                if (object == null) {
                    unsafe.putObject(t2, j2, registers.object1);
                } else {
                    unsafe.putObject(t2, j2, Internal.mergeMessage(object, registers.object1));
                }
                unsafe.putInt(t2, j3, i5);
                return iDecodeMessageField;
            case 61:
                if (i6 != 2) {
                    return i2;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i2, registers);
                unsafe.putObject(t2, j2, registers.object1);
                unsafe.putInt(t2, j3, i5);
                return iDecodeBytes;
            case 63:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                int i15 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i9);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i15)) {
                    unsafe.putObject(t2, j2, Integer.valueOf(i15));
                    unsafe.putInt(t2, j3, i5);
                    return iDecodeVarint323;
                }
                getMutableUnknownFields(t2).storeField(i4, Long.valueOf(i15));
                return iDecodeVarint323;
            case 66:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                unsafe.putObject(t2, j2, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t2, j3, i5);
                return iDecodeVarint324;
            case 67:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                unsafe.putObject(t2, j2, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t2, j3, i5);
                return iDecodeVarint643;
            case 68:
                if (i6 != 3) {
                    return i2;
                }
                int i16 = (-1) - (((-1) - i4) | ((-1) - (-8)));
                int iDecodeGroupField = ArrayDecoders.decodeGroupField(getMessageFieldSchema(i9), bArr, i2, i3, (i16 + 4) - (i16 & 4), registers);
                Object object2 = unsafe.getInt(t2, j3) == i5 ? unsafe.getObject(t2, j2) : null;
                if (object2 == null) {
                    unsafe.putObject(t2, j2, registers.object1);
                } else {
                    unsafe.putObject(t2, j2, Internal.mergeMessage(object2, registers.object1));
                }
                unsafe.putInt(t2, j3, i5);
                return iDecodeGroupField;
            default:
                return i2;
        }
    }

    private Schema getMessageFieldSchema(int i2) {
        int i3 = (i2 / 3) * 2;
        Schema schema = (Schema) this.objects[i3];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i3 + 1]);
        this.objects[i3] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    private Object getMapFieldDefaultEntry(int i2) {
        return this.objects[(i2 / 3) * 2];
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i2) {
        return (Internal.EnumVerifier) this.objects[((i2 / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:262:0x00f8. Please report as an issue. */
    int parseProto2Message(T t2, byte[] bArr, int i2, int i3, int i4, ArrayDecoders.Registers registers) throws IOException {
        int i5;
        int i6;
        int iDecodeUnknownField = i2;
        MessageSchema<T> messageSchema = this;
        int i7 = i3;
        int i8 = i4;
        ArrayDecoders.Registers registers2 = registers;
        Unsafe unsafe = UNSAFE;
        int iPositionForFieldNumber = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (iDecodeUnknownField < i7) {
                int i13 = iDecodeUnknownField + 1;
                i9 = bArr[iDecodeUnknownField];
                if (i9 < 0) {
                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(i9, bArr, i13, registers2);
                    i9 = registers2.int1;
                } else {
                    iDecodeUnknownField = i13;
                }
                int i14 = (i9 == true ? 1 : 0) >>> 3;
                int i15 = ((i9 == true ? 1 : 0) + 7) - (7 | (i9 == true ? 1 : 0));
                iPositionForFieldNumber = i14 > i11 ? messageSchema.positionForFieldNumber(i14, iPositionForFieldNumber / 3) : messageSchema.positionForFieldNumber(i14);
                if (iPositionForFieldNumber == -1) {
                    iPositionForFieldNumber = 0;
                } else {
                    int i16 = messageSchema.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i16);
                    long jOffset = offset(i16);
                    if (iType <= 17) {
                        int i17 = messageSchema.buffer[iPositionForFieldNumber + 2];
                        int i18 = 1 << (i17 >>> 20);
                        int i19 = i17 & OFFSET_MASK;
                        if (i19 != i12) {
                            if (i12 != -1) {
                                unsafe.putInt(t2, i12, i10);
                            }
                            i10 = unsafe.getInt(t2, i19);
                            i12 = i19;
                        }
                        switch (iType) {
                            case 0:
                                if (i15 == 1) {
                                    UnsafeUtil.putDouble(t2, jOffset, ArrayDecoders.decodeDouble(bArr, iDecodeUnknownField));
                                    iDecodeUnknownField += 8;
                                    i10 |= i18;
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 1:
                                if (i15 == 5) {
                                    UnsafeUtil.putFloat(t2, jOffset, ArrayDecoders.decodeFloat(bArr, iDecodeUnknownField));
                                    iDecodeUnknownField += 4;
                                    i10 |= i18;
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i15 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr, iDecodeUnknownField, registers2);
                                    unsafe.putLong(t2, jOffset, registers2.long1);
                                    i10 |= i18;
                                    i11 = i14;
                                    i7 = i3;
                                    i8 = i4;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 4:
                            case 11:
                                if (i15 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, iDecodeUnknownField, registers2);
                                    unsafe.putInt(t2, jOffset, registers2.int1);
                                    i10 |= i18;
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i15 == 1) {
                                    unsafe.putLong(t2, jOffset, ArrayDecoders.decodeFixed64(bArr, iDecodeUnknownField));
                                    iDecodeUnknownField += 8;
                                    i10 |= i18;
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i15 == 5) {
                                    unsafe.putInt(t2, jOffset, ArrayDecoders.decodeFixed32(bArr, iDecodeUnknownField));
                                    iDecodeUnknownField += 4;
                                    i10 |= i18;
                                    i11 = i14;
                                    i7 = i3;
                                    i8 = i4;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 7:
                                if (i15 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr, iDecodeUnknownField, registers2);
                                    UnsafeUtil.putBoolean(t2, jOffset, registers2.long1 != 0);
                                    i10 |= i18;
                                    i11 = i14;
                                    i7 = i3;
                                    i8 = i4;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 8:
                                if (i15 == 2) {
                                    iDecodeUnknownField = (i16 + 536870912) - (i16 | 536870912) == 0 ? ArrayDecoders.decodeString(bArr, iDecodeUnknownField, registers2) : ArrayDecoders.decodeStringRequireUtf8(bArr, iDecodeUnknownField, registers2);
                                    unsafe.putObject(t2, jOffset, registers2.object1);
                                    i10 |= i18;
                                    i11 = i14;
                                    i7 = i3;
                                    i8 = i4;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 9:
                                if (i15 == 2) {
                                    iDecodeUnknownField = ArrayDecoders.decodeMessageField(messageSchema.getMessageFieldSchema(iPositionForFieldNumber), bArr, iDecodeUnknownField, i3, registers2);
                                    if ((i10 & i18) == 0) {
                                        unsafe.putObject(t2, jOffset, registers2.object1);
                                    } else {
                                        unsafe.putObject(t2, jOffset, Internal.mergeMessage(unsafe.getObject(t2, jOffset), registers2.object1));
                                    }
                                    i10 |= i18;
                                    i11 = i14;
                                    i7 = i3;
                                    i8 = i4;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 10:
                                if (i15 == 2) {
                                    iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr, iDecodeUnknownField, registers2);
                                    unsafe.putObject(t2, jOffset, registers2.object1);
                                    i10 |= i18;
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 12:
                                if (i15 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, iDecodeUnknownField, registers2);
                                    int i20 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema.getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i20)) {
                                        unsafe.putInt(t2, jOffset, i20);
                                        i10 |= i18;
                                        i8 = i4;
                                        i11 = i14;
                                        i7 = i3;
                                    } else {
                                        getMutableUnknownFields(t2).storeField(i9 == true ? 1 : 0, Long.valueOf(i20));
                                        i8 = i4;
                                        i11 = i14;
                                        i7 = i3;
                                    }
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 15:
                                if (i15 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, iDecodeUnknownField, registers2);
                                    unsafe.putInt(t2, jOffset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i10 |= i18;
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 16:
                                if (i15 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr, iDecodeUnknownField, registers2);
                                    unsafe.putLong(t2, jOffset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i10 |= i18;
                                    i11 = i14;
                                    i7 = i3;
                                    i8 = i4;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            case 17:
                                if (i15 == 3) {
                                    iDecodeUnknownField = ArrayDecoders.decodeGroupField(messageSchema.getMessageFieldSchema(iPositionForFieldNumber), bArr, iDecodeUnknownField, i3, (-1) - (((-1) - (i14 << 3)) & ((-1) - 4)), registers2);
                                    if ((i10 & i18) == 0) {
                                        unsafe.putObject(t2, jOffset, registers2.object1);
                                    } else {
                                        unsafe.putObject(t2, jOffset, Internal.mergeMessage(unsafe.getObject(t2, jOffset), registers2.object1));
                                    }
                                    i10 = (-1) - (((-1) - i10) & ((-1) - i18));
                                    i8 = i4;
                                    i11 = i14;
                                    i7 = i3;
                                } else {
                                    i8 = i4;
                                }
                                break;
                            default:
                                i8 = i4;
                                break;
                        }
                    } else {
                        if (iType == 27) {
                            if (i15 == 2) {
                                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t2, jOffset);
                                if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                    int size = protobufListMutableCopyWithCapacity2.size();
                                    protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                    unsafe.putObject(t2, jOffset, protobufListMutableCopyWithCapacity2);
                                }
                                iDecodeUnknownField = ArrayDecoders.decodeMessageList(messageSchema.getMessageFieldSchema(iPositionForFieldNumber), (i9 == true ? 1 : 0) == true ? 1 : 0, bArr, iDecodeUnknownField, i3, protobufListMutableCopyWithCapacity2, registers2);
                                i8 = i4;
                                i11 = i14;
                                i7 = i3;
                            } else {
                                i5 = iDecodeUnknownField;
                                i6 = i9 == true ? 1 : 0;
                            }
                        } else if (iType <= 49) {
                            int i21 = iDecodeUnknownField;
                            i6 = i9 == true ? 1 : 0;
                            iDecodeUnknownField = parseRepeatedField(t2, bArr, iDecodeUnknownField, i3, (i9 == true ? 1 : 0) == true ? 1 : 0, i14, i15, iPositionForFieldNumber, i16, iType, jOffset, registers2);
                            if (iDecodeUnknownField != i21) {
                                messageSchema = this;
                                i7 = i3;
                                i8 = i4;
                                registers2 = registers2;
                                i11 = i14;
                                i9 = i6;
                            } else {
                                i9 = i6;
                                i8 = i4;
                            }
                        } else {
                            i5 = iDecodeUnknownField;
                            i6 = i9 == true ? 1 : 0;
                            if (iType != 50) {
                                iDecodeUnknownField = parseOneofField(t2, bArr, i5, i3, i6 == true ? 1 : 0, i14, i15, i16, iType, jOffset, iPositionForFieldNumber, registers2);
                                if (iDecodeUnknownField != i5) {
                                    messageSchema = this;
                                    i7 = i3;
                                    i8 = i4;
                                    registers2 = registers2;
                                    i11 = i14;
                                    i9 = i6;
                                } else {
                                    i9 = i6;
                                    i8 = i4;
                                }
                            } else if (i15 == 2) {
                                iDecodeUnknownField = parseMapField(t2, bArr, i5, i3, iPositionForFieldNumber, jOffset, registers2);
                                if (iDecodeUnknownField != i5) {
                                    messageSchema = this;
                                    i7 = i3;
                                    i8 = i4;
                                    registers2 = registers2;
                                    i11 = i14;
                                    i9 = i6;
                                } else {
                                    i9 = i6;
                                    i8 = i4;
                                }
                            }
                        }
                        i8 = i4;
                        iDecodeUnknownField = i5;
                        i9 = i6;
                    }
                }
                if (i9 != i8 || i8 == 0) {
                    messageSchema = this;
                    iDecodeUnknownField = (!messageSchema.hasExtensions || registers2.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? ArrayDecoders.decodeUnknownField((i9 == true ? 1 : 0) == true ? 1 : 0, bArr, iDecodeUnknownField, i3, getMutableUnknownFields(t2), registers2) : ArrayDecoders.decodeExtensionOrUnknownField((i9 == true ? 1 : 0) == true ? 1 : 0, bArr, iDecodeUnknownField, i3, t2, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, registers2);
                    i7 = i3;
                    registers2 = registers2;
                    i11 = i14;
                } else {
                    messageSchema = this;
                }
            }
        }
        if (i12 != -1) {
            unsafe.putInt(t2, i12, i10);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i22 = messageSchema.checkInitializedCount; i22 < messageSchema.repeatedFieldOffsetStart; i22++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t2, messageSchema.intArray[i22], unknownFieldSetLite, messageSchema.unknownFieldSchema);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t2, unknownFieldSetLite);
        }
        if (i8 == 0) {
            if (iDecodeUnknownField != i3) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iDecodeUnknownField > i3 || i9 != i8) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iDecodeUnknownField;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x01be, code lost:
    
        if (r8 != r0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01dd, code lost:
    
        if (r8 != r9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01ff, code lost:
    
        if (r8 != r9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0203, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:152:0x0066. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseProto3Message(T r35, byte[] r36, int r37, int r38, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.parseProto3Message(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t2, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
        if (this.proto3) {
            parseProto3Message(t2, bArr, i2, i3, registers);
        } else {
            parseProto2Message(t2, bArr, i2, i3, 0, registers);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T t2) {
        int i2;
        int i3 = this.checkInitializedCount;
        while (true) {
            i2 = this.repeatedFieldOffsetStart;
            if (i3 >= i2) {
                break;
            }
            long jOffset = offset(typeAndOffsetAt(this.intArray[i3]));
            Object object = UnsafeUtil.getObject(t2, jOffset);
            if (object != null) {
                UnsafeUtil.putObject(t2, jOffset, this.mapFieldSchema.toImmutable(object));
            }
            i3++;
        }
        int length = this.intArray.length;
        while (i2 < length) {
            this.listFieldSchema.makeImmutableListAt(t2, this.intArray[i2]);
            i2++;
        }
        this.unknownFieldSchema.makeImmutable(t2);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t2);
        }
    }

    private final <K, V> void mergeMap(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i2));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i2);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i2)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i2)) == null) ? ub : (UB) filterUnknownEnumMap(i2, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema);
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i2, int i3, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.newBuilder();
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x007b  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(T r12) {
        /*
            r11 = this;
            r3 = -1
            r10 = 0
            r2 = r10
            r1 = r2
        L4:
            int r0 = r11.checkInitializedCount
            r7 = 1
            if (r2 >= r0) goto L95
            int[] r0 = r11.intArray
            r5 = r0[r2]
            int r8 = r11.numberAt(r5)
            int r4 = r11.typeAndOffsetAt(r5)
            boolean r0 = r11.proto3
            if (r0 != 0) goto L93
            int[] r6 = r11.buffer
            int r0 = r5 + 2
            r9 = r6[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            int r6 = r0 + r9
            r0 = r0 | r9
            int r6 = r6 - r0
            int r0 = r9 >>> 20
            int r7 = r7 << r0
            if (r6 == r3) goto L33
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            long r0 = (long) r6
            int r1 = r3.getInt(r12, r0)
            r3 = r6
        L33:
            boolean r0 = isRequired(r4)
            if (r0 == 0) goto L40
            boolean r0 = r11.isFieldPresent(r12, r5, r1, r7)
            if (r0 != 0) goto L40
            return r10
        L40:
            int r6 = type(r4)
            r0 = 9
            if (r6 == r0) goto L82
            r0 = 17
            if (r6 == r0) goto L82
            r0 = 27
            if (r6 == r0) goto L7b
            r0 = 60
            if (r6 == r0) goto L6a
            r0 = 68
            if (r6 == r0) goto L6a
            r0 = 49
            if (r6 == r0) goto L7b
            r0 = 50
            if (r6 == r0) goto L63
        L60:
            int r2 = r2 + 1
            goto L4
        L63:
            boolean r0 = r11.isMapInitialized(r12, r4, r5)
            if (r0 != 0) goto L60
            return r10
        L6a:
            boolean r0 = r11.isOneofPresent(r12, r8, r5)
            if (r0 == 0) goto L60
            androidx.datastore.preferences.protobuf.Schema r0 = r11.getMessageFieldSchema(r5)
            boolean r0 = isInitialized(r12, r4, r0)
            if (r0 != 0) goto L60
            return r10
        L7b:
            boolean r0 = r11.isListInitialized(r12, r4, r5)
            if (r0 != 0) goto L60
            return r10
        L82:
            boolean r0 = r11.isFieldPresent(r12, r5, r1, r7)
            if (r0 == 0) goto L60
            androidx.datastore.preferences.protobuf.Schema r0 = r11.getMessageFieldSchema(r5)
            boolean r0 = isInitialized(r12, r4, r0)
            if (r0 != 0) goto L60
            return r10
        L93:
            r7 = r10
            goto L33
        L95:
            boolean r0 = r11.hasExtensions
            if (r0 == 0) goto La6
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r11.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.getExtensions(r12)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto La6
            return r10
        La6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i2, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i2, int i3) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i2));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!messageFieldSchema.isInitialized(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.datastore.preferences.protobuf.Schema] */
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

    private void writeString(int i2, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i2, (String) obj);
        } else {
            writer.writeBytes(i2, (ByteString) obj);
        }
    }

    private void readString(Object obj, int i2, Reader reader) throws IOException {
        if (isEnforceUtf8(i2)) {
            UnsafeUtil.putObject(obj, offset(i2), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i2), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i2), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i2, Reader reader) throws IOException {
        if (isEnforceUtf8(i2)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i2)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i2)));
        }
    }

    private <E> void readMessageList(Object obj, int i2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i2)), schema, extensionRegistryLite);
    }

    private <E> void readGroupList(Object obj, long j2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j2), schema, extensionRegistryLite);
    }

    private int numberAt(int i2) {
        return this.buffer[i2];
    }

    private int typeAndOffsetAt(int i2) {
        return this.buffer[i2 + 1];
    }

    private int presenceMaskAndOffsetAt(int i2) {
        return this.buffer[i2 + 2];
    }

    private static <T> double doubleAt(T t2, long j2) {
        return UnsafeUtil.getDouble(t2, j2);
    }

    private static <T> float floatAt(T t2, long j2) {
        return UnsafeUtil.getFloat(t2, j2);
    }

    private static <T> int intAt(T t2, long j2) {
        return UnsafeUtil.getInt(t2, j2);
    }

    private static <T> long longAt(T t2, long j2) {
        return UnsafeUtil.getLong(t2, j2);
    }

    private static <T> boolean booleanAt(T t2, long j2) {
        return UnsafeUtil.getBoolean(t2, j2);
    }

    private static <T> double oneofDoubleAt(T t2, long j2) {
        return ((Double) UnsafeUtil.getObject(t2, j2)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t2, long j2) {
        return ((Float) UnsafeUtil.getObject(t2, j2)).floatValue();
    }

    private static <T> int oneofIntAt(T t2, long j2) {
        return ((Integer) UnsafeUtil.getObject(t2, j2)).intValue();
    }

    private static <T> long oneofLongAt(T t2, long j2) {
        return ((Long) UnsafeUtil.getObject(t2, j2)).longValue();
    }

    private static <T> boolean oneofBooleanAt(T t2, long j2) {
        return ((Boolean) UnsafeUtil.getObject(t2, j2)).booleanValue();
    }

    private boolean arePresentForEquals(T t2, T t3, int i2) {
        return isFieldPresent(t2, i2) == isFieldPresent(t3, i2);
    }

    private boolean isFieldPresent(T t2, int i2, int i3, int i4) {
        if (this.proto3) {
            return isFieldPresent(t2, i2);
        }
        return (i3 + i4) - (i3 | i4) != 0;
    }

    private boolean isFieldPresent(T t2, int i2) {
        if (this.proto3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i2);
            long jOffset = offset(iTypeAndOffsetAt);
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    return UnsafeUtil.getDouble(t2, jOffset) != 0.0d;
                case 1:
                    return UnsafeUtil.getFloat(t2, jOffset) != 0.0f;
                case 2:
                    return UnsafeUtil.getLong(t2, jOffset) != 0;
                case 3:
                    return UnsafeUtil.getLong(t2, jOffset) != 0;
                case 4:
                    return UnsafeUtil.getInt(t2, jOffset) != 0;
                case 5:
                    return UnsafeUtil.getLong(t2, jOffset) != 0;
                case 6:
                    return UnsafeUtil.getInt(t2, jOffset) != 0;
                case 7:
                    return UnsafeUtil.getBoolean(t2, jOffset);
                case 8:
                    Object object = UnsafeUtil.getObject(t2, jOffset);
                    if (object instanceof String) {
                        return !((String) object).isEmpty();
                    }
                    if (object instanceof ByteString) {
                        return !ByteString.EMPTY.equals(object);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return UnsafeUtil.getObject(t2, jOffset) != null;
                case 10:
                    return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t2, jOffset));
                case 11:
                    return UnsafeUtil.getInt(t2, jOffset) != 0;
                case 12:
                    return UnsafeUtil.getInt(t2, jOffset) != 0;
                case 13:
                    return UnsafeUtil.getInt(t2, jOffset) != 0;
                case 14:
                    return UnsafeUtil.getLong(t2, jOffset) != 0;
                case 15:
                    return UnsafeUtil.getInt(t2, jOffset) != 0;
                case 16:
                    return UnsafeUtil.getLong(t2, jOffset) != 0;
                case 17:
                    return UnsafeUtil.getObject(t2, jOffset) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int iPresenceMaskAndOffsetAt = 1 << (presenceMaskAndOffsetAt(i2) >>> 20);
        int i3 = UnsafeUtil.getInt(t2, r1 & OFFSET_MASK);
        return (i3 + iPresenceMaskAndOffsetAt) - (i3 | iPresenceMaskAndOffsetAt) != 0;
    }

    private void setFieldPresent(T t2, int i2) {
        if (this.proto3) {
            return;
        }
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i2);
        int i3 = 1 << (iPresenceMaskAndOffsetAt >>> 20);
        long j2 = (-1) - (((-1) - iPresenceMaskAndOffsetAt) | ((-1) - OFFSET_MASK));
        UnsafeUtil.putInt(t2, j2, UnsafeUtil.getInt(t2, j2) | i3);
    }

    private boolean isOneofPresent(T t2, int i2, int i3) {
        return UnsafeUtil.getInt(t2, (long) ((-1) - (((-1) - presenceMaskAndOffsetAt(i3)) | ((-1) - OFFSET_MASK)))) == i2;
    }

    private boolean isOneofCaseEqual(T t2, T t3, int i2) {
        long jPresenceMaskAndOffsetAt = (-1) - (((-1) - presenceMaskAndOffsetAt(i2)) | ((-1) - OFFSET_MASK));
        return UnsafeUtil.getInt(t2, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t3, jPresenceMaskAndOffsetAt);
    }

    private void setOneofPresent(T t2, int i2, int i3) {
        UnsafeUtil.putInt(t2, (-1) - (((-1) - presenceMaskAndOffsetAt(i3)) | ((-1) - OFFSET_MASK)), i2);
    }

    private int positionForFieldNumber(int i2) {
        if (i2 < this.minFieldNumber || i2 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i2, 0);
    }

    private int positionForFieldNumber(int i2, int i3) {
        if (i2 < this.minFieldNumber || i2 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i2, i3);
    }

    private int slowPositionForFieldNumber(int i2, int i3) {
        int length = (this.buffer.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int iNumberAt = numberAt(i5);
            if (i2 == iNumberAt) {
                return i5;
            }
            if (i2 < iNumberAt) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }
}
