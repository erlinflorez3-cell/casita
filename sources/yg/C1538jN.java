package yg;

import java.io.IOException;

/* JADX INFO: renamed from: yg.jN */
/* JADX INFO: loaded from: classes.dex */
public class C1538jN {
    public final int Kd;
    public final short Od;
    public final long Qd;
    public final short Vd;
    public final boolean Wd;
    public final byte Xd;
    public final int Yd;
    public final byte[] Zd;
    public final short kd;
    public final long od;
    public final short qd;
    public final long ud;
    public final short vd;
    public final short wd;
    public final boolean xd;
    public final short yd;
    public final short zd;

    public C1538jN(VF vf) throws IOException {
        if (!Xd(vf)) {
            short sXd = (short) (C1499aX.Xd() ^ ((1992914567 ^ 1452701777) ^ (-543098365)));
            short sXd2 = (short) (C1499aX.Xd() ^ ((924791469 ^ 280330589) ^ (-665499227)));
            int[] iArr = new int[";[_\nJV\u0007KQJ\u0003HJLD".length()];
            QB qb = new QB(";[_\nJV\u0007KQJ\u0003HJLD");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            throw new IOException(new String(iArr, 0, i2));
        }
        byte bWd = vf.Wd();
        int iXd = ZN.Xd() ^ 864698098;
        this.Wd = bWd == iXd;
        vf.lX(this.Wd);
        this.xd = vf.Wd() == iXd;
        vf.BX(this.xd);
        if (vf.Wd() != 1) {
            throw new IOException(Wg.vd("KcklbacebRT\u000fOUR\u000b|jzzkpr", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951492117))));
        }
        this.Xd = vf.Wd();
        this.Zd = vf.pX(1843109724 ^ 1843109716);
        this.Vd = vf.YX();
        this.wd = vf.YX();
        this.Yd = vf.xd();
        this.ud = vf.Zd();
        this.od = vf.Zd();
        this.Qd = vf.Zd();
        this.Kd = vf.xd();
        this.yd = vf.YX();
        this.vd = vf.YX();
        this.Od = vf.YX();
        this.qd = vf.YX();
        this.kd = vf.YX();
        this.zd = vf.YX();
    }

    private static boolean Xd(VF vf) throws IOException {
        int iXd = FB.Xd() ^ 1609527095;
        byte[] bArr = new byte[iXd];
        return vf.read(bArr) == iXd && bArr[0] == (ZN.Xd() ^ 864697999) && bArr[1] == (C1499aX.Xd() ^ (-1134258007)) && bArr[C1607wl.Xd() ^ 1849955288] == (C1607wl.Xd() ^ (1326935547 ^ 559119981)) && bArr[Od.Xd() ^ 1207800918] == (OY.Xd() ^ (982307765 ^ 1051187995));
    }
}
