package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    static class LexicographicalComparatorHolder {
        static final String UNSAFE_COMPARATOR_NAME = LexicographicalComparatorHolder.class.getName() + "$UnsafeComparator";
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] left, byte[] right) {
                int iMin = Math.min(left.length, right.length);
                for (int i2 = 0; i2 < iMin; i2++) {
                    int iCompare = UnsignedBytes.compare(left[i2], right[i2]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return left.length - right.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                String property = System.getProperty(C1561oA.Yd("ad^\u001fSeW]$[Ym[)ilbdl", (short) (OY.Xd() ^ 28896)));
                short sXd = (short) (OY.Xd() ^ 5568);
                short sXd2 = (short) (OY.Xd() ^ 12665);
                int[] iArr = new int["\u0014\u0013".length()];
                QB qb = new QB("\u0014\u0013");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                if (new String(iArr, 0, i2).equals(property) && iArrayBaseOffset % 8 == 0 && unsafe.arrayIndexScale(byte[].class) == 1) {
                    return;
                }
                short sXd3 = (short) (C1580rY.Xd() ^ (-31143));
                short sXd4 = (short) (C1580rY.Xd() ^ (-16266));
                int[] iArr2 = new int["\u007f\u001e\u0003A\u001d#iFNxg$uB\u0015".length()];
                QB qb2 = new QB("\u007f\u001e\u0003A\u001d#iFNxg$uB\u0015");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                    i3++;
                }
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(new String(iArr2, 0, i3)).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    throw ((Error) constructor.newInstance(objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
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

            @Override // java.util.Comparator
            public int compare(byte[] left, byte[] right) {
                int iMin = Math.min(left.length, right.length);
                int i2 = iMin & (-8);
                int i3 = 0;
                while (i3 < i2) {
                    Unsafe unsafe = theUnsafe;
                    int i4 = BYTE_ARRAY_BASE_OFFSET;
                    long j2 = i3;
                    long j3 = unsafe.getLong(left, ((long) i4) + j2);
                    long j4 = unsafe.getLong(right, ((long) i4) + j2);
                    if (j3 != j4) {
                        if (BIG_ENDIAN) {
                            return UnsignedLongs.compare(j3, j4);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3 ^ j4);
                        int i5 = (iNumberOfTrailingZeros - 8) - (iNumberOfTrailingZeros | (-8));
                        long j5 = j3 >>> i5;
                        long j6 = j4 >>> i5;
                        return ((int) ((j5 + 255) - (j5 | 255))) - ((int) ((j6 + 255) - (j6 | 255)));
                    }
                    i3 += 8;
                }
                while (i3 < iMin) {
                    int iCompare = UnsignedBytes.compare(left[i3], right[i3]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i3++;
                }
                return left.length - right.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        LexicographicalComparatorHolder() {
        }

        static Comparator<byte[]> getBestComparator() {
            try {
                return (Comparator) ((Object[]) Objects.requireNonNull(Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants()))[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    private UnsignedBytes() {
    }

    public static byte checkedCast(long value) {
        Preconditions.checkArgument((value >> 8) == 0, "out of range: %s", value);
        return (byte) value;
    }

    public static int compare(byte a2, byte b2) {
        return toInt(a2) - toInt(b2);
    }

    private static byte flip(byte b2) {
        return (byte) (b2 ^ 128);
    }

    public static String join(String separator, byte... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * (separator.length() + 3));
        sb.append(toInt(array[0]));
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append(toString(array[i2]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static byte max(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        int i2 = toInt(array[0]);
        for (int i3 = 1; i3 < array.length; i3++) {
            int i4 = toInt(array[i3]);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return (byte) i2;
    }

    public static byte min(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        int i2 = toInt(array[0]);
        for (int i3 = 1; i3 < array.length; i3++) {
            int i4 = toInt(array[i3]);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return (byte) i2;
    }

    public static byte parseUnsignedByte(String string) {
        return parseUnsignedByte(string, 10);
    }

    public static byte parseUnsignedByte(String string, int radix) {
        int i2 = Integer.parseInt((String) Preconditions.checkNotNull(string), radix);
        if ((i2 >> 8) == 0) {
            return (byte) i2;
        }
        throw new NumberFormatException("out of range: " + i2);
    }

    public static byte saturatedCast(long value) {
        if (value > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (value < 0) {
            return (byte) 0;
        }
        return (byte) value;
    }

    public static void sort(byte[] array) {
        Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = fromIndex; i2 < toIndex; i2++) {
            array[i2] = flip(array[i2]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = flip(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void sortDescending(byte[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = fromIndex; i2 < toIndex; i2++) {
            array[i2] = (byte) (array[i2] ^ 127);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = (byte) (array[fromIndex] ^ 127);
            fromIndex++;
        }
    }

    public static int toInt(byte value) {
        return value & 255;
    }

    public static String toString(byte x2) {
        return toString(x2, 10);
    }

    public static String toString(byte x2, int radix) {
        Preconditions.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        return Integer.toString(toInt(x2), radix);
    }
}
