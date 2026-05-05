package com.valid.vssh_bio_validation_library_embed;

import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public final class BuildConfig {
    public static final boolean DEBUG;
    public static final String LIBRARY_PACKAGE_NAME = Jg.Wd("\u0003h=WA\u0002gsEj\u0010)\u007fDU.\u0016u|m)K!{O~@\"9\boBL6{(\u000eK*B\u000el\n", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (863114288 ^ (-1955580467)))), (short) (C1499aX.Xd() ^ (1136357700 ^ (-1136358136))));
    public static final String BUILD_TYPE = ZO.xd("h[@(C", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (480850257 ^ (-1761088916)))), (short) (ZN.Xd() ^ (OY.Xd() ^ 69947763)));

    static {
        short sXd = (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134262881));
        short sXd2 = (short) (C1580rY.Xd() ^ (886139475 ^ (-886124802)));
        int[] iArr = new int["v@t\"".length()];
        QB qb = new QB("v@t\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        DEBUG = Boolean.parseBoolean(new String(iArr, 0, i2));
    }
}
