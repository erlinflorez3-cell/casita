package yg;

/* JADX INFO: loaded from: classes.dex */
public class HY {
    private static int Xd(int i2) {
        int iQd = Xg.Qd((short) i2) << 16;
        int iQd2 = Xg.Qd((short) (i2 >>> 16)) & (1519554454 ^ 1519546473);
        return (iQd + iQd2) - (iQd & iQd2);
    }

    public static long Yd(long j2) {
        long jXd = Xd((int) j2);
        int iXd = FB.Xd() ^ (1108798540 ^ 502891359);
        long j3 = jXd << iXd;
        long jXd2 = Xd((int) (j2 >>> iXd));
        long j4 = 2716974018955506021L ^ 2716974017888194202L;
        return j3 | ((jXd2 + j4) - (jXd2 | j4));
    }
}
