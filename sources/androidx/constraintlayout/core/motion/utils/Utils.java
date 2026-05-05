package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
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

/* JADX INFO: loaded from: classes4.dex */
public class Utils {
    static DebugHandle ourHandle = null;

    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i2) {
        int i3 = ((-1) - (((-1) - i2) | ((-1) - (~(i2 >> 31))))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        int iClamp = clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int iClamp2 = clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        int iClamp3 = clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
        int iClamp4 = (-1) - (((-1) - (clamp((int) (fArr[3] * 255.0f)) << 24)) & ((-1) - (iClamp << 16)));
        int i2 = iClamp2 << 8;
        int i3 = (iClamp4 + i2) - (iClamp4 & i2);
        return (i3 + iClamp3) - (i3 & iClamp3);
    }

    public static int rgbaTocColor(float f2, float f3, float f4, float f5) {
        int iClamp = clamp((int) (f2 * 255.0f));
        int iClamp2 = clamp((int) (f3 * 255.0f));
        int iClamp3 = clamp((int) (f4 * 255.0f));
        int iClamp4 = (-1) - (((-1) - ((-1) - (((-1) - (iClamp << 16)) & ((-1) - (clamp((int) (f5 * 255.0f)) << 24))))) & ((-1) - (iClamp2 << 8)));
        return (iClamp4 + iClamp3) - (iClamp4 & iClamp3);
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        ourHandle = debugHandle;
    }

    public static void logStack(String str, int i2) throws Throwable {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i2, stackTrace.length - 1);
        short sXd = (short) (C1499aX.Xd() ^ (-10800));
        int[] iArr = new int["\u0019".length()];
        QB qb = new QB("\u0019");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        String str2 = new String(iArr, 0, i3);
        String str3 = str2;
        for (int i4 = 1; i4 <= iMin; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            StringBuilder sb = new StringBuilder(C1593ug.zd("c^", (short) (OY.Xd() ^ 30319), (short) (OY.Xd() ^ 16884)));
            StackTraceElement stackTraceElement2 = stackTrace[i4];
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\u000f\u0005\u0019\u0003N\f\u007f\f\u0004Im\u000eyz\u0002i\u0007tuvU{szqy~", (short) (Od.Xd() ^ (-16574)))).getMethod(C1561oA.Kd("wv\u0007Y}\u0002{ey\u0007\u007f", (short) (FB.Xd() ^ 28923)), new Class[0]);
            try {
                method.setAccessible(true);
                StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement2, objArr)).append(Wg.Zd("8", (short) (C1633zX.Xd() ^ (-5141)), (short) (C1633zX.Xd() ^ (-30381))));
                StackTraceElement stackTraceElement3 = stackTrace[i4];
                Class<?> cls = Class.forName(C1561oA.Xd("\u0005|\u0013~L\f\u0002\u0010\nQw\u001a\b\u000b\u0014}\u001d\r\u0010\u0013s\u001c\u0016\u001f\u0018\")", (short) (C1499aX.Xd() ^ (-15220))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (OY.Xd() ^ 10570);
                int[] iArr2 = new int["\u0002~\u0011g\u007f\u0004}e\b~vx\u0001".length()];
                QB qb2 = new QB("\u0002~\u0011g\u007f\u0004}e\b~vx\u0001");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK((sXd2 ^ i5) + xuXd2.CK(iKK2));
                    i5++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i5), clsArr);
                try {
                    method2.setAccessible(true);
                    StringBuilder sbAppend2 = sbAppend.append(((Integer) method2.invoke(stackTraceElement3, objArr2)).intValue()).append(Qg.kd("VL", (short) (OY.Xd() ^ 27542), (short) (OY.Xd() ^ 2328)));
                    StackTraceElement stackTraceElement4 = stackTrace[i4];
                    Class<?> cls2 = Class.forName(hg.Vd("aWkU!^R^V\u001c@`LMT<YGHI(NFMDLQ", (short) (ZN.Xd() ^ 17881), (short) (ZN.Xd() ^ 154)));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (Od.Xd() ^ (-14110));
                    int[] iArr3 = new int["ur\u0001Xo}pvjSepg".length()];
                    QB qb3 = new QB("ur\u0001Xo}pvjSepg");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK(sXd3 + i6 + xuXd3.CK(iKK3));
                        i6++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
                    try {
                        method3.setAccessible(true);
                        str3 = str3 + str2;
                        System.out.println(str + str3 + sbAppend2.append((String) method3.invoke(stackTraceElement4, objArr3)).toString() + str3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    public static void log(String str) throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("\u001c?!\u0015.{Kc)\r~zrCV\nE\u0011 lWM#4x\u001fq", (short) (C1607wl.Xd() ^ 8381), (short) (C1607wl.Xd() ^ 17637))).getMethod(C1561oA.Xd(">=M'@PEMC.BOH", (short) (C1580rY.Xd() ^ (-12563))), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = new StringBuilder().append((String) method.invoke(stackTraceElement, objArr));
            short sXd = (short) (C1607wl.Xd() ^ TypedValues.Custom.TYPE_DIMENSION);
            int[] iArr = new int[",-./()*+$%&' !\"#<=".length()];
            QB qb = new QB(",-./()*+$%&' !\"#<=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            String strSubstring = sbAppend.append(new String(iArr, 0, i2)).toString().substring(0, 17);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Qg.kd("\u000f\u0005\u0019\u0003N\f\u007f\f\u0004Im\u000eyz\u0002i\u0007tuvU{szqy~", (short) (FB.Xd() ^ 15240), (short) (FB.Xd() ^ HttpStatus.SC_REQUEST_TIMEOUT))).getMethod(hg.Vd(")&4\u000b'+!\t/&\u001a\u001c(", (short) (Od.Xd() ^ (-20410)), (short) (Od.Xd() ^ (-8147))), new Class[0]);
            try {
                method2.setAccessible(true);
                String strSubstring2 = C1561oA.ud("kjih", (short) (C1607wl.Xd() ^ 14471)).substring(Integer.toString(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).length());
                StringBuilder sb = new StringBuilder(C1561oA.yd("VQ", (short) (C1607wl.Xd() ^ 23372)));
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Yd("e]s_-lbpj2Xzhkt^}mpsT|v\u007fx\u0003\n", (short) (C1580rY.Xd() ^ (-828)))).getMethod(Xg.qd("\u0002\u0001\u0011c\b\f\u0006o\u0004\u0011\n", (short) (C1580rY.Xd() ^ (-12924)), (short) (C1580rY.Xd() ^ (-31011))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    StringBuilder sbAppend2 = sb.append((String) method3.invoke(stackTraceElement, objArr3)).append(Jg.Wd(Global.BLANK, (short) (C1607wl.Xd() ^ 21644), (short) (C1607wl.Xd() ^ 15389)));
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(ZO.xd("\n0omo\u0004EM\u0004t4q%NK%e9{,\u0019\\]\u001c\u0010\bX", (short) (FB.Xd() ^ 12880), (short) (FB.Xd() ^ 2819))).getMethod(C1626yg.Ud("[c:nJbc\u0015MB%D7", (short) (Od.Xd() ^ (-14795)), (short) (Od.Xd() ^ (-25248))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        String string = sbAppend2.append(((Integer) method4.invoke(stackTraceElement, objArr4)).intValue()).append(Ig.wd(Global.SEMICOLON, (short) (Od.Xd() ^ (-18920)))).append(strSubstring2).append(strSubstring).toString();
                        PrintStream printStream = System.out;
                        StringBuilder sbAppend3 = new StringBuilder().append(string);
                        String strOd = EO.Od("v", (short) (C1499aX.Xd() ^ (-18305)));
                        printStream.println(sbAppend3.append(strOd).append(str).toString());
                        DebugHandle debugHandle = ourHandle;
                        if (debugHandle != null) {
                            debugHandle.message(string + strOd + str);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
