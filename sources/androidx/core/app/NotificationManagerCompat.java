package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners = null;
    private static SideChannelManager sSideChannelManager = null;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    @Retention(RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    private interface Task {
        void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    private NotificationManagerCompat(Context context) throws Throwable {
        this.mContext = context;
        Object[] objArr = {hg.Vd("??C735.+=164", (short) (C1607wl.Xd() ^ 26764), (short) (C1607wl.Xd() ^ 9512))};
        Method method = Class.forName(C1561oA.ud("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (OY.Xd() ^ 22930))).getMethod(C1561oA.Yd("lk{[\u0003}\u007fqzat\u0003\b{vy", (short) (C1633zX.Xd() ^ (-20449))), Class.forName(C1561oA.yd("D<R>\u0004C9GI\u00117YPHNH", (short) (Od.Xd() ^ (-431)))));
        try {
            method.setAccessible(true);
            this.mNotificationManager = (NotificationManager) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public void cancel(int i2) {
        cancel(null, i2);
    }

    public void cancel(String str, int i2) {
        this.mNotificationManager.cancel(str, i2);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void notify(int i2, Notification notification) throws Throwable {
        notify(null, i2, notification);
    }

    public void notify(String str, int i2, Notification notification) throws Throwable {
        if (useSideChannelForNotification(notification)) {
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("\u001c!\u000b\trdS\u000e/+'\u001dysm\u001f!=0'\f\u000f\u007f", (short) (C1499aX.Xd() ^ (-26322)), (short) (C1499aX.Xd() ^ (-7303)))).getMethod(C1561oA.Xd("#\"2\u000f!$-$+*\u0014(5.", (short) (ZN.Xd() ^ 5008)), new Class[0]);
            try {
                method.setAccessible(true);
                pushSideChannelQueue(new NotifyTask((String) method.invoke(context, objArr), i2, str, notification));
                this.mNotificationManager.cancel(str, i2);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.mNotificationManager.notify(str, i2, notification);
    }

    public void notify(List<NotificationWithIdAndTag> list) throws Throwable {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            NotificationWithIdAndTag notificationWithIdAndTag = list.get(i2);
            notify(notificationWithIdAndTag.mTag, notificationWithIdAndTag.mId, notificationWithIdAndTag.mNotification);
        }
    }

    public static class NotificationWithIdAndTag {
        final int mId;
        Notification mNotification;
        final String mTag;

        public NotificationWithIdAndTag(String str, int i2, Notification notification) {
            this.mTag = str;
            this.mId = i2;
            this.mNotification = notification;
        }

        public NotificationWithIdAndTag(int i2, Notification notification) {
            this(null, i2, notification);
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return Api23Impl.getActiveNotifications(this.mNotificationManager);
    }

    public boolean areNotificationsEnabled() {
        return Api24Impl.areNotificationsEnabled(this.mNotificationManager);
    }

    public int getImportance() {
        return Api24Impl.getImportance(this.mNotificationManager);
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        Api26Impl.createNotificationChannel(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannel(NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        Api26Impl.createNotificationChannelGroup(this.mNotificationManager, notificationChannelGroup);
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        Api26Impl.createNotificationChannels(this.mNotificationManager, list);
    }

    public void createNotificationChannelsCompat(List<NotificationChannelCompat> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationChannelCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannel());
        }
        Api26Impl.createNotificationChannels(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, list);
    }

    public void createNotificationChannelGroupsCompat(List<NotificationChannelGroupCompat> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationChannelGroupCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannelGroup());
        }
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        Api26Impl.deleteNotificationChannel(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(String str) {
        Api26Impl.deleteNotificationChannelGroup(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel notificationChannel : Api26Impl.getNotificationChannels(this.mNotificationManager)) {
            if (!collection.contains(Api26Impl.getId(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(Api30Impl.getParentChannelId(notificationChannel)))) {
                Api26Impl.deleteNotificationChannel(this.mNotificationManager, Api26Impl.getId(notificationChannel));
            }
        }
    }

    public NotificationChannel getNotificationChannel(String str) {
        return Api26Impl.getNotificationChannel(this.mNotificationManager, str);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new NotificationChannelCompat(notificationChannel);
        }
        return null;
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getNotificationChannel(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new NotificationChannelCompat(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getNotificationChannelGroup(this.mNotificationManager, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
            if (Api26Impl.getId(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new NotificationChannelGroupCompat(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Api26Impl.getNotificationChannels(this.mNotificationManager);
    }

    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (!notificationChannels.isEmpty()) {
            ArrayList arrayList = new ArrayList(notificationChannels.size());
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(new NotificationChannelCompat(it.next()));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Api26Impl.getNotificationChannelGroups(this.mNotificationManager);
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> notificationChannels;
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (!notificationChannelGroups.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 28) {
                notificationChannels = Collections.emptyList();
            } else {
                notificationChannels = getNotificationChannels();
            }
            ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
            for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                if (Build.VERSION.SDK_INT >= 28) {
                    arrayList.add(new NotificationChannelGroupCompat(notificationChannelGroup));
                } else {
                    arrayList.add(new NotificationChannelGroupCompat(notificationChannelGroup, notificationChannels));
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static Set<String> getEnabledListenerPackages(Context context) throws Throwable {
        Set<String> set;
        short sXd = (short) (C1607wl.Xd() ^ 23673);
        short sXd2 = (short) (C1607wl.Xd() ^ 13736);
        int[] iArr = new int["esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f".length()];
        QB qb = new QB("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("fRP\u0005\u001e\u000e~YOD\u0011\r\u0005rYL)&", (short) (ZN.Xd() ^ 7757), (short) (ZN.Xd() ^ 14675)), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            short sXd3 = (short) (C1633zX.Xd() ^ (-29257));
            short sXd4 = (short) (C1633zX.Xd() ^ (-25469));
            int[] iArr2 = new int["\u000f@\u001c\u0012/uE\r\u001dH\u001cLQM\u0015u'KSQ=_'{@9+E\u001a7".length()];
            QB qb2 = new QB("\u000f@\u001c\u0012/uE\r\u001dH\u001cLQM\u0015u'KSQ=_'{@9+E\u001a7");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            String string = Settings.Secure.getString(contentResolver, new String(iArr2, 0, i3));
            synchronized (sEnabledNotificationListenersLock) {
                if (string != null) {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] strArrSplit = string.split(C1626yg.Ud("&", (short) (ZN.Xd() ^ 19668), (short) (ZN.Xd() ^ 15998)), -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                    set = sEnabledNotificationListenerPackages;
                } else {
                    set = sEnabledNotificationListenerPackages;
                }
            }
            return set;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean canUseFullScreenIntent() throws Throwable {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.canUseFullScreenIntent(this.mNotificationManager);
        }
        Context context = this.mContext;
        Object[] objArr = {C1561oA.Qd("/;0=92,t6*60+43(-+i\u0010\r}\u0017|\u000b\u0001\u007f\u0012\u0005s\u0002srz\u000bsw|lty", (short) (Od.Xd() ^ (-6265)))};
        Method method = Class.forName(C1593ug.zd("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?", (short) (FB.Xd() ^ 10359), (short) (FB.Xd() ^ 26104))).getMethod(C1561oA.Kd("y\u007f}|\u0006n\u0002\n\u0005o\u0006\u0014\u0010\r\u0018\u0019\u0010\u0017\u0017", (short) (OY.Xd() ^ 15054)), Class.forName(C1561oA.od("9/C-x6*6.s\u001885+/'", (short) (OY.Xd() ^ 10000))));
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(context, objArr)).intValue() == 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public int getCurrentInterruptionFilter() {
        return Api23Impl.getCurrentInterruptionFilter(this.mNotificationManager);
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                Context context = this.mContext;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Ig.wd(".\u0017X@c\u0001*!w\u0006\u0005n\u0011\u000e\u0016\u0017\u0004,p\u0011C,\u0010", (short) (Od.Xd() ^ (-24268)))).getMethod(EO.Od("z#`P\u0017dH\u0015N\f\u00194ebS!Me}-h", (short) (C1499aX.Xd() ^ (-5960))), new Class[0]);
                try {
                    method.setAccessible(true);
                    sSideChannelManager = new SideChannelManager((Context) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            sSideChannelManager.queueTask(task);
        }
    }

    private static class SideChannelManager implements Handler.Callback, ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap = new HashMap();
        private Set<String> mCachedEnabledPackages = new HashSet();

        SideChannelManager(Context context) {
            this.mContext = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper(), this);
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            int i2 = message.what;
            if (i2 == 0) {
                handleQueueTask((Task) message.obj);
                return true;
            }
            if (i2 == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                return true;
            }
            if (i2 == 2) {
                handleServiceDisconnected((ComponentName) message.obj);
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            handleRetryListenerQueue((ComponentName) message.obj);
            return true;
        }

        private void handleQueueTask(Task task) throws Throwable {
            updateListenerMap();
            for (ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = INotificationSideChannel.Stub.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(ComponentName componentName) throws Throwable {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                String str = "Connected to service " + componentName;
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                String str = "Disconnected from service " + componentName;
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        private void updateListenerMap() throws Throwable {
            String strKd;
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                return;
            }
            this.mCachedEnabledPackages = enabledListenerPackages;
            Context context = this.mContext;
            Class<?> cls = Class.forName(C1626yg.Ud("N\f=a;\u0006vkVFN+MJj\u0006j\u0005Z)W@p", (short) (ZN.Xd() ^ 30533), (short) (ZN.Xd() ^ 7886)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 20935);
            int[] iArr = new int["~.-k\u0003_\u0006\u0012ddP\u0005?:Vo4".length()];
            QB qb = new QB("~.-k\u0003_\u0006\u0012ddP\u0005?:Vo4");
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
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Intent intent = new Intent();
                short sXd2 = (short) (ZN.Xd() ^ 7783);
                int[] iArr2 = new int["0l\u0007:i\u0019e1\u001a]Pt#*:\u001bd\u0004#\u000fl:\u000f\u001aa@(vDL\u0013\u007f`Zl+\u0001[rjiM\u0001!\u001c5".length()];
                QB qb2 = new QB("0l\u0007:i\u0019e1\u001a]Pt#*:\u001bd\u0004#\u000fl:\u000f\u001aa@(vDL\u0013\u007f`Zl+\u0001[rjiM\u0001!\u001c5");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
                    i3++;
                }
                Intent action = intent.setAction(new String(iArr2, 0, i3));
                Class<?> cls2 = Class.forName(C1561oA.Qd("\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rE\u0007\u0003Bcst{purYlxjolx", (short) (Od.Xd() ^ (-32651))));
                Class<?>[] clsArr2 = {Class.forName(C1593ug.zd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^z!(\u001a$+", (short) (Od.Xd() ^ (-23848)), (short) (Od.Xd() ^ (-27827)))), Integer.TYPE};
                Object[] objArr2 = {action, 0};
                short sXd3 = (short) (C1580rY.Xd() ^ (-12365));
                int[] iArr3 = new int[";>-9?\u000e27'/4\u0012#/2$\u001d\u001e+".length()];
                QB qb3 = new QB(";>-9?\u000e27'/4\u0012#/2$\u001d\u001e+");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    List list = (List) method2.invoke(packageManager, objArr2);
                    HashSet<ComponentName> hashSet = new HashSet();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        strKd = C1561oA.Kd("7Y_US;P^4a`dVj", (short) (FB.Xd() ^ 25774));
                        if (!zHasNext) {
                            break;
                        }
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                String str = Wg.Zd("\u0013rIl\u0012\u0005Pn\u001e\u0007\u0001|'cZ\u0016*x\u000e&.*W,S\u007fI2Q\u0004Rg", (short) (C1499aX.Xd() ^ (-20703)), (short) (C1499aX.Xd() ^ (-5304))) + componentName + C1561oA.Xd("\"\u0017fhn\u001b]abhnh\"omxzlvn|+~rq~\u0003u@", (short) (OY.Xd() ^ 12823));
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.mRecordMap.containsKey(componentName2)) {
                            if (Log.isLoggable(strKd, 3)) {
                                String str2 = Wg.vd("Rtsw{s+v\u0003\f\f{\u0004y\u00062sebmo`\u001b`xz'", (short) (ZN.Xd() ^ 19576)) + componentName2;
                            }
                            this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, ListenerRecord>> it2 = this.mRecordMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<ComponentName, ListenerRecord> next = it2.next();
                        if (!hashSet.contains(next.getKey())) {
                            if (Log.isLoggable(strKd, 3)) {
                                String str3 = Qg.kd("\u0018*128*.&])%..\u001e&\u001c(T&\u0018\u0015 \"\u0013M\u0013\u001b\u001dI", (short) (Od.Xd() ^ (-3155)), (short) (Od.Xd() ^ (-14336))) + next.getKey();
                            }
                            ensureServiceUnbound(next.getValue());
                            it2.remove();
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        private boolean ensureServiceBound(ListenerRecord listenerRecord) throws Throwable {
            if (listenerRecord.bound) {
                return true;
            }
            Intent component = new Intent(C1561oA.od("FRGTPIC\fPQKJHJK\u0004\u0017\u001d!\u00160\u001e\u001e\"\u0016\u0012\u0014\r\n\u001c\u0010\u0015\u0013#\u0016\u000b\u0005\u0005\u001e\u0001\u0005|\t\b}\u0004", (short) (C1607wl.Xd() ^ 9009))).setComponent(listenerRecord.componentName);
            Context context = this.mContext;
            Object[] objArr = {component, this, 33};
            Method method = Class.forName(C1561oA.Kd("kyp\u007f}xt?u\u0003\u0003\n{\u0006\rG]\u000b\u000b\u0012\u0004\u0018\u0015", (short) (C1580rY.Xd() ^ (-30242)))).getMethod(Wg.vd("AGOD.?OR@9>", (short) (C1499aX.Xd() ^ (-10258))), Class.forName(Wg.Zd("\u007fdn\f%p\u007fX*G\u001b1=V2{2g\u0003Jf|", (short) (ZN.Xd() ^ 8046), (short) (ZN.Xd() ^ 20361))), Class.forName(C1561oA.Xd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\u0012%38,'*\t667/.@6==", (short) (Od.Xd() ^ (-12384)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                listenerRecord.bound = ((Boolean) method.invoke(context, objArr)).booleanValue();
                if (listenerRecord.bound) {
                    listenerRecord.retryCount = 0;
                } else {
                    String str = Qg.kd("Rj\\\\e]\u0017jd\u0014U[_T\u000fb\\\fWS\\\\LTJV\u0003", (short) (ZN.Xd() ^ 4518), (short) (ZN.Xd() ^ 5293)) + listenerRecord.componentName;
                    hg.Vd("8X\\PL2EQ%PMO?Q", (short) (OY.Xd() ^ 31325), (short) (OY.Xd() ^ 30101));
                    Context context2 = this.mContext;
                    Object[] objArr2 = {this};
                    Method method2 = Class.forName(C1561oA.ud("?K@MIB<\u00059DBG7?D|\u0011<:?/A<", (short) (C1580rY.Xd() ^ (-14150)))).getMethod(C1561oA.Yd("NH=EKB2ESXLGJ", (short) (C1580rY.Xd() ^ (-14599))), Class.forName(C1561oA.yd("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rx\f\u001a\u001f\u0013\u000e\u0011o\u001d\u001d\u001e\u0016\u0015'\u001d$c", (short) (C1580rY.Xd() ^ (-19967)))));
                    try {
                        method2.setAccessible(true);
                        method2.invoke(context2, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return listenerRecord.bound;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) throws Throwable {
            if (listenerRecord.bound) {
                Context context = this.mContext;
                short sXd = (short) (FB.Xd() ^ 19440);
                short sXd2 = (short) (FB.Xd() ^ 28579);
                int[] iArr = new int["]kbqojf1gtt{mw~9O||\u0004u\n\u0007".length()];
                QB qb = new QB("]kbqojf1gtt{mw~9O||\u0004u\n\u0007");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = {Class.forName(Jg.Wd("?*S\u0005=jheR\u00024\u001e*d\u000evWl-t\u00030\u0012\u0003j+>Xq6j\u0004>", (short) (ZN.Xd() ^ 1563), (short) (ZN.Xd() ^ 17453)))};
                Object[] objArr = {this};
                short sXd3 = (short) (FB.Xd() ^ 21213);
                short sXd4 = (short) (FB.Xd() ^ 8026);
                int[] iArr2 = new int["`MI= +KEZ'S\u000e+".length()];
                QB qb2 = new QB("`MI= +KEZ'S\u000e+");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    listenerRecord.bound = false;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            listenerRecord.service = null;
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            if (this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                return;
            }
            listenerRecord.retryCount++;
            if (listenerRecord.retryCount > 6) {
                String str = "Giving up on delivering " + listenerRecord.taskQueue.size() + " tasks to " + listenerRecord.componentName + " after " + listenerRecord.retryCount + " retries";
                listenerRecord.taskQueue.clear();
                return;
            }
            int i2 = (1 << (listenerRecord.retryCount - 1)) * 1000;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                String str2 = "Scheduling retry for " + i2 + " ms";
            }
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), i2);
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                String str = "Processing component " + listenerRecord.componentName + ", " + listenerRecord.taskQueue.size() + " queued tasks";
            }
            if (listenerRecord.taskQueue.isEmpty()) {
                return;
            }
            if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                scheduleListenerRetry(listenerRecord);
                return;
            }
            while (true) {
                Task taskPeek = listenerRecord.taskQueue.peek();
                if (taskPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        String str2 = "Sending task " + taskPeek;
                    }
                    taskPeek.send(listenerRecord.service);
                    listenerRecord.taskQueue.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        String str3 = "Remote service has died: " + listenerRecord.componentName;
                    }
                } catch (RemoteException e2) {
                    String str4 = "RemoteException communicating with " + listenerRecord.componentName;
                }
            }
            if (listenerRecord.taskQueue.isEmpty()) {
                return;
            }
            scheduleListenerRetry(listenerRecord);
        }

        private static class ListenerRecord {
            final ComponentName componentName;
            INotificationSideChannel service;
            boolean bound = false;
            ArrayDeque<Task> taskQueue = new ArrayDeque<>();
            int retryCount = 0;

            ListenerRecord(ComponentName componentName) {
                this.componentName = componentName;
            }
        }
    }

    private static class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    private static class NotifyTask implements Task {
        final int id;
        final Notification notif;
        final String packageName;
        final String tag;

        NotifyTask(String str, int i2, String str2, Notification notification) {
            this.packageName = str;
            this.id = i2;
            this.tag = str2;
            this.notif = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.packageName);
            sb.append(", id:").append(this.id);
            sb.append(", tag:").append(this.tag);
            sb.append("]");
            return sb.toString();
        }
    }

    private static class CancelTask implements Task {
        final boolean all;
        final int id;
        final String packageName;
        final String tag;

        CancelTask(String str) {
            this.packageName = str;
            this.id = 0;
            this.tag = null;
            this.all = true;
        }

        CancelTask(String str, int i2, String str2) {
            this.packageName = str;
            this.id = i2;
            this.tag = str2;
            this.all = false;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
            } else {
                iNotificationSideChannel.cancel(this.packageName, this.id, this.tag);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[packageName:");
            sb.append(this.packageName);
            sb.append(", id:").append(this.id);
            sb.append(", tag:").append(this.tag);
            sb.append(", all:").append(this.all);
            sb.append("]");
            return sb.toString();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static List<StatusBarNotification> getActiveNotifications(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications == null) {
                return new ArrayList();
            }
            return Arrays.asList(activeNotifications);
        }

        static int getCurrentInterruptionFilter(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean areNotificationsEnabled(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int getImportance(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void createNotificationChannel(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static void createNotificationChannels(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static List<NotificationChannel> getNotificationChannels(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }

        static void createNotificationChannelGroup(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void createNotificationChannelGroups(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static List<NotificationChannelGroup> getNotificationChannelGroups(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static void deleteNotificationChannel(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void deleteNotificationChannelGroup(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String getId(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static NotificationChannelGroup getNotificationChannelGroup(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static String getParentChannelId(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static boolean canUseFullScreenIntent(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }
}
