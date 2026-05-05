package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
class SyncTask implements Runnable {
    private final FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;
    ExecutorService processorExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(C1561oA.od("vx\u0001rnl}n5poi1hzfctrln", (short) (FB.Xd() ^ 19712))));
    private final PowerManager.WakeLock syncWakeLock;

    static class ConnectivityChangeReceiver extends BroadcastReceiver {
        private SyncTask task;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                if (SyncTask.isDebugLogEnabled()) {
                    hg.Vd("f\t\u0011\u0003~|\u000e~e|\n\tuz{\u007fw", (short) (ZN.Xd() ^ 6013), (short) (ZN.Xd() ^ 21846));
                    C1561oA.ud("4_]\\RO_S_Q[_\u0005GKCOGDB\u000b{.N:JK?C;r423:5?;@8-g:?3'p", (short) (ZN.Xd() ^ 29087));
                }
                this.task.firebaseMessaging.enqueueTaskWithDelaySeconds(this.task, 0L);
                Context context2 = this.task.getContext();
                Object[] objArr = {this};
                Method method = Class.forName(C1561oA.yd("7E8GA<4~1>:A/9<v)VRYG[T", (short) (C1633zX.Xd() ^ (-1851)))).getMethod(Xg.qd("4.3'*-8:,:\u001b/.16D4B", (short) (FB.Xd() ^ 18957), (short) (FB.Xd() ^ 20729)), Class.forName(C1561oA.Yd("hvm|zuq<r\u007f\u007f\u0007x\u0003\nDY\u000b\t{\u007f\u007f~\u0012\u0014r\u0007\u0006\t\u000e\u001c\f\u001a", (short) (C1607wl.Xd() ^ 22033))));
                try {
                    method.setAccessible(true);
                    method.invoke(context2, objArr);
                    this.task = null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        public void registerReceiver() throws Throwable {
            if (SyncTask.isDebugLogEnabled()) {
                short sXd = (short) (C1607wl.Xd() ^ 18294);
                short sXd2 = (short) (C1607wl.Xd() ^ 30827);
                int[] iArr = new int["\u001d\u0006JXGa.6\u0010D\f'\t\u0014p2\u001f".length()];
                QB qb = new QB("\u001d\u0006JXGa.6\u0010D\f'\t\u0014p2\u001f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                new String(iArr, 0, i2);
                ZO.xd("\u001d[nfYKBD6u(gY\u000bw\u0017jhE>0PB`E*?LMQ:;\u0007MD\u0012-\"&", (short) (ZN.Xd() ^ 9554), (short) (ZN.Xd() ^ 18560));
            }
            IntentFilter intentFilter = new IntentFilter(C1626yg.Ud("\u001fy:\u0014ea\u0005;&J8:\\Wd8\u001a\u000b9BR\u0003}\u001b\u0001 2\u007f5$@\u0016Q\u00190H", (short) (C1580rY.Xd() ^ (-25003)), (short) (C1580rY.Xd() ^ (-14619))));
            Context context = this.task.getContext();
            Object[] objArr = {this, intentFilter};
            Method method = Class.forName(Ig.wd("\tfl\u001d\b$\r=#]`\u0007,%A\u0017n~Dt&\u007f$", (short) (C1633zX.Xd() ^ (-14133)))).getMethod(C1593ug.zd("\u000e\u0002\u0005\b\u0013\u0015\u0007\u0015u\n\t\f\u0011\u001f\u000f\u001d", (short) (C1607wl.Xd() ^ 22635), (short) (C1607wl.Xd() ^ 20047)), Class.forName(EO.Od("S\tpg;\u0002\t\u000bj{x\\{~\u001d5}Hmw5p|\u0013.(](Dz$1f", (short) (C1633zX.Xd() ^ (-29906)))), Class.forName(C1561oA.Qd("O[P]YRL\u0015ITRWGOT\r'KP@HM\u001e@BI9E", (short) (FB.Xd() ^ 10438))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public SyncTask(FirebaseMessaging firebaseMessaging, long j2) throws Throwable {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j2;
        Context context = getContext();
        String strKd = C1561oA.Kd("\u0018\u0018!\u0010\u001e", (short) (C1607wl.Xd() ^ 18884));
        short sXd = (short) (ZN.Xd() ^ 24845);
        short sXd2 = (short) (ZN.Xd() ^ 2611);
        int[] iArr = new int["#X{8b\u0002)$\u00039a\u00196d\u0018\u007fB\u0014?v\u0012Ns".length()];
        QB qb = new QB("#X{8b\u0002)$\u00039a\u00196d\u0018\u007fB\u0014?v\u0012Ns");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (C1580rY.Xd() ^ (-17711));
        int[] iArr2 = new int[">6L8\u0006E;IC\u000b1SRJPJ".length()];
        QB qb2 = new QB(">6L8\u0006E;IC\u000b1SRJPJ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {strKd};
        Method method = cls.getMethod(Wg.vd("21A!@;=/@':HE947", (short) (ZN.Xd() ^ 13291)), clsArr);
        try {
            method.setAccessible(true);
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) method.invoke(context, objArr)).newWakeLock(1, Qg.kd("acb\\$inbV", (short) (OY.Xd() ^ 15243), (short) (OY.Xd() ^ 838)));
            this.syncWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    boolean isDeviceConnected() throws Throwable {
        Context context = getContext();
        Object[] objArr = {hg.Vd("\u0012\u001d\u001b\u001a\u0010\r\u001d\u0011\u001d\u000f\u0019\u001d", (short) (C1633zX.Xd() ^ (-17213)), (short) (C1633zX.Xd() ^ (-6602)))};
        Method method = Class.forName(C1561oA.ud("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004", (short) (OY.Xd() ^ 29070))).getMethod(C1561oA.Yd("_^nNuprdmTguznil", (short) (C1607wl.Xd() ^ 1278)), Class.forName(C1561oA.yd("pfzd8uiuu;_\u007f\u0005z~v", (short) (C1633zX.Xd() ^ (-32104)))));
        try {
            method.setAccessible(true);
            ConnectivityManager connectivityManager = (ConnectivityManager) method.invoke(context, objArr);
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    boolean maybeRefreshToken() throws IOException {
        try {
            if (this.firebaseMessaging.blockingGetToken() == null) {
                return false;
            }
            return Log.isLoggable(Constants.TAG, 3) ? true : true;
        } catch (IOException e2) {
            if (GmsRpc.isErrorMessageForRetryableError(e2.getMessage())) {
                String str = "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval";
                return false;
            }
            if (e2.getMessage() == null) {
                return false;
            }
            throw e2;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            try {
                this.firebaseMessaging.setSyncScheduledOrRunning(true);
            } catch (IOException e2) {
                String str = "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.";
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    return;
                }
            }
            if (!this.firebaseMessaging.isGmsCorePresent()) {
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
                if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    this.syncWakeLock.release();
                    return;
                }
                return;
            }
            if (ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) && !isDeviceConnected()) {
                new ConnectivityChangeReceiver(this).registerReceiver();
                if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    this.syncWakeLock.release();
                    return;
                }
                return;
            }
            if (maybeRefreshToken()) {
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
            } else {
                this.firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
            }
            if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                return;
            }
            this.syncWakeLock.release();
        } catch (Throwable th) {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
            throw th;
        }
    }
}
