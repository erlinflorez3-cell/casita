package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class ht<T> {
    private final Class[] Code;
    private final Class<?> I;
    private final String V;

    ht(Class<?> cls, String str, Class... clsArr) {
        this.I = cls;
        this.V = str;
        this.Code = clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    private Object Code(T t2, Object... objArr) throws InvocationTargetException {
        Object objZ = Z(t2.getClass());
        if (objZ == 0) {
            throw new AssertionError(new StringBuilder("Method ").append(this.V).append(" not supported for object ").append(t2).toString());
        }
        try {
            objZ = objZ.invoke(t2, objArr);
            return objZ;
        } catch (IllegalAccessException e2) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(objZ)));
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    private static Method Code(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private Object V(T t2, Object... objArr) throws InvocationTargetException {
        Method methodZ = Z(t2.getClass());
        Object objInvoke = null;
        if (methodZ == null) {
            return null;
        }
        try {
            objInvoke = methodZ.invoke(t2, objArr);
            return objInvoke;
        } catch (IllegalAccessException unused) {
            return objInvoke;
        }
    }

    private Method Z(Class<?> cls) {
        Class<?> cls2;
        String str = this.V;
        if (str == null) {
            return null;
        }
        Method methodCode = Code(cls, str, this.Code);
        if (methodCode == null || (cls2 = this.I) == null || cls2.isAssignableFrom(methodCode.getReturnType())) {
            return methodCode;
        }
        return null;
    }

    public final Object B(T t2, Object... objArr) {
        try {
            return V(t2, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object I(T t2, Object... objArr) {
        try {
            return Code(t2, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean V(T t2) {
        return Z(t2.getClass()) != null;
    }
}
