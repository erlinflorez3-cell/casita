package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
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

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1oSDK extends AFf1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int registerClient = 0;
    private final AFc1hSDK copy;
    private final String copydefault;
    private final AFg1nSDK equals;
    private final AFc1oSDK hashCode;
    private static char[] AFKeystoreWrapper = {52730, 63488, 52732, 63493, 63494, 52733, 63510, 52735, 63498};
    private static char AFInAppEventType = 52733;

    public AFf1oSDK(String str, AFd1zSDK aFd1zSDK) {
        super(new AFg1tSDK(), aFd1zSDK, str);
        this.hashCode = aFd1zSDK.AFAdRevenueData();
        this.copy = aFd1zSDK.AFInAppEventParameterName();
        this.copydefault = str;
        this.equals = aFd1zSDK.component3();
    }

    private static void a(byte b2, String str, int i2, Object[] objArr) {
        int i3;
        int i4 = 2 % 2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr2 = AFKeystoreWrapper;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr3[i5] = (char) (((long) cArr2[i5]) ^ (-9203380046050046466L));
            }
            cArr2 = cArr3;
        }
        char c2 = (char) ((-9203380046050046466L) ^ ((long) AFInAppEventType));
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i6 = $10 + 65;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            aFk1pSDK.getMonetizationNetwork = 0;
            while (aFk1pSDK.getMonetizationNetwork < i3) {
                aFk1pSDK.getRevenue = cArr[aFk1pSDK.getMonetizationNetwork];
                aFk1pSDK.getCurrencyIso4217Code = cArr[aFk1pSDK.getMonetizationNetwork + 1];
                if (aFk1pSDK.getRevenue == aFk1pSDK.getCurrencyIso4217Code) {
                    int i8 = $11 + 115;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr4[aFk1pSDK.getMonetizationNetwork] = (char) (aFk1pSDK.getRevenue >>> b2);
                        cArr4[aFk1pSDK.getMonetizationNetwork >> 1] = (char) (aFk1pSDK.getCurrencyIso4217Code << b2);
                    } else {
                        cArr4[aFk1pSDK.getMonetizationNetwork] = (char) (aFk1pSDK.getRevenue - b2);
                        cArr4[aFk1pSDK.getMonetizationNetwork + 1] = (char) (aFk1pSDK.getCurrencyIso4217Code - b2);
                    }
                } else {
                    aFk1pSDK.getMediationNetwork = aFk1pSDK.getRevenue / c2;
                    aFk1pSDK.component2 = aFk1pSDK.getRevenue % c2;
                    aFk1pSDK.AFAdRevenueData = aFk1pSDK.getCurrencyIso4217Code / c2;
                    aFk1pSDK.component3 = aFk1pSDK.getCurrencyIso4217Code % c2;
                    if (aFk1pSDK.component2 == aFk1pSDK.component3) {
                        aFk1pSDK.getMediationNetwork = ((aFk1pSDK.getMediationNetwork + c2) - 1) % c2;
                        aFk1pSDK.AFAdRevenueData = ((aFk1pSDK.AFAdRevenueData + c2) - 1) % c2;
                        int i9 = (aFk1pSDK.getMediationNetwork * c2) + aFk1pSDK.component2;
                        int i10 = (aFk1pSDK.AFAdRevenueData * c2) + aFk1pSDK.component3;
                        cArr4[aFk1pSDK.getMonetizationNetwork] = cArr2[i9];
                        cArr4[aFk1pSDK.getMonetizationNetwork + 1] = cArr2[i10];
                    } else if (aFk1pSDK.getMediationNetwork == aFk1pSDK.AFAdRevenueData) {
                        aFk1pSDK.component2 = ((aFk1pSDK.component2 + c2) - 1) % c2;
                        aFk1pSDK.component3 = ((aFk1pSDK.component3 + c2) - 1) % c2;
                        int i11 = (aFk1pSDK.getMediationNetwork * c2) + aFk1pSDK.component2;
                        int i12 = (aFk1pSDK.AFAdRevenueData * c2) + aFk1pSDK.component3;
                        cArr4[aFk1pSDK.getMonetizationNetwork] = cArr2[i11];
                        cArr4[aFk1pSDK.getMonetizationNetwork + 1] = cArr2[i12];
                    } else {
                        int i13 = (aFk1pSDK.getMediationNetwork * c2) + aFk1pSDK.component3;
                        int i14 = (aFk1pSDK.AFAdRevenueData * c2) + aFk1pSDK.component2;
                        cArr4[aFk1pSDK.getMonetizationNetwork] = cArr2[i13];
                        cArr4[aFk1pSDK.getMonetizationNetwork + 1] = cArr2[i14];
                    }
                }
                aFk1pSDK.getMonetizationNetwork += 2;
            }
        }
        int i15 = $11 + 5;
        $10 = i15 % 128;
        int i16 = i15 % 2;
        for (int i17 = 0; i17 < i2; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void equals() {
        int i2 = 2 % 2;
        int i3 = AFLogger + 33;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        ((AFf1sSDK) this).component2.AFAdRevenueData("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = ~i2;
        int i7 = i3 | i6;
        int i8 = ~i4;
        return ((((i2 * 495) + (i3 * (-493))) + ((i2 | i5) * (-988))) + (((i7 + i8) - (i7 & i8)) * 494)) + (((-1) - (((-1) - (~(i2 | i3))) & ((-1) - ((-1) - (((-1) - (~(i8 | i3))) & ((-1) - (~((-1) - (((-1) - i5) & ((-1) - i6)))))))))) * 494) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = registerClient + 109;
        AFLogger = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.getCurrencyIso4217Code();
            ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1oSDK).areAllFieldsValid;
            obj.hashCode();
            throw null;
        }
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork2 = ((AFe1fSDK) aFf1oSDK).areAllFieldsValid;
        if (responseNetwork2 != null) {
            int i4 = registerClient + 3;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                responseNetwork2.isSuccessful();
                obj.hashCode();
                throw null;
            }
            if (responseNetwork2.isSuccessful()) {
                aFf1oSDK.equals();
                int i5 = AFLogger + 17;
                registerClient = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Method method;
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        int i2 = 2 % 2;
        super.AFAdRevenueData(aFh1mSDK);
        Context context = aFf1oSDK.copy.getMonetizationNetwork;
        AFa1ySDK revenue = AFa1ySDK.getRevenue();
        if (context == null) {
            short sXd = (short) (FB.Xd() ^ 11919);
            int[] iArr = new int["\u0003.,1!3.X!*U##'Q!\"\u001e$\u0016\u0010\u0010\u000eTG\n\u0007\u0013J\u0017A\u0014\u0005\r\u0002<\u000e\u007f\u0001\u0002\u000b\u000bz\u00073\u0005v\u0002\u0005s\u0001\u0001".length()];
            QB qb = new QB("\u0003.,1!3.X!*U##'Q!\"\u001e$\u0016\u0010\u0010\u000eTG\n\u0007\u0013J\u0017A\u0014\u0005\r\u0002<\u000e\u007f\u0001\u0002\u000b\u000bz\u00073\u0005v\u0002\u0005s\u0001\u0001");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            throw new IllegalStateException(new String(iArr, 0, i3));
        }
        if (revenue.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog(Qg.kd("\u001eOLLFC:F(E6B\u00182l::>h;,:pc\u00174\"#*'+#Z#,W\u001b\u001f(\u0015\u0015\u001e\u0016\u0014", (short) (OY.Xd() ^ 23675), (short) (OY.Xd() ^ 21303)), true);
            throw new IllegalStateException(hg.Vd("4ebb\\YP\\>[LX.H\u0003PPT~QBP\u0007yK=>?HH8Dp9Bm;;?i<-5:", (short) (C1633zX.Xd() ^ (-31913)), (short) (C1633zX.Xd() ^ (-10515))));
        }
        try {
            aFh1mSDK.getMonetizationNetwork(EO.Od("~@2|\u0013Ol\u001d>DA\u0014GM:\u0019", (short) (C1580rY.Xd() ^ (-24924))), Integer.toString(aFf1oSDK.hashCode.n_().versionCode));
            aFh1mSDK.getMonetizationNetwork(C1561oA.Qd("IWVDZHTTINL<J<G>", (short) (OY.Xd() ^ 1792)), aFf1oSDK.hashCode.n_().versionName);
            objArr2 = new Object[0];
            method = Class.forName(C1593ug.zd("]kbqojf1gtt{mw~9O||\u0004u\n\u0007", (short) (OY.Xd() ^ 28761), (short) (OY.Xd() ^ 26749))).getMethod(C1561oA.od("DAO*:;B7<9 3?163?", (short) (C1607wl.Xd() ^ 10045)), new Class[0]);
        } catch (Throwable th) {
            AFLogger.afErrorLog(Wg.vd(",`HK[`RY]\u0010dV\\`V\u0012Zgab`_mcmg\u001d_stmk*)9/::h@4B@7BBp;E>D\u0004", (short) (Od.Xd() ^ (-5816))), th);
        }
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr2);
            aFh1mSDK.getMonetizationNetwork(C1561oA.Kd(")9:*:.;4", (short) (C1607wl.Xd() ^ 26402)), aFf1oSDK.s_(packageManager));
            long j2 = aFf1oSDK.hashCode.n_().firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Wg.Zd("(Jo\u0012B\t*(%F_mo2T\u007f=F", (short) (C1607wl.Xd() ^ 757), (short) (C1607wl.Xd() ^ 21374)), Locale.US);
            aFh1mSDK.getMonetizationNetwork(C1561oA.Xd("bhnp^jkDbvh", (short) (C1607wl.Xd() ^ 30455)), AFa1ySDK.getMonetizationNetwork(simpleDateFormat, j2));
            aFf1oSDK.equals.getRevenue(aFh1mSDK.AFAdRevenueData);
            aFh1mSDK.AFAdRevenueData.remove(Qg.kd("-9%", (short) (ZN.Xd() ^ 17692), (short) (ZN.Xd() ^ 11509)));
            String mediationNetwork = AFa1ySDK.getMediationNetwork();
            if (mediationNetwork != null) {
                int i4 = AFLogger + 47;
                registerClient = i4 % 128;
                int i5 = i4 % 2;
                short sXd2 = (short) (C1580rY.Xd() ^ (-15176));
                short sXd3 = (short) (C1580rY.Xd() ^ (-28243));
                int[] iArr2 = new int["ftsWteqGa".length()];
                QB qb2 = new QB("ftsWteqGa");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(sXd2 + i6 + xuXd2.CK(iKK2) + sXd3);
                    i6++;
                }
                String str = new String(iArr2, 0, i6);
                if (i5 != 0) {
                    aFh1mSDK.getMonetizationNetwork(str, mediationNetwork);
                    int i7 = 83 / 0;
                } else {
                    aFh1mSDK.getMonetizationNetwork(str, mediationNetwork);
                }
            }
            try {
                aFh1mSDK.getMonetizationNetwork(C1561oA.ud("~\u007fssy", (short) (ZN.Xd() ^ 4963)), Build.MODEL);
                byte touchSlop = (byte) (3 - (ViewConfiguration.getTouchSlop() >> 8));
                String strYd = C1561oA.yd("CFGG謒", (short) (C1607wl.Xd() ^ 18127));
                Object[] objArr3 = new Object[1];
                a(touchSlop, strYd, 5 - (Process.myPid() >> 22), objArr3);
                aFh1mSDK.getMonetizationNetwork(((String) objArr3[0]).intern(), Build.BRAND);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(C1561oA.Yd("X\rx{\b\r\u0003\n\n<\u0015\u0007\t\r\u0007B\u0007\u0014\u0012\u0013\r\f\u001e\u0014\u001a\u0014M\u0013\u0015'\u001b\u0016\u0019T\u0018)\u0019'\u001eZ\u001d+\"^-0&(0r", (short) (C1580rY.Xd() ^ (-31717))), th2);
            }
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String strQd = Xg.qd("!#5)$'\u00176&)2171\u000f5@/1<66", (short) (Od.Xd() ^ (-30270)), (short) (Od.Xd() ^ (-17937)));
            if (appsFlyerProperties.getBoolean(strQd, false)) {
                int i8 = AFLogger + 89;
                registerClient = i8 % 128;
                int i9 = i8 % 2;
                String strWd = Jg.Wd("<1hS", (short) (C1607wl.Xd() ^ 9023), (short) (C1607wl.Xd() ^ 28712));
                if (i9 != 0) {
                    aFh1mSDK.getMonetizationNetwork(strQd, strWd);
                    int i10 = 47 / 0;
                } else {
                    aFh1mSDK.getMonetizationNetwork(strQd, strWd);
                }
            }
            Object[] objArr4 = new Object[0];
            Method method2 = Class.forName(ZO.xd("-\u0016\u001c)klJ@\u0014s\u0012\u001a=\u0014d1\u0011L\u0003%mM9", (short) (C1499aX.Xd() ^ (-750)), (short) (C1499aX.Xd() ^ (-1098)))).getMethod(C1626yg.Ud("|Q\u001e:\u0013!\f5e\u001cV&CS\u0012HH|", (short) (OY.Xd() ^ 3140), (short) (OY.Xd() ^ 16677)), new Class[0]);
            try {
                method2.setAccessible(true);
                AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_((ContentResolver) method2.invoke(context, objArr4));
                if (aFb1jSDKL_ != null) {
                    int i11 = AFLogger + 35;
                    registerClient = i11 % 128;
                    int i12 = i11 % 2;
                    short sXd4 = (short) (ZN.Xd() ^ 17839);
                    int[] iArr3 = new int["9\u0017ZUPz\u001aA\u0007c".length()];
                    QB qb3 = new QB("9\u0017ZUPz\u001aA\u0007c");
                    int i13 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i13] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i13 % C1561oA.Xd.length] ^ (sXd4 + i13)));
                        i13++;
                    }
                    aFh1mSDK.getMonetizationNetwork(new String(iArr3, 0, i13), aFb1jSDKL_.getRevenue);
                    String strValueOf = String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code);
                    short sXd5 = (short) (C1580rY.Xd() ^ (-699));
                    int[] iArr4 = new int[">pTTR\u001e1E\fyp]\u0005\t\u000f~".length()];
                    QB qb4 = new QB(">pTTR\u001e1E\fyp]\u0005\t\u000f~");
                    int i14 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i14] = xuXd4.fK((C1561oA.Xd[i14 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i14)) + xuXd4.CK(iKK4));
                        i14++;
                    }
                    aFh1mSDK.getMonetizationNetwork(new String(iArr4, 0, i14), strValueOf);
                }
                aFh1mSDK.getMonetizationNetwork(C1561oA.Qd("..>2+>", (short) (C1633zX.Xd() ^ (-12381))), ((AFe1fSDK) aFf1oSDK).component1.getMediationNetwork());
                aFh1mSDK.getMonetizationNetwork(C1593ug.zd("pea", (short) (OY.Xd() ^ 17875), (short) (OY.Xd() ^ 28080)), AFb1kSDK.getCurrencyIso4217Code(aFf1oSDK.hashCode.getMediationNetwork));
                short sXd6 = (short) (C1580rY.Xd() ^ (-14685));
                int[] iArr5 = new int["'+#*%.\u001f3-(!)".length()];
                QB qb5 = new QB("'+#*%.\u001f3-(!)");
                int i15 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i15] = xuXd5.fK(sXd6 + sXd6 + i15 + xuXd5.CK(iKK5));
                    i15++;
                }
                aFh1mSDK.getMonetizationNetwork(new String(iArr5, 0, i15), aFf1oSDK.copydefault);
                aFh1mSDK.getMonetizationNetwork(Wg.Zd("#\u0013\u001a\r\u0005\u0006on\\]JS?>", (short) (FB.Xd() ^ 27277), (short) (FB.Xd() ^ 15913)), Integer.toString(((AFf1sSDK) aFf1oSDK).component2.getRevenue(C1561oA.Kd("0@AE\u0019@N;I\u001bHOIP", (short) (ZN.Xd() ^ 19504)), 0)));
                aFh1mSDK.getMonetizationNetwork(C1561oA.Xd("fX`", (short) (C1607wl.Xd() ^ 20528)), Integer.toString(Build.VERSION.SDK_INT));
                String strComponent3 = aFf1oSDK.hashCode.component3();
                if (strComponent3 == null) {
                    return null;
                }
                aFh1mSDK.getMonetizationNetwork(Wg.vd("\r\u0011\r\u0019\u0014\n\u0014", (short) (C1607wl.Xd() ^ 27320)), strComponent3);
                int i16 = registerClient + 61;
                AFLogger = i16 % 128;
                int i17 = i16 % 2;
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private String s_(PackageManager packageManager) throws Throwable {
        int i2 = 2 % 2;
        ApplicationInfo applicationInfo = this.hashCode.n_().applicationInfo;
        if (applicationInfo == null) {
            int i3 = AFLogger;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            registerClient = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 71;
            registerClient = i5 % 128;
            int i6 = i5 % 2;
            return "";
        }
        Object[] objArr = {applicationInfo};
        Method method = Class.forName(C1561oA.yd("lzq\u0001vqm8v\u0004\u0004\u000bt~\u0006@ki+NX[d[jiRgmahg]", (short) (OY.Xd() ^ 16924))).getMethod(Xg.qd("lk{Iyzwupo\u0004y\u0001\u0001_uw{\u0004", (short) (C1607wl.Xd() ^ 11067), (short) (C1607wl.Xd() ^ 30425)), Class.forName(C1561oA.Yd("&4+:83/y0==D6@G\u0002EC\u0005\u0019IJGE@?SIPP,RKU", (short) (FB.Xd() ^ 15917))));
        try {
            method.setAccessible(true);
            String string = ((CharSequence) method.invoke(packageManager, objArr)).toString();
            int i7 = AFLogger + 95;
            registerClient = i7 % 128;
            if (i7 % 2 == 0) {
                return string;
            }
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, 908933800, -908933800, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void component1(AFh1mSDK aFh1mSDK) {
        String strAreAllFieldsValid;
        int i2 = 2 % 2;
        int i3 = AFLogger + 13;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
            strAreAllFieldsValid = this.hashCode.areAllFieldsValid();
            int i4 = 83 / 0;
            if (strAreAllFieldsValid == null) {
                return;
            }
        } else {
            strAreAllFieldsValid = this.hashCode.areAllFieldsValid();
            if (strAreAllFieldsValid == null) {
                return;
            }
        }
        int i5 = AFLogger + 19;
        registerClient = i5 % 128;
        int i6 = i5 % 2;
        aFh1mSDK.getMonetizationNetwork("advertiserId", strAreAllFieldsValid);
        int i7 = registerClient + 39;
        AFLogger = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        int i2 = 2 % 2;
        int i3 = registerClient + 87;
        int i4 = i3 % 128;
        AFLogger = i4;
        boolean z2 = i3 % 2 == 0;
        int i5 = i4 + 117;
        registerClient = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        getCurrencyIso4217Code(new Object[]{this}, 838739924, -838739923, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 67;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 21;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        int i2 = 2 % 2;
        int i3 = registerClient + 1;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 51;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
