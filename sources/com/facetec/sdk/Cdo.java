package com.facetec.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.facetec.sdk.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cdo {
    public static Cdo B() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new Cdo() { // from class: com.facetec.sdk.do.3
                @Override // com.facetec.sdk.Cdo
                public final <T> T I(Class<T> cls2) throws Exception {
                    B(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new Cdo() { // from class: com.facetec.sdk.do.1
                        @Override // com.facetec.sdk.Cdo
                        public final <T> T I(Class<T> cls2) throws Exception {
                            B(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(iIntValue));
                        }
                    };
                } catch (Exception unused2) {
                    return new Cdo() { // from class: com.facetec.sdk.do.5
                        @Override // com.facetec.sdk.Cdo
                        public final <T> T I(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls2)));
                        }
                    };
                }
            } catch (Exception unused3) {
                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new Cdo() { // from class: com.facetec.sdk.do.2
                    @Override // com.facetec.sdk.Cdo
                    public final <T> T I(Class<T> cls2) throws Exception {
                        B(cls2);
                        return (T) declaredMethod3.invoke(null, cls2, Object.class);
                    }
                };
            }
        }
    }

    static void B(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(new StringBuilder("Interface can't be instantiated! Interface name: ").append(cls.getName()).toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(new StringBuilder("Abstract class can't be instantiated! Class name: ").append(cls.getName()).toString());
        }
    }

    public abstract <T> T I(Class<T> cls) throws Exception;
}
