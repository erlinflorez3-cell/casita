package com.valid.security.helpers;

import com.valid.security.BuildConfig;
import com.valid.security.entities.EncryptionType;
import com.valid.utils.VsshLogger;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
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
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class CipherHelperImp implements CipherHelper {
    private static final String TAG = ZO.xd("\u000eZY&Z|C}c\u0010&G*.du\u0007\u001el\u00154$k\b\u0014!\u000bgu0g0\rJo;x\u001d!\u0019q\\", (short) (FB.Xd() ^ (Od.Xd() ^ (1701487165 ^ 580349798))), (short) (FB.Xd() ^ (OY.Xd() ^ (951232169 ^ 1016701658))));

    /* JADX INFO: renamed from: com.valid.security.helpers.CipherHelperImp$1 */
    static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$valid$security$entities$EncryptionType;

        static {
            int[] iArr = new int[EncryptionType.values().length];
            $SwitchMap$com$valid$security$entities$EncryptionType = iArr;
            try {
                iArr[EncryptionType.AES_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$valid$security$entities$EncryptionType[EncryptionType.RSA_ECB0AEP_SHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$valid$security$entities$EncryptionType[EncryptionType.RSA_PKCS1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$valid$security$entities$EncryptionType[EncryptionType.RSA_ECB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$valid$security$entities$EncryptionType[EncryptionType.RSA_OAEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$valid$security$entities$EncryptionType[EncryptionType.DES_CBC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.valid.security.helpers.CipherHelperImp$2 */
    public class AnonymousClass2 {
        public static String concat(int i2, String str) {
            int i3;
            int i4;
            String str2;
            int i5;
            int i6;
            int i7;
            int i8;
            char[] charArray;
            int i9;
            int length;
            String strQd = Xg.qd("\u0003", (short) (C1580rY.Xd() ^ ((349461725 ^ 343071128) ^ (-10917052))), (short) (C1580rY.Xd() ^ (142052430 ^ (-142077691))));
            try {
                int i10 = Integer.parseInt(strQd);
                String strWd = Jg.Wd("}d", (short) (C1607wl.Xd() ^ ((2003031318 ^ 1920063768) ^ 85072405)), (short) (C1607wl.Xd() ^ ((1540149398 ^ 1952168808) ^ 798450197)));
                int i11 = 1;
                if (i10 != 0) {
                    i3 = 173133699 ^ 173133697;
                    i4 = 1812149746 ^ 1812149752;
                    str2 = strQd;
                    i5 = 0;
                } else {
                    i3 = 175124128 ^ 175124132;
                    i4 = (811491257 ^ 87012448) ^ 896658398;
                    str2 = strWd;
                    i5 = 1;
                }
                if (i4 != 0) {
                    i8 = i5 + i3;
                    str2 = strQd;
                    i6 = 0;
                    i7 = 0;
                } else {
                    i6 = i4 + 6;
                    i7 = i5;
                    i8 = i3;
                }
                if (Integer.parseInt(str2) != 0) {
                    i9 = i6 + 9;
                    charArray = null;
                    i7 = 1;
                    strWd = str2;
                } else {
                    i2++;
                    charArray = str.toCharArray();
                    i9 = i6 + 11;
                }
                if (i9 != 0) {
                    length = charArray.length;
                } else {
                    strQd = strWd;
                    length = 1;
                }
                if (Integer.parseInt(strQd) != 0) {
                    charArray = null;
                } else {
                    i3 <<= i8;
                    i11 = i7;
                }
                int i12 = (i3 - 1) ^ 32;
                while (i11 != length) {
                    int i13 = charArray[i11] ^ ((-1) - (((-1) - i2) | ((-1) - i12)));
                    i2 += 13;
                    charArray[i11] = (char) i13;
                    i11++;
                }
                return String.valueOf(charArray, 0, length).intern();
            } catch (ParseException unused) {
                return null;
            }
        }
    }

    public class ParseException extends RuntimeException {
    }

    private static Cipher newCipher(String str) {
        try {
            return Cipher.getInstance(str);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return null;
        }
    }

    @Override // com.valid.security.helpers.CipherHelper
    public Cipher getCipher(EncryptionType encryptionType) {
        int iXd;
        int iXd2;
        String strOd;
        int iXd3;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        String strConcat;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String strKd;
        int iXd4;
        int i13;
        int i14;
        String str3;
        int i15;
        int i16;
        int i17 = AnonymousClass1.$SwitchMap$com$valid$security$entities$EncryptionType[encryptionType.ordinal()];
        int i18 = 15;
        int i19 = 3;
        char c2 = 11;
        int i20 = (1119279367 ^ 319157132) ^ 1370696332;
        int iXd5 = FB.Xd() ^ 1609527103;
        int i21 = 18;
        int i22 = 14;
        int iXd6 = C1607wl.Xd() ^ (2137226277 ^ 287797237);
        int i23 = 2;
        int iXd7 = C1580rY.Xd() ^ (930396895 ^ (-117288646));
        int i24 = (1889818635 ^ 1733426125) ^ 401974223;
        String strUd = C1626yg.Ud("I", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (384256968 ^ (-1360704598)))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (188760106 ^ 2131825523))));
        int i25 = 0;
        String strWd = Ig.wd("6", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207801434))));
        switch (i17) {
            case 1:
                if (Integer.parseInt(strWd) != 0) {
                    strUd = strWd;
                    iXd4 = 1;
                } else {
                    iXd4 = ZN.Xd() ^ 864698064;
                    i22 = iXd7;
                }
                if (i22 != 0) {
                    iXd2 = iXd4 + 8;
                    i = 2;
                } else {
                    i25 = i22 + 4;
                    strWd = strUd;
                    iXd2 = 1;
                    iXd7 = 1;
                }
                if (Integer.parseInt(strWd) != 0) {
                    i13 = i25 + 13;
                } else {
                    iXd2 += iXd7 << i;
                    i13 = i25 + 6;
                    iXd7 = C1607wl.Xd() ^ (243412416 ^ 1623604767);
                }
                if (i13 != 0) {
                    iXd2 /= iXd7 << 2;
                }
                strOd = Wg.Zd("\n\u0003y^h+(x\u0016.q!\u001b\u007f\r\u0001t", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (840805749 ^ 1904643085))), (short) (C1499aX.Xd() ^ (892463897 ^ (-892446018))));
                strConcat = BuildConfig.AnonymousClass1.equals(strOd, iXd2);
                break;
            case 2:
                if (Integer.parseInt(strWd) != 0) {
                    str2 = strWd;
                    i21 = 1;
                } else {
                    i18 = iXd5;
                    str2 = strUd;
                }
                if (i18 != 0) {
                    i21 += i21 + i21;
                    i8 = 0;
                    str2 = strWd;
                } else {
                    i8 = i18 + iXd6;
                }
                if (Integer.parseInt(str2) != 0) {
                    i10 = i8 + iXd6;
                    strUd = str2;
                    i9 = 1;
                    i19 = 1;
                } else {
                    i9 = i21 + i24;
                    i10 = i8 + 14;
                }
                if (i10 != 0) {
                    i9 += i19 + i19;
                    i11 = 0;
                    i25 = i24;
                } else {
                    i11 = i10 + 8;
                    strWd = strUd;
                }
                if (Integer.parseInt(strWd) != 0) {
                    i12 = i11 + iXd5;
                } else {
                    i = i25 + i25;
                    i12 = i11 + i24;
                }
                if (i12 != 0) {
                    i9 /= i25 + i;
                    strKd = C1561oA.Kd("`Sm7e\u001b(\b\u001b1Y\\c\u0002\u000bLݍ(-\u001aUIXu\u001dTA/4\u001a\u0007&\u0017%&Vc", (short) (C1633zX.Xd() ^ ((633183642 ^ 523218975) ^ (-982656477))));
                } else {
                    strKd = null;
                }
                strConcat = AnonymousClass2.concat(i9, strKd);
                break;
            case 3:
                if (Integer.parseInt(strWd) != 0) {
                    strUd = strWd;
                    iXd2 = 1;
                    iXd7 = 1;
                } else {
                    iXd2 = Od.Xd() ^ (1999809664 ^ 818886723);
                    iXd5 = iXd6;
                }
                if (iXd5 != 0) {
                    i = iXd7 + iXd7;
                    i6 = 0;
                } else {
                    i6 = iXd5 + i20;
                    strWd = strUd;
                }
                if (Integer.parseInt(strWd) != 0) {
                    i7 = i6 + 11;
                    iXd6 = 0;
                } else {
                    iXd2 += iXd7 + i;
                    i7 = i6 + 11;
                }
                if (i7 != 0) {
                    iXd2 /= iXd6 << 2;
                }
                strOd = C1561oA.od("\u0017\u0018\u0006k\u000b,+u,FOO?\u001e<idbmlc", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207821413)));
                strConcat = BuildConfig.AnonymousClass1.equals(strOd, iXd2);
                break;
            case 4:
                if (Integer.parseInt(strWd) != 0) {
                    i2 = 0;
                    str = strWd;
                    i21 = 1;
                } else {
                    iXd7 = 13;
                    i2 = i24;
                    str = strUd;
                }
                if (iXd7 != 0) {
                    i4 = i2 << 2;
                    i3 = 0;
                    str = strWd;
                } else {
                    i3 = iXd7 + 15;
                    i4 = 1;
                }
                if (Integer.parseInt(str) != 0) {
                    i5 = i3 + 6;
                    i23 = i4;
                    strUd = str;
                } else {
                    i21 += i4;
                    i5 = i3 + 13;
                    i = 2;
                }
                if (i5 != 0) {
                    i21 += i23 + i;
                } else {
                    strWd = strUd;
                    i24 = 0;
                }
                if (Integer.parseInt(strWd) == 0) {
                    i21 /= i24 + i24;
                }
                strConcat = AnonymousClass2.concat(i21, C1593ug.zd("P=[![\u0005\u0010q\u001e\u0015IE7d\u0004,:3,I", (short) (C1607wl.Xd() ^ (2097098312 ^ 2097096613)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951496608)))));
                break;
            case 5:
                if (Integer.parseInt(strWd) != 0) {
                    strUd = strWd;
                    iXd3 = 1;
                    iXd7 = 1;
                } else {
                    iXd3 = C1499aX.Xd() ^ (-1134258088);
                    c2 = 2;
                }
                if (c2 != 0) {
                    iXd3 += iXd7 + iXd7;
                } else {
                    strWd = strUd;
                }
                iXd2 = iXd3 / (Integer.parseInt(strWd) == 0 ? 1750506284 ^ 1750506248 : 1);
                strOd = C1561oA.Qd("\b\u0007tZ{\u001b\u001c\u0011\u001b:D@12TOa&=4\u001d\u0001,YE\u001c\"!\u0011/<?5@;2", (short) (C1607wl.Xd() ^ (1970457341 ^ 1970449918)));
                strConcat = BuildConfig.AnonymousClass1.equals(strOd, iXd2);
                break;
            case 6:
                if (Integer.parseInt(strWd) != 0) {
                    i19 = i20;
                    strUd = strWd;
                    iXd = 1;
                    iXd7 = 1;
                } else {
                    iXd = C1607wl.Xd() ^ 1849955185;
                }
                if (i19 != 0) {
                    iXd += iXd7 + iXd7;
                } else {
                    strWd = strUd;
                }
                iXd2 = iXd / (Integer.parseInt(strWd) == 0 ? 345904112 ^ 345904086 : 1);
                strOd = EO.Od("Hm5f!k\u001c[\u001aZ,g\u0018!\f\bW\u0016<}@z\u001f", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134250960))));
                strConcat = BuildConfig.AnonymousClass1.equals(strOd, iXd2);
                break;
            default:
                if (Integer.parseInt(strWd) != 0) {
                    i14 = 14;
                    str3 = strWd;
                    i21 = 1;
                } else {
                    i14 = i24;
                    str3 = strUd;
                }
                if (i14 != 0) {
                    i21 += i21 + i21;
                    i15 = 0;
                    str3 = strWd;
                } else {
                    i15 = i14 + 14;
                }
                if (Integer.parseInt(str3) != 0) {
                    i16 = i15 + 6;
                    strUd = str3;
                    i9 = 1;
                    i19 = 1;
                } else {
                    i9 = i21 + 9;
                    i16 = i15 + i20;
                    i = 3;
                }
                if (i16 != 0) {
                    i9 += i19 + i;
                } else {
                    strWd = strUd;
                    i24 = 0;
                }
                if (Integer.parseInt(strWd) == 0) {
                    i9 /= i24 + i24;
                }
                strKd = C1561oA.Xd("+;5\rEq|]\n\u000151'Po\u0018&\u001f\u00185", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (103544753 ^ (-1920632806)))));
                strConcat = AnonymousClass2.concat(i9, strKd);
                break;
        }
        return newCipher(strConcat);
    }
}
