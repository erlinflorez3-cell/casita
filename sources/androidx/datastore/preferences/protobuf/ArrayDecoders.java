package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class ArrayDecoders {
    ArrayDecoders() {
    }

    static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;

        Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    static int decodeVarint32(byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            registers.int1 = b2;
            return i3;
        }
        return decodeVarint32(b2, bArr, i3, registers);
    }

    static int decodeVarint32(int i2, byte[] bArr, int i3, Registers registers) {
        int i4 = (i2 + 127) - (i2 | 127);
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            int i6 = b2 << 7;
            registers.int1 = (i4 + i6) - (i4 & i6);
            return i5;
        }
        int i7 = ((b2 + 127) - (b2 | 127)) << 7;
        int i8 = (i4 + i7) - (i4 & i7);
        int i9 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            int i10 = b3 << Ascii.SO;
            registers.int1 = (i8 + i10) - (i8 & i10);
            return i9;
        }
        int i11 = i8 | (((-1) - (((-1) - b3) | ((-1) - 127))) << 14);
        int i12 = i3 + 3;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            registers.int1 = i11 | (b4 << Ascii.NAK);
            return i12;
        }
        int i13 = i11 | ((b4 & 127) << 21);
        int i14 = i3 + 4;
        byte b5 = bArr[i12];
        if (b5 >= 0) {
            registers.int1 = i13 | (b5 << Ascii.FS);
            return i14;
        }
        int i15 = (b5 & 127) << 28;
        int i16 = (i13 + i15) - (i13 & i15);
        while (true) {
            int i17 = i14 + 1;
            if (bArr[i14] >= 0) {
                registers.int1 = i16;
                return i17;
            }
            i14 = i17;
        }
    }

    static int decodeVarint64(byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            registers.long1 = j2;
            return i3;
        }
        return decodeVarint64(j2, bArr, i3, registers);
    }

    static int decodeVarint64(long j2, byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j3 = (j2 & 127) | (((long) (127 & b2)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) ((-1) - (((-1) - b2) | ((-1) - 127)))) << i4;
            i3++;
        }
        registers.long1 = j3;
        return i3;
    }

    static int decodeFixed32(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        byte b2 = bArr[i2 + 1];
        int i4 = i3 | (((b2 + 255) - (b2 | 255)) << 8);
        int i5 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16;
        return (-1) - (((-1) - ((bArr[i2 + 3] & 255) << 24)) & ((-1) - ((i4 + i5) - (i4 & i5))));
    }

    static long decodeFixed64(byte[] bArr, int i2) {
        long j2 = (-1) - (((-1) - (((long) bArr[i2]) & 255)) & ((-1) - ((((long) bArr[i2 + 1]) & 255) << 8)));
        long j3 = bArr[i2 + 2];
        long j4 = (-1) - (((-1) - j2) & ((-1) - (((j3 + 255) - (j3 | 255)) << 16)));
        long j5 = ((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24;
        long j6 = (j4 + j5) - (j4 & j5);
        long j7 = (((long) bArr[i2 + 4]) & 255) << 32;
        long j8 = (j6 + j7) - (j6 & j7);
        long j9 = bArr[i2 + 5];
        long j10 = ((j9 + 255) - (j9 | 255)) << 40;
        return (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56) | ((-1) - (((-1) - ((j8 + j10) - (j8 & j10))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48))));
    }

    static double decodeDouble(byte[] bArr, int i2) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i2));
    }

    static float decodeFloat(byte[] bArr, int i2) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i2));
    }

    static int decodeString(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i3 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new String(bArr, iDecodeVarint32, i3, Internal.UTF_8);
        return iDecodeVarint32 + i3;
    }

    static int decodeStringRequireUtf8(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i3 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i3);
        return iDecodeVarint32 + i3;
    }

    static int decodeBytes(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i3 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i3 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i3);
        return iDecodeVarint32 + i3;
    }

    static int decodeMessageField(Schema schema, byte[] bArr, int i2, int i3, Registers registers) throws IOException {
        int iDecodeVarint32 = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iDecodeVarint32 = decodeVarint32(i4, bArr, iDecodeVarint32, registers);
            i4 = registers.int1;
        }
        if (i4 < 0 || i4 > i3 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objNewInstance = schema.newInstance();
        int i5 = i4 + iDecodeVarint32;
        schema.mergeFrom(objNewInstance, bArr, iDecodeVarint32, i5, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return i5;
    }

    static int decodeGroupField(Schema schema, byte[] bArr, int i2, int i3, int i4, Registers registers) throws IOException {
        MessageSchema messageSchema = (MessageSchema) schema;
        Object objNewInstance = messageSchema.newInstance();
        int proto2Message = messageSchema.parseProto2Message(objNewInstance, bArr, i2, i3, i4, registers);
        messageSchema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return proto2Message;
    }

    static int decodeVarint32List(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i3, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    static int decodeVarint64List(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i3, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    static int decodeFixed32List(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i3));
        int i5 = i3 + 4;
        while (i5 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
            if (i2 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i5 = iDecodeVarint32 + 4;
        }
        return i5;
    }

    static int decodeFixed64List(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i3));
        int i5 = i3 + 8;
        while (i5 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
            if (i2 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i5 = iDecodeVarint32 + 8;
        }
        return i5;
    }

    static int decodeFloatList(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i3));
        int i5 = i3 + 4;
        while (i5 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
            if (i2 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i5 = iDecodeVarint32 + 4;
        }
        return i5;
    }

    static int decodeDoubleList(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i3));
        int i5 = i3 + 8;
        while (i5 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
            if (i2 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i5 = iDecodeVarint32 + 8;
        }
        return i5;
    }

    static int decodeBoolList(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i3, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    static int decodeSInt32List(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i3, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    static int decodeSInt64List(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i3, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    static int decodePackedVarint32List(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedBoolList(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i3 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeStringList(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i3, registers);
        int i5 = registers.int1;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i5 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i5, Internal.UTF_8));
            iDecodeVarint32 += i5;
        }
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i6 = registers.int1;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i6, Internal.UTF_8));
                iDecodeVarint32 += i6;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringListRequireUtf8(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i3, registers);
        int i5 = registers.int1;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i5 == 0) {
            protobufList.add("");
        } else {
            int i6 = iDecodeVarint32 + i5;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i6)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i5, Internal.UTF_8));
            iDecodeVarint32 = i6;
        }
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i7 = registers.int1;
            if (i7 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i7 == 0) {
                protobufList.add("");
            } else {
                int i8 = iDecodeVarint32 + i7;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i8)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i7, Internal.UTF_8));
                iDecodeVarint32 = i8;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeBytesList(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i3, registers);
        int i5 = registers.int1;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i5 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i5 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i5));
            iDecodeVarint32 += i5;
        }
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i6 = registers.int1;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i6 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i6));
                iDecodeVarint32 += i6;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeMessageList(Schema<?> schema, int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i3, i4, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i4, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    static int decodeGroupList(Schema schema, int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int i5 = i2 & (-8);
        int i6 = (i5 + 4) - (i5 & 4);
        int iDecodeGroupField = decodeGroupField(schema, bArr, i3, i4, i6, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i4) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i2 != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i4, i6, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    static int decodeExtensionOrUnknownField(int i2, byte[] bArr, int i3, int i4, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i2 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i2, bArr, i3, i4, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i2, bArr, i3, i4, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int i2, byte[] bArr, int i3, int i4, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        Object field;
        int iDecodeMessageField = i3;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i5 = i2 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, iDecodeMessageField, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, iDecodeMessageField, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, iDecodeMessageField, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, iDecodeMessageField, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, iDecodeMessageField, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, iDecodeMessageField, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, iDecodeMessageField, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, iDecodeMessageField, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, iDecodeMessageField, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, iDecodeMessageField, intArrayList4, registers);
                    UnknownFieldSetLite unknownFieldSetLite = extendableMessage.unknownFields;
                    UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.filterUnknownEnumList(i5, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance() ? unknownFieldSetLite : null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    if (unknownFieldSetLite2 != null) {
                        extendableMessage.unknownFields = unknownFieldSetLite2;
                    }
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            iDecodeMessageField = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                UnknownFieldSetLite unknownFieldSetLiteNewInstance = extendableMessage.unknownFields;
                if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
                    extendableMessage.unknownFields = unknownFieldSetLiteNewInstance;
                }
                SchemaUtil.storeUnknownEnum(i5, registers.int1, unknownFieldSetLiteNewInstance, unknownFieldSchema);
                return iDecodeMessageField;
            }
            objValueOf = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(decodeDouble(bArr, iDecodeMessageField));
                    iDecodeMessageField += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(decodeFloat(bArr, iDecodeMessageField));
                    iDecodeMessageField += 4;
                    break;
                case 3:
                case 4:
                    iDecodeMessageField = decodeVarint64(bArr, iDecodeMessageField, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    iDecodeMessageField = decodeVarint32(bArr, iDecodeMessageField, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(decodeFixed64(bArr, iDecodeMessageField));
                    iDecodeMessageField += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, iDecodeMessageField));
                    iDecodeMessageField += 4;
                    break;
                case 11:
                    iDecodeMessageField = decodeVarint64(bArr, iDecodeMessageField, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    iDecodeMessageField = decodeVarint32(bArr, iDecodeMessageField, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    iDecodeMessageField = decodeVarint64(bArr, iDecodeMessageField, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    iDecodeMessageField = decodeBytes(bArr, iDecodeMessageField, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    iDecodeMessageField = decodeString(bArr, iDecodeMessageField, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    iDecodeMessageField = decodeGroupField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeMessageField, i4, (-1) - (((-1) - (i5 << 3)) & ((-1) - 4)), registers);
                    objValueOf = registers.object1;
                    break;
                case 18:
                    iDecodeMessageField = decodeMessageField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeMessageField, i4, registers);
                    objValueOf = registers.object1;
                    break;
            }
        }
        if (!generatedExtension.isRepeated()) {
            int i6 = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
            if ((i6 == 17 || i6 == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
                objValueOf = Internal.mergeMessage(field, objValueOf);
            }
            fieldSet.setField(generatedExtension.descriptor, objValueOf);
            return iDecodeMessageField;
        }
        fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
        return iDecodeMessageField;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1 */
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

    static int decodeUnknownField(int i2, byte[] bArr, int i3, int i4, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = i3;
        if (WireFormat.getTagFieldNumber(i2) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            unknownFieldSetLite.storeField(i2, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i2, Long.valueOf(decodeFixed64(bArr, iDecodeVarint32)));
            return iDecodeVarint32 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            int i5 = registers.int1;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iDecodeVarint322) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                unknownFieldSetLite.storeField(i2, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i2, ByteString.copyFrom(bArr, iDecodeVarint322, i5));
            }
            return iDecodeVarint322 + i5;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                unknownFieldSetLite.storeField(i2, Integer.valueOf(decodeFixed32(bArr, iDecodeVarint32)));
                return iDecodeVarint32 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (iDecodeVarint32 < i4) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            i7 = registers.int1;
            if (i7 == i6) {
                break;
            }
            iDecodeVarint32 = decodeUnknownField(i7, bArr, iDecodeVarint32, i4, unknownFieldSetLiteNewInstance, registers);
        }
        if (iDecodeVarint32 > i4 || i7 != i6) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i2, unknownFieldSetLiteNewInstance);
        return iDecodeVarint32;
    }

    static int skipField(int i2, byte[] bArr, int i3, int i4, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i2) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i3, registers);
        }
        if (tagWireType == 1) {
            return i3 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i3, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i3 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i5 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - (-8))))) & ((-1) - 4));
        int i6 = 0;
        while (i3 < i4) {
            i3 = decodeVarint32(bArr, i3, registers);
            i6 = registers.int1;
            if (i6 == i5) {
                break;
            }
            i3 = skipField(i6, bArr, i3, i4, registers);
        }
        if (i3 > i4 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i3;
    }
}
