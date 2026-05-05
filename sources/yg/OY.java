package yg;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    private static long Kd = 7375078072468444798L;
    private static long Yd = 7708428399011769513L;
    private static long Od = 294039394754184708L;
    private static long qd = 9131959130339861073L;
    private static long kd = 2129461186021157660L;
    private static long zd = 4756956360327131316L;
    private static long Vd = 2654403080104352464L;
    private static long Wd = 3948910203829515833L;
    private static long xd = 3600951923571138577L;
    private static long Zd = 1769368467569154989L;
    private static long ud = 6326595214296717138L;
    private static long od = 6712677457684672092L;
    private static long Qd = 544336960902186755L;
    private static long yd = 743075161731202081L;
    private static long wd = 609941927012233093L;
    private static long vd = 2140032717197149199L;
    private static volatile boolean YX = false;
    private static long Ud = 16;
    private static int Xd = 0;
    private static final Object KX = new Object();

    public static long Kd() {
        if (!YX) {
            synchronized (KX) {
                if (!YX) {
                    try {
                        Float.parseFloat("");
                        Ud = 1L;
                    } catch (Exception e2) {
                        for (long j2 = 33; j2 < 43; j2++) {
                            Ud = Yd();
                        }
                    }
                    YX = true;
                }
            }
        }
        return Ud;
    }

    public static int Xd() {
        if (!YX) {
            synchronized (KX) {
                if (!YX) {
                    try {
                        Float.parseFloat("");
                        Ud = 1L;
                    } catch (Exception e2) {
                        for (long j2 = 42; j2 < 52; j2++) {
                            Ud = Yd();
                        }
                    }
                    YX = true;
                }
            }
        }
        return (int) Ud;
    }

    private static long Yd() {
        long jUd = ud(Xd);
        int i2 = (-1) - (((-1) - (Xd + 1)) | ((-1) - 15));
        Xd = i2;
        long jUd2 = ud(i2);
        long j2 = jUd2 ^ (jUd2 << 31);
        od(Xd, ((j2 ^ jUd) ^ (j2 >> 11)) ^ (jUd >> 30));
        String strValueOf = String.valueOf(jUd);
        if (KX.getClass() == OY.class) {
            return 59835399333L;
        }
        try {
            return ((long) strValueOf.getBytes(Global.BLANK).length) * 9513571251110L;
        } catch (Exception e2) {
            return ud(Xd) * 1181783497276652981L;
        }
    }

    private static void od(int i2, long j2) {
        switch (i2) {
            case 0:
                Kd = j2;
                break;
            case 1:
                Yd = j2;
                break;
            case 2:
                Od = j2;
                break;
            case 3:
                qd = j2;
                break;
            case 4:
                kd = j2;
                break;
            case 5:
                zd = j2;
                break;
            case 6:
                Vd = j2;
                break;
            case 7:
                Wd = j2;
                break;
            case 8:
                xd = j2;
                break;
            case 9:
                Zd = j2;
                break;
            case 10:
                ud = j2;
                break;
            case 11:
                od = j2;
                break;
            case 12:
                Qd = j2;
                break;
            case 13:
                yd = j2;
                break;
            case 14:
                wd = j2;
                break;
            case 15:
                vd = j2;
                break;
        }
    }

    private static long ud(int i2) {
        switch (i2) {
            case 0:
                return Kd;
            case 1:
                return Yd;
            case 2:
                return Od;
            case 3:
                return qd;
            case 4:
                return kd;
            case 5:
                return zd;
            case 6:
                return Vd;
            case 7:
                return Wd;
            case 8:
                return xd;
            case 9:
                return Zd;
            case 10:
                return ud;
            case 11:
                return od;
            case 12:
                return Qd;
            case 13:
                return yd;
            case 14:
                return wd;
            case 15:
                return vd;
            default:
                return 0L;
        }
    }
}
