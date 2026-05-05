package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class Random implements Serializable {
    static final String BadBound = "bound must be positive";
    private static final double DOUBLE_UNIT = 1.1102230246251565E-16d;
    private static final long addend = 11;
    private static final long mask = 281474976710655L;
    private static final long multiplier = 25214903917L;
    private static final AtomicLong seedUniquifier = new AtomicLong(8682522807148012L);
    private static final long serialVersionUID = 3905348978240129619L;
    private final AtomicLong seed;

    public Random() {
        this(seedUniquifier() ^ System.nanoTime());
    }

    public Random(long j2) {
        if (getClass() == Random.class) {
            this.seed = new AtomicLong(initialScramble(j2));
        } else {
            this.seed = new AtomicLong();
            setSeed(j2);
        }
    }

    private static long initialScramble(long j2) {
        return (-1) - (((-1) - (j2 ^ multiplier)) | ((-1) - mask));
    }

    private int next(int i2) {
        long j2;
        long j3;
        AtomicLong atomicLong = this.seed;
        do {
            j2 = atomicLong.get();
            long j4 = (multiplier * j2) + addend;
            j3 = (j4 + mask) - (j4 | mask);
        } while (!atomicLong.compareAndSet(j2, j3));
        return (int) (j3 >>> (48 - i2));
    }

    private static long seedUniquifier() {
        AtomicLong atomicLong;
        long j2;
        long j3;
        do {
            atomicLong = seedUniquifier;
            j2 = atomicLong.get();
            j3 = 1181783497276652981L * j2;
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    final double internalNextDouble(double d2, double d3) {
        double dNextDouble = nextDouble();
        if (d2 >= d3) {
            return dNextDouble;
        }
        double d4 = (dNextDouble * (d3 - d2)) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    final int internalNextInt(int i2, int i3) {
        if (i2 >= i3) {
            return nextInt();
        }
        int i4 = i3 - i2;
        if (i4 > 0) {
            return nextInt(i4) + i2;
        }
        while (true) {
            int iNextInt = nextInt();
            if (iNextInt >= i2 && iNextInt < i3) {
                return iNextInt;
            }
        }
    }

    final long internalNextLong(long j2, long j3) {
        long jNextLong = nextLong();
        if (j2 >= j3) {
            return jNextLong;
        }
        long j4 = j3 - j2;
        long j5 = j4 - 1;
        if ((j4 + j5) - (j4 | j5) == 0) {
            return ((jNextLong + j5) - (jNextLong | j5)) + j2;
        }
        if (j4 > 0) {
            while (true) {
                long j6 = jNextLong >>> 1;
                long j7 = j6 + j5;
                long j8 = j6 % j4;
                if (j7 - j8 >= 0) {
                    return j8 + j2;
                }
                jNextLong = nextLong();
            }
        } else {
            while (true) {
                if (jNextLong >= j2 && jNextLong < j3) {
                    return jNextLong;
                }
                jNextLong = nextLong();
            }
        }
    }

    public boolean nextBoolean() {
        return next(1) != 0;
    }

    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int iNextInt = nextInt();
            int iMin = Math.min(length - i2, 4);
            while (true) {
                int i3 = iMin - 1;
                if (iMin > 0) {
                    bArr[i2] = (byte) iNextInt;
                    iNextInt >>= 8;
                    i2++;
                    iMin = i3;
                }
            }
        }
    }

    public double nextDouble() {
        return ((((long) next(26)) << 27) + ((long) next(27))) * DOUBLE_UNIT;
    }

    public float nextFloat() {
        return next(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return next(32);
    }

    public int nextInt(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(BadBound);
        }
        int next = next(31);
        int i3 = i2 - 1;
        if ((-1) - (((-1) - i2) | ((-1) - i3)) == 0) {
            return (int) ((((long) i2) * ((long) next)) >> 31);
        }
        while (true) {
            int i4 = next % i2;
            if ((next - i4) + i3 >= 0) {
                return i4;
            }
            next = next(31);
        }
    }

    public long nextLong() {
        return (((long) next(32)) << 32) + ((long) next(32));
    }

    public synchronized void setSeed(long j2) {
        this.seed.set(initialScramble(j2));
    }
}
