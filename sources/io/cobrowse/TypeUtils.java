package io.cobrowse;

/* JADX INFO: loaded from: classes3.dex */
final class TypeUtils {
    TypeUtils() {
    }

    static double check(Object obj, double d2) {
        Double d3 = (Double) check(obj, Double.class, null);
        return d3 != null ? d3.doubleValue() : d2;
    }

    static float check(Object obj, float f2) {
        Float f3 = (Float) check(obj, Float.class, null);
        return f3 != null ? f3.floatValue() : f2;
    }

    static int check(Object obj, int i2) {
        Integer num = (Integer) check(obj, Integer.class, null);
        return num != null ? num.intValue() : i2;
    }

    static long check(Object obj, long j2) {
        Long l2 = (Long) check(obj, Long.class, null);
        return l2 != null ? l2.longValue() : j2;
    }

    static <T> T check(Object obj, Class<T> cls) {
        return (T) check(obj, cls, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> T check(Object obj, Class<T> cls, T t2) {
        if (obj == 0) {
            return t2;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        Object objCheckDouble = (cls.equals(Double.class) || cls.equals(Double.TYPE)) ? checkDouble(obj) : null;
        if (cls.equals(Float.class) || cls.equals(Float.TYPE)) {
            objCheckDouble = checkFloat(obj);
        }
        if (cls.equals(Long.class) || cls.equals(Long.TYPE)) {
            objCheckDouble = checkLong(obj);
        }
        if (cls.equals(Integer.class) || cls.equals(Integer.TYPE)) {
            objCheckDouble = (T) checkInteger(obj);
        }
        return objCheckDouble != null ? (T) objCheckDouble : t2;
    }

    private static Double checkDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        return null;
    }

    private static Float checkFloat(Object obj) {
        if (obj instanceof Double) {
            return Float.valueOf(((Double) obj).floatValue());
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return null;
    }

    private static Integer checkInteger(Object obj) {
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    private static Long checkLong(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        return null;
    }

    static <T> T checkNonNull(Object obj, Class<T> cls) throws SerializationError {
        T t2 = (T) check(obj, cls, null);
        if (t2 != null) {
            return t2;
        }
        throw new SerializationError("Value required");
    }
}
