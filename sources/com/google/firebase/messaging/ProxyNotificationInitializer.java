package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    private static boolean allowedToUse(Context context) throws Throwable {
        Object obj;
        int callingUid = Binder.getCallingUid();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("Zh_nlgc.dqqxjt{6Lyy\u0001r\u0007\u0004", (short) (OY.Xd() ^ 7734), (short) (OY.Xd() ^ 17553))).getMethod(Jg.Wd("b^\u007f\u001bl~Hgs@u\\Pq~Rlc", (short) (OY.Xd() ^ 31993), (short) (OY.Xd() ^ 23122)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strXd = ZO.xd("{\u0003<\n\u0003\u001a[Q!$6af\\:\u0012\u0014lk\u0013bW\u0018\u001fs3\u001e~D\f=2-C", (short) (C1499aX.Xd() ^ (-3537)), (short) (C1499aX.Xd() ^ (-5585)));
            String strUd = C1626yg.Ud("s\u0005-", (short) (FB.Xd() ^ 20658), (short) (FB.Xd() ^ 30573));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return callingUid == ((Integer) obj).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void initialize(Context context) {
        if (ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            return;
        }
        setEnableProxyNotification(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), context, shouldEnableProxyNotification(context));
    }

    static boolean isProxyNotificationEnabled(Context context) throws Throwable {
        boolean zIsAtLeastQ = PlatformVersion.isAtLeastQ();
        String strWd = Ig.wd(")\u001b\u0002M9r!CWld>|\u0011\u0003b6", (short) (C1499aX.Xd() ^ (-15030)));
        if (!zIsAtLeastQ) {
            if (Log.isLoggable(strWd, 3)) {
                EO.Od("zad\u001cu;\u0016\u0012rgl\tAJ\u000f~F\u000ei\u001aY2\r\u0015\u0010J,\u0003_P\u0012zEo", (short) (Od.Xd() ^ (-5075)));
            }
            return false;
        }
        if (!allowedToUse(context)) {
            StringBuilder sb = new StringBuilder(C1561oA.Qd("(43/1]/!/,\"\u001d-\u001f#\u001bR  $\u0018\u0014\u0016\u000f\f\u001e\u0012\u0017\u0015E\t\t\u000f\u0007\b\u0001\u0013\u0003<\u0002\n\f8\bwx\u007ftyv0", (short) (FB.Xd() ^ 9696)));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (C1580rY.Xd() ^ (-24643)), (short) (C1580rY.Xd() ^ (-30599)))).getMethod(C1561oA.od("fcqL\\]dY^[CU`W", (short) (C1633zX.Xd() ^ (-2647))), new Class[0]);
            try {
                method.setAccessible(true);
                sb.append((String) method.invoke(context, objArr)).toString();
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = {NotificationManager.class};
        Method method2 = Class.forName(C1561oA.Kd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (Od.Xd() ^ (-5913)))).getMethod(C1561oA.Xd("yx\th\u0010\u000b\r~\bn\u0002\u0010\u0015\t\u0004\u0007", (short) (C1499aX.Xd() ^ (-11886))), Class.forName(Wg.Zd("r'i\u0007\u0002r\u001d_$!^Ff.[", (short) (FB.Xd() ^ 3712), (short) (FB.Xd() ^ 23185))));
        try {
            method2.setAccessible(true);
            if (!Wg.vd("N[Z\u001cV_`Y_Y#We\\kiD@\u000bELS", (short) (ZN.Xd() ^ 15871)).equals(((NotificationManager) method2.invoke(context, objArr2)).getNotificationDelegate())) {
                return false;
            }
            if (!Log.isLoggable(strWd, 3)) {
                return true;
            }
            short sXd = (short) (C1607wl.Xd() ^ 24184);
            short sXd2 = (short) (C1607wl.Xd() ^ 32198);
            int[] iArr = new int["\u0003\b\rX\u001b&(\u001aS\u001c%P#\u0014\"L\u0012\u001a\u001cH\u0018\u0019\u0015\u001d\u001d\f\u0010\b".length()];
            QB qb = new QB("\u0003\b\rX\u001b&(\u001aS\u001c%P#\u0014\"L\u0012\u001a\u001cH\u0018\u0019\u0015\u001d\u001d\f\u0010\b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            new String(iArr, 0, i2);
            return true;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static /* synthetic */ void lambda$setEnableProxyNotification$0(Context context, boolean z2, TaskCompletionSource taskCompletionSource) {
        String strVd = hg.Vd("BNMIKw:EC:<9FB8<4k99=1-/(%7+0.^\"\"( !\u001a,\u001cU\u001b#%Q!\u0011\u0012\u0019\u000e\u0013\u0010I", (short) (Od.Xd() ^ (-16530)), (short) (Od.Xd() ^ (-16404)));
        try {
            if (allowedToUse(context)) {
                ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
                Class<?> cls = Class.forName(Xg.qd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (C1499aX.Xd() ^ (-17712)), (short) (C1499aX.Xd() ^ (-22685))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Jg.Wd("4<\u001dJ\"2q\u0002F]}j.Q\u001d", (short) (C1633zX.Xd() ^ (-21232)), (short) (C1633zX.Xd() ^ (-21539))));
                Object[] objArr = {NotificationManager.class};
                Method method = cls.getMethod(ZO.xd("\u001d\u0007\u0007J\r\u0013y5?\u0017fYM\u0001T\r", (short) (C1580rY.Xd() ^ (-9938)), (short) (C1580rY.Xd() ^ (-26714))), clsArr);
                try {
                    method.setAccessible(true);
                    NotificationManager notificationManager = (NotificationManager) method.invoke(context, objArr);
                    String strUd = C1626yg.Ud("Ejyv\t\u0014\n2\u001b#mp\u0010\u0007c6~u\\\u0011\n/", (short) (C1580rY.Xd() ^ (-30891)), (short) (C1580rY.Xd() ^ (-16404)));
                    if (z2) {
                        notificationManager.setNotificationDelegate(strUd);
                    } else if (strUd.equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            C1561oA.ud("Iksea_paH_lkX]^bZ", (short) (C1633zX.Xd() ^ (-22061)));
            StringBuilder sb = new StringBuilder(strVd);
            short sXd = (short) (C1633zX.Xd() ^ (-13870));
            int[] iArr = new int[" ,%22+)q\u001a%', (1iq\u001d\u001f$\u0018*)".length()];
            QB qb = new QB(" ,%22+)q\u001a%', (1iq\u001d\u001f$\u0018*)");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Class<?> cls2 = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = new Object[0];
            Method method2 = cls2.getMethod(C1561oA.Yd("('7\u0014&)2)0/\u0019-:3", (short) (C1607wl.Xd() ^ 27437)), new Class[0]);
            try {
                method2.setAccessible(true);
                sb.append((String) method2.invoke(context, objArr2)).toString();
                return;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
        taskCompletionSource.trySetResult(null);
    }

    static Task<Void> setEnableProxyNotification(Executor executor, final Context context, final boolean z2) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.ProxyNotificationInitializer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.lambda$setEnableProxyNotification$0(context, z2, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static boolean shouldEnableProxyNotification(Context context) throws Throwable {
        String strWd = Ig.wd("&Y\u0011(d68Z\twq]\u000e\u0002\u0010t$\u001fO#h\u0016xyA\u001bwa\u0018\rk=\u001a}R\u000el>)42Hj\u0013adP+6X", (short) (C1633zX.Xd() ^ (-30383)));
        short sXd = (short) (ZN.Xd() ^ 4556);
        int[] iArr = new int["+\b\u000e6f\rm\"5\u0011\nu29+F)?\u0006w(~h".length()];
        QB qb = new QB("+\b\u000e6f\rm\"5\u0011\nu29+F)?\u0006w(~h");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (FB.Xd() ^ 8857);
            int[] iArr2 = new int["\u0014\u0011\u001fj\u0019\u0018\u0013\u000f\b\u0005\u0017\u000b\u0010\u000ea\r\u000b\u0010\u007f\u0012\r".length()];
            QB qb2 = new QB("\u0014\u0011\u001fj\u0019\u0018\u0013\u000f\b\u0005\u0017\u000b\u0010\u000ea\r\u000b\u0010\u007f\u0012\r");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                short sXd3 = (short) (Od.Xd() ^ (-30729));
                short sXd4 = (short) (Od.Xd() ^ (-22813));
                int[] iArr3 = new int["GUL[YTP\u001bQ^^eWah#9ffm_sp".length()];
                QB qb3 = new QB("GUL[YTP\u001bQ^^eWah#9ffm_sp");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                    i4++;
                }
                Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr2 = new Object[0];
                Method method2 = cls2.getMethod(C1561oA.od("\u0017\u0014\"|\r\u000e\u0015\n\u000f\fr\u0006\u0012\u0004\t\u0006\u0012", (short) (OY.Xd() ^ 28084)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                    if (packageManager == null) {
                        return true;
                    }
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Kd(" .%42-)s*77>0:A{\u0012??F8LI", (short) (C1607wl.Xd() ^ 32280))).getMethod(Wg.Zd("\u0018\u001dsTmvHEaf\u00173GF", (short) (C1580rY.Xd() ^ (-10103)), (short) (C1580rY.Xd() ^ (-4144))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        String str = (String) method3.invoke(context2, objArr3);
                        Class<?> cls3 = Class.forName(C1561oA.Xd("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![\u001f\u001d^\u0002\u0014\u0017 \u0017\u001e\u001d\u0006\u001b)\u001d$#1", (short) (C1633zX.Xd() ^ (-613))));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(Wg.vd("5-?+|<.<*q\u00146913-", (short) (FB.Xd() ^ 2134)));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr4 = {str, 128};
                        short sXd5 = (short) (OY.Xd() ^ 16026);
                        short sXd6 = (short) (OY.Xd() ^ 26039);
                        int[] iArr4 = new int["C@N\u001aHGB>74F:?=\u0017;2:".length()];
                        QB qb4 = new QB("C@N\u001aHGB>74F:?=\u0017;2:");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                            i5++;
                        }
                        Method method4 = cls3.getMethod(new String(iArr4, 0, i5), clsArr2);
                        try {
                            method4.setAccessible(true);
                            ApplicationInfo applicationInfo = (ApplicationInfo) method4.invoke(packageManager, objArr4);
                            if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(strWd)) {
                                return true;
                            }
                            return applicationInfo.metaData.getBoolean(strWd);
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
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
