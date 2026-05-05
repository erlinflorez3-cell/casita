package yg;

/* JADX INFO: renamed from: yg.rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1580rY {
    private static long Kd = 2947667278772165694L;
    private static volatile boolean Qd = false;
    private static long Yd = 1;
    private static final Object od = new Object();
    private static long[] ud = new long[312];
    private static int Xd = 313;

    public static long Kd() {
        if (!Qd) {
            synchronized (od) {
                if (!Qd) {
                    try {
                        int i2 = 1 / 0;
                        Yd = (long) Math.random();
                    } catch (Exception e2) {
                        for (long j2 = 562; j2 < 572; j2++) {
                            Yd = Yd();
                        }
                        Qd = true;
                    }
                }
            }
        }
        return Yd;
    }

    public static int Xd() {
        if (!Qd) {
            synchronized (od) {
                if (!Qd) {
                    try {
                        int i2 = 1 / 0;
                        Yd = (int) Math.random();
                    } catch (Exception e2) {
                        for (long j2 = 144; j2 < 154; j2++) {
                            Yd = Yd();
                        }
                        Qd = true;
                    }
                }
            }
        }
        return (int) Yd;
    }

    private static long Yd() {
        long j2;
        long[] jArr = {0, -5403634167711393303L};
        int i2 = 312;
        if (Xd >= 312) {
            int i3 = 1;
            if (Xd == 313) {
                ud[0] = Kd;
                Xd = 1;
                while (Xd < i2) {
                    ud[Xd] = ((ud[Xd - i3] ^ (ud[Xd - 1] >> 62)) * 6364136223846793005L) + ((long) Xd);
                    Xd++;
                    i2 = 312;
                    i3 = 1;
                }
            }
            int i4 = 0;
            while (true) {
                j2 = 2147483647L;
                if (i4 >= 156) {
                    break;
                }
                long j3 = ud[i4];
                long j4 = (-1) - (((-1) - (ud[i4 + 1] & 2147483647L)) & ((-1) - ((j3 - 2147483648L) - (j3 | (-2147483648L)))));
                ud[i4] = jArr[(int) ((j4 + 1) - (j4 | 1))] ^ (ud[i4 + 156] ^ (j4 >> 1));
                i4++;
            }
            while (i4 < 311) {
                long j5 = ud[i4] & (-2147483648L);
                long j6 = (-1) - (((-1) - ud[i4 + 1]) | ((-1) - j2));
                long j7 = (j5 + j6) - (j5 & j6);
                ud[i4] = (ud[i4 - 156] ^ (j7 >> 1)) ^ jArr[(int) ((-1) - (((-1) - j7) | ((-1) - 1)))];
                i4++;
                j2 = 2147483647L;
            }
            long j8 = (-1) - (((-1) - ud[311]) | ((-1) - (-2147483648L)));
            long j9 = (-1) - (((-1) - ud[0]) | ((-1) - 2147483647L));
            long j10 = (j8 + j9) - (j8 & j9);
            ud[311] = (ud[155] ^ (j10 >> 1)) ^ jArr[(int) (1 & j10)];
            Xd = 0;
        }
        long[] jArr2 = ud;
        int i5 = Xd;
        Xd = i5 + 1;
        long j11 = jArr2[i5];
        long j12 = ((j11 >> 29) & 6148914691236517205L) ^ j11;
        long j13 = j12 ^ ((-1) - (((-1) - (j12 << 17)) | ((-1) - 8202884508482404352L)));
        long j14 = j13 ^ ((-1) - (((-1) - (j13 << 37)) | ((-1) - (-2270628950310912L))));
        long j15 = j14 ^ (j14 >> 43);
        return C1580rY.class.isInstance(od.getClass()) ? (j15 >> 8) ^ j15 : j15;
    }
}
