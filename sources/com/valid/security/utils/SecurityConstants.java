package com.valid.security.utils;

import yg.C1499aX;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class SecurityConstants {
    public static final String ALGORITHM_STANDARD_NAME_SHA256_WITH_RSA;
    public static final String BEGIN_PUBLIC;
    public static final String EMPTY = "";
    public static final String END_PUBLIC;
    public static final String INSTALLATION_ID;
    public static final int KEY_SIZE_3DES = 168;
    public static final String SECURITY_SHARED_PREFERENCES;
    public static final int TEN = 10;
    public static final int TWO = 2;
    public static final String UTF_8;

    public class ParseException extends RuntimeException {
    }

    static {
        int iXd = ZN.Xd() ^ (312902085 ^ 556573184);
        short sXd = (short) (OY.Xd() ^ ((525831477 ^ 849477424) ^ 771118524));
        short sXd2 = (short) (OY.Xd() ^ iXd);
        int[] iArr = new int["||oWc".length()];
        QB qb = new QB("||oWc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        UTF_8 = new String(iArr, 0, i2);
        SECURITY_SHARED_PREFERENCES = Jg.Wd("\rAT#Au\u001dOwKe5'^Mz\u0003U:,W\u0006,o<dsG\u000f\u0014(\u00138n1Gf", (short) (ZN.Xd() ^ (Od.Xd() ^ (1470217734 ^ 274480752))), (short) (ZN.Xd() ^ (1512337345 ^ 1512318454)));
        int iXd2 = ZN.Xd() ^ (1065908546 ^ (-201467637));
        INSTALLATION_ID = ZO.xd("=\u0015^\u0003g |n\u0018\u0012ia*>[Ss\u0001.C\ta:A\u001c(2\u0004\n9zf{", (short) (C1633zX.Xd() ^ (1644426202 ^ (-1644415221))), (short) (C1633zX.Xd() ^ iXd2));
        END_PUBLIC = C1626yg.Ud("EB\\Y\u000b2\n@aQ\u00118\u0018&f\u001cL3Q#O\\RH{", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (2117011417 ^ (-1035209851)))), (short) (OY.Xd() ^ (462381776 ^ 462375211)));
        BEGIN_PUBLIC = Ig.wd("\u001dN: }V{\u001bbI\u001b+\u0002bUt)\u0018kyR^|\u00015UP", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609515675)));
        ALGORITHM_STANDARD_NAME_SHA256_WITH_RSA = EO.Od("s\u0018?W[\u0012\u000f\u0019K\u0003n\n#-JX%B`\\hG\u0018", (short) (C1580rY.Xd() ^ (914194296 ^ (-914188209))));
    }
}
