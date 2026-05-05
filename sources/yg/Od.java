package yg;

/* JADX INFO: loaded from: classes.dex */
public class Od {
    private static long Xd = 3183124918742401951L;
    private static long Kd = 2398631656440096777L;
    private static volatile boolean od = false;
    private static long Yd = 2;
    private static final Object ud = new Object();

    public static long Kd() {
        if (!od) {
            synchronized (ud) {
                if (!od) {
                    try {
                        int i2 = new int[4][8];
                        Yd = (long) Math.random();
                    } catch (Exception e2) {
                        for (long j2 = 0; j2 < 10; j2++) {
                            Yd = Yd();
                        }
                        od = true;
                    }
                }
            }
        }
        return Yd;
    }

    public static int Xd() {
        if (!od) {
            synchronized (ud) {
                if (!od) {
                    try {
                        int i2 = new int[4][8];
                        Yd = (int) Math.random();
                    } catch (Exception e2) {
                        for (long j2 = 0; j2 < 10; j2++) {
                            Yd = Yd();
                        }
                        od = true;
                    }
                }
            }
        }
        return (int) Yd;
    }

    private static long Yd() {
        long j2 = Xd;
        long j3 = Kd;
        long j4 = j2 + j3;
        long j5 = j3 ^ j2;
        Xd = (ud(j2, 55) ^ j5) ^ (j5 << 14);
        Kd = ud(j5, 36);
        return Od.class.isInterface() ? j2 ^ j5 : j4;
    }

    private static long ud(long j2, int i2) {
        return (j2 << i2) | (j2 >> (64 - i2));
    }
}
