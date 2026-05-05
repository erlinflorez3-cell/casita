package org.msgpack.core.buffer;

import io.sentry.SentryLockReason;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes2.dex */
class DirectBufferAccess {
    static Constructor<?> byteBufferConstructor = null;
    static DirectBufferConstructorType directBufferConstructorType = null;
    static Class<?> directByteBufferClass = null;
    static Method mClean = null;
    static Method mCleaner = null;
    static Method mGetAddress = null;
    static Method mInvokeCleaner = null;
    static Method memoryBlockWrapFromJni = null;

    /* JADX INFO: renamed from: org.msgpack.core.buffer.DirectBufferAccess$1 */
    static class AnonymousClass1 implements PrivilegedAction<Object> {
        final /* synthetic */ ByteBuffer val$direct;

        AnonymousClass1(ByteBuffer byteBuffer) {
            byteBuffer = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return DirectBufferAccess.getCleanerMethod(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: org.msgpack.core.buffer.DirectBufferAccess$2 */
    static class AnonymousClass2 implements PrivilegedAction<Object> {
        final /* synthetic */ ByteBuffer val$direct;

        AnonymousClass2(ByteBuffer byteBuffer) {
            byteBuffer = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return DirectBufferAccess.getCleanMethod(byteBuffer, DirectBufferAccess.mCleaner);
        }
    }

    /* JADX INFO: renamed from: org.msgpack.core.buffer.DirectBufferAccess$3 */
    static class AnonymousClass3 implements PrivilegedAction<Object> {
        final /* synthetic */ ByteBuffer val$direct;

        AnonymousClass3(ByteBuffer byteBuffer) {
            byteBuffer = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return DirectBufferAccess.getInvokeCleanerMethod(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: org.msgpack.core.buffer.DirectBufferAccess$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;

        static {
            int[] iArr = new int[DirectBufferConstructorType.values().length];
            $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = iArr;
            try {
                iArr[DirectBufferConstructorType.ARGS_LONG_INT_REF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_LONG_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_INT_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_MB_INT_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        Constructor<?> declaredConstructor;
        DirectBufferConstructorType directBufferConstructorType2;
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
            Class<?> cls = byteBufferAllocateDirect.getClass();
            directByteBufferClass = cls;
            Method declaredMethod = null;
            try {
                try {
                    try {
                        declaredConstructor = cls.getDeclaredConstructor(Long.TYPE, Integer.TYPE, Object.class);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT_REF;
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = directByteBufferClass.getDeclaredConstructor(Integer.TYPE, Integer.TYPE);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_INT_INT;
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = directByteBufferClass.getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                    directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT;
                }
            } catch (NoSuchMethodException unused3) {
                Class<?> cls2 = Class.forName("java.nio.MemoryBlock");
                declaredMethod = cls2.getDeclaredMethod("wrapFromJni", Integer.TYPE, Long.TYPE);
                declaredMethod.setAccessible(true);
                declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls2, Integer.TYPE, Integer.TYPE);
                directBufferConstructorType2 = DirectBufferConstructorType.ARGS_MB_INT_INT;
            }
            byteBufferConstructor = declaredConstructor;
            directBufferConstructorType = directBufferConstructorType2;
            memoryBlockWrapFromJni = declaredMethod;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            declaredConstructor.setAccessible(true);
            Method declaredMethod2 = directByteBufferClass.getDeclaredMethod(SentryLockReason.JsonKeys.ADDRESS, new Class[0]);
            mGetAddress = declaredMethod2;
            declaredMethod2.setAccessible(true);
            if (MessageBuffer.javaVersion <= 8) {
                setupCleanerJava6(byteBufferAllocateDirect);
            } else {
                setupCleanerJava9(byteBufferAllocateDirect);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private DirectBufferAccess() {
    }

    static void clean(Object obj) {
        try {
            if (MessageBuffer.javaVersion > 8) {
                mInvokeCleaner.invoke(MessageBuffer.unsafe, obj);
            } else {
                mClean.invoke(mCleaner.invoke(obj, new Object[0]), new Object[0]);
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, new Object[0])).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static Object getCleanMethod(ByteBuffer byteBuffer, Method method) {
        try {
            Method declaredMethod = method.getReturnType().getDeclaredMethod("clean", new Class[0]);
            Object objInvoke = method.invoke(byteBuffer, new Object[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(objInvoke, new Object[0]);
            return declaredMethod;
        } catch (IllegalAccessException e2) {
            return e2;
        } catch (NoSuchMethodException e3) {
            return e3;
        } catch (InvocationTargetException e4) {
            return e4;
        }
    }

    public static Object getCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, new Object[0]);
            return declaredMethod;
        } catch (IllegalAccessException e2) {
            return e2;
        } catch (NoSuchMethodException e3) {
            return e3;
        } catch (InvocationTargetException e4) {
            return e4;
        }
    }

    public static Object getInvokeCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method declaredMethod = MessageBuffer.unsafe.getClass().getDeclaredMethod("invokeCleaner", ByteBuffer.class);
            declaredMethod.invoke(MessageBuffer.unsafe, byteBuffer);
            return declaredMethod;
        } catch (IllegalAccessException e2) {
            return e2;
        } catch (NoSuchMethodException e3) {
            return e3;
        } catch (InvocationTargetException e4) {
            return e4;
        }
    }

    static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    static ByteBuffer newByteBuffer(long j2, int i2, int i3, ByteBuffer byteBuffer) {
        try {
            int i4 = AnonymousClass4.$SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[directBufferConstructorType.ordinal()];
            if (i4 == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j2 + ((long) i2)), Integer.valueOf(i3), byteBuffer);
            }
            if (i4 == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j2 + ((long) i2)), Integer.valueOf(i3));
            }
            if (i4 == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Integer.valueOf(((int) j2) + i2), Integer.valueOf(i3));
            }
            if (i4 == 4) {
                return (ByteBuffer) byteBufferConstructor.newInstance(memoryBlockWrapFromJni.invoke(null, Long.valueOf(j2 + ((long) i2)), Integer.valueOf(i3)), Integer.valueOf(i3), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static void setupCleanerJava6(ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.1
            final /* synthetic */ ByteBuffer val$direct;

            AnonymousClass1(ByteBuffer byteBuffer2) {
                byteBuffer = byteBuffer2;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getCleanerMethod(byteBuffer);
            }
        });
        if (objDoPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged);
        }
        mCleaner = (Method) objDoPrivileged;
        Object objDoPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.2
            final /* synthetic */ ByteBuffer val$direct;

            AnonymousClass2(ByteBuffer byteBuffer2) {
                byteBuffer = byteBuffer2;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getCleanMethod(byteBuffer, DirectBufferAccess.mCleaner);
            }
        });
        if (objDoPrivileged2 instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged2);
        }
        mClean = (Method) objDoPrivileged2;
    }

    private static void setupCleanerJava9(ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.3
            final /* synthetic */ ByteBuffer val$direct;

            AnonymousClass3(ByteBuffer byteBuffer2) {
                byteBuffer = byteBuffer2;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getInvokeCleanerMethod(byteBuffer);
            }
        });
        if (objDoPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged);
        }
        mInvokeCleaner = (Method) objDoPrivileged;
    }
}
