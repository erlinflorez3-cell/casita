package org.msgpack.value;

import java.math.BigInteger;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.value.impl.ImmutableArrayValueImpl;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;
import org.msgpack.value.impl.ImmutableBinaryValueImpl;
import org.msgpack.value.impl.ImmutableBooleanValueImpl;
import org.msgpack.value.impl.ImmutableDoubleValueImpl;
import org.msgpack.value.impl.ImmutableExtensionValueImpl;
import org.msgpack.value.impl.ImmutableLongValueImpl;
import org.msgpack.value.impl.ImmutableMapValueImpl;
import org.msgpack.value.impl.ImmutableNilValueImpl;
import org.msgpack.value.impl.ImmutableStringValueImpl;
import org.msgpack.value.impl.ImmutableTimestampValueImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueFactory {

    public static class MapBuilder {
        private final Map<Value, Value> map = new LinkedHashMap();

        public MapValue build() {
            return ValueFactory.newMap(this.map);
        }

        public MapBuilder put(Map.Entry<? extends Value, ? extends Value> entry) {
            put(entry.getKey(), entry.getValue());
            return this;
        }

        public MapBuilder put(Value value, Value value2) {
            this.map.put(value, value2);
            return this;
        }

        public MapBuilder putAll(Iterable<? extends Map.Entry<? extends Value, ? extends Value>> iterable) {
            for (Map.Entry<? extends Value, ? extends Value> entry : iterable) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public MapBuilder putAll(Map<? extends Value, ? extends Value> map) {
            Iterator<Map.Entry<? extends Value, ? extends Value>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }
    }

    private ValueFactory() {
    }

    public static ImmutableArrayValue emptyArray() {
        return ImmutableArrayValueImpl.empty();
    }

    public static ImmutableMapValue emptyMap() {
        return ImmutableMapValueImpl.empty();
    }

    public static ImmutableArrayValue newArray(List<? extends Value> list) {
        return list.isEmpty() ? ImmutableArrayValueImpl.empty() : new ImmutableArrayValueImpl((Value[]) list.toArray(new Value[list.size()]));
    }

    public static ImmutableArrayValue newArray(Value... valueArr) {
        return valueArr.length == 0 ? ImmutableArrayValueImpl.empty() : new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableArrayValue newArray(Value[] valueArr, boolean z2) {
        return valueArr.length == 0 ? ImmutableArrayValueImpl.empty() : z2 ? new ImmutableArrayValueImpl(valueArr) : new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr) {
        return newBinary(bArr, false);
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i2, int i3) {
        return newBinary(bArr, i2, i3, false);
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i2, int i3, boolean z2) {
        return (z2 && i2 == 0 && i3 == bArr.length) ? new ImmutableBinaryValueImpl(bArr) : new ImmutableBinaryValueImpl(Arrays.copyOfRange(bArr, i2, i3));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, boolean z2) {
        return z2 ? new ImmutableBinaryValueImpl(bArr) : new ImmutableBinaryValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableBooleanValue newBoolean(boolean z2) {
        return z2 ? ImmutableBooleanValueImpl.TRUE : ImmutableBooleanValueImpl.FALSE;
    }

    public static ImmutableExtensionValue newExtension(byte b2, byte[] bArr) {
        return new ImmutableExtensionValueImpl(b2, bArr);
    }

    public static ImmutableFloatValue newFloat(double d2) {
        return new ImmutableDoubleValueImpl(d2);
    }

    public static ImmutableFloatValue newFloat(float f2) {
        return new ImmutableDoubleValueImpl(f2);
    }

    public static ImmutableIntegerValue newInteger(byte b2) {
        return new ImmutableLongValueImpl(b2);
    }

    public static ImmutableIntegerValue newInteger(int i2) {
        return new ImmutableLongValueImpl(i2);
    }

    public static ImmutableIntegerValue newInteger(long j2) {
        return new ImmutableLongValueImpl(j2);
    }

    public static ImmutableIntegerValue newInteger(BigInteger bigInteger) {
        return new ImmutableBigIntegerValueImpl(bigInteger);
    }

    public static ImmutableIntegerValue newInteger(short s2) {
        return new ImmutableLongValueImpl(s2);
    }

    public static <K extends Value, V extends Value> ImmutableMapValue newMap(Map<K, V> map) {
        Value[] valueArr = new Value[map.size() * 2];
        int i2 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            valueArr[i2] = entry.getKey();
            valueArr[i2 + 1] = entry.getValue();
            i2 += 2;
        }
        return new ImmutableMapValueImpl(valueArr);
    }

    public static ImmutableMapValue newMap(Value... valueArr) {
        return valueArr.length == 0 ? ImmutableMapValueImpl.empty() : new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableMapValue newMap(Value[] valueArr, boolean z2) {
        return valueArr.length == 0 ? ImmutableMapValueImpl.empty() : z2 ? new ImmutableMapValueImpl(valueArr) : new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    @SafeVarargs
    public static MapValue newMap(Map.Entry<? extends Value, ? extends Value>... entryArr) {
        Value[] valueArr = new Value[entryArr.length * 2];
        for (int i2 = 0; i2 < entryArr.length; i2++) {
            int i3 = i2 * 2;
            valueArr[i3] = entryArr[i2].getKey();
            valueArr[i3 + 1] = entryArr[i2].getValue();
        }
        return newMap(valueArr, true);
    }

    public static MapBuilder newMapBuilder() {
        return new MapBuilder();
    }

    public static Map.Entry<Value, Value> newMapEntry(Value value, Value value2) {
        return new AbstractMap.SimpleEntry(value, value2);
    }

    public static ImmutableNilValue newNil() {
        return ImmutableNilValueImpl.get();
    }

    public static ImmutableStringValue newString(String str) {
        return new ImmutableStringValueImpl(str);
    }

    public static ImmutableStringValue newString(byte[] bArr) {
        return new ImmutableStringValueImpl(bArr);
    }

    public static ImmutableStringValue newString(byte[] bArr, int i2, int i3) {
        return newString(bArr, i2, i3, false);
    }

    public static ImmutableStringValue newString(byte[] bArr, int i2, int i3, boolean z2) {
        return (z2 && i2 == 0 && i3 == bArr.length) ? new ImmutableStringValueImpl(bArr) : new ImmutableStringValueImpl(Arrays.copyOfRange(bArr, i2, i3));
    }

    public static ImmutableStringValue newString(byte[] bArr, boolean z2) {
        return z2 ? new ImmutableStringValueImpl(bArr) : new ImmutableStringValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableTimestampValue newTimestamp(long j2) {
        return newTimestamp(Instant.ofEpochMilli(j2));
    }

    public static ImmutableTimestampValue newTimestamp(long j2, int i2) {
        return newTimestamp(Instant.ofEpochSecond(j2, i2));
    }

    public static ImmutableTimestampValue newTimestamp(Instant instant) {
        return new ImmutableTimestampValueImpl(instant);
    }
}
