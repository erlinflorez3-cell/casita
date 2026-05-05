package yg;

/* JADX INFO: loaded from: classes2.dex */
public class ZN {
    private static long Xd = 9078476729143589260L;
    private static long Kd = 729919693006235833L;
    private static volatile boolean od = false;
    private static long Yd = 2;
    private static final Object ud = new Object();

    private static int Kd() {
        long j2 = Xd;
        Xd = (6364136223846793005L * j2) + (Kd | 1);
        int i2 = (int) (((j2 >>> 18) ^ j2) >>> 27);
        int i3 = (int) (j2 >>> 59);
        if (ZN.class.getMethods().length < 4) {
            long j3 = i3;
            i3 = (int) ((j3 + 94937813634376546L) - (j3 & 94937813634376546L));
        }
        return i3 == 0 ? i2 : (i2 >>> i3) | (i2 << ((-1) - (((-1) - (-i3)) | ((-1) - 31))));
    }

    public static int Xd() {
        if (!od) {
            synchronized (ud) {
                if (!od) {
                    try {
                        Integer.valueOf("3.txzt").intValue();
                        Yd = 1L;
                    } catch (Exception e2) {
                        for (long j2 = 311; j2 < 321; j2++) {
                            Yd = ud();
                        }
                        od = true;
                    }
                }
            }
        }
        return (int) Yd;
    }

    public static long Yd() {
        if (!od) {
            synchronized (ud) {
                if (!od) {
                    try {
                        Integer.valueOf("3.txzt").intValue();
                        Yd = 1L;
                    } catch (Exception e2) {
                        for (long j2 = 112; j2 < 122; j2++) {
                            Yd = ud();
                        }
                        od = true;
                    }
                }
            }
        }
        return Yd;
    }

    private static long ud() {
        long jKd = ((long) Kd()) << 32;
        long jKd2 = Kd();
        long j2 = (jKd2 + 4294967295L) - (jKd2 | 4294967295L);
        return (jKd + j2) - (jKd & j2);
    }
}
