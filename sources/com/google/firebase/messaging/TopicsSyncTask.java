package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
class TopicsSyncTask implements Runnable {
    private static final Object TOPIC_SYNC_TASK_LOCK = new Object();
    private static Boolean hasAccessNetworkStatePermission = null;
    private static Boolean hasWakeLockPermission = null;
    private final Context context;
    private final Metadata metadata;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;
    private final TopicsSubscriber topicsSubscriber;

    class ConnectivityChangeReceiver extends BroadcastReceiver {
        private TopicsSyncTask task;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            TopicsSyncTask topicsSyncTask = this.task;
            if (topicsSyncTask == null) {
                return;
            }
            if (topicsSyncTask.isDeviceConnected()) {
                if (TopicsSyncTask.isLoggable()) {
                    short sXd = (short) (OY.Xd() ^ 26446);
                    int[] iArr = new int["M6\u001dp\u0016O}(<QI#augG\u001b".length()];
                    QB qb = new QB("M6\u001dp\u0016O}(<QI#augG\u001b");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                        i2++;
                    }
                    new String(iArr, 0, i2);
                    EO.Od("\b\u0007G0f9^sC\u000b\fvk1\u0016uW:pw\u0004\"+P0\u0015y#\nUa\u000biV\u000fQv\u0010\u0013}oSmuM6D", (short) (C1499aX.Xd() ^ (-22989)));
                }
                this.task.topicsSubscriber.scheduleSyncTaskWithDelaySeconds(this.task, 0L);
                Object[] objArr = {this};
                Method method = Class.forName(C1561oA.Qd("AMBOKD>\u0007;FDI9AF~\u0013><A1C>", (short) (C1499aX.Xd() ^ (-26758)))).getMethod(C1561oA.od("WORDEFOO?K*<9:=I7C", (short) (C1580rY.Xd() ^ (-12766))), Class.forName(C1593ug.zd("\\japnie0fsszlv}8M~|ossr\u0006\bfzy|\u0002\u0010\u007f\u000e", (short) (C1633zX.Xd() ^ (-20735)), (short) (C1633zX.Xd() ^ (-5463)))));
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    this.task = null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        public void registerReceiver() throws Throwable {
            if (TopicsSyncTask.isLoggable()) {
                C1561oA.Kd("a\u0006\u0010\u0004\u0002\u0002\u0015\bp\n\u0019\u001a\t\u0010\u0013\u0019\u0013", (short) (C1580rY.Xd() ^ (-28103)));
                short sXd = (short) (OY.Xd() ^ 14722);
                short sXd2 = (short) (OY.Xd() ^ 28189);
                int[] iArr = new int["u q*KPeA\u001b\u0004\u0002?2\u001e&%^N`\u0012\u000fJ\u000bs\u0002M)&dg\u0015g\fT\"S\u0005\u0007\u007f".length()];
                QB qb = new QB("u q*KPeA\u001b\u0004\u0002?2\u001e&%^N`\u0012\u000fJ\u000bs\u0002M)&dg\u0015g\fT\"S\u0005\u0007\u007f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                new String(iArr, 0, i2);
            }
            Context context = TopicsSyncTask.this.context;
            IntentFilter intentFilter = new IntentFilter(C1561oA.Xd("IWN][VR\u001d^Vf!Wdde&<IIJBASIWKW]dIOIWQP", (short) (C1499aX.Xd() ^ (-9038))));
            Class<?> cls = Class.forName(Wg.vd("1=6CC<:\u0003;FHMAIR\u000b#NPUI[Z", (short) (C1499aX.Xd() ^ (-28174))));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (C1633zX.Xd() ^ (-25459));
            short sXd4 = (short) (C1633zX.Xd() ^ (-27528));
            int[] iArr2 = new int["_k`mib\\%YdbgW_d\u001d0_[LNLIZZ7IFGJVDP".length()];
            QB qb2 = new QB("_k`mib\\%YdbgW_d\u001d0_[LNLIZZ7IFGJVDP");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Class.forName(hg.Vd("lxmzvoi2fqotdlq*Dhm]ej;]_fVb", (short) (C1633zX.Xd() ^ (-23598)), (short) (C1633zX.Xd() ^ (-9072))));
            Object[] objArr = {this, intentFilter};
            Method method = cls.getMethod(C1561oA.ud("?123<<,8\u0017)&'*6$0", (short) (FB.Xd() ^ 5773)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j2) throws Throwable {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j2;
        this.metadata = metadata;
        Object[] objArr = {C1561oA.yd("bbgV`", (short) (C1499aX.Xd() ^ (-2566)))};
        Method method = Class.forName(C1561oA.Yd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74", (short) (ZN.Xd() ^ 24198))).getMethod(Jg.Wd(" Iv\u007fDj\u000e\u001dOQ\u0012Ac\u0003\u0017G", (short) (FB.Xd() ^ 29262), (short) (FB.Xd() ^ 20819)), Class.forName(Xg.qd("!\u0019/\u001bh(\u001e,&m\u001465-3-", (short) (FB.Xd() ^ 19700), (short) (FB.Xd() ^ 10362))));
        try {
            method.setAccessible(true);
            this.syncWakeLock = ((PowerManager) method.invoke(context, objArr)).newWakeLock(1, ZO.xd("5s\u0014\u001d#Saud6[eQU\u0018pT\u000ek\"\u0005_?#hB\u0010\" \b\u001e,g)", (short) (C1607wl.Xd() ^ 11621), (short) (C1607wl.Xd() ^ 5825)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String createPermissionMissingLog(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean hasAccessNetworkStatePermission(Context context) {
        boolean zBooleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            Boolean bool = hasAccessNetworkStatePermission;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            hasAccessNetworkStatePermission = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean hasPermission(Context context, String str, Boolean bool) throws Throwable {
        if (bool != null) {
            return bool.booleanValue();
        }
        Object[] objArr = {str};
        Method method = Class.forName(C1626yg.Ud("\u0019/q^\b\u0019o\u0002^wHqI\u0012w(6\u0016 CSK!", (short) (C1499aX.Xd() ^ (-4906)), (short) (C1499aX.Xd() ^ (-17937)))).getMethod(EO.Od("D\u0018%<F[OT\u0004\u001e\u001f<O\u0003}3W9}\\(iAI\u0018\frF", (short) (C1607wl.Xd() ^ 18626)), Class.forName(Ig.wd("W \u0005V\u0002r\u0002E~\b1.\u0001wb8", (short) (ZN.Xd() ^ 7384))));
        try {
            method.setAccessible(true);
            boolean z2 = ((Integer) method.invoke(context, objArr)).intValue() == 0;
            if (!z2 && Log.isLoggable(C1561oA.Qd("m\u0010\u0018\n\u0006\u0004\u0015\u0006l\u0004\u0011\u0010|\u0002\u0003\u0007~", (short) (ZN.Xd() ^ 9906)), 3)) {
                createPermissionMissingLog(str);
            }
            return z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean hasWakeLockPermission(Context context) {
        boolean zBooleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            Boolean bool = hasWakeLockPermission;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            hasWakeLockPermission = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isDeviceConnected() {
        NetworkInfo activeNetworkInfo;
        Context context = this.context;
        String strZd = C1593ug.zd(",99:21C9G;GM", (short) (C1499aX.Xd() ^ (-12425)), (short) (C1499aX.Xd() ^ (-8932)));
        short sXd = (short) (C1499aX.Xd() ^ (-23277));
        int[] iArr = new int["iujwslf/cnlqain';fdiYkf".length()];
        QB qb = new QB("iujwslf/cnlqain';fdiYkf");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strZd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("\u001ff#3\u00137e\u0004IY\u0015S\u0015.U\t", (short) (Od.Xd() ^ (-3412)), (short) (Od.Xd() ^ (-19497))), Class.forName(C1561oA.Kd("tl\u0003n<{q\u007fyAg\n\t\u0001\u0007\u0001", (short) (ZN.Xd() ^ 16756))));
        try {
            method.setAccessible(true);
            ConnectivityManager connectivityManager = (ConnectivityManager) method.invoke(context, objArr);
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLoggable() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (hasWakeLockPermission(this.context)) {
            this.syncWakeLock.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                } catch (RuntimeException unused) {
                    return;
                }
            } catch (IOException e2) {
                String str = "Failed to sync topics. Won't retry sync. " + e2.getMessage();
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
                if (!hasWakeLockPermission(this.context)) {
                    return;
                } else {
                    wakeLock = this.syncWakeLock;
                }
            }
            if (!this.metadata.isGmscorePresent()) {
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
                if (hasWakeLockPermission(this.context)) {
                    try {
                        this.syncWakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                }
                return;
            }
            if (hasAccessNetworkStatePermission(this.context) && !isDeviceConnected()) {
                new ConnectivityChangeReceiver(this).registerReceiver();
                if (hasWakeLockPermission(this.context)) {
                    try {
                        this.syncWakeLock.release();
                        return;
                    } catch (RuntimeException unused3) {
                        return;
                    }
                }
                return;
            }
            if (this.topicsSubscriber.syncTopics()) {
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
            } else {
                this.topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
            }
            if (hasWakeLockPermission(this.context)) {
                wakeLock = this.syncWakeLock;
                wakeLock.release();
            }
        } catch (Throwable th) {
            if (hasWakeLockPermission(this.context)) {
                try {
                    this.syncWakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
