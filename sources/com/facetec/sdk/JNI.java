package com.facetec.sdk;

import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class JNI {
    private static final Map<Object, String> Code;

    @Retention(RetentionPolicy.RUNTIME)
    @interface B {
        long V();
    }

    static {
        HashMap map = new HashMap();
        Code = map;
        map.put(Boolean.TYPE, "Z");
        map.put(Byte.TYPE, "B");
        map.put(Character.TYPE, "C");
        map.put(Double.TYPE, "D");
        map.put(Float.TYPE, "F");
        map.put(Integer.TYPE, "I");
        map.put(Long.TYPE, "J");
        map.put(Short.TYPE, ExifInterface.LATITUDE_SOUTH);
        map.put(Void.TYPE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
    }

    JNI() {
    }

    static void Code(long j2, Method method) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(I(cls));
        }
        sb.append(')').append(I(method.getReturnType()));
        registerNativeMethod(j2, method.getName(), sb.toString());
    }

    private static String I(Class<?> cls) {
        if (cls.isArray()) {
            return new StringBuilder("[").append(I(cls.getComponentType())).toString();
        }
        return cls.isPrimitive() ? Code.get(cls) : new StringBuilder("L").append(cls.getName().replace('.', '/')).append(';').toString();
    }

    static native void finalizeNativeMethods(Class<ai> cls, Class<cf> cls2);

    private static native void registerNativeMethod(long j2, String str, String str2);
}
