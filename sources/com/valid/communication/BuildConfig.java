package com.valid.communication;

import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class BuildConfig {
    public static final String APPLICATION_ID;
    public static final String BUILD_TYPE;
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 2;
    public static final String VERSION_NAME;

    static {
        short sXd = (short) (Od.Xd() ^ (1600379025 ^ (-1600368862)));
        int[] iArr = new int["D?B=>".length()];
        QB qb = new QB("D?B=>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        VERSION_NAME = new String(iArr, 0, i2);
        BUILD_TYPE = C1561oA.yd("\f\u007f\u0004}~\u0012\u0001", (short) (ZN.Xd() ^ ((83746480 ^ 165783044) ^ 219939150)));
        short sXd2 = (short) (C1607wl.Xd() ^ (766684013 ^ 766687632));
        int[] iArr2 = new int["_lk-vbnlh3ivuv\u007fyupo\u0004y\u0001\u0001".length()];
        QB qb2 = new QB("_lk-vbnlh3ivuv\u007fyupo\u0004y\u0001\u0001");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        APPLICATION_ID = new String(iArr2, 0, i3);
    }
}
