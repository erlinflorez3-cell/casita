package com.valid.utils;

import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class BuildConfig {
    public static final String APPLICATION_ID;
    public static final String BUILD_TYPE;
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = C1561oA.Qd("GBC@A", (short) (C1607wl.Xd() ^ (OY.Xd() ^ (140883532 ^ 206482571))));

    static {
        int iXd = OY.Xd() ^ (-69932346);
        int iXd2 = FB.Xd() ^ (1861787265 ^ (-823648840));
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["PDLFCVI".length()];
        QB qb = new QB("PDLFCVI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        BUILD_TYPE = new String(iArr, 0, i2);
        APPLICATION_ID = C1561oA.od("\u007f\u000b\bG\u000fx\u0003~xA\b\u0006y{\u0002", (short) (FB.Xd() ^ (144817256 ^ 144816322)));
    }
}
