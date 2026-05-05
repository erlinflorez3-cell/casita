package yg;

import android.content.Context;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yg.lQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1553lQ {
    public static final int Kd = 75;
    public static Float Qd = null;
    public static final int Xd = 10;
    public static int Yd = 0;
    public static WindowManager od = null;
    public static InputManager ud = null;
    public static final AtomicBoolean vd = null;
    public static final AtomicBoolean wd = null;
    public static Float yd = null;

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String strOd = EO.Od("5pG\u001fV", (short) (OY.Xd() ^ ((1683050650 ^ 1297106214) ^ 687937612)));
        String strQd = C1561oA.Qd("J6", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (256870615 ^ (-1019589087)))));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            field.set(null, atomicBoolean);
        } catch (Throwable th) {
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        String strZd = C1593ug.zd("fU\u001d\\B", (short) (C1580rY.Xd() ^ ((1620312788 ^ 1549058538) ^ (-1019249036))), (short) (C1580rY.Xd() ^ (580428484 ^ (-580450601))));
        String strOd2 = C1561oA.od("$\u0011", (short) (C1580rY.Xd() ^ ((1241544719 ^ 983181900) ^ (-1889148334))));
        try {
            Class<?> cls2 = Class.forName(strZd);
            Field field2 = 0 != 0 ? cls2.getField(strOd2) : cls2.getDeclaredField(strOd2);
            field2.setAccessible(true);
            field2.set(null, atomicBoolean2);
        } catch (Throwable th2) {
        }
        String strKd = C1561oA.Kd("zi1pV", (short) (C1499aX.Xd() ^ (735019072 ^ (-735041039))));
        String strZd2 = Wg.Zd("0<", (short) (Od.Xd() ^ ((535840416 ^ 1215243526) ^ (-1470050171))), (short) (Od.Xd() ^ ((1863341971 ^ 1332470260) ^ (-544991805))));
        try {
            Class<?> cls3 = Class.forName(strKd);
            Field field3 = 0 != 0 ? cls3.getField(strZd2) : cls3.getDeclaredField(strZd2);
            field3.setAccessible(true);
            field3.set(null, null);
        } catch (Throwable th3) {
        }
        String strXd = C1561oA.Xd("p_'fL", (short) (FB.Xd() ^ (1880523949 ^ 1880532802)));
        short sXd = (short) (FB.Xd() ^ ((346246450 ^ 241669065) ^ 449114221));
        int[] iArr = new int["F<".length()];
        QB qb = new QB("F<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls4 = Class.forName(strXd);
            Field field4 = 0 != 0 ? cls4.getField(str) : cls4.getDeclaredField(str);
            field4.setAccessible(true);
            field4.set(null, null);
        } catch (Throwable th4) {
        }
        String strKd2 = Qg.kd("\u0019\u0006K\tl", (short) (FB.Xd() ^ ((554989697 ^ 438419604) ^ 993368383)), (short) (FB.Xd() ^ (1628659163 ^ 1628651346)));
        String strVd = hg.Vd("|\u0007", (short) (C1607wl.Xd() ^ ((63851299 ^ 1348783287) ^ 1403685500)), (short) (C1607wl.Xd() ^ (1455518681 ^ 1455491482)));
        try {
            Class<?> cls5 = Class.forName(strKd2);
            Field field5 = 0 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
            field5.setAccessible(true);
            field5.set(null, 0);
        } catch (Throwable th5) {
        }
        String strUd = C1561oA.ud("s`&cG", (short) (C1499aX.Xd() ^ ((1028010122 ^ 402372362) ^ (-717063209))));
        short sXd2 = (short) (C1607wl.Xd() ^ ((524251300 ^ 2087693025) ^ 1666225999));
        int[] iArr2 = new int["`t".length()];
        QB qb2 = new QB("`t");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls6 = Class.forName(strUd);
            Field field6 = 0 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
            field6.setAccessible(true);
            field6.set(null, null);
        } catch (Throwable th6) {
        }
        String strYd = C1561oA.Yd("`O\u0017V<", (short) (C1607wl.Xd() ^ (1436398844 ^ 1436415707)));
        String strQd2 = Xg.qd("\"\u000e", (short) (C1580rY.Xd() ^ (1301219093 ^ (-1301232698))), (short) (C1580rY.Xd() ^ (136629484 ^ (-136635679))));
        try {
            Class<?> cls7 = Class.forName(strYd);
            Field field7 = 0 != 0 ? cls7.getField(strQd2) : cls7.getDeclaredField(strQd2);
            field7.setAccessible(true);
            field7.set(null, null);
        } catch (Throwable th7) {
        }
    }

    public static synchronized void Od(MotionEvent motionEvent) {
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Yd() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.C1553lQ.Yd():void");
    }

    public static void ud() throws Exception {
        CX.ud();
        Yd();
    }

    public static synchronized void vd(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (motionEvent.getActionMasked() != 0) {
            return;
        }
        int deviceId = motionEvent.getDeviceId();
        String strWd = Jg.Wd("N'4\r6", (short) (OY.Xd() ^ ((1362191581 ^ 797989096) ^ 2124482480)), (short) (OY.Xd() ^ (386748653 ^ 386755931)));
        String strXd = ZO.xd("S)", (short) (FB.Xd() ^ ((891977964 ^ 980169550) ^ 256305143)), (short) (FB.Xd() ^ ((158662344 ^ 50295368) ^ 193709788)));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (((InputManager) obj) == null) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1626yg.Ud("\u000f4\u001b%\u000f", (short) (C1633zX.Xd() ^ ((253720958 ^ 1798959825) ^ (-1680275613))), (short) (C1633zX.Xd() ^ (1988151010 ^ (-1988149042))))).getDeclaredMethod(Ig.wd("\f`", (short) (OY.Xd() ^ (100649700 ^ 100635785))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                Context context = (Context) declaredMethod.invoke(null, objArr);
                if (context != null) {
                    Object[] objArr2 = {EO.Od("D\u0013'PX", (short) (C1499aX.Xd() ^ ((351125958 ^ 1918630635) ^ (-1723232328))))};
                    Method method = Class.forName(C1561oA.Qd("0<1>:3-u*538(05m\u0002-+0 2-", (short) (C1499aX.Xd() ^ (1326377873 ^ (-1326379621))))).getMethod(C1561oA.od("SP^<aZZJQ6GSVHAB", (short) (C1499aX.Xd() ^ ((446740465 ^ 1530833692) ^ (-1100881601)))), Class.forName(C1593ug.zd("^VlX&e[ic+Qsrjpj", (short) (C1499aX.Xd() ^ ((1948399351 ^ 343081332) ^ (-1615935904))), (short) (C1499aX.Xd() ^ ((973510569 ^ 267077674) ^ (-904784253))))));
                    try {
                        method.setAccessible(true);
                        InputManager inputManager = (InputManager) method.invoke(context, objArr2);
                        short sXd = (short) (OY.Xd() ^ (1776753290 ^ 1776770014));
                        int[] iArr = new int["\u001b\nQ\u0011v".length()];
                        QB qb = new QB("\u001b\nQ\u0011v");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                            i2++;
                        }
                        String str = new String(iArr, 0, i2);
                        String strZd = Wg.Zd("f1", (short) (OY.Xd() ^ ((1354262999 ^ 1637554411) ^ 824401040)), (short) (OY.Xd() ^ ((880561581 ^ 1666373704) ^ 1462678231)));
                        try {
                            Class<?> cls2 = Class.forName(str);
                            Field field2 = 0 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                            field2.setAccessible(true);
                            field2.set(null, inputManager);
                        } catch (Throwable th2) {
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        String strXd2 = C1561oA.Xd("$\u0013Z\u001a\u007f", (short) (C1633zX.Xd() ^ ((1160629493 ^ 247576935) ^ (-1273788786))));
        String strVd = Wg.vd("$\u0014", (short) (Od.Xd() ^ ((1724311534 ^ 1309888329) ^ (-685104409))));
        try {
            Class<?> cls3 = Class.forName(strXd2);
            Field field3 = 0 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
            field3.setAccessible(true);
            obj2 = field3.get(null);
        } catch (Throwable th3) {
            obj2 = null;
        }
        if (((InputManager) obj2) == null) {
            return;
        }
        String strKd = Qg.kd("lY\u001f\\@", (short) (FB.Xd() ^ (1826374981 ^ 1826365555)), (short) (FB.Xd() ^ ((66129941 ^ 415023301) ^ 458096100)));
        String strVd2 = hg.Vd("F4", (short) (ZN.Xd() ^ (615774406 ^ 615746630)), (short) (ZN.Xd() ^ ((886751826 ^ 2041352499) ^ 1299594391)));
        try {
            Class<?> cls4 = Class.forName(strKd);
            Field field4 = 0 != 0 ? cls4.getField(strVd2) : cls4.getDeclaredField(strVd2);
            field4.setAccessible(true);
            obj3 = field4.get(null);
        } catch (Throwable th4) {
            obj3 = null;
        }
        InputDevice inputDevice = ((InputManager) obj3).getInputDevice(deviceId);
        if (inputDevice != null) {
            String lowerCase = inputDevice.getName().toLowerCase();
            short sXd2 = (short) (C1633zX.Xd() ^ ((2026076922 ^ 692465768) ^ (-1367690505)));
            int[] iArr2 = new int["\u007fqyzzeo".length()];
            QB qb2 = new QB("\u007fqyzzeo");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            if (lowerCase.contains(new String(iArr2, 0, i3))) {
                String strYd = C1561oA.yd("9(k+\u0015", (short) (C1580rY.Xd() ^ (917483364 ^ (-917475601))));
                String strYd2 = C1561oA.Yd("TB", (short) (C1499aX.Xd() ^ (480577248 ^ (-480594689))));
                try {
                    Class<?> cls5 = Class.forName(strYd);
                    Field field5 = 0 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
                    field5.setAccessible(true);
                    obj4 = field5.get(null);
                } catch (Throwable th5) {
                    obj4 = null;
                }
                ((AtomicBoolean) obj4).set(true);
            }
        }
    }
}
