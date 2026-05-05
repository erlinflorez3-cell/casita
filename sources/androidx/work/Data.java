package androidx.work;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Data {
    public static final int MAX_DATA_BYTES = 10240;
    Map<String, Object> mValues;
    private static final String TAG = Logger.tagWithPrefix("Data");
    public static final Data EMPTY = new Builder().build();

    Data() {
    }

    public Data(Data other) {
        this.mValues = new HashMap(other.mValues);
    }

    public Data(Map<String, ?> values) {
        this.mValues = new HashMap(values);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    public boolean[] getBooleanArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof Boolean[]) {
            return convertToPrimitiveArray((Boolean[]) obj);
        }
        return null;
    }

    public byte getByte(String key, byte defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : defaultValue;
    }

    public byte[] getByteArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof Byte[]) {
            return convertToPrimitiveArray((Byte[]) obj);
        }
        return null;
    }

    public int getInt(String key, int defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Integer ? ((Integer) obj).intValue() : defaultValue;
    }

    public int[] getIntArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof Integer[]) {
            return convertToPrimitiveArray((Integer[]) obj);
        }
        return null;
    }

    public long getLong(String key, long defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Long ? ((Long) obj).longValue() : defaultValue;
    }

    public long[] getLongArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof Long[]) {
            return convertToPrimitiveArray((Long[]) obj);
        }
        return null;
    }

    public float getFloat(String key, float defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Float ? ((Float) obj).floatValue() : defaultValue;
    }

    public float[] getFloatArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof Float[]) {
            return convertToPrimitiveArray((Float[]) obj);
        }
        return null;
    }

    public double getDouble(String key, double defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Double ? ((Double) obj).doubleValue() : defaultValue;
    }

    public double[] getDoubleArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof Double[]) {
            return convertToPrimitiveArray((Double[]) obj);
        }
        return null;
    }

    public String getString(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public String[] getStringArray(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.mValues);
    }

    public byte[] toByteArray() {
        return toByteArrayInternal(this);
    }

    public <T> boolean hasKeyWithValueOfType(String key, Class<T> klass) {
        Object obj = this.mValues.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int size() {
        return this.mValues.size();
    }

    public static byte[] toByteArrayInternal(Data data) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.size());
                    for (Map.Entry<String, Object> entry : data.mValues.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e2) {
                        String str = TAG;
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        String str2 = TAG;
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e4) {
                    objectOutputStream = objectOutputStream2;
                    String str3 = TAG;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e5) {
                            String str4 = TAG;
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        String str5 = TAG;
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e7) {
                            String str6 = TAG;
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e8) {
                        String str7 = TAG;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004e -> B:29:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.Data fromByteArray(byte[] r5) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r5.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L6b
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r5)
            r4 = 0
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch: java.io.IOException -> L3a java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L58
            r5.<init>(r2)     // Catch: java.io.IOException -> L3a java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L58
            int r4 = r5.readInt()     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L56
        L1b:
            if (r4 <= 0) goto L2b
            java.lang.String r1 = r5.readUTF()     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L56
            java.lang.Object r0 = r5.readObject()     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L56
            r3.put(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L56
            int r4 = r4 + (-1)
            goto L1b
        L2b:
            r5.close()     // Catch: java.io.IOException -> L2f
            goto L32
        L2f:
            r0 = move-exception
            java.lang.String r0 = androidx.work.Data.TAG
        L32:
            r2.close()     // Catch: java.io.IOException -> L4d
            goto L50
        L36:
            r0 = move-exception
            goto L3e
        L38:
            r0 = move-exception
            goto L3e
        L3a:
            r0 = move-exception
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            r5 = r4
        L3e:
            java.lang.String r0 = androidx.work.Data.TAG     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L46
            goto L49
        L46:
            r0 = move-exception
            java.lang.String r0 = androidx.work.Data.TAG
        L49:
            r2.close()     // Catch: java.io.IOException -> L4d
            goto L50
        L4d:
            r0 = move-exception
            java.lang.String r0 = androidx.work.Data.TAG
        L50:
            androidx.work.Data r0 = new androidx.work.Data
            r0.<init>(r3)
            return r0
        L56:
            r1 = move-exception
            goto L5a
        L58:
            r1 = move-exception
            r5 = r4
        L5a:
            if (r5 == 0) goto L63
            r5.close()     // Catch: java.io.IOException -> L60
            goto L63
        L60:
            r0 = move-exception
            java.lang.String r0 = androidx.work.Data.TAG
        L63:
            r2.close()     // Catch: java.io.IOException -> L67
            goto L6a
        L67:
            r0 = move-exception
            java.lang.String r0 = androidx.work.Data.TAG
        L6a:
            throw r1
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.fromByteArray(byte[]):androidx.work.Data");
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        Data data = (Data) o2;
        Set<String> setKeySet = this.mValues.keySet();
        if (!setKeySet.equals(data.mValues.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.mValues.get(str);
            Object obj2 = data.mValues.get(str);
            if (!((obj == null || obj2 == null) ? obj == obj2 : ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : obj.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.mValues.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.mValues.isEmpty()) {
            for (String str : this.mValues.keySet()) {
                sb.append(str).append(" : ");
                Object obj = this.mValues.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static Boolean[] convertPrimitiveBooleanArray(boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i2 = 0; i2 < value.length; i2++) {
            boolArr[i2] = Boolean.valueOf(value[i2]);
        }
        return boolArr;
    }

    public static Byte[] convertPrimitiveByteArray(byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i2 = 0; i2 < value.length; i2++) {
            bArr[i2] = Byte.valueOf(value[i2]);
        }
        return bArr;
    }

    public static Integer[] convertPrimitiveIntArray(int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i2 = 0; i2 < value.length; i2++) {
            numArr[i2] = Integer.valueOf(value[i2]);
        }
        return numArr;
    }

    public static Long[] convertPrimitiveLongArray(long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i2 = 0; i2 < value.length; i2++) {
            lArr[i2] = Long.valueOf(value[i2]);
        }
        return lArr;
    }

    public static Float[] convertPrimitiveFloatArray(float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i2 = 0; i2 < value.length; i2++) {
            fArr[i2] = Float.valueOf(value[i2]);
        }
        return fArr;
    }

    public static Double[] convertPrimitiveDoubleArray(double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i2 = 0; i2 < value.length; i2++) {
            dArr[i2] = Double.valueOf(value[i2]);
        }
        return dArr;
    }

    public static boolean[] convertToPrimitiveArray(Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            zArr[i2] = array[i2].booleanValue();
        }
        return zArr;
    }

    public static byte[] convertToPrimitiveArray(Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            bArr[i2] = array[i2].byteValue();
        }
        return bArr;
    }

    public static int[] convertToPrimitiveArray(Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            iArr[i2] = array[i2].intValue();
        }
        return iArr;
    }

    public static long[] convertToPrimitiveArray(Long[] array) {
        long[] jArr = new long[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            jArr[i2] = array[i2].longValue();
        }
        return jArr;
    }

    public static float[] convertToPrimitiveArray(Float[] array) {
        float[] fArr = new float[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            fArr[i2] = array[i2].floatValue();
        }
        return fArr;
    }

    public static double[] convertToPrimitiveArray(Double[] array) {
        double[] dArr = new double[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            dArr[i2] = array[i2].doubleValue();
        }
        return dArr;
    }

    public static final class Builder {
        private Map<String, Object> mValues = new HashMap();

        public Builder putBoolean(String key, boolean value) {
            this.mValues.put(key, Boolean.valueOf(value));
            return this;
        }

        public Builder putBooleanArray(String key, boolean[] value) {
            this.mValues.put(key, Data.convertPrimitiveBooleanArray(value));
            return this;
        }

        public Builder putByte(String key, byte value) {
            this.mValues.put(key, Byte.valueOf(value));
            return this;
        }

        public Builder putByteArray(String key, byte[] value) {
            this.mValues.put(key, Data.convertPrimitiveByteArray(value));
            return this;
        }

        public Builder putInt(String key, int value) {
            this.mValues.put(key, Integer.valueOf(value));
            return this;
        }

        public Builder putIntArray(String key, int[] value) {
            this.mValues.put(key, Data.convertPrimitiveIntArray(value));
            return this;
        }

        public Builder putLong(String key, long value) {
            this.mValues.put(key, Long.valueOf(value));
            return this;
        }

        public Builder putLongArray(String key, long[] value) {
            this.mValues.put(key, Data.convertPrimitiveLongArray(value));
            return this;
        }

        public Builder putFloat(String key, float value) {
            this.mValues.put(key, Float.valueOf(value));
            return this;
        }

        public Builder putFloatArray(String key, float[] value) {
            this.mValues.put(key, Data.convertPrimitiveFloatArray(value));
            return this;
        }

        public Builder putDouble(String key, double value) {
            this.mValues.put(key, Double.valueOf(value));
            return this;
        }

        public Builder putDoubleArray(String key, double[] value) {
            this.mValues.put(key, Data.convertPrimitiveDoubleArray(value));
            return this;
        }

        public Builder putString(String key, String value) {
            this.mValues.put(key, value);
            return this;
        }

        public Builder putStringArray(String key, String[] value) {
            this.mValues.put(key, value);
            return this;
        }

        public Builder putAll(Data data) {
            putAll(data.mValues);
            return this;
        }

        public Builder putAll(Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder put(String key, Object value) {
            if (value == null) {
                this.mValues.put(key, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.mValues.put(key, value);
                } else if (cls == boolean[].class) {
                    this.mValues.put(key, Data.convertPrimitiveBooleanArray((boolean[]) value));
                } else if (cls == byte[].class) {
                    this.mValues.put(key, Data.convertPrimitiveByteArray((byte[]) value));
                } else if (cls == int[].class) {
                    this.mValues.put(key, Data.convertPrimitiveIntArray((int[]) value));
                } else if (cls == long[].class) {
                    this.mValues.put(key, Data.convertPrimitiveLongArray((long[]) value));
                } else if (cls == float[].class) {
                    this.mValues.put(key, Data.convertPrimitiveFloatArray((float[]) value));
                } else if (cls == double[].class) {
                    this.mValues.put(key, Data.convertPrimitiveDoubleArray((double[]) value));
                } else {
                    throw new IllegalArgumentException("Key " + key + "has invalid type " + cls);
                }
            }
            return this;
        }

        public Data build() throws Throwable {
            Data data = new Data((Map<String, ?>) this.mValues);
            Data.toByteArrayInternal(data);
            return data;
        }
    }
}
