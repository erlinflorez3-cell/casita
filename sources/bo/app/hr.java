package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.pm.PackageInfoCompat;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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

/* JADX INFO: loaded from: classes4.dex */
public final class hr implements o00 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final br f844f = new br();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PackageInfo f849e;

    public hr(Context context, BrazeConfigurationProvider brazeConfigurationProvider) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.yd("Q^ZaOc\\", (short) (FB.Xd() ^ 11349)));
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, C1561oA.Yd("\u0017$$\u001d! /-\u001d1'..\u001142:.*,:", (short) (C1607wl.Xd() ^ 3970)));
        this.f845a = context;
        this.f846b = brazeConfigurationProvider;
        PackageInfo packageInfoC = c();
        this.f847c = packageInfoC != null ? packageInfoC.versionName : null;
        short sXd = (short) (C1499aX.Xd() ^ (-22483));
        short sXd2 = (short) (C1499aX.Xd() ^ (-6183));
        int[] iArr = new int["Q^]\u001fScdWep&f[i]dcqs/fhznilgmk\u007fml~\u0002\u007f\b{wy\b".length()];
        QB qb = new QB("Q^]\u001fScdWep&f[i]dcqs/fhznilgmk\u007fml~\u0002\u007f\b{wy\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(Jg.Wd("Jh1T 1lMQrD1/\u000f&6ZK]:8\"\u0001", (short) (OY.Xd() ^ 15382), (short) (OY.Xd() ^ 8279)));
        Class<?>[] clsArr = {Class.forName(ZO.xd("WCP\u001ag\u000fH[Vx`e?\u0006R9", (short) (ZN.Xd() ^ 16153), (short) (ZN.Xd() ^ 1826))), Integer.TYPE};
        Object[] objArr = {str, 0};
        short sXd3 = (short) (C1580rY.Xd() ^ (-21652));
        short sXd4 = (short) (C1580rY.Xd() ^ (-29764));
        int[] iArr2 = new int["Iy5N.\u0011i\u0006y8;m@V4\u000eF\u0007<0".length()];
        QB qb2 = new QB("Iy5N.\u0011i\u0006y8;m@V4\u000eF\u0007<0");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, Ig.wd("\u0019]H)oEg75\u0002\u0011S9&\u0012$^R\u001a\u0017]}/\u001c⥿Ob|\u0019G*Jv~c\u000fu30\u0019\u0018W\u001a\u0004nq%\u0011Q\u000f", (short) (C1499aX.Xd() ^ (-9762))));
            this.f848d = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final nq a() throws Throwable {
        String string;
        Context context;
        Object[] objArr;
        Method method;
        BrazeConfigurationProvider brazeConfigurationProvider = this.f846b;
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, EO.Od(")Z\u000e'd@,r=MBh7%=Y\u0006|1|E", (short) (C1607wl.Xd() ^ 5579)));
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        try {
            context = this.f845a;
            String strQd = C1561oA.Qd("/&,* ", (short) (FB.Xd() ^ 31914));
            Class<?> cls = Class.forName(C1593ug.zd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (FB.Xd() ^ 22327), (short) (FB.Xd() ^ 14247)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.od("tj~h4qeqi/Sspfjb", (short) (FB.Xd() ^ 27586)));
            objArr = new Object[]{strQd};
            method = cls.getMethod(C1561oA.Kd("[ZjJqln`iPcqvjeh", (short) (C1499aX.Xd() ^ (-13640))), clsArr);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) fr.f684a, 4, (Object) null);
        }
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, Wg.Zd("\u0015\u0005/r\u001d\u00145yl1m<q,*b\u0018M\u00024<jB\u00048~0\u0015S}\u0003mu\u001e\fD2'\u001bD\u0006\n7UV\u0012F\u00051\u001fN\u0019\u000bM%~\u0007Q}0\u001dW\u001e\u001c#^\u001f\u0015R\u00044", (short) (C1607wl.Xd() ^ 9005), (short) (C1607wl.Xd() ^ 10359)));
            String networkOperatorName = ((TelephonyManager) objInvoke).getNetworkOperatorName();
            String string2 = networkOperatorName != null ? StringsKt.trim((CharSequence) networkOperatorName).toString() : null;
            String str = Build.BRAND;
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            String str2 = Build.MODEL;
            br brVar = f844f;
            Locale locale = Locale.getDefault();
            String strXd = C1561oA.Xd("~}\u000e^\u0001\u0003~\u0014\f\u0015IK", (short) (C1607wl.Xd() ^ 27853));
            Intrinsics.checkNotNullExpressionValue(locale, strXd);
            Intrinsics.checkNotNullParameter(locale, Wg.vd("@D54<6", (short) (ZN.Xd() ^ 32729)));
            String string3 = locale.toString();
            Intrinsics.checkNotNullExpressionValue(string3, Qg.kd("jl_\\f^&keHhe[_W\u0017\u0017", (short) (FB.Xd() ^ 21408), (short) (FB.Xd() ^ 8280)));
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, strXd);
            String id = timeZone.getID();
            Context context2 = this.f845a;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(yg.hg.Vd("\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVj\u0016\u0014\u0019\t\u001b\u0016", (short) (ZN.Xd() ^ 22629), (short) (ZN.Xd() ^ 23275))).getMethod(C1561oA.ud("\u0001}\fhz\b\u0003\b\u0004st\u0002", (short) (ZN.Xd() ^ 28111)), new Class[0]);
            try {
                method2.setAccessible(true);
                boolean zIsBackgroundRestricted = false;
                boolean z2 = ((Resources) method2.invoke(context2, objArr2)).getConfiguration().orientation == 2;
                Intrinsics.checkNotNullParameter(context2, C1561oA.yd("\u007f\r\t\u0010}\u0012\u000b", (short) (C1633zX.Xd() ^ (-2571))));
                try {
                    Pair<Integer, Integer> displayHeightAndWidthPixels = BrazeImageUtils.getDisplayHeightAndWidthPixels(context2);
                    int iIntValue = displayHeightAndWidthPixels.component1().intValue();
                    int iIntValue2 = displayHeightAndWidthPixels.component2().intValue();
                    string = z2 ? new StringBuilder().append(iIntValue).append('x').append(iIntValue2).toString() : new StringBuilder().append(iIntValue2).append('x').append(iIntValue).toString();
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brVar, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) ar.f221a, 4, (Object) null);
                    string = null;
                }
                Context context3 = this.f845a;
                Object[] objArr3 = {C1561oA.Yd("aci_]a\\[oell", (short) (C1580rY.Xd() ^ (-26401)))};
                Method method3 = Class.forName(Xg.qd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (ZN.Xd() ^ 9587), (short) (ZN.Xd() ^ 14428))).getMethod(ZO.xd("wP`I\u001d?m+_5%\u001bO\u0013\bn", (short) (C1499aX.Xd() ^ (-16850)), (short) (C1499aX.Xd() ^ (-24838))), Class.forName(Jg.Wd("8=:W\btQ\u0005u:\u0014\u0017M\"T=", (short) (OY.Xd() ^ 22010), (short) (OY.Xd() ^ 27302))));
                try {
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(context3, objArr3);
                    Intrinsics.checkNotNull(objInvoke2, C1626yg.Ud("\u001f\u0016wt++`#Q//^-\u0013=\b\u0002leY\u000bf\u0011\u0002\u0018\n\nCwQ\n\u0001\u0001Feo/{\bQ#Rv]\u001a,\u0010\u0006bK\u007f)e\u001c)0\r$`= 5V1;*\u0005f", (short) (FB.Xd() ^ 442), (short) (FB.Xd() ^ 24688)));
                    Boolean boolValueOf = Boolean.valueOf(((NotificationManager) objInvoke2).areNotificationsEnabled());
                    if (Build.VERSION.SDK_INT >= 28) {
                        try {
                            Context context4 = this.f845a;
                            String strWd = Ig.wd("9\rm<W\u0006'a", (short) (Od.Xd() ^ (-21199)));
                            Class<?> cls2 = Class.forName(EO.Od("\u0013xp\u001f\u0004R!C;[P|<GM-\u00175lZ\u000eM_", (short) (C1633zX.Xd() ^ (-32732))));
                            Class<?>[] clsArr2 = new Class[1];
                            short sXd = (short) (ZN.Xd() ^ 12904);
                            int[] iArr = new int["VL`J\u0016SGSK\u00115URHLD".length()];
                            QB qb = new QB("VL`J\u0016SGSK\u00115URHLD");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                                i2++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr, 0, i2));
                            Object[] objArr4 = {strWd};
                            Method method4 = cls2.getMethod(C1593ug.zd("\u0016\u0015%\u0005,')\u001b$\u000b\u001e,1% #", (short) (C1580rY.Xd() ^ (-24698)), (short) (C1580rY.Xd() ^ (-28281))), clsArr2);
                            try {
                                method4.setAccessible(true);
                                Object objInvoke3 = method4.invoke(context4, objArr4);
                                Intrinsics.checkNotNull(objInvoke3, C1561oA.od("W]SR\u0005GDPOOS}?Az=:KKuICr@@>{<B87i=A7+d%1&3/(\"j\u001d+*fx\u001a*\u001e*\u001c&*|\u0010\u001c\u000e\u0013\u0010\u001c", (short) (C1633zX.Xd() ^ (-17853))));
                                zIsBackgroundRestricted = ((ActivityManager) objInvoke3).isBackgroundRestricted();
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) er.f588a, 4, (Object) null);
                        }
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(zIsBackgroundRestricted);
                    String string4 = this.f848d.getString(C1561oA.Kd("ajkdjd_bfbmi", (short) (Od.Xd() ^ (-10589))), null);
                    SharedPreferences sharedPreferences = this.f848d;
                    String strZd = Wg.Zd("zxG\u0012\u0013Cx\u0016Y\u0002\f7\u0003\u000f5\b\u00153\u0006", (short) (C1499aX.Xd() ^ (-12970)), (short) (C1499aX.Xd() ^ (-32230)));
                    return new nq(brazeConfigurationProvider, strValueOf, string2, str, str2, string3, id, string, boolValueOf, boolValueOf2, string4, sharedPreferences.contains(strZd) ? Boolean.valueOf(this.f848d.getBoolean(strZd, true)) : null);
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    public final void a(String googleAdvertisingId) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        this.f848d.edit().putString("google_ad_id", googleAdvertisingId).apply();
    }

    public final void a(boolean z2) {
        this.f848d.edit().putBoolean("ad_tracking_enabled", !z2).apply();
    }

    public final String b() throws Throwable {
        PackageInfo packageInfoC = c();
        if (packageInfoC != null) {
            return (Build.VERSION.SDK_INT >= 28 ? packageInfoC.getLongVersionCode() : PackageInfoCompat.getLongVersionCode(packageInfoC)) + ".0.0.0";
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) dr.f515a, 7, (Object) null);
        return null;
    }

    public final PackageInfo c() throws Throwable {
        Object obj;
        PackageInfo packageInfo;
        Object obj2;
        PackageInfo packageInfo2;
        PackageInfo packageInfo3 = this.f849e;
        if (packageInfo3 != null) {
            return packageInfo3;
        }
        Context context = this.f845a;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")cy''. 41", (short) (FB.Xd() ^ 1532))).getMethod(Wg.vd("\u0010\r\u001bu\u0006\u0007\u000e\u0003\u0018\u0015|\u000f\u001a\u0011", (short) (OY.Xd() ^ 28640)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context2 = this.f845a;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Qg.kd("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB", (short) (C1633zX.Xd() ^ (-28638)), (short) (C1633zX.Xd() ^ (-7644)))).getMethod(yg.hg.Vd(">;I$45<163\u001a-9+0-9", (short) (C1499aX.Xd() ^ (-4306)), (short) (C1499aX.Xd() ^ (-21146))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                        PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                        short sXd = (short) (C1633zX.Xd() ^ (-24090));
                        int[] iArr = new int["?K@MIB<\u00059DBG7?D|>:y\u001b+,3(-*\u0011$0\"'$0".length()];
                        QB qb = new QB("?K@MIB<\u00059DBG7?D|>:y\u001b+,3(-*\u0011$0\"'$0");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i2));
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Class.forName(C1561oA.yd("/'=)n.$24{\"D;393", (short) (C1607wl.Xd() ^ 13278)));
                        clsArr[1] = Class.forName(C1561oA.Yd("'5,;940z1>>E7AH\u0003FD\u0006);>G>ED-BPDKJX\u000b8JMVMTS8^Wa9`V]j", (short) (Od.Xd() ^ (-20619))));
                        Object[] objArr3 = {str, packageInfoFlagsOf};
                        short sXd2 = (short) (C1580rY.Xd() ^ (-24720));
                        short sXd3 = (short) (C1580rY.Xd() ^ (-24240));
                        int[] iArr2 = new int["\u001c\u001b+\b\u001a\u001d&\u001d$#\b.'1".length()];
                        QB qb2 = new QB("\u001c\u001b+\b\u001a\u001d&\u001d$#\b.'1");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                            i3++;
                        }
                        Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            method3.setAccessible(true);
                            packageInfo2 = (PackageInfo) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else {
                    Context context3 = this.f845a;
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(Jg.Wd("yY+\u000bJ\u0018p\r\u0006c>\u0017M*\u000b\u0016/.\u000bd\u0017|T", (short) (Od.Xd() ^ (-13809)), (short) (Od.Xd() ^ (-32041)))).getMethod(ZO.xd("W\u001e9.W6@]MT\u0016\u0005Z_\u000e\u0018\u001c", (short) (C1607wl.Xd() ^ 12079), (short) (C1607wl.Xd() ^ 12782)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        PackageManager packageManager2 = (PackageManager) method4.invoke(context3, objArr4);
                        Class<?> cls2 = Class.forName(C1626yg.Ud("=a2#1\u0002@\u0004I\u0011S%-As^/\u0003/5=m[<Zc#Yx\"\u000ej,", (short) (C1633zX.Xd() ^ (-21010)), (short) (C1633zX.Xd() ^ (-10117))));
                        Class<?>[] clsArr2 = new Class[2];
                        short sXd4 = (short) (Od.Xd() ^ (-12018));
                        int[] iArr3 = new int["Qz@D\u0007h\u00046d\u001d>GrilI".length()];
                        QB qb3 = new QB("Qz@D\u0007h\u00046d\u001d>GrilI");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                            i4++;
                        }
                        clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr5 = {str, 0};
                        Method method5 = cls2.getMethod(EO.Od("\u000e;:twVp\u0001U&\u0006\u000bMf", (short) (C1633zX.Xd() ^ (-405))), clsArr2);
                        try {
                            method5.setAccessible(true);
                            packageInfo2 = (PackageInfo) method5.invoke(packageManager2, objArr5);
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
                this.f849e = packageInfo2;
                return packageInfo2;
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new gr(str), 4, (Object) null);
                Context context4 = this.f845a;
                Class<?> cls3 = Class.forName(C1561oA.Qd("myn{wpj3grpuemr+?jhm]oj", (short) (C1633zX.Xd() ^ (-4389))));
                Class<?>[] clsArr3 = new Class[0];
                Object[] objArr6 = new Object[0];
                short sXd5 = (short) (C1607wl.Xd() ^ 32103);
                short sXd6 = (short) (C1607wl.Xd() ^ 26143);
                int[] iArr4 = new int["65E\u0013CDA?:9MCJJ&LEO".length()];
                QB qb4 = new QB("65E\u0013CDA?:9MCJJ&LEO");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) - sXd6);
                    i5++;
                }
                Method method6 = cls3.getMethod(new String(iArr4, 0, i5), clsArr3);
                try {
                    method6.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method6.invoke(context4, objArr6);
                    if (Build.VERSION.SDK_INT >= 33) {
                        Context context5 = this.f845a;
                        Object[] objArr7 = new Object[0];
                        Method method7 = Class.forName(C1561oA.od("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (C1499aX.Xd() ^ (-2710)))).getMethod(C1561oA.Kd("yx\tewz\u0004z\u0002\u0001i~\r\u0001\b\u0007\u0015", (short) (C1499aX.Xd() ^ (-4752))), new Class[0]);
                        try {
                            method7.setAccessible(true);
                            PackageManager packageManager3 = (PackageManager) method7.invoke(context5, objArr7);
                            String strZd = Wg.Zd("\u0005\u0004,l\u0018DqmRQ\u0003;Z\u0016N:*\u001a\rN0b\u0011=iZ C{-:\u0011;7", (short) (Od.Xd() ^ (-13496)), (short) (Od.Xd() ^ (-4119)));
                            String strXd = C1561oA.Xd("ROVTFI)OY", (short) (C1633zX.Xd() ^ (-5828)));
                            try {
                                Class<?> cls4 = Class.forName(strZd);
                                Field field = 1 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
                                field.setAccessible(true);
                                obj2 = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj2 = null;
                            }
                            String str2 = (String) obj2;
                            PackageManager.PackageInfoFlags packageInfoFlagsOf2 = PackageManager.PackageInfoFlags.of(0L);
                            Class<?> cls5 = Class.forName(Wg.vd("7C<IA:8\u0001ALNS?GP\t62u\u0017#$/$52\u001d08*30(", (short) (C1633zX.Xd() ^ (-29759))));
                            Class<?>[] clsArr4 = new Class[2];
                            clsArr4[0] = Class.forName(Qg.kd("7-A+v4(4,q\u001663)-%", (short) (FB.Xd() ^ 2204), (short) (FB.Xd() ^ 26504)));
                            short sXd7 = (short) (FB.Xd() ^ 21564);
                            short sXd8 = (short) (FB.Xd() ^ 3758);
                            int[] iArr5 = new int["y\u0006z\b\u0004|v?s~|\u0002qy~7xt4UefmbgdK^j\\a^j\u001bFVW^SXU8\\S[1VJOZ".length()];
                            QB qb5 = new QB("y\u0006z\b\u0004|v?s~|\u0002qy~7xt4UefmbgdK^j\\a^j\u001bFVW^SXU8\\S[1VJOZ");
                            int i6 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i6] = xuXd5.fK(sXd7 + i6 + xuXd5.CK(iKK5) + sXd8);
                                i6++;
                            }
                            clsArr4[1] = Class.forName(new String(iArr5, 0, i6));
                            Object[] objArr8 = {str2, packageInfoFlagsOf2};
                            Method method8 = cls5.getMethod(C1561oA.ud("`]kFVW^SXU0`PTT`N1ULT", (short) (OY.Xd() ^ 7350)), clsArr4);
                            try {
                                method8.setAccessible(true);
                                packageInfo = (PackageInfo) method8.invoke(packageManager3, objArr8);
                            } catch (InvocationTargetException e7) {
                                throw e7.getCause();
                            }
                        } catch (InvocationTargetException e8) {
                            throw e8.getCause();
                        }
                    } else {
                        Context context6 = this.f845a;
                        short sXd9 = (short) (Od.Xd() ^ (-25991));
                        int[] iArr6 = new int["*8/>4/+u$118\",3m\u001cIIP:NK".length()];
                        QB qb6 = new QB("*8/>4/+u$118\",3m\u001cIIP:NK");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd9 ^ i7));
                            i7++;
                        }
                        Object[] objArr9 = new Object[0];
                        Method method9 = Class.forName(new String(iArr6, 0, i7)).getMethod(C1561oA.Yd(";:J'9<E<CB+@NBIHV", (short) (Od.Xd() ^ (-26247))), new Class[0]);
                        try {
                            method9.setAccessible(true);
                            PackageManager packageManager4 = (PackageManager) method9.invoke(context6, objArr9);
                            String strQd = Xg.qd("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e)'h|-.+)$#7-44\u00106/9", (short) (OY.Xd() ^ 5497), (short) (OY.Xd() ^ 10633));
                            String strWd = Jg.Wd("\u001c3zslV\u000f61", (short) (OY.Xd() ^ 15954), (short) (OY.Xd() ^ 25557));
                            try {
                                Class<?> cls6 = Class.forName(strQd);
                                Field field2 = 1 != 0 ? cls6.getField(strWd) : cls6.getDeclaredField(strWd);
                                field2.setAccessible(true);
                                obj = field2.get(applicationInfo);
                            } catch (Throwable th2) {
                                obj = null;
                            }
                            String str3 = (String) obj;
                            short sXd10 = (short) (ZN.Xd() ^ 29117);
                            short sXd11 = (short) (ZN.Xd() ^ 2565);
                            int[] iArr7 = new int["N\u0017.\u007fH-\u0013h\u001c\u0019r?~[B4%\t7tLtafnxFi_Sps1".length()];
                            QB qb7 = new QB("N\u0017.\u007fH-\u0013h\u001c\u0019r?~[B4%\t7tLtafnxFi_Sps1");
                            int i8 = 0;
                            while (qb7.YK()) {
                                int iKK7 = qb7.KK();
                                Xu xuXd7 = Xu.Xd(iKK7);
                                iArr7[i8] = xuXd7.fK(xuXd7.CK(iKK7) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd11) + sXd10)));
                                i8++;
                            }
                            Object[] objArr10 = {str3, 0};
                            Method method10 = Class.forName(new String(iArr7, 0, i8)).getMethod(Ig.wd("Etu5>\u001c<I\u001d\u000em?\\ip\u001a?#~A\u0007", (short) (C1499aX.Xd() ^ (-21989))), Class.forName(C1626yg.Ud("vg\u0004[\u001d`\u0001e^x&! >x!", (short) (C1499aX.Xd() ^ (-32216)), (short) (C1499aX.Xd() ^ (-27660)))), Integer.TYPE);
                            try {
                                method10.setAccessible(true);
                                packageInfo = (PackageInfo) method10.invoke(packageManager4, objArr10);
                            } catch (InvocationTargetException e9) {
                                throw e9.getCause();
                            }
                        } catch (InvocationTargetException e10) {
                            throw e10.getCause();
                        }
                    }
                    this.f849e = packageInfo;
                    return packageInfo;
                } catch (InvocationTargetException e11) {
                    throw e11.getCause();
                }
            }
        } catch (InvocationTargetException e12) {
            throw e12.getCause();
        }
    }
}
