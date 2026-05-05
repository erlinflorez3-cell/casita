package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ReplaceWith;
import androidx.autofill.HintConstants;
import androidx.core.app.LocaleManagerCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.ExecutorCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.firebase.FirebaseError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.Executor;
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
import yg.InterfaceC1492Gx;
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
public class ContextCompat {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    @Retention(RetentionPolicy.SOURCE)
    public @interface RegisterReceiverFlags {
    }

    protected ContextCompat() {
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) throws Throwable {
        Object[] objArr = {intentArr, bundle};
        Method method = Class.forName(Qg.kd("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f", (short) (OY.Xd() ^ 23170), (short) (OY.Xd() ^ 7038))).getMethod(C1561oA.ud("oo[kl8Yi]i[eYTa", (short) (C1499aX.Xd() ^ (-7454))), Intent[].class, Class.forName(hg.Vd("9E:GC<6~?B{\u000fA9.5-", (short) (C1499aX.Xd() ^ (-13480)), (short) (C1499aX.Xd() ^ (-32650)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00079%'\u0003xq\u0017KQ+(d\u001533\u0014\u0006e[\\o\u001c_RG<.b:wte.n[Lx", imports = {})
    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.yd("\u001e,#2(#\u001fi\u0018%%,\u0016 'a\u0010==D.B?", (short) (FB.Xd() ^ 30527)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\u0012 \u0017&$\u001f\u001be\u001c))0\",3m\n07)3:", (short) (C1580rY.Xd() ^ (-6893)))), Class.forName(Xg.qd("iwn}{vr=\u007f\u0005@U\n\u0004z\u0004}", (short) (Od.Xd() ^ (-17847)), (short) (Od.Xd() ^ (-16436))))};
        Object[] objArr = {intent, bundle};
        short sXd = (short) (OY.Xd() ^ 29328);
        short sXd2 = (short) (OY.Xd() ^ 27455);
        int[] iArr = new int["bW6\u0019\u000b%9\u001a\u0001oN+\"".length()];
        QB qb = new QB("bW6\u0019\u000b%9\u001a\u0001oN+\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static File getDataDir(Context context) {
        return Api24Impl.getDataDir(context);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00079%'\u0003xq\u0017?B>\u0005R6\u0014(\u001d\u0003$\u0010", imports = {})
    @Deprecated
    public static File[] getObbDirs(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013", (short) (ZN.Xd() ^ 16620), (short) (ZN.Xd() ^ 27542))).getMethod(Jg.Wd("\u0015EHX\u0002u\rFDy", (short) (Od.Xd() ^ (-13766)), (short) (Od.Xd() ^ (-1984))), new Class[0]);
        try {
            method.setAccessible(true);
            return (File[]) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00079%'\u0003xq\u0017?B>zhH51\u0019ph-L4\u0018d\"K@-^\u000f\u0002tVm", imports = {})
    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) throws Throwable {
        Object[] objArr = {str};
        Method method = Class.forName(Qg.kd("v\u0003w\u0005\u0001ys<p{y~nv{4Hsqvfxs", (short) (OY.Xd() ^ 4042), (short) (OY.Xd() ^ 13093))).getMethod(C1561oA.ud("YVd4faQ]XJT-OQIV&JRR", (short) (C1607wl.Xd() ^ 26957)), Class.forName(hg.Vd("J@T>\nG;G?\u0005)IF<@8", (short) (C1633zX.Xd() ^ (-31597)), (short) (C1633zX.Xd() ^ (-20501)))));
        try {
            method.setAccessible(true);
            return (File[]) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00079%'\u0003xq\u0017?B>zhH51\u0019ph*D+\u001bV\"K@-^C", imports = {})
    @Deprecated
    public static File[] getExternalCacheDirs(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("*8/><73}4AAH:DK\u0006\u001cIIPBVS", (short) (C1633zX.Xd() ^ (-22652)))).getMethod(Wg.vd("}z\r\\\u0013\u000e\u0002\u000e|n|Rst|xJnzz", (short) (C1633zX.Xd() ^ (-17811))), new Class[0]);
        try {
            method.setAccessible(true);
            return (File[]) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Drawable getDrawable(Context context, int i2) {
        return Api21Impl.getDrawable(context, i2);
    }

    public static ColorStateList getColorStateList(Context context, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("6D;J@;7\u0002@MMT>HO\n\b55<&:7", (short) (Od.Xd() ^ (-17503)))).getMethod(C1561oA.Yd("\u0007\u0006\u0016t\t\u0018\u0015\u001c\u001a\f\u000f\u001e", (short) (ZN.Xd() ^ 4339)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            short sXd = (short) (C1633zX.Xd() ^ (-31715));
            short sXd2 = (short) (C1633zX.Xd() ^ (-16476));
            int[] iArr = new int["?MDSQLH\u0013IVV]OY`\u001b1^^eWkh".length()];
            QB qb = new QB("?MDSQLH\u0013IVV]OY`\u001b1^^eWkh");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("4.\u0001,U\u0010[`", (short) (C1499aX.Xd() ^ (-21877)), (short) (C1499aX.Xd() ^ (-29198))), new Class[0]);
            try {
                method2.setAccessible(true);
                return ResourcesCompat.getColorStateList(resources, i2, (Resources.Theme) method2.invoke(context, objArr2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int getColor(Context context, int i2) {
        return Api23Impl.getColor(context, i2);
    }

    public static int checkSelfPermission(Context context, String str) throws Throwable {
        ObjectsCompat.requireNonNull(str, C1561oA.Xd("B8FB?JKBII{JSRT\u0001DH\u0004SUU\u0015W_WX", (short) (C1633zX.Xd() ^ (-32687))));
        if (Build.VERSION.SDK_INT < 33) {
            short sXd = (short) (C1499aX.Xd() ^ (-23673));
            int[] iArr = new int["~\r\u0004\u0013\t\u0004\u007fJ\u0016\f\u001a\u0016\u000b\u0016\u0017\u000e||=`X]_kcekaW[VU\u0012\b\u000f\u000f\r".length()];
            QB qb = new QB("~\r\u0004\u0013\t\u0004\u007fJ\u0016\f\u001a\u0016\u000b\u0016\u0017\u000e||=`X]_kcekaW[VU\u0012\b\u000f\u000f\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            if (TextUtils.equals(new String(iArr, 0, i2), str)) {
                return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
            }
        }
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        Class<?> cls = Class.forName(Qg.kd("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (C1633zX.Xd() ^ (-30029)), (short) (C1633zX.Xd() ^ (-8822))));
        Class<?>[] clsArr = {Class.forName(hg.Vd(",\"6 k)\u001d)!f\u000b+(\u001e\"\u001a", (short) (C1607wl.Xd() ^ 17977), (short) (C1607wl.Xd() ^ 8982))), Integer.TYPE, Integer.TYPE};
        Object[] objArr = {str, Integer.valueOf(iMyPid), Integer.valueOf(iMyUid)};
        Method method = cls.getMethod(C1561oA.ud("\u001c \u001c\u0019 \u0004\u0018$\u001e\u0019\"!\u0016\u001b\u0019", (short) (C1633zX.Xd() ^ (-30613))), clsArr);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(context, objArr)).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static File getNoBackupFilesDir(Context context) {
        return Api21Impl.getNoBackupFilesDir(context);
    }

    public static File getCodeCacheDir(Context context) {
        return Api21Impl.getCodeCacheDir(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                String str = "Unable to create files subdir " + file.getPath();
            }
            return file;
        }
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return Api24Impl.createDeviceProtectedStorageContext(context);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return Api24Impl.isDeviceProtectedStorage(context);
    }

    public static Executor getMainExecutor(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getMainExecutor(context);
        }
        Class<?> cls = Class.forName(C1561oA.yd("Xd]jjca*R]_dX`i\"*UW\\Pba", (short) (FB.Xd() ^ 29066)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 26986);
        int[] iArr = new int["GFV0ENT3WXZP^".length()];
        QB qb = new QB("GFV0ENT3WXZP^");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ExecutorCompat.create(new Handler((Looper) method.invoke(context, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void startForegroundService(Context context, Intent intent) throws Throwable {
        Api26Impl.startForegroundService(context, intent);
    }

    public static Display getDisplayOrDefault(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getDisplayOrDefault(context);
        }
        short sXd = (short) (C1633zX.Xd() ^ (-5055));
        short sXd2 = (short) (C1633zX.Xd() ^ (-26968));
        int[] iArr = new int["pci`lu".length()];
        QB qb = new QB("pci`lu");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (C1607wl.Xd() ^ 3350);
        int[] iArr2 = new int["MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ".length()];
        QB qb2 = new QB("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.Zd("~K\u001dr[L\u0010w2\u0013ck.\u001cT%", (short) (Od.Xd() ^ (-8024)), (short) (Od.Xd() ^ (-7365))), Class.forName(C1561oA.Kd(" \u0018.\u001ag'\u001d+%l\u001354,2,", (short) (ZN.Xd() ^ 28877))));
        try {
            method.setAccessible(true);
            return ((WindowManager) method.invoke(context, objArr)).getDefaultDisplay();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) Api23Impl.getSystemService(context, cls);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i2);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int i3 = i2 & 1;
        if (i3 == 0 || (i2 + 4) - (4 | i2) == 0) {
            if (i3 != 0) {
                i2 = (-1) - (((-1) - i2) & ((-1) - 2));
            }
            int i4 = (i2 + 2) - (2 | i2);
            if (i4 != 0 || (i2 + 4) - (4 | i2) != 0) {
                if (i4 != 0 && (-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                    throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    return Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i2);
                }
                return Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i2);
            }
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return Api23Impl.getSystemServiceName(context, cls);
    }

    public static String getString(Context context, int i2) throws Throwable {
        Context contextForLanguage = getContextForLanguage(context);
        Class<?> cls = Class.forName(ZO.xd("yIVd)B\u001d\u0016myZy\u001el\r\u0018]/G\u001a/>\u001d", (short) (C1580rY.Xd() ^ (-5643)), (short) (C1580rY.Xd() ^ (-27830))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1626yg.Ud("wZ\u000f}F>m\u0004!", (short) (ZN.Xd() ^ 9165), (short) (ZN.Xd() ^ 21890)), clsArr);
        try {
            method.setAccessible(true);
            return (String) method.invoke(contextForLanguage, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Context getContextForLanguage(Context context) throws Throwable {
        LocaleListCompat applicationLocales = LocaleManagerCompat.getApplicationLocales(context);
        if (Build.VERSION.SDK_INT > 32 || applicationLocales.isEmpty()) {
            return context;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u0012!V59M(i\u001dkzxR5/#\u001ev\u001f+#\u0014W", (short) (C1499aX.Xd() ^ (-2499)), (short) (C1499aX.Xd() ^ (-11018)))).getMethod(C1626yg.Ud("h\u001bR}\u0003V\u0016k*p,H", (short) (ZN.Xd() ^ 26850), (short) (ZN.Xd() ^ 2754)), new Class[0]);
        try {
            method.setAccessible(true);
            Configuration configuration = new Configuration(((Resources) method.invoke(context, objArr)).getConfiguration());
            ConfigurationCompat.setLocales(configuration, applicationLocales);
            short sXd = (short) (C1607wl.Xd() ^ 22788);
            int[] iArr = new int["V\n}o4Y|m`LU1SZ\u0011$d\u0013Y#Q,\u000e".length()];
            QB qb = new QB("V\n}o4Y|m`LU1SZ\u0011$d\u0013Y#Q,\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {Class.forName(EO.Od("nL\u0006w$s\u0007ohTI9y\u0005Zy\u0014|BxQ5\u000e\n\u0001>.dA&r`?", (short) (C1580rY.Xd() ^ (-26658))))};
            Object[] objArr2 = {configuration};
            short sXd2 = (short) (Od.Xd() ^ (-17586));
            int[] iArr2 = new int["u\u0004up\u0003rOzxoqn{wewkpnBmkp`rm".length()];
            QB qb2 = new QB("u\u0004up\u0003rOzxoqn{wewkpnBmkp`rm");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                return (Context) method2.invoke(context, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.createAttributionContext(context, str) : context;
    }

    static String obtainAndCheckReceiverPermission(Context context) throws Throwable {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("oLR\u0006\"O$cZgj\rS\\H\u001d\u0006\u001anZ\riy", (short) (ZN.Xd() ^ 23736))).getMethod(EO.Od("\u0007;:`\u0019Nh\u001784K\u001cMT\u001b#_}\u0018ex", (short) (C1580rY.Xd() ^ (-281))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Qd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (C1580rY.Xd() ^ (-7837)))).getMethod(C1593ug.zd("\u0018\u0017'\u0004\u0016\u0019\"\u0019 \u001f\t\u001d*#", (short) (C1580rY.Xd() ^ (-28261)), (short) (C1580rY.Xd() ^ (-4912))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend = sb.append((String) method2.invoke(context2, objArr2));
                short sXd = (short) (ZN.Xd() ^ FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL);
                int[] iArr = new int["0EYM?JE>YK=:;>J8DP>>BL1C:8:;+)C3'3-(10%*(".length()];
                QB qb = new QB("0EYM?JE>YK=:;>J8DP>>BL1C:8:;+)C3'3-(10%*(");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String string = sbAppend.append(str).toString();
                if (PermissionChecker.checkSelfPermission(context, string) == 0) {
                    return string;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    StringBuilder sb2 = new StringBuilder();
                    short sXd2 = (short) (C1607wl.Xd() ^ 2115);
                    int[] iArr2 = new int["\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,".length()];
                    QB qb2 = new QB("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                        i3++;
                    }
                    Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (C1607wl.Xd() ^ 21077);
                    short sXd4 = (short) (C1607wl.Xd() ^ 21163);
                    int[] iArr3 = new int["Te}e\u0018\u0005\u001f.GHWj\\|\u0012\u001f".length()];
                    QB qb3 = new QB("Te}e\u0018\u0005\u001f.GHWj\\|\u0012\u001f");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Method method3 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                    try {
                        method3.setAccessible(true);
                        string = sb2.append((String) method3.invoke(context, objArr3)).append(str).toString();
                        if (PermissionChecker.checkSelfPermission(context, string) == 0) {
                            return string;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                throw new RuntimeException(C1561oA.Xd("\u001f5C?<GH?FFx", (short) (C1580rY.Xd() ^ (-22699))) + string + Wg.vd("p9Bm?1<?BJ<:t6LqZOTP|=KJUQJGYMRPP$\u001eM\u001f\u0011\u000e\u000f\".\u001cU\u0017&\"\u0013%# 11/fY94,'8)b#ut/w\u0002,\u007fy9\u0012\u0007\f\b4\u0001s\u0010\n\u0006\u0004\u0011\u0011", (short) (C1607wl.Xd() ^ 14466)));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static final class LegacyServiceMapHolder {
        static final HashMap<Class<?>, String> SERVICES;

        private LegacyServiceMapHolder() {
        }

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            SERVICES = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, FirebaseAnalytics.Param.LOCATION);
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, HintConstants.AUTOFILL_HINT_PHONE);
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Drawable getDrawable(Context context, int i2) throws Throwable {
            short sXd = (short) (Od.Xd() ^ (-21448));
            int[] iArr = new int["EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB".length()];
            QB qb = new QB("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            short sXd2 = (short) (Od.Xd() ^ (-4909));
            short sXd3 = (short) (Od.Xd() ^ (-32058));
            int[] iArr2 = new int["! 0\u00010 7\"$/)".length()];
            QB qb2 = new QB("! 0\u00010 7\"$/)");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) - sXd3);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                return (Drawable) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static File getNoBackupFilesDir(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (FB.Xd() ^ 32141))).getMethod(C1561oA.Kd("=<L'I\u001d=@ITP'KOIX*PZ", (short) (C1607wl.Xd() ^ 3318)), new Class[0]);
            try {
                method.setAccessible(true);
                return (File) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static File getCodeCacheDir(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("{4Z\u000b\u00162SK54/\u001d:Cg\u0006A}3S\tV>", (short) (C1607wl.Xd() ^ 11457))).getMethod(EO.Od("0x\u001a\r`\u0012r9\u0012DGfs#Q", (short) (C1607wl.Xd() ^ 25507)), new Class[0]);
            try {
                method.setAccessible(true);
                return (File) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getColor(Context context, int i2) throws Throwable {
            Class<?> cls = Class.forName(Wg.Zd("ZJ\u001b\u0014oL.\u000en\u001d;g3+\u001c00~\u0019EQ\u0007m", (short) (FB.Xd() ^ 6696), (short) (FB.Xd() ^ 30560)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.Xd("CBR\"OMQU", (short) (C1580rY.Xd() ^ (-4174))), clsArr);
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(context, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static <T> T getSystemService(Context context, Class<T> cls) throws Throwable {
            short sXd = (short) (C1499aX.Xd() ^ (-17412));
            int[] iArr = new int["\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H|(&+\u001b-(".length()];
            QB qb = new QB("\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H|(&+\u001b-(");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {cls};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("\u0003\u007f\u000ek\u0011\n\ny\u0001ev\u0003\u0006wpq", (short) (C1499aX.Xd() ^ (-513)), (short) (C1499aX.Xd() ^ (-14938))), Class.forName(Qg.kd("UK_I\u0015RFRJ\u0010$L@QP", (short) (C1499aX.Xd() ^ (-2043)), (short) (C1499aX.Xd() ^ (-18476)))));
            try {
                method.setAccessible(true);
                return (T) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static String getSystemServiceName(Context context, Class<?> cls) throws Throwable {
            Object[] objArr = {cls};
            Method method = Class.forName(C1561oA.ud("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019Mxv{k}x", (short) (C1580rY.Xd() ^ (-25627)))).getMethod(C1561oA.Yd(">=M-TOQCL3FTYMHK5IVO", (short) (C1607wl.Xd() ^ 2251)), Class.forName(C1561oA.yd("1)?+x8.<&m\u0004.$78", (short) (ZN.Xd() ^ 14792))));
            try {
                method.setAccessible(true);
                return (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static File getDataDir(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("\u0012q3\u0015\u001a9\nQm\u0005DB`\u001b\u0006\u000e'A\f ^8{", (short) (ZN.Xd() ^ 13802), (short) (ZN.Xd() ^ 30879))).getMethod(C1626yg.Ud("dH\r\u00060v\rP\u0016(", (short) (FB.Xd() ^ IptcDirectory.TAG_TIME_SENT), (short) (FB.Xd() ^ 9831)), new Class[0]);
            try {
                method.setAccessible(true);
                return (File) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static Context createDeviceProtectedStorageContext(Context context) throws Throwable {
            Class<?> cls = Class.forName(Xg.qd("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?", (short) (Od.Xd() ^ (-20356)), (short) (Od.Xd() ^ (-333))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-2062));
            short sXd2 = (short) (C1633zX.Xd() ^ (-21684));
            int[] iArr = new int["vk7\rx?zqO({W\u001b\u0013lG\u0005hR\u001eu:8xX-\fc\u001b\u001dx\u0004RJ ".length()];
            QB qb = new QB("vk7\rx?zqO({W\u001b\u0013lG\u0005hR\u001eu:8xX-\fc\u001b\u001dx\u0004RJ ");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static boolean isDeviceProtectedStorage(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("\u007fU\u0019\u0017\u000b@OX73,{>USn[i0NxS-", (short) (FB.Xd() ^ 13526))).getMethod(EO.Od("\u0007bA\n\u001ccy\u0014ELK*ein:\u0016zd\u0017p\u0018oq", (short) (C1499aX.Xd() ^ (-4046))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(context, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) throws Throwable {
            if ((i2 & 4) != 0 && str == null) {
                String strObtainAndCheckReceiverPermission = ContextCompat.obtainAndCheckReceiverPermission(context);
                Class<?> cls = Class.forName(C1561oA.Qd("8D9FB;5}2=;@08=u\n538(:5", (short) (C1633zX.Xd() ^ (-18667))));
                Class<?>[] clsArr = new Class[4];
                short sXd = (short) (C1607wl.Xd() ^ 30295);
                short sXd2 = (short) (C1607wl.Xd() ^ 27249);
                int[] iArr = new int["[i`omhd/erryku|7L}{nrrq\u0005\u0007eyx{\u0001\u000f~\r".length()];
                QB qb = new QB("[i`omhd/erryku|7L}{nrrq\u0005\u0007eyx{\u0001\u000f~\r");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                clsArr[1] = Class.forName(C1561oA.od("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bC]\u0002\u0007v~\u0004Tvx\u007fo{", (short) (C1607wl.Xd() ^ 20200)));
                short sXd3 = (short) (FB.Xd() ^ 7950);
                int[] iArr2 = new int[")!7#p0&4.u\u001c>=5;5".length()];
                QB qb2 = new QB(")!7#p0&4.u\u001c>=5;5");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i4));
                    i4++;
                }
                clsArr[2] = Class.forName(new String(iArr2, 0, i4));
                short sXd4 = (short) (C1580rY.Xd() ^ (-21218));
                short sXd5 = (short) (C1580rY.Xd() ^ (-18251));
                int[] iArr3 = new int["S\u0018In%:loL\b[1\u0002&Yx)S".length()];
                QB qb3 = new QB("S\u0018In%:loL\b[1\u0002&Yx)S");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(((i5 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                    i5++;
                }
                clsArr[3] = Class.forName(new String(iArr3, 0, i5));
                Object[] objArr = {broadcastReceiver, intentFilter, strObtainAndCheckReceiverPermission, handler};
                Method method = cls.getMethod(C1561oA.Xd("\u001b\u000f\u0012\u0015 \"\u0014\"\u0003\u0017\u0016\u0019\u001e,\u001c*", (short) (C1580rY.Xd() ^ (-23320))), clsArr);
                try {
                    method.setAccessible(true);
                    return (Intent) method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            int i6 = (-1) - (((-1) - i2) | ((-1) - 1));
            short sXd6 = (short) (ZN.Xd() ^ 8772);
            int[] iArr4 = new int["s\u007ft\u0002\u0006~xAmxv{s{\u00019e\u0011\u000f\u0014\f\u001e\u0019".length()];
            QB qb4 = new QB("s\u007ft\u0002\u0006~xAmxv{s{\u00019e\u0011\u000f\u0014\f\u001e\u0019");
            int i7 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i7] = xuXd4.fK((sXd6 ^ i7) + xuXd4.CK(iKK4));
                i7++;
            }
            Class<?> cls2 = Class.forName(new String(iArr4, 0, i7));
            Class<?>[] clsArr2 = new Class[5];
            clsArr2[0] = Class.forName(Qg.kd(":F;HD=7\u007f4?=B2:?w\u000b:6')'$55\u0012$!\"%1\u001f+", (short) (ZN.Xd() ^ 31397), (short) (ZN.Xd() ^ 22552)));
            clsArr2[1] = Class.forName(hg.Vd(">J?LHA;\u00048CAF6>C{\u0016:?/7<\r/18(4", (short) (C1499aX.Xd() ^ (-8482)), (short) (C1499aX.Xd() ^ (-27872))));
            clsArr2[2] = Class.forName(C1561oA.ud("dZnX$aUaY\u001fCc`VZR", (short) (C1607wl.Xd() ^ 830)));
            short sXd7 = (short) (Od.Xd() ^ (-23135));
            int[] iArr5 = new int[":H?ND?;\u0006PU\u0011,>LCL.<".length()];
            QB qb5 = new QB(":H?ND?;\u0006PU\u0011,>LCL.<");
            int i8 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i8] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd7 ^ i8));
                i8++;
            }
            clsArr2[3] = Class.forName(new String(iArr5, 0, i8));
            clsArr2[4] = Integer.TYPE;
            Object[] objArr2 = {broadcastReceiver, intentFilter, str, handler, Integer.valueOf(i6)};
            short sXd8 = (short) (C1607wl.Xd() ^ 9266);
            int[] iArr6 = new int["|psv\u0002\u0004u\u0004dxwz\u007f\u000e}\f".length()];
            QB qb6 = new QB("|psv\u0002\u0004u\u0004dxwz\u007f\u000e}\f");
            int i9 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i9] = xuXd6.fK(xuXd6.CK(iKK6) - (((sXd8 + sXd8) + sXd8) + i9));
                i9++;
            }
            Method method2 = cls2.getMethod(new String(iArr6, 0, i9), clsArr2);
            try {
                method2.setAccessible(true);
                return (Intent) method2.invoke(context, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        static ComponentName startForegroundService(Context context, Intent intent) throws Throwable {
            Object[] objArr = {intent};
            Method method = Class.forName(Xg.qd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (C1499aX.Xd() ^ (-2562)), (short) (C1499aX.Xd() ^ (-9494)))).getMethod(ZO.xd("\u0007%usp5e\u001ce\u0015\fxY|K^d\u001e\u001e\fy+", (short) (OY.Xd() ^ 3299), (short) (OY.Xd() ^ 24264)), Class.forName(Jg.Wd("JS%\u0011xQ*SS;9\u001c|_DZCH(v\fs", (short) (OY.Xd() ^ 20574), (short) (OY.Xd() ^ 16346))));
            try {
                method.setAccessible(true);
                return (ComponentName) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Executor getMainExecutor(Context context) throws Throwable {
            Class<?> cls = Class.forName(C1626yg.Ud("7\u0014\u0001-h\u0014AFNa6\u001bQbZ-Lxb\u0006\u000f\u000e\u0001", (short) (C1633zX.Xd() ^ (-7851)), (short) (C1633zX.Xd() ^ (-29295))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (FB.Xd() ^ 32457);
            int[] iArr = new int["\u0006<9i\u0005`\u0014YAPN\u00010/<".length()];
            QB qb = new QB("\u0006<9i\u0005`\u0014YAPN\u00010/<");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return (Executor) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static String getAttributionTag(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("$0%2.'!i\u001e)',\u001c$)au!\u001f$\u0014&!", (short) (C1607wl.Xd() ^ 25123))).getMethod(C1561oA.Kd("A@P\u001eRSRJDXXNUU<JQ", (short) (C1580rY.Xd() ^ (-30266))), new Class[0]);
            try {
                method.setAccessible(true);
                return (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static Display getDisplayOrDefault(Context context) throws Throwable {
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.Zd("cL\"\nj<\u0017:S?6\u001ejS1L=)\b\b\\G#", (short) (C1607wl.Xd() ^ 21930), (short) (C1607wl.Xd() ^ 19653))).getMethod(C1561oA.Xd("QP`1Wb`]Sl", (short) (OY.Xd() ^ 31593)), new Class[0]);
                try {
                    method.setAccessible(true);
                    return (Display) method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (UnsupportedOperationException unused) {
                String str = Wg.vd("FYY\u0013YdfkOa`%", (short) (C1499aX.Xd() ^ (-21686))) + context + Qg.kd("}FOzHHLv7HGB5:1C31kB3=0f'3=b&*3/*\u001e5hY\u000b\u001d++'\"R\u0013P\u0016\u0010\u001a\u0019\u000e\f\r\u0014G\u000b\u000f\u0018\u0014\u000f\u0003\u001a?\b\f\u0010\u0010\u007fz|E", (short) (ZN.Xd() ^ 25058), (short) (ZN.Xd() ^ 6290));
                hg.Vd("\u0001,*/\u001f1,y%\"$\u0014&", (short) (OY.Xd() ^ 31006), (short) (OY.Xd() ^ 26607));
                Class<?> cls = Class.forName(C1561oA.ud("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (C1633zX.Xd() ^ (-9868))));
                Class<?>[] clsArr = {Class.forName(C1561oA.yd("|t\u0007rD\u0004u\u0004q9Kuo\u0003\u007f", (short) (FB.Xd() ^ 11449)))};
                Object[] objArr2 = {DisplayManager.class};
                short sXd = (short) (OY.Xd() ^ 22442);
                int[] iArr = new int["ml|\\\u0004~\u0001r{bu\u0004\t|wz".length()];
                QB qb = new QB("ml|\\\u0004~\u0001r{bu\u0004\t|wz");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    return ((DisplayManager) method2.invoke(context, objArr2)).getDisplay(0);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }

        static Context createAttributionContext(Context context, String str) throws Throwable {
            Object[] objArr = {str};
            Method method = Class.forName(EO.Od(")g\f5b:\r.3NGs0G\u0019sF\rC\u00066|\u0017", (short) (C1499aX.Xd() ^ (-580)))).getMethod(C1593ug.zd("3C74H:\u0017KLKC=QQGNN$QQXJ^[", (short) (C1499aX.Xd() ^ (-22063)), (short) (C1499aX.Xd() ^ (-23717))), Class.forName(C1561oA.Qd("\u0011\u0007\u001b\u0005P\u000e\u0002\u000e\u0006Ko\u0010\r\u0003\u0007~", (short) (ZN.Xd() ^ 18602))));
            try {
                method.setAccessible(true);
                return (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) throws Throwable {
            short sXd = (short) (C1580rY.Xd() ^ (-29980));
            short sXd2 = (short) (C1580rY.Xd() ^ (-28273));
            int[] iArr = new int["ESJYWRN\u0019O\\\\cU_f!7ddk]qn".length()];
            QB qb = new QB("ESJYWRN\u0019O\\\\cU_f!7ddk]qn");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = new Class[5];
            clsArr[0] = Class.forName(Jg.Wd("\u0012yMx3Ng\u000f\u0002kL\u0010\u001fElcUd?r\u0013/j\u001by5\u0006a\u0006\u0007q}l", (short) (OY.Xd() ^ 24629), (short) (OY.Xd() ^ 29392)));
            clsArr[1] = Class.forName(ZO.xd(":N\u0006P~\u007f\u001cMs\u0005Z=\u001c$}C9d+oZE\u0001e\u0018\u0014r$", (short) (OY.Xd() ^ 23876), (short) (OY.Xd() ^ 28641)));
            short sXd3 = (short) (OY.Xd() ^ 21125);
            short sXd4 = (short) (OY.Xd() ^ 21027);
            int[] iArr2 = new int["$Q\u000b\u0015(\"*x\u000fzpx\u0005?\u0011>".length()];
            QB qb2 = new QB("$Q\u000b\u0015(\"*x\u000fzpx\u0005?\u0011>");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd2.CK(iKK2));
                i4++;
            }
            clsArr[2] = Class.forName(new String(iArr2, 0, i4));
            short sXd5 = (short) (C1633zX.Xd() ^ (-13276));
            int[] iArr3 = new int["\u0002?'\u0015\tNuFe9yqX_9\u001f_)".length()];
            QB qb3 = new QB("\u0002?'\u0015\tNuFe9yqX_9\u001f_)");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd5 + i5)));
                i5++;
            }
            clsArr[3] = Class.forName(new String(iArr3, 0, i5));
            clsArr[4] = Integer.TYPE;
            Object[] objArr = {broadcastReceiver, intentFilter, str, handler, Integer.valueOf(i2)};
            short sXd6 = (short) (Od.Xd() ^ (-5735));
            int[] iArr4 = new int["_%tV@n\u00048w.&J\u001a%o\u001e".length()];
            QB qb4 = new QB("_%tV@n\u00048w.&J\u001a%o\u001e");
            int i6 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i6] = xuXd4.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i6)) + xuXd4.CK(iKK4));
                i6++;
            }
            Method method = cls.getMethod(new String(iArr4, 0, i6), clsArr);
            try {
                method.setAccessible(true);
                return (Intent) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
