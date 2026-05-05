package com.google.common.cache;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX INFO: renamed from: com.google.common.cache.Striped64$1 */
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
        volatile long f3499p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;

        /* JADX INFO: renamed from: q0 */
        volatile long f3500q0;
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
                short sXd = (short) (C1580rY.Xd() ^ (-20427));
                int[] iArr = new int["\u0004\u0015Rz\u0012".length()];
                QB qb = new QB("\u0004\u0015Rz\u0012");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField(new String(iArr, 0, i2)));
            } catch (Exception e2) {
                Object[] objArr = {e2};
                Constructor<?> constructor = Class.forName(EO.Od(" o\u0015\u001a@#\u0006u%\u001a5~j]D", (short) (OY.Xd() ^ 15826))).getConstructor(Class.forName(C1561oA.Qd("g]q['dXd\\\"GZc_fOOXP", (short) (C1580rY.Xd() ^ (-31421)))));
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
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(Xg.qd("OObU", (short) (Od.Xd() ^ (-5554)), (short) (Od.Xd() ^ (-21265)))));
            short sXd = (short) (ZN.Xd() ^ 4343);
            short sXd2 = (short) (ZN.Xd() ^ 8839);
            int[] iArr = new int["FK\u000bT".length()];
            QB qb = new QB("FK\u000bT");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(new String(iArr, 0, i2)));
        } catch (Exception e2) {
            Class<?> cls = Class.forName(ZO.xd("\u0011|\u0010QBf\u001cHK\u0017V\"\u0015w%", (short) (C1607wl.Xd() ^ 20406), (short) (C1607wl.Xd() ^ 15272)));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (OY.Xd() ^ 20003);
            short sXd4 = (short) (OY.Xd() ^ 21743);
            int[] iArr2 = new int["7A m\u001994\u0016\u0010{>\u0011\r:\u0013U\u000bKJ".length()];
            QB qb2 = new QB("7A m\u001994\u0016\u0010{>\u0011\r:\u0013U\u000bKJ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {e2};
            Constructor<?> constructor = cls.getConstructor(clsArr);
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
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
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
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0018 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void retryUpdate(long r13, @javax.annotation.CheckForNull int[] r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.retryUpdate(long, int[], boolean):void");
    }
}
