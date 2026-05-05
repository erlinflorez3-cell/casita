package com.google.common.hash;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;

    @CheckForNull
    volatile transient Cell[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: com.google.common.hash.Striped64$1 */
    class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
        AnonymousClass1() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;

        /* JADX INFO: renamed from: p0 */
        volatile long f3516p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;

        /* JADX INFO: renamed from: q0 */
        volatile long f3517q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField(Qg.kd("+\u0015\u001f'\u0016", (short) (C1633zX.Xd() ^ (-3543)), (short) (C1633zX.Xd() ^ (-8533)))));
            } catch (Exception e2) {
                Object[] objArr = {e2};
                Constructor<?> constructor = Class.forName(hg.Vd("7-A+v4(4,q\b43/1", (short) (C1499aX.Xd() ^ (-30021)), (short) (C1499aX.Xd() ^ (-8635)))).getConstructor(Class.forName(C1561oA.ud("#\u0019-\u0017b \u0014 \u0018]\u0003\u0016\u001f\u001b\"\u000b\u000b\u0014\f", (short) (C1633zX.Xd() ^ (-8592)))));
                try {
                    constructor.setAccessible(true);
                    throw ((Error) constructor.newInstance(objArr));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }

        Cell(long x2) {
            this.value = x2;
        }

        final boolean cas(long cmp, long val) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, cmp, val);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            short sXd = (short) (C1607wl.Xd() ^ 19651);
            int[] iArr = new int["\u0014\u0014'\u001a".length()];
            QB qb = new QB("\u0014\u0014'\u001a");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(new String(iArr, 0, i2)));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(Wg.Zd("w\u0018Sd", (short) (C1499aX.Xd() ^ (-22165)), (short) (C1499aX.Xd() ^ (-16287)))));
        } catch (Exception e2) {
            Object[] objArr = {e2};
            Constructor<?> constructor = Class.forName(C1561oA.Xd("[SiU#bXf`(@nomq", (short) (ZN.Xd() ^ 24541))).getConstructor(Class.forName(Wg.vd("QI_K\u0011PFTV\u001eEZ][dOYd^", (short) (C1607wl.Xd() ^ 32225))));
            try {
                constructor.setAccessible(true);
                throw ((Error) constructor.newInstance(objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    Striped64() {
    }

    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.Striped64.1
                    AnonymousClass1() {
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    final boolean casBase(long cmp, long val) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, cmp, val);
    }

    final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    abstract long fn(long currentValue, long newValue);

    final void internalReset(long initialValue) {
        Cell[] cellArr = this.cells;
        this.base = initialValue;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = initialValue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0018 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void retryUpdate(long r13, @javax.annotation.CheckForNull int[] r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.retryUpdate(long, int[], boolean):void");
    }
}
