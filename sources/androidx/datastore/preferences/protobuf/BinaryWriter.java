package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j2) {
        byte b2;
        if (((-128) & j2) == 0) {
            return (byte) 1;
        }
        if (j2 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) + j2) - ((-34359738368L) | j2) != 0) {
            b2 = (byte) 6;
            j2 >>>= 28;
        } else {
            b2 = 2;
        }
        if (((-2097152) + j2) - ((-2097152) | j2) != 0) {
            b2 = (byte) (b2 + 2);
            j2 >>>= 14;
        }
        return (j2 + (-16384)) - (j2 | (-16384)) != 0 ? (byte) (b2 + 1) : b2;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    abstract void requireSpace(int i2);

    abstract void writeBool(boolean z2);

    abstract void writeFixed32(int i2);

    abstract void writeFixed64(long j2);

    abstract void writeInt32(int i2);

    abstract void writeSInt32(int i2);

    abstract void writeSInt64(long j2);

    abstract void writeString(String str);

    abstract void writeTag(int i2, int i3);

    abstract void writeVarint32(int i2);

    abstract void writeVarint64(long j2);

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i2, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i2);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i2) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(bufferAllocator, i2) : newSafeHeapInstance(bufferAllocator, i2);
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i2) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(bufferAllocator, i2) : newSafeDirectInstance(bufferAllocator, i2);
    }

    static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i2) {
        return new SafeHeapWriter(bufferAllocator, i2);
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i2) {
        if (!isUnsafeHeapSupported()) {
            throw new UnsupportedOperationException("Unsafe operations not supported");
        }
        return new UnsafeHeapWriter(bufferAllocator, i2);
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i2) {
        return new SafeDirectWriter(bufferAllocator, i2);
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i2) {
        if (!isUnsafeDirectSupported()) {
            throw new UnsupportedOperationException("Unsafe operations not supported");
        }
        return new UnsafeDirectWriter(bufferAllocator, i2);
    }

    private BinaryWriter(BufferAllocator bufferAllocator, int i2) {
        this.buffers = new ArrayDeque<>(4);
        if (i2 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (BufferAllocator) Internal.checkNotNull(bufferAllocator, "alloc");
        this.chunkSize = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i2, int i3) throws IOException {
        writeFixed32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i2, long j2) throws IOException {
        writeUInt64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i2, long j2) throws IOException {
        writeFixed64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i2, float f2) throws IOException {
        writeFixed32(i2, Float.floatToRawIntBits(f2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i2, double d2) throws IOException {
        writeFixed64(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i2, int i3) throws IOException {
        writeInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i2, List<Integer> list, boolean z2) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(i2, (IntArrayList) list, z2);
        } else {
            writeInt32List_Internal(i2, list, z2);
        }
    }

    private final void writeInt32List_Internal(int i2, List<Integer> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(i2, list.get(size2).intValue());
        }
    }

    private final void writeInt32List_Internal(int i2, IntArrayList intArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i2, intArrayList.getInt(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i2, List<Integer> list, boolean z2) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(i2, (IntArrayList) list, z2);
        } else {
            writeFixed32List_Internal(i2, list, z2);
        }
    }

    private final void writeFixed32List_Internal(int i2, List<Integer> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i2, list.get(size2).intValue());
        }
    }

    private final void writeFixed32List_Internal(int i2, IntArrayList intArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i2, intArrayList.getInt(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i2, List<Long> list, boolean z2) throws IOException {
        writeUInt64List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i2, List<Long> list, boolean z2) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(i2, (LongArrayList) list, z2);
        } else {
            writeUInt64List_Internal(i2, list, z2);
        }
    }

    private final void writeUInt64List_Internal(int i2, List<Long> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i2, list.get(size2).longValue());
        }
    }

    private final void writeUInt64List_Internal(int i2, LongArrayList longArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i2, longArrayList.getLong(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i2, List<Long> list, boolean z2) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(i2, (LongArrayList) list, z2);
        } else {
            writeFixed64List_Internal(i2, list, z2);
        }
    }

    private final void writeFixed64List_Internal(int i2, List<Long> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i2, list.get(size2).longValue());
        }
    }

    private final void writeFixed64List_Internal(int i2, LongArrayList longArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i2, longArrayList.getLong(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i2, List<Float> list, boolean z2) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(i2, (FloatArrayList) list, z2);
        } else {
            writeFloatList_Internal(i2, list, z2);
        }
    }

    private final void writeFloatList_Internal(int i2, List<Float> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(i2, list.get(size2).floatValue());
        }
    }

    private final void writeFloatList_Internal(int i2, FloatArrayList floatArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i2, floatArrayList.getFloat(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i2, List<Double> list, boolean z2) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(i2, (DoubleArrayList) list, z2);
        } else {
            writeDoubleList_Internal(i2, list, z2);
        }
    }

    private final void writeDoubleList_Internal(int i2, List<Double> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(i2, list.get(size2).doubleValue());
        }
    }

    private final void writeDoubleList_Internal(int i2, DoubleArrayList doubleArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i2, doubleArrayList.getDouble(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i2, List<Integer> list, boolean z2) throws IOException {
        writeInt32List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i2, List<Boolean> list, boolean z2) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(i2, (BooleanArrayList) list, z2);
        } else {
            writeBoolList_Internal(i2, list, z2);
        }
    }

    private final void writeBoolList_Internal(int i2, List<Boolean> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(list.get(size).booleanValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(i2, list.get(size2).booleanValue());
        }
    }

    private final void writeBoolList_Internal(int i2, BooleanArrayList booleanArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i2, booleanArrayList.getBoolean(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i2, List<String> list) throws IOException {
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                writeLazyString(i2, lazyStringList.getRaw(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeString(i2, list.get(size2));
        }
    }

    private void writeLazyString(int i2, Object obj) throws IOException {
        if (obj instanceof String) {
            writeString(i2, (String) obj);
        } else {
            writeBytes(i2, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i2, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i2, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i2, List<Integer> list, boolean z2) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(i2, (IntArrayList) list, z2);
        } else {
            writeUInt32List_Internal(i2, list, z2);
        }
    }

    private final void writeUInt32List_Internal(int i2, List<Integer> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i2, list.get(size2).intValue());
        }
    }

    private final void writeUInt32List_Internal(int i2, IntArrayList intArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i2, intArrayList.getInt(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i2, List<Integer> list, boolean z2) throws IOException {
        writeFixed32List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i2, List<Long> list, boolean z2) throws IOException {
        writeFixed64List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i2, List<Integer> list, boolean z2) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(i2, (IntArrayList) list, z2);
        } else {
            writeSInt32List_Internal(i2, list, z2);
        }
    }

    private final void writeSInt32List_Internal(int i2, List<Integer> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i2, list.get(size2).intValue());
        }
    }

    private final void writeSInt32List_Internal(int i2, IntArrayList intArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i2, intArrayList.getInt(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i2, List<Long> list, boolean z2) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(i2, (LongArrayList) list, z2);
        } else {
            writeSInt64List_Internal(i2, list, z2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
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

    static final void writeMapEntryField(Writer writer, int i2, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i2, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i2, ((Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i2, ((Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i2, ((Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i2, ((Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i2, ((Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i2, ((Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i2, ((Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i2, ((Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i2, (String) obj);
                return;
            case 11:
                writer.writeUInt32(i2, ((Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i2, ((Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i2, ((Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i2, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i2, obj);
                return;
            case 16:
                writer.writeBytes(i2, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.writeEnum(i2, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (obj instanceof Integer) {
                        writer.writeEnum(i2, ((Integer) obj).intValue());
                        return;
                    }
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private final void writeSInt64List_Internal(int i2, List<Long> list, boolean z2) throws IOException {
        if (z2) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i2, list.get(size2).longValue());
        }
    }

    private final void writeSInt64List_Internal(int i2, LongArrayList longArrayList, boolean z2) throws IOException {
        if (z2) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i2, longArrayList.getLong(size2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int i2, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i2, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int i2, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i2, list.get(size), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroupList(int i2, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i2, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroupList(int i2, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i2, list.get(size), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) throws IOException {
        writeTag(1, 4);
        if (obj instanceof ByteString) {
            writeBytes(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i2);
        writeTag(1, 3);
    }

    final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    final AllocatedBuffer newHeapBuffer(int i2) {
        return this.alloc.allocateHeapBuffer(Math.max(i2, this.chunkSize));
    }

    final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final AllocatedBuffer newDirectBuffer(int i2) {
        return this.alloc.allocateDirectBuffer(Math.max(i2, this.chunkSize));
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator bufferAllocator, int i2) {
            super(bufferAllocator, i2, null);
            nextBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
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

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void nextBuffer(int i2) {
            nextBuffer(newHeapBuffer(i2));
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

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) throws IOException {
            requireSpace(10);
            writeVarint32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) throws IOException {
            requireSpace(15);
            writeInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) throws IOException {
            requireSpace(10);
            writeSInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) throws IOException {
            requireSpace(9);
            writeFixed32(i3);
            writeTag(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) throws IOException {
            requireSpace(15);
            writeVarint64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) throws IOException {
            requireSpace(15);
            writeSInt64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) throws IOException {
            requireSpace(13);
            writeFixed64(j2);
            writeTag(i2, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) throws IOException {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) throws IOException {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
            writeTag(i2, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
            writeTag(i2, 4);
            schema.writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            writeTag(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i2) {
            if (i2 >= 0) {
                writeVarint32(i2);
            } else {
                writeVarint64(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i2) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j2) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i2, int i3) {
            writeVarint32(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i2) {
            if ((-1) - (((-1) - i2) | ((-1) - (-128))) == 0) {
                writeVarint32OneByte(i2);
                return;
            }
            if ((i2 - 16384) - ((-16384) | i2) == 0) {
                writeVarint32TwoBytes(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                writeVarint32ThreeBytes(i2);
            } else if (((-268435456) & i2) == 0) {
                writeVarint32FourBytes(i2);
            } else {
                writeVarint32FiveBytes(i2);
            }
        }

        private void writeVarint32OneByte(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.pos;
            this.pos = i3 - 1;
            bArr[i3] = (byte) i2;
        }

        private void writeVarint32TwoBytes(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.pos;
            int i4 = i3 - 1;
            this.pos = i4;
            bArr[i3] = (byte) (i2 >>> 7);
            this.pos = i3 - 2;
            bArr[i4] = (byte) ((i2 & 127) | 128);
        }

        private void writeVarint32ThreeBytes(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.pos;
            int i4 = i3 - 1;
            this.pos = i4;
            bArr[i3] = (byte) (i2 >>> 14);
            int i5 = i3 - 2;
            this.pos = i5;
            int i6 = i2 >>> 7;
            int i7 = (i6 + 127) - (i6 | 127);
            bArr[i4] = (byte) ((i7 + 128) - (i7 & 128));
            this.pos = i3 - 3;
            bArr[i5] = (byte) ((i2 & 127) | 128);
        }

        private void writeVarint32FourBytes(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.pos;
            int i4 = i3 - 1;
            this.pos = i4;
            bArr[i3] = (byte) (i2 >>> 21);
            int i5 = i3 - 2;
            this.pos = i5;
            int i6 = i2 >>> 14;
            bArr[i4] = (byte) (((i6 + 127) - (i6 | 127)) | 128);
            int i7 = i3 - 3;
            this.pos = i7;
            bArr[i5] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i2 >>> 7)) | ((-1) - 127)))) & ((-1) - 128)));
            this.pos = i3 - 4;
            bArr[i7] = (byte) ((i2 & 127) | 128);
        }

        private void writeVarint32FiveBytes(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.pos;
            int i4 = i3 - 1;
            this.pos = i4;
            bArr[i3] = (byte) (i2 >>> 28);
            int i5 = i3 - 2;
            this.pos = i5;
            int i6 = (i2 >>> 21) & 127;
            bArr[i4] = (byte) ((i6 + 128) - (i6 & 128));
            int i7 = i3 - 3;
            this.pos = i7;
            bArr[i5] = (byte) (((-1) - (((-1) - (i2 >>> 14)) | ((-1) - 127))) | 128);
            int i8 = i3 - 4;
            this.pos = i8;
            bArr[i7] = (byte) (((i2 >>> 7) & 127) | 128);
            this.pos = i3 - 5;
            bArr[i8] = (byte) (((-1) - (((-1) - i2) | ((-1) - 127))) | 128);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j2) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j2)) {
                case 1:
                    writeVarint64OneByte(j2);
                    break;
                case 2:
                    writeVarint64TwoBytes(j2);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j2);
                    break;
                case 4:
                    writeVarint64FourBytes(j2);
                    break;
                case 5:
                    writeVarint64FiveBytes(j2);
                    break;
                case 6:
                    writeVarint64SixBytes(j2);
                    break;
                case 7:
                    writeVarint64SevenBytes(j2);
                    break;
                case 8:
                    writeVarint64EightBytes(j2);
                    break;
                case 9:
                    writeVarint64NineBytes(j2);
                    break;
                case 10:
                    writeVarint64TenBytes(j2);
                    break;
            }
        }

        private void writeVarint64OneByte(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            bArr[i2] = (byte) j2;
        }

        private void writeVarint64TwoBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 7);
            this.pos = i2 - 2;
            int i4 = (-1) - (((-1) - ((int) j2)) | ((-1) - 127));
            bArr[i3] = (byte) ((i4 + 128) - (i4 & 128));
        }

        private void writeVarint64ThreeBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (((int) j2) >>> 14);
            int i4 = i2 - 2;
            this.pos = i4;
            long j3 = (-1) - (((-1) - (j2 >>> 7)) | ((-1) - 127));
            bArr[i3] = (byte) ((j3 + 128) - (j3 & 128));
            this.pos = i2 - 3;
            bArr[i4] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - j2) | ((-1) - 127)))) & ((-1) - 128)));
        }

        private void writeVarint64FourBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 21);
            int i4 = i2 - 2;
            this.pos = i4;
            long j3 = j2 >>> 14;
            long j4 = (j3 + 127) - (j3 | 127);
            bArr[i3] = (byte) ((j4 + 128) - (j4 & 128));
            int i5 = i2 - 3;
            this.pos = i5;
            long j5 = j2 >>> 7;
            bArr[i4] = (byte) (((j5 + 127) - (j5 | 127)) | 128);
            this.pos = i2 - 4;
            long j6 = j2 & 127;
            bArr[i5] = (byte) ((j6 + 128) - (j6 & 128));
        }

        private void writeVarint64FiveBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 28);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - ((j2 >>> 21) & 127)) & ((-1) - 128)));
            int i5 = i2 - 3;
            this.pos = i5;
            bArr[i4] = (byte) (((j2 >>> 14) & 127) | 128);
            int i6 = i2 - 4;
            this.pos = i6;
            long j3 = j2 >>> 7;
            long j4 = (j3 + 127) - (j3 | 127);
            bArr[i5] = (byte) ((j4 + 128) - (j4 & 128));
            this.pos = i2 - 5;
            bArr[i6] = (byte) (((j2 + 127) - (j2 | 127)) | 128);
        }

        private void writeVarint64SixBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 35);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 28)) | ((-1) - 127)))) & ((-1) - 128)));
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = j2 >>> 21;
            bArr[i4] = (byte) (((j3 + 127) - (j3 | 127)) | 128);
            int i6 = i2 - 4;
            this.pos = i6;
            bArr[i5] = (byte) (((j2 >>> 14) & 127) | 128);
            int i7 = i2 - 5;
            this.pos = i7;
            long j4 = j2 >>> 7;
            bArr[i6] = (byte) ((-1) - (((-1) - ((j4 + 127) - (j4 | 127))) & ((-1) - 128)));
            this.pos = i2 - 6;
            bArr[i7] = (byte) ((j2 & 127) | 128);
        }

        private void writeVarint64SevenBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 42);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((-1) - (((-1) - (j2 >>> 35)) | ((-1) - 127))) | 128);
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = j2 >>> 28;
            bArr[i4] = (byte) (((j3 + 127) - (j3 | 127)) | 128);
            int i6 = i2 - 4;
            this.pos = i6;
            bArr[i5] = (byte) (((j2 >>> 21) & 127) | 128);
            int i7 = i2 - 5;
            this.pos = i7;
            long j4 = j2 >>> 14;
            long j5 = (j4 + 127) - (j4 | 127);
            bArr[i6] = (byte) ((j5 + 128) - (j5 & 128));
            int i8 = i2 - 6;
            this.pos = i8;
            long j6 = j2 >>> 7;
            bArr[i7] = (byte) (((j6 + 127) - (j6 | 127)) | 128);
            this.pos = i2 - 7;
            long j7 = (-1) - (((-1) - j2) | ((-1) - 127));
            bArr[i8] = (byte) ((j7 + 128) - (j7 & 128));
        }

        private void writeVarint64EightBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 49);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) (((j2 >>> 42) & 127) | 128);
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = j2 >>> 35;
            bArr[i4] = (byte) (((j3 + 127) - (j3 | 127)) | 128);
            int i6 = i2 - 4;
            this.pos = i6;
            bArr[i5] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 28)) | ((-1) - 127)))) & ((-1) - 128)));
            int i7 = i2 - 5;
            this.pos = i7;
            bArr[i6] = (byte) ((-1) - (((-1) - ((j2 >>> 21) & 127)) & ((-1) - 128)));
            int i8 = i2 - 6;
            this.pos = i8;
            long j4 = j2 >>> 14;
            bArr[i7] = (byte) ((-1) - (((-1) - ((j4 + 127) - (j4 | 127))) & ((-1) - 128)));
            int i9 = i2 - 7;
            this.pos = i9;
            bArr[i8] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 7)) | ((-1) - 127)))) & ((-1) - 128)));
            this.pos = i2 - 8;
            long j5 = j2 & 127;
            bArr[i9] = (byte) ((j5 + 128) - (j5 & 128));
        }

        private void writeVarint64NineBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 56);
            int i4 = i2 - 2;
            this.pos = i4;
            long j3 = j2 >>> 49;
            bArr[i3] = (byte) ((-1) - (((-1) - ((j3 + 127) - (j3 | 127))) & ((-1) - 128)));
            int i5 = i2 - 3;
            this.pos = i5;
            long j4 = (-1) - (((-1) - (j2 >>> 42)) | ((-1) - 127));
            bArr[i4] = (byte) ((j4 + 128) - (j4 & 128));
            int i6 = i2 - 4;
            this.pos = i6;
            long j5 = (j2 >>> 35) & 127;
            bArr[i5] = (byte) ((j5 + 128) - (j5 & 128));
            int i7 = i2 - 5;
            this.pos = i7;
            bArr[i6] = (byte) (((j2 >>> 28) & 127) | 128);
            int i8 = i2 - 6;
            this.pos = i8;
            bArr[i7] = (byte) ((-1) - (((-1) - ((j2 >>> 21) & 127)) & ((-1) - 128)));
            int i9 = i2 - 7;
            this.pos = i9;
            bArr[i8] = (byte) (((j2 >>> 14) & 127) | 128);
            int i10 = i2 - 8;
            this.pos = i10;
            bArr[i9] = (byte) (((j2 >>> 7) & 127) | 128);
            this.pos = i2 - 9;
            long j6 = (-1) - (((-1) - j2) | ((-1) - 127));
            bArr[i10] = (byte) ((j6 + 128) - (j6 & 128));
        }

        private void writeVarint64TenBytes(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            bArr[i2] = (byte) (j2 >>> 63);
            int i4 = i2 - 2;
            this.pos = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - ((j2 >>> 56) & 127)) & ((-1) - 128)));
            int i5 = i2 - 3;
            this.pos = i5;
            long j3 = j2 >>> 49;
            bArr[i4] = (byte) ((-1) - (((-1) - ((j3 + 127) - (j3 | 127))) & ((-1) - 128)));
            int i6 = i2 - 4;
            this.pos = i6;
            long j4 = j2 >>> 42;
            bArr[i5] = (byte) ((-1) - (((-1) - ((j4 + 127) - (j4 | 127))) & ((-1) - 128)));
            int i7 = i2 - 5;
            this.pos = i7;
            long j5 = j2 >>> 35;
            bArr[i6] = (byte) ((-1) - (((-1) - ((j5 + 127) - (j5 | 127))) & ((-1) - 128)));
            int i8 = i2 - 6;
            this.pos = i8;
            bArr[i7] = (byte) (((-1) - (((-1) - (j2 >>> 28)) | ((-1) - 127))) | 128);
            int i9 = i2 - 7;
            this.pos = i9;
            bArr[i8] = (byte) (((-1) - (((-1) - (j2 >>> 21)) | ((-1) - 127))) | 128);
            int i10 = i2 - 8;
            this.pos = i10;
            bArr[i9] = (byte) (((j2 >>> 14) & 127) | 128);
            int i11 = i2 - 9;
            this.pos = i11;
            bArr[i10] = (byte) (((-1) - (((-1) - (j2 >>> 7)) | ((-1) - 127))) | 128);
            this.pos = i2 - 10;
            bArr[i11] = (byte) ((-1) - (((-1) - (j2 & 127)) & ((-1) - 128)));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.pos;
            int i4 = i3 - 1;
            this.pos = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255)));
            int i5 = i3 - 2;
            this.pos = i5;
            bArr[i4] = (byte) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255)));
            int i6 = i3 - 3;
            this.pos = i6;
            bArr[i5] = (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255)));
            this.pos = i3 - 4;
            bArr[i6] = (byte) ((i2 + 255) - (i2 | 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 - 1;
            this.pos = i3;
            int i4 = (int) (j2 >> 56);
            bArr[i2] = (byte) ((i4 + 255) - (i4 | 255));
            int i5 = i2 - 2;
            this.pos = i5;
            bArr[i3] = (byte) ((-1) - (((-1) - ((int) (j2 >> 48))) | ((-1) - 255)));
            int i6 = i2 - 3;
            this.pos = i6;
            bArr[i5] = (byte) ((-1) - (((-1) - ((int) (j2 >> 40))) | ((-1) - 255)));
            int i7 = i2 - 4;
            this.pos = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i2 - 5;
            this.pos = i8;
            bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
            int i9 = i2 - 6;
            this.pos = i9;
            bArr[i8] = (byte) (((int) (j2 >> 16)) & 255);
            int i10 = i2 - 7;
            this.pos = i10;
            bArr[i9] = (byte) ((-1) - (((-1) - ((int) (j2 >> 8))) | ((-1) - 255)));
            this.pos = i2 - 8;
            int i11 = (int) j2;
            bArr[i10] = (byte) ((i11 + 255) - (i11 | 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeString(String str) {
            int i2;
            int i3;
            int i4;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 >= 128 || (i4 = this.pos) <= this.offsetMinusOne) {
                    if (cCharAt2 < 2048 && (i3 = this.pos) > this.offset) {
                        byte[] bArr = this.buffer;
                        int i5 = i3 - 1;
                        this.pos = i5;
                        bArr[i3] = (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128);
                        this.pos = i3 - 2;
                        bArr[i5] = (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 960)));
                    } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i2 = this.pos) > this.offset + 1) {
                        byte[] bArr2 = this.buffer;
                        int i6 = i2 - 1;
                        this.pos = i6;
                        bArr2[i2] = (byte) (((cCharAt2 + '?') - ('?' | cCharAt2)) | 128);
                        int i7 = i2 - 2;
                        this.pos = i7;
                        bArr2[i6] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                        this.pos = i2 - 3;
                        int i8 = cCharAt2 >>> '\f';
                        bArr2[i7] = (byte) ((i8 + 480) - (i8 & 480));
                    } else {
                        if (this.pos > this.offset + 2) {
                            if (length != 0) {
                                char cCharAt3 = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                    length--;
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                    byte[] bArr3 = this.buffer;
                                    int i9 = this.pos;
                                    int i10 = i9 - 1;
                                    this.pos = i10;
                                    bArr3[i9] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - codePoint) | ((-1) - 63)))) & ((-1) - 128)));
                                    int i11 = i9 - 2;
                                    this.pos = i11;
                                    int i12 = codePoint >>> 6;
                                    int i13 = (i12 + 63) - (i12 | 63);
                                    bArr3[i10] = (byte) ((i13 + 128) - (i13 & 128));
                                    int i14 = i9 - 3;
                                    this.pos = i14;
                                    bArr3[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    this.pos = i9 - 4;
                                    bArr3[i14] = (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240)));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                } else {
                    byte[] bArr4 = this.buffer;
                    this.pos = i4 - 1;
                    bArr4[i4] = (byte) cCharAt2;
                }
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            bArr[i2] = b2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
            if (spaceLeft() < i3) {
                nextBuffer(i3);
            }
            int i4 = this.pos - i3;
            this.pos = i4;
            System.arraycopy(bArr, i2, this.buffer, i4 + 1, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
            if (spaceLeft() < i3) {
                this.totalDoneBytes += i3;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i2, i3));
                nextBuffer();
            } else {
                int i4 = this.pos - i3;
                this.pos = i4;
                System.arraycopy(bArr, i2, this.buffer, i4 + 1, i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i2 = this.pos - iRemaining;
            this.pos = i2;
            byteBuffer.get(this.buffer, i2 + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i2 = this.pos - iRemaining;
            this.pos = i2;
            byteBuffer.get(this.buffer, i2 + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
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

        UnsafeHeapWriter(BufferAllocator bufferAllocator, int i2) {
            super(bufferAllocator, i2, null);
            nextBuffer();
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void nextBuffer(int i2) {
            nextBuffer(newHeapBuffer(i2));
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
            long jPosition = iArrayOffset + allocatedBuffer.position();
            this.offset = jPosition;
            this.offsetMinusOne = jPosition - 1;
            long j2 = this.limit - 1;
            this.limitMinusOne = j2;
            this.pos = j2;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            requireSpace(10);
            writeVarint32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            requireSpace(15);
            writeInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            requireSpace(10);
            writeSInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            requireSpace(9);
            writeFixed32(i3);
            writeTag(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            requireSpace(15);
            writeVarint64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            requireSpace(15);
            writeSInt64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            requireSpace(13);
            writeFixed64(j2);
            writeTag(i2, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
            writeTag(i2, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
            writeTag(i2, 4);
            schema.writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            writeTag(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i2) {
            if (i2 >= 0) {
                writeVarint32(i2);
            } else {
                writeVarint64(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i2) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j2) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i2, int i3) {
            writeVarint32(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i2) {
            if ((i2 - 128) - ((-128) | i2) == 0) {
                writeVarint32OneByte(i2);
                return;
            }
            if (((-16384) & i2) == 0) {
                writeVarint32TwoBytes(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                writeVarint32ThreeBytes(i2);
            } else if (((-268435456) + i2) - ((-268435456) | i2) == 0) {
                writeVarint32FourBytes(i2);
            } else {
                writeVarint32FiveBytes(i2);
            }
        }

        private void writeVarint32OneByte(int i2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) i2);
        }

        private void writeVarint32TwoBytes(int i2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (i2 >>> 7));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) (((-1) - (((-1) - i2) | ((-1) - 127))) | 128));
        }

        private void writeVarint32ThreeBytes(int i2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (i2 >>> 14));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i2 >>> 7)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i3 = i2 & 127;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((i3 + 128) - (i3 & 128)));
        }

        private void writeVarint32FourBytes(int i2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (i2 >>> 21));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i3 = (i2 >>> 14) & 127;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i3 + 128) - (i3 & 128)));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i4 = (-1) - (((-1) - (i2 >>> 7)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr3, j4, (byte) ((i4 + 128) - (i4 & 128)));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr4, j5, (byte) ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 127)))) & ((-1) - 128))));
        }

        private void writeVarint32FiveBytes(int i2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) (i2 >>> 28));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i2 >>> 21)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i2 >>> 14)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr4, j5, (byte) (((-1) - (((-1) - (i2 >>> 7)) | ((-1) - 127))) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr5, j6, (byte) (((i2 + 127) - (i2 | 127)) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j2) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j2)) {
                case 1:
                    writeVarint64OneByte(j2);
                    break;
                case 2:
                    writeVarint64TwoBytes(j2);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j2);
                    break;
                case 4:
                    writeVarint64FourBytes(j2);
                    break;
                case 5:
                    writeVarint64FiveBytes(j2);
                    break;
                case 6:
                    writeVarint64SixBytes(j2);
                    break;
                case 7:
                    writeVarint64SevenBytes(j2);
                    break;
                case 8:
                    writeVarint64EightBytes(j2);
                    break;
                case 9:
                    writeVarint64NineBytes(j2);
                    break;
                case 10:
                    writeVarint64TenBytes(j2);
                    break;
            }
        }

        private void writeVarint64OneByte(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) j2);
        }

        private void writeVarint64TwoBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 7));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i2 = (int) j2;
            UnsafeUtil.putByte(bArr2, j4, (byte) (((i2 + 127) - (i2 | 127)) | 128));
        }

        private void writeVarint64ThreeBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (((int) j2) >>> 14));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr2, j4, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr3, j5, (byte) (((-1) - (((-1) - j2) | ((-1) - 127))) | 128));
        }

        private void writeVarint64FourBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 21));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = (-1) - (((-1) - (j2 >>> 14)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr2, j4, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = (j2 >>> 7) & 127;
            UnsafeUtil.putByte(bArr3, j6, (byte) ((j7 + 128) - (j7 & 128)));
            byte[] bArr4 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr4, j8, (byte) (((-1) - (((-1) - j2) | ((-1) - 127))) | 128));
        }

        private void writeVarint64FiveBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 28));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = j2 >>> 21;
            UnsafeUtil.putByte(bArr2, j4, (byte) ((-1) - (((-1) - ((j5 + 127) - (j5 | 127))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = j2 >>> 14;
            long j8 = (j7 + 127) - (j7 | 127);
            UnsafeUtil.putByte(bArr3, j6, (byte) ((j8 + 128) - (j8 & 128)));
            byte[] bArr4 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = j2 >>> 7;
            long j11 = (j10 + 127) - (j10 | 127);
            UnsafeUtil.putByte(bArr4, j9, (byte) ((j11 + 128) - (j11 & 128)));
            byte[] bArr5 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr5, j12, (byte) (((j2 + 127) - (j2 | 127)) | 128));
        }

        private void writeVarint64SixBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 35));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = j2 >>> 28;
            UnsafeUtil.putByte(bArr2, j4, (byte) ((-1) - (((-1) - ((j5 + 127) - (j5 | 127))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr3, j6, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = j2 >>> 14;
            UnsafeUtil.putByte(bArr4, j7, (byte) ((-1) - (((-1) - ((j8 + 127) - (j8 | 127))) & ((-1) - 128))));
            byte[] bArr5 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = j2 >>> 7;
            UnsafeUtil.putByte(bArr5, j9, (byte) ((-1) - (((-1) - ((j10 + 127) - (j10 | 127))) & ((-1) - 128))));
            byte[] bArr6 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr6, j11, (byte) ((j2 & 127) | 128));
        }

        private void writeVarint64SevenBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 42));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr2, j4, (byte) (((-1) - (((-1) - (j2 >>> 35)) | ((-1) - 127))) | 128));
            byte[] bArr3 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr3, j5, (byte) ((-1) - (((-1) - ((j2 >>> 28) & 127)) & ((-1) - 128))));
            byte[] bArr4 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = j2 >>> 21;
            UnsafeUtil.putByte(bArr4, j6, (byte) (((j7 + 127) - (j7 | 127)) | 128));
            byte[] bArr5 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = j2 >>> 14;
            UnsafeUtil.putByte(bArr5, j8, (byte) (((j9 + 127) - (j9 | 127)) | 128));
            byte[] bArr6 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr6, j10, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr7, j11, (byte) (((j2 + 127) - (j2 | 127)) | 128));
        }

        private void writeVarint64EightBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 49));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(bArr2, j4, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 42)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = j2 >>> 35;
            UnsafeUtil.putByte(bArr3, j5, (byte) ((-1) - (((-1) - ((j6 + 127) - (j6 | 127))) & ((-1) - 128))));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = (j2 >>> 28) & 127;
            UnsafeUtil.putByte(bArr4, j7, (byte) ((j8 + 128) - (j8 & 128)));
            byte[] bArr5 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr5, j9, (byte) ((-1) - (((-1) - ((j2 >>> 21) & 127)) & ((-1) - 128))));
            byte[] bArr6 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = (-1) - (((-1) - (j2 >>> 14)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr6, j10, (byte) ((j11 + 128) - (j11 & 128)));
            byte[] bArr7 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr7, j12, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            long j14 = j2 & 127;
            UnsafeUtil.putByte(bArr8, j13, (byte) ((j14 + 128) - (j14 & 128)));
        }

        private void writeVarint64NineBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 56));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = j2 >>> 49;
            UnsafeUtil.putByte(bArr2, j4, (byte) ((-1) - (((-1) - ((j5 + 127) - (j5 | 127))) & ((-1) - 128))));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr3, j6, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 42)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = j2 >>> 35;
            UnsafeUtil.putByte(bArr4, j7, (byte) ((-1) - (((-1) - ((j8 + 127) - (j8 | 127))) & ((-1) - 128))));
            byte[] bArr5 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = j2 >>> 28;
            long j11 = (j10 + 127) - (j10 | 127);
            UnsafeUtil.putByte(bArr5, j9, (byte) ((j11 + 128) - (j11 & 128)));
            byte[] bArr6 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = j2 >>> 21;
            UnsafeUtil.putByte(bArr6, j12, (byte) (((j13 + 127) - (j13 | 127)) | 128));
            byte[] bArr7 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr7, j14, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 14)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr8 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr8, j15, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            long j17 = (-1) - (((-1) - j2) | ((-1) - 127));
            UnsafeUtil.putByte(bArr9, j16, (byte) ((j17 + 128) - (j17 & 128)));
        }

        private void writeVarint64TenBytes(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) (j2 >>> 63));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = (j2 >>> 56) & 127;
            UnsafeUtil.putByte(bArr2, j4, (byte) ((j5 + 128) - (j5 & 128)));
            byte[] bArr3 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr3, j6, (byte) (((-1) - (((-1) - (j2 >>> 49)) | ((-1) - 127))) | 128));
            byte[] bArr4 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(bArr4, j7, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 42)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr5 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr5, j8, (byte) (((j2 >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = j2 >>> 28;
            UnsafeUtil.putByte(bArr6, j9, (byte) (((j10 + 127) - (j10 | 127)) | 128));
            byte[] bArr7 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr7, j11, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 21)) | ((-1) - 127)))) & ((-1) - 128))));
            byte[] bArr8 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = (-1) - (((-1) - (j2 >>> 14)) | ((-1) - 127));
            UnsafeUtil.putByte(bArr8, j12, (byte) ((j13 + 128) - (j13 & 128)));
            byte[] bArr9 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            long j15 = j2 >>> 7;
            long j16 = (j15 + 127) - (j15 | 127);
            UnsafeUtil.putByte(bArr9, j14, (byte) ((j16 + 128) - (j16 & 128)));
            byte[] bArr10 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr10, j17, (byte) ((j2 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr2, j3, (byte) ((i2 >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i3 = i2 >> 8;
            UnsafeUtil.putByte(bArr3, j4, (byte) ((i3 + 255) - (i3 | 255)));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(bArr4, j5, (byte) ((-1) - (((-1) - i2) | ((-1) - 255))));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j2) {
            byte[] bArr = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(bArr, j3, (byte) ((-1) - (((-1) - ((int) (j2 >> 56))) | ((-1) - 255))));
            byte[] bArr2 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i2 = (int) (j2 >> 48);
            UnsafeUtil.putByte(bArr2, j4, (byte) ((i2 + 255) - (i2 | 255)));
            byte[] bArr3 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            int i3 = (int) (j2 >> 40);
            UnsafeUtil.putByte(bArr3, j5, (byte) ((i3 + 255) - (i3 | 255)));
            byte[] bArr4 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(bArr4, j6, (byte) ((-1) - (((-1) - ((int) (j2 >> 32))) | ((-1) - 255))));
            byte[] bArr5 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(bArr5, j7, (byte) (((int) (j2 >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            int i4 = (int) (j2 >> 16);
            UnsafeUtil.putByte(bArr6, j8, (byte) ((i4 + 255) - (i4 | 255)));
            byte[] bArr7 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            int i5 = (int) (j2 >> 8);
            UnsafeUtil.putByte(bArr7, j9, (byte) ((i5 + 255) - (i5 | 255)));
            byte[] bArr8 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr8, j10, (byte) (((int) j2) & 255));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void writeString(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 367
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryWriter.UnsafeHeapWriter.writeString(java.lang.String):void");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(bArr, j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            requireSpace(i3);
            this.pos -= (long) i3;
            System.arraycopy(bArr, i2, this.buffer, arrayPos() + 1, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            if (spaceLeft() < i3) {
                this.totalDoneBytes += i3;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i2, i3));
                nextBuffer();
            } else {
                this.pos -= (long) i3;
                System.arraycopy(bArr, i2, this.buffer, arrayPos() + 1, i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            requireSpace(iRemaining);
            this.pos -= (long) iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= (long) iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
            }
        }
    }

    private static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator bufferAllocator, int i2) {
            super(bufferAllocator, i2, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int i2) {
            nextBuffer(newDirectBuffer(i2));
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

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            requireSpace(10);
            writeVarint32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            requireSpace(15);
            writeInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            requireSpace(10);
            writeSInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            requireSpace(9);
            writeFixed32(i3);
            writeTag(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            requireSpace(15);
            writeVarint64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            requireSpace(15);
            writeSInt64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            requireSpace(13);
            writeFixed64(j2);
            writeTag(i2, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
            writeTag(i2, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
            writeTag(i2, 4);
            schema.writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            writeTag(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i2) {
            if (i2 >= 0) {
                writeVarint32(i2);
            } else {
                writeVarint64(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i2) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j2) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i2, int i3) {
            writeVarint32(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i2) {
            if ((-1) - (((-1) - i2) | ((-1) - (-128))) == 0) {
                writeVarint32OneByte(i2);
                return;
            }
            if (((-16384) & i2) == 0) {
                writeVarint32TwoBytes(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                writeVarint32ThreeBytes(i2);
            } else if (((-268435456) + i2) - ((-268435456) | i2) == 0) {
                writeVarint32FourBytes(i2);
            } else {
                writeVarint32FiveBytes(i2);
            }
        }

        private void writeVarint32OneByte(int i2) {
            ByteBuffer byteBuffer = this.buffer;
            int i3 = this.pos;
            this.pos = i3 - 1;
            byteBuffer.put(i3, (byte) i2);
        }

        private void writeVarint32TwoBytes(int i2) {
            int i3 = this.pos;
            this.pos = i3 - 2;
            this.buffer.putShort(i3 - 1, (short) ((i2 & 127) | 128 | (((-1) - (((-1) - i2) | ((-1) - 16256))) << 1)));
        }

        private void writeVarint32ThreeBytes(int i2) {
            int i3 = this.pos - 3;
            this.pos = i3;
            int i4 = (2080768 & i2) << 10;
            int i5 = i2 & 16256;
            int i6 = ((i5 + 16384) - (i5 & 16384)) << 9;
            this.buffer.putInt(i3, (-1) - (((-1) - ((((-1) - (((-1) - i2) | ((-1) - 127))) | 128) << 8)) & ((-1) - ((i4 + i6) - (i4 & i6)))));
        }

        private void writeVarint32FourBytes(int i2) {
            int i3 = this.pos;
            this.pos = i3 - 4;
            int i4 = (-1) - (((-1) - ((266338304 & i2) << 3)) & ((-1) - (((-1) - (((-1) - (2080768 & i2)) & ((-1) - 2097152))) << 2)));
            int i5 = (-1) - (((-1) - i2) | ((-1) - 16256));
            int i6 = i2 & 127;
            this.buffer.putInt(i3 - 3, (-1) - (((-1) - ((i6 + 128) - (i6 & 128))) & ((-1) - (i4 | (((i5 + 16384) - (i5 & 16384)) << 1)))));
        }

        private void writeVarint32FiveBytes(int i2) {
            ByteBuffer byteBuffer = this.buffer;
            int i3 = this.pos;
            this.pos = i3 - 1;
            byteBuffer.put(i3, (byte) (i2 >>> 28));
            int i4 = this.pos;
            this.pos = i4 - 4;
            int i5 = ((-1) - (((-1) - ((-1) - (((-1) - (i2 >>> 21)) | ((-1) - 127)))) & ((-1) - 128))) << 24;
            int i6 = (((-1) - (((-1) - (i2 >>> 14)) | ((-1) - 127))) | 128) << 16;
            int i7 = (i5 + i6) - (i5 & i6);
            int i8 = i2 >>> 7;
            int i9 = ((-1) - (((-1) - ((i8 + 127) - (i8 | 127))) & ((-1) - 128))) << 8;
            int i10 = (i2 + 127) - (i2 | 127);
            this.buffer.putInt(i4 - 3, (-1) - (((-1) - ((i10 + 128) - (i10 & 128))) & ((-1) - ((i7 + i9) - (i7 & i9)))));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j2) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j2)) {
                case 1:
                    writeVarint64OneByte(j2);
                    break;
                case 2:
                    writeVarint64TwoBytes(j2);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j2);
                    break;
                case 4:
                    writeVarint64FourBytes(j2);
                    break;
                case 5:
                    writeVarint64FiveBytes(j2);
                    break;
                case 6:
                    writeVarint64SixBytes(j2);
                    break;
                case 7:
                    writeVarint64SevenBytes(j2);
                    break;
                case 8:
                    writeVarint64EightBytes(j2);
                    break;
                case 9:
                    writeVarint64NineBytes(j2);
                    break;
                case 10:
                    writeVarint64TenBytes(j2);
                    break;
            }
        }

        private void writeVarint64OneByte(long j2) {
            writeVarint32OneByte((int) j2);
        }

        private void writeVarint64TwoBytes(long j2) {
            writeVarint32TwoBytes((int) j2);
        }

        private void writeVarint64ThreeBytes(long j2) {
            writeVarint32ThreeBytes((int) j2);
        }

        private void writeVarint64FourBytes(long j2) {
            writeVarint32FourBytes((int) j2);
        }

        private void writeVarint64FiveBytes(long j2) {
            int i2 = this.pos;
            this.pos = i2 - 5;
            long j3 = ((34091302912L & j2) << 28) | (((-1) - (((-1) - ((266338304 + j2) - (266338304 | j2))) & ((-1) - 268435456))) << 27);
            long j4 = (((2080768 + j2) - (2080768 | j2)) | 2097152) << 26;
            long j5 = (j3 + j4) - (j3 & j4);
            long j6 = ((-1) - (((-1) - ((16256 + j2) - (16256 | j2))) & ((-1) - Http2Stream.EMIT_BUFFER_SIZE))) << 25;
            long j7 = (j5 + j6) - (j5 & j6);
            long j8 = (j2 + 127) - (j2 | 127);
            long j9 = ((j8 + 128) - (j8 & 128)) << 24;
            this.buffer.putLong(i2 - 7, (j9 + j7) - (j9 & j7));
        }

        private void writeVarint64SixBytes(long j2) {
            int i2 = this.pos;
            this.pos = i2 - 6;
            long j3 = ((4363686772736L & j2) << 21) | (((34091302912L & j2) | 34359738368L) << 20);
            long j4 = ((-1) - (((-1) - ((266338304 + j2) - (266338304 | j2))) & ((-1) - 268435456))) << 19;
            long j5 = (j3 + j4) - (j3 & j4);
            long j6 = ((-1) - (((-1) - ((-1) - (((-1) - 2080768) | ((-1) - j2)))) & ((-1) - 2097152))) << 18;
            long j7 = (j5 + j6) - (j5 & j6);
            long j8 = ((-1) - (((-1) - ((-1) - (((-1) - 16256) | ((-1) - j2)))) & ((-1) - Http2Stream.EMIT_BUFFER_SIZE))) << 17;
            this.buffer.putLong(i2 - 7, (-1) - (((-1) - ((((-1) - (((-1) - j2) | ((-1) - 127))) | 128) << 16)) & ((-1) - ((j7 + j8) - (j7 & j8)))));
        }

        private void writeVarint64SevenBytes(long j2) {
            int i2 = this.pos - 7;
            this.pos = i2;
            long j3 = 266338304 & j2;
            long j4 = ((-1) - (((-1) - (((-1) - (((-1) - 558551906910208L) | ((-1) - j2))) << 14)) & ((-1) - (((-1) - (((-1) - (4363686772736L & j2)) & ((-1) - 4398046511104L))) << 13)))) | (((-1) - (((-1) - ((-1) - (((-1) - 34091302912L) | ((-1) - j2)))) & ((-1) - 34359738368L))) << 12) | (((j3 + 268435456) - (j3 & 268435456)) << 11);
            long j5 = 2080768 & j2;
            long j6 = ((j5 + 2097152) - (j5 & 2097152)) << 10;
            this.buffer.putLong(i2, (-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - j2) | ((-1) - 127)))) & ((-1) - 128))) << 8)) & ((-1) - (((j4 + j6) - (j4 & j6)) | ((((16256 + j2) - (16256 | j2)) | Http2Stream.EMIT_BUFFER_SIZE) << 9)))));
        }

        private void writeVarint64EightBytes(long j2) {
            int i2 = this.pos;
            this.pos = i2 - 8;
            long j3 = 4363686772736L & j2;
            long j4 = ((-1) - (((-1) - (((-1) - (((-1) - 71494644084506624L) | ((-1) - j2))) << 7)) & ((-1) - (((-1) - (((-1) - ((558551906910208L + j2) - (558551906910208L | j2))) & ((-1) - 562949953421312L))) << 6)))) | (((j3 + 4398046511104L) - (j3 & 4398046511104L)) << 5);
            long j5 = (34091302912L + j2) - (34091302912L | j2);
            long j6 = j4 | (((j5 + 34359738368L) - (j5 & 34359738368L)) << 4);
            long j7 = 266338304 & j2;
            long j8 = ((j7 + 268435456) - (j7 & 268435456)) << 3;
            long j9 = ((j6 + j8) - (j6 & j8)) | (((-1) - (((-1) - ((2080768 + j2) - (2080768 | j2))) & ((-1) - 2097152))) << 2);
            long j10 = (16256 + j2) - (16256 | j2);
            long j11 = ((j10 + Http2Stream.EMIT_BUFFER_SIZE) - (j10 & Http2Stream.EMIT_BUFFER_SIZE)) << 1;
            this.buffer.putLong(i2 - 7, (j2 & 127) | 128 | ((j9 + j11) - (j9 & j11)));
        }

        private void writeVarint64EightBytesWithSign(long j2) {
            int i2 = this.pos;
            this.pos = i2 - 8;
            long j3 = ((71494644084506624L & j2) | 72057594037927936L) << 7;
            long j4 = ((558551906910208L & j2) | 562949953421312L) << 6;
            long j5 = (-1) - (((-1) - 4363686772736L) | ((-1) - j2));
            long j6 = (-1) - (((-1) - 266338304) | ((-1) - j2));
            long j7 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (((j3 + j4) - (j3 & j4)) | (((j5 + 4398046511104L) - (j5 & 4398046511104L)) << 5))) & ((-1) - (((34091302912L & j2) | 34359738368L) << 4))))) & ((-1) - (((j6 + 268435456) - (j6 & 268435456)) << 3))))) & ((-1) - (((-1) - (((-1) - ((2080768 + j2) - (2080768 | j2))) & ((-1) - 2097152))) << 2)));
            long j8 = (((16256 + j2) - (16256 | j2)) | Http2Stream.EMIT_BUFFER_SIZE) << 1;
            this.buffer.putLong(i2 - 7, ((-1) - (((-1) - (j2 & 127)) & ((-1) - 128))) | ((j7 + j8) - (j7 & j8)));
        }

        private void writeVarint64NineBytes(long j2) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) (j2 >>> 56));
            writeVarint64EightBytesWithSign(j2 & 72057594037927935L);
        }

        private void writeVarint64TenBytes(long j2) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) (j2 >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i3 = this.pos;
            this.pos = i3 - 1;
            byteBuffer2.put(i3, (byte) ((-1) - (((-1) - ((j2 >>> 56) & 127)) & ((-1) - 128))));
            writeVarint64EightBytesWithSign((-1) - (((-1) - j2) | ((-1) - 72057594037927935L)));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i2) {
            int i3 = this.pos;
            this.pos = i3 - 4;
            this.buffer.putInt(i3 - 3, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j2) {
            int i2 = this.pos;
            this.pos = i2 - 8;
            this.buffer.putLong(i2 - 7, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeString(String str) {
            int i2;
            int i3;
            int i4;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 >= 128 || (i4 = this.pos) < 0) {
                    if (cCharAt2 < 2048 && (i3 = this.pos) > 0) {
                        ByteBuffer byteBuffer = this.buffer;
                        this.pos = i3 - 1;
                        int i5 = cCharAt2 & '?';
                        byteBuffer.put(i3, (byte) ((i5 + 128) - (i5 & 128)));
                        ByteBuffer byteBuffer2 = this.buffer;
                        int i6 = this.pos;
                        this.pos = i6 - 1;
                        byteBuffer2.put(i6, (byte) ((cCharAt2 >>> 6) | 960));
                    } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i2 = this.pos) > 1) {
                        ByteBuffer byteBuffer3 = this.buffer;
                        this.pos = i2 - 1;
                        byteBuffer3.put(i2, (byte) ((-1) - (((-1) - ('?' & cCharAt2)) & ((-1) - 128))));
                        ByteBuffer byteBuffer4 = this.buffer;
                        int i7 = this.pos;
                        this.pos = i7 - 1;
                        int i8 = cCharAt2 >>> 6;
                        byteBuffer4.put(i7, (byte) ((-1) - (((-1) - ((i8 + 63) - (i8 | 63))) & ((-1) - 128))));
                        ByteBuffer byteBuffer5 = this.buffer;
                        int i9 = this.pos;
                        this.pos = i9 - 1;
                        byteBuffer5.put(i9, (byte) ((cCharAt2 >>> '\f') | 480));
                    } else {
                        if (this.pos > 2) {
                            if (length != 0) {
                                char cCharAt3 = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                    length--;
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                    ByteBuffer byteBuffer6 = this.buffer;
                                    int i10 = this.pos;
                                    this.pos = i10 - 1;
                                    int i11 = codePoint & 63;
                                    byteBuffer6.put(i10, (byte) ((i11 + 128) - (i11 & 128)));
                                    ByteBuffer byteBuffer7 = this.buffer;
                                    int i12 = this.pos;
                                    this.pos = i12 - 1;
                                    int i13 = codePoint >>> 6;
                                    byteBuffer7.put(i12, (byte) (((i13 + 63) - (i13 | 63)) | 128));
                                    ByteBuffer byteBuffer8 = this.buffer;
                                    int i14 = this.pos;
                                    this.pos = i14 - 1;
                                    byteBuffer8.put(i14, (byte) (((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63))) | 128));
                                    ByteBuffer byteBuffer9 = this.buffer;
                                    int i15 = this.pos;
                                    this.pos = i15 - 1;
                                    int i16 = codePoint >>> 18;
                                    byteBuffer9.put(i15, (byte) ((i16 + 240) - (i16 & 240)));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                } else {
                    ByteBuffer byteBuffer10 = this.buffer;
                    this.pos = i4 - 1;
                    byteBuffer10.put(i4, (byte) cCharAt2);
                }
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) {
            ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
            if (spaceLeft() < i3) {
                nextBuffer(i3);
            }
            int i4 = this.pos - i3;
            this.pos = i4;
            this.buffer.position(i4 + 1);
            this.buffer.put(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
            if (spaceLeft() < i3) {
                this.totalDoneBytes += i3;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i2, i3));
                nextBuffer();
            } else {
                int i4 = this.pos - i3;
                this.pos = i4;
                this.buffer.position(i4 + 1);
                this.buffer.put(bArr, i2, i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i2 = this.pos - iRemaining;
            this.pos = i2;
            this.buffer.position(i2 + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i2 = this.pos - iRemaining;
                this.pos = i2;
                this.buffer.position(i2 + 1);
                this.buffer.put(byteBuffer);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
            }
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator bufferAllocator, int i2) {
            super(bufferAllocator, i2, null);
            nextBuffer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int i2) {
            nextBuffer(newDirectBuffer(i2));
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

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            requireSpace(10);
            writeVarint32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            requireSpace(15);
            writeInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            requireSpace(10);
            writeSInt32(i3);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            requireSpace(9);
            writeFixed32(i3);
            writeTag(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            requireSpace(15);
            writeVarint64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            requireSpace(15);
            writeSInt64(j2);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            requireSpace(13);
            writeFixed64(j2);
            writeTag(i2, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            requireSpace(6);
            write(z2 ? (byte) 1 : (byte) 0);
            writeTag(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
            writeTag(i2, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
            writeTag(i2, 4);
            schema.writeTo(obj, this);
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            writeTag(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            writeTag(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i2) {
            if (i2 >= 0) {
                writeVarint32(i2);
            } else {
                writeVarint64(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i2) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j2) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z2) {
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i2, int i3) {
            writeVarint32(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i2) {
            if ((i2 - 128) - ((-128) | i2) == 0) {
                writeVarint32OneByte(i2);
                return;
            }
            if ((i2 - 16384) - ((-16384) | i2) == 0) {
                writeVarint32TwoBytes(i2);
                return;
            }
            if ((-1) - (((-1) - (-2097152)) | ((-1) - i2)) == 0) {
                writeVarint32ThreeBytes(i2);
            } else if (((-268435456) + i2) - ((-268435456) | i2) == 0) {
                writeVarint32FourBytes(i2);
            } else {
                writeVarint32FiveBytes(i2);
            }
        }

        private void writeVarint32OneByte(int i2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) i2);
        }

        private void writeVarint32TwoBytes(int i2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (i2 >>> 7));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 127)))) & ((-1) - 128))));
        }

        private void writeVarint32ThreeBytes(int i2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (i2 >>> 14));
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i3 = i2 >>> 7;
            int i4 = (i3 + 127) - (i3 | 127);
            UnsafeUtil.putByte(j3, (byte) ((i4 + 128) - (i4 & 128)));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - (i2 & 127)) & ((-1) - 128))));
        }

        private void writeVarint32FourBytes(int i2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (i2 >>> 21));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (((i2 >>> 14) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i3 = i2 >>> 7;
            int i4 = (i3 + 127) - (i3 | 127);
            UnsafeUtil.putByte(j4, (byte) ((i4 + 128) - (i4 & 128)));
            long j5 = this.pos;
            this.pos = j5 - 1;
            int i5 = (-1) - (((-1) - i2) | ((-1) - 127));
            UnsafeUtil.putByte(j5, (byte) ((i5 + 128) - (i5 & 128)));
        }

        private void writeVarint32FiveBytes(int i2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) (i2 >>> 28));
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i3 = i2 >>> 21;
            int i4 = (i3 + 127) - (i3 | 127);
            UnsafeUtil.putByte(j3, (byte) ((i4 + 128) - (i4 & 128)));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i2 >>> 14)) | ((-1) - 127)))) & ((-1) - 128))));
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(j5, (byte) ((-1) - (((-1) - ((i2 >>> 7) & 127)) & ((-1) - 128))));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) (((i2 + 127) - (i2 | 127)) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j2) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j2)) {
                case 1:
                    writeVarint64OneByte(j2);
                    break;
                case 2:
                    writeVarint64TwoBytes(j2);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j2);
                    break;
                case 4:
                    writeVarint64FourBytes(j2);
                    break;
                case 5:
                    writeVarint64FiveBytes(j2);
                    break;
                case 6:
                    writeVarint64SixBytes(j2);
                    break;
                case 7:
                    writeVarint64SevenBytes(j2);
                    break;
                case 8:
                    writeVarint64EightBytes(j2);
                    break;
                case 9:
                    writeVarint64NineBytes(j2);
                    break;
                case 10:
                    writeVarint64TenBytes(j2);
                    break;
            }
        }

        private void writeVarint64OneByte(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) j2);
        }

        private void writeVarint64TwoBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 7));
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i2 = (int) j2;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - ((i2 + 127) - (i2 | 127))) & ((-1) - 128))));
        }

        private void writeVarint64ThreeBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (((int) j2) >>> 14));
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = (j2 >>> 7) & 127;
            UnsafeUtil.putByte(j4, (byte) ((j5 + 128) - (j5 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) ((-1) - (((-1) - (j2 & 127)) & ((-1) - 128))));
        }

        private void writeVarint64FourBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 21));
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = (-1) - (((-1) - (j2 >>> 14)) | ((-1) - 127));
            UnsafeUtil.putByte(j4, (byte) ((j5 + 128) - (j5 & 128)));
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = j2 >>> 7;
            long j8 = (j7 + 127) - (j7 | 127);
            UnsafeUtil.putByte(j6, (byte) ((j8 + 128) - (j8 & 128)));
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = (j2 + 127) - (j2 | 127);
            UnsafeUtil.putByte(j9, (byte) ((j10 + 128) - (j10 & 128)));
        }

        private void writeVarint64FiveBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 28));
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = j2 >>> 21;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - ((j5 + 127) - (j5 | 127))) & ((-1) - 128))));
            long j6 = this.pos;
            this.pos = j6 - 1;
            long j7 = j2 >>> 14;
            UnsafeUtil.putByte(j6, (byte) (((j7 + 127) - (j7 | 127)) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) (((j2 >>> 7) & 127) | 128));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((j2 + 127) - (j2 | 127)) | 128));
        }

        private void writeVarint64SixBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 35));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((-1) - (((-1) - (j2 >>> 28)) | ((-1) - 127))) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = (-1) - (((-1) - (j2 >>> 21)) | ((-1) - 127));
            UnsafeUtil.putByte(j5, (byte) ((j6 + 128) - (j6 & 128)));
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = j2 >>> 14;
            long j9 = (j8 + 127) - (j8 | 127);
            UnsafeUtil.putByte(j7, (byte) ((j9 + 128) - (j9 & 128)));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = j2 >>> 7;
            UnsafeUtil.putByte(j10, (byte) ((-1) - (((-1) - ((j11 + 127) - (j11 | 127))) & ((-1) - 128))));
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = (j2 + 127) - (j2 | 127);
            UnsafeUtil.putByte(j12, (byte) ((j13 + 128) - (j13 & 128)));
        }

        private void writeVarint64SevenBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 42));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((-1) - (((-1) - (j2 >>> 35)) | ((-1) - 127))) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = (-1) - (((-1) - (j2 >>> 28)) | ((-1) - 127));
            UnsafeUtil.putByte(j5, (byte) ((j6 + 128) - (j6 & 128)));
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = j2 >>> 21;
            UnsafeUtil.putByte(j7, (byte) ((-1) - (((-1) - ((j8 + 127) - (j8 | 127))) & ((-1) - 128))));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((-1) - (((-1) - (j2 >>> 14)) | ((-1) - 127))) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = j2 >>> 7;
            UnsafeUtil.putByte(j10, (byte) ((-1) - (((-1) - ((j11 + 127) - (j11 | 127))) & ((-1) - 128))));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((-1) - (((-1) - ((j2 + 127) - (j2 | 127))) & ((-1) - 128))));
        }

        private void writeVarint64EightBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 49));
            long j4 = this.pos;
            this.pos = j4 - 1;
            long j5 = j2 >>> 42;
            UnsafeUtil.putByte(j4, (byte) (((j5 + 127) - (j5 | 127)) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            UnsafeUtil.putByte(j6, (byte) (((-1) - (((-1) - (j2 >>> 35)) | ((-1) - 127))) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(j7, (byte) ((-1) - (((-1) - ((j2 >>> 28) & 127)) & ((-1) - 128))));
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) ((-1) - (((-1) - ((j2 >>> 21) & 127)) & ((-1) - 128))));
            long j9 = this.pos;
            this.pos = j9 - 1;
            long j10 = (j2 >>> 14) & 127;
            UnsafeUtil.putByte(j9, (byte) ((j10 + 128) - (j10 & 128)));
            long j11 = this.pos;
            this.pos = j11 - 1;
            long j12 = j2 >>> 7;
            long j13 = (j12 + 127) - (j12 | 127);
            UnsafeUtil.putByte(j11, (byte) ((j13 + 128) - (j13 & 128)));
            long j14 = this.pos;
            this.pos = j14 - 1;
            long j15 = (-1) - (((-1) - j2) | ((-1) - 127));
            UnsafeUtil.putByte(j14, (byte) ((j15 + 128) - (j15 & 128)));
        }

        private void writeVarint64NineBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 56));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (j2 >>> 49)) | ((-1) - 127)))) & ((-1) - 128))));
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = j2 >>> 42;
            UnsafeUtil.putByte(j5, (byte) ((-1) - (((-1) - ((j6 + 127) - (j6 | 127))) & ((-1) - 128))));
            long j7 = this.pos;
            this.pos = j7 - 1;
            UnsafeUtil.putByte(j7, (byte) (((-1) - (((-1) - (j2 >>> 35)) | ((-1) - 127))) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            long j9 = j2 >>> 28;
            UnsafeUtil.putByte(j8, (byte) (((j9 + 127) - (j9 | 127)) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = j2 >>> 21;
            UnsafeUtil.putByte(j10, (byte) (((j11 + 127) - (j11 | 127)) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = j2 >>> 14;
            UnsafeUtil.putByte(j12, (byte) ((-1) - (((-1) - ((j13 + 127) - (j13 | 127))) & ((-1) - 128))));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((-1) - (((-1) - (j2 >>> 7)) | ((-1) - 127))) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            long j16 = (-1) - (((-1) - j2) | ((-1) - 127));
            UnsafeUtil.putByte(j15, (byte) ((j16 + 128) - (j16 & 128)));
        }

        private void writeVarint64TenBytes(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) (j2 >>> 63));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((j2 >>> 56) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            long j6 = j2 >>> 49;
            UnsafeUtil.putByte(j5, (byte) (((j6 + 127) - (j6 | 127)) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            long j8 = j2 >>> 42;
            UnsafeUtil.putByte(j7, (byte) ((-1) - (((-1) - ((j8 + 127) - (j8 | 127))) & ((-1) - 128))));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((j2 >>> 35) & 127) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            long j11 = (j2 >>> 28) & 127;
            UnsafeUtil.putByte(j10, (byte) ((j11 + 128) - (j11 & 128)));
            long j12 = this.pos;
            this.pos = j12 - 1;
            long j13 = (-1) - (((-1) - (j2 >>> 21)) | ((-1) - 127));
            UnsafeUtil.putByte(j12, (byte) ((j13 + 128) - (j13 & 128)));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((-1) - (((-1) - ((j2 >>> 14) & 127)) & ((-1) - 128))));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j2 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((-1) - (((-1) - j2) | ((-1) - 127))) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))));
            long j3 = this.pos;
            this.pos = j3 - 1;
            UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))));
            long j4 = this.pos;
            this.pos = j4 - 1;
            int i3 = i2 >> 8;
            UnsafeUtil.putByte(j4, (byte) ((i3 + 255) - (i3 | 255)));
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(j5, (byte) (i2 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j2) {
            long j3 = this.pos;
            this.pos = j3 - 1;
            int i2 = (int) (j2 >> 56);
            UnsafeUtil.putByte(j3, (byte) ((i2 + 255) - (i2 | 255)));
            long j4 = this.pos;
            this.pos = j4 - 1;
            UnsafeUtil.putByte(j4, (byte) (((int) (j2 >> 48)) & 255));
            long j5 = this.pos;
            this.pos = j5 - 1;
            UnsafeUtil.putByte(j5, (byte) (((int) (j2 >> 40)) & 255));
            long j6 = this.pos;
            this.pos = j6 - 1;
            int i3 = (int) (j2 >> 32);
            UnsafeUtil.putByte(j6, (byte) ((i3 + 255) - (i3 | 255)));
            long j7 = this.pos;
            this.pos = j7 - 1;
            int i4 = (int) (j2 >> 24);
            UnsafeUtil.putByte(j7, (byte) ((i4 + 255) - (i4 | 255)));
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) ((-1) - (((-1) - ((int) (j2 >> 16))) | ((-1) - 255))));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) ((-1) - (((-1) - ((int) (j2 >> 8))) | ((-1) - 255))));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) ((-1) - (((-1) - ((int) j2)) | ((-1) - 255))));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void writeString(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryWriter.UnsafeDirectWriter.writeString(java.lang.String):void");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            UnsafeUtil.putByte(j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
            if (spaceLeft() < i3) {
                nextBuffer(i3);
            }
            this.pos -= (long) i3;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
            if (spaceLeft() < i3) {
                this.totalDoneBytes += i3;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i2, i3));
                nextBuffer();
            } else {
                this.pos -= (long) i3;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(bArr, i2, i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.pos -= (long) iRemaining;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= (long) iRemaining;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
            }
        }
    }
}
