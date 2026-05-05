package androidx.biometric;

import android.content.Context;
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
class ErrorUtils {
    static boolean isKnownError(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    static boolean isLockoutError(int i2) {
        return i2 == 7 || i2 == 9;
    }

    private ErrorUtils() {
    }

    static String getFingerprintErrorString(Context context, int i2) {
        if (context == null) {
            return "";
        }
        if (i2 == 1) {
            int i3 = R.string.fingerprint_error_hw_not_available;
            short sXd = (short) (ZN.Xd() ^ 12114);
            short sXd2 = (short) (ZN.Xd() ^ 16923);
            int[] iArr = new int["'\u0014-*Ij\t\u0003[Nod8a\u001333~h\u00173d\u000b".length()];
            QB qb = new QB("'\u0014-*Ij\t\u0003[Nod8a\u001333~h\u00173d\u000b");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
                i4++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i4));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i3)};
            Method method = cls.getMethod(ZO.xd("\tm]\u001aHX\u007f\u001f\u001c", (short) (C1499aX.Xd() ^ (-29286)), (short) (C1499aX.Xd() ^ (-28694))), clsArr);
            try {
                method.setAccessible(true);
                return (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                    int i5 = R.string.fingerprint_error_user_canceled;
                    Class<?> cls2 = Class.forName(C1561oA.ud("p|q~zsm6jusxhpu.Bmkp`rm", (short) (ZN.Xd() ^ QuickTimeMetadataDirectory.TAG_DIRECTOR)));
                    Class<?>[] clsArr2 = {Integer.TYPE};
                    Object[] objArr2 = {Integer.valueOf(i5)};
                    Method method2 = cls2.getMethod(C1561oA.yd("edpPnmag]", (short) (C1580rY.Xd() ^ (-13233))), clsArr2);
                    try {
                        method2.setAccessible(true);
                        return (String) method2.invoke(context, objArr2);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                case 11:
                    int i6 = R.string.fingerprint_error_no_fingerprints;
                    Class<?> cls3 = Class.forName(Qg.kd("w\u0004x\u0006\u0002zt=q|z\u007fow|5Itrwgyt", (short) (C1580rY.Xd() ^ (-2900)), (short) (C1580rY.Xd() ^ (-13761))));
                    Class<?>[] clsArr3 = {Integer.TYPE};
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    Method method3 = cls3.getMethod(hg.Vd("B?M+KH>B:", (short) (FB.Xd() ^ 4224), (short) (FB.Xd() ^ 3481)), clsArr3);
                    try {
                        method3.setAccessible(true);
                        return (String) method3.invoke(context, objArr3);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                case 12:
                    int i7 = R.string.fingerprint_error_hw_not_present;
                    short sXd3 = (short) (FB.Xd() ^ 2541);
                    int[] iArr2 = new int["\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0001..5';8".length()];
                    QB qb2 = new QB("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0001..5';8");
                    int i8 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i8));
                        i8++;
                    }
                    Class<?> cls4 = Class.forName(new String(iArr2, 0, i8));
                    Class<?>[] clsArr4 = {Integer.TYPE};
                    Object[] objArr4 = {Integer.valueOf(i7)};
                    Method method4 = cls4.getMethod(Wg.vd("\u000b\n\u0016u\u001c\u001b\u000f\u0015\u0003", (short) (FB.Xd() ^ 3110)), clsArr4);
                    try {
                        method4.setAccessible(true);
                        return (String) method4.invoke(context, objArr4);
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                default:
                    String str = C1593ug.zd("\u000f)'+-6.`'5648f+8.0\u0006l", (short) (OY.Xd() ^ 5797), (short) (OY.Xd() ^ 7532)) + i2;
                    C1561oA.od("!GLI@NKA:+I=?E", (short) (C1633zX.Xd() ^ (-19270)));
                    int i9 = R.string.default_error_msg;
                    Class<?> cls5 = Class.forName(C1561oA.Kd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (FB.Xd() ^ 23714)));
                    Class<?>[] clsArr5 = {Integer.TYPE};
                    Object[] objArr5 = {Integer.valueOf(i9)};
                    Method method5 = cls5.getMethod(Wg.Zd("\u000f@E9P$\u0013-\u001c", (short) (FB.Xd() ^ 23001), (short) (FB.Xd() ^ 7363)), clsArr5);
                    try {
                        method5.setAccessible(true);
                        return (String) method5.invoke(context, objArr5);
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
            }
        }
        int i10 = R.string.fingerprint_error_lockout;
        Class<?> cls6 = Class.forName(C1561oA.Yd("BPGVTOK\u0016LYY`R\\c\u001e4aahZnk", (short) (Od.Xd() ^ (-25253))));
        Class<?>[] clsArr6 = {Integer.TYPE};
        Object[] objArr6 = {Integer.valueOf(i10)};
        Method method6 = cls6.getMethod(Xg.qd("\u001f\u001e.\u000e0/'-'", (short) (ZN.Xd() ^ 15477), (short) (ZN.Xd() ^ 9063)), clsArr6);
        try {
            method6.setAccessible(true);
            return (String) method6.invoke(context, objArr6);
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }
}
