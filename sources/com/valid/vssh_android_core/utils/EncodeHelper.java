package com.valid.vssh_android_core.utils;

import android.graphics.Bitmap;
import com.braze.Constants;
import com.valid.security.utils.SecurityUtils;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.model.response.ProcessImageResponse;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class EncodeHelper {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public static String bitmapToBase64(Bitmap bitmap) throws Throwable {
        int i2;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            short sXd = (short) (C1499aX.Xd() ^ (1406303636 ^ (-1406301226)));
            int[] iArr = new int["=".length()];
            QB qb = new QB("=");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            int i4 = (2059637250 ^ 178729966) ^ 1885643246;
            if (Integer.parseInt(new String(iArr, 0, i3)) != 0) {
                i2 = (1164123472 ^ 794399723) ^ 1782222517;
                byteArrayOutputStream = null;
            } else {
                bitmap.compress(Bitmap.CompressFormat.PNG, VsshCoreConstants.QUALITY_IMAGE.intValue(), byteArrayOutputStream);
                i2 = i4;
            }
            byte[] byteArray = i2 != 0 ? byteArrayOutputStream.toByteArray() : null;
            short sXd2 = (short) (C1633zX.Xd() ^ (521613416 ^ (-521617496)));
            int[] iArr2 = new int["zV\u0010\u007f\u001e=^YTA\u000e9JRO\t@\u0005L".length()];
            QB qb2 = new QB("zV\u0010\u007f\u001e=^YTA\u000e9JRO\t@\u0005L");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i5)) + xuXd2.CK(iKK2));
                i5++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i5));
            Class<?>[] clsArr = new Class[751945764 ^ 751945766];
            clsArr[0] = byte[].class;
            clsArr[1] = Integer.TYPE;
            Object[] objArr = new Object[(474369254 ^ 1287999951) ^ 1350769963];
            objArr[0] = byteArray;
            objArr[1] = Integer.valueOf(i4);
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("IQEPDD2L/OLBF>", (short) (FB.Xd() ^ ((2022386014 ^ 1297096558) ^ 903573491))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static String getHexSha256FromString(String str) {
        MessageDigest messageDigest;
        int i2;
        int i3;
        int i4;
        String strKd;
        String strZd = C1593ug.zd("=", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207806703))), (short) (C1633zX.Xd() ^ ((755091440 ^ 1447012652) ^ (-2067689896))));
        try {
            if (Integer.parseInt(strZd) != 0) {
                i2 = 1;
                i3 = 1;
            } else {
                i2 = 550833040 ^ 550832939;
                i3 = 4;
            }
            int i5 = i2 + i3 + i3;
            if (Integer.parseInt(strZd) != 0) {
                i4 = (1951143211 ^ 2131615389) ^ 188861372;
            } else {
                i5 /= 44;
                i4 = 997060081 ^ 997060083;
            }
            int iLastIndexOf = i4 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
            if ((iLastIndexOf * 4) % iLastIndexOf != 0) {
                strKd = BuildConfig.AnonymousClass1.indexOf(C1561oA.od("]l\u0014\u0016\n\u000faQ\u0002\u0007Ymvl\f?n\\NliL\rq\u0016\u0015\r\u001f\u000e\r\u0015!12(\u0018", (short) (ZN.Xd() ^ ((858731580 ^ 2046135626) ^ 1255864693))), 716394416 ^ 716394384);
            } else {
                strKd = C1561oA.Kd("dejP\u0014\t\f", (short) (C1607wl.Xd() ^ ((1561129597 ^ 616190370) ^ 2042014620)));
            }
            messageDigest = MessageDigest.getInstance(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i5, strKd));
        } catch (NoSuchAlgorithmException e2) {
            VsshLogger.logError(Wg.Zd("!Cl\u001b4onV\u00128S?", (short) (OY.Xd() ^ ((1668702195 ^ 1948399669) ^ 391391926)), (short) (OY.Xd() ^ ((1592888589 ^ 1340141925) ^ 286339645))), e2.getMessage(), e2);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        int iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        return SecurityUtils.getHexStringFromByteArray(messageDigest.digest(str.getBytes(Charset.forName(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(27887660 ^ 27887663, (iLastIndexOf2 * 4) % iLastIndexOf2 == 0 ? C1561oA.Xd("?D*\u0015L", (short) (Od.Xd() ^ ((1190943187 ^ 1647243244) ^ (-617775293)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1694675850 ^ 1694675936, Wg.vd("5J+,G>KjW'C\u001fz\u0006k(\u0013\u000b:B1%\f2vJ?s:ECq\tj_\u000epEA\u0001", (short) (C1607wl.Xd() ^ (1931551041 ^ 1931565416)))))))));
    }

    public static ProcessImageResponse segmentImage(String str, Integer num) throws Throwable {
        int iNextInt;
        String str2;
        int i2;
        String strSubstring;
        int i3;
        String str3;
        String str4;
        String strSubstring2;
        ProcessImageResponse processImageResponse;
        int i4;
        int i5;
        int i6;
        int i7;
        int iXd;
        String strYd;
        int iIntValue = num.intValue();
        String strKd = Qg.kd("ww", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951472190))), (short) (OY.Xd() ^ (FB.Xd() ^ 1609503863)));
        int iXd2 = C1499aX.Xd() ^ (970962576 ^ (-2051330445));
        int i8 = (115292896 ^ 1785034441) ^ 1824148523;
        String strVd = hg.Vd(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69956989))), (short) (C1633zX.Xd() ^ ((957645372 ^ 1916535233) ^ (-1260965329))));
        ProcessImageResponse processImageResponse2 = null;
        int iLastIndexOf = 1;
        int iXd3 = FB.Xd() ^ 1609527097;
        if (iIntValue <= iXd3) {
            if (Integer.parseInt(strVd) != 0) {
                strKd = strVd;
                i4 = 1;
            } else {
                i4 = 1958132799 ^ 1958132767;
                iXd2 = i8;
            }
            if (iXd2 != 0) {
                i5 = i4 + i4;
                strKd = strVd;
            } else {
                i5 = 1;
            }
            int iXd4 = (1474177035 ^ 409275791) ^ 1337664896;
            if (Integer.parseInt(strKd) != 0) {
                i6 = 1;
                i7 = 1;
            } else {
                i6 = i4 + i5 + 16;
                i7 = iXd4;
            }
            int i9 = i6 + i7 + i7;
            if (Integer.parseInt(strVd) != 0) {
                iXd = 1;
            } else {
                iXd = OY.Xd() ^ 69929204;
                iXd4 = FB.Xd() ^ 1609527093;
            }
            if (iXd4 != 0) {
                i9 /= iXd;
                iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
                iXd = iLastIndexOf;
            }
            if ((iLastIndexOf * i8) % iXd != 0) {
                short sXd = (short) (OY.Xd() ^ (ZN.Xd() ^ (2097116565 ^ 1333095063)));
                int[] iArr = new int["S\u000e\t\u0010?\nn9jlo\bhl+mdy#tr}*0-6o".length()];
                QB qb = new QB("S\u000e\t\u0010?\nn9jlo\bhl+mdy#tr}*0-6o");
                int i10 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i10] = xuXd.fK(sXd + i10 + xuXd.CK(iKK));
                    i10++;
                }
                strYd = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i10), 393789074 ^ 393789069);
            } else {
                strYd = C1561oA.yd("eoeo?>.\b76E8J|7?E\u0001J\u0007\u007f<}\u0007\u0018\f\u0017\b\u0015\u001dN\\S`\u000b\u0014\u0013", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1515691832 ^ 1776140537))));
            }
            VsshLogger.logError(C1561oA.Yd("X\u0003x\u0006{}a\u007f\b\r\u0003\u0011", (short) (C1633zX.Xd() ^ (555090794 ^ (-555117215)))), VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i9, strYd));
            return null;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Xg.qd("C;Q=\u000bQDCVTLX^\u0014:ML_]Q?O]T`_", (short) (C1499aX.Xd() ^ ((1032729933 ^ 2118243032) ^ (-1137691987))), (short) (C1499aX.Xd() ^ ((615996690 ^ 706968516) ^ (-244586916))))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            if (Integer.parseInt(strVd) != 0) {
                i2 = 1368115324 ^ 1368115317;
                str2 = strVd;
                iNextInt = 1;
            } else {
                iNextInt = secureRandom.nextInt(num.intValue() - iXd3);
                str2 = strKd;
                i2 = iXd2;
            }
            if (i2 != 0) {
                iLastIndexOf = iNextInt + 10;
                str2 = strVd;
            }
            int i11 = 14;
            if (Integer.parseInt(str2) != 0) {
                i3 = 14;
                strSubstring = null;
            } else {
                strSubstring = str.substring(0, iLastIndexOf);
                str2 = strKd;
                i3 = iXd2;
            }
            if (i3 != 0) {
                str2 = strVd;
                str3 = strSubstring;
                strSubstring = str.substring(iLastIndexOf, iLastIndexOf * 2);
            } else {
                str3 = null;
            }
            if (Integer.parseInt(str2) != 0) {
                strKd = str2;
                str4 = null;
            } else {
                i11 = 700313315 ^ 700313316;
                str4 = strSubstring;
                strSubstring = str.substring(iLastIndexOf * 2, iLastIndexOf * 3);
            }
            if (i11 != 0) {
                strSubstring2 = str.substring(iLastIndexOf * 3);
            } else {
                strSubstring2 = strSubstring;
                strVd = strKd;
                strSubstring = null;
            }
            if (Integer.parseInt(strVd) != 0) {
                strSubstring2 = null;
                processImageResponse = null;
            } else {
                processImageResponse = new ProcessImageResponse();
                iXd2 = i8;
            }
            if (iXd2 != 0) {
                processImageResponse.setFirstPart(str3.concat(strSubstring));
                processImageResponse2 = processImageResponse;
            }
            processImageResponse2.setSecondPart(str4.concat(strSubstring2));
            return processImageResponse2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
