package com.davivienda.daviviendaapp;

import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class BuildConfig {
    public static final String APPLICATION_ID;
    public static final String BUILD_TYPE;
    public static final boolean DEBUG = false;
    public static final boolean IS_HERMES_ENABLED = true;
    public static final boolean IS_NEW_ARCHITECTURE_ENABLED = false;
    public static final int VERSION_CODE = 8100;
    public static final String VERSION_NAME;

    static {
        int iXd = C1633zX.Xd() ^ (-1951475830);
        VERSION_NAME = hg.Vd("(\u001d\u001f\u001b\u001d", (short) (C1607wl.Xd() ^ ((1523885433 ^ 1397924548) ^ 159805404)), (short) (C1607wl.Xd() ^ iXd));
        short sXd = (short) (Od.Xd() ^ (Od.Xd() ^ (-1207798604)));
        int[] iArr = new int["SEKC>O@".length()];
        QB qb = new QB("SEKC>O@");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        BUILD_TYPE = new String(iArr, 0, i2);
        short sXd2 = (short) (FB.Xd() ^ ((1113988874 ^ 346311231) ^ 1455569749));
        int[] iArr2 = new int["9DA\u0001>:N@TFAIFB\u000eC';-93.6+/.<;".length()];
        QB qb2 = new QB("9DA\u0001>:N@TFAIFB\u000eC';-93.6+/.<;");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        APPLICATION_ID = new String(iArr2, 0, i3);
    }
}
