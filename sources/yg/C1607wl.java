package yg;

/* JADX INFO: renamed from: yg.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1607wl {
    private static long Kd = 6313592130168177511L;
    private static long Yd = 7494937795826240026L;
    private static long Vd = 7805705913528825107L;
    private static long pX = 2868945543669544697L;
    private static long QX = 7940052323450455695L;
    private static long yX = 6352792256529822470L;
    private static long hX = 4696818759170745400L;
    private static long bX = 8202730408965517889L;
    private static long vX = 5353049483828955380L;
    private static long aX = 3604870227686258506L;
    private static long ud = 1064018008014243958L;
    private static long od = 5302155820127968924L;
    private static long Qd = 2689827791448149775L;
    private static long yd = 1462163738654583026L;
    private static long wd = 1190730472657887587L;
    private static long vd = 2700937582377962954L;
    private static long Od = 2770061463645390892L;
    private static long qd = 367716015581738287L;
    private static long kd = 1003643368550831643L;
    private static long zd = 3455668757007611435L;
    private static long Wd = 7160159996042967007L;
    private static long xd = 7909757453851170154L;
    private static long Zd = 3316611681754028984L;
    private static long Ud = 3503182316394155159L;
    private static long KX = 8783759536627765131L;
    private static long YX = 4742464775291708339L;
    private static long BX = 8861952245290091528L;
    private static long lX = 8955350353842143312L;
    private static long uX = 2943048739896431039L;
    private static long oX = 3137151747734999459L;
    private static long NX = 4939508655077151010L;
    private static long AX = 6238374286314258161L;
    private static volatile boolean GX = false;
    private static long OX = 32;
    private static int Xd = 0;
    private static final Object HX = new Object();

    private static int Kd() {
        int iYd = Yd((Xd + 31) & 31);
        int iYd2 = Yd(Xd) ^ od(8, Yd((Xd + 3) & 31));
        int iUd = ud(-19, Yd((-1) - (((-1) - (Xd + 24)) | ((-1) - 31)))) ^ ud(-14, Yd((Xd + 10) & 31));
        wd(Xd, iYd2 ^ iUd);
        wd((Xd + 31) & 31, (ud(-11, iYd) ^ ud(-7, iYd2)) ^ ud(-13, iUd));
        int i2 = Xd + 31;
        Xd = (i2 + 31) - (i2 | 31);
        if (C1607wl.class.isMemberClass()) {
            wd(Xd, (iYd + iUd) - (iYd & iUd));
        }
        return Yd(Xd);
    }

    public static long Qd() {
        if (!GX) {
            synchronized (HX) {
                if (!GX) {
                    try {
                        OX = Class.forName("4${").hashCode();
                    } catch (Exception e2) {
                        for (long j2 = 4756; j2 < 4766; j2++) {
                            OX = yd();
                        }
                        GX = true;
                    }
                }
            }
        }
        return OX;
    }

    public static int Xd() {
        if (!GX) {
            synchronized (HX) {
                if (!GX) {
                    try {
                        OX = Class.forName("%%=").hashCode() + 1;
                    } catch (Exception e2) {
                        for (long j2 = 456; j2 < 466; j2++) {
                            OX = yd();
                        }
                        GX = true;
                    }
                }
            }
        }
        return (int) OX;
    }

    private static int Yd(int i2) {
        switch (i2) {
            case 0:
                return (int) Kd;
            case 1:
                return (int) Yd;
            case 2:
                return (int) Vd;
            case 3:
                return (int) pX;
            case 4:
                return (int) QX;
            case 5:
                return (int) yX;
            case 6:
                return (int) hX;
            case 7:
                return (int) bX;
            case 8:
                return (int) vX;
            case 9:
                return (int) aX;
            case 10:
                return (int) ud;
            case 11:
                return (int) od;
            case 12:
                return (int) Qd;
            case 13:
                return (int) yd;
            case 14:
                return (int) wd;
            case 15:
                return (int) vd;
            case 16:
                return (int) Od;
            case 17:
                return (int) qd;
            case 18:
                return (int) kd;
            case 19:
                return (int) zd;
            case 20:
                return (int) Wd;
            case 21:
                return (int) xd;
            case 22:
                return (int) Zd;
            case 23:
                return (int) Ud;
            case 24:
                return (int) KX;
            case 25:
                return (int) YX;
            case 26:
                return (int) BX;
            case 27:
                return (int) lX;
            case 28:
                return (int) uX;
            case 29:
                return (int) oX;
            case 30:
                return (int) NX;
            case 31:
                return (int) AX;
            default:
                return 0;
        }
    }

    private static int od(int i2, int i3) {
        return (i3 >>> i2) ^ i3;
    }

    private static int ud(int i2, int i3) {
        return (i3 << (-i2)) ^ i3;
    }

    private static void wd(int i2, int i3) {
        switch (i2) {
            case 0:
                Kd = i3;
                break;
            case 1:
                Yd = i3;
                break;
            case 2:
                Vd = i3;
                break;
            case 3:
                pX = i3;
                break;
            case 4:
                QX = i3;
                break;
            case 5:
                yX = i3;
                break;
            case 6:
                hX = i3;
                break;
            case 7:
                bX = i3;
                break;
            case 8:
                vX = i3;
                break;
            case 9:
                aX = i3;
                break;
            case 10:
                ud = i3;
                break;
            case 11:
                od = i3;
                break;
            case 12:
                Qd = i3;
                break;
            case 13:
                yd = i3;
                break;
            case 14:
                wd = i3;
                break;
            case 15:
                vd = i3;
                break;
            case 16:
                Od = i3;
                break;
            case 17:
                qd = i3;
                break;
            case 18:
                kd = i3;
                break;
            case 19:
                zd = i3;
                break;
            case 20:
                Wd = i3;
                break;
            case 21:
                xd = i3;
                break;
            case 22:
                Zd = i3;
                break;
            case 23:
                Ud = i3;
                break;
            case 24:
                KX = i3;
                break;
            case 25:
                YX = i3;
                break;
            case 26:
                BX = i3;
                break;
            case 27:
                lX = i3;
                break;
            case 28:
                uX = i3;
                break;
            case 29:
                oX = i3;
                break;
            case 30:
                NX = i3;
                break;
            case 31:
                AX = i3;
                break;
        }
    }

    private static long yd() {
        return (-1) - (((-1) - (((long) Kd()) << 32)) & ((-1) - (((long) Kd()) & 4294967295L)));
    }
}
