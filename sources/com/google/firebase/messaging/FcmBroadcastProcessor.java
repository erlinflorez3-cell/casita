package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static WithinAppServiceConnection fcmServiceConn = null;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0();
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }

    private static Task<Integer> bindToMessagingService(Context context, Intent intent, boolean z2) {
        if (Log.isLoggable(Constants.TAG, 3)) {
        }
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z2) {
            return serviceConnection.sendIntent(intent).continueWith(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), new Continuation() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
                }
            });
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new WithinAppServiceConnection(context, str);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }

    static /* synthetic */ Integer lambda$bindToMessagingService$3(Task task) throws Exception {
        return -1;
    }

    static /* synthetic */ Integer lambda$startMessagingService$1(Task task) throws Exception {
        return 403;
    }

    static /* synthetic */ Task lambda$startMessagingService$2(Context context, Intent intent, boolean z2, Task task) throws Exception {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? bindToMessagingService(context, intent, z2).continueWith(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), new Continuation() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task2);
            }
        }) : task;
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    public Task<Integer> process(Intent intent) {
        String strVd = hg.Vd("^Yb\"eSh4PbN\"\u001f", (short) (ZN.Xd() ^ 5108), (short) (ZN.Xd() ^ 23341));
        String stringExtra = intent.getStringExtra(strVd);
        if (stringExtra != null) {
            Object[] objArr = {stringExtra, 0};
            Method declaredMethod = Class.forName(C1561oA.ud("2>3@<5/w><02r\u0006$5&ur", (short) (C1607wl.Xd() ^ 15627))).getDeclaredMethod(C1561oA.Yd("cedqgi", (short) (C1580rY.Xd() ^ (-25818))), Class.forName(C1561oA.yd("lbzd,iama'Ooh^f^", (short) (Od.Xd() ^ (-29160)))), Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                intent.putExtra(Xg.qd("WG^,J^L", (short) (C1499aX.Xd() ^ (-2322)), (short) (C1499aX.Xd() ^ (-22149))), (byte[]) declaredMethod.invoke(null, objArr));
                intent.removeExtra(strVd);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return startMessagingService(this.context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.tasks.Task<java.lang.Integer> startMessagingService(final android.content.Context r10, final android.content.Intent r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FcmBroadcastProcessor.startMessagingService(android.content.Context, android.content.Intent):com.google.android.gms.tasks.Task");
    }
}
