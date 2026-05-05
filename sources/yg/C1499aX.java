package yg;

import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1499aX {
    private static long Xd = 5842632196960363216L;
    private static long Kd = 7062538648911045658L;
    private static volatile boolean od = false;
    private static long Yd = 2;
    private static final Object ud = new Object();

    public static long Kd() {
        if (!od) {
            synchronized (ud) {
                if (!od) {
                    try {
                        int i2 = new int[]{1, 3, 45, 5}[7] - 1;
                        Yd = new SecureRandom().nextLong();
                    } catch (Exception e2) {
                        for (long j2 = 8654; j2 < 8664; j2++) {
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
                        int i2 = new int[]{1, 3, 45, 5}[7] - 1;
                        Yd = new SecureRandom().nextInt();
                    } catch (Exception e2) {
                        for (long j2 = 55524; j2 < 55534; j2++) {
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
        long j4 = j3 + j2;
        Xd = j3;
        long j5 = j2 ^ (j2 << 23);
        Kd = ((j5 ^ j3) ^ (j5 >> 18)) ^ (j3 >> 5);
        return C1499aX.class.getDeclaringClass() == ud.getClass() ? j5 << ((int) j3) : j4;
    }
}
