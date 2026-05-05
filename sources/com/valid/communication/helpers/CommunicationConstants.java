package com.valid.communication.helpers;

import com.dynatrace.android.agent.AdkSettings;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CommunicationConstants {
    public static final String AMPERSAND_SIGN;
    public static final String APPLICATION_CODE;
    public static final String APPLICATION_ID;
    public static final String APPLICATION_VERSION;
    public static final String AUTHORIZATION;
    public static final Integer BAD_REQUEST_CODE;
    public static final String BANK_PUBLIC_KEY;
    public static final int CANT_DECRYPT = -1013;
    public static final String CERTIFICATE;
    public static final String CFBUNDLE;
    public static final String CHAINS;
    public static final String CHAIN_CONTENT;
    public static final String CHANNEL_TYPE;
    public static final String CHANNEL_TYPE_VALUE;
    public static final String CLIENT_HELLO_ENDPOINT;
    public static final String CODE_VALID_APPLICATION;
    public static final String CONNECT_EXCEPTION;
    public static final int CONNECT_EXCEPTION_CODE = -1004;
    public static final String CONTENT_TYPE;
    public static final String CONTENT_TYPE_VALUE;
    public static final String DATA;
    public static final int DELETE = 3;
    public static final String DERIVE_KEY_ENDPOINT;
    public static final String DEVICE_ID;
    public static final String DOMAIN_SERVER;
    public static final String EMPTY = "";
    public static final String EQUAL_SIGN;
    public static final String EXCHANGE_KEY_ENDPOINT;
    public static final int EXCHANGE_KEY_IS_NULL = -1010;
    public static final int EXCHANGE_KEY_REQUEST = 5;
    public static final int FAIL_CONNECTION_NO_EXIST = 15;
    public static final int GET = 0;
    public static final int GET_CERTIFICATES_IS_NULL = -1011;
    public static final String GET_CERTIFICATE_ENDPOINT;
    public static final String ID_DATA;
    public static final String ID_TYPE;
    public static final String KEY;
    public static final int MAX_BYTES = 10485760;
    public static final String MESSAGE;
    public static final String NEW_LINE;
    public static final String OS_TYPE;
    public static final String OS_TYPE_VALUE;
    public static final int POST = 1;
    public static final int POST_WITHOUT_HEADER = 4;
    public static final String PUBLIC_KEY;
    public static final int PUT = 2;
    public static final String QUESTION_SIGN;
    public static final String RESPONSE;
    public static final String SDK_VERSION;
    public static final String SERVICE_NAME;
    public static final String SESSION_ID;
    public static final String SIGN;
    public static final String SN_DERIVE_KEY;
    public static final String SN_EXCHANGE_KEY;
    public static final Integer STATUS_CODE_SUCCESS;
    public static final int STATUS_TIME_OUT = -1012;
    public static final int UNKNOWN_EXCEPTION_CODE = -2000;
    public static final int UNKNOWN_HOST_EXCEPTION_CODE = -1009;
    public static final String UTF_8 = Ig.wd("w&\u0006MX", (short) (Od.Xd() ^ ((559999100 ^ 1095364877) ^ (-1613316450))));
    public static final String UNKNOWN_HOST_EXCEPTION = EO.Od("'\u0012\\;\\\"1B\u0019|w.\r\u0006\u0004p\u0012pNy", (short) (C1580rY.Xd() ^ ((1271729026 ^ 1980411365) ^ (-1036490034))));
    public static final String UNIQUE_ID_SIGNED = C1561oA.Qd("kc]dgV9SAVSYOM", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (794315016 ^ (-1755698581)))));
    public static final String STATUS_CODE_COMMUNICATION = C1593ug.zd("\u001e \u000e\"$#s!\u0017\u0019", (short) (C1607wl.Xd() ^ (1839096561 ^ 1839096426)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (395422351 ^ (-1673565900)))));
    public static final String STATUS_CODE = C1561oA.od("YYEWWT#NBB", (short) (C1499aX.Xd() ^ ((1029020552 ^ 2128466085) ^ (-1132996167))));

    public class Exception extends RuntimeException {
    }

    static {
        short sXd = (short) (OY.Xd() ^ (1617067855 ^ 1617041039));
        int[] iArr = new int["=Q=C=KED+F[".length()];
        QB qb = new QB("=Q=C=KED+F[");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        SN_EXCHANGE_KEY = new String(iArr, 0, i2);
        SN_DERIVE_KEY = Wg.Zd("'E7L|iTi$", (short) (FB.Xd() ^ (Od.Xd() ^ 1207815339)), (short) (FB.Xd() ^ (FB.Xd() ^ (472862826 ^ 1136657520))));
        SIGN = C1561oA.Xd("\u0003yx\u0001", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951497911))));
        SESSION_ID = Wg.vd("\"\u0013 \u001f\u0014\u0019\u0017p\u000b", (short) (Od.Xd() ^ (OY.Xd() ^ (-69932195))));
        SERVICE_NAME = Qg.kd("\u0012\u0003\u000f\u0012\u0004|}ew\u0003y", (short) (Od.Xd() ^ (1663036021 ^ (-1663024288))), (short) (Od.Xd() ^ ((771585348 ^ 1672084251) ^ (-1314186403))));
        SDK_VERSION = hg.Vd("M=C-;GG<A?", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (674873116 ^ (-1805815633)))), (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849982544)));
        short sXd2 = (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1556413294 ^ 456748779)));
        int[] iArr2 = new int["D6C?=;?0".length()];
        QB qb2 = new QB("D6C?=;?0");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        RESPONSE = new String(iArr2, 0, i3);
        short sXd3 = (short) (C1499aX.Xd() ^ (1746350253 ^ (-1746368899)));
        int[] iArr3 = new int["X".length()];
        QB qb3 = new QB("X");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
            i4++;
        }
        QUESTION_SIGN = new String(iArr3, 0, i4);
        PUBLIC_KEY = C1561oA.Yd("?E3><7 ;P", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (451633779 ^ 1500513980))));
        OS_TYPE_VALUE = Xg.qd("7E<KID@", (short) (OY.Xd() ^ (ZN.Xd() ^ 864704271)), (short) (OY.Xd() ^ (1310778480 ^ 1310764743)));
        OS_TYPE = Jg.Wd("q\u001b;&a\u0019", (short) (ZN.Xd() ^ (416317133 ^ 416291187)), (short) (ZN.Xd() ^ ((1037231888 ^ 782841882) ^ 326879735)));
        int iXd = C1580rY.Xd() ^ (915049180 ^ (-117695536));
        int iXd2 = C1607wl.Xd() ^ (557682640 ^ 1333368515);
        short sXd4 = (short) (ZN.Xd() ^ iXd);
        short sXd5 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr4 = new int[AdkSettings.PLATFORM_TYPE_MOBILE.length()];
        QB qb4 = new QB(AdkSettings.PLATFORM_TYPE_MOBILE);
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd5) + sXd4)));
            i5++;
        }
        NEW_LINE = new String(iArr4, 0, i5);
        MESSAGE = C1626yg.Ud("\tI\b[A%[", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207814524))), (short) (C1499aX.Xd() ^ ((497329020 ^ 1375025523) ^ (-1280440864))));
        KEY = Ig.wd("S\u001e\u0010", (short) (OY.Xd() ^ ((1972158935 ^ 1521567728) ^ 792563241)));
        short sXd6 = (short) (Od.Xd() ^ ((1693907222 ^ 1679951434) ^ (-13928037)));
        int[] iArr5 = new int["z$D\u000f'a".length()];
        QB qb5 = new QB("z$D\u000f'a");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i6)) + xuXd5.CK(iKK5));
            i6++;
        }
        ID_TYPE = new String(iArr5, 0, i6);
        ID_DATA = C1561oA.Qd("\u0012\fj\u0007\u0019\u0005", (short) (C1580rY.Xd() ^ ((14635452 ^ 451267274) ^ (-440058217))));
        GET_CERTIFICATE_ENDPOINT = C1593ug.zd("v</.A?7CI\u007f98H\u0018;ILB@D?>RDS", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1918937339 ^ (-838593961)))), (short) (C1607wl.Xd() ^ (1538755147 ^ 1538779511)));
        short sXd7 = (short) (C1580rY.Xd() ^ ((370577709 ^ 823081989) ^ (-655984051)));
        int[] iArr6 = new int["3dwuh.cu_c[g_\\AZm".length()];
        QB qb6 = new QB("3dwuh.cu_c[g_\\AZm");
        int i7 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i7] = xuXd6.fK(sXd7 + sXd7 + i7 + xuXd6.CK(iKK6));
            i7++;
        }
        EXCHANGE_KEY_ENDPOINT = new String(iArr6, 0, i7);
        short sXd8 = (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849976153));
        int[] iArr7 = new int["\b".length()];
        QB qb7 = new QB("\b");
        int i8 = 0;
        while (qb7.YK()) {
            int iKK7 = qb7.KK();
            Xu xuXd7 = Xu.Xd(iKK7);
            iArr7[i8] = xuXd7.fK(xuXd7.CK(iKK7) - ((sXd8 + sXd8) + i8));
            i8++;
        }
        EQUAL_SIGN = new String(iArr7, 0, i8);
        int iXd3 = C1580rY.Xd() ^ (312286561 ^ 588540849);
        int iXd4 = C1633zX.Xd() ^ (1505803838 ^ 764522989);
        short sXd9 = (short) (C1633zX.Xd() ^ iXd3);
        short sXd10 = (short) (C1633zX.Xd() ^ iXd4);
        int[] iArr8 = new int["\\4^\u000b?t\u001aT\u001eRm3#9".length()];
        QB qb8 = new QB("\\4^\u000b?t\u001aT\u001eRm3#9");
        int i9 = 0;
        while (qb8.YK()) {
            int iKK8 = qb8.KK();
            Xu xuXd8 = Xu.Xd(iKK8);
            iArr8[i9] = xuXd8.fK(((i9 * sXd10) ^ sXd9) + xuXd8.CK(iKK8));
            i9++;
        }
        DOMAIN_SERVER = new String(iArr8, 0, i9);
        DEVICE_ID = C1561oA.Xd("\u001d\u001f1% #\b$", (short) (C1633zX.Xd() ^ ((1033646606 ^ 1417852803) ^ (-1763634586))));
        DERIVE_KEY_ENDPOINT = Wg.vd("&k^]hf^jh\u001fUW]UcS2Mb", (short) (ZN.Xd() ^ (577152191 ^ 577149260)));
        short sXd11 = (short) (FB.Xd() ^ (67347348 ^ 67351080));
        short sXd12 = (short) (FB.Xd() ^ (1133013248 ^ 1133012179));
        int[] iArr9 = new int["}y\fw".length()];
        QB qb9 = new QB("}y\fw");
        int i10 = 0;
        while (qb9.YK()) {
            int iKK9 = qb9.KK();
            Xu xuXd9 = Xu.Xd(iKK9);
            iArr9[i10] = xuXd9.fK(((sXd11 + i10) + xuXd9.CK(iKK9)) - sXd12);
            i10++;
        }
        DATA = new String(iArr9, 0, i10);
        CONTENT_TYPE_VALUE = hg.Vd(")761-&#5).,k&.)'", (short) (FB.Xd() ^ (ZN.Xd() ^ 864696701)), (short) (FB.Xd() ^ ((604429115 ^ 764493224) ^ 160935801)));
        short sXd13 = (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864686757)));
        int[] iArr10 = new int["Q|z\u007fow|4Z~th".length()];
        QB qb10 = new QB("Q|z\u007fow|4Z~th");
        int i11 = 0;
        while (qb10.YK()) {
            int iKK10 = qb10.KK();
            Xu xuXd10 = Xu.Xd(iKK10);
            iArr10[i11] = xuXd10.fK(sXd13 + i11 + xuXd10.CK(iKK10));
            i11++;
        }
        CONTENT_TYPE = new String(iArr10, 0, i11);
        CONNECT_EXCEPTION = C1561oA.yd("t\"\"#\u0013\u0012$u\"\u000e\u0011\u001d\u001a\u0010\u0017\u0017", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609510598))));
        CODE_VALID_APPLICATION = C1561oA.Yd("\u000f\u001c\u0012\u0014\u0006\u0012\u001e\u001c\u0018u&'$\"\u001d\u001c0&--", (short) (ZN.Xd() ^ (OY.Xd() ^ 69956805)));
        CLIENT_HELLO_ENDPOINT = Xg.qd("!Tii^&[ec`jqFdlmq", (short) (Od.Xd() ^ ((308166414 ^ 160435757) ^ (-466513286))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1461893239 ^ (-963051149)))));
        short sXd14 = (short) (C1499aX.Xd() ^ (63037664 ^ (-63033905)));
        short sXd15 = (short) (C1499aX.Xd() ^ (1200506393 ^ (-1200514093)));
        int[] iArr11 = new int["=V\u00142/_".length()];
        QB qb11 = new QB("=V\u00142/_");
        int i12 = 0;
        while (qb11.YK()) {
            int iKK11 = qb11.KK();
            Xu xuXd11 = Xu.Xd(iKK11);
            iArr11[i12] = xuXd11.fK(xuXd11.CK(iKK11) - ((i12 * sXd15) ^ sXd14));
            i12++;
        }
        CHANNEL_TYPE_VALUE = new String(iArr11, 0, i12);
        CHANNEL_TYPE = ZO.xd("\u000e\r\u0016\u0014K$\u0014IbVB", (short) (C1499aX.Xd() ^ (847077984 ^ (-847079486))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1047197742 ^ 1245433455))));
        int iXd5 = C1499aX.Xd() ^ (1572030945 ^ 505953968);
        int iXd6 = C1580rY.Xd() ^ (797906157 ^ 503716265);
        short sXd16 = (short) (C1633zX.Xd() ^ iXd5);
        short sXd17 = (short) (C1633zX.Xd() ^ iXd6);
        int[] iArr12 = new int["\"\fhn\u0002{H0\\&<\\".length()];
        QB qb12 = new QB("\"\fhn\u0002{H0\\&<\\");
        int i13 = 0;
        while (qb12.YK()) {
            int iKK12 = qb12.KK();
            Xu xuXd12 = Xu.Xd(iKK12);
            iArr12[i13] = xuXd12.fK((C1561oA.Xd[i13 % C1561oA.Xd.length] ^ ((sXd16 + sXd16) + (i13 * sXd17))) + xuXd12.CK(iKK12));
            i13++;
        }
        CHAIN_CONTENT = new String(iArr12, 0, i13);
        CHAINS = Ig.wd("3\u0015\u001eCV\u0017", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951469377))));
        CFBUNDLE = EO.Od("/\u0002\u007f[E\u0010kEu/,U&\nh\u001cqa \u0017>\u001c0+b_", (short) (C1607wl.Xd() ^ (827991598 ^ 828012827)));
        CERTIFICATE = C1561oA.Qd("rs\u007f\u0001tprkhzj>#", (short) (Od.Xd() ^ ((889266734 ^ 199591694) ^ (-1055170526))));
        BANK_PUBLIC_KEY = C1593ug.zd("jjxv\\\u0003p{yt]x\u000e", (short) (OY.Xd() ^ (565307220 ^ 565301983)), (short) (OY.Xd() ^ ((2001217529 ^ 1538259453) ^ 753374795)));
        AUTHORIZATION = C1561oA.od(" SQDJLBR8J>CA", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609523982))));
        APPLICATION_VERSION = C1561oA.Kd("cstqoji}szzcs\u0002\u0004z\u0002\u0002", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (744738816 ^ (-1938618019)))));
        APPLICATION_ID = Wg.Zd("CZ%jB\u0016^;hH\u0012F,", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864697127)), (short) (ZN.Xd() ^ (Od.Xd() ^ (1118519048 ^ 89580403))));
        APPLICATION_CODE = C1561oA.Xd("4DEB@;:NDKK!NDF", (short) (C1580rY.Xd() ^ (2050971627 ^ (-2050976268))));
        short sXd18 = (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951478473)));
        int[] iArr13 = new int["H".length()];
        QB qb13 = new QB("H");
        int i14 = 0;
        while (qb13.YK()) {
            int iKK13 = qb13.KK();
            Xu xuXd13 = Xu.Xd(iKK13);
            iArr13[i14] = xuXd13.fK((sXd18 ^ i14) + xuXd13.CK(iKK13));
            i14++;
        }
        AMPERSAND_SIGN = new String(iArr13, 0, i14);
        try {
            STATUS_CODE_SUCCESS = 0;
            BAD_REQUEST_CODE = Integer.valueOf(1088666541 ^ 1088666173);
        } catch (Exception unused) {
        }
    }
}
