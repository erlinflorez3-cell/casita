package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes7.dex */
@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.BinaryWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newDirectBuffer(capacity));
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasNioBuffer()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
            if (!byteBufferNioBuffer.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.buffer = byteBufferNioBuffer;
            byteBufferNioBuffer.limit(byteBufferNioBuffer.capacity());
            this.buffer.position(0);
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
            int iLimit = this.buffer.limit() - 1;
            this.limitMinusOne = iLimit;
            this.pos = iLimit;
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) (value >>> 28));
            int i3 = this.pos;
            this.pos = i3 - 4;
            int i4 = (-1) - (((-1) - (value >>> 14)) | ((-1) - 127));
            this.buffer.putInt(i3 - 3, ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))) | ((-1) - (((-1) - ((-1) - (((-1) - ((((value >>> 21) & 127) | 128) << 24)) & ((-1) - (((i4 + 128) - (i4 & 128)) << 16))))) & ((-1) - ((((-1) - (((-1) - (value >>> 7)) | ((-1) - 127))) | 128) << 8)))));
        }

        private void writeVarint32FourBytes(int value) {
            int i2 = this.pos;
            this.pos = i2 - 4;
            int i3 = (266338304 & value) << 3;
            int i4 = (2080768 + value) - (2080768 | value);
            int i5 = ((i4 + 2097152) - (i4 & 2097152)) << 2;
            int i6 = (-1) - (((-1) - value) | ((-1) - 16256));
            this.buffer.putInt(i2 - 3, ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))) | ((i3 + i5) - (i3 & i5)) | (((i6 + 16384) - (i6 & 16384)) << 1));
        }

        private void writeVarint32OneByte(int value) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            int i2 = this.pos - 3;
            this.pos = i2;
            int i3 = value & 16256;
            int i4 = (((2080768 + value) - (2080768 | value)) << 10) | (((i3 + 16384) - (i3 & 16384)) << 9);
            int i5 = (-1) - (((-1) - value) | ((-1) - 127));
            int i6 = ((i5 + 128) - (i5 & 128)) << 8;
            this.buffer.putInt(i2, (i6 + i4) - (i6 & i4));
        }

        private void writeVarint32TwoBytes(int value) {
            int i2 = this.pos;
            this.pos = i2 - 2;
            this.buffer.putShort(i2 - 1, (short) (((-1) - (((-1) - value) | ((-1) - 127))) | 128 | ((16256 & value) << 1)));
        }

        private void writeVarint64EightBytes(long value) {
            int i2 = this.pos;
            this.pos = i2 - 8;
            long j2 = (-1) - (((-1) - 4363686772736L) | ((-1) - value));
            long j3 = (-1) - (((-1) - ((((71494644084506624L + value) - (71494644084506624L | value)) << 7) | (((-1) - (((-1) - (558551906910208L & value)) & ((-1) - 562949953421312L))) << 6))) & ((-1) - (((j2 + 4398046511104L) - (j2 & 4398046511104L)) << 5)));
            long j4 = (34091302912L + value) - (34091302912L | value);
            long j5 = (-1) - (((-1) - (j3 | (((j4 + 34359738368L) - (j4 & 34359738368L)) << 4))) & ((-1) - (((-1) - (((-1) - (266338304 & value)) & ((-1) - 268435456))) << 3)));
            long j6 = (((-1) - (((-1) - 2080768) | ((-1) - value))) | 2097152) << 2;
            long j7 = (j5 + j6) - (j5 & j6);
            long j8 = (-1) - (((-1) - 16256) | ((-1) - value));
            this.buffer.putLong(i2 - 7, (-1) - (((-1) - (((-1) - (((-1) - value) | ((-1) - 127))) | 128)) & ((-1) - (j7 | (((j8 + Http2Stream.EMIT_BUFFER_SIZE) - (j8 & Http2Stream.EMIT_BUFFER_SIZE)) << 1)))));
        }

        private void writeVarint64EightBytesWithSign(long value) {
            int i2 = this.pos;
            this.pos = i2 - 8;
            long j2 = (((-1) - (((-1) - (71494644084506624L & value)) & ((-1) - 72057594037927936L))) << 7) | (((-1) - (((-1) - ((558551906910208L + value) - (558551906910208L | value))) & ((-1) - 562949953421312L))) << 6);
            long j3 = 4363686772736L & value;
            long j4 = ((j3 + 4398046511104L) - (j3 & 4398046511104L)) << 5;
            long j5 = (266338304 + value) - (266338304 | value);
            long j6 = (16256 + value) - (16256 | value);
            long j7 = (-1) - (((-1) - (((((j2 + j4) - (j2 & j4)) | (((-1) - (((-1) - (34091302912L & value)) & ((-1) - 34359738368L))) << 4)) | (((j5 + 268435456) - (j5 & 268435456)) << 3)) | ((((-1) - (((-1) - 2080768) | ((-1) - value))) | 2097152) << 2))) & ((-1) - (((j6 + Http2Stream.EMIT_BUFFER_SIZE) - (j6 & Http2Stream.EMIT_BUFFER_SIZE)) << 1)));
            long j8 = (value + 127) - (value | 127);
            long j9 = (j8 + 128) - (j8 & 128);
            this.buffer.putLong(i2 - 7, (j9 + j7) - (j9 & j7));
        }

        private void writeVarint64FiveBytes(long value) {
            int i2 = this.pos;
            this.pos = i2 - 5;
            long j2 = 266338304 & value;
            long j3 = (-1) - (((-1) - 2080768) | ((-1) - value));
            long j4 = (-1) - (((-1) - ((-1) - (((-1) - (((34091302912L + value) - (34091302912L | value)) << 28)) & ((-1) - (((j2 + 268435456) - (j2 & 268435456)) << 27))))) & ((-1) - (((j3 + 2097152) - (j3 & 2097152)) << 26)));
            long j5 = ((-1) - (((-1) - ((-1) - (((-1) - 16256) | ((-1) - value)))) & ((-1) - Http2Stream.EMIT_BUFFER_SIZE))) << 25;
            this.buffer.putLong(i2 - 7, (((-1) - (((-1) - (value & 127)) & ((-1) - 128))) << 24) | ((j4 + j5) - (j4 & j5)));
        }

        private void writeVarint64FourBytes(long value) {
            writeVarint32FourBytes((int) value);
        }

        private void writeVarint64NineBytes(long value) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) (value >>> 56));
            writeVarint64EightBytesWithSign((value + 72057594037927935L) - (value | 72057594037927935L));
        }

        private void writeVarint64OneByte(long value) {
            writeVarint32OneByte((int) value);
        }

        private void writeVarint64SevenBytes(long value) {
            int i2 = this.pos - 7;
            this.pos = i2;
            ByteBuffer byteBuffer = this.buffer;
            long j2 = ((558551906910208L + value) - (558551906910208L | value)) << 14;
            long j3 = ((-1) - (((-1) - ((-1) - (((-1) - 4363686772736L) | ((-1) - value)))) & ((-1) - 4398046511104L))) << 13;
            long j4 = (j2 + j3) - (j2 & j3);
            long j5 = ((-1) - (((-1) - ((34091302912L + value) - (34091302912L | value))) & ((-1) - 34359738368L))) << 12;
            long j6 = 266338304 & value;
            long j7 = (-1) - (((-1) - ((j4 + j5) - (j4 & j5))) & ((-1) - (((j6 + 268435456) - (j6 & 268435456)) << 11)));
            long j8 = (2080768 + value) - (2080768 | value);
            long j9 = (16256 + value) - (16256 | value);
            long j10 = (-1) - (((-1) - (j7 | (((j8 + 2097152) - (j8 & 2097152)) << 10))) & ((-1) - (((j9 + Http2Stream.EMIT_BUFFER_SIZE) - (j9 & Http2Stream.EMIT_BUFFER_SIZE)) << 9)));
            long j11 = (value + 127) - (value | 127);
            byteBuffer.putLong(i2, (((j11 + 128) - (j11 & 128)) << 8) | j10);
        }

        private void writeVarint64SixBytes(long value) {
            int i2 = this.pos;
            this.pos = i2 - 6;
            ByteBuffer byteBuffer = this.buffer;
            int i3 = i2 - 7;
            long j2 = ((-1) - (((-1) - 4363686772736L) | ((-1) - value))) << 21;
            long j3 = 34091302912L & value;
            long j4 = ((j3 + 34359738368L) - (j3 & 34359738368L)) << 20;
            long j5 = (j2 + j4) - (j2 & j4);
            long j6 = ((-1) - (((-1) - ((266338304 + value) - (266338304 | value))) & ((-1) - 268435456))) << 19;
            long j7 = (j5 + j6) - (j5 & j6);
            long j8 = (2080768 + value) - (2080768 | value);
            long j9 = ((j8 + 2097152) - (j8 & 2097152)) << 18;
            long j10 = (-1) - (((-1) - ((j7 + j9) - (j7 & j9))) & ((-1) - (((-1) - (((-1) - ((-1) - (((-1) - 16256) | ((-1) - value)))) & ((-1) - Http2Stream.EMIT_BUFFER_SIZE))) << 17)));
            long j11 = ((-1) - (((-1) - (value & 127)) & ((-1) - 128))) << 16;
            byteBuffer.putLong(i3, (j11 + j10) - (j11 & j10));
        }

        private void writeVarint64TenBytes(long value) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) (value >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i3 = this.pos;
            this.pos = i3 - 1;
            long j2 = (-1) - (((-1) - (value >>> 56)) | ((-1) - 127));
            byteBuffer2.put(i3, (byte) ((j2 + 128) - (j2 & 128)));
            writeVarint64EightBytesWithSign((value + 72057594037927935L) - (value | 72057594037927935L));
        }

        private void writeVarint64ThreeBytes(long value) {
            writeVarint32ThreeBytes((int) value);
        }

        private void writeVarint64TwoBytes(long value) {
            writeVarint32TwoBytes((int) value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte value) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i2 = this.pos - iRemaining;
            this.pos = i2;
            this.buffer.position(i2 + 1);
            this.buffer.put(value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i2 = this.pos - length;
            this.pos = i2;
            this.buffer.position(i2 + 1);
            this.buffer.put(value, offset, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int value) {
            int i2 = this.pos;
            this.pos = i2 - 4;
            this.buffer.putInt(i2 - 3, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long value) {
            int i2 = this.pos;
            this.pos = i2 - 8;
            this.buffer.putLong(i2 - 7, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            } else {
                int i2 = this.pos - iRemaining;
                this.pos = i2;
                this.buffer.position(i2 + 1);
                this.buffer.put(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i2 = this.pos - length;
                this.pos = i2;
                this.buffer.position(i2 + 1);
                this.buffer.put(value, offset, length);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(String in) {
            int i2;
            int i3;
            int i4;
            char cCharAt;
            requireSpace(in.length());
            int length = in.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i4 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i4 - 1;
                    byteBuffer.put(i4, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i3 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i3 - 1;
                    int i5 = (cCharAt2 + '?') - ('?' | cCharAt2);
                    byteBuffer2.put(i3, (byte) ((i5 + 128) - (i5 & 128)));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i6 = this.pos;
                    this.pos = i6 - 1;
                    int i7 = cCharAt2 >>> 6;
                    byteBuffer3.put(i6, (byte) ((i7 + 960) - (i7 & 960)));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i2 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i2 - 1;
                    byteBuffer4.put(i2, (byte) (('?' & cCharAt2) | 128));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i8 = this.pos;
                    this.pos = i8 - 1;
                    byteBuffer5.put(i8, (byte) (((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63))) | 128));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i9 = this.pos;
                    this.pos = i9 - 1;
                    byteBuffer6.put(i9, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i10 = this.pos;
                                this.pos = i10 - 1;
                                int i11 = (codePoint + 63) - (63 | codePoint);
                                byteBuffer7.put(i10, (byte) ((i11 + 128) - (i11 & 128)));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i12 = this.pos;
                                this.pos = i12 - 1;
                                byteBuffer8.put(i12, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (codePoint >>> 6)) | ((-1) - 63)))) & ((-1) - 128))));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i13 = this.pos;
                                this.pos = i13 - 1;
                                byteBuffer9.put(i13, (byte) ((-1) - (((-1) - ((codePoint >>> 12) & 63)) & ((-1) - 128))));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i14 = this.pos;
                                this.pos = i14 - 1;
                                int i15 = codePoint >>> 18;
                                byteBuffer10.put(i14, (byte) ((i15 + 240) - (i15 & 240)));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if (((-128) & value) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((-1) - (((-1) - value) | ((-1) - (-16384))) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) + value) - ((-2097152) | value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if ((-1) - (((-1) - (-268435456)) | ((-1) - value)) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newHeapBuffer(capacity));
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasArray()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.allocatedBuffer = allocatedBuffer;
            this.buffer = allocatedBuffer.array();
            int iArrayOffset = allocatedBuffer.arrayOffset();
            this.limit = allocatedBuffer.limit() + iArrayOffset;
            int iPosition = iArrayOffset + allocatedBuffer.position();
            this.offset = iPosition;
            this.offsetMinusOne = iPosition - 1;
            int i2 = this.limit - 1;
            this.limitMinusOne = i2;
            this.pos = i2;
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 28);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((-1) - (((-1) - (value >>> 21)) | ((-1) - 127))) | 128);
            int i5 = i2 - 3;
            this.pos = i5;
            int i6 = value >>> 14;
            int i7 = (i6 + 127) - (i6 | 127);
            bArr[i4] = (byte) ((i7 + 128) - (i7 & 128));
            int i8 = i2 - 4;
            this.pos = i8;
            int i9 = value >>> 7;
            int i10 = (i9 + 127) - (i9 | 127);
            bArr[i5] = (byte) ((i10 + 128) - (i10 & 128));
            this.pos = i2 - 5;
            bArr[i8] = (byte) ((-1) - (((-1) - (value & 127)) & ((-1) - 128)));
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 21);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((value >>> 14) & 127) | 128);
            int i5 = i2 - 3;
            this.pos = i5;
            int i6 = value >>> 7;
            bArr[i4] = (byte) (((i6 + 127) - (i6 | 127)) | 128);
            this.pos = i2 - 4;
            bArr[i5] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - value) | ((-1) - 127)))) & ((-1) - 128)));
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            bArr[i2] = (byte) value;
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 14);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - ((value >>> 7) & 127)) & ((-1) - 128)));
            this.pos = i2 - 3;
            bArr[i4] = (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128)));
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 7);
            this.pos = i2 - 2;
            bArr[i3] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - value) | ((-1) - 127)))) & ((-1) - 128)));
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 49);
            int i4 = i2 - 2;
            this.pos = i4;
            long j2 = value >>> 42;
            bArr[i3] = (byte) ((-1) - (((-1) - ((j2 + 127) - (j2 | 127))) & ((-1) - 128)));
            int i5 = i2 - 3;
            this.pos = i5;
            bArr[i4] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 35)) | ((-1) - 127)))) & ((-1) - 128)));
            int i6 = i2 - 4;
            this.pos = i6;
            long j3 = value >>> 28;
            bArr[i5] = (byte) (((j3 + 127) - (j3 | 127)) | 128);
            int i7 = i2 - 5;
            this.pos = i7;
            bArr[i6] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 21)) | ((-1) - 127)))) & ((-1) - 128)));
            int i8 = i2 - 6;
            this.pos = i8;
            long j4 = value >>> 14;
            bArr[i7] = (byte) ((-1) - (((-1) - ((j4 + 127) - (j4 | 127))) & ((-1) - 128)));
            int i9 = i2 - 7;
            this.pos = i9;
            bArr[i8] = (byte) (((-1) - (((-1) - (value >>> 7)) | ((-1) - 127))) | 128);
            this.pos = i2 - 8;
            long j5 = value & 127;
            bArr[i9] = (byte) ((j5 + 128) - (j5 & 128));
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 28);
            int i4 = i2 - 2;
            this.pos = i4;
            long j2 = value >>> 21;
            long j3 = (j2 + 127) - (j2 | 127);
            bArr[i3] = (byte) ((j3 + 128) - (j3 & 128));
            int i5 = i2 - 3;
            this.pos = i5;
            long j4 = value >>> 14;
            bArr[i4] = (byte) (((j4 + 127) - (j4 | 127)) | 128);
            int i6 = i2 - 4;
            this.pos = i6;
            long j5 = value >>> 7;
            bArr[i5] = (byte) ((-1) - (((-1) - ((j5 + 127) - (j5 | 127))) & ((-1) - 128)));
            this.pos = i2 - 5;
            bArr[i6] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - value) | ((-1) - 127)))) & ((-1) - 128)));
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 21);
            int i4 = i2 - 2;
            this.pos = i4;
            long j2 = value >>> 14;
            bArr[i3] = (byte) ((-1) - (((-1) - ((j2 + 127) - (j2 | 127))) & ((-1) - 128)));
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = value >>> 7;
            bArr[i4] = (byte) ((-1) - (((-1) - ((j3 + 127) - (j3 | 127))) & ((-1) - 128)));
            this.pos = i2 - 4;
            bArr[i5] = (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128)));
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 56);
            int i4 = i2 - 2;
            this.pos = i4;
            long j2 = (value >>> 49) & 127;
            bArr[i3] = (byte) ((j2 + 128) - (j2 & 128));
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = (value >>> 42) & 127;
            bArr[i4] = (byte) ((j3 + 128) - (j3 & 128));
            int i6 = i2 - 4;
            this.pos = i6;
            bArr[i5] = (byte) (((-1) - (((-1) - (value >>> 35)) | ((-1) - 127))) | 128);
            int i7 = i2 - 5;
            this.pos = i7;
            bArr[i6] = (byte) (((value >>> 28) & 127) | 128);
            int i8 = i2 - 6;
            this.pos = i8;
            bArr[i7] = (byte) (((-1) - (((-1) - (value >>> 21)) | ((-1) - 127))) | 128);
            int i9 = i2 - 7;
            this.pos = i9;
            bArr[i8] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 14)) | ((-1) - 127)))) & ((-1) - 128)));
            int i10 = i2 - 8;
            this.pos = i10;
            bArr[i9] = (byte) (((-1) - (((-1) - (value >>> 7)) | ((-1) - 127))) | 128);
            this.pos = i2 - 9;
            long j4 = (-1) - (((-1) - value) | ((-1) - 127));
            bArr[i10] = (byte) ((j4 + 128) - (j4 & 128));
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            bArr[i2] = (byte) value;
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 42);
            int i4 = i2 - 2;
            this.pos = i4;
            long j2 = (-1) - (((-1) - (value >>> 35)) | ((-1) - 127));
            bArr[i3] = (byte) ((j2 + 128) - (j2 & 128));
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = (-1) - (((-1) - (value >>> 28)) | ((-1) - 127));
            bArr[i4] = (byte) ((j3 + 128) - (j3 & 128));
            int i6 = i2 - 4;
            this.pos = i6;
            long j4 = value >>> 21;
            long j5 = (j4 + 127) - (j4 | 127);
            bArr[i5] = (byte) ((j5 + 128) - (j5 & 128));
            int i7 = i2 - 5;
            this.pos = i7;
            bArr[i6] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 14)) | ((-1) - 127)))) & ((-1) - 128)));
            int i8 = i2 - 6;
            this.pos = i8;
            long j6 = value >>> 7;
            bArr[i7] = (byte) ((-1) - (((-1) - ((j6 + 127) - (j6 | 127))) & ((-1) - 128)));
            this.pos = i2 - 7;
            long j7 = value & 127;
            bArr[i8] = (byte) ((j7 + 128) - (j7 & 128));
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 35);
            int i4 = i2 - 2;
            this.pos = i4;
            long j2 = value >>> 28;
            long j3 = (j2 + 127) - (j2 | 127);
            bArr[i3] = (byte) ((j3 + 128) - (j3 & 128));
            int i5 = i2 - 3;
            this.pos = i5;
            long j4 = (-1) - (((-1) - (value >>> 21)) | ((-1) - 127));
            bArr[i4] = (byte) ((j4 + 128) - (j4 & 128));
            int i6 = i2 - 4;
            this.pos = i6;
            long j5 = (value >>> 14) & 127;
            bArr[i5] = (byte) ((j5 + 128) - (j5 & 128));
            int i7 = i2 - 5;
            this.pos = i7;
            long j6 = (value >>> 7) & 127;
            bArr[i6] = (byte) ((j6 + 128) - (j6 & 128));
            this.pos = i2 - 6;
            long j7 = (value + 127) - (value | 127);
            bArr[i7] = (byte) ((j7 + 128) - (j7 & 128));
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 63);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((-1) - (((-1) - (value >>> 56)) | ((-1) - 127))) | 128);
            int i5 = i2 - 3;
            this.pos = i5;
            bArr[i4] = (byte) (((-1) - (((-1) - (value >>> 49)) | ((-1) - 127))) | 128);
            int i6 = i2 - 4;
            this.pos = i6;
            long j2 = (-1) - (((-1) - (value >>> 42)) | ((-1) - 127));
            bArr[i5] = (byte) ((j2 + 128) - (j2 & 128));
            int i7 = i2 - 5;
            this.pos = i7;
            bArr[i6] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 35)) | ((-1) - 127)))) & ((-1) - 128)));
            int i8 = i2 - 6;
            this.pos = i8;
            long j3 = (value >>> 28) & 127;
            bArr[i7] = (byte) ((j3 + 128) - (j3 & 128));
            int i9 = i2 - 7;
            this.pos = i9;
            bArr[i8] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 21)) | ((-1) - 127)))) & ((-1) - 128)));
            int i10 = i2 - 8;
            this.pos = i10;
            bArr[i9] = (byte) (((value >>> 14) & 127) | 128);
            int i11 = i2 - 9;
            this.pos = i11;
            long j4 = value >>> 7;
            bArr[i10] = (byte) ((-1) - (((-1) - ((j4 + 127) - (j4 | 127))) & ((-1) - 128)));
            this.pos = i2 - 10;
            bArr[i11] = (byte) ((-1) - (((-1) - (value & 127)) & ((-1) - 128)));
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (((int) value) >>> 14);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((-1) - (((-1) - (value >>> 7)) | ((-1) - 127))) | 128);
            this.pos = i2 - 3;
            bArr[i4] = (byte) ((-1) - (((-1) - (value & 127)) & ((-1) - 128)));
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (value >>> 7);
            this.pos = i2 - 2;
            bArr[i3] = (byte) (((-1) - (((-1) - ((int) value)) | ((-1) - 127))) | 128);
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            bArr[i2] = value;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i2 = this.pos - iRemaining;
            this.pos = i2;
            value.get(this.buffer, i2 + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i2 = this.pos - length;
            this.pos = i2;
            System.arraycopy(value, offset, this.buffer, i2 + 1, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i2, boolean z2) throws IOException {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) throws IOException {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) ((-1) - (((-1) - (value >> 24)) | ((-1) - 255)));
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - (value >> 16)) | ((-1) - 255)));
            int i5 = i2 - 3;
            this.pos = i5;
            bArr[i4] = (byte) ((-1) - (((-1) - (value >> 8)) | ((-1) - 255)));
            this.pos = i2 - 4;
            bArr[i5] = (byte) ((value + 255) - (value | 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long value) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) ((-1) - (((-1) - ((int) (value >> 56))) | ((-1) - 255)));
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((int) (value >> 48)) & 255);
            int i5 = i2 - 3;
            this.pos = i5;
            int i6 = (int) (value >> 40);
            bArr[i4] = (byte) ((i6 + 255) - (i6 | 255));
            int i7 = i2 - 4;
            this.pos = i7;
            bArr[i5] = (byte) (((int) (value >> 32)) & 255);
            int i8 = i2 - 5;
            this.pos = i8;
            int i9 = (int) (value >> 24);
            bArr[i7] = (byte) ((i9 + 255) - (i9 | 255));
            int i10 = i2 - 6;
            this.pos = i10;
            bArr[i8] = (byte) (((int) (value >> 16)) & 255);
            int i11 = i2 - 7;
            this.pos = i11;
            bArr[i10] = (byte) ((-1) - (((-1) - ((int) (value >> 8))) | ((-1) - 255)));
            this.pos = i2 - 8;
            bArr[i11] = (byte) (((int) value) & 255);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) throws IOException {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            }
            int i2 = this.pos - iRemaining;
            this.pos = i2;
            value.get(this.buffer, i2 + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i2 = this.pos - length;
                this.pos = i2;
                System.arraycopy(value, offset, this.buffer, i2 + 1, length);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) throws IOException {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) throws IOException {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int fieldNumber, String value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(String in) {
            int i2;
            int i3;
            int i4;
            char cCharAt;
            requireSpace(in.length());
            int length = in.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i4 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i4 - 1;
                    bArr[i4] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i3 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i5 = i3 - 1;
                    this.pos = i5;
                    bArr2[i3] = (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128)));
                    this.pos = i3 - 2;
                    bArr2[i5] = (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 960)));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i2 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i6 = i2 - 1;
                    this.pos = i6;
                    int i7 = (-1) - ((65535 - cCharAt2) | ((-1) - 63));
                    bArr3[i2] = (byte) ((i7 + 128) - (i7 & 128));
                    int i8 = i2 - 2;
                    this.pos = i8;
                    int i9 = cCharAt2 >>> 6;
                    bArr3[i6] = (byte) (((i9 + 63) - (i9 | 63)) | 128);
                    this.pos = i2 - 3;
                    bArr3[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.buffer;
                                int i10 = this.pos;
                                int i11 = i10 - 1;
                                this.pos = i11;
                                bArr4[i10] = (byte) ((-1) - (((-1) - ((codePoint + 63) - (63 | codePoint))) & ((-1) - 128)));
                                int i12 = i10 - 2;
                                this.pos = i12;
                                bArr4[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i13 = i10 - 3;
                                this.pos = i13;
                                bArr4[i12] = (byte) ((-1) - (((-1) - ((codePoint >>> 12) & 63)) & ((-1) - 128)));
                                this.pos = i10 - 4;
                                int i14 = codePoint >>> 18;
                                bArr4[i13] = (byte) ((i14 + 240) - (i14 & 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((value - 128) - ((-128) | value) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if (((-16384) & value) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if ((-1) - (((-1) - (-2097152)) | ((-1) - value)) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newDirectBuffer(capacity));
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasNioBuffer()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
            if (!byteBufferNioBuffer.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.buffer = byteBufferNioBuffer;
            byteBufferNioBuffer.limit(byteBufferNioBuffer.capacity());
            this.buffer.position(0);
            long jAddressOffset = UnsafeUtil.addressOffset(this.buffer);
            this.bufferOffset = jAddressOffset;
            long jLimit = jAddressOffset + ((long) (this.buffer.limit() - 1));
            this.limitMinusOne = jLimit;
            this.pos = jLimit;
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 28));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 21)) | ((-1) - 127)))) & ((-1) - 128))));
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i2 = (value >>> 14) & 127;
            UnsafeUtil.putByte(j4, (byte) ((i2 + 128) - (i2 & 128)));
            long j5 = this.pos;
            this.pos = j5 - 1;
            int i3 = value >>> 7;
            int i4 = (i3 + 127) - (i3 | 127);
            UnsafeUtil.putByte(j5, (byte) ((i4 + 128) - (i4 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))));
        }

        private void writeVarint32FourBytes(int value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 21));
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = value >>> 14;
            int i3 = (i2 + 127) - (i2 | 127);
            UnsafeUtil.putByte(j3, (byte) ((i3 + 128) - (i3 & 128)));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((-1) - (((-1) - (value >>> 7)) | ((-1) - 127))) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(j5, (byte) (((-1) - (((-1) - value) | ((-1) - 127))) | 128));
        }

        private void writeVarint32OneByte(int value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 14));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 7)) | ((-1) - 127)))) & ((-1) - 128))));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))));
        }

        private void writeVarint32TwoBytes(int value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 7));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))));
        }

        private void writeVarint64EightBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 49));
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 42;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(j3, (byte) ((j5 + 128) - (j5 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) (((-1) - (((-1) - (value >>> 35)) | ((-1) - 127))) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(j7, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 28)) | ((-1) - 127)))) & ((-1) - 128))));
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = value >>> 21;
            UnsafeUtil.putByte(j8, (byte) (((j9 + 127) - (j9 | 127)) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = value >>> 14;
            long j12 = (j11 + 127) - (j11 | 127);
            UnsafeUtil.putByte(j10, (byte) ((j12 + 128) - (j12 & 128)));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 7)) | ((-1) - 127)))) & ((-1) - 128))));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((-1) - (((-1) - (value & 127)) & ((-1) - 128))));
        }

        private void writeVarint64FiveBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 28));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 21)) | ((-1) - 127)))) & ((-1) - 128))));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((-1) - (((-1) - (value >>> 14)) | ((-1) - 127))) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = value >>> 7;
            UnsafeUtil.putByte(j5, (byte) (((j6 + 127) - (j6 | 127)) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = (value + 127) - (value | 127);
            UnsafeUtil.putByte(j7, (byte) ((j8 + 128) - (j8 & 128)));
        }

        private void writeVarint64FourBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 21));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 14)) | ((-1) - 127)))) & ((-1) - 128))));
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = (value >>> 7) & 127;
            UnsafeUtil.putByte(j4, (byte) ((j5 + 128) - (j5 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = (-1) - (((-1) - value) | ((-1) - 127));
            UnsafeUtil.putByte(j6, (byte) ((j7 + 128) - (j7 & 128)));
        }

        private void writeVarint64NineBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 56));
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = (-1) - (((-1) - (value >>> 49)) | ((-1) - 127));
            UnsafeUtil.putByte(j3, (byte) ((j4 + 128) - (j4 & 128)));
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = value >>> 42;
            long j7 = (j6 + 127) - (j6 | 127);
            UnsafeUtil.putByte(j5, (byte) ((j7 + 128) - (j7 & 128)));
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = value >>> 35;
            UnsafeUtil.putByte(j8, (byte) ((-1) - (((-1) - ((j9 + 127) - (j9 | 127))) & ((-1) - 128))));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = value >>> 28;
            UnsafeUtil.putByte(j10, (byte) ((-1) - (((-1) - ((j11 + 127) - (j11 | 127))) & ((-1) - 128))));
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = (value >>> 21) & 127;
            UnsafeUtil.putByte(j12, (byte) ((j13 + 128) - (j13 & 128)));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            long j16 = (-1) - (((-1) - (value >>> 7)) | ((-1) - 127));
            UnsafeUtil.putByte(j15, (byte) ((j16 + 128) - (j16 & 128)));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((value + 127) - (value | 127)) | 128));
        }

        private void writeVarint64OneByte(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 42));
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 35;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(j3, (byte) ((j5 + 128) - (j5 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = (value >>> 28) & 127;
            UnsafeUtil.putByte(j6, (byte) ((j7 + 128) - (j7 & 128)));
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = (-1) - (((-1) - (value >>> 21)) | ((-1) - 127));
            UnsafeUtil.putByte(j8, (byte) ((j9 + 128) - (j9 & 128)));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = value >>> 14;
            UnsafeUtil.putByte(j10, (byte) (((j11 + 127) - (j11 | 127)) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = value >>> 7;
            UnsafeUtil.putByte(j12, (byte) (((j13 + 127) - (j13 | 127)) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 35));
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 28;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(j3, (byte) ((j5 + 128) - (j5 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) ((-1) - (((-1) - ((value >>> 21) & 127)) & ((-1) - 128))));
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = (value >>> 14) & 127;
            UnsafeUtil.putByte(j7, (byte) ((j8 + 128) - (j8 & 128)));
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = (value >>> 7) & 127;
            UnsafeUtil.putByte(j9, (byte) ((j10 + 128) - (j10 & 128)));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((-1) - (((-1) - value) | ((-1) - 127))) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 63));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((value >>> 56) & 127)) & ((-1) - 128))));
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = value >>> 49;
            long j6 = (j5 + 127) - (j5 | 127);
            UnsafeUtil.putByte(j4, (byte) ((j6 + 128) - (j6 & 128)));
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(j7, (byte) ((-1) - (((-1) - ((value >>> 42) & 127)) & ((-1) - 128))));
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 35)) | ((-1) - 127)))) & ((-1) - 128))));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((value >>> 28) & 127) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = value >>> 21;
            UnsafeUtil.putByte(j10, (byte) ((-1) - (((-1) - ((j11 + 127) - (j11 | 127))) & ((-1) - 128))));
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = value >>> 14;
            UnsafeUtil.putByte(j12, (byte) ((-1) - (((-1) - ((j13 + 127) - (j13 | 127))) & ((-1) - 128))));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((-1) - (((-1) - (value >>> 7)) | ((-1) - 127))) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((-1) - (((-1) - value) | ((-1) - 127))) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (((int) value) >>> 14));
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = (value >>> 7) & 127;
            UnsafeUtil.putByte(j3, (byte) ((j4 + 128) - (j4 & 128)));
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(j5, (byte) ((-1) - (((-1) - ((-1) - (((-1) - value) | ((-1) - 127)))) & ((-1) - 128))));
        }

        private void writeVarint64TwoBytes(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (value >>> 7));
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = (-1) - (((-1) - ((int) value)) | ((-1) - 127));
            UnsafeUtil.putByte(j3, (byte) ((i2 + 128) - (i2 & 128)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.pos -= (long) iRemaining;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            this.pos -= (long) length;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(value, offset, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) ((-1) - (((-1) - (value >> 24)) | ((-1) - 255))));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((value >> 16) & 255));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - (value >> 8)) | ((-1) - 255))));
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(j5, (byte) ((-1) - (((-1) - value) | ((-1) - 255))));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long value) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (((int) (value >> 56)) & 255));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (((int) (value >> 48)) & 255));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((int) (value >> 40)) & 255));
            long j5 = this.pos;
            this.pos = j5 - 1;
            int i2 = (int) (value >> 32);
            UnsafeUtil.putByte(j5, (byte) ((i2 + 255) - (i2 | 255)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) (((int) (value >> 24)) & 255));
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(j7, (byte) ((-1) - (((-1) - ((int) (value >> 16))) | ((-1) - 255))));
            long j8 = this.pos;
            this.pos = j8 - 1;
            int i3 = (int) (value >> 8);
            UnsafeUtil.putByte(j8, (byte) ((i3 + 255) - (i3 | 255)));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((int) value) & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            } else {
                this.pos -= (long) iRemaining;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                this.pos -= (long) length;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(value, offset, length);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void writeString(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 318
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeDirectWriter.writeString(java.lang.String):void");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((-1) - (((-1) - value) | ((-1) - (-128))) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((-1) - (((-1) - value) | ((-1) - (-16384))) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if ((-1) - (((-1) - (-2097152)) | ((-1) - value)) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newHeapBuffer(capacity));
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasArray()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.allocatedBuffer = allocatedBuffer;
            this.buffer = allocatedBuffer.array();
            long jArrayOffset = allocatedBuffer.arrayOffset();
            this.limit = ((long) allocatedBuffer.limit()) + jArrayOffset;
            long jPosition = jArrayOffset + ((long) allocatedBuffer.position());
            this.offset = jPosition;
            this.offsetMinusOne = jPosition - 1;
            long j2 = this.limit - 1;
            this.limitMinusOne = j2;
            this.pos = j2;
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 28));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 21)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr3, j4, (byte) (((-1) - (((-1) - (value >>> 14)) | ((-1) - 127))) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            int i2 = (-1) - (((-1) - (value >>> 7)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr4, j5, (byte) ((i2 + 128) - (i2 & 128)));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr5, j6, (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))));
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 21));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = value >>> 14;
            int i3 = (i2 + 127) - (i2 | 127);
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i3 + 128) - (i3 & 128)));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i4 = (value >>> 7) & 127;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((i4 + 128) - (i4 & 128)));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            int i5 = value & 127;
            UnsafeUtil.putByte(bArr4, j5, (byte) ((i5 + 128) - (i5 & 128)));
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 14));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = (value >>> 7) & 127;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i2 + 128) - (i2 & 128)));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((-1) - (((-1) - (value & 127)) & ((-1) - 128))));
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 7));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = (-1) - (((-1) - value) | ((-1) - 127));
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i2 + 128) - (i2 & 128)));
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 49));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) (((-1) - (((-1) - (value >>> 42)) | ((-1) - 127))) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = (-1) - (((-1) - (value >>> 35)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr3, j4, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr4 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = value >>> 28;
            UnsafeUtil.putByte(bArr4, j6, (byte) (((j7 + 127) - (j7 | 127)) | 128));
            byte[] bArr5 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr5, j8, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = value >>> 14;
            UnsafeUtil.putByte(bArr6, j9, (byte) (((j10 + 127) - (j10 | 127)) | 128));
            byte[] bArr7 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            long j12 = value >>> 7;
            long j13 = (j12 + 127) - (j12 | 127);
            UnsafeUtil.putByte(bArr7, j11, (byte) ((j13 + 128) - (j13 & 128)));
            byte[] bArr8 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            long j15 = value & 127;
            UnsafeUtil.putByte(bArr8, j14, (byte) ((j15 + 128) - (j15 & 128)));
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 28));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 21;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(bArr2, j3, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr3, j6, (byte) (((-1) - (((-1) - (value >>> 14)) | ((-1) - 127))) | 128));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(bArr4, j7, (byte) ((-1) - (((-1) - ((value >>> 7) & 127)) & ((-1) - 128))));
            byte[] bArr5 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr5, j8, (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))));
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 21));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((-1) - (((-1) - ((value >>> 14) & 127)) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = value >>> 7;
            UnsafeUtil.putByte(bArr3, j4, (byte) (((j5 + 127) - (j5 | 127)) | 128));
            byte[] bArr4 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr4, j6, (byte) (((-1) - (((-1) - value) | ((-1) - 127))) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 56));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 49;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(bArr2, j3, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr3, j6, (byte) ((-1) - (((-1) - ((value >>> 42) & 127)) & ((-1) - 128))));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = value >>> 35;
            long j9 = (j8 + 127) - (j8 | 127);
            UnsafeUtil.putByte(bArr4, j7, (byte) ((j9 + 128) - (j9 & 128)));
            byte[] bArr5 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = (value >>> 28) & 127;
            UnsafeUtil.putByte(bArr5, j10, (byte) ((j11 + 128) - (j11 & 128)));
            byte[] bArr6 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = value >>> 21;
            UnsafeUtil.putByte(bArr6, j12, (byte) (((j13 + 127) - (j13 | 127)) | 128));
            byte[] bArr7 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            long j15 = value >>> 14;
            UnsafeUtil.putByte(bArr7, j14, (byte) ((-1) - (((-1) - ((j15 + 127) - (j15 | 127))) & ((-1) - 128))));
            byte[] bArr8 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            long j17 = (-1) - (((-1) - (value >>> 7)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr8, j16, (byte) ((j17 + 128) - (j17 & 128)));
            byte[] bArr9 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr9, j18, (byte) ((-1) - (((-1) - ((value + 127) - (value | 127))) & ((-1) - 128))));
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 42));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = value >>> 28;
            UnsafeUtil.putByte(bArr3, j4, (byte) (((j5 + 127) - (j5 | 127)) | 128));
            byte[] bArr4 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr4, j6, (byte) ((-1) - (((-1) - ((value >>> 21) & 127)) & ((-1) - 128))));
            byte[] bArr5 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(bArr5, j7, (byte) ((-1) - (((-1) - ((value >>> 14) & 127)) & ((-1) - 128))));
            byte[] bArr6 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = (-1) - (((-1) - (value >>> 7)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr6, j8, (byte) ((j9 + 128) - (j9 & 128)));
            byte[] bArr7 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = (value + 127) - (value | 127);
            UnsafeUtil.putByte(bArr7, j10, (byte) ((j11 + 128) - (j11 & 128)));
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 35));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = (value >>> 28) & 127;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((j4 + 128) - (j4 & 128)));
            byte[] bArr3 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = value >>> 21;
            long j7 = (j6 + 127) - (j6 | 127);
            UnsafeUtil.putByte(bArr3, j5, (byte) ((j7 + 128) - (j7 & 128)));
            byte[] bArr4 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = (value >>> 14) & 127;
            UnsafeUtil.putByte(bArr4, j8, (byte) ((j9 + 128) - (j9 & 128)));
            byte[] bArr5 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = (value >>> 7) & 127;
            UnsafeUtil.putByte(bArr5, j10, (byte) ((j11 + 128) - (j11 & 128)));
            byte[] bArr6 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr6, j12, (byte) ((-1) - (((-1) - ((-1) - (((-1) - value) | ((-1) - 127)))) & ((-1) - 128))));
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 63));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 56;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(bArr2, j3, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr3, j6, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(bArr4, j7, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 42)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr5 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = value >>> 35;
            long j10 = (j9 + 127) - (j9 | 127);
            UnsafeUtil.putByte(bArr5, j8, (byte) ((j10 + 128) - (j10 & 128)));
            byte[] bArr6 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr6, j11, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = value >>> 21;
            long j14 = (j13 + 127) - (j13 | 127);
            UnsafeUtil.putByte(bArr7, j12, (byte) ((j14 + 128) - (j14 & 128)));
            byte[] bArr8 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr8, j15, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (value >>> 14)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr9 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            long j17 = value >>> 7;
            UnsafeUtil.putByte(bArr9, j16, (byte) ((-1) - (((-1) - ((j17 + 127) - (j17 | 127))) & ((-1) - 128))));
            byte[] bArr10 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr10, j18, (byte) ((-1) - (((-1) - ((-1) - (((-1) - value) | ((-1) - 127)))) & ((-1) - 128))));
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (((int) value) >>> 14));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            long j4 = value >>> 7;
            long j5 = (j4 + 127) - (j4 | 127);
            UnsafeUtil.putByte(bArr2, j3, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = (value + 127) - (value | 127);
            UnsafeUtil.putByte(bArr3, j6, (byte) ((j7 + 128) - (j7 & 128)));
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (value >>> 7));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = (int) value;
            UnsafeUtil.putByte(bArr2, j3, (byte) (((i2 + 127) - (i2 | 127)) | 128));
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            requireSpace(iRemaining);
            this.pos -= (long) iRemaining;
            value.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            requireSpace(length);
            this.pos -= (long) length;
            System.arraycopy(value, offset, this.buffer, arrayPos() + 1, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) ((-1) - (((-1) - (value >> 24)) | ((-1) - 255))));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = value >> 16;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i2 + 255) - (i2 | 255)));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((-1) - (((-1) - (value >> 8)) | ((-1) - 255))));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr4, j5, (byte) ((-1) - (((-1) - value) | ((-1) - 255))));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long value) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            int i2 = (int) (value >> 56);
            UnsafeUtil.putByte(bArr, j2, (byte) ((i2 + 255) - (i2 | 255)));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i3 = (int) (value >> 48);
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i3 + 255) - (i3 | 255)));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((-1) - (((-1) - ((int) (value >> 40))) | ((-1) - 255))));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr4, j5, (byte) (((int) (value >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            int i4 = (int) (value >> 24);
            UnsafeUtil.putByte(bArr5, j6, (byte) ((i4 + 255) - (i4 | 255)));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            int i5 = (int) (value >> 16);
            UnsafeUtil.putByte(bArr6, j7, (byte) ((i5 + 255) - (i5 | 255)));
            byte[] bArr7 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr7, j8, (byte) ((-1) - (((-1) - ((int) (value >> 8))) | ((-1) - 255))));
            byte[] bArr8 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr8, j9, (byte) (((int) value) & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            }
            this.pos -= (long) iRemaining;
            value.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            if (spaceLeft() >= length) {
                this.pos -= (long) length;
                System.arraycopy(value, offset, this.buffer, arrayPos() + 1, length);
            } else {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void writeString(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeHeapWriter.writeString(java.lang.String):void");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((-1) - (((-1) - value) | ((-1) - (-128))) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value - 16384) - ((-16384) | value) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) + value) - ((-2097152) | value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }
    }

    private BinaryWriter(BufferAllocator alloc, int chunkSize) {
        this.buffers = new ArrayDeque<>(4);
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (BufferAllocator) Internal.checkNotNull(alloc, "alloc");
        this.chunkSize = chunkSize;
    }

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i2, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long value) {
        byte b2;
        if (((-128) + value) - ((-128) | value) == 0) {
            return (byte) 1;
        }
        if (value < 0) {
            return (byte) 10;
        }
        if ((-1) - (((-1) - (-34359738368L)) | ((-1) - value)) != 0) {
            b2 = (byte) 6;
            value >>>= 28;
        } else {
            b2 = 2;
        }
        if (((-2097152) & value) != 0) {
            b2 = (byte) (b2 + 2);
            value >>>= 14;
        }
        return (-1) - (((-1) - value) | ((-1) - (-16384))) != 0 ? (byte) (b2 + 1) : b2;
    }

    static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator alloc) {
        return newDirectInstance(alloc, 4096);
    }

    public static BinaryWriter newDirectInstance(BufferAllocator alloc, int chunkSize) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(alloc, chunkSize) : newSafeDirectInstance(alloc, chunkSize);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator alloc) {
        return newHeapInstance(alloc, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator alloc, int chunkSize) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(alloc, chunkSize) : newSafeHeapInstance(alloc, chunkSize);
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator alloc, int chunkSize) {
        return new SafeDirectWriter(alloc, chunkSize);
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator alloc, int chunkSize) {
        return new SafeHeapWriter(alloc, chunkSize);
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator alloc, int chunkSize) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator alloc, int chunkSize) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private final void writeBoolList_Internal(int fieldNumber, BooleanArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(fieldNumber, list.getBoolean(size));
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.getBoolean(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeBoolList_Internal(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(fieldNumber, list.get(size).booleanValue());
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.get(size2).booleanValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeDoubleList_Internal(int fieldNumber, DoubleArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(fieldNumber, list.getDouble(size));
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.getDouble(size2)));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeDoubleList_Internal(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(fieldNumber, list.get(size).doubleValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeFixed32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(fieldNumber, list.getInt(size));
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.getInt(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeFixed32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeFixed64List_Internal(int fieldNumber, LongArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(fieldNumber, list.getLong(size));
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.getLong(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeFixed64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeFloatList_Internal(int fieldNumber, FloatArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(fieldNumber, list.getFloat(size));
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.getFloat(size2)));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeFloatList_Internal(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(fieldNumber, list.get(size).floatValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeInt32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(fieldNumber, list.getInt(size));
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.getInt(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            writeString(fieldNumber, (String) value);
        } else {
            writeBytes(fieldNumber, (ByteString) value);
        }
    }

    static final void writeMapEntryField(Writer writer, int fieldNumber, WireFormat.FieldType fieldType, Object object) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(fieldNumber, ((Boolean) object).booleanValue());
                return;
            case 2:
                writer.writeFixed32(fieldNumber, ((Integer) object).intValue());
                return;
            case 3:
                writer.writeFixed64(fieldNumber, ((Long) object).longValue());
                return;
            case 4:
                writer.writeInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 5:
                writer.writeInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 6:
                writer.writeSFixed32(fieldNumber, ((Integer) object).intValue());
                return;
            case 7:
                writer.writeSFixed64(fieldNumber, ((Long) object).longValue());
                return;
            case 8:
                writer.writeSInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 9:
                writer.writeSInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 10:
                writer.writeString(fieldNumber, (String) object);
                return;
            case 11:
                writer.writeUInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 12:
                writer.writeUInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 13:
                writer.writeFloat(fieldNumber, ((Float) object).floatValue());
                return;
            case 14:
                writer.writeDouble(fieldNumber, ((Double) object).doubleValue());
                return;
            case 15:
                writer.writeMessage(fieldNumber, object);
                return;
            case 16:
                writer.writeBytes(fieldNumber, (ByteString) object);
                return;
            case 17:
                if (object instanceof Internal.EnumLite) {
                    writer.writeEnum(fieldNumber, ((Internal.EnumLite) object).getNumber());
                    return;
                } else {
                    if (!(object instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(fieldNumber, ((Integer) object).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private final void writeSInt32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(fieldNumber, list.getInt(size));
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.getInt(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeSInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeSInt64List_Internal(int fieldNumber, LongArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(fieldNumber, list.getLong(size));
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.getLong(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeSInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeUInt32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(fieldNumber, list.getInt(size));
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.getInt(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeUInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeUInt64List_Internal(int fieldNumber, LongArrayList list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(fieldNumber, list.getLong(size));
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.getLong(size2));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private final void writeUInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final AllocatedBuffer newDirectBuffer(int capacity) {
        return this.alloc.allocateDirectBuffer(Math.max(capacity, this.chunkSize));
    }

    final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    final AllocatedBuffer newHeapBuffer(int capacity) {
        return this.alloc.allocateHeapBuffer(Math.max(capacity, this.chunkSize));
    }

    abstract void requireSpace(int size);

    abstract void writeBool(boolean value);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBoolList(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(fieldNumber, (BooleanArrayList) list, packed);
        } else {
            writeBoolList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBytesList(int fieldNumber, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDouble(int fieldNumber, double value) throws IOException {
        writeFixed64(fieldNumber, Double.doubleToRawLongBits(value));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDoubleList(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(fieldNumber, (DoubleArrayList) list, packed);
        } else {
            writeDoubleList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnum(int fieldNumber, int value) throws IOException {
        writeInt32(fieldNumber, value);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnumList(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeInt32List(fieldNumber, list, packed);
    }

    abstract void writeFixed32(int value);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeFixed32List_Internal(fieldNumber, list, packed);
        }
    }

    abstract void writeFixed64(long value);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(fieldNumber, (LongArrayList) list, packed);
        } else {
            writeFixed64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloat(int fieldNumber, float value) throws IOException {
        writeFixed32(fieldNumber, Float.floatToRawIntBits(value));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloatList(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(fieldNumber, (FloatArrayList) list, packed);
        } else {
            writeFloatList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size), schema);
        }
    }

    abstract void writeInt32(int value);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64(int fieldNumber, long value) throws IOException {
        writeUInt64(fieldNumber, value);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeUInt64List(fieldNumber, list, packed);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int fieldNumber, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int fieldNumber, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        writeTag(1, 4);
        if (value instanceof ByteString) {
            writeBytes(3, (ByteString) value);
        } else {
            writeMessage(3, value);
        }
        writeUInt32(2, fieldNumber);
        writeTag(1, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32(int fieldNumber, int value) throws IOException {
        writeFixed32(fieldNumber, value);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeFixed32List(fieldNumber, list, packed);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64(int fieldNumber, long value) throws IOException {
        writeFixed64(fieldNumber, value);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeFixed64List(fieldNumber, list, packed);
    }

    abstract void writeSInt32(int value);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeSInt32List_Internal(fieldNumber, list, packed);
        }
    }

    abstract void writeSInt64(long value);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(fieldNumber, (LongArrayList) list, packed);
        } else {
            writeSInt64List_Internal(fieldNumber, list, packed);
        }
    }

    abstract void writeString(String in);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeStringList(int fieldNumber, List<String> list) throws IOException {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(fieldNumber, list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(fieldNumber, lazyStringList.getRaw(size2));
        }
    }

    abstract void writeTag(int fieldNumber, int wireType);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeUInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(fieldNumber, (LongArrayList) list, packed);
        } else {
            writeUInt64List_Internal(fieldNumber, list, packed);
        }
    }

    abstract void writeVarint32(int value);

    abstract void writeVarint64(long value);
}
