package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    private static final String TAG = Logger.tagWithPrefix("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private Handler mHandler;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() throws Throwable {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) throws Throwable {
        super.onStartCommand(intent, flags, startId);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() throws Throwable {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    private void initializeDispatcher() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("A!IX\u0018\u000fM`\u00126~(nS\"\t\u0004", (short) (C1607wl.Xd() ^ 23190), (short) (C1607wl.Xd() ^ 12977))).getDeclaredMethod(C1626yg.Ud("\u0014>nb\u001caK\u001e\u001b>x_5", (short) (Od.Xd() ^ (-30620)), (short) (Od.Xd() ^ (-31055))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Context applicationContext = getApplicationContext();
            String strWd = Ig.wd("Aqd9V-C:})/N", (short) (ZN.Xd() ^ 21769));
            Class<?> cls = Class.forName(EO.Od("\u001dRz-qH#5Ea^\u0007FYg?x;rT\u007fKi", (short) (FB.Xd() ^ 30530)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Qd("vl\u0001j6sgsk1Uurhld", (short) (ZN.Xd() ^ 10786)))};
            Object[] objArr2 = {strWd};
            short sXd = (short) (FB.Xd() ^ 9436);
            short sXd2 = (short) (FB.Xd() ^ 18756);
            int[] iArr = new int["43C#JEG9B)<JOC>A".length()];
            QB qb = new QB("43C#JEG9B)<JOC>A");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                this.mNotificationManager = (NotificationManager) method.invoke(applicationContext, objArr2);
                SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
                this.mDispatcher = systemForegroundDispatcher;
                systemForegroundDispatcher.setCallback(this);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void stop() {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "All commands completed.");
        stopForeground(true);
        sForegroundService = null;
        stopSelf();
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Notification val$notification;
        final /* synthetic */ int val$notificationId;
        final /* synthetic */ int val$notificationType;

        AnonymousClass1(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            val$notificationId = val$notificationId;
            val$notification = val$notification;
            val$notificationType = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
            } else if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
            } else {
                SystemForegroundService.this.startForeground(val$notificationId, val$notification);
            }
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(final int notificationId, final int notificationType, final Notification notification) throws Throwable {
        Handler handler = this.mHandler;
        Object[] objArr = {new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            final /* synthetic */ Notification val$notification;
            final /* synthetic */ int val$notificationId;
            final /* synthetic */ int val$notificationType;

            AnonymousClass1(final int notificationId2, final Notification notification2, final int notificationType2) {
                val$notificationId = notificationId2;
                val$notification = notification2;
                val$notificationType = notificationType2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    Api29Impl.startForeground(SystemForegroundService.this, val$notificationId, val$notification, val$notificationType);
                } else {
                    SystemForegroundService.this.startForeground(val$notificationId, val$notification);
                }
            }
        }};
        Method method = Class.forName(hg.Vd("\u0001\r\u0002\u000f\u000b\u0004}F\u0007\nC\\t\u0001u|t\u0001", (short) (FB.Xd() ^ 18854), (short) (FB.Xd() ^ 14590))).getMethod(C1561oA.yd("*(//", (short) (Od.Xd() ^ (-14396))), Class.forName(C1561oA.ud("\u0005z\u000fxD\u0002u\u0002y?b\u0005|{mmvn", (short) (ZN.Xd() ^ 27981))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$2 */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ Notification val$notification;
        final /* synthetic */ int val$notificationId;

        AnonymousClass2(final int val$notificationId, final Notification val$notification) {
            val$notificationId = val$notificationId;
            val$notification = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.mNotificationManager.notify(val$notificationId, val$notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void notify(final int notificationId, final Notification notification) throws Throwable {
        Handler handler = this.mHandler;
        AnonymousClass2 anonymousClass2 = new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            final /* synthetic */ Notification val$notification;
            final /* synthetic */ int val$notificationId;

            AnonymousClass2(final int notificationId2, final Notification notification2) {
                val$notificationId = notificationId2;
                val$notification = notification2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.notify(val$notificationId, val$notification);
            }
        };
        short sXd = (short) (C1633zX.Xd() ^ (-16424));
        int[] iArr = new int["=KBQOJF\u0011SX\u0014/IWNWQ_".length()];
        QB qb = new QB("=KBQOJF\u0011SX\u0014/IWNWQ_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = {anonymousClass2};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u0019\u0017\u001a\u001a", (short) (FB.Xd() ^ 19807), (short) (FB.Xd() ^ 32260)), Class.forName(Wg.vd("TJ^H\u001cYMYI\u000f2TTSEEf^", (short) (OY.Xd() ^ 6172))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$3 */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ int val$notificationId;

        AnonymousClass3(final int val$notificationId) {
            val$notificationId = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.mNotificationManager.cancel(val$notificationId);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(final int notificationId) throws Throwable {
        Handler handler = this.mHandler;
        AnonymousClass3 anonymousClass3 = new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            final /* synthetic */ int val$notificationId;

            AnonymousClass3(final int notificationId2) {
                val$notificationId = notificationId2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.cancel(val$notificationId);
            }
        };
        Class<?> cls = Class.forName(C1561oA.od("3?4A=60x9<u\u000f'3(/'3", (short) (C1607wl.Xd() ^ 19129)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1499aX.Xd() ^ (-9040));
        int[] iArr = new int["6.D0}=3A;\u0003(LFG;=HB".length()];
        QB qb = new QB("6.D0}=3A;\u0003(LFG;=HB");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {anonymousClass3};
        Method method = cls.getMethod(Wg.Zd("c\u001f]\u001f", (short) (FB.Xd() ^ 10318), (short) (FB.Xd() ^ 10239)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(Service service, int id, Notification notification, int foregroundServiceType) {
            service.startForeground(id, notification, foregroundServiceType);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static void startForeground(Service service, int id, Notification notification, int foregroundServiceType) {
            try {
                service.startForeground(id, notification, foregroundServiceType);
            } catch (ForegroundServiceStartNotAllowedException e2) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e2);
            }
        }
    }
}
