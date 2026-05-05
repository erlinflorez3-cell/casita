package io.cobrowse;

import android.app.Application;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import io.cobrowse.Session;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
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

/* JADX INFO: loaded from: classes3.dex */
public final class CobrowseService extends Service {
    static final String ACCESSIBILITY_UPDATED = "io.cobrowse.ACCESSIBILITY_UPDATED";
    static final String END_SESSION = "io.cobrowse.END_SESSION";
    private static Boolean isEnabled = null;
    private static boolean isForeground = false;
    private static Boolean isMediaProjectionEnabled = null;
    private static boolean isRunning = false;
    private static final ConcurrentLinkedQueue<Boolean> startCommandRequests = new ConcurrentLinkedQueue<>();
    private final Timer timer = new Timer();

    public static class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            if (CobrowseService.END_SESSION.equals(intent.getAction()) && CobrowseIO.instance().currentSession() != null) {
                CobrowseIO.instance().currentSession().end(null);
            }
            if (CobrowseService.ACCESSIBILITY_UPDATED.equals(intent.getAction())) {
                CobrowseIO.instance().reinitialize();
                Session sessionCurrentSession = CobrowseIO.instance().currentSession();
                if (sessionCurrentSession == null || sessionCurrentSession.isEnded()) {
                    return;
                }
                sessionCurrentSession.toggleCapabilitiesForFullDeviceState(sessionCurrentSession.fullDeviceState() != Session.FullDeviceState.On);
                HashMap map = new HashMap();
                map.put(io.sentry.protocol.Device.TYPE, Device.info(CobrowseInitProvider.getApplication()));
                sessionCurrentSession.update(map, null);
            }
        }
    }

    private void debugTimer() {
        this.timer.scheduleAtFixedRate(new TimerTask() { // from class: io.cobrowse.CobrowseService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
            }
        }, 0L, 10000L);
    }

    private PendingIntent getEndSessionIntent() {
        Intent intent = new Intent(this, (Class<?>) Receiver.class);
        intent.setAction(END_SESSION);
        return PendingIntent.getBroadcast(this, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    private Notification getForegroundNotification() {
        return new Notification.Builder(this).setContentTitle(getText(R.string.cobrowse_foreground_service_title)).setSmallIcon(R.drawable.cobrowse_service_icon).addAction(R.drawable.cobrowse_service_icon, getText(R.string.cobrowse_button_end_session), getEndSessionIntent()).build();
    }

    private Notification getForegroundNotificationV26() {
        return new Notification.Builder(this, getNotificationChannel().getId()).setContentTitle(getText(R.string.cobrowse_foreground_service_title)).setSmallIcon(R.drawable.cobrowse_service_icon).addAction(R.drawable.cobrowse_service_icon, getText(R.string.cobrowse_button_end_session), getEndSessionIntent()).build();
    }

    private NotificationChannel getNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel("cobrowse-io-notifications", getString(R.string.cobrowse_notification_channel_name), 2);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return notificationChannel;
    }

    static boolean isEnabled() throws Throwable {
        PackageInfo packageInfo;
        Boolean bool = isEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        Application application = CobrowseInitProvider.getApplication();
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("m{r\u0002wrn9w\u0005\u0005\fu\u007f\u0007A?lls]qn", (short) (C1633zX.Xd() ^ (-24672)))).getMethod(Qg.kd("\u0004\u0001\u000fiyz\u0002v{x_r~pur~", (short) (OY.Xd() ^ 9286), (short) (OY.Xd() ^ 4505)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(hg.Vd("@LANJC=\u0006:ECH8@E}\u0012=;@0B=", (short) (C1499aX.Xd() ^ (-8470)), (short) (C1499aX.Xd() ^ (-27495)))).getMethod(C1561oA.ud("IFT/?@G<A>&8C:", (short) (OY.Xd() ^ 10675)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(application, objArr2);
                    Class<?> cls = Class.forName(C1561oA.yd("codqmf`)]hfk[ch!\u0003~>_opwlqnUhtfkhT", (short) (C1580rY.Xd() ^ (-15666))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.Yd("IAWC\u0011PFTN\u0016<^]U[U", (short) (FB.Xd() ^ 24097)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 4};
                    Method method3 = cls.getMethod(Xg.qd(")(8\u0015'*3*10\u0015;4>", (short) (C1607wl.Xd() ^ 3197), (short) (C1607wl.Xd() ^ 1442)), clsArr);
                    try {
                        method3.setAccessible(true);
                        packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Jg.Wd("s:$-%\"\roNa", (short) (C1580rY.Xd() ^ (-20200)), (short) (C1580rY.Xd() ^ (-2906)));
            ZO.xd("CD:\u0012^o\\LPE\u0012vz9\\\\V|\r\"9\u0016gLv\\2\u001eOV\u0015~M\u001fb", (short) (C1580rY.Xd() ^ (-14978)), (short) (C1580rY.Xd() ^ (-32577)));
        }
        if (packageInfo.services == null) {
            Boolean bool2 = false;
            isEnabled = bool2;
            return bool2.booleanValue();
        }
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (CobrowseService.class.getName().equals(serviceInfo.name)) {
                Boolean boolValueOf = Boolean.valueOf(serviceInfo.isEnabled());
                isEnabled = boolValueOf;
                return boolValueOf.booleanValue();
            }
        }
        Boolean bool3 = false;
        isEnabled = bool3;
        return bool3.booleanValue();
    }

    static boolean isMediaProjectionEnabled() throws Throwable {
        PackageInfo packageInfo;
        Boolean bool = isMediaProjectionEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!isEnabled()) {
            Boolean bool2 = false;
            isMediaProjectionEnabled = bool2;
            return bool2.booleanValue();
        }
        Application application = CobrowseInitProvider.getApplication();
        short sXd = (short) (Od.Xd() ^ (-14905));
        short sXd2 = (short) (Od.Xd() ^ (-16379));
        int[] iArr = new int["t_)\u0015s\u001fC&\u0017;^Jn\\Q\u0007\u000b\u000bI?bT\u001b".length()];
        QB qb = new QB("t_)\u0015s\u001fC&\u0017;^Jn\\Q\u0007\u000b\u000bI?bT\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("\u000f^={z/U\u0002H\u0015\u0001tVIE \u007f", (short) (ZN.Xd() ^ 472)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(EO.Od("\u000eC)\u0019~VgRW1,\u0016Rk;X+g `\u0011Y1", (short) (FB.Xd() ^ 6963))).getMethod(C1561oA.Qd("\u000b\b\u0016p\u0001\u0002\t}\u0003\u007fgy\u0005{", (short) (C1580rY.Xd() ^ (-4902))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(application, objArr2);
                    Class<?> cls = Class.forName(C1593ug.zd("%3*972.x/<<C5?F\u0001DB\u0004'9<E<CB+@NBIHV", (short) (FB.Xd() ^ 20461), (short) (FB.Xd() ^ 12178)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.od("\u0014\n\u001e\bS\u0011\u0005\u0011\tNr\u0013\u0010\u0006\n\u0002", (short) (C1633zX.Xd() ^ (-7071))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 4};
                    Method method3 = cls.getMethod(C1561oA.Kd("DCS0BENELK0VOY", (short) (C1580rY.Xd() ^ (-18329))), clsArr);
                    try {
                        method3.setAccessible(true);
                        packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            short sXd3 = (short) (ZN.Xd() ^ 3855);
            short sXd4 = (short) (ZN.Xd() ^ 32745);
            int[] iArr2 = new int["_&+Ud\u0007\u0015!\u00177".length()];
            QB qb2 = new QB("_&+Ud\u0007\u0015!\u00177");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                i3++;
            }
            new String(iArr2, 0, i3);
            C1561oA.Xd("\r)2600lB>oC748tJ?=x;KL|N@CLCJI\u0005OUNX", (short) (C1607wl.Xd() ^ 2379));
        }
        if (packageInfo.services == null) {
            Boolean bool3 = false;
            isMediaProjectionEnabled = bool3;
            return bool3.booleanValue();
        }
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (CobrowseService.class.getName().equals(serviceInfo.name)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    isMediaProjectionEnabled = Boolean.valueOf((-1) - (((-1) - serviceInfo.getForegroundServiceType()) | ((-1) - 32)) == 32);
                } else {
                    isMediaProjectionEnabled = true;
                }
                return isMediaProjectionEnabled.booleanValue();
            }
        }
        Boolean bool4 = false;
        isMediaProjectionEnabled = bool4;
        return bool4.booleanValue();
    }

    static /* synthetic */ void lambda$setForeground$0(Callback callback, ScheduledExecutorService scheduledExecutorService) {
        if (startCommandRequests.peek() == null) {
            ThreadUtils.invoke(callback, null, true);
            scheduledExecutorService.shutdown();
        }
    }

    static /* synthetic */ void lambda$setForeground$1(final Callback callback) throws Exception {
        setForeground(CobrowseInitProvider.getApplication(), true);
        final ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: io.cobrowse.CobrowseService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CobrowseService.lambda$setForeground$0(callback, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            }
        }, 0L, 17L, TimeUnit.MILLISECONDS);
    }

    static boolean needMediaProjectionPermissionBeforeStart() {
        return Build.VERSION.SDK_INT >= 34 && CompatibilityUtils.targetSdkVersion() >= 34;
    }

    static void setBackground() throws Exception {
        if (isEnabled()) {
            setForeground(CobrowseInitProvider.getApplication(), false);
        }
    }

    static void setForeground() throws Exception {
        if (isEnabled()) {
            setForeground(CobrowseInitProvider.getApplication(), true);
        }
    }

    private static void setForeground(Application application, boolean z2) throws Exception {
        if (isRunning && z2 == isForeground) {
            return;
        }
        try {
            Intent intent = new Intent(application, (Class<?>) CobrowseService.class);
            intent.putExtra("foreground", z2);
            if (z2) {
                application.startForegroundService(intent);
            } else {
                CX.ud();
                application.startService(intent);
            }
            startCommandRequests.add(Boolean.valueOf(z2));
            isForeground = z2;
            isRunning = true;
        } catch (Exception e2) {
            if (Build.VERSION.SDK_INT < 31 || !e2.getClass().getSimpleName().equals(ForegroundServiceStartNotAllowedException.class.getSimpleName())) {
                String str = "CobrowseService service didn't start: " + e2.getMessage();
            }
        }
    }

    static void setForeground(final Callback<Error, Boolean> callback) {
        if (isEnabled()) {
            new Thread(new Runnable() { // from class: io.cobrowse.CobrowseService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    CobrowseService.lambda$setForeground$1(callback);
                }
            }).start();
        }
    }

    static void startCobrowseService(Application application) throws Exception {
        if (isEnabled()) {
            setForeground(application, false);
        }
    }

    static void stopCobrowseService(Application application) {
        if (isEnabled()) {
            try {
                application.stopService(new Intent(application, (Class<?>) CobrowseService.class));
            } catch (Exception e2) {
                String str = "CobrowseService didn't stop: " + e2.getMessage();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null ? intent.getBooleanExtra("foreground", false) : false) {
            try {
                startForeground(R.string.cobrowse_foreground_service_title, getForegroundNotificationV26());
            } catch (Exception e2) {
                if (Build.VERSION.SDK_INT < 31 || !e2.getClass().getSimpleName().equals(ForegroundServiceStartNotAllowedException.class.getSimpleName())) {
                    String str = "CobrowseService service didn't start: " + e2.getMessage();
                } else {
                    isForeground = false;
                }
            }
        } else {
            stopForeground(true);
        }
        startCommandRequests.poll();
        return 1;
    }
}
