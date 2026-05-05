package yg;

/* JADX INFO: renamed from: yg.vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1601vo extends C1570qB {
    public final long Vd;
    public final long Wd;
    public final long kd;
    public final long xd;
    public final long zd;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1601vo(String str) {
        String strYd = C1561oA.Yd("P", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (1697744149 ^ 1421399733))));
        super(str.split(strYd)[0]);
        long jXd = 0;
        long jXd2 = 0;
        long jXd3 = 0;
        long jXd4 = 0;
        long jXd5 = 0;
        for (String str2 : str.split(strYd)) {
            if (str2.startsWith(Xg.qd("\b\u001f1\u001dr", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134244043))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831066198)))))) {
                jXd = Xd(str2);
            } else {
                if (str2.startsWith(Jg.Wd("(f\u000ee", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831070928))), (short) (C1607wl.Xd() ^ (775197879 ^ 775202316))))) {
                    jXd2 = Xd(str2);
                } else {
                    if (str2.startsWith(ZO.xd(" 5_&+\u0003\u001b%0\u0003%)m", (short) (ZN.Xd() ^ ((1239620734 ^ 1821838760) ^ 628367368)), (short) (ZN.Xd() ^ (41758630 ^ 41751826))))) {
                        jXd3 = Xd(str2);
                    } else {
                        if (str2.startsWith(C1626yg.Ud("\u0019[\u00079Y\u000e<8/\tDhv", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609506939)), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207826943))))) {
                            jXd4 = Xd(str2);
                        } else {
                            if (str2.startsWith(Ig.wd("%~\u00124Y\b`U\u0001?\u0013", (short) (ZN.Xd() ^ ((1399368292 ^ 265862508) ^ 1555066684))))) {
                                jXd5 = Xd(str2);
                            }
                        }
                    }
                }
            }
        }
        this.xd = jXd;
        this.zd = jXd2;
        this.Vd = jXd3;
        this.Wd = jXd4;
        this.kd = jXd5;
    }

    private long Xd(String str) {
        String[] strArrSplit = str.split(EO.Od("C*5", (short) (FB.Xd() ^ (272262281 ^ 272247347))));
        String str2 = strArrSplit[1946190187 ^ 1946190185];
        long jKd = 1;
        if (str2.equals(C1561oA.Qd("Y/", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134258369)))))) {
            jKd = C1499aX.Kd() ^ (7474304976383884848L ^ 3093477000777507548L);
        } else {
            if (str2.equals(C1593ug.zd("\u001f\u0015", (short) (OY.Xd() ^ (FB.Xd() ^ (1564527382 ^ 45085411))), (short) (OY.Xd() ^ (FB.Xd() ^ 1609507084))))) {
                jKd = 3164248972332040647L ^ 3164248972330992071L;
            } else {
                if (str2.equals(C1561oA.od("\u001f\u0019", (short) (C1499aX.Xd() ^ ((1468858815 ^ 1087103489) ^ (-390521318)))))) {
                    jKd = C1499aX.Kd() ^ (9102109915077070929L ^ 3676376049293084861L);
                }
            }
        }
        return Long.parseLong(strArrSplit[1]) * jKd;
    }
}
