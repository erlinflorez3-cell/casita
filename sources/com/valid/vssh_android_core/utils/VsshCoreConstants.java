package com.valid.vssh_android_core.utils;

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
public class VsshCoreConstants {
    public static final String EP_CLIENT_HELLO;
    public static final String EP_GENERATE_OTP;
    public static final String EP_GET_CARD_ACCOUNT_INFO;
    public static final String EP_GET_DOCUMENT_TYPE;
    public static final String EP_GET_PARAMETERS;
    public static final String EP_LOGIN;
    public static final String EP_RECOVERY;
    public static final String EP_REGISTER;
    public static final String EP_TRANSACTIONS;
    public static final String EP_VALIDATE_OTP;
    public static final String EXCEPTION_NULL_COMMUNICATION_INSTANCE;
    public static final String INVALID_CALLBACK_MESSAGE;
    public static final Integer INVALID_COMMUNICATION_LIBRARY_RESPONSE_CODE;
    public static final String INVALID_COMMUNICATION_LIBRARY_RESPONSE_MESSAGE;
    public static final Integer INVALID_PRINCIPAL_DATA_CODE;
    public static final String INVALID_PRINCIPAL_DATA_MESSAGE;
    public static final String PARAM_ADDITIONAL_DATA;
    public static final String PARAM_AMOUNT;
    public static final String PARAM_APPLICATION_CODE;
    public static final String PARAM_APPLICATION_ID;
    public static final String PARAM_APPLICATION_VERSION;
    public static final String PARAM_CELLPHONE;
    public static final String PARAM_DEVICE_ID;
    public static final String PARAM_EMAIL;
    public static final String PARAM_ENCRYPTED;
    public static final String PARAM_ID_DATA;
    public static final String PARAM_ID_TYPE;
    public static final String PARAM_INDEX;
    public static final String PARAM_OTP;
    public static final String PARAM_PASS;
    public static final String PARAM_PLAIN;
    public static final String PARAM_PRINCIPAL_DATA;
    public static final String PARAM_SDK_VERSION;
    public static final String PARAM_SIZE_LIMIT;
    public static final Integer QUALITY_IMAGE;
    public static final String SN_CLIENT_HELLO;
    public static final String SN_DOCUMENT_TYPE;
    public static final String SN_GET_CARD_ACCOUNT_INFO;
    public static final String SN_GET_CERTIFICATES;
    public static final String SN_GET_PARAMETERS;
    public static final String SN_GET_TRANSACTIONS;
    public static final String SN_PAY;
    public static final String SN_SCAN_DOCUMENT;
    public static final String SN_UPLOAD_IMAGE;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    static {
        int iXd = C1580rY.Xd() ^ (1668147348 ^ (-1390726441));
        SN_UPLOAD_IMAGE = C1626yg.Ud("\u0018#2Xi\u0002]&&#w", (short) (OY.Xd() ^ ((1827826923 ^ 1749262877) ^ 78774244)), (short) (OY.Xd() ^ iXd));
        short sXd = (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864682235)));
        int[] iArr = new int["@j\u0015<75\u0007W\u007fZcM".length()];
        QB qb = new QB("@j\u0015<75\u0007W\u007fZcM");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        SN_SCAN_DOCUMENT = new String(iArr, 0, i2);
        SN_PAY = EO.Od("\u001f_K", (short) (C1607wl.Xd() ^ (1008954073 ^ 1008948366)));
        SN_GET_TRANSACTIONS = C1561oA.Qd("\u0010\r\u001by\u0017\u0005\u0011\u0015\u0002\u0003\u0013\u0007\f\n\u000e", (short) (ZN.Xd() ^ (2102447499 ^ 2102446302)));
        SN_GET_PARAMETERS = C1593ug.zd("Lokao_op.Fdz2Vhzjwp\u0001r\u0001\u0003", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831062783))), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (1345310842 ^ (-1638316267)))));
        SN_GET_CERTIFICATES = C1561oA.od("\u007f|\u000bXy\u0006\u0007zvxqn\u0001p}", (short) (C1633zX.Xd() ^ ((1028822999 ^ 733628754) ^ (-384349542))));
        SN_GET_CARD_ACCOUNT_INFO = C1561oA.Kd("-,<\f+=0\u000e12?F@G\u001dC<FJF;OELL", (short) (C1580rY.Xd() ^ ((1361350107 ^ 485357854) ^ (-1305033844))));
        SN_DOCUMENT_TYPE = Wg.Zd("]:cz\bED\f\u0001\u000bW21n\u001eB", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207823173))), (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (404275303 ^ (-1985790587)))));
        SN_CLIENT_HELLO = C1561oA.Xd("AKIFPW,JRSW", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (1921213110 ^ (-482822669)))));
        PARAM_SIZE_LIMIT = Wg.vd("6+;%\u000b'*%?", (short) (Od.Xd() ^ ((1822199175 ^ 1721393183) ^ (-168221755))));
        int iXd2 = Od.Xd() ^ (-1207800418);
        short sXd2 = (short) (C1580rY.Xd() ^ (318575601 ^ (-318577937)));
        short sXd3 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr2 = new int["\r|\u0003lz\u0007\u0007{\u0001~".length()];
        QB qb2 = new QB("\r|\u0003lz\u0007\u0007{\u0001~");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        PARAM_SDK_VERSION = new String(iArr2, 0, i3);
        short sXd4 = (short) (FB.Xd() ^ (277643984 ^ 277673097));
        short sXd5 = (short) (FB.Xd() ^ ((1027175891 ^ 1132006407) ^ 2118132203));
        int[] iArr3 = new int["XYOSGLRBL#?Q=".length()];
        QB qb3 = new QB("XYOSGLRBL#?Q=");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
            i4++;
        }
        PARAM_PRINCIPAL_DATA = new String(iArr3, 0, i4);
        PARAM_PLAIN = C1561oA.ud("c^RY]", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951480344)));
        PARAM_PASS = C1561oA.yd("~n\u007f~\u0002xzk", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1479519740 ^ 464834363))));
        PARAM_OTP = C1561oA.Yd("\u001e$!", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864710721))));
        PARAM_INDEX = Xg.qd("-3*,@", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1302936458 ^ (-306596478)))), (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69959135))));
        PARAM_ID_TYPE = Jg.Wd("~1hU\u0014P", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (798049148 ^ 1812612956))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1278928091 ^ (-332779228)))));
        PARAM_ID_DATA = ZO.xd("E\u001f\u0011d,`", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207827438)), (short) (C1607wl.Xd() ^ (1180005486 ^ 1179992203)));
        PARAM_ENCRYPTED = C1626yg.Ud("\u0001\u001bmZ\u0006d.$4", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (1742899516 ^ 1449909758))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1169586539 ^ 103628003))));
        PARAM_EMAIL = Ig.wd("u1Q\u0004\u0015", (short) (C1580rY.Xd() ^ ((674259184 ^ 324416814) ^ (-996571358))));
        PARAM_DEVICE_ID = EO.Od("6d&6R\"gL", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849981413))));
        PARAM_CELLPHONE = C1561oA.Qd(">?EDG>DB8", (short) (ZN.Xd() ^ ((715356342 ^ 2138195947) ^ 1439790943)));
        int iXd3 = OY.Xd() ^ (-69940081);
        short sXd6 = (short) (Od.Xd() ^ (534199481 ^ (-534199178)));
        short sXd7 = (short) (Od.Xd() ^ iXd3);
        int[] iArr4 = new int["*:;8610D:AA*:HJAHH".length()];
        QB qb4 = new QB("*:;8610D:AA*:HJAHH");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) - sXd7);
            i5++;
        }
        PARAM_APPLICATION_VERSION = new String(iArr4, 0, i5);
        PARAM_APPLICATION_ID = C1561oA.od("\u001a('\"\u001e\u0017\u0014&\u001a\u001f\u001dv\u0011", (short) (C1607wl.Xd() ^ ((274943107 ^ 339455730) ^ 72928332)));
        short sXd8 = (short) (C1633zX.Xd() ^ (2076819260 ^ (-2076830418)));
        int[] iArr5 = new int["\\lmjhcbvlssIvln".length()];
        QB qb5 = new QB("\\lmjhcbvlssIvln");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((sXd8 + sXd8) + i6));
            i6++;
        }
        PARAM_APPLICATION_CODE = new String(iArr5, 0, i6);
        int iXd4 = FB.Xd() ^ 1609499662;
        PARAM_AMOUNT = Wg.Zd("J@L|\u007f0", (short) (FB.Xd() ^ (1265990162 ^ 1265979200)), (short) (FB.Xd() ^ iXd4));
        PARAM_ADDITIONAL_DATA = C1561oA.Xd("Z^_eqgnnbnGeyg", (short) (OY.Xd() ^ (ZN.Xd() ^ 864711668)));
        INVALID_PRINCIPAL_DATA_MESSAGE = Wg.vd("U{\u0005p|zv3twoukrzl\t=\u0003\u0001\u0015\u0003", (short) (OY.Xd() ^ (1807367873 ^ 1807362078)));
        INVALID_COMMUNICATION_LIBRARY_RESPONSE_MESSAGE = Qg.kd("\u0002\u0015\u0011J\u001c\u000e\u001b\u0017\u0015\u0013\u0017\bA\u0004\u000f\f\u000b\u0012\n\u0004|y\f\u007f\u0005\u00033~zr\u0002o\u007f\u0006+s|(pt{eoke", (short) (OY.Xd() ^ ((991364 ^ 335340400) ^ 334753663)), (short) (OY.Xd() ^ ((258352843 ^ 1860880050) ^ 1636629410)));
        INVALID_CALLBACK_MESSAGE = hg.Vd("Mqmjq%xkg!c`ji^\\]d\u0018d[i\\bV", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (1485137712 ^ (-528013391)))), (short) (C1499aX.Xd() ^ (1886882365 ^ (-1886883149))));
        EXCEPTION_NULL_COMMUNICATION_INSTANCE = C1561oA.ud("@SO\tKVSRYQKDASGLJzCGKK7C78q:Cn<B87", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (735836408 ^ 1749081884))));
        EP_VALIDATE_OTP = C1561oA.yd(" hT`^ZXlN", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134242840)));
        EP_TRANSACTIONS = C1561oA.Yd("d,+\u001e,i#\"2\u00132\"06%(:077=", (short) (OY.Xd() ^ (1774359853 ^ 1774369448)));
        EP_REGISTER = Xg.qd("F\u000b~\u0002\u0005\u0010\u0012\u0004\u0012O\u0014\b\u000b\u000e\u0019\u001b\r\u001b~\u001e\u0011\u001f", (short) (C1607wl.Xd() ^ ((641025124 ^ 327711342) ^ 901595623)), (short) (C1607wl.Xd() ^ (1093458752 ^ 1093457317)));
        EP_RECOVERY = Jg.Wd("4\u0002\u001a\u00025\f:Bs|}\u0010\u0013/WM\u000b\u000b\u0006\u0011", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (2047089054 ^ 339767289))), (short) (ZN.Xd() ^ (OY.Xd() ^ 69954780)));
        EP_LOGIN = ZO.xd("3,K]So\u000b\u0002ev[\u0004\u0002\u0003\u00048\u0018pk\u0015", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849982212)), (short) (OY.Xd() ^ ((523264004 ^ 179789378) ^ 361190019)));
        EP_GET_PARAMETERS = C1626yg.Ud("\nN|lv\u0013?s{]m^\u001e\u0002<\u001e\u0005#\u0005", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (789120803 ^ (-1821515930)))), (short) (OY.Xd() ^ (1994266150 ^ 1994262226)));
        EP_GET_DOCUMENT_TYPE = Ig.wd("y~&3c'\rS7$Qd+p+@\u001b", (short) (C1633zX.Xd() ^ ((336491333 ^ 1009209857) ^ (-673790015))));
        EP_GET_CARD_ACCOUNT_INFO = EO.Od("D\u001f\r\u007f\u000bE}\u001fz>3\u001d#kcVb\u0001K'C\u000bfxn]CUZ\"\u0001gt\bF~\u001cA", (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134253753)));
        short sXd9 = (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831065255));
        int[] iArr6 = new int[">urzp|j|l".length()];
        QB qb6 = new QB(">urzp|j|l");
        int i7 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i7] = xuXd6.fK(sXd9 + sXd9 + sXd9 + i7 + xuXd6.CK(iKK6));
            i7++;
        }
        EP_GENERATE_OTP = new String(iArr6, 0, i7);
        EP_CLIENT_HELLO = C1593ug.zd("n\"77,s)31.8?\u00142:;?", (short) (Od.Xd() ^ (1353346780 ^ (-1353328265))), (short) (Od.Xd() ^ ((1580789288 ^ 1293010121) ^ (-321473195))));
        try {
            INVALID_PRINCIPAL_DATA_CODE = Integer.valueOf(C1607wl.Xd() ^ (983283895 ^ (-1423943919)));
            INVALID_COMMUNICATION_LIBRARY_RESPONSE_CODE = Integer.valueOf((1835160075 ^ 1144265025) ^ (-693520591));
            QUALITY_IMAGE = Integer.valueOf((1204424034 ^ 1984652209) ^ 830566071);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
