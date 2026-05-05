package yg;

/* JADX INFO: renamed from: yg.zX */
/* JADX INFO: loaded from: classes.dex */
public class C1633zX {
    private static long Xd = 7813497161378842344L;
    private static volatile boolean ud = false;
    private static long Kd = 1;
    private static final Object Yd = new Object();

    public static long Kd() {
        if (!ud) {
            synchronized (Yd) {
                if (!ud) {
                    try {
                        Integer.parseInt("nonint");
                        Kd = 1L;
                    } catch (Exception e2) {
                        for (long j2 = 864; j2 < 874; j2++) {
                            Kd = Yd();
                        }
                        ud = true;
                    }
                }
            }
        }
        return Kd;
    }

    public static int Xd() {
        if (!ud) {
            synchronized (Yd) {
                if (!ud) {
                    try {
                        Integer.parseInt("nonint");
                        Kd = 1L;
                    } catch (Exception e2) {
                        for (long j2 = 862; j2 < 872; j2++) {
                            Kd = Yd();
                        }
                        ud = true;
                    }
                }
            }
        }
        return (int) Kd;
    }

    private static long Yd() {
        Xd -= 7046029254386353131L;
        long j2 = Xd;
        long j3 = ((j2 >> 30) ^ j2) * (-4658895280553007687L);
        long j4 = ((j3 >> 27) ^ j3) * (-7723592293110705685L);
        return C1633zX.class.isAnonymousClass() ? (j4 >> 25) ^ j4 : (j4 >> 31) ^ j4;
    }
}
